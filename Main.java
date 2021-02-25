class Main {
  public static void main(String[] args) {
     {
    //RECURSION IS CALLING A METHOD WITHIN ITSELF
    int result = sum(10);
    System.out.println(result);

    int result1 = subtraction(10);
    System.out.println(result1);

    int result2 = division(10);
    System.out.println(result2);

    int result3 = multiplication(10);
    System.out.println(result3);
    }

    
    public static int merchandiseY(int x)
    {
      if (x == 1) return 1;
      else return x + merchandiseZ(x-1);
    }

    public static int exam1(int test1)
    {
   if (test1 == 0) return 0;
   else if (test1 == 1) return 2;
   else return 2 + bunnyEars(test1 - 1);
    }

  }

