public class MultiTable5 extends Thread {
 int count;
 MultiTable5(int count){
 this.count=count;
 }
 public void run() {
 for (int i=0;i<=count;i++){
 System.out.println("5 x "+i+" = "+(5*i));
 }
 }
}
