package com.kksk.kumuluzee.sample.jaxrs.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationScoped
@ApplicationPath("sample.app")
public class SampleApplication extends Application {

}
