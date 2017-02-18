package jp.coppermine.samples.helloweb;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class HelloBean {

    public String say() {
        return "Hello, world";
    }
    
}
