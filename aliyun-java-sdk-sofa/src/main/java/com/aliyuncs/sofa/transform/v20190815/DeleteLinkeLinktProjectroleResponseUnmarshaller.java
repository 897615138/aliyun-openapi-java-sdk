/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinktProjectroleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinktProjectroleResponseUnmarshaller {

	public static DeleteLinkeLinktProjectroleResponse unmarshall(DeleteLinkeLinktProjectroleResponse deleteLinkeLinktProjectroleResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinktProjectroleResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinktProjectroleResponse.RequestId"));
		deleteLinkeLinktProjectroleResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinktProjectroleResponse.ResultCode"));
		deleteLinkeLinktProjectroleResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinktProjectroleResponse.ResultMessage"));
		deleteLinkeLinktProjectroleResponse.setData(_ctx.booleanValue("DeleteLinkeLinktProjectroleResponse.Data"));
		deleteLinkeLinktProjectroleResponse.setErrorCode(_ctx.longValue("DeleteLinkeLinktProjectroleResponse.ErrorCode"));
		deleteLinkeLinktProjectroleResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeLinktProjectroleResponse.ErrorMessage"));
		deleteLinkeLinktProjectroleResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeLinktProjectroleResponse.ResponseStatusCode"));
		deleteLinkeLinktProjectroleResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinktProjectroleResponse.Success"));
	 
	 	return deleteLinkeLinktProjectroleResponse;
	}
}