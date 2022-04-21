<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
 <head>
  <title>Welcome to our catalog</title>
  <!-- Bootstrap core CSS -->
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
	<style>
	.footer {
		position: absolute;
		bottom: 0;
		width: 100%;
		height: 60px;
		background-color: #f5f5f5;
	}
</style>
	
  
  </head>
    <body>
    <nav class="navbar navbar-default">

		<ul class="nav navbar-nav">
	     	<a href="/welcome.ca" class="navbar-brand">Homee</a>
        
			<a class="navbar-brand" href="/category.ca">category</a>
			<a class="navbar-brand" href="/product.ca">product</a>
			<a class="navbar-brand" href="/product.ca">product per category </a>
			
		</ul>
        <ul class="nav navbar-nav navbar-right">
        <li><a href="/Signup.ca">signup</a></li>
			<li><a href="/Login.ca">Login</a></li>
			<li><a href="/Logout.ca">Logout</a></li>
		</ul>
      
	</nav>
				     <ol>
			<c:forEach items="${user}" var="users">
			  ${users.name}
			   ${users.username}
			   	</c:forEach>
			</ol>
			
         
         
        <div class="container">
	   <H1>Welcome to our catalog </H2>
      <h4>${account}</h4>
						     <ol>
			<c:forEach items="${product}" var="todo">
			
			   <li><img src="data:image/jpg;Base64,${todo.baseimg}" width="40" height="50"/></li>
			   <li>${todo.product_name}</li>
			   <li>${todo.product_description}</li>
			   <li>${todo.category_name}</li>
			   <a href="delete.ca?product_id=${todo.product_id}" > delete</a></li> <a href="modifyproduct.ca?product_id=${todo.product_id}"> modify</a></li> 			   			    	 
			</c:forEach>
			</ol>
				    	
			      
   </div>
   </div>

	
   <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 </body>
</html>
