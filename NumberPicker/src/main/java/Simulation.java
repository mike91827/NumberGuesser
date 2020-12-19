import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */


public class Simulation {
    Random rand;
    ArrayList<Integer> possibilities;
    ArrayList<Integer> ones;
    ArrayList<Integer> tens;
    ArrayList<Integer> factors;
    ArrayList<Integer> TaO;
    ArrayList <Integer> SsF;
   
    ArrayList <String> answers;
    
    int NoOfStatements;
    
    Simulation(int hard){
        NoOfStatements=hard;
        rand = new Random();
        possibilities=new ArrayList<Integer>();
        ones=new ArrayList<Integer>();
        tens = new ArrayList<Integer>();
        factors=new ArrayList<Integer>();
        TaO=new ArrayList<Integer>();
        SsF=new ArrayList<Integer>();
        //MnM=new ArrayList<Integer>();
        answers= new ArrayList<String>();
    }
    public void run(){
        reset();
        
        int c;
        for (int i=0;i<NoOfStatements/2;i++){
            
            c = rand.nextInt(5);
            

            //to be able topick OnesDigit and TensDigit last just  ut it last and makeit unable to geneerate that number and on
            //ly way to access is if we c+1
            switch(c){
                case 0:
                    SecondSubtractFirst(true);
                    break;

                case 1:
                    
                    TensDigit(true);
                    break;
                case 2:

                    addTensAndOnes(true);
                    break;

                case 3:
                    OnesDigit(true);
                    break;
                case 4:
                   factoring(true);
                    break;
                
            }
        System.out.println( Arrays.toString(answers.toArray()));
         System.out.println( Arrays.toString(possibilities.toArray()));
        }
        
       
        for (int i=0;i<NoOfStatements-(NoOfStatements/2);i++){
             c = rand.nextInt(5);
            

            //to be able topick OnesDigit and TensDigit last just  ut it last and makeit unable to geneerate that number and on
            //ly way to access is if we c+1
            switch(c){
                case 0:
                    SecondSubtractFirst(false);
                    break;

                case 1:
                    
                    TensDigit(false);
                    break;
                case 2:

                    addTensAndOnes(false);
                    break;

                case 3:
                    OnesDigit(false);
                    break;
                case 4:
                   factoring(false);
                    break;
        }
        System.out.println( Arrays.toString(answers.toArray()));
         System.out.println( Arrays.toString(possibilities.toArray()));
    }
        Collections.sort(possibilities);
        System.out.println( Arrays.toString(possibilities.toArray()));
}
    
    
    private void switchP(int i){
        if (!possibilities.remove(Integer.valueOf(i))){
            possibilities.add(i);
        }
    }

    public ArrayList <Integer> getPossibilities(){
        return possibilities;
    }
    
    
    public ArrayList <String> getAnswers(){
        return answers;
    }
    
    
    public  void reset() {
        for (int i=1;i<100;i++){
                possibilities.add(i);

        }
        ones.clear();
        tens.clear();
        factors.clear();
        TaO.clear();
        SsF.clear();
        ///MnM.clear();
    }

    //maybe add multiple, and range

    private boolean SecondSubtractFirst(boolean add){


        int choice = rand.nextInt(19)-9;
        int temp=choice;
        boolean found=false;
        do {
            ///System.out.println("temp "+temp+" "+choice);
            if (!SsF.contains(temp))  {

                found = true;
                SsF.add(temp);
            }
            if (!found){
                if (temp == 9) {
                    temp = -9;
                } else {
                    temp++;
                }
            }
        }  while(!found&&choice!=temp );



        if (!found){
            return false;
        }

        System.out.println(temp);
        

        int p;
        

        if (add){
        for (int i=0;i<10;i++){
            p=i-temp;
            if(p>=0&&p<10){
                p=(i*10)+p;
                //System.out.println("HERE "+p);
                switchP(p);
            }
        }
        }

       answers.add("If you subtract the tens digit with the ones digit it will be "+temp);

        return true;
    }


    private boolean addTensAndOnes(boolean  add){

        //System.out.println("answer "+answer);

        int choice = rand.nextInt(18)+1;
        int temp=choice;
        boolean found=false;
        do  {
            //System.out.println("temp "+temp+" "+choice);
            if (!TaO.contains(temp)){
                found=true;
                TaO.add(temp);
            }
            if(!found) {
                if (temp == 18) {
                    temp = 1;
                } else {
                    temp++;
                }
            }
        }  while(!found&&choice!=temp );



        if (!found){
            return false;
        }


       if (add){

        int t=0;
        int k;
        int p;


        while (t<=temp){
            k=temp-t;
            p=t+(k*10);

            if (t<10&&k<10) {
                // System.out.println("P "+p);
               switchP(p);
            }
            t=t+1;
        }
       }

       answers.add("If you add up the ones and ten digits of this number you will get "+temp);

        return true;

    }


    private boolean TensDigit(boolean add){
        if (tens.size()==9){
            return false;
        }
        int choice=-1;
        boolean found=false;
        while (!found){
            choice=rand.nextInt(10);
            choice = choice *10;
            if (!tens.contains(choice)) {
                found = true;
                tens.add(choice);
            }
        }

        int temp=choice;
       if (add){
            while (temp<choice+10){

                switchP(temp);
                temp=temp+1;
            }
       }

        answers.add("It's ten's digit is "+choice/10);

        return true;

    }

    private boolean OnesDigit(boolean  add){
        if(ones.size()==9){
            return false;
        }

        int choice=-1;
        boolean found=false;

        while (!found){
            choice=rand.nextInt(10);
            if (!ones.contains(choice)) {
                found = true;
                ones.add(choice);
            }

        }
        if (!found){
            //System.out.println("failed");
            return  false;
        }
        int temp=choice;
        //System.out.println("Temp "+temp);
        if (add){ 
            while (temp<100){

                switchP(temp);
                temp=temp+10;
            }
        }


        answers.add("It's one's digit is "+choice );

        return true;
    }



    private boolean factoring(boolean add){
        int choice = rand.nextInt(19)+2;
        int temp=choice;
        boolean found=false;


        do{ System.out.println("Temp " + temp +" "+choice);

            if  (!factors.contains(temp)){
                found=true;
                factors.add(temp);
            }

            if (!found){
                if (temp==20){
                    temp=2;
                } else {
                    temp++;
                }
            }
        } while(temp != choice&&!found);


 
        choice=temp;

        if (!found){
            //System.out.println("failed");
            return  false;
        }
        int t=choice;
        if  (add){
           

            while (choice<100){

                switchP(choice);
                choice=choice+t;
            }
        }



        answers.add("These numbers have a factor of " + t);
        return   true;


    }
}
