class User implements EventListener {
    private String name;
    private String city;

    public User(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public void update(String data) {
        System.out.println("Уведомление для " + name + ": " + data);
    }
}
