// reverse an array

public class Hello {

  public static void main(String[] args) {
    
int n = 7;


    for (int i = 0; i < n; i++){

      StringBuilder row = new StringBuilder();
      
      
      
      // space
      
      for (int j = 0; j < n-i-1; j++){
          row.append(" ");
      }
      for (int j = 0; j < 2*i+1; j++){
          row.append("*");
      }
      System.out.println(row);
      
      }
      
      // 2nd pattern
      for (int i = 0; i < n; i++){
      
      StringBuilder row = new StringBuilder();
      
      
      
      // space
      
      for (int j = 0; j < i; j++){
          row.append(" ");
      }
      for (int j = 0; j <2*n- (2*i+1); j++){
          row.append("*");
      }
      System.out.println(row);
      
      }
      

  }
}
