package com.company;

public class PhoneNumberWordDecoder
{
    public static String textToNum(String phone)
    {
        int i = phone.length();
        char[] hold = phone.toCharArray();
        while (i > 0)
        {
            i--;
            switch (hold[i]) {
                case 'A':
                case 'a':
                case 'B':
                case 'b':
                case 'C':
                case 'c':
                    hold[i] = '2';
                    break;
                case 'D':
                case 'd':
                case 'E':
                case 'e':
                case 'F':
                case 'f':
                    hold[i] = '3';
                    break;
                case 'G':
                case 'g':
                case 'H':
                case 'h':
                case 'I':
                case 'i':
                    hold[i] = '4';
                    break;
                case 'J':
                case 'j':
                case 'K':
                case 'k':
                case 'L':
                case 'l':
                    hold[i] = '5';
                    break;
                case 'M':
                case 'm':
                case 'N':
                case 'n':
                case 'O':
                case 'o':
                    hold[i] = '6';
                    break;
                case 'P':
                case 'p':
                case 'Q':
                case 'q':
                case 'R':
                case 'S':
                    hold[i] = '7';
                    break;
                case 'T':
                case 't':
                case 'U':
                case 'u':
                case 'V':
                case 'v':
                    hold[i] = '8';
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    hold[i] = '9';
                    break;
            }
        }
        String answer = new String (hold);
        return answer;
    }
}
