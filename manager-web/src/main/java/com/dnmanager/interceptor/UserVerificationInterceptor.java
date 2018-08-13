package com.dnmanager.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户信息验证
 */
public class UserVerificationInterceptor implements HandlerInterceptor {
	/*private IAdminOperationService adminOperationService = (IAdminOperationService) ApplicationConextUtil.getApplicationContext().getBean("adminOperationService");
	private IAdminRoleService adminRoleService = (IAdminRoleService) ApplicationConextUtil.getApplicationContext().getBean("adminRoleService");
	private static RouteMapper<String> ROUTES;
	private static List<AdminOperation> adminOperations;*/
	public static Map<String, String> dispathcUrls = new HashMap<>();
//	private static int port = MultiConnectionSupport.getHttpPort();
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        return true;
		
    }
@Override
public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
		ModelAndView modelAndView) throws Exception {
	// TODO Auto-generated method stub
	
}
@Override
public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
		throws Exception {
	// TODO Auto-generated method stub
	
}

	

   
    
    

}