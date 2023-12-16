public class InternalSystem {
    private int password = 2222;
    public void authentication(Auth person) {
        boolean auth =  person.authentication(password);
        if(auth){
            System.out.println("Authentication success");
        } else {
            System.out.println("Authentication failed");
        }
    }
}
