package dk.kyuff.arquillian.greet;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * User: swi
 * Date: 04/07/14
 * Time: 21.48
 */
@ApplicationScoped
public class GreetResourceImpl implements GreetResource {

    @Inject
    GreetService greetService;

    @Override
    public String greet(String name) {
        return greetService.greet(name);
    }

    @Override
    public String hi() {
        return "Hi!";
    }
}
