package designPattern.iterator;

import java.util.ArrayList;

public class EmpList implements Aggregate {
    private ArrayList<Employee> emplist;

    public EmpList() {
        this.emplist = new ArrayList<>();
    }

    public void addEmpliyee(Employee emp) {
        emplist.add(emp);
    }
    
    public int getLength() {
        return emplist.size();
    }

    public Employee getEmpByIndex(int index) {
        return emplist.get(index);
    }

    public Iterator iterator() {
        return new EmpListIterator(this);
    }
}