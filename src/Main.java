public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("какой-то номер1 ", "Google ", 136);
        Phone phone2 = new Phone("какой-то номер2 ", "Apple ", 110);
        Phone phone3 = new Phone("какой-то номер3 ", "Samsung ", 141);
        System.out.println(phone1.number + phone1.model + phone1.weight);
        System.out.println(phone2.number + phone2.model + phone2.weight);
        System.out.println(phone3.number + phone3.model + phone3.weight);
        phone1.receiveCall("Арина");
        phone2.receiveCall("Таня");
        phone3.receiveCall("Саша");
        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();
        phone1.receiveCall("Даня ", "представим что здесь какой-то номер телефона1");
        phone1.receiveCall("Мама ", "представим что здесь какой-то номер телефона2");
        phone1.receiveCall("Маша ", "представим что здесь какой-то номер телефона3");
        phone1.sendMessage(new int[]{325446,45653,4646});
    }
}