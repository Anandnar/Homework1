public class Hypotenuse {
    public static void main(String[] args){
        double side1, side2, hypotenuse;
        //get the length of the first side
        System.out.println("Enter a value for Side 1: 5 ");
        side1 = 5;

        //get the length of the second side
        System.out.println("Enter a value for Side 2: 10 ");
        side2 = 10;

        //find the square root of (side1^2 + side2^2)
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.println("The length of the hypotenuse is: " + hypotenuse);
    }
}

