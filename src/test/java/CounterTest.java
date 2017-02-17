import SimpleStateful.Counter;
import junit.framework.TestCase;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by HungBang on 2/17/2017.
 */
public class CounterTest extends TestCase {

    public void test() {
//        final Context context = EJBContainer.createEJBContainer().getContext();
        try {
            final Context context =  new InitialContext();
            Counter counterA = (Counter) context.lookup("java:global/EJDContainerExample/Counter");
            assertEquals(0, counterA.count());
            assertEquals(0, counterA.reset());
            assertEquals(1, counterA.increment());
            assertEquals(2, counterA.increment());
            assertEquals(0, counterA.reset());

            counterA.increment();
            counterA.increment();
            counterA.increment();
            counterA.increment();

            assertEquals(4, counterA.count());
            // Get a new counter
            Counter counterB = (Counter) context.lookup("java:global/EJDContainerExample/Counter");

            // The new bean instance starts out at 0
            assertEquals(0, counterB.count());
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
