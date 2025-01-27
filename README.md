
# Spring Boot CRUD API for Categories and Products

This is a Spring Boot application that provides a **CRUD (Create, Read, Update, Delete)** API for managing **Categories** and **Products**. The application uses **Spring Data JPA** for database interaction and **MySQL** as the backend database. This API allows users to manage categories and products, where each product is associated with a specific category.

## Features

- **Category CRUD operations**: Create, Read, Update, and Delete categories.
- **Product CRUD operations**: Create, Read, Update, and Delete products.
- **Pagination**: Support for paginated results for both categories and products.
- **Relationships**: Categories are linked to products  , with a one-to-many relationship.

## Tech Stack

- **Backend Framework**: Spring Boot
- **Database**: Postgres (can be configured for other databases)
- **ORM**: Spring Data JPA/Hibernate
- **Build Tool**: Maven
---

## Getting Started

### Prerequisites

Before running the application, make sure you have the following installed:

1. **Java 17 or higher**
2. **Maven**
3. **Postgres** (or any compatible database)
4. **API Testion Tool**: Postman or any


### Database Configuration (application.properties)

Before running the application, make sure you have the following installed:

1. **Java 17 or higher**
2. **Maven**
3. **MySQL** (or any compatible database)


### Clone the Repository

To get started, clone this repository to your local machine:

```bash
git clone https://github.com/your-username/spring-boot-crud-api.git
cd spring-boot-crud-api

```

### Database Configuration (application.properties)

Configure your MySQL database in the application.properties file:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```

# Running the Application
1. Make sure you have Postgres(other need to Configure) installed and running.
2. Create a new database called testdb or modify the application.properties with your 
3. database credentials.
4. Run the application using Maven or your IDE of choice.


# API Endpoints Documentation

## 1. Categories Endpoints

### `GET /api/categories?page=0`

Retrieve a paginated list of all categories.

**Query Parameters:**
- `page` (optional, default: `0`): Page number to retrieve.
- `size` (optional, default: `4`): Number of categories per page.

**Response:**
- A list of categories with pagination information (total pages, current page, etc.).


### `GET /api/categories?page=0:` Get paginated list of categories(default page is set to 0 and default  data size is 4).
### `GET /api/categories/{id}:` Get a category by its ID.
### `POST /api/categories`: Create a new category
### `PUT /api/categories/{id}` : Update an existing category.
### `DELETE /api/categories/{id}` : Delete a category.


## 2. products Endpoints
### `GET /api/products?page=0` : Get paginated list of products(default page is set to 0 and default  data size is 4).
### `GET /api/products/{id} ` : Get a product by its ID.
### `POST /api/products ` : Create a new product.
### `PUT /api/products/{id} `: Update an existing product.
### `DELETE /api/products/{id} `: Delete a product.

# Some Screenshots
![Screenshot 2025-01-27 112802](https://github.com/user-attachments/assets/b8870c04-5cbc-4f8d-975b-84621379ac13)
![Screenshot 2025-01-27 112832](https://github.com/user-attachments/assets/5881b928-4daf-4b9e-b68b-5bb3b3734da8)
![Screenshot 2025-01-27 112928](https://github.com/user-attachments/assets/52ce2a55-6832-49b8-849c-7e586c9f9aa4)
![Screenshot 2025-01-27 113025](https://github.com/user-attachments/assets/991c333d-f67c-405f-bfd2-3447b1bdce0b)
![Screenshot 2025-01-27 113041](https://github.com/user-attachments/assets/72e2587b-5369-433e-ad53-f76d4e2fd998)
![Screenshot 2025-01-27 113121](https://github.com/user-attachments/assets/531dc8b9-cd6e-4be5-943d-bf6aea126e5b)
![Screenshot 2025-01-27 120049](https://github.com/user-attachments/assets/841f39f4-d23c-47f1-b403-25449ca75e1d)
![Screenshot 2025-01-27 120124](https://github.com/user-attachments/assets/f8865854-017f-464e-9469-87f1221fe33d)
![Screenshot 2025-01-27 120204](https://github.com/user-attachments/assets/0e09da1f-f899-4aea-af72-d691c1eb76d3)
![Screenshot 2025-01-27 120236](https://github.com/user-attachments/assets/65757ec4-65de-49b1-b5bb-3d6887fcc356)
![Screenshot (111)](https://github.com/user-attachments/assets/4a3a4323-9560-4a6a-958f-8a4ca642ec55)
![Screenshot 2025-01-27 112744](https://github.com/user-attachments/assets/7c78a875-0ef9-4930-9c1e-1fc9c0faf4ba)


