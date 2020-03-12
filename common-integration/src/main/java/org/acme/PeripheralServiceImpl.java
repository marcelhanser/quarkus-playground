package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PeripheralServiceImpl implements PeripheralService {
    @Override
    public String get() {
        return "hello";
    }
}
