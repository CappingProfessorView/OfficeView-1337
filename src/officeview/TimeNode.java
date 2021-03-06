/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import java.text.DecimalFormat;

/**
 *
 * @author Mike
 */
public class TimeNode{
   
  private String periodIn, periodOut,hourIn, minIn, hourOut, minOut;
  private TimeNode next;
  //DecimalFormat minFormat = new DecimalFormat ("###00");
  
  public TimeNode(){
    hourIn = "";
    minIn = "";
    periodIn = "";
    hourOut = "";
    minOut = "";
    periodOut = "";
  }

  public TimeNode(String hourIn, String minIn, String periodIn, String hourOut, String minOut, String periodOut){
    this.hourIn = hourIn;
    this.minIn = minIn;
    this.periodIn = periodIn;
    this.hourOut = hourOut;
    this.minOut = minOut;
    this.periodOut = periodOut;
    this.next = null;
  }
  
  public String getHourIn(){
    return hourIn;
  }

  public String getMinIn(){
    //String.format("%[B]02d[/B]",
    return minIn;
  }

  public String getPeriodIn(){
    return periodIn;
  }
  
  public String getHourOut(){
    return hourOut;
  }

  public String getMinOut(){
    return minOut;
  }

  public String getPeriodOut(){
    return periodOut;
  }

  public void setHourIn(String n){
    hourIn = n;
  }

  public void setMinIn(String n){
    minIn = n;
  }

  public void setPeriodIn(String n){
    periodIn = n;
  }

  public void setHourOut(String n){
    hourOut = n;
  }

  public void setMinOut(String n){
    minOut = n;
  }

  public void setPeriodOut(String n){
    periodOut = n;
  }
  
  public TimeNode getNext(){
    return next;
  }
  
  public void setNext(TimeNode next){
    this.next = next;
  }
  
  /**
   * Adds a new node into the linked list immediately after the calling node.
   * @param a new TimeNode
   */
  public void insertAfter(TimeNode toInsert){
    TimeNode old = this.getNext();
    this.setNext(toInsert);
    toInsert.setNext(old);
  }
  /**
   * Removes the node immediately after the calling node from the list.
   */
  public void deleteAfter(){
    this.next = next.next;
  }
  
  public int getSize(){
    int size = 0;
    TimeNode current = this;
    while(current != null){
      size++;
      current = current.next;
    }
    return size;
  }
  
  /**
   * Returns the last node in the list.
   * @return TimeNode at end of list
   */
  public TimeNode getLast(){
    TimeNode current = this;
    while(current.getNext() != null)
      current = current.next;
    return current;
  }
  
  /**
   * Adds a new node to end of list.
   * @param int to be stored in the new node
   */
  public void add(String hin, String min, String pin, String hout, String mout, String pout){
    TimeNode next = new TimeNode(hin, min, pin, hout, mout, pout);
    getLast().setNext(next);
  }
  @Override
  /**
   * Modifies the printing of a node.
   * @return String containing desired text to be outputed by print and println calls
   */
  public String toString(){
    String times = "";
    int size = 0;
    TimeNode current = this;
    while(current != null){
      times += current.getHourIn() + ":" + current.getMinIn() + " " + current.getPeriodIn() + " - " +
        current.getHourOut() + ":" + current.getMinOut() + " " + current.getPeriodOut()+"<br>";
      size++;
      current = current.next;
      //System.out.println(String.format("%[B]02d[/B]", x));  
    }
    return times;
  }
}