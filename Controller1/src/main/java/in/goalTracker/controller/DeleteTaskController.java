package in.goalTracker.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.goalTracker.jdbc.CreateTask;
import in.goalTracker.jdbc.CreateUser;
import in.goalTracker.jdbc.DeleteTask;

@WebServlet("/CreateUserController")
public class DeleteTaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int userCreated=0;


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("cusername");
		String task=request.getParameter("ctask");
		
		
		userCreated=DeleteTask.unwantedTask(name, task);
		response.setStatus(userCreated);
	}

}
