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

package com.aliyuncs.ons.model.v20190214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ons.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OnsMqttQueryClientByTopicRequest extends RpcAcsRequest<OnsMqttQueryClientByTopicResponse> {
	   

	private String parentTopic;

	private String instanceId;

	private String subTopic;
	public OnsMqttQueryClientByTopicRequest() {
		super("Ons", "2019-02-14", "OnsMqttQueryClientByTopic");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getParentTopic() {
		return this.parentTopic;
	}

	public void setParentTopic(String parentTopic) {
		this.parentTopic = parentTopic;
		if(parentTopic != null){
			putQueryParameter("ParentTopic", parentTopic);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSubTopic() {
		return this.subTopic;
	}

	public void setSubTopic(String subTopic) {
		this.subTopic = subTopic;
		if(subTopic != null){
			putQueryParameter("SubTopic", subTopic);
		}
	}

	@Override
	public Class<OnsMqttQueryClientByTopicResponse> getResponseClass() {
		return OnsMqttQueryClientByTopicResponse.class;
	}

}
