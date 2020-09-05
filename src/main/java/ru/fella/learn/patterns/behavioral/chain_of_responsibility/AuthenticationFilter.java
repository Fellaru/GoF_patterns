package ru.fella.learn.patterns.behavioral.chain_of_responsibility;

import java.util.Map;

/**
 * @author fellaru
 */
public class AuthenticationFilter implements Filter {
    //Это кривое решение, но я практикуюсь в паттернах, а не в реализации механизмов авторизации и аутентификации
    Map<Integer, String> idAndPasswords = Map.of(
            44,"hvhch",
            3,"bkdf`7@",
            8,"XDFG*6",
            10,"BBJS)))",
            53,"password"
    );

    private Filter next;

    public AuthenticationFilter(Filter next) {
        this.next = next;
    }

    public AuthenticationFilter() {
    }

    @Override
    public boolean doFilter(Request request) {
        if (!doAuthenticationFilter(request)){
            return false;
        } else if(next != null){
            return next.doFilter(request);
        } else {
            return true;
        }
    }

    private boolean doAuthenticationFilter(Request request){
        return idAndPasswords.get(request.getId()).equals(request.getPassword());
    }
}
