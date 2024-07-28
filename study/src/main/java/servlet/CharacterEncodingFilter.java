package servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;
import org.springframework.util.MimeType;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.getServletContext().log("doFilter() 호출");
        response.setCharacterEncoding("UTF-8");

        chain.doFilter(request, response);
    }
}
