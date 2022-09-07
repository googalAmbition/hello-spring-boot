package com.tcoding.demo.validator.validator;

import com.tcoding.demo.validator.validator.annotation.In;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author: qiang huang
 * @mail: qiang.huang3@renren-inc.com
 * @date: 2018/5/17 下午4:21
 **/
public class InValidator implements ConstraintValidator<In, Object> {
  private String[] inValues;
  private boolean required;

  @Override
  public void initialize(In constraintAnnotation) {
    inValues = constraintAnnotation.value();
    required = constraintAnnotation.required();
  }

  @Override
  public boolean isValid(Object value, ConstraintValidatorContext context) {
    if (value == null) {
      return !required || inValues.length <= 0;
    }

    for(String inValue: inValues) {
      if (inValue.equals(value.toString().trim())) {
        return true;
      }
    }
    return false;
  }
}
