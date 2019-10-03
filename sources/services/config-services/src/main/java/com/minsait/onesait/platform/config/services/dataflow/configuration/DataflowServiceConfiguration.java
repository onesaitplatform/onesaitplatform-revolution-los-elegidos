/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2013-2019 SPAIN
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.minsait.onesait.platform.config.services.dataflow.configuration;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class DataflowServiceConfiguration {
    @Value("${onesaitplatform.analytics.dataflow.streamsetsProtocol:http}")
    private String dataflowProtocol;
    @Value("${onesaitplatform.analytics.dataflow.streamsetsHostname:localhost}")
    private String dataflowHostname;
    @Value("${onesaitplatform.analytics.dataflow.streamsetsPort:8080}")
    private int dataflowPort;
    @Value("${onesaitplatform.analytics.dataflow.streamsetsPathname:#{null}}")
    private String dataflowPathname;
    @Value("${onesaitplatform.analytics.dataflow.adminUsername:#{null}}")
    private String dataflowAdminUsername;
    @Value("${onesaitplatform.analytics.dataflow.adminPass:#{null}}")
    private String dataflowAdminPass;
    @Value("${onesaitplatform.analytics.dataflow.username:#{null}}")
    private String dataflowUsername;
    @Value("${onesaitplatform.analytics.dataflow.pass:#{null}}")
    private String dataflowPass;
    @Value("${onesaitplatform.analytics.dataflow.guestUsername:#{null}}")
    private String dataflowGuest;
    @Value("${onesaitplatform.analytics.dataflow.guestPass:#{null}}")
    private String dataflowGuestPass;
    @Value("${onesaitplatform.analytics.dataflow.streamsetsGlobalTimeout:#{120000}}")
    private String globalTimeout;
    private String baseURL;

    @PostConstruct
    public void init() {
        baseURL = String.format("%s://%s:%s/%s", dataflowProtocol, dataflowHostname, dataflowPort, dataflowPathname);
    }
}