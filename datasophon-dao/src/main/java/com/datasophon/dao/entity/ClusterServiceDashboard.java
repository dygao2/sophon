/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.datasophon.dao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 集群服务总览仪表盘
 * 
 * @author gaodayu
 * @email gaodayu2022@163.com
 * @date 2022-06-23 17:01:58
 */
@Data
@TableName("t_ddh_cluster_service_dashboard")
public class ClusterServiceDashboard implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主机
	 */
	@TableId
	private Integer id;
	/**
	 * 服务名称
	 */
	private String serviceName;
	/**
	 * 总览页面地址
	 */
	private String dashboardUrl;

}
