class  Calculator{

    int add(int a, int b)
    {
        return a+b;
    }

    int sub(int a, int b)
    {
        return a-b;
    }

    int mul(int a, int b)
    {
        return a*b;
    }
}



public class CalculatorTest {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int result =cal.add(5,5);
        System.out.println("Result : "+result);

        int result1 =cal.sub(10,5);
        System.out.println("Result : "+result1);

        int result2 = cal.mul(10,10);
        System.out.println("Result : "+result2);

    }

}

