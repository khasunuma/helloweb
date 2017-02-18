package jp.coppermine.samples.helloweb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("hello")
@RequestScoped
public class HelloResource {

    @Inject
    private HelloBean bean;
    
    @GET
    @Produces({"text/html", "text/plain"})
    public String getAsPlain() {
        return bean.say();
    }
    
    @GET
    @Produces({"application/xml", "application/json"})
    public KeyValue getAsXML() {
        return new KeyValue("message", bean.say());
    }
    
}
