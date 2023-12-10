public class TryReference {
    public static void main(String[] args) {
        Official m1 = new Manager(); // every manager is an official
        m1.setName("Marcus");
        m1.setSalary(5000);

        Official v = new VideoEditor();
        v.setSalary(1000);

        Official d = new Designer();
        d.setSalary(2100);

        BonusControl control = new BonusControl();
        control.registra(m1);
        control.registra(v);
        control.registra(d);

        System.out.println(control.getSum());

    }
}
