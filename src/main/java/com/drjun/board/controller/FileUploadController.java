package com.drjun.board.controller;

import com.drjun.board.model.FileUploadDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 10.
 * Time: 오후 12:59
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class FileUploadController {

    @RequestMapping(value = "/fileUpload", method = RequestMethod.GET)
    public ModelAndView getFileUpload( ModelAndView modelAndView,HttpServletRequest request) {

        modelAndView.setViewName("fileUpload");

        return modelAndView;
    }

    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    public ModelAndView fileUpload(ModelAndView modelAndView, FileUploadDTO fileUploadDTO){

        modelAndView.setViewName("fileUploadResult");

        String file1Name = fileUploadDTO.getFile1().getOriginalFilename();
        modelAndView.addObject("file1_info",file1Name);
        modelAndView.addObject("file_name",fileUploadDTO.getFileName());

        return modelAndView;
    }
}
