import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class Euler2Test {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Euler2.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }


    @Test
    public void shouldAdd5To5AndReturn0() {
        // given
        int a = 0;
        int b = 1;

        //when
        int c = a +b;

        //then

    }

    @Test
    public void shouldAdd0To5AndReturn1() {
        // given
        int a = 1;
        int b = 1;

        //when
        int c = a + b;


    }
}
