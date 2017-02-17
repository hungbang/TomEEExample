package SimpleStateful;

import javax.ejb.Stateful;

/**
 * Created by HungBang on 2/17/2017.
 */

@Stateful
public class Counter {
    private int count = 0;

    public int count(){
        return count;
    }

    public int increment(){
        return ++count;
    }

    public int reset(){
        return (count = 0);
    }

}
