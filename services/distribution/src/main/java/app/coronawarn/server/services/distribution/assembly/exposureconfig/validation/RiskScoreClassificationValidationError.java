/*
 * Corona-Warn-App
 *
 * SAP SE and all other contributors /
 * copyright owners license this file to you under the Apache
 * License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package app.coronawarn.server.services.distribution.assembly.exposureconfig.validation;

import java.util.Objects;

public class RiskScoreClassificationValidationError implements ValidationError {

  private final String parameter;

  private final Object value;

  private final String reason;

  public RiskScoreClassificationValidationError(String parameter, Object value, String reason) {
    this.parameter = parameter;
    this.value = value;
    this.reason = reason;
  }

  @Override
  public String toString() {
    return "RiskScoreClassificationValidationError{"
        + "errorType=" + reason
        + ", parameter='" + parameter + '\''
        + ", givenValue=" + value
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskScoreClassificationValidationError that = (RiskScoreClassificationValidationError) o;
    return Objects.equals(parameter, that.parameter) &&
        Objects.equals(value, that.value) &&
        Objects.equals(reason, that.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter, value, reason);
  }
}
