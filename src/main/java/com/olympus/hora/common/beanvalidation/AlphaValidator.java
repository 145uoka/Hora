/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olympus.hora.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.olympus.hora.common.util.ValidateUtil;

/**
 * 半角英字チェック
 * @author kitabayashi_y
 */
public class AlphaValidator implements ConstraintValidator<Alpha, CharSequence> {

	@Override
	public void initialize(Alpha annotation) {
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}

		return ValidateUtil.isAlphabet(charSequence);
	}
}
