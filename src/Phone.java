import java.lang.constant.Constable;

//создание класса
public class Phone {
    //пременные класса
    String number;
    String model;
    int weight;

    //конструктор с 3 переменными
    public Phone(String phonenumber, String phonemodel, int phoneweight){
        this(phonenumber,phonemodel);
        weight = phoneweight;
    }

    //конструктор с 2 переменными
    public Phone(String phonenumber, String phonemodel){
        number = phonenumber;
        model = phonemodel;
    }

    //пустой конструктор
    public Phone(){

    }

    //создание метода reciveCall
    public void receiveCall (String name){
        System.out.println("Звонит " +  name);
    }

    //создание метода getNumber
    public String getNumber(){
        System.out.println(this.number);
        return number;
    }

    //перегруженный метод reciveCall
    public void receiveCall(String name, String number){
        System.out.println("звонит "+ name + number );
    }
    //создание метода sendMessage
    public void sendMessage(int[] number) {
        System.out.println("Сообщения отправлены на номера:");
        for (int a : number) {
            System.out.println(a + ",");
        }

    }
}
