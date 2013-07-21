package dk.kyuff.madplan.filter;

import javax.ws.rs.NameBinding;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * User: swi
 * Date: 19/07/13
 * Time: 20.32
 */
@NameBinding
@Retention(RetentionPolicy.RUNTIME)
public @interface MyBinding { }
