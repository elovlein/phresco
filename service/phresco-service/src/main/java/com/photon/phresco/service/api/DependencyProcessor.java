/*******************************************************************************
 * Copyright (c) 2011 Photon.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Photon Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.photon.in/legal/ppl-v10.html
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Contributors:
 *     Photon - initial API and implementation
 ******************************************************************************/
package com.photon.phresco.service.api;

import java.io.File;

import com.photon.phresco.exception.PhrescoException;
import com.photon.phresco.model.ProjectInfo;

public interface DependencyProcessor {

	/**
	 * Uses the {@link ProjectInfo} object to identify the dependent modules, libraries, technology, etc and handle
	 * them appropriately in the specified Project path
	 * @param info {@link ProjectInfo} object
	 * @param projectPath Path of project to be created.
	 * @throws PhrescoException
	 */
	void process(ProjectInfo info, File projectPath) throws PhrescoException;

}
