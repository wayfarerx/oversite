/*
 * Context.scala
 *
 * Copyright 2018 wayfarerx <x@wayfarerx.net> (@thewayfarerx)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.wayfarerx.oversite

import cats.effect.IO

/**
 * Description of the context that a task operates in.
 */
trait Context {

  def resolve[T <: Asset.Type](asset: Asset[T]): IO[Option[Asset.Resolved[T]]]

  def resolve[T <: AnyRef](entity: Entity[T]): IO[Option[Entity.Resolved[T]]]

  def load[T <: AnyRef](entity: Entity[T]): IO[Option[T]]

}