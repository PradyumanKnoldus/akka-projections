package com.nashtech
package models

case class Order(orderId: String, item: String, quantity: Int)

// Events to be processed by the projection
sealed trait OrderEvent
case class OrderCreated(orderId: String, item: String, quantity: Int) extends OrderEvent
case class OrderUpdated(orderId: String, item: String, quantity: Int) extends OrderEvent



