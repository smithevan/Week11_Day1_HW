public class WaterBottle {

//    private String name;
//    private Integer age;
//    private double weight;
//
//    public Bear(String name, Integer age, double weight){
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//    }
//    public String getName(){
//        return this.name;
//    }

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drink(){
        int newVolume = this.volume - 10;
        return newVolume;
    }




}
