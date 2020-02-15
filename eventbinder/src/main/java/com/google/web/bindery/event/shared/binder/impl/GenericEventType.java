/*
 * Copyright 2013 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.web.bindery.event.shared.binder.impl;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.web.bindery.event.shared.binder.GenericEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility to maintain a mapping from subtypes of {@link GenericEvent} to 
 * {@link Type}s for those events. Users shouldn't need to reference this class
 * directly.
 *
 * @author ekuefler@google.com (Erik Kuefler)
 */
public class GenericEventType extends SuperclassExtracted {

  static final Map<Class<?>, GenericEventType> TYPE_MAP =
      new HashMap<Class<?>, GenericEventType>();

  private GenericEventType() {}
}
