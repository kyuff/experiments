package dk.kyuff.arquillian.greet;

import dk.kyuff.arquillian.ping.PingService;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * User: swi
 * Date: 04/07/14
 * Time: 21.20
 */
@Stateless
public class GreetServiceImpl implements GreetService {

    @Inject
    PingService pingService;
    @Override
    public String greet(String name) {
        return pingService.pong(name);
    }
}
