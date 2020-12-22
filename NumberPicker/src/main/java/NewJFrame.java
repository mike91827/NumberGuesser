
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;




public class NewJFrame extends javax.swing.JFrame {
    public Simulation runnable;
    public JLabel[] listOfLabels;
    public JLabel[] listsOfAnswerLabels;
    public JToggleButton[] listsOfAnswers;
    public Timer timer;
    public int dif;
    boolean wrong;
    public static int counter;
    boolean done;
    public NewJFrame(Simulation runnable, JLabel[] listOfLabels, JLabel[] listsOfAnswerLabels, JToggleButton[] listsOfAnswers, Timer timer, int dif, JButton jButton1, JLabel jLabel1, JLabel jLabel10, JLabel jLabel100, JLabel jLabel101, JLabel jLabel102, JLabel jLabel103, JLabel jLabel104, JLabel jLabel105, JLabel jLabel106, JLabel jLabel107, JLabel jLabel108, JLabel jLabel109, JLabel jLabel11, JLabel jLabel110, JLabel jLabel111, JLabel jLabel112, JLabel jLabel113, JLabel jLabel114, JLabel jLabel115, JLabel jLabel116, JLabel jLabel117, JLabel jLabel118, JLabel jLabel119, JLabel jLabel12, JLabel jLabel120, JLabel jLabel121, JLabel jLabel122, JLabel jLabel123, JLabel jLabel124, JLabel jLabel125, JLabel jLabel126, JLabel jLabel127, JLabel jLabel128, JLabel jLabel129, JLabel jLabel13, JLabel jLabel130, JLabel jLabel131, JLabel jLabel132, JLabel jLabel133, JLabel jLabel134, JLabel jLabel135, JLabel jLabel136, JLabel jLabel137, JLabel jLabel138, JLabel jLabel139, JLabel jLabel14, JLabel jLabel140, JLabel jLabel141, JLabel jLabel142, JLabel jLabel143, JLabel jLabel144, JLabel jLabel145, JLabel jLabel146, JLabel jLabel147, JLabel jLabel148, JLabel jLabel149, JLabel jLabel15, JLabel jLabel150, JLabel jLabel151, JLabel jLabel152, JLabel jLabel153, JLabel jLabel154, JLabel jLabel155, JLabel jLabel156, JLabel jLabel157, JLabel jLabel158, JLabel jLabel159, JLabel jLabel16, JLabel jLabel160, JLabel jLabel161, JLabel jLabel162, JLabel jLabel163, JLabel jLabel164, JLabel jLabel165, JLabel jLabel166, JLabel jLabel167, JLabel jLabel168, JLabel jLabel169, JLabel jLabel17, JLabel jLabel170, JLabel jLabel171, JLabel jLabel172, JLabel jLabel173, JLabel jLabel174, JLabel jLabel175, JLabel jLabel176, JLabel jLabel177, JLabel jLabel178, JLabel jLabel179, JLabel jLabel18, JLabel jLabel180, JLabel jLabel181, JLabel jLabel182, JLabel jLabel183, JLabel jLabel184, JLabel jLabel185, JLabel jLabel186, JLabel jLabel187, JLabel jLabel188, JLabel jLabel189, JLabel jLabel19, JLabel jLabel190, JLabel jLabel191, JLabel jLabel192, JLabel jLabel193, JLabel jLabel194, JLabel jLabel195, JLabel jLabel196, JLabel jLabel197, JLabel jLabel198, JLabel jLabel199, JLabel jLabel2, JLabel jLabel20, JLabel jLabel21, JLabel jLabel22, JLabel jLabel23, JLabel jLabel24, JLabel jLabel25, JLabel jLabel26, JLabel jLabel27, JLabel jLabel28, JLabel jLabel29, JLabel jLabel3, JLabel jLabel30, JLabel jLabel31, JLabel jLabel32, JLabel jLabel33, JLabel jLabel34, JLabel jLabel35, JLabel jLabel36, JLabel jLabel37, JLabel jLabel38, JLabel jLabel39, JLabel jLabel4, JLabel jLabel40, JLabel jLabel41, JLabel jLabel42, JLabel jLabel43, JLabel jLabel44, JLabel jLabel45, JLabel jLabel46, JLabel jLabel47, JLabel jLabel48, JLabel jLabel49, JLabel jLabel5, JLabel jLabel50, JLabel jLabel51, JLabel jLabel52, JLabel jLabel53, JLabel jLabel54, JLabel jLabel55, JLabel jLabel56, JLabel jLabel57, JLabel jLabel58, JLabel jLabel59, JLabel jLabel6, JLabel jLabel60, JLabel jLabel61, JLabel jLabel62, JLabel jLabel63, JLabel jLabel64, JLabel jLabel65, JLabel jLabel66, JLabel jLabel67, JLabel jLabel68, JLabel jLabel69, JLabel jLabel7, JLabel jLabel70, JLabel jLabel71, JLabel jLabel72, JLabel jLabel73, JLabel jLabel74, JLabel jLabel75, JLabel jLabel76, JLabel jLabel77, JLabel jLabel78, JLabel jLabel79, JLabel jLabel8, JLabel jLabel80, JLabel jLabel81, JLabel jLabel82, JLabel jLabel83, JLabel jLabel84, JLabel jLabel85, JLabel jLabel86, JLabel jLabel87, JLabel jLabel88, JLabel jLabel89, JLabel jLabel9, JLabel jLabel90, JLabel jLabel91, JLabel jLabel92, JLabel jLabel93, JLabel jLabel94, JLabel jLabel95, JLabel jLabel96, JLabel jLabel97, JLabel jLabel98, JLabel jLabel99, JTextField jTextField1, JToggleButton jToggleButton17, JToggleButton jToggleButton18, JToggleButton jToggleButton19, JToggleButton jToggleButton2, JToggleButton jToggleButton20, JToggleButton jToggleButton21, JToggleButton jToggleButton22, JToggleButton jToggleButton23, JToggleButton jToggleButton24, JToggleButton jToggleButton25, JToggleButton jToggleButton26, JToggleButton jToggleButton27, JToggleButton jToggleButton28, JToggleButton jToggleButton29, JToggleButton jToggleButton30, JToggleButton jToggleButton31, JToggleButton jToggleButton32, JToggleButton jToggleButton33, JToggleButton jToggleButton34, JToggleButton jToggleButton35) throws HeadlessException {
        this.runnable = runnable;
        this.listOfLabels = listOfLabels;
        this.listsOfAnswerLabels = listsOfAnswerLabels;
        this.listsOfAnswers = listsOfAnswers;
        this.timer = timer;
        this.dif = dif;
        this.jButton1 = jButton1;
        this.jLabel1 = jLabel1;
        this.jLabel10 = jLabel10;
        
        
        
        
    }
    
