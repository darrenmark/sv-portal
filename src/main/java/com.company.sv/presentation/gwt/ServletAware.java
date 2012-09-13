package com.company.sv.presentation.gwt;

import com.company.sv.domain.User;
import com.google.gwt.user.client.rpc.InvocationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 */
@Deprecated
public class ServletAware {
    private static Logger log = LoggerFactory.getLogger(ServletAware.class);
    private static ThreadLocal<HttpServletRequest> THREAD_LOCAL = new ThreadLocal<HttpServletRequest>();

    /**
     * Get the servlet request for this thread.
     */
    public static HttpServletRequest getHttpServletRequest() {
        return THREAD_LOCAL.get();
    }

    /**
     * Set the servlet request for this thread.
     */
    public static void setHttpServletRequest(HttpServletRequest request) {
        THREAD_LOCAL.set(request);
    }

    /**
     * Get the User associated with the session.
     *
     * @return The associated user, or null if one can not be found.
     */
    public static User getUser() {
        User user = (User) getHttpServletRequest().getSession().getAttribute("user");
        if (user == null) {
            throw new InvocationException("Your session has expired");
        }
        return user;
    }
}
