package dk.kyuff.arquillian.ping;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(Arquillian.class)
public class PingServiceImplTest {

    @Deployment
    public static WebArchive createWAR() {
        WebArchive war = ShrinkWrap.create(WebArchive.class, "greeter.war")
                .addClasses(PingService.class, PingServiceImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsManifestResource(EmptyAsset.INSTANCE, "web.xml");

        System.out.println(war.toString());
        return war;
    }


    public static JavaArchive createDeployment() {
        JavaArchive jar = ShrinkWrap.create(JavaArchive.class, "greeter-service")
                .addClasses(PingService.class, PingServiceImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");

        System.out.println(jar.toString());
        return jar;
    }

    @Inject
    PingService pingService;

    @Test
    public void testPingPing() {
        // setup

        // execute
        String result = pingService.pong("ball");

        // verify
        assertEquals("ball", result);
    }

}