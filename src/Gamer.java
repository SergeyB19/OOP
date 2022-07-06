public class Gamer extends Person {
    private String name;
    private int age;
    private int phoneNumber;
    private String platform;

    public Gamer(String name, int age, int phoneNumber, String platform) {
        super(name, age, phoneNumber);
        this.platform = platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
