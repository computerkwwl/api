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
package org.openurp.edu.evaluation.lesson.stat.model

import org.beangle.commons.model.LongId
import org.openurp.edu.base.model.Course
import org.openurp.edu.base.model.Teacher

class CourseEvalStat extends LongId with EvalStat with Rank {

  var teacher: Teacher = _

  var course: Course = _

}

class CourseOptionStat extends LongId with OptionStat

class CourseQuestionStat extends LongId with QuestionStat

class CourseQuestionTypeStat extends LongId with QuestionTypeStat
