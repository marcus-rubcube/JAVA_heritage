public class BonusControl {
    private double sum;

    public void registra(Official f){
        double bonus = f.getBonus();
        this.sum += bonus;
    }

    public double getSum() {
        return sum;
    }
}
