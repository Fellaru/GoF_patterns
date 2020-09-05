package ru.fella.learn.patterns.behavioral.chain_of_responsibility;

public interface Filter {
    boolean doFilter(Request request);
}
