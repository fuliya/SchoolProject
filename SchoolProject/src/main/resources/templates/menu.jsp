<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">

	<a href="welcome">Home</a>

	<a href = "addStudent"> Add Employee </a> 
	<a href="getStudent">Show Employees</a>  
	<a onclick="document.forms['logoutForm'].submit()">Logout</a>
	<form id="logoutForm" method="POST" action="logout">
	</form>

</div>