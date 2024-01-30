public class SalonTest {

    public static void main(String[] args) {
        Pelanggan premiumCustomer = new Pelanggan("Moriarty", "Premium");
        Visit visit1 = new Visit(premiumCustomer, 100.0, 50.0);

        System.out.println("Total pengeluaran untuk " + premiumCustomer.getName() + " sebagai " + premiumCustomer.getMemberType() + " member: $" + visit1.getTotalExpense());

        Pelanggan goldCustomer = new Pelanggan("Kafka", "Gold");
        Visit visit2 = new Visit(goldCustomer, 80.0, 40.0);

        System.out.println("Total pengeluaran untuk " + goldCustomer.getName() + " sebagai " + goldCustomer.getMemberType() + " member: $" + visit2.getTotalExpense());

        Pelanggan silverCustomer = new Pelanggan("Murakami", "Silver");
        Visit visit3 = new Visit(silverCustomer, 60.0, 30.0);

        System.out.println("Total pengeluaran untuk " + silverCustomer.getName() + " sebagai " + silverCustomer.getMemberType() + " member: $" + visit3.getTotalExpense());
    }
}
