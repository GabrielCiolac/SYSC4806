package com.bmgs.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Question {
    @Id
    @GeneratedValue
    protected Long id;
}
