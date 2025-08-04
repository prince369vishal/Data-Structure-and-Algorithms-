public class StarPattern_04 {
  public static void main(String[] args){

    //Use another way
    for(int i=1; i<=5; i++){
      for(int j=1;j<=i;j++){
        System.out.print("  ");
      }
      for(int j=i;j<=5;j++){
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
