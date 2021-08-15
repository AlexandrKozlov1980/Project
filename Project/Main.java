package Alex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            String inputString;
            String outPutString;
            String answerInArab;
            boolean flag;
            int num;
            char sign;
            double answer;

            Scanner input = new Scanner(System.in);
            inputString = input.nextLine();

            InputOutputBlock IO = new InputOutputBlock();
            IO.input = inputString;
            outPutString = IO.convToArab(inputString);

            flag = IO.flag;

            Calculate calc = new Calculate();
            calc.input = outPutString;
            answer = calc.calculate(outPutString);

            num = (int) answer;


            if ((flag == true) && (num == 0)) {
                System.out.println("Ответ в римской системе исчесления не существует");
            } else if (flag == true) {
                //num = (int) answer;
                InputOutputBlock convertRTA = new InputOutputBlock();
                convertRTA.inputAnswer = num;
                answerInArab = convertRTA.convertToArab(num);
                System.out.println(answerInArab);

            } else {
                System.out.println(answer);
            }

        } catch (Exception ex) {
            System.out.println("Ошибка");
        }
    }
}
