package controller;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import java.sql.Statement;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;

public class welcomecontroller {
	private connetiondb con=new connetiondb();
	private  ResultSet rs;
	private List<product> res = new ArrayList();

	public welcomecontroller() {}
	
	public List<product> list_product() {
		int produt_i=0;
	        	
	
			try{
				
				Statement statement=con.obtenirconnexion().createStatement();
				String sql ="select * from product";
				 rs = statement.executeQuery(sql);
						
				 
						
					 while (rs.next()) {
						 

						product   prd = new product();

						    prd.setProduct_id(rs.getString("product_id")); 	 	 	 
						    prd.setProduct_name(rs.getString("product_name"));
						    prd.setProduct_description(rs.getString("product_description"));
						    Blob blob = rs.getBlob("image");
						    System.out.println("he"+blob);
							InputStream inputStream = blob.getBinaryStream();
							System.out.println("he"+inputStream);
							ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
							byte[] buffer = new byte[4096];
							int bytesRead = -1;
							while ((bytesRead = inputStream.read(buffer)) != -1) {
								outputStream.write(buffer, 0, bytesRead);
							}
							
							byte[] imageBytes = outputStream.toByteArray();
							String baseimg = Base64.getEncoder().encodeToString(imageBytes);
							inputStream.close();
							outputStream.close();
							prd.setBaseimg(baseimg);
							prd.setCategory_id(rs.getString("category_id"));
						    res.add(produt_i, prd);
						    produt_i++;
						    System.out.println("ok");
						}
						
						//con.close();
						} catch (Exception e) {
						e.printStackTrace();
						}
			return res ;
	}
	/*public List<ResultSet> res() {
		return res;
	}*/
	
	
}


