/*
 * Copyright (c) 1998, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.testing.sdo.helper.datafactory;

import commonj.sdo.Type;
import org.eclipse.persistence.sdo.SDODataObject;

public class USAddressImpl extends SDODataObject implements USAddress {

    @Override
    public java.lang.String getName() {
        return (java.lang.String)get("name");
    }

    @Override
    public void setName(java.lang.String value) {
        set("name", value);
    }

    @Override
    public java.lang.String getStreet() {
        return (java.lang.String)get("street");
    }

    @Override
    public void setStreet(java.lang.String value) {
        set("street", value);
    }
}
