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
package org.openurp.edu.base.code.model

import scala.reflect.runtime.universe
import org.beangle.commons.model.annotation.code
import org.beangle.commons.model.bind.Mapping
import org.openurp.code.BaseCodeBean
import org.beangle.commons.lang.time.WeekState

class DefaultMapping extends Mapping {

  def binding(): Unit = {
    bind[BookType]
    bind[BookAwardType]
    bind[CourseType]
    bind[CourseCategory]
    bind[CourseTakeType]
    bind[CourseHourType]
    bind[CourseAbilityRate]
    bind[Education]
    bind[ElectionMode]
    bind[ExamType]
    bind[ExamStatus]
    bind[ExamMode]
    bind[ExamForm]
    bind[GradeType]
    bind[StdLabel]
    bind[StdLabelType]
    bind[StdType]
    bind[ScoreMarkStyle]
    bind[TeachLangType]
    bind[TeacherType]
  }
}
