public class Visit {
    private Pelanggan customer;
    private double serviceExpense;
    private double productExpense;

    public Visit(Pelanggan customer, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double serviceDiscount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = DiscountRate.getProductDiscountRate();

        double totalServiceExpense = serviceExpense * (1 - serviceDiscount);
        double totalProductExpense = productExpense * (1 - productDiscount);

        return totalServiceExpense + totalProductExpense;
    }
}
