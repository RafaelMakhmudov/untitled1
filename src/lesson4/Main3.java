package lesson4;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        // напишем таймер с максимальным рабочим временем з года если его не выключать
        // данный таймер должен постоянно печатать на консоль сколько времени
        // прошло от старта
        for (int year = 0; year < 3; year++) { // тело работает 1 год
            for (int month = 0; month < 12; month++) { // тело работает 1 месяц

                for (int day = 0; day < 30; day++) {// тело работает 1 день
                    for (int hour = 0; hour < 24; hour++) { // тело работает 1 час

                        for (int minute = 0; minute < 60; minute++) {// тело работает 1 минуту
                            for (int second = 0; second < 60; second++) {// тело работает 1 секунду

                                Thread.sleep(1000);
                                System.out.printf("Со старта прошло: %d года, %d месяца, %d дней, %d часа, %d минут,%d секунды.\n", year, month, day, hour, minute, second);


                            }

                        }
                    }

                }

            }
        }
    }
}