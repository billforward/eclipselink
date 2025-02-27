/*
 * Copyright (c) 2011, 2021 Oracle and/or its affiliates. All rights reserved.
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
//     Denise Smith - January 2014
package org.eclipse.persistence.testing.jaxb.xmladapter.direct;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class StringAdapter extends XmlAdapter<Integer, String> {
    @Override
    public Integer marshal(String value) {
        return Integer.parseInt(value);
    }

    @Override
    public String unmarshal(Integer value) {
        return value.toString();
    }

}
