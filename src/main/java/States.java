public enum States {
    Delaware(0.0),
    Pennsylvania(0.04),
    Maryland(0.05),
    Virginia(0.06);

    private double taxRate;

    void StateTax(double taxRate) {
        this.taxRate = taxRate;
    }

    States(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}

