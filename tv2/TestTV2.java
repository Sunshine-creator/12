
package tv2;
public class TestTV2 {
  public static  void main  (String[] args){
      TV2 tv1 = new TV2();
      tv1.turnon();
      tv1.setChannel(30);
      tv1.setVolume(3);
      TV2 tv2 = new TV2();
      tv2.turnon();
      tv2.channelUp();
      tv2.channelUp();
      tv2.volumeUp();
      System.out.println("tv1's channel is " + tv1.channel + " and volume level is" + tv1.volumeLevel);
      System.out.println("tv2's channel is " + tv2.channel + " and volume level is" + tv2.volumeLevel);
      
  }
}
