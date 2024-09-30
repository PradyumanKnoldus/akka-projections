package com.nashtech
package models

sealed trait OrderEvent
case class OrderCreated(order: Order) extends OrderEvent
case class OrderUpdated(orderId: String, newItem: String, newQuantity: Int) extends OrderEvent

