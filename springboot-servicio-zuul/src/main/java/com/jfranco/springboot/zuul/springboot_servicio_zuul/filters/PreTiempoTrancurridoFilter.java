package com.jfranco.springboot.zuul.springboot_servicio_zuul.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PreTiempoTrancurridoFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(PreTiempoTrancurridoFilter.class);

    @Override
    public Object run() throws ZuulException {
        
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();


        log.info(String.format("%s request enrutado a %s", request.getMethod(), request.getRequestURL().toString()));
        Long timeInicio = System.currentTimeMillis();
        request.setAttribute("tiempoInicio", timeInicio);

        return null;
    }

    @Override
    public boolean shouldFilter() {
       return true;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public String filterType() {
        return "pre";
    }
    
}
