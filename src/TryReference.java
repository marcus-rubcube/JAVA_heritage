public class TryReference {
    public static void main(String[] args) {
        Official m1 = new Manager(); // every manager is an official
        m1.setName("Marcus");
        m1.setSalary(5000);

        Official f = new Official();
        f.setSalary(2000);

        Official v = new VideoEditor();
        v.setSalary(1000);

        BonusControl control = new BonusControl();
        control.registra(m1);
        control.registra(f);
        control.registra(v);

        System.out.println(control.getSum());

    }
}
