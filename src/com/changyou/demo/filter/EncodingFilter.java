package com.changyou.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.log4j.Log4j;


/**
 * @author xubenling
 * @date 2014年4月3日 上午11:28:22
 */
@Log4j
public class EncodingFilter implements Filter {
	
	private FilterConfig config = null;

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {
		if (log.isDebugEnabled()) {
			log.debug("EncodingFilter destroyed...");
		}
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		req = (HttpServletRequest) req;
		res = (HttpServletResponse) res;
		
		String encoding = config.getInitParameter("encoding");
		req.setCharacterEncoding(encoding);
		res.setCharacterEncoding(encoding);
		
		log.info("Http request & response encoding are configured utf-8.");
		
		chain.doFilter(req, res);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(FilterConfig arg0) throws ServletException {
		this.config = arg0;
		if (log.isDebugEnabled()) {
			log.debug("EncodingFilter initialized...");
		}
	}

}
