package com.drjun.board.controller;

import com.drjun.board.model.Board;
import com.drjun.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 6. 7.
 * Time: 오후 5:43
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/board")
public class IndexController {

    @Autowired
    BoardService boardService;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public ModelAndView getCommentsList(ModelAndView modelAndView) {

        modelAndView.setViewName("/boardList");
        modelAndView.addObject("boardList", boardService.getBoardList());

        return modelAndView;
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public String add(ModelAndView modelAndView, Board board) {

        boardService.addComments(board);

        return "redirect:/board/list";

    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public String del(ModelAndView modelAndView,Integer id){

        boardService.deleleComments(id);

        return "redirect:/board/list";

    }


}
