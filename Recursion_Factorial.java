class Factorial{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.In);
    int n = sc.nextInt();
    fact(n);
  }
  public static int fact(int n){
    if(n==1){
      return 1;
    }
    int f1 = fact(n-1);
    return n*f1;
  }
}
