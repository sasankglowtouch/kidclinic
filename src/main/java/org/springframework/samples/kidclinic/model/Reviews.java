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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.core.style.ToStringCreator;
import org.springframework.samples.kidclinic.model.Person;

/**
 * Simple JavaBean domain object representing an parent.
 *
 * @author Ken Krebs
 * @author Juergen Hoeller
 * @author Sam Brannen
 * @author Michael Isvy
 */
@Entity
@Table(name = "reviews")
public class Reviews {
	
    @Column(name = "id")
    @NotEmpty
    private String id;
	
    @Column(name = "title")
    @NotEmpty
    private String title;

    @Column(name = "doctor_first")
    @NotEmpty
    private String doctorFirst;
    
    @Column(name = "doctor_last")
    @NotEmpty
    private String doctorLast;
    
    @Column(name = "reviewer_first")
    @NotEmpty
    private String reviewerFirst;
    
    @Column(name = "reviewer_last")
    @NotEmpty
    private String reviewerLast;
    
    @Column(name = "content")
    @NotEmpty
    private String content;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "review")
    /*

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getDoctorFirst() {
        return this.doctorFirst;
    }
    public void setDoctorFirst(String doctorFirst) {
        this.doctorFirst = doctorFirst;
    }
    public String getDoctorLast() {
        return this.doctorLast;
    }
    public void setDoctorLast(String doctorLast) {
        this.doctorLast = doctorLast;
    }
    public String getReviewerFirst(){
    	return this.reviewerFirst;
    }
    public void setReviewerFirst(String reviewerFirst){
    	this.reviewerFirst = reviewerFirst;
    }

    public String getReviewerLast() {
        return this.reviewerLast;
    }

    public void setReviewerLast(String reviewerLast) {
        this.reviewerLast = reviewerLast;
    }
    
      public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent(){
    	return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
 */

    @Override
    public String toString() {
        return new ToStringCreator(this)
            .append("id", this.id)
            .append("doctorFirst", this.doctorFirst)
            .append("doctorLast", this.doctorLast)           
            .append("reviewerFirst", this.reviewerFirst)
            .append("reviewerLast", this.reviewerLast)  
            .append("title", this.title)
            .append("content", this.content)
            .toString();
    }
}
