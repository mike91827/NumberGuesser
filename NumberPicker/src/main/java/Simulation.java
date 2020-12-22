import java.util.*;

/*this generates the sentence about the numbers */

public class Simulation {
    Random rand;
    //each of these arrays corresponds to one of the below method
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
        //all the numbers that are in the final answer
        possibilities=new ArrayList<Integer>();
        ones=new ArrayList<Integer>();
        tens = new ArrayList<Integer>();
        factors=new ArrayList<Integer>();
        TaO=new ArrayList<Integer>();
        SsF=new ArrayList<Integer>();
        
        answers= new ArrayList<String>();
    }
    public void run(){
        reset();
        
        int c;
        //this picks the sentences we will use for the final answer
        //the input parameter (true) means it will be used in the answer 
        for (int i=0;i<NoOfStatements/2;i++){
            
            c = rand.nextInt(5);
            

          
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
        
       //this picks the statements that will be displayed but are not part of the final answer
        for (int i=0;i<NoOfStatements-(NoOfStatements/2);i++){
             c = rand.nextInt(5);
            

            
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
    
    //if the number was not selected, select it. if it was selected, then unselect it. 
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
       
    }

    /*input parameter add means if these numbers are being added to the possibilites list (a.k.a the final answer) or are we just generating the statement without adding the numbers*/
    private boolean SecondSubtractFirst(boolean add){
        //generate a random number then select all numbers who's second digit minus first digit results in that number 

        int choice = rand.nextInt(19)-9;
        int temp=choice;
        
        boolean found=false;
        //if we already used the same number previously, select a new another one
        do {
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

        
        

        int p;
        
         //this alters to the possibilites list, which is the list that will contain the numbers we will have at the end
        if (add){
        for (int i=0;i<10;i++){
            p=i-temp;
            if(p>=0&&p<10){
                p=(i*10)+p;
                switchP(p);
            }
        }
        }

       answers.add("If you subtract the tens digit with the ones digit it will be "+temp);

        return true;
    }

  /*input parameter add means if these numbers are being added to the possibilites list (a.k.a the final answer) or are we just generating the statement without adding the numbers*/
    private boolean addTensAndOnes(boolean  add){

        //generates a number then we take all the numbers where if we add the tens and ones digit we get that number

        int choice = rand.nextInt(18)+1;
        int temp=choice;
        boolean found=false;
        //make sure we do not select the same number more than twice
        do  {
            
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


        
        //alters possibilites list
       if (add){

        int t=0;
        int k;
        int p;


        while (t<=temp){
            k=temp-t;
            p=t+(k*10);

            if (t<10&&k<10) {
                
               switchP(p);
            }
            t=t+1;
        }
       }

       answers.add("If you add up the ones and ten digits of this number you will get "+temp);

        return true;

    }

  /*input parameter add means if these numbers are being added to the possibilites list (a.k.a the final answer) or are we just generating the statement without adding the numbers*/
    private boolean TensDigit(boolean add){
        //finds numbers with a certain tens digit number
        if (tens.size()==9){
            return false;
        }
        int choice=-1;
        boolean found=false;
        //makes sure no duplicates
        while (!found){
            choice=rand.nextInt(10);
            choice = choice *10;
            if (!tens.contains(choice)) {
                found = true;
                tens.add(choice);
            }
        }

        int temp=choice;
        //add to list
       if (add){
            while (temp<choice+10){

                switchP(temp);
                temp=temp+1;
            }
       }

        answers.add("It's ten's digit is "+choice/10);

        return true;

    }
  /*input parameter add means if these numbers are being added to the possibilites list (a.k.a the final answer) or are we just generating the statement without adding the numbers*/
    private boolean OnesDigit(boolean  add){
        //finds number with certain one's digit
        
        //if size ==9 then we picked everysingle possible number
        if(ones.size()==9){
            return false;
        }

        int choice=-1;
        boolean found=false;
        //make sure we did not pick a duplicate
        while (!found){
            choice=rand.nextInt(10);
            if (!ones.contains(choice)) {
                found = true;
                ones.add(choice);
            }

        }
        if (!found){
           
            return  false;
        }
        int temp=choice;
       //adds number to possibilites list
        if (add){ 
            while (temp<100){

                switchP(temp);
                temp=temp+10;
            }
        }


        answers.add("It's one's digit is "+choice );

        return true;
    }


  /*input parameter add means if these numbers are being added to the possibilites list (a.k.a the final answer) or are we just generating the statement without adding the numbers*/
    private boolean factoring(boolean add){
        //chooses numbers with a certain factor
        int choice = rand.nextInt(19)+2;
        int temp=choice;
        boolean found=false;

//makes sure there is no duplicates from when we used this function previously
        do{ 

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
        //if no more numbers to pick (since we already picked them before)
        if (!found){
            
            return  false;
        }
        int t=choice;
        
        //what we will add to the list
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