    /**
     * Creates new form NewJFrame
     * @param difficulty
     */
    public NewJFrame(int difficulty) {
        done=false;
        counter=0;
        initComponents();
        jLabel199.setVisible(false);
        jButton2.setVisible(false);
        dif=difficulty; 
        //depending on difficulty get a certain amount o stataements 
        runnable= new Simulation((dif+1)*5);
        runnable.run();
        listOfLabels=new JLabel[99];
        listsOfAnswerLabels=new JLabel[99];
        listsOfAnswers= new JToggleButton[20];
        timer=new Timer();
        addLabels();
        addAnswers();
        addLabels2();
        wrong=false;
        if(dif==1){
            for (int i=0;i<10;i++){
                listsOfAnswers[i+10].setVisible(false);
            }
        } else if (dif==2){
             for (int i=0;i<5;i++){
                listsOfAnswers[i+15].setVisible(false);
            }
        }
        
        displayPossibleAnswers();
        change(runnable.getPossibilities());
        
        
         timer.schedule(task, 0, 1000); //1000 is 1
    }
    //code that involves timer
    int secondsPassed=0;
    boolean cont=true;
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
           secondsPassed++;
           jLabel200.setText(Integer.toString(secondsPassed/60)+":"+String.format("%02d", secondsPassed%60));
       if (cont) {
                
            
           if (done){
               jLabel199.setText(Integer.toString(secondsPassed/60)+":"+String.format("%02d", secondsPassed%60));
              cont=false;
           }
           else if(wrong){
               jLabel201.setText("    W R '(0 o 0)' N G");    //display wrong message for three seconds
               if (counter!=2){
                   counter++;
               } else {
                   counter=0;
                   wrong=false;
               }
           }
           else if(secondsPassed%6==0){
                jLabel201.setText("           -(0_0-)");
           } else if(secondsPassed%6==1){
                jLabel201.setText("           '(0_0')");
           } else if(secondsPassed%6==2){
                jLabel201.setText("           ('0_0)'");
           }else if(secondsPassed%6==3){
                jLabel201.setText("           (-0_0)-");
           }else if(secondsPassed%6==4){
                jLabel201.setText("           ('0_0)'");
           }else if(secondsPassed%6==5){
                jLabel201.setText("           '(0_0')");
           }
           }
        }
    };
   
    
    
    //when a certain buttotn is pressed, it checks to see if the user has the correct answer
    private void checkWin(){
        boolean correct=true;
        for(int i=0;i<listOfLabels.length;i++){
            if(!listOfLabels[i].getBackground().equals(listsOfAnswerLabels[i].getBackground())){
                correct=false;
               
            }
        }
        if (correct){
            jLabel201.setText("('0.0)'CORRECT");
            jLabel199.setVisible(true);
            jButton2.setVisible(true);
            done=true;
        } else if(!correct){
            jLabel201.setText("    W R '(0 o 0)' N G");
            wrong=true;
        }
    }

    //displays  all the statements we got from our  simulation class
    private void displayPossibleAnswers(){
        ArrayList <String> answers= runnable.getAnswers();
        Collections.shuffle(answers); 
        System.err.println(answers.size()+" jbdbasbh");
        for (int i=0;i<answers.size();i++){
            listsOfAnswers[i].setText(answers.get(i));
        }
    }
    
    
    //changes the labels with the numbers in the input parameter to color red
     public void change( ArrayList <Integer> p){
        
        for  (int i=0;i<99;i++){
            if ( !p.contains(i+1)){
                listOfLabels[i].setBackground(Color.red);
            }
           
        }
       
    }
    
     
     //when you press a button, this method determines what it doess
    public void readButton(String s){
        String sub = s.substring(0,15);
        
        int n=-1;
        switch (sub){
            case "These numbers h":
            
            if(s.length()==33){
                n=Integer.parseInt(s.substring(31,33));
                System.out.println(s.substring(31,33));
            } else if (s.length()==32){
                n=Integer.parseInt(s.substring(31,32));
                System.out.println(s.substring(31,32));
            } else {
                System.exit(0);
            }
            
            
            int choice=n;
                
            while (choice<100){

                invert(choice);
                choice=choice+n;
            }
            break;
            
            
            
            case "If you subtract":
                
            System.out.println("HERE -> " +sub+"  "+s.length());
            
            if(s.length()==64){
                n=Integer.parseInt(s.substring(62,64));
                
            } else if (s.length()==63){
                n=Integer.parseInt(s.substring(62,63));
               
            } else {
                System.exit(0);
            }
            System.err.println("HERE "+n);
            
           
            int p;
            for (int i=0;i<10;i++){
                p=i-n;
                if(p>=0&&p<10){
                    p=(i*10)+p;
                    System.out.println("HEREp "+p);
                    invert(p);
                }
            }
            break;
            
            case "If you add up t":
             System.out.println("HERE -> " +sub+"  "+s.length()); 
            
             if(s.length()==68){
                n=Integer.parseInt(s.substring(66,68));
                
            } else if (s.length()==67){
                n=Integer.parseInt(s.substring(66,67));
               
            } else {
                System.exit(0);
            }
            
             System.err.println("HEREaddasasas "+n);
             
             
            int t=0;
            int k;
            int po;


            while (t<=n){
                k=n-t;
                po=t+(k*10);

                if (t<10&&k<10) {
                
                    invert(po);
                 }
                t=t+1;
            }
            
            break;
            
            
            case "It's ten's digi":
                
                
                System.out.println("HERE -> " +sub+"  "+s.length()); 
            
             if (s.length()==21){
                n=Integer.parseInt(s.substring(20,21));
               
            } else {
                System.exit(0);
            }
            
             System.err.println("HEREsas "+n);
             n=n*10;
             int nten=n+10;
              while (n<nten){

                  invert(n);
                  n=n+1;
               }
                
            break;
            
            
            case "It's one's digi":
            if (s.length()==21){
                n=Integer.parseInt(s.substring(20,21));
               
            } else {
                System.exit(0);
            }
            
            while (n<100){

                invert(n);
                n=n+10;
            }
            break;
            
        }
      
        
    }
    
    
 //changes a labels background color between black and red
    private void invert(int i){
       
       if(i>0&&i<100){
         if (listsOfAnswerLabels[i-1].getBackground().equals(new Color(0,0,0))){
            
            listsOfAnswerLabels[i-1].setBackground(Color.RED);
            
        } else if (listsOfAnswerLabels[i-1].getBackground().equals(Color.RED)){
            listsOfAnswerLabels[i-1].setBackground(Color.BLACK);
            }
       }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jToggleButton28 = new javax.swing.JToggleButton();
        jToggleButton29 = new javax.swing.JToggleButton();
        jToggleButton30 = new javax.swing.JToggleButton();
        jToggleButton31 = new javax.swing.JToggleButton();
        jToggleButton32 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jToggleButton35 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("3");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("4");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("5");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("6");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("7");
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("8");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("9");
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("10");
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("11");
        jLabel11.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("12");
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("13");
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("14");
        jLabel14.setOpaque(true);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("15");
        jLabel15.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("16");
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("17");
        jLabel17.setOpaque(true);

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("18");
        jLabel18.setOpaque(true);

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("19");
        jLabel19.setOpaque(true);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("20");
        jLabel20.setOpaque(true);

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("21");
        jLabel21.setOpaque(true);

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("22");
        jLabel22.setOpaque(true);

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("23");
        jLabel23.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("24");
        jLabel24.setOpaque(true);

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("25");
        jLabel25.setOpaque(true);

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("26");
        jLabel26.setOpaque(true);

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("27");
        jLabel27.setOpaque(true);

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("28");
        jLabel28.setOpaque(true);

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("29");
        jLabel29.setOpaque(true);

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("30");
        jLabel30.setOpaque(true);

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("31");
        jLabel31.setOpaque(true);

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("32");
        jLabel32.setOpaque(true);

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("33");
        jLabel33.setOpaque(true);

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("34");
        jLabel34.setOpaque(true);

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("35");
        jLabel35.setOpaque(true);

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("36");
        jLabel36.setOpaque(true);

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("37");
        jLabel37.setOpaque(true);

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("38");
        jLabel38.setOpaque(true);

        jLabel39.setBackground(new java.awt.Color(0, 0, 0));
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("39");
        jLabel39.setOpaque(true);

        jLabel40.setBackground(new java.awt.Color(0, 0, 0));
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("40");
        jLabel40.setOpaque(true);

        jLabel41.setBackground(new java.awt.Color(0, 0, 0));
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("41");
        jLabel41.setOpaque(true);

        jLabel42.setBackground(new java.awt.Color(0, 0, 0));
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("42");
        jLabel42.setOpaque(true);

        jLabel43.setBackground(new java.awt.Color(0, 0, 0));
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("43");
        jLabel43.setOpaque(true);

        jLabel44.setBackground(new java.awt.Color(0, 0, 0));
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("44");
        jLabel44.setOpaque(true);

        jLabel45.setBackground(new java.awt.Color(0, 0, 0));
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("45");
        jLabel45.setOpaque(true);

        jLabel46.setBackground(new java.awt.Color(0, 0, 0));
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("46");
        jLabel46.setOpaque(true);

        jLabel47.setBackground(new java.awt.Color(0, 0, 0));
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("47");
        jLabel47.setOpaque(true);

        jLabel48.setBackground(new java.awt.Color(0, 0, 0));
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("48");
        jLabel48.setOpaque(true);

        jLabel49.setBackground(new java.awt.Color(0, 0, 0));
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("49");
        jLabel49.setOpaque(true);

        jLabel50.setBackground(new java.awt.Color(0, 0, 0));
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("50");
        jLabel50.setOpaque(true);

        jLabel51.setBackground(new java.awt.Color(0, 0, 0));
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("51");
        jLabel51.setOpaque(true);

        jLabel52.setBackground(new java.awt.Color(0, 0, 0));
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("52");
        jLabel52.setOpaque(true);

        jLabel53.setBackground(new java.awt.Color(0, 0, 0));
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("53");
        jLabel53.setOpaque(true);

        jLabel54.setBackground(new java.awt.Color(0, 0, 0));
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("54");
        jLabel54.setOpaque(true);

        jLabel55.setBackground(new java.awt.Color(0, 0, 0));
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("55");
        jLabel55.setOpaque(true);

        jLabel56.setBackground(new java.awt.Color(0, 0, 0));
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("56");
        jLabel56.setOpaque(true);

        jLabel57.setBackground(new java.awt.Color(0, 0, 0));
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("57");
        jLabel57.setOpaque(true);

        jLabel58.setBackground(new java.awt.Color(0, 0, 0));
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("58");
        jLabel58.setOpaque(true);

        jLabel59.setBackground(new java.awt.Color(0, 0, 0));
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("59");
        jLabel59.setOpaque(true);

        jLabel60.setBackground(new java.awt.Color(0, 0, 0));
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("60");
        jLabel60.setOpaque(true);

        jLabel61.setBackground(new java.awt.Color(0, 0, 0));
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("61");
        jLabel61.setOpaque(true);

        jLabel62.setBackground(new java.awt.Color(0, 0, 0));
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("62");
        jLabel62.setOpaque(true);

        jLabel63.setBackground(new java.awt.Color(0, 0, 0));
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("63");
        jLabel63.setOpaque(true);

        jLabel64.setBackground(new java.awt.Color(0, 0, 0));
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("64");
        jLabel64.setOpaque(true);

        jLabel65.setBackground(new java.awt.Color(0, 0, 0));
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("65");
        jLabel65.setOpaque(true);

        jLabel66.setBackground(new java.awt.Color(0, 0, 0));
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("66");
        jLabel66.setOpaque(true);

        jLabel67.setBackground(new java.awt.Color(0, 0, 0));
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("67");
        jLabel67.setOpaque(true);

        jLabel68.setBackground(new java.awt.Color(0, 0, 0));
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("68");
        jLabel68.setOpaque(true);

        jLabel69.setBackground(new java.awt.Color(0, 0, 0));
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("69");
        jLabel69.setOpaque(true);

        jLabel70.setBackground(new java.awt.Color(0, 0, 0));
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("70");
        jLabel70.setOpaque(true);

        jLabel71.setBackground(new java.awt.Color(0, 0, 0));
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("71");
        jLabel71.setOpaque(true);

        jLabel72.setBackground(new java.awt.Color(0, 0, 0));
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("72");
        jLabel72.setOpaque(true);

        jLabel73.setBackground(new java.awt.Color(0, 0, 0));
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("73");
        jLabel73.setOpaque(true);

        jLabel74.setBackground(new java.awt.Color(0, 0, 0));
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("74");
        jLabel74.setOpaque(true);

        jLabel75.setBackground(new java.awt.Color(0, 0, 0));
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("75");
        jLabel75.setOpaque(true);

        jLabel76.setBackground(new java.awt.Color(0, 0, 0));
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("76");
        jLabel76.setOpaque(true);

        jLabel77.setBackground(new java.awt.Color(0, 0, 0));
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("77");
        jLabel77.setOpaque(true);

        jLabel78.setBackground(new java.awt.Color(0, 0, 0));
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("78");
        jLabel78.setOpaque(true);

        jLabel79.setBackground(new java.awt.Color(0, 0, 0));
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("79");
        jLabel79.setOpaque(true);

        jLabel80.setBackground(new java.awt.Color(0, 0, 0));
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("80");
        jLabel80.setOpaque(true);

        jLabel81.setBackground(new java.awt.Color(0, 0, 0));
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("81");
        jLabel81.setOpaque(true);

        jLabel82.setBackground(new java.awt.Color(0, 0, 0));
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("82");
        jLabel82.setOpaque(true);

        jLabel83.setBackground(new java.awt.Color(0, 0, 0));
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("83");
        jLabel83.setOpaque(true);

        jLabel84.setBackground(new java.awt.Color(0, 0, 0));
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("84");
        jLabel84.setOpaque(true);

        jLabel85.setBackground(new java.awt.Color(0, 0, 0));
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("85");
        jLabel85.setOpaque(true);

        jLabel86.setBackground(new java.awt.Color(0, 0, 0));
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("86");
        jLabel86.setOpaque(true);

        jLabel87.setBackground(new java.awt.Color(0, 0, 0));
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("87");
        jLabel87.setOpaque(true);

        jLabel88.setBackground(new java.awt.Color(0, 0, 0));
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("88");
        jLabel88.setOpaque(true);

        jLabel89.setBackground(new java.awt.Color(0, 0, 0));
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("89");
        jLabel89.setOpaque(true);

        jLabel90.setBackground(new java.awt.Color(0, 0, 0));
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("90");
        jLabel90.setOpaque(true);

        jLabel91.setBackground(new java.awt.Color(0, 0, 0));
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("91");
        jLabel91.setOpaque(true);

        jLabel92.setBackground(new java.awt.Color(0, 0, 0));
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("92");
        jLabel92.setOpaque(true);

        jLabel93.setBackground(new java.awt.Color(0, 0, 0));
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("93");
        jLabel93.setOpaque(true);

        jLabel94.setBackground(new java.awt.Color(0, 0, 0));
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("94");
        jLabel94.setOpaque(true);

        jLabel95.setBackground(new java.awt.Color(0, 0, 0));
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("95");
        jLabel95.setOpaque(true);

        jLabel96.setBackground(new java.awt.Color(0, 0, 0));
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("96");
        jLabel96.setOpaque(true);

        jLabel97.setBackground(new java.awt.Color(0, 0, 0));
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("97");
        jLabel97.setOpaque(true);

        jLabel98.setBackground(new java.awt.Color(0, 0, 0));
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("98");
        jLabel98.setOpaque(true);

        jLabel99.setBackground(new java.awt.Color(0, 0, 0));
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("99");
        jLabel99.setOpaque(true);

        jLabel100.setBackground(java.awt.Color.black);
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("1");
        jLabel100.setOpaque(true);

        jLabel101.setBackground(new java.awt.Color(0, 0, 0));
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("2");
        jLabel101.setOpaque(true);

        jLabel102.setBackground(new java.awt.Color(0, 0, 0));
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("3");
        jLabel102.setOpaque(true);

        jLabel103.setBackground(new java.awt.Color(0, 0, 0));
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("4");
        jLabel103.setOpaque(true);

        jLabel104.setBackground(new java.awt.Color(0, 0, 0));
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("5");
        jLabel104.setOpaque(true);

        jLabel105.setBackground(new java.awt.Color(0, 0, 0));
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("6");
        jLabel105.setOpaque(true);

        jLabel106.setBackground(new java.awt.Color(0, 0, 0));
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("7");
        jLabel106.setOpaque(true);

        jLabel107.setBackground(new java.awt.Color(0, 0, 0));
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("8");
        jLabel107.setOpaque(true);

        jLabel108.setBackground(new java.awt.Color(0, 0, 0));
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("9");
        jLabel108.setOpaque(true);

        jLabel109.setBackground(new java.awt.Color(0, 0, 0));
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setText("10");
        jLabel109.setOpaque(true);

        jLabel110.setBackground(new java.awt.Color(0, 0, 0));
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("11");
        jLabel110.setOpaque(true);

        jLabel111.setBackground(new java.awt.Color(0, 0, 0));
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("12");
        jLabel111.setOpaque(true);

        jLabel112.setBackground(new java.awt.Color(0, 0, 0));
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("13");
        jLabel112.setOpaque(true);

        jLabel113.setBackground(new java.awt.Color(0, 0, 0));
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("14");
        jLabel113.setOpaque(true);

        jLabel114.setBackground(new java.awt.Color(0, 0, 0));
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("15");
        jLabel114.setOpaque(true);

        jLabel115.setBackground(new java.awt.Color(0, 0, 0));
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("16");
        jLabel115.setOpaque(true);

        jLabel116.setBackground(new java.awt.Color(0, 0, 0));
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("17");
        jLabel116.setOpaque(true);

        jLabel117.setBackground(new java.awt.Color(0, 0, 0));
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("18");
        jLabel117.setOpaque(true);

        jLabel118.setBackground(new java.awt.Color(0, 0, 0));
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("19");
        jLabel118.setOpaque(true);

        jLabel119.setBackground(new java.awt.Color(0, 0, 0));
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("20");
        jLabel119.setOpaque(true);

        jLabel120.setBackground(new java.awt.Color(0, 0, 0));
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setText("21");
        jLabel120.setOpaque(true);

        jLabel121.setBackground(new java.awt.Color(0, 0, 0));
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("22");
        jLabel121.setOpaque(true);

        jLabel122.setBackground(new java.awt.Color(0, 0, 0));
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("23");
        jLabel122.setOpaque(true);

        jLabel123.setBackground(new java.awt.Color(0, 0, 0));
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("24");
        jLabel123.setOpaque(true);

        jLabel124.setBackground(new java.awt.Color(0, 0, 0));
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("25");
        jLabel124.setOpaque(true);

        jLabel125.setBackground(new java.awt.Color(0, 0, 0));
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setText("26");
        jLabel125.setOpaque(true);

        jLabel126.setBackground(new java.awt.Color(0, 0, 0));
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setText("27");
        jLabel126.setOpaque(true);

        jLabel127.setBackground(new java.awt.Color(0, 0, 0));
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setText("28");
        jLabel127.setOpaque(true);

        jLabel128.setBackground(new java.awt.Color(0, 0, 0));
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setText("29");
        jLabel128.setOpaque(true);

        jLabel129.setBackground(new java.awt.Color(0, 0, 0));
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setText("30");
        jLabel129.setOpaque(true);

        jLabel130.setBackground(new java.awt.Color(0, 0, 0));
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setText("31");
        jLabel130.setOpaque(true);

        jLabel131.setBackground(new java.awt.Color(0, 0, 0));
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setText("32");
        jLabel131.setOpaque(true);

        jLabel132.setBackground(new java.awt.Color(0, 0, 0));
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setText("33");
        jLabel132.setOpaque(true);

        jLabel133.setBackground(new java.awt.Color(0, 0, 0));
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setText("34");
        jLabel133.setOpaque(true);

        jLabel134.setBackground(new java.awt.Color(0, 0, 0));
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setText("35");
        jLabel134.setOpaque(true);

        jLabel135.setBackground(new java.awt.Color(0, 0, 0));
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("36");
        jLabel135.setOpaque(true);

        jLabel136.setBackground(new java.awt.Color(0, 0, 0));
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("37");
        jLabel136.setOpaque(true);

        jLabel137.setBackground(new java.awt.Color(0, 0, 0));
        jLabel137.setForeground(new java.awt.Color(255, 255, 255));
        jLabel137.setText("38");
        jLabel137.setOpaque(true);

        jLabel138.setBackground(new java.awt.Color(0, 0, 0));
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setText("39");
        jLabel138.setOpaque(true);

        jLabel139.setBackground(new java.awt.Color(0, 0, 0));
        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setText("40");
        jLabel139.setOpaque(true);

        jLabel140.setBackground(new java.awt.Color(0, 0, 0));
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setText("45");
        jLabel140.setOpaque(true);

        jLabel141.setBackground(new java.awt.Color(0, 0, 0));
        jLabel141.setForeground(new java.awt.Color(255, 255, 255));
        jLabel141.setText("46");
        jLabel141.setOpaque(true);

        jLabel142.setBackground(new java.awt.Color(0, 0, 0));
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setText("47");
        jLabel142.setOpaque(true);

        jLabel143.setBackground(new java.awt.Color(0, 0, 0));
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setText("48");
        jLabel143.setOpaque(true);

        jLabel144.setBackground(new java.awt.Color(0, 0, 0));
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setText("49");
        jLabel144.setOpaque(true);

        jLabel145.setBackground(new java.awt.Color(0, 0, 0));
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setText("50");
        jLabel145.setOpaque(true);

        jLabel146.setBackground(new java.awt.Color(0, 0, 0));
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setText("41");
        jLabel146.setOpaque(true);

        jLabel147.setBackground(new java.awt.Color(0, 0, 0));
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setText("42");
        jLabel147.setOpaque(true);

        jLabel148.setBackground(new java.awt.Color(0, 0, 0));
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setText("43");
        jLabel148.setOpaque(true);

        jLabel149.setBackground(new java.awt.Color(0, 0, 0));
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setText("44");
        jLabel149.setOpaque(true);

        jLabel150.setBackground(new java.awt.Color(0, 0, 0));
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));
        jLabel150.setText("51");
        jLabel150.setOpaque(true);

        jLabel151.setBackground(new java.awt.Color(0, 0, 0));
        jLabel151.setForeground(new java.awt.Color(255, 255, 255));
        jLabel151.setText("52");
        jLabel151.setOpaque(true);

        jLabel152.setBackground(new java.awt.Color(0, 0, 0));
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setText("53");
        jLabel152.setOpaque(true);

        jLabel153.setBackground(new java.awt.Color(0, 0, 0));
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setText("54");
        jLabel153.setOpaque(true);

        jLabel154.setBackground(new java.awt.Color(0, 0, 0));
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setText("55");
        jLabel154.setOpaque(true);

        jLabel155.setBackground(new java.awt.Color(0, 0, 0));
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setText("56");
        jLabel155.setOpaque(true);

        jLabel156.setBackground(new java.awt.Color(0, 0, 0));
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setText("57");
        jLabel156.setOpaque(true);

        jLabel157.setBackground(new java.awt.Color(0, 0, 0));
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setText("58");
        jLabel157.setOpaque(true);

        jLabel158.setBackground(new java.awt.Color(0, 0, 0));
        jLabel158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel158.setText("59");
        jLabel158.setOpaque(true);

        jLabel159.setBackground(new java.awt.Color(0, 0, 0));
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setText("60");
        jLabel159.setOpaque(true);

        jLabel160.setBackground(new java.awt.Color(0, 0, 0));
        jLabel160.setForeground(new java.awt.Color(255, 255, 255));
        jLabel160.setText("61");
        jLabel160.setOpaque(true);

        jLabel161.setBackground(new java.awt.Color(0, 0, 0));
        jLabel161.setForeground(new java.awt.Color(255, 255, 255));
        jLabel161.setText("62");
        jLabel161.setOpaque(true);

        jLabel162.setBackground(new java.awt.Color(0, 0, 0));
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setText("63");
        jLabel162.setOpaque(true);

        jLabel163.setBackground(new java.awt.Color(0, 0, 0));
        jLabel163.setForeground(new java.awt.Color(255, 255, 255));
        jLabel163.setText("64");
        jLabel163.setOpaque(true);

        jLabel164.setBackground(new java.awt.Color(0, 0, 0));
        jLabel164.setForeground(new java.awt.Color(255, 255, 255));
        jLabel164.setText("65");
        jLabel164.setOpaque(true);

        jLabel165.setBackground(new java.awt.Color(0, 0, 0));
        jLabel165.setForeground(new java.awt.Color(255, 255, 255));
        jLabel165.setText("66");
        jLabel165.setOpaque(true);

        jLabel166.setBackground(new java.awt.Color(0, 0, 0));
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setText("67");
        jLabel166.setOpaque(true);

        jLabel167.setBackground(new java.awt.Color(0, 0, 0));
        jLabel167.setForeground(new java.awt.Color(255, 255, 255));
        jLabel167.setText("68");
        jLabel167.setOpaque(true);

        jLabel168.setBackground(new java.awt.Color(0, 0, 0));
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setText("69");
        jLabel168.setOpaque(true);

        jLabel169.setBackground(new java.awt.Color(0, 0, 0));
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setText("70");
        jLabel169.setOpaque(true);

        jLabel170.setBackground(new java.awt.Color(0, 0, 0));
        jLabel170.setForeground(new java.awt.Color(255, 255, 255));
        jLabel170.setText("71");
        jLabel170.setOpaque(true);

        jLabel171.setBackground(new java.awt.Color(0, 0, 0));
        jLabel171.setForeground(new java.awt.Color(255, 255, 255));
        jLabel171.setText("72");
        jLabel171.setOpaque(true);

        jLabel172.setBackground(new java.awt.Color(0, 0, 0));
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setText("73");
        jLabel172.setOpaque(true);

        jLabel173.setBackground(new java.awt.Color(0, 0, 0));
        jLabel173.setForeground(new java.awt.Color(255, 255, 255));
        jLabel173.setText("74");
        jLabel173.setOpaque(true);

        jLabel174.setBackground(new java.awt.Color(0, 0, 0));
        jLabel174.setForeground(new java.awt.Color(255, 255, 255));
        jLabel174.setText("75");
        jLabel174.setOpaque(true);

        jLabel175.setBackground(new java.awt.Color(0, 0, 0));
        jLabel175.setForeground(new java.awt.Color(255, 255, 255));
        jLabel175.setText("76");
        jLabel175.setOpaque(true);

        jLabel176.setBackground(new java.awt.Color(0, 0, 0));
        jLabel176.setForeground(new java.awt.Color(255, 255, 255));
        jLabel176.setText("77");
        jLabel176.setOpaque(true);

        jLabel177.setBackground(new java.awt.Color(0, 0, 0));
        jLabel177.setForeground(new java.awt.Color(255, 255, 255));
        jLabel177.setText("78");
        jLabel177.setOpaque(true);

        jLabel178.setBackground(new java.awt.Color(0, 0, 0));
        jLabel178.setForeground(new java.awt.Color(255, 255, 255));
        jLabel178.setText("79");
        jLabel178.setOpaque(true);

        jLabel179.setBackground(new java.awt.Color(0, 0, 0));
        jLabel179.setForeground(new java.awt.Color(255, 255, 255));
        jLabel179.setText("80");
        jLabel179.setOpaque(true);

        jLabel180.setBackground(new java.awt.Color(0, 0, 0));
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setText("81");
        jLabel180.setOpaque(true);

        jLabel181.setBackground(new java.awt.Color(0, 0, 0));
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setText("82");
        jLabel181.setOpaque(true);

        jLabel182.setBackground(new java.awt.Color(0, 0, 0));
        jLabel182.setForeground(new java.awt.Color(255, 255, 255));
        jLabel182.setText("83");
        jLabel182.setOpaque(true);

        jLabel183.setBackground(new java.awt.Color(0, 0, 0));
        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setText("84");
        jLabel183.setOpaque(true);

        jLabel184.setBackground(new java.awt.Color(0, 0, 0));
        jLabel184.setForeground(new java.awt.Color(255, 255, 255));
        jLabel184.setText("85");
        jLabel184.setOpaque(true);

        jLabel185.setBackground(new java.awt.Color(0, 0, 0));
        jLabel185.setForeground(new java.awt.Color(255, 255, 255));
        jLabel185.setText("86");
        jLabel185.setOpaque(true);

        jLabel186.setBackground(new java.awt.Color(0, 0, 0));
        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setText("87");
        jLabel186.setOpaque(true);

        jLabel187.setBackground(new java.awt.Color(0, 0, 0));
        jLabel187.setForeground(new java.awt.Color(255, 255, 255));
        jLabel187.setText("88");
        jLabel187.setOpaque(true);

        jLabel188.setBackground(new java.awt.Color(0, 0, 0));
        jLabel188.setForeground(new java.awt.Color(255, 255, 255));
        jLabel188.setText("89");
        jLabel188.setOpaque(true);

        jLabel189.setBackground(new java.awt.Color(0, 0, 0));
        jLabel189.setForeground(new java.awt.Color(255, 255, 255));
        jLabel189.setText("90");
        jLabel189.setOpaque(true);

        jLabel190.setBackground(new java.awt.Color(0, 0, 0));
        jLabel190.setForeground(new java.awt.Color(255, 255, 255));
        jLabel190.setText("91");
        jLabel190.setOpaque(true);

        jLabel191.setBackground(new java.awt.Color(0, 0, 0));
        jLabel191.setForeground(new java.awt.Color(255, 255, 255));
        jLabel191.setText("92");
        jLabel191.setOpaque(true);

        jLabel192.setBackground(new java.awt.Color(0, 0, 0));
        jLabel192.setForeground(new java.awt.Color(255, 255, 255));
        jLabel192.setText("93");
        jLabel192.setOpaque(true);

        jLabel193.setBackground(new java.awt.Color(0, 0, 0));
        jLabel193.setForeground(new java.awt.Color(255, 255, 255));
        jLabel193.setText("94");
        jLabel193.setOpaque(true);

        jLabel194.setBackground(new java.awt.Color(0, 0, 0));
        jLabel194.setForeground(new java.awt.Color(255, 255, 255));
        jLabel194.setText("95");
        jLabel194.setOpaque(true);

        jLabel195.setBackground(new java.awt.Color(0, 0, 0));
        jLabel195.setForeground(new java.awt.Color(255, 255, 255));
        jLabel195.setText("96");
        jLabel195.setOpaque(true);

        jLabel196.setBackground(new java.awt.Color(0, 0, 0));
        jLabel196.setForeground(new java.awt.Color(255, 255, 255));
        jLabel196.setText("97");
        jLabel196.setOpaque(true);

        jLabel197.setBackground(new java.awt.Color(0, 0, 0));
        jLabel197.setForeground(new java.awt.Color(255, 255, 255));
        jLabel197.setText("98");
        jLabel197.setOpaque(true);

        jLabel198.setBackground(new java.awt.Color(0, 0, 0));
        jLabel198.setForeground(new java.awt.Color(255, 255, 255));
        jLabel198.setText("99");
        jLabel198.setOpaque(true);

        jToggleButton2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton2.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton17.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton17.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton17ActionPerformed(evt);
            }
        });

        jToggleButton18.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton18.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        jToggleButton19.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton19.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton19ActionPerformed(evt);
            }
        });

        jToggleButton20.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton20.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton20ActionPerformed(evt);
            }
        });

        jToggleButton21.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton21.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton21ActionPerformed(evt);
            }
        });

        jToggleButton22.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton22.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton22ActionPerformed(evt);
            }
        });

        jToggleButton23.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton23.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton23ActionPerformed(evt);
            }
        });

        jToggleButton24.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton24.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton24ActionPerformed(evt);
            }
        });

        jToggleButton25.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton25.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton25ActionPerformed(evt);
            }
        });

        jToggleButton26.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton26.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton26ActionPerformed(evt);
            }
        });

        jToggleButton27.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton27.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton27ActionPerformed(evt);
            }
        });

        jToggleButton28.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton28.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton28ActionPerformed(evt);
            }
        });

        jToggleButton29.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton29.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton29ActionPerformed(evt);
            }
        });

        jToggleButton30.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton30.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton30ActionPerformed(evt);
            }
        });

        jToggleButton31.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton31.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton31ActionPerformed(evt);
            }
        });

        jToggleButton32.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton32.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton32ActionPerformed(evt);
            }
        });

        jToggleButton33.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton33.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton33ActionPerformed(evt);
            }
        });

        jToggleButton34.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton34.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton34ActionPerformed(evt);
            }
        });

        jToggleButton35.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton35.setText("If you subtract the tens digit with the ones digit it will not be \"+temp");
        jToggleButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton35ActionPerformed(evt);
            }
        });

        jButton1.setText("Check Answer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel200.setBackground(new java.awt.Color(51, 255, 0));
        jLabel200.setText("jLabel200");
        jLabel200.setOpaque(true);

        jLabel201.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel201.setText("jLabel201");
        jLabel201.setAlignmentX(0.5F);
        jLabel201.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel201.setOpaque(true);

        jLabel199.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jButton2.setText("Go  Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel109, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel169, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel189, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(30, 30, 30)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel177, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel185, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel191, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel194, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(30, 30, 30)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel146)
                                    .addComponent(jLabel147)
                                    .addComponent(jLabel148)
                                    .addComponent(jLabel149)
                                    .addComponent(jLabel140)
                                    .addComponent(jLabel141)
                                    .addComponent(jLabel142)
                                    .addComponent(jLabel143)
                                    .addComponent(jLabel144)
                                    .addComponent(jLabel139))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel150)
                                    .addComponent(jLabel151)
                                    .addComponent(jLabel152)
                                    .addComponent(jLabel153)
                                    .addComponent(jLabel154)
                                    .addComponent(jLabel155)
                                    .addComponent(jLabel156)
                                    .addComponent(jLabel157)
                                    .addComponent(jLabel158)
                                    .addComponent(jLabel145))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel160)
                                    .addComponent(jLabel161)
                                    .addComponent(jLabel162)
                                    .addComponent(jLabel163)
                                    .addComponent(jLabel164)
                                    .addComponent(jLabel165)
                                    .addComponent(jLabel166)
                                    .addComponent(jLabel167)
                                    .addComponent(jLabel168)
                                    .addComponent(jLabel159))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel170)
                                    .addComponent(jLabel171)
                                    .addComponent(jLabel172)
                                    .addComponent(jLabel173)
                                    .addComponent(jLabel174)
                                    .addComponent(jLabel175)
                                    .addComponent(jLabel176)
                                    .addComponent(jLabel177)
                                    .addComponent(jLabel178)
                                    .addComponent(jLabel169))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel180)
                                    .addComponent(jLabel181)
                                    .addComponent(jLabel182)
                                    .addComponent(jLabel183)
                                    .addComponent(jLabel184)
                                    .addComponent(jLabel185)
                                    .addComponent(jLabel186)
                                    .addComponent(jLabel187)
                                    .addComponent(jLabel188)
                                    .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel190)
                                    .addComponent(jLabel191)
                                    .addComponent(jLabel192)
                                    .addComponent(jLabel193)
                                    .addComponent(jLabel194)
                                    .addComponent(jLabel195)
                                    .addComponent(jLabel196)
                                    .addComponent(jLabel197)
                                    .addComponent(jLabel198)
                                    .addComponent(jLabel189)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel40))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel50))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel60))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel72)
                                    .addComponent(jLabel73)
                                    .addComponent(jLabel74)
                                    .addComponent(jLabel75)
                                    .addComponent(jLabel76)
                                    .addComponent(jLabel77)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel79)
                                    .addComponent(jLabel70))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel81)
                                    .addComponent(jLabel82)
                                    .addComponent(jLabel83)
                                    .addComponent(jLabel84)
                                    .addComponent(jLabel85)
                                    .addComponent(jLabel86)
                                    .addComponent(jLabel87)
                                    .addComponent(jLabel88)
                                    .addComponent(jLabel89)
                                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel91)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel94)
                                    .addComponent(jLabel95)
                                    .addComponent(jLabel96)
                                    .addComponent(jLabel97)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel99)
                                    .addComponent(jLabel90))))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton2)
                            .addComponent(jToggleButton17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton18)
                            .addComponent(jToggleButton19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton20)
                            .addComponent(jToggleButton21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton22)
                            .addComponent(jToggleButton23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton24)
                            .addComponent(jToggleButton25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton26)
                            .addComponent(jToggleButton27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton28)
                            .addComponent(jToggleButton29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton30)
                            .addComponent(jToggleButton31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton32)
                            .addComponent(jToggleButton33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton34)
                            .addComponent(jToggleButton35)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel100)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel103)
                                    .addComponent(jLabel104)
                                    .addComponent(jLabel105)
                                    .addComponent(jLabel106)
                                    .addComponent(jLabel107)
                                    .addComponent(jLabel108))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel110)
                                            .addComponent(jLabel111)
                                            .addComponent(jLabel112)
                                            .addComponent(jLabel113)
                                            .addComponent(jLabel114)
                                            .addComponent(jLabel115)
                                            .addComponent(jLabel116)
                                            .addComponent(jLabel117)
                                            .addComponent(jLabel118)
                                            .addComponent(jLabel109))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel120)
                                            .addComponent(jLabel121)
                                            .addComponent(jLabel122)
                                            .addComponent(jLabel123)
                                            .addComponent(jLabel124)
                                            .addComponent(jLabel125)
                                            .addComponent(jLabel126)
                                            .addComponent(jLabel127)
                                            .addComponent(jLabel128)
                                            .addComponent(jLabel119)))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel130)
                                    .addComponent(jLabel131)
                                    .addComponent(jLabel132)
                                    .addComponent(jLabel133)
                                    .addComponent(jLabel134)
                                    .addComponent(jLabel135)
                                    .addComponent(jLabel136)
                                    .addComponent(jLabel137)
                                    .addComponent(jLabel138)
                                    .addComponent(jLabel129))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(353, 353, 353)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton17ActionPerformed
        // TODO add your handling code here:
        readButton(jToggleButton17.getText());
    }//GEN-LAST:event_jToggleButton17ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton2.getText());
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton19ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton19.getText());
    }//GEN-LAST:event_jToggleButton19ActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton18.getText());
    }//GEN-LAST:event_jToggleButton18ActionPerformed

    private void jToggleButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton21ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton21.getText());
    }//GEN-LAST:event_jToggleButton21ActionPerformed

    private void jToggleButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton20ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton20.getText());
    }//GEN-LAST:event_jToggleButton20ActionPerformed

    private void jToggleButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton23ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton23.getText());
    }//GEN-LAST:event_jToggleButton23ActionPerformed

    private void jToggleButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton22ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton22.getText());
    }//GEN-LAST:event_jToggleButton22ActionPerformed

    private void jToggleButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton25ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton25.getText());
    }//GEN-LAST:event_jToggleButton25ActionPerformed

    private void jToggleButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton24ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton24.getText());
    }//GEN-LAST:event_jToggleButton24ActionPerformed

    private void jToggleButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton27ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton27.getText());
    }//GEN-LAST:event_jToggleButton27ActionPerformed

    private void jToggleButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton26ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton26.getText());
    }//GEN-LAST:event_jToggleButton26ActionPerformed

    private void jToggleButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton29ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton29.getText());
    }//GEN-LAST:event_jToggleButton29ActionPerformed

    private void jToggleButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton28ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton28.getText());
    }//GEN-LAST:event_jToggleButton28ActionPerformed

    private void jToggleButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton31ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton31.getText());
    }//GEN-LAST:event_jToggleButton31ActionPerformed

    private void jToggleButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton30ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton30.getText());
    }//GEN-LAST:event_jToggleButton30ActionPerformed

    private void jToggleButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton33ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton33.getText());
    }//GEN-LAST:event_jToggleButton33ActionPerformed

    private void jToggleButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton32ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton32.getText());
    }//GEN-LAST:event_jToggleButton32ActionPerformed

    private void jToggleButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton35ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton35.getText());
    }//GEN-LAST:event_jToggleButton35ActionPerformed

    private void jToggleButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton34ActionPerformed
        // TODO add your handling code here:
         readButton(jToggleButton34.getText());
    }//GEN-LAST:event_jToggleButton34ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        checkWin();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new StartMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    private void addLabels(){
        listOfLabels[0]=this.jLabel1;
        listOfLabels[1]=this.jLabel2;
        listOfLabels[2]=this.jLabel3;
        listOfLabels[3]=this.jLabel4;
        listOfLabels[4]=this.jLabel5;
        listOfLabels[5]=this.jLabel6;
        listOfLabels[6]=this.jLabel7;
        listOfLabels[7]=this.jLabel8;
        listOfLabels[8]=this.jLabel9;
        listOfLabels[9]=this.jLabel10;
        listOfLabels[10]=this.jLabel11;
        listOfLabels[11]=this.jLabel12;
        listOfLabels[12]=this.jLabel13;
        listOfLabels[13]=this.jLabel14;
        listOfLabels[14]=this.jLabel15;
        listOfLabels[15]=this.jLabel16;
        listOfLabels[16]=this.jLabel17;
        listOfLabels[17]=this.jLabel18;
        listOfLabels[18]=this.jLabel19;
        listOfLabels[19]=this.jLabel20;
        listOfLabels[20]=this.jLabel21;
        listOfLabels[21]=this.jLabel22;
        listOfLabels[22]=this.jLabel23;
        listOfLabels[23]=this.jLabel24;
        listOfLabels[24]=this.jLabel25;
        listOfLabels[25]=this.jLabel26;
        listOfLabels[26]=this.jLabel27;
        listOfLabels[27]=this.jLabel28;
        listOfLabels[28]=this.jLabel29;
        listOfLabels[29]=this.jLabel30;
        listOfLabels[30]=this.jLabel31;
        listOfLabels[31]=this.jLabel32;
        listOfLabels[32]=this.jLabel33;
        listOfLabels[33]=this.jLabel34;
        listOfLabels[34]=this.jLabel35;
        listOfLabels[35]=this.jLabel36;
        listOfLabels[36]=this.jLabel37;
        listOfLabels[37]=this.jLabel38;
        listOfLabels[38]=this.jLabel39;
        listOfLabels[39]=this.jLabel40;
        listOfLabels[40]=this.jLabel41;
        listOfLabels[41]=this.jLabel42;
        listOfLabels[42]=this.jLabel43;
        listOfLabels[43]=this.jLabel44;
        listOfLabels[44]=this.jLabel45;
        listOfLabels[45]=this.jLabel46;
        listOfLabels[46]=this.jLabel47;
        listOfLabels[47]=this.jLabel48;
        listOfLabels[48]=this.jLabel49;
        listOfLabels[49]=this.jLabel50;
        listOfLabels[50]=this.jLabel51;
        listOfLabels[51]=this.jLabel52;
        listOfLabels[52]=this.jLabel53;
        listOfLabels[53]=this.jLabel54;
        listOfLabels[54]=this.jLabel55;
        listOfLabels[55]=this.jLabel56;
        listOfLabels[56]=this.jLabel57;
        listOfLabels[57]=this.jLabel58;
        listOfLabels[58]=this.jLabel59;
        listOfLabels[59]=this.jLabel60;
        listOfLabels[60]=this.jLabel61;
        listOfLabels[61]=this.jLabel62;
        listOfLabels[62]=this.jLabel63;
        listOfLabels[63]=this.jLabel64;
        listOfLabels[64]=this.jLabel65;
        listOfLabels[65]=this.jLabel66;
        listOfLabels[66]=this.jLabel67;
        listOfLabels[67]=this.jLabel68;
        listOfLabels[68]=this.jLabel69;
        listOfLabels[69]=this.jLabel70;
        listOfLabels[70]=this.jLabel71;
        listOfLabels[71]=this.jLabel72;
        listOfLabels[72]=this.jLabel73;
        listOfLabels[73]=this.jLabel74;
        listOfLabels[74]=this.jLabel75;
        listOfLabels[75]=this.jLabel76;
        listOfLabels[76]=this.jLabel77;
        listOfLabels[77]=this.jLabel78;
        listOfLabels[78]=this.jLabel79;
        listOfLabels[79]=this.jLabel80;
        listOfLabels[80]=this.jLabel81;
        listOfLabels[81]=this.jLabel82;
        listOfLabels[82]=this.jLabel83;
        listOfLabels[83]=this.jLabel84;
        listOfLabels[84]=this.jLabel85;
        listOfLabels[85]=this.jLabel86;
        listOfLabels[86]=this.jLabel87;
        listOfLabels[87]=this.jLabel88;
        listOfLabels[88]=this.jLabel89;
        listOfLabels[89]=this.jLabel90;
        listOfLabels[90]=this.jLabel91;
        listOfLabels[91]=this.jLabel92;
        listOfLabels[92]=this.jLabel93;
        listOfLabels[93]=this.jLabel94;
        listOfLabels[94]=this.jLabel95;
        listOfLabels[95]=this.jLabel96;
        listOfLabels[96]=this.jLabel97;
        listOfLabels[97]=this.jLabel98;
        listOfLabels[98]=this.jLabel99;
        
        
    }
    private void addAnswers(){
        listsOfAnswers[0]=this.jToggleButton17;
        listsOfAnswers[1]=this.jToggleButton2;
        listsOfAnswers[2]=this.jToggleButton19;
        listsOfAnswers[3]=this.jToggleButton18;
        listsOfAnswers[4]=this.jToggleButton21;
        listsOfAnswers[5]=this.jToggleButton20;
        listsOfAnswers[6]=this.jToggleButton23;
        listsOfAnswers[7]=this.jToggleButton22;
        listsOfAnswers[8]=this.jToggleButton25;
        listsOfAnswers[9]=this.jToggleButton24;
        listsOfAnswers[10]=this.jToggleButton27;
        listsOfAnswers[11]=this.jToggleButton26;
        listsOfAnswers[12]=this.jToggleButton29;
        listsOfAnswers[13]=this.jToggleButton28;
        listsOfAnswers[14]=this.jToggleButton31;
        listsOfAnswers[15]=this.jToggleButton30;
        listsOfAnswers[16]=this.jToggleButton33;
        listsOfAnswers[17]=this.jToggleButton32;
        listsOfAnswers[18]=this.jToggleButton35;
        listsOfAnswers[19]=this.jToggleButton34;
    }
    
    private void addLabels2(){
        listsOfAnswerLabels[0]=this.jLabel100;
        listsOfAnswerLabels[1]=this.jLabel101;
        listsOfAnswerLabels[2]=this.jLabel102;
        listsOfAnswerLabels[3]=this.jLabel103;
        listsOfAnswerLabels[4]=this.jLabel104;
        listsOfAnswerLabels[5]=this.jLabel105;
        listsOfAnswerLabels[6]=this.jLabel106;
        listsOfAnswerLabels[7]=this.jLabel107;
        listsOfAnswerLabels[8]=this.jLabel108;
        listsOfAnswerLabels[9]=this.jLabel109;
        listsOfAnswerLabels[10]=this.jLabel110;
        listsOfAnswerLabels[11]=this.jLabel111;
        listsOfAnswerLabels[12]=this.jLabel112;
        listsOfAnswerLabels[13]=this.jLabel113;
        listsOfAnswerLabels[14]=this.jLabel114;
        listsOfAnswerLabels[15]=this.jLabel115;
        listsOfAnswerLabels[16]=this.jLabel116;
        listsOfAnswerLabels[17]=this.jLabel117;
        listsOfAnswerLabels[18]=this.jLabel118;
        listsOfAnswerLabels[19]=this.jLabel119;
         listsOfAnswerLabels[20]=this.jLabel120;
        listsOfAnswerLabels[21]=this.jLabel121;
        listsOfAnswerLabels[22]=this.jLabel122;
        listsOfAnswerLabels[23]=this.jLabel123;
        listsOfAnswerLabels[24]=this.jLabel124;
        listsOfAnswerLabels[25]=this.jLabel125;
        listsOfAnswerLabels[26]=this.jLabel126;
        listsOfAnswerLabels[27]=this.jLabel127;
        listsOfAnswerLabels[28]=this.jLabel128;
        listsOfAnswerLabels[29]=this.jLabel129;
         listsOfAnswerLabels[30]=this.jLabel130;
        listsOfAnswerLabels[31]=this.jLabel131;
        listsOfAnswerLabels[32]=this.jLabel132;
        listsOfAnswerLabels[33]=this.jLabel133;
        listsOfAnswerLabels[34]=this.jLabel134;
        listsOfAnswerLabels[35]=this.jLabel135;
        listsOfAnswerLabels[36]=this.jLabel136;
        listsOfAnswerLabels[37]=this.jLabel137;
        listsOfAnswerLabels[38]=this.jLabel138;
        listsOfAnswerLabels[39]=this.jLabel139;
         listsOfAnswerLabels[40]=this.jLabel146;
        listsOfAnswerLabels[41]=this.jLabel147;
        listsOfAnswerLabels[42]=this.jLabel148;
        listsOfAnswerLabels[43]=this.jLabel149;
        listsOfAnswerLabels[44]=this.jLabel140;
        listsOfAnswerLabels[45]=this.jLabel141;
        listsOfAnswerLabels[46]=this.jLabel142;
        listsOfAnswerLabels[47]=this.jLabel143;
        listsOfAnswerLabels[48]=this.jLabel144;
        listsOfAnswerLabels[49]=this.jLabel145;
         listsOfAnswerLabels[50]=this.jLabel150;
        listsOfAnswerLabels[51]=this.jLabel151;
        listsOfAnswerLabels[52]=this.jLabel152;
        listsOfAnswerLabels[53]=this.jLabel153;
        listsOfAnswerLabels[54]=this.jLabel154;
        listsOfAnswerLabels[55]=this.jLabel155;
        listsOfAnswerLabels[56]=this.jLabel156;
        listsOfAnswerLabels[57]=this.jLabel157;
        listsOfAnswerLabels[58]=this.jLabel158;
        listsOfAnswerLabels[59]=this.jLabel159;
         listsOfAnswerLabels[60]=this.jLabel160;
        listsOfAnswerLabels[61]=this.jLabel161;
        listsOfAnswerLabels[62]=this.jLabel162;
        listsOfAnswerLabels[63]=this.jLabel163;
        listsOfAnswerLabels[64]=this.jLabel164;
        listsOfAnswerLabels[65]=this.jLabel165;
        listsOfAnswerLabels[66]=this.jLabel166;
        listsOfAnswerLabels[67]=this.jLabel167;
        listsOfAnswerLabels[68]=this.jLabel168;
        listsOfAnswerLabels[69]=this.jLabel169;
         listsOfAnswerLabels[70]=this.jLabel170;
        listsOfAnswerLabels[71]=this.jLabel171;
        listsOfAnswerLabels[72]=this.jLabel172;
        listsOfAnswerLabels[73]=this.jLabel173;
        listsOfAnswerLabels[74]=this.jLabel174;
        listsOfAnswerLabels[75]=this.jLabel175;
        listsOfAnswerLabels[76]=this.jLabel176;
        listsOfAnswerLabels[77]=this.jLabel177;
        listsOfAnswerLabels[78]=this.jLabel178;
        listsOfAnswerLabels[79]=this.jLabel179;
         listsOfAnswerLabels[80]=this.jLabel180;
        listsOfAnswerLabels[81]=this.jLabel181;
        listsOfAnswerLabels[82]=this.jLabel182;
        listsOfAnswerLabels[83]=this.jLabel183;
        listsOfAnswerLabels[84]=this.jLabel184;
        listsOfAnswerLabels[85]=this.jLabel185;
        listsOfAnswerLabels[86]=this.jLabel186;
        listsOfAnswerLabels[87]=this.jLabel187;
        listsOfAnswerLabels[88]=this.jLabel188;
        listsOfAnswerLabels[89]=this.jLabel189;
         listsOfAnswerLabels[90]=this.jLabel190;
        listsOfAnswerLabels[91]=this.jLabel191;
        listsOfAnswerLabels[92]=this.jLabel192;
        listsOfAnswerLabels[93]=this.jLabel193;
        listsOfAnswerLabels[94]=this.jLabel194;
        listsOfAnswerLabels[95]=this.jLabel195;
        listsOfAnswerLabels[96]=this.jLabel196;
        listsOfAnswerLabels[97]=this.jLabel197;
        listsOfAnswerLabels[98]=this.jLabel198;
        
        
    }
    
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton29;
    private javax.swing.JToggleButton jToggleButton30;
    private javax.swing.JToggleButton jToggleButton31;
    private javax.swing.JToggleButton jToggleButton32;
    private javax.swing.JToggleButton jToggleButton33;
    private javax.swing.JToggleButton jToggleButton34;
    private javax.swing.JToggleButton jToggleButton35;
    // End of variables declaration//GEN-END:variables
}
