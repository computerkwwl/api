/*
 * OpenURP, Agile University Resource Planning Solution
 *
 * Copyright (c) 2014-2017, OpenURP Software.
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
package org.openurp.base.model

import scala.collection.mutable.Buffer
import org.beangle.commons.lang.time.HourMinute
import org.beangle.commons.model.{ IntId, Named, NumId, TemporalOn }
import org.openurp.base.code.model.DayPart

/**
 * 假日安排
 */
class Holiday extends IntId with Named with TemporalOn {
  var school: School = _
}

/**
 * 时间设置
 */
class TimeSetting extends IntId with Named {
  var school: School = _
  var units: Buffer[CourseUnit] = new collection.mutable.ListBuffer[CourseUnit]
}

/**
 * 课程小节
 */
class CourseUnit extends IntId with Named {
  var indexno: Int = _
  var beginAt: HourMinute = _
  var endAt: HourMinute = _
  var setting: TimeSetting = _
  var part: DayPart = _
  var enName: String = _
}

/** 连续周连续,单周,双周,任意*/
object CircleWeekTypes extends Enumeration(1) {
  val Continuely, Odd, Even, Random = Value
}