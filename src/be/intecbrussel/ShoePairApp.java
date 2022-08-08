package be.intecbrussel;

public class ShoePairApp {
    public static void main(String[] args) {
        ShoePair nike = new ShoePair("Nike",false,"white", 41, 69.99);
        ShoePair timberLand = new ShoePair("TimberLand",true,"brown", 41, 219.99);
        ShoePair balenciaga = new ShoePair("Balenciaga",true,"black", 45, 429.99);
        ShoePair nike2 = new ShoePair("Nike",true,"white", 42,29.99);
        ShoePair timberLand2 = new ShoePair("TimberLand",true,"black", 39, 170);
        ShoePair balenciaga2 = new ShoePair("Balenciaga",false,"black", 45, 50);
        ShoePair nike3 = new ShoePair("Nike",true,"white", 41, 79.99);
        ShoePair timberLand3 = new ShoePair("TimberLand",true,"yellow", 41, 80);
        ShoePair balenciaga3 = new ShoePair("Balenciaga",false,"black", 37, 349.99);

        ShoePair [] shoePairs = {nike,timberLand,balenciaga,nike2,timberLand2,balenciaga2,nike3,timberLand3,balenciaga3};

        for (ShoePair shoePair : shoePairs){
            if(shoePair.isComplete() && shoePair.getSize() == 41){
                System.out.println("Complete pairs sized 41:");
                System.out.println(shoePair);
                System.out.println("---------------------");
            }

        }
        int qtyNoPair = 0;
        double moneyLost = 0;
        System.out.println("Incomplete pairs:");
        for (ShoePair shoePair : shoePairs){
            if(!shoePair.isComplete()){
                System.out.println(shoePair);
                qtyNoPair++;
                moneyLost = shoePair.getPrice() + moneyLost;

            }
        }
        System.out.println("There are " + qtyNoPair + " incomplete pairs.");
        System.out.println("The amount of money lost because of this is " + moneyLost + ".");

    }
}
