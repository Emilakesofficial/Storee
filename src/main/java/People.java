public class People implements PeopleActivities {
    protected String name;
    protected String sex;
    protected int age;

    public People(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void hireCashier(Cashier cashier) {
        if (cashier.getAge() < 18 ) {
            System.out.println("WE'RE SORRY " + cashier.getName() + "," + " YOU'RE NOT ELIGIBLE FOR THIS ROLE.");
        }else if (cashier.getAge() >= 18 && cashier.getAge() <= 26) {
            System.out.println("CONGRATULATIONS " + cashier.getName() + "," + " YOU'VE BEEN HIRED!");
        }else {
            System.out.println("DEAR " + cashier.getName() + "," + " YOUR AGE EXCEEDS THE AGE LIMIT FOR THIS ROLE!," +
                    " MAKING YOU INELIGIBLE" +
                    "," + "GOOD LUCK IN YOUR FUTURE APPLICATIONS");
        }

    }

    @Override
    public void printReceipt(Customer customer) {
        System.out.println("RECEIPTS FOR " + customer.getName());
        for (Product product : customer.getPurchasedItems()) {
            System.out.println("PRODUCT: " + product.getBrandName() +
                    " ||" + " PRICE:" + product.getPrice());
        }

    }
    @Override
    public void printMessage(Customer customer) {
        System.out.println("THANK YOU " + customer.getName()+ " FOR SHOPPING WITH US!");

    }
}
