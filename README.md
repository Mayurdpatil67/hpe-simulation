# Employee Service

This is a simple Spring Boot application that provides a RESTful API for managing a list of employees. It supports basic
operations like retrieving the list of employees and adding a new employee. The app uses in-memory storage (a list) to
hold employee data.

---

## Features

- View all employees via a `GET` endpoint
- Add a new employee via a `POST` endpoint
- In-memory employee list initialized with 4 entries
- Simple unit tests for the service logic

---

## Dependencies

- Java 8+
- Spring Boot
- JUnit 5

---

## API Endpoints

### Get All Employees

```
GET /employees/get-employees
```

- **Response:** List of all employees (in JSON)

### Add a New Employee

```
POST /employees/post-employee
Content-Type: application/json
```

**Request Body Example:**

```json
{
  "employeeId": "005",
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "title": "Tester"
}
```

- **Response:** `"Employee addedd !"` *(typo intentional to match current code)*

---

## Testing

The `EmployeeManagerTest` class includes basic tests to verify:

- Retrieval of initial employee list
- Adding a new employee to the list

To run the tests:

```bash
mvn test
``` 