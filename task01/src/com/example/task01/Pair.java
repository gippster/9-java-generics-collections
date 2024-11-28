package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<T1, T2> {

    private final T1 _first;
    private final T2 _second;

    private Pair(T1 first, T2 second) {
        this._first = first;
        this._second = second;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
        return new Pair<>(first, second);
    }

    public T1 getFirst() {
        return _first;
    }

    public T2 getSecond() {
        return _second;
    }

    public void ifPresent(BiConsumer<? super T1, ? super T2> consumer) {
        if (_first != null || _second != null) { // Изменено условие
            consumer.accept(_first, _second);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(_first, pair._first) &&
                Objects.equals(_second, pair._second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_first, _second);
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + _first + ", second=" + _second + '}';
    }
}
