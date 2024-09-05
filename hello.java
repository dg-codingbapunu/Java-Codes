
  class computer
  {
  public void playMusic() 
    {
System.out.println("music play..");
    }
    public String getPen(int cost) 
    {

if (cost >=10) {
  return "pen";
} else {
  return "nothing";
}

     
    }
  }
  
  
  
  
  public class Hello 
  {
  public static void main(String[] args) 
  {

computer obj = new computer();
obj.playMusic();
 String str = obj.getPen(5);
 System.out.println(str);
    
  }
 }