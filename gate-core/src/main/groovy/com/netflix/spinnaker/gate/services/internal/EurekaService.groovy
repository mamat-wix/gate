/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.gate.services.internal

import com.netflix.spinnaker.gate.model.discovery.DiscoveryApplications
import retrofit.http.GET
import retrofit.http.Headers
import retrofit.http.Path

interface EurekaService {

  @Headers("Accept: application/json")
  @GET("/discovery/v2/vips/{vipAddress}")
  DiscoveryApplications getVips(@Path("vipAddress") String vipAddress)

  @Headers("Accept: application/json")
  @GET("/discovery/v2/svips/{secureVipAddress}")
  DiscoveryApplications getSecureVips(@Path("secureVipAddress") String secureVipAddress)
}
