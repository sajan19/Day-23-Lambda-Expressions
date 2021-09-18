public class MathOperationApp {
   @FunctionalInterface
    interface IMathFunction{
        int calculate(int a, int b);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Lambda Expressions");
//        IMathFunction add =(int a , int b) -> a+b;
        IMathFunction add= Integer::sum;
        IMathFunction multiply = (x,y)-> x*y;
        IMathFunction divide = (int x, int y)-> x/y;
        //Add, Multiply and Divide Two Numbers using Lambda Expressions
        System.out.println("Addition of Two Numbers is: "+ add.calculate(23,67));
        System.out.println("Multipication of Two Numbers is: "+ multiply.calculate(23,67));
        System.out.println("Division of Two Numbers is: "+ divide.calculate(23,67));
    }
}
