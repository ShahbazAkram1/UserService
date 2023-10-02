/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 9/16/2023$
 * Time: 6:09 PM$
 * Project Name: UserService$
 */


package com.Icwd.user.service.exceptions;

public class CustomJsonSerializationException  extends RuntimeException {

    public CustomJsonSerializationException(String message, Throwable cause) {
        super(message, cause);
    }
}
