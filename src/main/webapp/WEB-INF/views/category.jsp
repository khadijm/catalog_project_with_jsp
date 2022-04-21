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
    
   <H1>category </H2>
      <c:forEach items="${categ}" var="cate">
			   
			   <li><a href="/productpercategory.ca?category_id=${cate.category_id}" > ${cate.category_name}</a></li>
			   <li>${cate.category_description}</li>
			   <a href="/deletecat.ca?category_id=${cate.category_id}" > delete</a></li> <a href="updatecategory.ca?category_id=${cate.category_id}"> modify</a></li>	 
			</c:forEach>
			
      <p><font color="red">${errorMessage}</font></p>
	<form action="/category.ca" method="POST">
		category name : <input name="cat_name"  type="text" /> 
		 category  description : <input name="cat_des" type="text"/>
		  <input type="submit" value="add category">
	</form>
   signup page

   </div>
   </div>
   <footer class="footer">
		<div>footer content</div>
	</footer>

   <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
   
 </body>
</html>
