package com.epam.rd.autotasks;
import java.util.*;

public class CarouselRun {
    private final int[] container;
    private int i;
    private int sum = 0;

    public CarouselRun (int[] container, int counter) {
        this.container = Arrays.copyOf(container, container.length);
        i = counter;
        for (int elem : container ) {
            sum += elem;
        }
    }

    public int next() {
      if (isFinished()) {  
            return -1;
        }
        if (i == container.length) {
            i = 0;
        }
        while (container[i] == 0) {
            i++;
            if (i == container.length) {
                i = 0;
            }
        }
        sum--;
        return container[i++]--;
    }

    public boolean isFinished() {
       return sum == 0;
    }

}
