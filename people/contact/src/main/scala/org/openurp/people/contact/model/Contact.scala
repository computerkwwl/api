/*
 * OpenURP, Agile University Resource Planning Solution
 *
 * Copyright (c) 2014-2015, OpenURP Software.
 *
 * OpenURP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenURP is distributed in the hope that it will be useful.
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with OpenURP.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.openurp.people.contact.model

import java.sql.Date

import org.beangle.data.model.{ LongId, Updated }
import org.openurp.people.base.model.Person

/**
 * 联系方式
 * @see https://tools.ietf.org/html/rfc6350
 */
class Contact extends LongId with Updated {

  var person: Person = _

  var revision: Long = _

  var uuid: String = _

  var sortAs: String = _

  var anniversary: Date = _
}