/*
 * LangSchema - Generic Programming Language Modeling Interfaces
 * Copyright (C) 2005 Newisys, Inc. or its licensors, as applicable.
 *
 * Licensed under the Open Software License version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You should
 * have received a copy of the License along with this software; if not, you
 * may obtain a copy of the License at
 *
 * http://opensource.org/licenses/osl-2.0.php
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.newisys.langschema;

import java.util.List;

/**
 * Represents a type that explicitly defines the set of all its possible named
 * values.
 * 
 * @author Trevor Robinson
 */
public interface Enumeration
    extends ComplexType, Namespace
{
    /**
     * Returns a list of the possible values for this enumeration.
     *
     * @return List of EnumerationElement
     * @see com.newisys.langschema.Container#getMembers()
     */
    List< ? extends EnumerationElement> getMembers();
}
