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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkelinkflowLinkflowAttachmentsRequest extends RpcAcsRequest<CreateLinkelinkflowLinkflowAttachmentsResponse> {
	   

	private String fileName;

	private String processInstanceId;

	private String remoteUrl;
	public CreateLinkelinkflowLinkflowAttachmentsRequest() {
		super("SOFA", "2019-08-15", "CreateLinkelinkflowLinkflowAttachments", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putBodyParameter("FileName", fileName);
		}
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
		if(processInstanceId != null){
			putBodyParameter("ProcessInstanceId", processInstanceId);
		}
	}

	public String getRemoteUrl() {
		return this.remoteUrl;
	}

	public void setRemoteUrl(String remoteUrl) {
		this.remoteUrl = remoteUrl;
		if(remoteUrl != null){
			putBodyParameter("RemoteUrl", remoteUrl);
		}
	}

	@Override
	public Class<CreateLinkelinkflowLinkflowAttachmentsResponse> getResponseClass() {
		return CreateLinkelinkflowLinkflowAttachmentsResponse.class;
	}

}
