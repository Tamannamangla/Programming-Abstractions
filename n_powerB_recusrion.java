// calculating n to the power b

class Power{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b = sc.nextInt();
    int ans = power(n, b);
    System.out.println(ans);
  }
  public static int power(int n,int b){
    if(b == 0){
      return 1;
    }
    
    return n * power(n, b - 1);
   
  }
}
