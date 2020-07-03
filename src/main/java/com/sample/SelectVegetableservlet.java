package com.sample;

import com.sample.model.VegetableType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "SelectVegetableservlet",
        urlPatterns = "/selectQuantity"
)

public class SelectVegetableservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //String vegetableType = req.getParameter("Type");

        //VegetableService vegetableService = new VegetableService();
        //VegetableType l = VegetableType.valueOf(vegetableType);

        //List vegQuantity = vegetableService.getAvailableQuantity(l);

        //req.setAttribute("quantity", vegQuantity);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}