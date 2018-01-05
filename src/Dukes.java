import java.text.NumberFormat;

public class Dukes {

    int a = 10;

    public void print() {
        System.out.println(a);
    }

    public void addStudd(int a) {
        a += 38;
        System.out.println(++a);
    }

    public void strata(float jt) {
        jt = 21.6f;
        jt = 23.6f;
        System.out.println(jt);// 23.6 is answer
        jt = 0f;
        System.out.println(jt);//prints 0.0, this is point where object is ready for garbage collection

    }

    {
        char c4 = 0154; //1 in octal
        char c5 = (char) 131170;
        char c6 = (char) 131193;
        System.out.println(c4 + "" + "" + c5);//prints lb
        System.out.println(c4);//prints l
        System.out.println(c5);//prints b
        System.out.println(c6);//prints y

        char ch1 = 'S';
        char ch2 = '\u0068';
        char ch3 = 0x0065;
        char ch4 = 0154;
        char ch5 = (char) 131170;
        char ch6 = (char) 131193;
        char ch7 = '\'';
        // char ch8='S';

        char[] autoMotive = {ch1, ch2, ch3, ch4, ch5, ch6, ch7};
        System.out.println(new String(autoMotive) + " Mustang");
        //shelby' mustang prints to console

        byte passengers = 10;//implicit cast into --> byte
        byte doors = (byte) 30;//explicit cast
        System.out.println("Them doors" + doors);//30 prints to console

        float currentBid = 801.00f;//implicit cast
        float reserveBid = (float) 9000;//explicit cast
        float cd = currentBid + reserveBid;
        String dc = NumberFormat.getCurrencyInstance().format(cd);
        System.out.println("Monies" + dc);//$9,801.00 US dollars
        System.out.println("Dosh" + cd);//9801.0
    }

    /*
        enum SUITS {CLUBS, DIAMONDS, SPADES, HEARTS}
        SUITS cardSuits;
        cardSuits = SUITS.DIAMONDS;

        if(cardSuits == SUITS.DIAMONDS{
        System.out.println(cardSuits);
    {
        /*
        String car;
        car = new Car1(125,true);
        boolean running = car.isRunning();

        this is legal as the unitialised var car is initialised with new car object which can be used with method isRunning

        String car;
        boolean running = car.isRunning(); // this is illegal as object unitalised

        Truck truck = null;
        if(truck !=  null){
        truck.startRunning();
        }
        //this is an example of testing an object to see if it is initalised before being used with method
        //nullPointerException is thrown when object used that is null(runtime exception), this is a good way to prevent
        //this exception happening

        long creditCardNumber 1644_4432_5321_8971L;//example of using underscores with floating type data,
        //underscores cannot be placed before first number or after last number or adjacent to decimal point

*/
    //long creditCardNumber = 1644_4432_5321_8971L_; no good
    {
        int earnedRuns = 70;
        int ballsBowled = 175;
        float leagueAverage = 65.8f;

        float calc = ((float) earnedRuns / (float) ballsBowled);
        System.out.println("Average for day" + calc);//0.4 prints to console
        boolean worthWhile = false;
        if (calc > leagueAverage) {
            System.out.println("Good enough" + worthWhile);
        } else
            System.out.println("Shithouse" + worthWhile);//not good enough, this prints to console


        char yesNo = worthWhile ? 'Y' : 'N';
        System.out.println("Is player good enough" + yesNo);//prints N to console
    }





































    {
        int earnedRunner = 70;
        int ballsBowler = 175;
        float leagueAverager = 0.3f;

        float calc2 = ((float) earnedRunner / (float) ballsBowler);
        System.out.println("Average for day" + calc2);//
        boolean worthWhile1;
        if (calc2 > leagueAverager) {
            worthWhile1 = true;
            System.out.println("he good enough");//boolean evaluates to true, player exceeds the average
        } else
            worthWhile1 = false;
        //System.out.println("Sorry son");

        char yesNo12 = worthWhile1 ? 'Y' : 'N';
        System.out.println("Is player good enough" + yesNo12);//yes printed to console
    }
    {
        String sj = "pirates crazy caribbean";
        boolean btt = sj.startsWith(" pirate party");
        String dsw = sj.substring(8);

        System.out.println(sj.replace('c', 'h'));//prints hrazy caribbean
        System.out.println(sj.replace(' ', 'Z'));//this prints Z in between white space
        System.out.println(btt);//false as string value does not match
        System.out.println(dsw);//prints crazy caribbean, starting at crazy it prints that component of string
        System.out.println(" ".equals("\u0020"));//true as "" are part of the whitespace either side of string
        System.out.println(sj.trim().substring(0, 13));// pirates crazy printed to screen

        String henq = "Japan is in ASIA";
        String jot = "Japan is in  XXXX";
        boolean compass = false;
        boolean wilderness = true;
        if (henq == jot) {
            System.out.println(compass);
        } else {
            System.out.println(wilderness);/*this evaluates to wilderness which is true*/
        }
        boolean bz = henq.equalsIgnoreCase(jot);
        System.out.println("Hmm" + bz);//evaluates to false

        StringBuilder jk = new StringBuilder("Shitballs ");
        System.out.println(jk.insert(9, " That hurt"));//this will print shitballs that hurt to console
        System.out.println(jk.insert(12, "That hurt"));//this will print a StringIndexOutOfBoundsException]
        System.out.println(jk.insert(9, 'H'));//prints ShitballsH ThThat hurtat hurt
        System.out.println(jk.deleteCharAt(8));//shitballH prints to console
        System.out.println(jk.delete(3, 6));//set boundary, prints ShillH
        System.out.println(jk.reverse());//prints string backwards

        //look for chaining on EXAM

        }

