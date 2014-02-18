/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classschedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erik Storla, estorla@spsu.edu
 */

//https://banweb.spsu.edu/pls/PROD/schedule.disp_crse_by_subj?cterm_in=201305&csubj_in=ALL
//https://banweb.spsu.edu/pls/PROD/schedule.disp_crse_by_subj?cterm_in=YEARDT&csubj_in=ALL
//YEAR is year
//DT is month of semester starting
//  02 spring
//  08 fall
//  05 summer
public class getClassData {

    public static List<Course> getData(int year, int semester, String room) throws ParseException {
        return getTable(year,semester,room);
    }
    
    public static List<Course> getData(int year, int semester) throws ParseException{
        return getTable(year,semester, "");
    }
    
    public static String getURL(int year, int semester, String room){
        return getURL (year,semester);
    }
    
    private static String getURL(int year, int semester){
        return "https://banweb.spsu.edu/pls/PROD/schedule.disp_crse_by_subj?cterm_in="+year+"0"+semester+"&csubj_in=ALL";
    }
    
    public static int size(int yr, int sem) throws MalformedURLException, IOException{
        int count=0;
        
        URL schedule = new URL(getURL(yr,sem));
        
        URLConnection sched = schedule.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(sched.getInputStream()));
        String inputLine;
        
        while ((inputLine = in.readLine()) != null){
            count++;
        }
        return count;
    }
    
    private static List<Course> getTable(int yr, int sem, String rm) throws ParseException{
        List<Course> courseList=new ArrayList<Course>();
        //course[] courseList=new course[1];
        
        try {
            //URL schedule=new URL("https://banweb.spsu.edu/pls/PROD/schedule.disp_crse_by_subj?cterm_in=201305&csubj_in=ALL");
            URL schedule = new URL(getURL(yr,sem));
            //sched.openConnection();
            
            URLConnection sched = schedule.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(sched.getInputStream()));
            String inputLine;
            
            //int count=0;
            Course temp = new Course();
            
            while ((inputLine = in.readLine()) != null) {//read all of page
                //System.out.println(inputLine);//DEBUG, output web source to system
                //if(inputLine.contains("id=crn")&&inputLine.replaceAll(" ","").contains(rm.replaceAll(" ",""))){
                
                if(inputLine.contains("id=days")&&//only look at lines that contain class info
                        !(inputLine.contains("time>ONLINE"))&&//don't show online classes
                        !(inputLine.contains("time>TBA"))&&//don't show classes without valid times
                        inputLine.replaceAll(" ","").contains(rm)){//ignore whitespace when checking for room number
                    if(inputLine.contains("id=crn"))
                        courseList.add(courseInput(inputLine));//send line to input function for processing
                    else if(!(inputLine.contains("days>TBA"))&&
                            !inputLine.contains("days>ONLINE"))
                        courseList.add(courseInput(inputLine,temp));//no CRN, add using last class info
                    //System.out.println(rm+" "+inputLine);
                }
                //count++;
                
                if(inputLine.contains("id=days")&&//only look at lines that contain class info
                        !(inputLine.contains("time>ONLINE"))&&//don't show online classes
                        !(inputLine.contains("time>TBA"))){
                    if(inputLine.contains("id=crn"))
                        temp= courseInput(inputLine);
                }
            }
            in.close();
            
            //return courseList;
            //return "Works";//debug
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(getClassData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(getClassData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courseList;
    }
private static Course courseInput(String in,Course c) throws ParseException{//Pull missing data (name) from existing course
        String name;
        String room;
        String instructor;
        String start;
        String end;
        String days;
        
        
        String time;
        
        name=c.getName();
        
        room=in.substring(
                in.length()-25,
                in.indexOf("<",in.length()-25)
                );
        
        instructor=c.getInstructor();
        
        time=in.substring(in.indexOf("</td><td>16</td><td>")+20,in.indexOf("<",in.indexOf("</td><td>16</td><td>")+20));
        start=time.substring(0,time.indexOf(" "));
        end=time.substring(time.indexOf(" ")+2);
        
        days=in.substring(
                in.indexOf("=days")+6,
                in.indexOf("<",in.indexOf("=days")+6)
                ).replaceAll(" ","");
        
        Course temp = new Course(name,room,instructor,start,end,days);
        //System.out.println("Orig: "+c+"\n2nd:  "+temp+"\n");
        
        return new Course(name,room,instructor,start,end,days);
    }
    
    
    private static Course courseInput(String in) throws ParseException{
        String name;
        String room;
        String start;
        String end;
        String days;
        String instructor;
        
        String time;
        
        name=in.substring(
                in.indexOf("title")+6,
                in.indexOf("<",in.indexOf("title")+6)
                );
        
        room=in.substring(
                in.indexOf("id=loc")+7,
                in.indexOf("<",in.indexOf("id=loc")+7)
                );
        room=room.replaceAll(" ", "");
        
        instructor=in.substring(
                in.indexOf("id=inst")+8,
                in.indexOf("<",in.indexOf("id=inst")+8)
                );
        
        time=in.substring(in.indexOf("=time")+6,in.indexOf("<",in.indexOf("=time")));
        start=time.substring(0,time.indexOf(" "));
        end=time.substring(time.indexOf(" ")+2);
        
        days=in.substring(
                in.indexOf("=days")+6,
                in.indexOf("<",in.indexOf("=days")+6)
                ).replaceAll(" ","");
        
        return new Course(name,room,instructor,start,end,days);
    }
}
