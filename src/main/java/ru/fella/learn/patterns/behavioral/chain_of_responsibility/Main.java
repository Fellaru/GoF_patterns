package ru.fella.learn.patterns.behavioral.chain_of_responsibility;

/**
 * @author fellaru
 */
public class Main {
    public static void main(String[] args) {
        Filter filterChain = new AuthorizationFilter(new AuthenticationFilter(new IdentificationFilter()));

        Request request = new Request(HttpMethod.GET, 3,"bkdf`7@");
        Request request2 = new Request(HttpMethod.GET, 90,"bkdf`7@");


        System.out.println(filterChain.doFilter(request));
        System.out.println(filterChain.doFilter(request2));
    }
}
