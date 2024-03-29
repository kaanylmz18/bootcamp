
package org.csystem.util.tuple;

public final class Value<T> {
    private final T m_value;

    public static <T> Value<T> of(T val)
    {
        return new Value<>(val);
    }

    public Value()
    {
        m_value = null;
    }

    public Value(T value)
    {
        m_value = value;
    }

    public T getValue()
    {
        return m_value;
    }

    public String toString()
    {
        return m_value + "";
    }

    //...
}
