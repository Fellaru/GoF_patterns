package ru.fella.learn.patterns.behavioral.strategy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fellaru
 */
public class BasicSubscription implements Strategy {
    private Set<String> allowedContent = initAllowedContent();

    @Override
    public void execute(String contentName) {
        boolean isAllowedPlay = allowedContent.contains(contentName);
        String end = isAllowedPlay ? " is allowed" : " is don't allowed.";
        System.out.println("In Basic Subscription play " + contentName + end);
    }

    private Set<String> initAllowedContent() {
        Set<String> allowedContent = new HashSet<>();
        allowedContent.add("A Bar in Amsterdam");
        allowedContent.add("Animal I Have Become");

        return allowedContent;
    }
}
