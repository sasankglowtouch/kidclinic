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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.persistence.CascadeType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.samples.kidclinic.model.Person;

/**
 * Simple JavaBean domain object representing a veterinarian.
 *
 * @author Ken Krebs
 * @author Juergen Hoeller
 * @author Sam Brannen
 * @author Arjen Poutsma
 */
@Entity
@Table(name = "reviews")
public class Reviews extends Person {

    private List<Reviews> reviews;

    @Column(name = "id")
    @NotEmpty
    private String id;

    @Column(name = "title")
    @NotEmpty
    private String title;

    @Column(name = "content")
    @NotEmpty
    private String content;

    @Column(name = "doctor_first")
    @NotEmpty
    private String doctorFirst;

    @Column(name = "doctor_last")
    @NotEmpty
    private String doctorLast;

    @Column(name = "author_first")
    @NotEmpty
    private String authorFirst;

    @Column(name = "author_last")
    @NotEmpty
    private String authorLast;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reviewID", fetch = FetchType.EAGER)

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getAuthorFirst() {
        return this.authorFirst;
    }

    public void setAuthorFirst(String authorFirst) {
        this.authorFirst = authorFirst;
    }

    public String getAuthorLast() {
        return this.authorLast;
    }

    public void getAuthorFirst(String authorLast) {
        this.authorLast = authorLast;
    }

    @XmlElement
    public List<Reviews> getReviewsList() {
        if (reviews == null) {
            reviews = new ArrayList<>();
        }
        return reviews;
    }

}
