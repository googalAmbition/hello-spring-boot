package com.tcoding.demo.validator.validator.annotation;

import com.tcoding.demo.validator.validator.InValidator;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author: qiang huang
 * @mail: qiang.huang3@renren-inc.com
 * @date: 2018/5/17 下午4:17
 **/
@Documented
@Constraint(validatedBy = {InValidator.class})
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Repeatable(In.List.class)
public @interface In {
  String[] value() default {};

  boolean required() default true;

  String message() default "{javax.validation.constraints.In.message}";

  Class<?>[] groups() default { };

  Class<? extends Payload>[] payload() default { };

  @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
  @Retention(RUNTIME)
  @Documented
  public @interface List {
    In[] value();
  }
}
