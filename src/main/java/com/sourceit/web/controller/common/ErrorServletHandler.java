package com.sourceit.web.controller.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServletHandler extends CommonServletHandler {
	private static final long serialVersionUID = 4544737546336836686L;
	
	@Override
	protected void handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {
		forwardToJSP("error", request, response);
	}
}
