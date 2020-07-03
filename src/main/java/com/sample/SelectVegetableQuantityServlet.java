package com.sample;

import com.sample.model.VegetableType;
import org.json.simple.JSONObject;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;


/*@WebServlet(name = "SelectVegetableServlet", urlPatterns = {"/selectQuantity"})*/
@WebServlet("/selectVegQuantity")
public class SelectVegetableQuantityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response)  {

        try{

            VegetableService vegetableService = new VegetableService();
            Map<String, List<String>> vegQuantity = vegetableService.getAvailableQuantities();

            req.setAttribute("allQuantity", vegQuantity);
            JSONObject obj = new JSONObject();
            obj.put("allQuantity", vegQuantity);

            PrintWriter out = response.getWriter();
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            out.print(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}