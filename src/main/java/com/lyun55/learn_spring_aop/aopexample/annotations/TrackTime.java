package com.lyun55.learn_spring_aop.aopexample.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Methods
@Target(ElementType.METHOD)
//Runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime {

}
