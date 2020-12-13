package fop.w11part;

public class Main {
    public static void main(String[] args) {
        BusinessPenguin peter = new BusinessPenguin("Peter");
        BusinessPenguin paul = new BusinessPenguin("Paul");

        peter.setPartner(paul);
        paul.setPartner(peter);

        Customer petersCustomer = new Customer(peter);
        Customer paulsCustomer = new Customer(paul);
    }
}
