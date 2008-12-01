/*
 * Copyright (c) 2008 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.

 * Author: Konstantin Krivopustov
 * Created: 01.12.2008 17:31:41
 *
 * $Id$
 */
package com.haulmont.cuba.security.intf;

public class LoginException extends Exception
{
    public LoginException(String message) {
        super(message);
    }

    public LoginException(String template, Object... params) {
        super(String.format(template, params));
    }
}
