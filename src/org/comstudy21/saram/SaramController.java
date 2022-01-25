package org.comstudy21.saram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet("/saram/*")
public class SaramController extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // form에서 서버로 data 전송 위해 server.xml에서 URIEncoding="UTF-8" 추가
      resp.setContentType("text/html; charset=UTF-8");
      resp.setCharacterEncoding("UTF-8");
      req.setCharacterEncoding("UTF-8");
      
      System.out.println("GET - /saram/*");
      System.out.println("doGet() - SaramController");
      
      PrintWriter pw = resp.getWriter();
//      pw.println("<html><body>");
//      pw.printf("<h1>%s</h1>", "안녕 서블렛");
//      pw.println("</body></html>");
      
      // JSON 데이터 전송하기
      // 번호, 아이디, 성명, 나이
      JSONObject saram01 = new JSONObject();
      saram01.put("no", 1);
      saram01.put("id", "KIM");
      saram01.put("name", "GILDONG");
      saram01.put("age", 28);
      JSONObject saram02 = new JSONObject();
      saram01.put("no", 2);
      saram01.put("id", "LEE");
      saram01.put("name", "GILJA");
      saram01.put("age", 24);
      JSONArray saramArr = new JSONArray();
      saramArr.put(saram01);
      saramArr.put(saram02);
      
      System.out.println(saramArr.toString(2));
      pw.write(saramArr.toString(2));
      pw.close();
   }

}