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
package org.openurp.edu.teach.grade.course.domain

import org.beangle.data.dao.Operation
import org.openurp.edu.teach.code.model.GradeType
import org.openurp.edu.teach.grade.course.model.{ CourseGrade, CourseGradeState }

/**
 * 成绩发布监听器
 * @author chaostone
 */
trait CourseGradePublishListener {

  /**
   * 发布单个成绩
   */
  def onPublish(grade: CourseGrade, gradeTypes: Array[GradeType]): Seq[Operation]

  /**
   * 发布一批成绩
   */
  def onPublish(grades: Iterable[CourseGrade], gradeState: CourseGradeState, gradeTypes: Array[GradeType]): Seq[Operation]
}
