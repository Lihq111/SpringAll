package interceptor;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, @NotNull HttpServletResponse response,@NotNull Object handler) throws Exception {
        if (request.getSession().getAttribute("user") != null) {
            System.out.println("登录成功");
            return true;
        } else {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
            return false;
        }
    }
}

