/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classschedule;

import java.util.Date;

/**
 *
 * @author Chaos
 */
public class dateThing {
    Date time;
    boolean swit;
    
    public dateThing(){
        
    }
    
    public dateThing(Date d,boolean s){
        time=d;
        swit=s;
    }
    
    public Date getTime(){
        return time;
    }
    
    public boolean swit(){
        return swit;
    }
}
