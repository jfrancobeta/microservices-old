package com.jfranco.springboot.zuul.springboot_servicio_zuul.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PostTiempoTrancurridoFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(PostTiempoTrancurridoFilter.class);

    @Override
    public Object run() throws ZuulException {
        
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();


        log.info("entrando a post");
        Long timeInicio = (Long) request.getAttribute("tiempoInicio");

        Long tiempoFinal = System.currentTimeMillis();

        Long tiempoTranscurrido = tiempoFinal - timeInicio;
        
        log.info(String.format("Tiempo Transcurrido en segundos %s s", tiempoTranscurrido.doubleValue()/1000.00));

        log.info(String.format("Tiempo Transcurrido en mili %s ms", tiempoTranscurrido.doubleValue()));

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
        return "post";
    }
    
}
