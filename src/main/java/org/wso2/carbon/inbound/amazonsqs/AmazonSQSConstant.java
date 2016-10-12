/**
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * <p>
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.inbound.amazonsqs;

/**
 * Common constants used by AmazonSQS inbound endpoint.
 *
 * @since 1.0.0.
 */
public class AmazonSQSConstant {
    public static final String AMAZONSQS_SQS_WAIT_TIME = "wait_time";
    public static final String AMAZONSQS_SQS_MAX_NO_OF_MESSAGE = "maxNoOfMessage";
    public static final String DESTINATION = "destination";
    public static final String AMAZONSQS_ACCESSKEY = "accessKey";
    public static final String AMAZONSQS_SECRETKEY = "secretKey";
    public static final String CONTENT_TYPE = "contentType";
    public static final String DEFAULT_CONTENT_TYPE = "text/plain";
    public static final String SET_ROLLBACK_ONLY = "SET_ROLLBACK_ONLY";
    public static final String ATTRIBUTE_NAMES = "attributeNames";
    public static final String ALL = "All";
}