import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR LOGIN DETAILS");
        System.out.println();
        System.out.println("ENTER USER NAME");
        String UserName = sc.nextLine();
        System.out.println();
        System.out.println("ENTER PASSWORD");
        String Password = sc.nextLine();
        if (Objects.equals(UserName, "User") && Objects.equals(Password, "Password123")) {
            System.out.println("WELCOME TO OUR PLATFORM ");
            System.out.println("WHAT KIND OF SERVICE YOU WANT FROM OUR PLATFORM(1 or 2)");
            System.out.println("1.PRICE PREDICTION FOR BUYING OR SELLING ");
            System.out.println("2.MONTHLY RENT PREDICTION");
            int Option = sc.nextInt();
            if (Option == 1) {
                System.out.println("YOU ARE SEARCHING DETAILS FOR(CHOOSE FROM 1,2,3) :-");
                System.out.println("1.APARTMENT");
                System.out.println("2.PLOT");
                System.out.println("3.BUILDER FLOOR");
                int Option1 = sc.nextInt();
                if (Option1 == 1) {

                    System.out.println("CHOOSE THE LOCALITY IN WHICH YOU WANT TO BUY OR SELL APARTMENT(1 TO 12 )");
                    System.out.println("1.MP NAGAR");
                    System.out.println("2.ARERA COLONY");
                    System.out.println("3.GANDHI NAGAR");
                    System.out.println("4.AWADHPURI");
                    System.out.println("5.PATEL NAGAR");
                    System.out.println("6.INDRAPURI");
                    System.out.println("7.SAKET NAGAR");
                    System.out.println("8.ASHOKA GARDEN");
                    System.out.println("9.KOLAR");
                    System.out.println("10.AYODHYA BYPASS ");
                    System.out.println("11.KATARA ");
                    System.out.println("12.SHAHPURA");
                    int Locality = sc.nextInt();
                    Double Rate = 0.0;
                    switch (Locality) {
                        case 1: {
                            Rate = 6833.33;
                            System.out.println("PRESENT RATE IN MP NAGAR IS  6,833.33 /sqft ");

                            break;
                        }
                        case 2: {
                            Rate = 7635.09;
                            System.out.println("PRESENT RATE IN ARERA COLONY IS 7,635.09/sqft   ");


                            break;
                        }
                        case 3: {
                            Rate = 4119.33;
                            System.out.println("PRESENT RATE IN GANDHI NAGAR IS 4,119.33/sqft ");


                            break;
                        }
                        case 4: {
                            Rate = 3235.64;
                            System.out.println("PRESENT RATE IN AWADHPURI IS  3,235.64/sqft ");


                            break;
                        }
                        case 5: {
                            Rate = 3750.00;
                            System.out.println("PRESENT RATE IN PATEL NAGAR IS  3750.00/sqft ");


                            break;
                        }
                        case 6: {
                            Rate = 2833.99;
                            System.out.println("PRESENT RATE IN INDRAPURI IS  2,833.99/sqft ");


                            break;
                        }
                        case 7: {
                            Rate = 2963.00;
                            System.out.println("PRESENT RATE IN SAKET NAGAR IS 2,963.00/sqft ");


                            break;

                        }
                        case 8: {
                            Rate = 3888.00;
                            System.out.println("PRESENT RATE IN ASHOKA GARDEN IS  3,888.00/sqft ");


                            break;
                        }
                        case 9: {
                            Rate = 5473.00;
                            System.out.println("PRESENT RATE IN KOLAR IS  5,473.00/sqft ");


                            break;
                        }
                        case 10: {
                            Rate = 2589.29;
                            System.out.println("PRESENT RATE IN AYODHYA BYPASS IS  2,589.29/sqft ");


                            break;
                        }
                        case 11: {
                            Rate = 3318.00;
                            System.out.println("PRESENT RATE IN KATARA IS  3,318.00/sqft ");


                            break;
                        }
                        case 12: {
                            Rate = 4730.01;
                            System.out.println("PRESENT RATE IN SHAHPURA IS  4,730.01/sqft ");


                            break;

                        }




                    }
                } else if (Option1==2){

                    System.out.println("CHOOSE THE LOCALITY IN WHICH YOU WANT TO BUY OR SELL PLOT(1 TO 12 )");
                    System.out.println("1.MP NAGAR");
                    System.out.println("2.ARERA COLONY");
                    System.out.println("3.GANDHI NAGAR");
                    System.out.println("4.AWADHPURI");
                    System.out.println("5.PATEL NAGAR");
                    System.out.println("6.INDRAPURI");
                    System.out.println("7.SAKET NAGAR");
                    System.out.println("8.ASHOKA GARDEN");
                    System.out.println("9.KOLAR");
                    System.out.println("10.AYODHYA BYPASS ");
                    System.out.println("11.KATARA ");
                    System.out.println("12.SHAHPURA");
                }
                else{

                    System.out.println("CHOOSE THE LOCALITY IN WHICH YOU WANT TO BUY OR SELL BUILDER FLOOR(1 TO 12 )");
                    System.out.println("1.MP NAGAR");
                    System.out.println("2.ARERA COLONY");
                    System.out.println("3.GANDHI NAGAR");
                    System.out.println("4.AWADHPURI");
                    System.out.println("5.PATEL NAGAR");
                    System.out.println("6.INDRAPURI");
                    System.out.println("7.SAKET NAGAR");
                    System.out.println("8.ASHOKA GARDEN");
                    System.out.println("9.KOLAR");
                    System.out.println("10.AYODHYA BYPASS ");
                    System.out.println("11.KATARA ");
                    System.out.println("12.SHAHPURA");
                }

            } else {
                System.out.println("RENTAL PART STARTS FROM HERE ");
            }
        }
        else{
            System.out.println("PLEASE ENTER CORRECT USERNAME AND PASSWORD");
        }

    }
}
