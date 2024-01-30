public class InvoiceTest {

    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer(1, "Johan Liebert", 10);
        Customer customer2 = new Customer(2, "Dr. Tenma", 15);

        // Create invoices
        Invoice invoice1 = new Invoice(101, customer1, 1000);
        Invoice invoice2 = new Invoice(102, customer2, 1500);

        // Display invoice information
        System.out.println("Invoice 1:");
        System.out.println(invoice1);
        System.out.println("Amount after discount: " + invoice1.getAmountAfterDiscount());
        System.out.println();

        System.out.println("Invoice 2:");
        System.out.println(invoice2);
        System.out.println("Amount after discount: " + invoice2.getAmountAfterDiscount());
    }
}

