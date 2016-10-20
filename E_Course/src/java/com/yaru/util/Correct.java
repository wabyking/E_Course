/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.util;

import javax.persistence.Entity;

/**
 *
 * @author Administrator
 */
@Entity
public class Correct {
    int id;
    int submitwork_id;
    String teachername;
    float grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubmitwork_id() {
        return submitwork_id;
    }

    public void setSubmitwork_id(int submitwork_id) {
        this.submitwork_id = submitwork_id;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
    
    
}
