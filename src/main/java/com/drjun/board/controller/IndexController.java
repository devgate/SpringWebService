package com.drjun.board.controller;

import com.drjun.board.model.Board;
import com.drjun.board.service.BoardService;
import org.intellij.lang.annotations.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * User: dr.jun
 */
@Controller
@RequestMapping("/board")
public class IndexController {

    @Autowired
    BoardService boardService;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public ModelAndView getCommentsList(ModelAndView modelAndView) {

        modelAndView.setViewName("/boardList");
        modelAndView.addObject("board", new Board());
        modelAndView.addObject("boardList", boardService.getBoardList());

        return modelAndView;
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public String add(@Valid Board board, BindingResult bindingResult) {

        @Language("RegExp") String str = "[0-9]";

        if(bindingResult.hasErrors()){
            System.out.println("=============  Error ================");
            return "redirect:/board/list";
        }

        boardService.addComments(board);

        return "redirect:/board/list";
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public String del(ModelAndView modelAndView,@RequestParam Integer id){

        boardService.deleleComments(id);

        return "redirect:/board/list";
    }


}
