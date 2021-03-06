/*
 * Created on Nov 11, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.ui.testing.junit.rule;

import static java.io.File.separator;

import org.fest.util.VisibleForTesting;

/**
 * Some system properties.
 *
 * @author Alex Ruiz
 */
class SystemProperties {

  private String fileSeparator = separator;

  static SystemProperties instance() {
    return LazyLoader.INSTANCE;
  }

  @VisibleForTesting static SystemProperties fileSeparator(String fileSeparator) {
    SystemProperties properties = new SystemProperties();
    properties.fileSeparator = fileSeparator;
    return properties;
  }

  String fileSeparator() {
    return fileSeparator;
  }

  private SystemProperties() {}
  
  private static class LazyLoader {
    static final SystemProperties INSTANCE = new SystemProperties();
  }
}
