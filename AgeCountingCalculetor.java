import java.util.InputMismatchException;
import java.util.Scanner;
class AgeCountExeption extends RuntimeException{
    AgeCountExeption(){
        super();
    }
}
public class AgeCountingCalculetor {
    int date,date1,month,month1,year,year1;
   void setData(int data,int block,int CurrentData){
//%%%%%%%%%%% first block 1 data insert %%%%%%%%%%%%%%%%%%%%%%%%%%
       if(block==1){
           date1=data;
           date=CurrentData-data;
           if(data<0){
               date=data*-1;
           }else{
               date=data;
           }
       }
//%%%%%%%%%%% second block 2 data insert %%%%%%%%%%%%%%%%%%%%%%%%%
       else if(block==2){
           month1=data;
           data=CurrentData-data;
           month=data;
       }
//%%%%%%%%%% third block 3 data insert %%%%%%%%%%%%%%%%%5%%%%
       else{
           year1=data;
           data=CurrentData-data;
           year=data;
       }
   }
//    void setDate(int date){
//        int CurrentDate=8;
//        date1=date;
//        date=CurrentDate-date;
//        if(date<=0) {
//            this.date = date*-1;
//
//        }else {
//            this.date = date;
//        }
//    }
//    void setMonth(int month){
//        int CurrentMonth=12;
//        month1=month;
//        month=CurrentMonth-month;
//        this.month=month;
//    }
//    void setYear(int year){
//        int CurrentYear=2023;
//        year1=year;
//        year=CurrentYear-year;
//        this.year=year;
//    }
    static{
        System.out.println("\n\t\t\t\t\t\t\t\t\tInter Date Of Birth\n" +
                "\t\t********************  Welcome Age Counting For Voting   ********************\n");
    }
    public static void main(String[] args) {
        int date=0, month, year=0,loop1 = 0,loop2=0,block=1;
        int CurrentDate=9,CurrentMonth=12,CurrentYear=2023;
        AgeCountingCalculetor over=new AgeCountingCalculetor();
        while(loop1==0) {
            loop2=0;
            while (loop2 == 0) {
                Scanner sc = new Scanner(System.in);
        ///////////$$$$$$$$$$$$$$$$$$$$$$ FIRST BLOCK DATE INSERT $$$$$$$$$$$$$$$$$$$$$$$$$
                if (block == 1) {
                    System.out.print("Enter Your Date = ");
                    try {
                     //@@@@@@@@@@@@ FEUTURE EXCEPTION GENRET OTHER INPUT @@@@@@@@@@@@//
                        date = sc.nextInt();
                        if (date > 31 || date < 1) {
                            try {
                             //@@@@@@@@@@@@@ COUSTOM EXCEPTION CREAT AND THROW @@@@@@@@@@@@
                                throw new AgeCountExeption();
                            }
                         //@@@@@@@@@@@@@@ HANDAL WRONG INTEGER VALUE INPUT AND SHOW OUTPUT  @@@@@@@@@@@@@@@@
                            catch (AgeCountExeption ae) {
                                System.out.println("\n\tCorrect Inter Your Date\n");
                            }
                        } else {
                         //@@@@@@@@@@@@@@@@@@@ CALL FUNCTION DATA INSERT @@@@@@@@@@@@@@@@@@@@@@@@@@
                            over.setData(date ,block ,CurrentDate);
                         //++++++++++++++++ BLOCK 2 KE LIYE VALU INCREASE +++++++++++++
                            block = 2;
                        }
                    }
                 //@@@@@@@@@@  HANDAL MISAMACTH INPUT YOUR DATA OUTPUT SHOW   @@@@@@@@@
                    catch (InputMismatchException ae) {
                        System.out.println("\n\tNot Input other Value\n");
                    }
                }
        ///////////$$$$$$$$$$$$$$$$$$$$$$ SECOND BLOCK 2 DATE INSERT $$$$$$$$$$$$$$$$$$$$$$$$$
                else if (block == 2) {
                    System.out.print("Enter Your Month = ");
                    try {
                      //@@@@@@@@@@@@ FEUTURE EXCEPTION GENRET OTHER INPUT @@@@@@@@@@@@//
                        month = sc.nextInt();
                        if (month >= 13 || 1 > month) {
                         //@@@@@@@@@@@@@ COUSTOM EXCEPTION CREAT AND THROW @@@@@@@@@@@@
                            throw new AgeCountExeption();
                        } else {
                         //@@@@@@@@@@@@@@@@@@@ CALL FUNCTION DATA INSERT @@@@@@@@@@@@@@@@@@@@@@@@@@
                            over.setData(month ,block ,CurrentMonth);
                         //++++++++++++++++ BLOCK 3 KE LIYE VALU INCREASE +++++++++++++
                            block = 3;
                        }
                    }
                 //@@@@@@@@@@@@@@ HANDAL WRONG INTEGER VALUE INPUT AND SHOW OUTPUT  @@@@@@@@@@@@@@@@
                    catch (AgeCountExeption ae) {
                        System.out.println("\n\tCorrect Inter Your Month\n\nDate Insert Is = " + over.date1);
                    }
                 //@@@@@@@@@@  HANDAL MISAMACTH INPUT YOUR DATA OUTPUT SHOW   @@@@@@@@@
                    catch (InputMismatchException ae) {
                        System.out.println("\n\tNot Input Other Value\n\nDate Insert Is = " + over.date1);
                    }
                }
        /////$$$$$$$$$$$$$$$$$$$$$$ THIRD BLOCK 3 DATE INSERT $$$$$$$$$$$$$$$$$$$$$$$$$
                else if (block == 3) {
                    System.out.print("Enter Your Year = ");
                    try {
                      //@@@@@@@@@@@@ FEUTURE EXCEPTION GENRET OTHER INPUT @@@@@@@@@@@@//
                        year = sc.nextInt();
                        if (year >= 0 && year <= 1873 || year < 0) {
                         //@@@@@@@@@@@@@ COUSTOM EXCEPTION CREAT AND THROW @@@@@@@@@@@@
                            throw new AgeCountExeption();
                        } else if (year >= 2024) {
                         //@@@@@@@@@@@@@ COUSTOM EXCEPTION CREAT AND THROW @@@@@@@@@@@@
                            throw new AgeCountExeption();
                        } else {
                         //@@@@@@@@@@@@@@@@@@@ CALL FUNCTION DATA INSERT @@@@@@@@@@@@@@@@@@@@@@@@@@
                            //over.setYear(year);
                            over.setData(year ,block ,CurrentYear);
                         /*++++++++++++++++
                             BLOCK KA VALUE 4 ISLIYE KIYA GAYA KI AB KOI BLOCK NAHI CHALEGA
                            KYOKI SARE BLOCK ME DATA AA GAYA HAI
                            ++++++++++++
                             */
                            block = 4;
                        }
                    } catch (AgeCountExeption ae) {
                        System.out.println("\n\tCorrect Inter Your Year");
                        if(year<1874){
                            System.out.println("\tMinimum Year 1874 Inter");
                        }else{
                            System.out.println("\tInvalid Year Out Of Year "+ year);
                        }
                               System.out.println( "\nDate Insert Is = " + over.date1 + "\nMonth Insert Is = " + over.month1);
                    } catch (InputMismatchException ae) {
                        System.out.println("\n\tNot Input Other Value\n" +
                                "\nDate Insert Is = " + over.date1 + "\nMonth Insert Is = " + over.month1);
                    }
                } else if (block == 4) {
                    System.out.println("\n\t\t\tSuccess Full Insert Data.....\n\nDate Insert Is = " + over.date1 + "\t\n" +
                            "Month Insert Is = " + over.month1 + "\t\nYear Insert Is = " + over.year1 + "\n\n\t\t\tCalculated Your Age....." +
                            "\t\n\n" + over.year + " Year " + over.month + " Month " + over.date + " Day");
                    block = 0;
                } else {
               //@@@@@@@@@@@@ 18 SAAL SE CHOTA HAI TAB YAH BLOCK CHALEGA IF KA @@@@@@@@@@@@@@
                    if (over.year < 18) {
                        System.out.println("\n\t\tYou Can Not " +
                                "Vot \n\t\tYou Wating \n\t\tVot For 17 Pluse Age And " +
                                "Below 150 Year Age");
                        //@@@@@@@@ BLOCK KI VALUE 1 PHIR STARTING SE BLOCK KO CHALANE KE LIYE @@@@@@@@@@@@@@@@
                        block = 1;
                        //@@@@@@@ LOOP2 KO TERMINATE KARNE KE LIYE LOOP KI VALUE KO INCREASE KIYA GAYA @@@@@@@@
                        loop2 = 1;

                    }
               // 17 SALL SE UPER VALO KE LIYE YAH BLOCK CHALEGA ELSE VALA @@@@@@@@@@@@22
                    else {
                        System.out.println("\n\t\tYou Can Vot");
                        //@@@@@@@@ BLOCK KI VALUE 1 PHIR STARTING SE BLOCK KO CHALANE KE LIYE @@@@@@@@@@@@@@@@
                        block = 1;
                        //@@@@@@@ LOOP2 KO TERMINATE KARNE KE LIYE LOOP KI VALUE KO INCREASE KIYA GAYA @@@@@@@@
                        loop2 = 1;
                    }
                }
            }
         //%%%%%%%%%%%%%%%%%%%%%%% PROGRAME KHATAM HONE KE BAD YAH PRINT HOGA %%%%%%%%%%%%%%%%%%%%
            System.out.println("\nClose The Voting For Age Counting.....\n");
        }
    }
}