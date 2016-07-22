package com.Iterator;

import java.util.Vector;

/**
 * Created by toryang on 7/18/16.
 */
public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();
    public int cursor = 0;

    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()){
            result = this.vector.get(this.cursor++);
        }else {
            result = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
