package pl.jnowacki.controller;

import pl.jnowacki.service.ToolService;
import pl.jnowacki.service.ToolServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("")
public class ToolController extends HttpServlet {

    private ToolService toolService = new ToolServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("tools", toolService.getAll());

        getServletContext().getRequestDispatcher("/tools.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long param = Long.valueOf(req.getParameter("toolId"));
        toolService.setAvailability(param);

        resp.sendRedirect(req.getContextPath());
    }
}
