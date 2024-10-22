package lesson6;

public class Homework6Lesson3 {
    public static void main(String[] args) {

        String text = "Я буду учиться лучше и лучше";
        StringBuffer result = new StringBuffer();

            for (char c : text.toCharArray()) {
                if ("аеёиоуыэюяАЕЁИОУЫЭЮЯ".indexOf(c) != -1) {
                    result.append(Character.toUpperCase(c));

                } else {
                    result.append(c);

                }

            }

        System.out.println(result.toString());
        }
    }


