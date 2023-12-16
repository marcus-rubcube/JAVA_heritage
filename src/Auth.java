public abstract interface Auth {
    public abstract void setPassword(int password);
    public abstract boolean authentication(int password);
}
