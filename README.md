# todo-list

Spring Boot - TODO-LIST Application - REST

**** ToDoListController **** 

To Create Todolist with Postman
-- localhost:8080/api/todolist

To Delete Todolist with Postman
-- localhost:8080/api/todolist/{id}

To List All Todolist with Postman
-- localhost:8080/api/todolists


**** ItemController ****

To Create Item with Postman
-- localhost:8080/api/todolists/{todolistId}/items

To List All Todolist with Postman
-- localhost:8080/api/todolists


# Sample TODOLIST JSON:

{
  "name": "TODOLIST-1",
  "items": [
    {
      "name": "GokhanYILMAZ",
      "description": "doSomething",
      "deadline": 1533480206019,
      "status": "completed"
    }
  ]
}
