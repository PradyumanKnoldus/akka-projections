package com.nashtech
package parsers
import com.nashtech.models.Order
import scalikejdbc._

object Parsers {
  def fromResultSet(rs: WrappedResultSet): Order = {
    Order(
      orderId = rs.string("order_id"),
      userId = rs.string("user_id"),
      items = rs.string("items").split(",").toList,  // Split the items string into a list
      status = rs.string("status"),
      timestamp = rs.long("timestamp")
    )
  }
}
