

import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {

            int floor = 9;

            do {
            switch (floor) {
                case 9:
                    System.out.println("Етаж 9");
                    System.out.println("Чао Миме!");
                    break;
                case 8:
                    System.out.println("Етаж 8");
                    System.out.println("Здравей Пепи.");
                    break;
                case 7:
                    System.out.println("Етаж 7");
                    System.out.println("ЗДР Ваня.");
                    break;
                case 6:
                    System.out.println("Етаж 6");
                    System.out.println("КП Виктория.");
                    break;
                case 5:
                    System.out.println("Етаж 5");
                    System.out.println("Мараба Сийке.");
                    break;
                case 4:
                    System.out.println("Етаж 4");
                    System.out.println("Кво стаа Иве.");
                    break;
                case 3:
                    System.out.println("Етаж 3");
                    System.out.println("Кепаса Минке.");
                    break;
                case 2:
                    System.out.println("Етаж 2");
                    System.out.println("Как е Веси.");
                    break;
                case 1:
                    System.out.println("Етаж 1");
                    System.out.println("Тошко искам си карбурат...");
                    break;
                case 0:
                    System.out.println("Тротоар");
                    System.out.println("Ауч!!!");
                    break;
            }
            floor--;
            System.in.read();
        }
        while (floor > -1);

        }
    }

