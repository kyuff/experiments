package dk.kyuff.arquillian.ping;

import javax.ejb.Stateless;

/**
 * User: swi
 * Date: 04/07/14
 * Time: 21.35
 */
@Stateless
public class PingServiceImpl implements PingService {
    @Override
    public String pong(String ball) {
        return "Ping pong \"" + ball + "\"";
    }
}
