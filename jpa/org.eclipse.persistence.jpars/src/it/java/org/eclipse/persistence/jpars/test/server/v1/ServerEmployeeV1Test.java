/*
 * Copyright (c) 2014, 2021 Oracle and/or its affiliates. All rights reserved.
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
//      Dmitry Kornilov - Initial implementation
package org.eclipse.persistence.jpars.test.server.v1;

import org.eclipse.persistence.jpars.test.server.ServerEmployeeTestBase;
import org.junit.BeforeClass;

import java.util.Map;

/**
 * ServerEmployeeTest adapted for JPARS 1.0.
 * {@link ServerEmployeeTestBase}
 *
 * @author Dmitry Kornilov
 * @since EclipseLink 2.6.0
 */
public class ServerEmployeeV1Test extends ServerEmployeeTestBase {

    @BeforeClass
    public static void setup() throws Exception {
        initContext("jpars_employee-static", "v1.0");
    }
}
