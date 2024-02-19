
package org.csystem.util.math;

public class OperationStatusException extends RuntimeException {
    private final OperationStatus m_operationStatus;

    public OperationStatusException(String message, OperationStatus operationStatus)
    {
        super(message);
        m_operationStatus = operationStatus;
    }

    public String getMessage()
    {
        return String.format("Message:%s, Operation Status:%s", super.getMessage(), m_operationStatus);
    }
}
