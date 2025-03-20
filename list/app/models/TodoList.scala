package models

import play.api.libs.json.{Json, OFormat}

case class TodoList(id: String, name: String, items: Seq[TodoListItem])
object TodoList {
  implicit val todoListFormat: OFormat[TodoList] = Json.format[TodoList]
}

case class TodoListItem(id: String, value: String, done: Boolean = false)
object TodoListItem {
  implicit val todoListItemFormat: OFormat[TodoListItem] = Json.format[TodoListItem]
}

case class NewItemRequest(listId: String, item: String)
object NewItemRequest {
  implicit val newItemRequestFormat: OFormat[NewItemRequest] = Json.format[NewItemRequest]
}