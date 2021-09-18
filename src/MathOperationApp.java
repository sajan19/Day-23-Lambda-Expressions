public class MathOperationApp {
   @FunctionalInterface
    interface IMathFunction{
        int calculate(int a, int b);
        static void printResult(int a, int b, String function , IMathFunction fobj){
            System.out.println("Result of "+ function+" is "+fobj.calculate(a, b));
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Lambda Expressions");
//        IMathFunction add =(int a , int b) -> a+b;
        IMathFunction add= Integer::sum;
        IMathFunction multiply = (x,y)-> x*y;
        IMathFunction divide = (int x, int y)-> x/y;
        IMathFunction subtract = (int x, int y)-> x/y;
        //Add, Multiply and Divide Two Numbers using Lambda Expressions
        System.out.println("Addition of Two Numbers is: "+ add.calculate(23,67));
        System.out.println("Subtraction of Two Numbers is: "+ subtract.calculate(123,67));
        System.out.println("Multipication of Two Numbers is: "+ multiply.calculate(23,67));
        System.out.println("Division of Two Numbers is: "+ divide.calculate(323,67));

        //Passing Lambda Expressions as Function Parameter to Print Result using Static Function
        IMathFunction.printResult(34,56, "Addition", add);
        IMathFunction.printResult(134,56, "Subtraction", subtract);
        IMathFunction.printResult(34,56, "Multiplication", multiply);
        IMathFunction.printResult(134,56, "Division", divide);
    }
}
