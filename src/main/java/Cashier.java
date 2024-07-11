public class Cashier extends People{
    public Cashier(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
