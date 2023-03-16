public class tryManager {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setName("Marcus Ramos");
        m1.setCpf("111.111.111-11");
        m1.setSalary(5000.00);
        m1.setPassword(2222);

        System.out.println(m1.getName());
        System.out.println(m1.getCpf());
        System.out.println(m1.getSalary());

        boolean authentication = m1.authentication(2222);
        System.out.println(authentication);
        System.out.println(m1.getBonus());
    }
}
