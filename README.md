# SpringDataJPA_REST
SpringDataJPA project: Perform CRUD operations using REST on Product table in MySQL database.


Add files via upload
1. All the CRUD operations are performed on the MySQL Database using ProductRepository. We use Spring Data JPA dependency.
2. To create a table in MySQL database, refer to Product.sql.
3. All REST operations that perfrom CRUD operations on product table are listed in ProductController.java.
3. To perform REST operations, Run the project as Java Application, Open the REST Client (POSTMAN), type the following:
-For Creating product - (POST) https://localhost/products - in requestBody, give product json.
-For Reading all products - (GET)https://localhost/products 
-For Reading single product by Id - (GET)https://localhost/products/1
-For Update - (PUT)https://localhost/products - in requestBody, give product json.
-For Delete - (DELETE)https://localhost/products/1

How Product Json looks like: 
{
"id": 2,
"name": "Mac",
"description": "mast",
"price": 300
}

This project is in working state.
