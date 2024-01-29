public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
            int age = 20;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то нужно немного подождать");
            }
        }
        {
            System.out.println("Задача 2");
            int temperature = 4;
            if (temperature < 5) {
                System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
            } else {
                System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
            }
        }
        {
            System.out.println("Задача 3");
            int speed = 30;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
            }else {
                System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
            }
        }
        {
            System.out.println("Задача 4");
            int age1 = 25;
            boolean ageForKindergarten = age1 >= 2 && age1 <= 6;
            boolean ageForSchool = age1 >= 7 && age1 <= 17;
            boolean ageForUniversity = age1 >= 18 && age1 <= 24;
            boolean ageForWork = age1 > 24;
            if (ageForKindergarten) {
                System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
            }
            if (ageForSchool) {
                System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
            }
            if (ageForUniversity) {
                System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
            }
            if (ageForWork) {
                System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
            }

        }
        {
            System.out.println("Задача 5");
            int age2 = 13;
            boolean ageWhenYouCanNotRide = age2 < 5;
            boolean ageWhenYouCanRideWithAnAdult = age2 >= 5 && age2 < 14;
            boolean ageWhenYouCanRide = age2 >= 14;
            if (ageWhenYouCanNotRide) {
                System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
            }
            if (ageWhenYouCanRideWithAnAdult) {
                System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            }
            if (ageWhenYouCanRide) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }
        {
            System.out.println("Задача 6");
            int allPlace = 102;
            int sitPlace = 60;
            int standPlace = 42;

            int numberPlace = 106;
            boolean placeToSit = numberPlace <= 60;
            boolean plaseToStand = numberPlace > 60 && numberPlace <= 102;
            if (placeToSit) {
                System.out.println("Вы можете занять сидячее место в вагоне под номером " + numberPlace);
            }
            if (plaseToStand) {
                System.out.println("Вы моежете ехать в вагоне стоя");
            } else if (numberPlace > 102) {
                System.out.println("Вагон уже забит полностью, мест нет");
            }
        }
            {
                System.out.println("Задача 7");
                int one = 10;
                int two = 2000;
                int three = 39;
                if (three>two && three>one) {
                    System.out.println("Самое большее число, это - " + three);
                }else if (two > one && two > three){
                    System.out.println("Самое большее число, это - " + two);
                }else if (one > two && one > three){
                    System.out.println("Самое большее число, это - " + one);
                }
            }

        }
   }