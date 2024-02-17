package in.goalTracker.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.goalTracker.jdbc.CreateTask;
import in.goalTracker.jdbc.CreateUser;
import in.goalTracker.jdbc.GetTask;

@WebServlet("/CreateUserController")
public class GetTaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String allTasksOfUser="";


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("cusername");	
		
		allTasksOfUser=GetTask.getAllTasks(name);
		response.setStatus(1, allTasksOfUser);
	}

}
