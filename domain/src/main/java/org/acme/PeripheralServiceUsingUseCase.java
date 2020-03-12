package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class PeripheralServiceUsingUseCase {

    @Inject
    PeripheralService peripheralService;

    public String doSomeUseCaseStuff() {
        return peripheralService.get();
    }
}
