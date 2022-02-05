package designPattern.factoryMethod.medicine;

import java.util.ArrayList;
import java.util.List;

import designPattern.factoryMethod.framework.Factory;
import designPattern.factoryMethod.framework.Product;

public class MedicineFactory extends Factory {
    private List owners = new ArrayList();

    public Product createProduct(String owner) {
        return new Medicine(owner);
    }

    public void registerProduct(Product medicine) {
        owners.add(((Medicine) medicine).getOwner());
    }
}