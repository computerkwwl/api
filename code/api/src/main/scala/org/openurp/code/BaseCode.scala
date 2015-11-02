/*
 * OpenURP, Agile Development Scaffold and Toolkit
 *
 * Copyright (c) 2014-2015, OpenURP Software.
 *
 * OpenURP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenURP is distributed in the hope that it will be useful.
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenURP.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.openurp.code

import org.beangle.data.model.{Coded, IntId, Named, TemporalOn, Updated}

trait BaseCode extends IntId with Named with Coded {

  def enName: String
}

object BaseCodeCategory {

  //  基础代码种类
  val Nation = "nation"

  val Industry = "industry"

  val School = "school"
}

abstract class BaseCodeBean extends IntId with BaseCode with TemporalOn with Updated {
  var enName: String = _
  var remark: String = _
}