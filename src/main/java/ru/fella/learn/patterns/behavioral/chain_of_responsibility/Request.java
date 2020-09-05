package ru.fella.learn.patterns.behavioral.chain_of_responsibility;


/**
 * @author fellaru
 */
public class Request {
    private final HttpMethod method;
    private final Integer id;
    private final String password;

    public Request(HttpMethod method, Integer id, String password) {
        this.method = method;
        this.id = id;
        this.password = password;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
