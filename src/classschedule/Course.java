/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classschedule;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Chaos
 */
public class Course {
    
    static DateFormat tf = new SimpleDateFormat("h:mma");
    
    private String name;
    private String room;
    private String instructor;
    private Date start;
    private Date end;
    private String days;
    
    
    public Course(){
        
    }
    
    public Course(String n, String r, String in, String st, String ed, String d) throws ParseException{
        name=n;
        room=r;
        instructor=in;
        start=tf.parse(st);
        end=tf.parse(ed);
        days=d;
    }
    
    public String getName(){
        return name;
    }
    
    public String getRoom(){
        return room;
    }
    
    public String getInstructor(){
        return instructor;
    }
    
    public String getTime(){
        return tf.format(start)+"-"+tf.format(end);
    }
    
    public Date getStart(){
        return start;
    }
    
    public Date getEnd(){
        return end;
    }
    
    public String getDays(){
        return days;
    }
    
    public String toString(){
        return name+"\t"+instructor+"\t"+room+"\t"+days+"\t"+tf.format(start)+"-"+tf.format(end);
    }
}