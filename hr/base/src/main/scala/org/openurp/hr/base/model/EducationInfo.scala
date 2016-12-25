/*
 * OpenURP, Agile University Resource Planning Solution
 *
 * Copyright (c) 2014-2016, OpenURP Software.
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
package org.openurp.hr.base.model

import org.beangle.commons.model.Component
import org.openurp.code.edu.model.{ Degree, EducationDegree }
import org.beangle.commons.model.LongId
import org.beangle.commons.model.TemporalOn
import org.openurp.code.edu.model.StudyType

/**
 * 教育信息
 * (入学日期，毕(肄)业日期)
 */
class EducationInfo extends LongId with TemporalOn {
/**教职工*/
  var staff: Staff = _
  /** 学历 */
  var educationDegree: EducationDegree = _
  /**学位*/
 var degree: Degree = _
  /** 学历证书号 */
  var certificateNo: String = _
  /**学制 */
  var duration: Float = _
  /** 所学专业 */
  var major: String = _
  /**学校(单位)名称*/
  var school: String = _
  /**学习形式 */
  var studyType: StudyType = _
  /**学习内容 */
  var content: String = _
  /**证明人*/
  var witness: String = 
  /**备注*/_
  var remark: String = _

}