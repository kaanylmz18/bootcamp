
package org.csystem.util.datetime;

public class DateTimeException extends RuntimeException {
    public DateTimeException(String message)
    {
        super(message);
    }

    public String getMessage()
    {
        return String.format("DateTime Exception:%s", super.getMessage());
    }
}
