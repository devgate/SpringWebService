package com.drjun.board.controller;

import com.drjun.board.model.Board;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @Author: dr.jun@sk.com
 */
public class BoardValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Board.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Board board = (Board) target;

        if(board.getTitle() == null || StringUtils.isEmpty(board.getTitle())){
            errors.rejectValue("title", "required");
        }
    }
}
