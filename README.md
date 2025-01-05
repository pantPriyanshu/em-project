# Employee Management System (EMS) - REST API

A Spring Boot-based REST API for managing employees. This project demonstrates CRUD operations (Create, Read, Update, Delete) using dependency injection and follows good coding practices.

## Description
This API provides endpoints to perform operations on employee data, such as creating, retrieving, updating, and deleting employee records. The project showcases the use of Spring Boot's REST controller and dependency injection.

### Features
- **Create Employees**: Add new employees to the system.
- **Retrieve Employees**: Fetch all employees or a specific employee by ID.
- **Update Employees**: Modify employee details.
- **Delete Employees**: Remove employees by their unique ID.

### Tech Stack
- **Java**: Core programming language.
- **Spring Boot**: Framework for building REST APIs.
- **MongoDB**: Database for storing employee data.
- **Maven**: Build automation tool.

## Endpoints

### Base URL

### API Routes

| HTTP Method | Endpoint               | Description                        |
|-------------|------------------------|------------------------------------|
| GET         | `/`                    | Retrieve all employees.           |
| GET         | `/id/{myId}`           | Get employee by ID.               |
| POST        | `/`                    | Create a new employee.            |
| PUT         | `/id/{myId}`           | Update employee details by ID.    |
| DELETE      | `/id/{myId}`           | Delete an employee by ID.         |

### Request and Response Example

#### Create Employee (`POST /`)
```json
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phone": "1234567890"
}
{
  "name": "Jane Doe",
  "email": "jane.doe@example.com"
}
{
  "id": "64dfb1e43213e5b2f8c4d2a3",
  "name": "Jane Doe",
  "email": "jane.doe@example.com",
  "phone": "1234567890",
  "date": "2025-01-06T10:30:00"
}

