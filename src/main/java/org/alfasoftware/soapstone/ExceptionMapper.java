/* Copyright 2019 Alfa Financial Software
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
package org.alfasoftware.soapstone;

import java.util.Optional;

import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.WebApplicationException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Mapper for converting throwables caught during the invocation of web service operation methods
 * into instances of {@link WebApplicationException} which will be returned from the JSON HTTP service.
 *
 * @author Copyright (c) Alfa Financial Software 2019
 */
public interface ExceptionMapper {


  /**
   * Map an exception to a {@link WebApplicationException}.
   *
   * <p>
   * If {@link Optional#empty()} is returned, a generic {@link InternalServerErrorException} will be produced
   *
   * @param t Throwable to map
   * @param objectMapper Jackson object mapper
   * @return mapped exception
   */
  Optional<WebApplicationException> mapThrowable(Throwable t, ObjectMapper objectMapper);

}

