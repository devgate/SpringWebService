package com.drjun.board.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 6. 27.
 * Time: 오후 4:32
 * To change this template use File | Settings | File Templates.
 */
@Component
public class LoginCheckInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object loginUser = request.getSession().getAttribute("loginUser");

        if (loginUser != null) {
            System.out.println("LoginCheckInterceptor.preHandle : loginUser Not Null");
            return true;
        } else {
            System.out.println("LoginCheckInterceptor.preHandle : loginUser Null");
            response.sendRedirect("/account/login");
            return false;
        }
    }
}
