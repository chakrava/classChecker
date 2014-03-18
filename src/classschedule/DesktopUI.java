/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classschedule;

import java.awt.Component;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.joda.time.Interval;


/**
 *
 * @author Chaos
 */
public class DesktopUI extends javax.swing.JFrame {
    
    //Starting months for each semester
    private static final int SEM_FALL=8;
    private static final int SEM_SUM=5;
    private static final int SEM_SPR=2;
    private final long TIME_WARN=1800000;
    
    List<Course> courseList;
    

    /**
     * Creates new form ui
     */
    public DesktopUI() {
        initComponents();
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        inputGapLength.setVisible(false);
        comboStartTime.setVisible(false);
        comboEndTime.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        semesterGroup = new javax.swing.ButtonGroup();
        inputYear = new javax.swing.JTextField();
        inputRoom = new javax.swing.JTextField();
        labelClassroom = new javax.swing.JLabel();
        labelYear = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        radioSpring = new javax.swing.JRadioButton();
        radioFall = new javax.swing.JRadioButton();
        radioSummer = new javax.swing.JRadioButton();
        buttonSearch = new javax.swing.JButton();
        buttonWeb = new javax.swing.JButton();
        inputManualTime = new javax.swing.JTextField();
        boxManual = new javax.swing.JCheckBox();
        boxDisplayAll = new javax.swing.JCheckBox();
        boxGaps = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputClasses = new javax.swing.JTable();
        labelAuthor = new javax.swing.JLabel();
        inputManualDay = new javax.swing.JComboBox();
        labelDay = new javax.swing.JLabel();
        buttonHelp = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        inputGapLength = new javax.swing.JTextField();
        comboStartTime = new javax.swing.JComboBox();
        comboEndTime = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        semesterGroup.add(radioSpring);
        semesterGroup.add(radioFall);
        semesterGroup.add(radioSummer);
        initDate();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPSU Unofficial Class Checker (Beta)");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("classSchedFrame"); // NOI18N
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyPressedMainFrame(evt);
            }
        });

        inputYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputYearKeyPressed(evt);
            }
        });

        inputRoom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputRoomKeyPressed(evt);
            }
        });

        labelClassroom.setText("Classroom #");

        labelYear.setText("Year");

        labelTime.setText("Time");

        radioSpring.setText("Spring");

        radioFall.setText("Fall");

        radioSummer.setText("Summer");

        buttonSearch.setText("Search");
        buttonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSearchClicked(evt);
            }
        });

        buttonWeb.setText("Open in Browser");
        buttonWeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonWebClicked(evt);
            }
        });

        inputManualTime.setEnabled(false);
        inputManualTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputManualTimeActionPerformed(evt);
            }
        });
        inputManualTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputManualTimeKeyPressed(evt);
            }
        });

        boxManual.setText("Manual");
        boxManual.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                boxManualChanged(evt);
            }
        });
        boxManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxManualActionPerformed(evt);
            }
        });

        boxDisplayAll.setText("Display All Classes");
        boxDisplayAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDisplayAllActionPerformed(evt);
            }
        });

        boxGaps.setText("Find Gaps");
        boxGaps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxGapsMouseClicked(evt);
            }
        });

        outputClasses.setDefaultRenderer(Object.class, new CRender());
        outputClasses.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane3.setViewportView(outputClasses);

        labelAuthor.setText("By Erik Storla, estorla@spsu.edu");

        inputManualDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "T", "W", "R", "F" }));
        inputManualDay.setEnabled(false);
        inputManualDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputManualDayActionPerformed(evt);
            }
        });

        labelDay.setText("Day");

        buttonHelp.setText("Help");
        buttonHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHelpActionPerformed(evt);
            }
        });

        inputGapLength.setText("15");

        comboStartTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8:00am", "8:30am", "9:00am", "9:30am", "10:00am", "10:30am", "11:00am", "11:30am", "12:00pm", "12:30pm", "1:00pm", "1:30pm", "2:00pm", "2:30pm", "3:00pm", "4:00pm", "4:30pm", "5:00pm", "5:30pm", "6:00pm", "6:30pm", "7:00pm", "7:30pm", "8:00pm", "8:30pm", "9:00pm" }));

        comboEndTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8:00am", "8:30am", "9:00am", "9:30am", "10:00am", "10:30am", "11:00am", "11:30am", "12:00pm", "12:30pm", "1:00pm", "1:30pm", "2:00pm", "2:30pm", "3:00pm", "4:00pm", "4:30pm", "5:00pm", "5:30pm", "6:00pm", "6:30pm", "7:00pm", "7:30pm", "8:00pm", "8:30pm", "9:00pm" }));

        jLabel1.setText("Gaps of at least:");

        jLabel2.setText("minutes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonHelp)
                        .addGap(18, 18, 18)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAuthor))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelClassroom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputYear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioSpring)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioFall)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioSummer))
                            .addComponent(labelYear))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTime))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputGapLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(labelDay))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxGaps)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxManual)
                                    .addComponent(inputManualDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(buttonSearch))
                                    .addComponent(buttonWeb, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputManualTime, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxDisplayAll))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSearch)
                    .addComponent(radioSpring)
                    .addComponent(radioFall)
                    .addComponent(radioSummer)
                    .addComponent(boxManual)
                    .addComponent(boxGaps))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelYear)
                    .addComponent(inputYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonWeb)
                    .addComponent(labelDay)
                    .addComponent(inputManualDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputGapLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClassroom)
                    .addComponent(inputRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputManualTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTime)
                    .addComponent(boxDisplayAll)
                    .addComponent(comboStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAuthor)
                    .addComponent(buttonHelp)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSearchClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSearchClicked
        try {
            //outputClasses.append("this");
            runClicked();
        } catch (ParseException ex) {
            Logger.getLogger(DesktopUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSearchClicked

    private void inputRoomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputRoomKeyPressed
        try {
            inputKeyPressed(evt);
        } catch (ParseException ex) {
            Logger.getLogger(DesktopUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputRoomKeyPressed

    private void inputYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputYearKeyPressed
        try {
            inputKeyPressed(evt);
        } catch (ParseException ex) {
            Logger.getLogger(DesktopUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputYearKeyPressed

    private void buttonWebClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonWebClicked
        int year=Integer.parseInt(inputYear.getText());
        String web = getClassData.getURL(year,getRadioInt(),inputRoom.getText());
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(web));
        } catch (IOException ex) {
            Logger.getLogger(DesktopUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonWebClicked

    private void boxManualChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_boxManualChanged
        inputManualTime.setEnabled(boxManual.isSelected());
        inputManualDay.setEnabled(boxManual.isSelected());
        //inputManualTime.setVisible(boxManualTime.isSelected());
    }//GEN-LAST:event_boxManualChanged

    private void keyPressedMainFrame(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyPressedMainFrame
        try {
            inputKeyPressed(evt);
        } catch (ParseException ex) {
            Logger.getLogger(DesktopUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_keyPressedMainFrame

    private void inputManualTimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputManualTimeKeyPressed
        try {
            inputKeyPressed(evt);
        } catch (ParseException ex) {
            Logger.getLogger(DesktopUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputManualTimeKeyPressed

    private void boxManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxManualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxManualActionPerformed

    private void inputManualDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputManualDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputManualDayActionPerformed

    private void inputManualTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputManualTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputManualTimeActionPerformed

    private void boxDisplayAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDisplayAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxDisplayAllActionPerformed

    private void buttonHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHelpActionPerformed
        JOptionPane.showMessageDialog(null, "Help coming soon (maybe)\n\nSend questions, comments, bug reports to:\nestorla@spsu.edu", "Coming soon", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonHelpActionPerformed

    private void boxGapsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxGapsMouseClicked
        //inputGapLength.setEnabled(boxGaps.isSelected());
        inputGapLength.setVisible(boxGaps.isSelected());
        //comboStartTime.setEnabled(boxGaps.isSelected());
        comboStartTime.setVisible(boxGaps.isSelected());
        //comboEndTime.setEnabled(boxGaps.isSelected());
        comboEndTime.setVisible(boxGaps.isSelected());
        jLabel1.setVisible(boxGaps.isSelected());
        jLabel2.setVisible(boxGaps.isSelected());
    }//GEN-LAST:event_boxGapsMouseClicked

    private void runClicked() throws ParseException{//do all the stuff the program does
        roomInputFormat();
        scrapeData();//outputClasses.append("this");
        DefaultTableModel classTable = updateTable();
        
        if(!boxGaps.isSelected())
            displayRooms(classTable);
        else
            checkGap();
        
        
        fillGap();
    }
    
    private void initDate(){//sets Semester/Year to current when first loading
        Calendar cal=Calendar.getInstance();//get current date
        int month=cal.get(Calendar.MONTH)+1;//get month+1, Jan is month 0 in Calendar
        int year=cal.get(Calendar.YEAR);//get year
        
        if(month>=SEM_FALL)//select semester button based off date
            radioFall.setSelected(true);
        else if(month>=SEM_SUM)
            radioSummer.setSelected(true);
        else
            radioSpring.setSelected(true);
        
        inputYear.setText(""+year);//set Year box
        
        //inputManualDay.setSelectedItem(dayOfWeek());//set Day box, doesn't work??
    }
    
    private Date getTimeNow() throws ParseException{//get current time and return it as Date object
        DateFormat tf = new SimpleDateFormat("h:mma");
        
        if(boxManual.isSelected())
            return tf.parse(inputManualTime.getText());
        
        String time;
        
        Calendar cal=Calendar.getInstance();
        String AMPM="AM";
        
        if(cal.get(Calendar.AM_PM)==1)
            AMPM="PM";
        
        time=cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+AMPM;
        return tf.parse(time);
    }
    
    private String getTimeNowString() throws ParseException{//get the current time and return it as a String
        DateFormat tf = new SimpleDateFormat("h:mma");
        return tf.format(getTimeNow());
    }
    
    private Date timeToDate(String time) throws ParseException{
        DateFormat tf = new SimpleDateFormat("h:mma");
        time=time.toUpperCase();
        
        //System.out.println("Passed "+time);
        Date theDate=tf.parse(time);
        //System.out.println("Date "+theDate);
        
        return theDate;
    }
    
    private void inputKeyPressed(java.awt.event.KeyEvent pressed) throws ParseException{
        if (pressed.getKeyChar()=='\n'){//if Enter is hit, run search
            runClicked();
        }
    }
    
    private void roomInputFormat(){//remove whitespace and capitilize room box
    String temp = inputRoom.getText();
    inputRoom.setText(temp.replaceAll(" ","").toUpperCase());
    }
    
    private DefaultTableModel updateTable() throws ParseException{
        DefaultTableModel classTable=makeTable();//setup the table
        return classTable;
    }
    
    private void scrapeData() throws ParseException{//get info and store as courseList
        int year=Integer.parseInt(inputYear.getText());
        
        progressBar.setValue(0);
        //int progress=0;
        progressBar.setIndeterminate(true);
        
        
        //List<Course> courseList = getClassData.getData(year,getRadioInt());//,inputRoom.getText());
        
        if(courseList==null||courseList.isEmpty()){
            List<Course> temp=getClassData.getData(year,getRadioInt());//,inputRoom.getText());
            courseList = temp;
        }
        progressBar.setIndeterminate(false);
        progressBar.setValue(progressBar.getMaximum());
        //fillDataRoom(year, classTable);
    }
    
    private void displayRooms(DefaultTableModel classTable) throws ParseException{
        
        for(int i=0;i<courseList.size();i++){
            //checkTimeColor(courseList.get(i));//Deprecated
            if(courseList.get(i).getRoom().contains(inputRoom.getText().toUpperCase())
                &&(boxDisplayAll.isSelected()//display all if "display all" is checked
                ||(checkTimeColor(courseList.get(i))!=0)//or if the class is coming up or in session
                ||(courseList.get(i).getDays().contains(inputManualDay.getSelectedItem().toString()))))//or if class takes place on day
                    classTable.addRow(dataFormat(courseList.get(i),true));//(inputRoom.getText().length()<=1)));//add class to table
        }
            
        if(outputClasses!=null && outputClasses.getRowCount()<1)//if no classes found
            classTable.addRow(new Object[]{"No classes found","","","","",0});//insert an empty row with message
        
        tableWidth();//adjust column widths to fit data
//        }
        //progressBar.setIndeterminate(false);
        //progressBar.setValue(progressBar.getMaximum());//progress bar completed
        
    }
    
//    private void fillDataRoom(int year, DefaultTableModel classTable) throws ParseException{//old method, fills table only with matching room numbers
//        //List<Course> courseList = getClassData.getData(year,getRadioInt(),inputRoom.getText());
//        courseList=getClassData.getData(year,getRadioInt());//,inputRoom.getText());
//        
//        for(int i=0;i<courseList.size();i++){
//            //checkTimeColor(courseList.get(i));//Deprecated
//            if(boxDisplayAll.isSelected()||//display all if "display all" is checked
//                (checkTimeColor(courseList.get(i))!=0)||//or if the class is coming up or in session
//                (courseList.get(i).getDays().contains(inputManualDay.getSelectedItem().toString())))//or if class takes place on day
//                    classTable.addRow(dataFormat(courseList.get(i),(inputRoom.getText().length()<=1)));//add class to table
//        }
//            
//        if(outputClasses.getRowCount()<1)//if no classes found
//            classTable.addRow(new Object[]{"No classes found","","","",0});
//        
//        tableWidth();//adjust column widths to fit data
////        }
//        progressBar.setIndeterminate(false);
//        progressBar.setValue(progressBar.getMaximum());
//    }
    
    private DefaultTableModel makeTable()//setups up the table's columns
    {
        DefaultTableModel classTable=(DefaultTableModel) outputClasses.getModel();//setup table
        
        classTable.setRowCount(0);
        classTable.setColumnCount(0);
        
        classTable.addColumn("Class");
        if(true||inputRoom.getText().length()<=1)
            classTable.addColumn("Room");
        classTable.addColumn("Instructor");
        classTable.addColumn("Days");
        classTable.addColumn("Time");
        classTable.addColumn("Color");//empty column to hold color data
        
        outputClasses.getColumnModel().getColumn(classTable.getColumnCount()-1).setMaxWidth(0);//make last column invisible, contains info the user doesn't need
        outputClasses.getColumnModel().getColumn(classTable.getColumnCount()-1).setMinWidth(0);
        outputClasses.getColumnModel().getColumn(classTable.getColumnCount()-1).setPreferredWidth(0);
        
        return classTable;
    }
    
    private Object[] dataFormat(Course c) throws ParseException{
        Object s[]={c.getName(),c.getInstructor(),c.getDays(),c.getTime(),checkTimeColor(c)};
        return s;
    }
    
    private Object[] dataFormat(Course c, boolean allData) throws ParseException{
        if(!allData)
            return dataFormat(c);
        Object s[]={c.getName(),c.getRoom(), c.getInstructor(),c.getDays(),c.getTime(),checkTimeColor(c)};
        return s;
    }
    
    private void tableWidth(){
        for(int col=0;col<outputClasses.getColumnCount()-1;col++){
            int width = 0;
            for (int row = 0; row < outputClasses.getRowCount(); row++) {
                TableCellRenderer renderer = outputClasses.getCellRenderer(row, col);
                Component comp = outputClasses.prepareRenderer(renderer, row, col);
                width = Math.max (comp.getPreferredSize().width, width);
                outputClasses.getColumnModel().getColumn(col).setPreferredWidth(width);
            }
        }
    }
    
//Deprecated method for setting color of table rows
//    private Color checkTimeColor(Course c) throws ParseException{
//        switch(checkTime(c)){
//            case 0:
//                return Color.BLACK;
//            case 1:
//                return Color.RED;
//            case 2:
//                return Color.ORANGE;
//            default:
//                return Color.BLACK;
//        }
//        
//    }
    
    
    private int checkTimeColor(Course c) throws ParseException{
        Date now=getTimeNow();//get current time
        inputManualTime.setText(""+getTimeNowString());
        
        if(!boxManual.isSelected())
            inputManualDay.setSelectedItem(dayOfWeek());//if Manual is not set, set Day to check to current day
        
        if(!c.getDays().contains(inputManualDay.getSelectedItem().toString()))//if the days of the class does not include the Day to check
            return 0;
        
        if(now.before(c.getStart())&&
                Math.abs(now.getTime()-(c.getStart().getTime()))<=TIME_WARN)//if class starts in <30 min, Yellow
            return 2;
        if(now.before(c.getStart())||
                now.after(c.getEnd())||
                now.equals(c.getStart())||
                now.equals(c.getEnd()))//if before or after class time, Black
            return 0;
        else//no other cases, class in session, return red
            return 1;
    }
    
    private List<Interval> fillGap(){//returns the gaps that a room is open
        
        List<Interval> temp=new ArrayList<>();
        //Clock();
        //List<> tempI = new ArrayList<>();
        List<Course> courses=new ArrayList<>();
        
        for(int i=0;i<courseList.size();i++){
            Course tempCourse= courseList.get(i);
            if(tempCourse.getRoom().contains(inputRoom.getText())
                    &&tempCourse.getDays().contains(inputManualDay.getSelectedItem().toString())){
                if(courses.size()>0){
                    boolean changed=false;
                    for(int j=0;j<courses.size()&&!changed;j++){
                        if(tempCourse.getStart().before(courses.get(j).getStart())
                                ||tempCourse.getStart().equals(courses.get(j).getStart())){
                            courses.add(j,tempCourse);
                            changed=true;
                        }
                        else{
                            courses.add(tempCourse);
                            changed=true;
                        }
                    }
                }
                else{//no courses in list yet
                    courses.add(tempCourse);
                }
            }
        }
        
        for(int i=0;i<courses.size();i++){
            System.out.println(courses.get(i)+"\n\t"+courses.get(i).getStart());
            //temp.add(new Interval(courses.get(i).getStart(),courses.get(i).getEnd()));
        }
        
        return temp;
    }
    
    private List<dateThing> checkGap() throws ParseException{
        List<Interval> roomGap = fillGap();
        //List<Gap> temp=new ArrayList<>();
        //List<dateThing> sched= new ArrayList<>();
        
        //get the start and end times of the window to check
        Date toCheckStart=timeToDate(comboStartTime.getSelectedItem().toString());
        Date toCheckEnd=timeToDate(comboEndTime.getSelectedItem().toString());
        
        //temp.add(new Gap(toCheckStart,toCheckEnd));//start with the entire window to check open
        
        int s1=0;//thsse hold the position of the earliest...
        int s2=1;//..and latest room times
        
        
        
        return null;
        
        //sched.add(new dateThing(toCheckStart,true));
        //sched.add(new dateThing(toCheckEnd,false));
        
        
//        for(int i=0;i<roomGap.size();i++){
//            boolean changed=false;
//            if(roomGap.get(i).getStart().compareTo(sched.get(s1).getTime())<=0){
//                ;
//            }
//                    
//                    
//            
//            for(int j=0;j<sched.size()&&!changed;j++){
//                if(toCheckStart.before(sched.get(j).getTime())
//                        ||toCheckStart.equals(sched.get(j).getTime())){
//                    sched.add(j,new dateThing(toCheckStart,true));
//                    changed=true;
//                }
//                
//                else{
//                    sched.add(new dateThing(toCheckStart,true));
//                    changed=true;
//                }
//            }
//        }
        
        
        
            
            
            
            
            
            
            
//            if(roomGap.get(i).getStart().compareTo(toCheckStart)<=0//if gap[i] start is before or at the start time
//                    &&roomGap.get(i).getEnd().compareTo(toCheckStart)>0){
//                sched.add(roomGap.get(i).getEnd());//add gap[i] end time as start of window
//                added=true;
//            }
//            else if(!added){
//                sched.add(toCheckStart);//add start time as start of window
//                added=true;
//            }
//            
//            if(!added
//                    &&roomGap.get(i).getEnd().compareTo(toCheckEnd)<=0//if gap[i] end is before end time
//                    &&roomGap.get(i).getStart().compareTo(toCheckEnd)>0){
//                sched.add(roomGap.get(i).getEnd());
//                added=true;
//            }
        
        //return sched;
    }
    
    
    
    private String dayOfWeek(){
        Calendar cal=Calendar.getInstance();//get current date
        int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
        
        //System.out.println("Day of week: "+dayOfWeek);
        
        switch (dayOfWeek){
        case 2://Monday
            return "M";
        case 3://Tuesday
            return "T";
        case 4://Wednesday
            return "W";
        case 5://Thursday
            return "R";
        case 6://Friday
            return "F";
        default:
            return "Æ";//dummy char
        }
        
    }
    
    private int getRadioInt(){
        if(radioSpring.isSelected())
            return SEM_SPR;
        if(radioFall.isSelected())
            return SEM_FALL;
        if(radioSummer.isSelected())
            return SEM_SUM;
        return 0;
    }
    
    private String getRadio(){//for lazy humans who can't figure out arbitrary numbers
        if(getRadioInt()==SEM_SPR)
            return "Spring";
        if(getRadioInt()==SEM_FALL)
            return "Fall";
        if(getRadioInt()==SEM_SUM)
            return "Summer";
        return "Bad Semester input";
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesktopUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopUI().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxDisplayAll;
    private javax.swing.JCheckBox boxGaps;
    private javax.swing.JCheckBox boxManual;
    private javax.swing.JButton buttonHelp;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonWeb;
    private javax.swing.JComboBox comboEndTime;
    private javax.swing.JComboBox comboStartTime;
    private javax.swing.JTextField inputGapLength;
    private javax.swing.JComboBox inputManualDay;
    private javax.swing.JTextField inputManualTime;
    private javax.swing.JTextField inputRoom;
    private javax.swing.JTextField inputYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAuthor;
    private javax.swing.JLabel labelClassroom;
    private javax.swing.JLabel labelDay;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelYear;
    private javax.swing.JTable outputClasses;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JRadioButton radioFall;
    private javax.swing.JRadioButton radioSpring;
    private javax.swing.JRadioButton radioSummer;
    private javax.swing.ButtonGroup semesterGroup;
    // End of variables declaration//GEN-END:variables
}
