class LoginSystem {
    private String username = "admin";
    private String password = "java123";
    public boolean login(String user, String pass) {
        return user.equals(username) && pass.equals(password);
    }
}