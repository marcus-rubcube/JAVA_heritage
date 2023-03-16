public class tryOfficial {
    public static void main(String[] args) {
        Official marcus = new Official();
        marcus.setName("Marcus Ramos");
        marcus.setCpf("222.222.222-22");
        marcus.setSalary(2600.00);

        System.out.println(marcus.getName());
        System.out.println(marcus.getBonus());
    }
}
