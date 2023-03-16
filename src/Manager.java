public class Manager extends Official {
    private int password;

    public double getBonus(){
        return super.salary;
    }

    public boolean authentication(int password){
        if(this.password == password){
            return true;
        } else {
            return false;
        }
    }

    public void setPassword(int password){
        this.password = password;
    }
}
