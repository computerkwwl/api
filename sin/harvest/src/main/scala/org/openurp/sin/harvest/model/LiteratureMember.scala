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
package org.openurp.sin.harvest.model

import org.beangle.commons.model.{ IntId, Named }
import org.openurp.base.model.Department

class LiteratureMember extends IntId with Named {

  var department: Department = _

  var literature: Literature = _

  var researcher: Researcher = _

  var contributionCount: Float = _

  var sign: Int = _

  var assumeRole: AssumeRole = _

}