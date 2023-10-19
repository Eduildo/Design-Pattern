package pt.utad.mei.aps.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@SuppressWarnings("rawtypes")
public abstract class Pool<T> {
    private int size;
    protected BlockingQueue objects;

    public Pool(int size) {
        this.size = size;
        init();
    }

    private void init() {
        objects = new LinkedBlockingQueue();
        for (int i = 0; i < size; i++) {
            addObj();
        }
    }

    public abstract void addObj();

    public abstract T get();

    public abstract void leave(T t);
}
