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

import org.beangle.data.model.Component
import org.beangle.data.model.LongId
import org.openurp.edu.base.code.model.ExamMode
import org.openurp.edu.teach.code.model.ExamForm
import org.openurp.edu.teach.exam.model.ExamActivity

class ExamSchedule extends  Component with Serializable with Cloneable {

  /** 具体排考结果 */
  var activities: collection.mutable.Set[ExamActivity] = _

  /** 考试形式 开/闭卷 */
  var examForm: ExamForm = _

  /** 考试方式 */
  var examMode: ExamMode = _

}