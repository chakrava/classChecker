/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classschedule;

import java.text.ParseException;
import java.util.List;
import javax.swing.SwingWorker;

/**
 *
 * @author Chaos
 */
public class dataWorker extends SwingWorker<List<Course>,Void>{
    private int year,semester;
    
    public dataWorker(int yr, int sem){
        year=yr;
        semester=sem;
    }
    
    @Override
    protected List<Course> doInBackground() throws ParseException{
        List<Course> temp=getClassData.getData(year, semester);//,inputRoom.getText());
        return temp;
    }
    
}
