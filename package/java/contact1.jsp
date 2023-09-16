<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String subject = request.getParameter("subject");
String message = request.getParameter("messgae");

contact contact = new contact();
contact.submitData(....)
%>