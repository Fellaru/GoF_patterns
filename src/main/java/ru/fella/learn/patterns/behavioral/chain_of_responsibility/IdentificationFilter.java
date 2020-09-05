package ru.fella.learn.patterns.behavioral.chain_of_responsibility;

import java.util.List;

/**
 * @author fellaru
 */
public class IdentificationFilter implements Filter {
    //Это кривое решение, но я практикуюсь в паттернах, а не в реализации механизмов авторизации и аутентификации
    private List<Integer> listOfKnownId = List.of(44, 3, 8, 10, 53);

    private Filter next;

    public IdentificationFilter(Filter next) {
        this.next = next;
    }

    public IdentificationFilter() {
    }

    @Override
    public boolean doFilter(Request request) {
        if (!doFilterIdentification(request)){
            return false;
        } else if(next != null){
           return next.doFilter(request);
        } else {
            return true;
        }
    }

    private boolean doFilterIdentification(Request request){
        return listOfKnownId.contains(request.getId());
    }
}
