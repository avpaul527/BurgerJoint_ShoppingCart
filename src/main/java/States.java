public enum States {
    Delaware(0.0),
    Pennsylvania(0.04),
    Maryland(0.05),
    Virginia(0.06);

    private final double taxRate;

    StateTax(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}

