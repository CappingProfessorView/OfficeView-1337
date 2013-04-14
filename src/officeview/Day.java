/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

/**
 *
 * @author Mike
 */
public class Day{
    
  private TimeNode times;

  public Day(){
    times = null;
  }

  public Day(TimeNode t){
    times = t;
  }

  public TimeNode getTimes(){
    return times;
  }

  public void setTimes(TimeNode t){
    times = t;
  }

  public void clear(){
    times = null;
  }
}
