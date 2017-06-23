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
package org.springframework.samples.kidclinic.review;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Juergen Hoeller
 * @author Ken Krebs
 * @author Arjen Poutsma
 */
@Controller
@RequestMapping("/reviews/{reviewId}")
class ReviewController {
    
    private static final String VIEWS_REVIEWS_CREATE_OR_UPDATE_FORM = "reviews/createOrUpdateReviewForm";
    private final ReviewRepository reviews;
    
    @Autowired
    public ReviewController(ReviewRepository reviews) {
        this.reviews = reviews;
    }
    
    @ModelAttribute("doctor")
    public Collection<ReviewDoctor> populateReviewDoctors() {
        return this.reviews.findReviewDoctors();
    }
    
    @InitBinder("review")
    public void initReviewBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(new ReviewValidator());
    }
    
    @RequestMapping(value = "/reviews/new", method = RequestMethod.GET)
    public String initCreationForm(ModelMap model) {
        Review review = new Review();
//        doctor.addReview(review);
        model.put("review", review);
        return VIEWS_REVIEWS_CREATE_OR_UPDATE_FORM;
    }
 /*
    @RequestMapping(value = "/kids/new", method = RequestMethod.POST)
    public String processCreationForm(Parent parent, @Valid Kid kid, BindingResult result, ModelMap model) {
        if (StringUtils.hasLength(kid.getName()) && kid.isNew() && parent.getKid(kid.getName(), true) != null){
            result.rejectValue("name", "duplicate", "already exists");
        }
        if (result.hasErrors()) {
            model.put("kid", kid);
            return VIEWS_KIDS_CREATE_OR_UPDATE_FORM;
        } else {
            parent.addKid(kid);
            this.kids.save(kid);
            return "redirect:/parents/{parentId}";
        }
    }
 */
    @RequestMapping(value = "/reviews/{reviewId}/edit", method = RequestMethod.GET)
    public String initUpdateForm(@PathVariable("reviewId") int reviewId, ModelMap model) {
        Review review = this.reviews.findById(reviewId);
        model.put("review", review);
        return VIEWS_REVIEWS_CREATE_OR_UPDATE_FORM;
    }
    
    @RequestMapping(value = "/reviews/{reviewsId}/edit", method = RequestMethod.POST)
    public String processUpdateForm(@Valid Review review, BindingResult result, Doctor doctor, ModelMap model) {
        if (result.hasErrors()) {
            review.setDoctor(doctor);
            model.put("review", review);
            return VIEWS_REVIEWS_CREATE_OR_UPDATE_FORM;
        } else {
            doctor.addReview(review);
            this.reviews.save(review);
            return "redirect:/reviews/{reviewId}";
        }
    }
    
}
