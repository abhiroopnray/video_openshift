package in.testbed.rest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.Set;

@ApplicationPath("")
public class JaxRsActivator extends Application {
    /* class body intentionally left blank */
    @Override
    public Set<Class<?>> getClasses() {

        return Collections.emptySet();
    }
}