        public void validNumber(){
        long p =17496; // prime number
            Double primeSquareRoot = Math.sqrt(p);
            boolean isPrime = true;
            for (long j = 2; j <= primeSquareRoot.longValue(); j++){
                if(p % j == 0){
                    System.out.println(j + p/j);
                    isPrime = false;
                }
            }
            System.out.println("Prime numner: " + isPrime);
        }
    {

        /*
        Highest to lowest order of precedence for operators *, +, &&, =
         */
        System.out.println(true | false & true );//null pointer exception
        System.out.println(false&true | true);//compile error.

        int score = 20;
        System.out.println("SSS" + score++);//prints 20 to console

        System.out.println(3+4+7+"8");//prints 148, adds the integer values and leaves the 8 on end as a string

       System.out.print("and");
       System.out.println("3" + 4 + 7 + 8); // prints and3478

       //second time sys out is used i ommited line from from first method so 148and3478 print like that

        System.out.print(3+4+7+"8");
        System.out.print(" and ");
        System.out.println("3" + 4 + 7 + 8);

        System.out.print(3+3+"3");
        System.out.print(" and ");
        System.out.println("3" + 3 + 3);
        //output above is 63 and 333, the + operators have right association, first two operands of first statement are numeric so the addition
        //+ operator is used(3+3=6). 6 +"3" uses a string concatenation operator(+), therefore rendering the string 63
        //last statement is handles differently, first operand is string, therefo  string concatenation operator used with other operands
        //rendering "3"+"3"+"3" as 333 string.

        /*
        toString method is commonly used to return the object's state information, any information that can be gathered may be returned a string
        indexOf declaration includes as paramters (int ch, int fromIndex, String str)
        Which declararation of StringBuilder class exists: public StringBuilder reverse(){} --> reverse method contains no args
        String and StringBuilder classes are incompatible
        which append declaration does not exist in java 8 --> public StringBuilder append (short s) {} - this declaration is not included in stringbuilder class.
        // this is because short is auto casted to integer when passed for integer literal, (int i) would handle a short automatically.
         */

       String tenCharString = "SSSSSSSSSS";
       System.out.println(tenCharString.replace("SSS", "TTT"));//replaces entire string with T output
        System.out.println(tenCharString.replace("SSS", "TTT"));//TTTTTTTTTS, ten chars in string 3 lots of 3 T's replace S's,
        //therefore last character is still S

    }


    int numbez = 7;

        public void sampleMethod(int i){
            i++;
            System.out.println("Here" +i);

    }
    /*
    This code block includes using static variables that belong to the class, not instance of object
     */

        public static int nextTrackingNumber= 100;
        private int packageTrackingNumber;

        public Dukes(){
            this.packageTrackingNumber =nextTrackingNumber;
            nextTrackingNumber++;

        }
        public int getPackageTrackingNumber() {
            return packageTrackingNumber;

        }


