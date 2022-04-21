<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
 <head>
  <title>Yahoo!!</title>
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
        	<li><a href="/Logout.ca">Logout</a></li>
		</ul>

	</nav>
	
        <div class="container">
	
	<ol>
			<H1>add product </H2>
      <p><font color="red">${errorMessage}</font></p>
	<form action="/addproduct.ca" method="POST" enctype="multipart/form-data">
		product name : <input name="prod_name" type="text" /> 
		 product  description : <input name="prod_des" type="text"/>
		 category <select name="category_id">
		         <c:forEach items="${category}" var="cat">
	
		         <option value="${cat.category_id}">${cat.category_name}</option>
		         </c:forEach>
		         </select>
		 file to upload <input type="file" name="image" />
		  <input type="submit" value="add product"/>
	</form>
		
   </div>
   </div>

<footer class="footer">
		<div>footer content</div>
	</footer>

   <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>


</body>

</html>