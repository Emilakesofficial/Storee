public class Manager extends People{
    public Manager(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
