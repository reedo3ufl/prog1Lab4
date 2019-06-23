import java.util.Scanner;

/*Reedom Rahman
 *This program will act as a calculator for simple computations
 */



public class SciCalculator{

    /*In the main method, the program will prompt user two values and to choose a computation option from a menu and carry
     *out that chosen option with the numbers provided.
     */
    public static void main(String[] args){

        Scanner answer = new Scanner(System.in);

        //Initializing Variables
        double firstOperand;
        double secondOperand;
        int menuUserInput;
        double currentResult = 0.0;
        boolean programContinue = true;
        boolean calculationPerformed = false;
        int numCalculations = 0;
        double[] myArray = new double[100];
        int index = 0;
        int arraySize;

        System.out.println("Current Result: " + currentResult);
        System.out.println();

        //Prints out the menu and prompts user to select an option
        System.out.println("Calculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");

        //Prompt user to choose an option from the menu
        System.out.println("Enter Menu Selection: ");
        menuUserInput = answer.nextInt();

        //While loop allows program to continue or end
        while(programContinue) {

            //Exits the program
            if (menuUserInput == 0) {

                programContinue = false;
                System.out.println("Thanks for using this calculator. Goodbye!");

            }

            //If user chooses option 1 then operands are added and final value is outputted
            else if (menuUserInput == 1) {

                //Prompt user for inputs
                System.out.println("Enter first operand: ");
                firstOperand = answer.nextDouble();
                System.out.println("Enter second operand: ");
                secondOperand = answer.nextDouble();

                //Keeps track of number of calculations
                numCalculations++;

                //Operation
                currentResult = firstOperand + secondOperand;

                //Saves current Result to an array, so can do computations to it later
                myArray[index]=currentResult;
                index++;
                calculationPerformed = true;

                System.out.println("Current Result: " + currentResult);
                System.out.println();

                //Prints out the menu and prompts user to select an option
                System.out.println("Calculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");


                System.out.println("Enter Menu Selection: ");
                menuUserInput = answer.nextInt();
            }

            //If user chooses option 2, then operands are subtracted and final value is outputted
            else if (menuUserInput == 2) {

                //Prompt user for Operand
                System.out.println("Enter first operand: ");
                firstOperand = answer.nextDouble();
                System.out.println("Enter second operand: ");
                secondOperand = answer.nextDouble();
                numCalculations++;
                currentResult = firstOperand - secondOperand;

                //Saves it to an array
                myArray[index]=currentResult;
                index++;

                calculationPerformed = true;

                System.out.println("Current Result: " + currentResult);
                System.out.println();

                //Prints out the menu and prompts user to select an option
                System.out.println("Calculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");


                System.out.println("Enter Menu Selection: ");
                menuUserInput = answer.nextInt();
            }

            //If user chooses option 3, then operands are multiplied and final value is outputted
            else if (menuUserInput == 3){

                //Prompts for an operand
                System.out.println("Enter first operand: ");
                firstOperand = answer.nextDouble();
                System.out.println("Enter second operand: ");
                secondOperand = answer.nextDouble();

                numCalculations++;

                //Multiplication Operand
                currentResult = firstOperand * secondOperand;

                //Saves it to an array
                myArray[index]=currentResult;
                index++;

                calculationPerformed = true;

                System.out.println("Current Result: " + currentResult);
                System.out.println();

                //Prints out the menu and prompts user to select an option
                System.out.println("Calculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");


                System.out.println("Enter Menu Selection: ");
                menuUserInput = answer.nextInt();
            }

            //If user chooses option 4, then operands are divided and final value is outputted
            else if (menuUserInput == 4) {

                //Prompts user for Operands
                System.out.println("Enter first operand: ");
                firstOperand = answer.nextDouble();
                System.out.println("Enter second operand: ");
                secondOperand = answer.nextDouble();

                //Division Operation
                currentResult = firstOperand / secondOperand;
                numCalculations++;
                myArray[index]=currentResult;
                index++;
                calculationPerformed = true;

                System.out.println("Current Result: " + currentResult);
                System.out.println();

                //Prints out the menu and prompts user to select an option
                System.out.println("Calculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");


                System.out.println("Enter Menu Selection: ");
                menuUserInput = answer.nextInt();
            }
            //If user chooses option 5, then the function is exponentiation
            else if (menuUserInput == 5) {

                System.out.println("Enter first operand: ");
                firstOperand = answer.nextDouble();
                System.out.println("Enter second operand: ");
                secondOperand = answer.nextDouble();

                /*The exponentiation operand was found through this link
                 *Author: baeldung
                 * https://www.baeldung.com/java-math-pow
                 */
                currentResult = Math.pow(firstOperand,secondOperand);

                //Add the result to an array to do average and sum calculations
                myArray[index]=currentResult;
                index++;
                numCalculations++;

                calculationPerformed = true;

                System.out.println("Current Result: " + currentResult);
                System.out.println();

                //Prints out the menu and prompts user to select an option
                System.out.println("Calculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");


                System.out.println("Enter Menu Selection: ");
                menuUserInput = answer.nextInt();
            }

            //If user chooses option 6, then the function is logarithm
            else if (menuUserInput == 6) {

                //Prompts user for operands
                System.out.println("Enter first operand: ");
                firstOperand = answer.nextDouble();
                System.out.println("Enter second operand: ");
                secondOperand = answer.nextDouble();

                /*The code for the logarithmic function was taken from this website
                 * http://blog.dreasgrech.com/2010/02/finding-logarithm-of-any-base-in-java.html
                 */
                currentResult = Math.log(secondOperand)/Math.log(firstOperand);

                myArray[index]=currentResult;
                index++;
                numCalculations++;
                calculationPerformed = true;

                System.out.println("Current Result: " + currentResult);
                System.out.println();

                //Prints out the menu and prompts user to select an option
                System.out.println("Calculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");


                System.out.println("Enter Menu Selection: ");
                menuUserInput = answer.nextInt();

            }

            //If user chooses option 6, then the function displays average
            else if (menuUserInput == 7) {

                //Checks this condition to see whether any calculations were done
                if(!calculationPerformed){

                    System.out.println("Error: No calculations yet to average!\n");

                    System.out.println("Enter Menu Selection: ");
                    menuUserInput = answer.nextInt();
                }

                //If calculations have been done, then the average, sum and the number of computations will be outputted
                else if (calculationPerformed){
                    //Finding the Sum
                    double sum = 0;
                    double average = 0;

                    //This for loop shifts through the array, and it adds each value of the array to get the sum
                    for(int i = 0;i <= index ;i++){

                        sum += myArray[i];

                        }

                    //Formula calculates the average
                    average = sum/index;

                    System.out.println("Sum of calculations: " + sum);
                    System.out.println("Number of calculations: " + numCalculations);

                    /*To make sure only two decimal values are outputted by the average, the code below is used
                     *It was taken from this website: https://stackoverflow.com/questions/12990451/print-integer-with-2-decimal-places-in-java
                     * Author: YoYo
                     */
                    System.out.println("Average of calculations: \n" + String.format("%.2f", average));

                    System.out.println("Enter Menu Selection: ");
                    menuUserInput = answer.nextInt();
                }


            }

            //If user chooses an option other than what is on the menu, print out an error message
            else
            {
                System.out.println("Error: Invalid selection!\n");

                System.out.println("Enter Menu Selection: ");
                menuUserInput = answer.nextInt();
            }
        }
    }

}