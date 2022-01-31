package designPattern.iterator;

public class EmpListIterator implements Iterator {
    private EmpList empl;
    private int index;

    public EmpListIterator(EmpList empl) {
        this.empl = empl;
        this.index = 0;
    }
    
    public boolean hasNext() {
        if (index < empl.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        return empl.getEmpByIndex(index++);
    }
}