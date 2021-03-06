/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.kidclinic.reviews;

import java.util.Map;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Juergen Hoeller
 * @author Mark Fisher
 * @author Ken Krebs
 * @author Arjen Poutsma
 */
@Controller
class ReviewsController {

    private static final String VIEWS_REVIEWS_CREATE_OR_UPDATE_FORM = "reviews/createOrUpdateReviewsForm";

	private final ReviewsRepository reviews;

    @Autowired
    public ReviewsController(ReviewsRepository reviewsService) {
        this.reviews = reviewsService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @RequestMapping(value = "/reviews/new", method = RequestMethod.GET)
    public String initCreationForm(Map<String, Object> model) {
        ReviewsHelper reviews = new ReviewsHelper();
        model.put("reviews", reviews);
        return VIEWS_REVIEWS_CREATE_OR_UPDATE_FORM;
    }

    @RequestMapping(value = "/reviews/new", method = RequestMethod.POST)
    public String processCreationForm(@Valid ReviewsHelper reviewsStore, BindingResult result) {
        if (result.hasErrors()) {
            return VIEWS_REVIEWS_CREATE_OR_UPDATE_FORM;
        } else {
            this.reviews.save(reviewsStore);
            return "reviews/reviewsList";
        }
    }

    @RequestMapping(value = { "/reviews" })
    public String showReviews(Map<String, Object> model) {
        // Here we are returning an object of type 'Doctors' rather than a collection of Doctor
        // objects so it is simpler for Object-Xml mapping
        ReviewsHelper reviews = new ReviewsHelper();
        reviews.getReviewsList().addAll(this.reviews.findAll());
        model.put("reviews", reviews);
        return "reviews/reviewsList";
    }

}
