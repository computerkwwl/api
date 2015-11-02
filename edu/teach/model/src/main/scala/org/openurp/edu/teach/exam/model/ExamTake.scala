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
package org.openurp.edu.teach.exam.model

import org.beangle.data.model.LongId
import org.openurp.edu.base.code.model.ExamStatus
import org.openurp.edu.base.model.Student
import org.openurp.edu.teach.code.model.ExamType
import org.openurp.edu.teach.lesson.model.Lesson

class ExamTake extends LongId with Cloneable {

  /** 教学任务 */
  var lesson: Lesson = _

  /** 学生 */
  var std: Student = _

  /** 考试类型 */
  var examType: ExamType = _

  /** 考试活动*/
  var activity: ExamActivity = _

  /** 考场 */
  var examRoom: ExamRoom = _

  /** 考试情况 */
  var examStatus: ExamStatus = _

  /** 缓考申请原因/记录处分 */
  var remark: String = _

  /** 考场座位号 */
  var seatNo: Short = _
}