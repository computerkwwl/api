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
package org.openurp.edu.exam.model

import scala.reflect.runtime.universe
import org.beangle.commons.lang.annotation.beta
import org.beangle.commons.model.annotation.code
import org.beangle.commons.model.bind.Mapping
import org.openurp.edu.lesson.code.model.LessonTag

class DefaultMapping extends Mapping {

  def binding(): Unit = {
    defaultIdGenerator("auto_increment")

    bind[ExamActivity].on(e => declare(
      e.remark is length(100)))

    bind[ExamMonitor]

    bind[ExamRoom].on(e => declare(
      e.monitors is depends("examRoom")))

    bind[ExamLesson]

    bind[ExamPaper]

    bind[ExamStudent]

    bind[ExamTask]
  }

}
