package oopsexample.constructor;

public class TestVipCustomer {
    public static void main(String[] args) {
        VipCustomer vip = new VipCustomer();
        System.out.println("name is " + vip.getName() + " credit Limit " + vip.getCreditLimit() + " email "
                + vip.getEmail());
        VipCustomer vip2 = new VipCustomer("Mark", 2000);
        System.out.println("name is " + vip2.getName() + " credit Limit " + vip2.getCreditLimit() + " email "
                + vip2.getEmail());
        VipCustomer vip3 = new VipCustomer("Lisa", 3000, "lisa@mail.com");
        System.out.println("name is " + vip3.getName() + " credit Limit " + vip3.getCreditLimit() + " email "
                + vip3.getEmail());
    }
}
