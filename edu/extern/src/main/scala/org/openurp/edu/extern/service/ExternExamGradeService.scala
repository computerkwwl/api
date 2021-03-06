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
package org.openurp.edu.extern.service

import org.beangle.commons.model.annotation.code
import org.openurp.edu.base.model.Student
import org.openurp.edu.extern.code.model.{ ExamCategory, ExamSubject }
import org.openurp.edu.extern.exam.model.ExternExamGrade


trait ExternExamGradeService {

  def saveOrUpdate(examGrade: ExternExamGrade): Unit

  def getBestGrade(std: Student, category: ExamCategory): ExternExamGrade

  def getPassGradesOf(std: Student, subjects: Iterable[ExamSubject]): List[ExternExamGrade]

  def isPass(std: Student, subject: ExamSubject): Boolean

  def getExamGrades(std: Student, best: Boolean): Iterable[ExternExamGrade]
}
