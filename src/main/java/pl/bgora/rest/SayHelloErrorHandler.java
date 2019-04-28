package pl.bgora.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.ServiceActivator;

public class SayHelloErrorHandler {

    private static final Logger LOG = LoggerFactory.getLogger(SayHelloErrorHandler.class);

    @ServiceActivator
    public void handleError(final Exception exception) throws SayHelloException {
        LOG.error(exception.getMessage(), exception);
        throw new SayHelloException("Error durring Say Hello!", exception);
    }
}
