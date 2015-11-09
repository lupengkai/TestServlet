package bean;

import java.io.Serializable;

/**
 * Created by tage on 11/9/15.
 */
public class CounterBean implements Serializable {
    int count = 0;

    public CounterBean() {

    }

    public int getCount() {
        count++;
        return count;
    }

    public void setCount(int c) {
        count = c;
    }
}
