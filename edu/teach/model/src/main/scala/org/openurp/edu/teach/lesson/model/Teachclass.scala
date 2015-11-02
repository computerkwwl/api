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
package org.openurp.edu.teach.lesson.model

import scala.beans.BeanProperty

import org.beangle.commons.collection.Collections
import org.beangle.data.model.{ Component, Named }
import org.openurp.base.model.Department
import org.openurp.edu.teach.exam.model.ExamTake

class Teachclass extends Cloneable with Component with Named {
  //for hibernate must looking get/set for compoent parent parent attribute.
  @BeanProperty /** 教学任务 */
  var lesson: Lesson = _

  /** 学生所在部门 */
  var depart: Department = _

  /** 学生人数 */
  var stdCount: Int = _

  /** 最大人数 */
  var limitCount: Int = _

  /**
   * 是否锁定人数上限
   */
  var limitLocked: Boolean = false

  /**性别限制*/
  var genderLimit = new  LessonGenderLimit

  /**
   * 保留人数<br>
   * 一个任务的真实的人数上限 = limitCount - reservedCount
   */
  var reservedCount: Int = _

  /** 上课名单 */
  var courseTakes = Collections.newBuffer[CourseTake]

  /**
   * 考试名单
   */
  var examTakes: collection.mutable.Set[ExamTake] = _

  /**
   * 限制条件组
   */
  var groups = Collections.newBuffer[LessonLimitGroup]

}