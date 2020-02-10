public class Calculator {

//    private String name;
//    private Integer age;
//    private double weight;
//
//    public Bear(String name, Integer age, double weight){
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//
//public String getName(){
//    return this.name;
//}
    private int number1;
    private int number2;
    private double number3;
    private double number4;

    public static int add(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }

    public static int subtract(int number1, int number2){
        int result = number1 - number2;
        return result;
    }

    public static int multiply(int number1, int number2){
        int result = number1 * number2;
        return result;
    }

    public static double divide(double number3, double number4){
        double result = number3 / number4;
        return result;
    }

}
