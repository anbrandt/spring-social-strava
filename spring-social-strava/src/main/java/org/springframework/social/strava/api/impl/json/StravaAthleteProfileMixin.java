/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.strava.api.impl.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Annotated mixin to add annotations to {@link org.springframework.social.strava.api.StravaAthleteProfile}
 *
 * @author Andy Wilkinson
 */
 abstract class StravaAthleteProfileMixin extends StravaObjectMixin {

    @JsonProperty("name")
    String name;

    @JsonProperty("login")
    String login;

    @JsonProperty("email")
    String email;

    StravaAthleteProfileMixin(
            @JsonProperty("id") long id,
            @JsonProperty("name") String name,
            @JsonProperty("email") String email,
            @JsonProperty("login") String login) {}
}
