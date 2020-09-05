package ru.fella.learn.patterns.behavioral.chain_of_responsibility;

import java.util.Map;

/**
 * @author fellaru
 */
public class AuthorizationFilter implements Filter {
    //Это кривое решение, но я практикуюсь в паттернах, а не в реализации механизмов авторизации и аутентификации
    Map<Integer, Role> idAndRole = Map.of(
            44,Role.VIEWER,
            3,Role.ADMIN,
            8,Role.VIEWER,
            10,Role.VIEWER,
            53,Role.ADMIN
    );

    private Filter next;

    public AuthorizationFilter(Filter next) {
        this.next = next;
    }

    public AuthorizationFilter() {
    }

    @Override
    public boolean doFilter(Request request) {
        if (!doFilterAuthorization(request)){
            return false;
        } else if(next != null){
            return next.doFilter(request);
        } else {
            return true;
        }
    }

    private boolean doFilterAuthorization(Request request){
        Role userRole = idAndRole.get(request.getId());
        return (userRole != null &&
                (userRole.equals(Role.ADMIN)
                        || userRole.equals(Role.VIEWER) && HttpMethod.GET.equals(request.getMethod())));
    }
}
