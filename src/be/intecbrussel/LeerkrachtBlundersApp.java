package be.intecbrussel;

public class LeerkrachtBlundersApp {
    public static void main(String[] args) {
        int [] studentPoints = {1, 5, 6,-9,77,110, -4, 3, 10, 2};

        for(int sp : studentPoints){
            if(sp > 10){
                sp = sp / 11;
            }
            if(sp < 0){
                sp = Math.abs(sp);
            }
            if(sp < 3){
                sp = sp * 3;
            }

            System.out.println(sp);
        }
    }
}
