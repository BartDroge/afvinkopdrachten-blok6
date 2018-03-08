/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
/ Theoretische opdracht
/ 1) stapel begint leeg. dan gebeurd er het volgende: stapel: leeg, stapel: 5. stapel 3,5. stapel: 5. stapel: 2,5. stapel: 8,2,5. stapel: 5. Stapel 1,9,5.
/ 2) Steeds checken dat wanneer een haakje geopend wordt, dat er ook weer een haakje daarvoor gesloten moet worden
/
*/
package blok6afvink3;



import java.io.IOException;

public class opdracht1 {

    private String input;

    public opdracht1(String in) {
        input = in;
    }

    public void check() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{': // opening symbols
                case '[':
                case '(':
                    theStack.push(ch); // push them
                    break;

                case '}': // closing symbols
                case ']':
                case ')':
                    if (!theStack.isEmpty()) // if stack not empty,
                    {
                        char chx = theStack.pop(); // pop and check
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '(')) {
                            System.out.println("Error: " + ch + " at " + j);
                        }
                    } else // prematurely empty
                    {
                        System.out.println("Error: " + ch + " at " + j);
                    }
                    break;
                default: // no action on other characters
                    break;
            }
        }
        if (!theStack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }

    public static void main(String[] args) throws IOException {
        String input = "{}(9+9)[432]{(329321)}";
        System.out.println(input);
        opdracht1 theChecker = new opdracht1(input);
        theChecker.check();
    }
}