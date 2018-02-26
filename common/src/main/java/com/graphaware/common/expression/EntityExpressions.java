/*
 * Copyright (c) 2013-2018 GraphAware
 *
 * This file is part of the GraphAware Framework.
 *
 * GraphAware Framework is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of
 * the GNU General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.graphaware.common.expression;

import java.util.Map;

public interface EntityExpressions {

    Map<String, Object> getProperties();

    default boolean hasProperty(String key) {
        return getProperties() != null && getProperties().containsKey(key);
    }

    default Object getProperty(String key) {
        if (!hasProperty(key)) {
            return null;
        }
        return getProperties().get(key);
    }

    default Object getProperty(String key, Object defaultValue) {
        if (!hasProperty(key)) {
            return defaultValue;
        }

        return getProperty(key);
    }

}