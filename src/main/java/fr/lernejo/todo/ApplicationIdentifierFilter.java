package fr.lernejo.todo;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.UUID;

@Component
public class ApplicationIdentifierFilter implements Filter {
    private UUID uuid = UUID.randomUUID();


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        javax.servlet.http.HttpServletResponse res = (javax.servlet.http.HttpServletResponse) servletResponse;
        res.setHeader("Instance-Id", uuid.toString());
    }
}
