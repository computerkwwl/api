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
package org.openurp.edu.program.plan.model

class Terms(val value: Int) extends Ordered[Terms] with Serializable {

  override def compare(other: Terms): Int = {
    if (this.value < other.value) -1
    else if (this.value == other.value) 0
    else 1
  }

  def termList: List[Int] = {
    val str = toString
    var i = str.length - 1
    val result = new collection.mutable.ListBuffer[Int]
    while (i >= 0) {
      if (str.charAt(i) == '1') result += (str.length - i)
      i -= 1
    }
    result.toList
  }

  def matches(other: Terms): Boolean = {
    (this.value & other.value) > 0
  }
}