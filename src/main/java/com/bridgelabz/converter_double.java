package com.bridgelabz;

@FunctionalInterface
public interface converter_double<T,R> {
    R convert(T t);
}
