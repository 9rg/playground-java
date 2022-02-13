package designPattern.composite;

public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public abstract void burn();

    public String toString() {
        return getName() + "(" + getSize() + "kg)";
    }


}