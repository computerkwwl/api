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
package org.openurp.edu.teach.schedule.model

import org.beangle.data.model.Named
import org.beangle.data.model.LongId
import org.openurp.base.model.{ Department, Semester }
import org.openurp.edu.base.ProjectBased
import org.openurp.edu.teach.lesson.model.Lesson
/**
 * 教学任务课程组
 *
 */
class LessonGroup extends LongId with ProjectBased with Named {

  /** 任务集合 */
  var lessons: collection.mutable.Set[Lesson] = _

  /** 教学任务数目 */
  var lessonSize: Int = _

  /**开课部门*/
  var teachDepart: Department = _

  /** 学期 */
  var semester: Semester = _
}