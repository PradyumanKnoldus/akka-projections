package com.nashtech
package dao

import models.Order
import scala.concurrent.Future

trait OrderDAO {
  def createOrder(newOrder: Order): Future[Either[String, Order]]
  def updateOrder(updateOrder: Order): Future[Either[String, Option[Order]]]
}