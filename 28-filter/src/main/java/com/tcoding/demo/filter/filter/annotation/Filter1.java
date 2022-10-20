package com.tcoding.demo.filter.filter.annotation;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
@WebFilter(urlPatterns = {"/ann", "/all"}, filterName = "ann-filter1")
@Order(1)
public class Filter1 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
        throws IOException, ServletException {
        System.out.println("ann-filter1");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