    {
        String msg1 = new String("Over here");
        String msg2 = new String("Over there");
        String msg3 = new String("OVER HERE");
        System.out.println("People" + msg1.equals(msg3));//false two string pointing to different reference
        System.out.println("Folks" + msg2.equals(msg1));//same in this scenario
        System.out.println("George" + msg2.equals(msg1));//false as well

        String obd = new String("Yo Yo");
        String heo = obd;
        System.out.println(obd == heo);//true
        System.out.println(obd + " " + heo);//yo yo yo yo prints to screen, as both string object share same reference

        String interjection1 = "Fruit Cake";
        String interjection2 = "Fruit Cake";
        System.out.println("Pizza" + interjection1.compareTo(interjection2));//prints 0


        /*
        multi dimension array
         */
        {
            int cgn[][][] = new int[4][4][4];   //64 elements
//if you change values here to make them smaller, array shrinks
            //if you exceed amount of array to iterate through, indexOutOfBoundsException, max val is 4


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 6; k++) {
                        System.out.println("Quite a few vals " +cgn[i][j][k]);//prints values 64 times to console
                        //need to iterate through each
                        System.out.println();
                    }
                }
            }
        }
        int [][] arrNuz = new int[2][5];//first set of brackets is ros, second set of brackets is columns
        // this array has been initliazed to have 2 rows and 5 columns
        arrNuz[0][0] = 321;
        arrNuz[0][1] = 321;
        arrNuz[0][2] = 321;
        arrNuz[0][3] = 321;
        arrNuz[0][4] = 321;
        arrNuz[1][0] = 65;
        arrNuz[1][1] = 65;
        arrNuz[1][2] = 653;
        arrNuz[1][3] = 50;
        arrNuz[1][4] = 62;
        //arrNuz[2][0] = 343;//this gives an ArrayIndexOutOfBounds exception, code will not compile, however if you change the
        //number of rows to 3 it will compile, it initilasizes remaining values to 0 that are unassigned in index
        //arrNuz[2][3]=247;
        int rowboat = 2;
        int colossus = 5;
        int kp,et;
        for ( kp = 0; kp < rowboat; kp++){
            for (et = 0; et < colossus; et++){
                System.out.println(arrNuz[kp][et]);
            }
        }


        int[][] reddick = {{1, 8, 51, 6}, {32, 3, 6, 5}, {11, 21}};
        System.out.println("JJhfhfgdf " + reddick[2][1]);//prints 21, 21 is in [2], in index [1]
        System.out.println("JJhfgdf " + reddick[0][1]);// prints 8
        System.out.println("JJhfhfgdf " + reddick[1][1]);//3
        System.out.println("JJhfhfgdf " + reddick[1][2]);//6
        System.out.println("JJhfhfgdf " + reddick[1].length);//4 is length, [1] has 4 elements

        int [][][] testi = {{{-3,-12,6}, {2,9,13,96},{1,5,321,80},{100}}};
       // System.out.println("tetsi " +testi[3][0]);//index out of bounds
       // System.out.println("tetsi " +testi[2][0]);//index out of bounds
       // System.out.println("tetsi " +testi[1]);//arrayindexoutorbounds
        for (int [][] t: testi){
            System.out.println("Tea for two:" +t);
          //  System.out.println(testi[2][0][0]);
            System.out.println(testi[0]);
            System.out.println(testi[1]);
        }

    }

    {
        int sampleArray [] = new int[3];
        sampleArray[1]=3;
        sampleArray[2]=5;
        sampleArray[3]=7;
        int var = sampleArray[1+1];
        System.out.println("Azzzz" + var);

    }
    public static boolean isEmpty(String s) {
        return (s == null | s.length() == 0);
    }
    //Null pointer exception when ran below, will not compile method in main



        public void addTwo(int value2){

        System.out.println("Beginning" + value2);//when i call method from main i pass 6 as int, this it prints 6
        value2 = value2 + 3;
        System.out.println("end" +value2);//when i call it again i have reassigned value2 + 3, so 9 prints
       /*
       This is very good example of passing primitives by value to methods
        */

    }


    public static void main(String[] args) {
        Dukes dfg = new Dukes();
        dfg.print();
        dfg.addStudd(29);
        dfg.strata(36.5f);//spits out 23.6f, as it gets reassigned
        dfg.addTwo(6);
        Dukes eeeee = new Dukes();
       eeeee.sampleMethod(7);
        Dukes dfl = new Dukes();
        Dukes dfb = new Dukes();
        Dukes dfj = new Dukes();
        System.out.println("Packages" +dfl.getPackageTrackingNumber());//prints 101
        System.out.println("Packages" +dfb.getPackageTrackingNumber());//prints 102
        System.out.println("Packer" +dfj.getPackageTrackingNumber());//prints 103
        /*
        prints 10 and 68 to console
        it is reassigned from 10 to 38, then incremented to 39, once object method call invoked it becomes
        39 + 29(passing int as parameter from addStudd method
         */
        dfg.validNumber();

        if (isEmpty(null)) {
            System.out.println("Empty");
        } else {
            System.out.println("Not_empty");
        }
    }
}