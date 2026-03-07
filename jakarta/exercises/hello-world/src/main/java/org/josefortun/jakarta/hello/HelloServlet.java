package org.josefortun.jakarta.hello;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.Serial;

@WebServlet("/hello-world")
public class HelloServlet extends HttpServlet {

	@Serial
	private static final long serialVersionUID = -6415915953401598432L;
}
