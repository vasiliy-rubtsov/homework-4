public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        {
            int age = 5;

            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг соврешеннолетия, надо немного подождать");
            }
        }
        System.out.println("---------------------------");

        // Задача 2
        System.out.println("Задача 2");
        {
            int temperature = 22;

            if (temperature >= 5) {
                System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
            } else {
                System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
            }
        }
        System.out.println("---------------------------");

        // Задача 3
        System.out.println("Задача 3");
        {
            int speed = 59;

            if (speed > 60) {
                System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
            }
        }
        System.out.println("---------------------------");

        // Задача 4
        System.out.println("Задача 4");
        {
            int age = 19;

            if (age < 2) {
                // Человеку меньше 2 лет
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно сидеть дома с мамой");
            } else if (age < 7) {
                // Если человеку от 2 до 6 лет включительно
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад");
            } else if (age < 18) {
                // Человеку от 2 до 17 лет включительно
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу");
            } else if (age < 25) {
                // Человеку от 18 до 24 лет включительно
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет");
            } else {
                // Человеку 25 лет и более
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить на работу");
            }
        }
        System.out.println("---------------------------");

        // Задача 5
        System.out.println("Задача 5");
        {
            int age = 15;

            if (age < 5) {
                // Ребенок не может кататься на аттракционе
                System.out.println("Если возраст ребенка равен " + age + " лет, то ему нельзя кататься на аттракционе");
            } else if (age < 14) {
                // Только в сопровождении взрослого
                System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                // Самостоятельно
                System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься на аттракционе без сопровождения взрослого");
            }

        }
        System.out.println("---------------------------");

        // Задача 6
        System.out.println("Задача 6");
        {
            int numbPassengers = 80;

            if (numbPassengers < 60) {
                // Пассижиров меньше, чем сидячих мест
                System.out.println("В вагоне есть сидячие и стоячие места");
            } else if (numbPassengers < 102) {
                    // Все сидячием места заняты, но остались стоячие
                    System.out.println("В вагоне остались только стоячие места");
            } else {
                // Вагон полностью забит
                System.out.println("Вагон полнотью забит");
            }
        }
        System.out.println("---------------------------");

        // Задача 7
        System.out.println("Задача 7");
        {
            int one = 25;
            int two = 76;
            int three= 31;

            if (one == two && one == three) {
                // Если все числа равны
                System.out.println("Все числа равны");
            } else {
                // Иначе - проверяем
                int maxValue = one; // Первоначальная гипотеза - наибольшим является чило one

                // Может быть, второе?
                if (maxValue < two) {
                    // Если да, меняем свое мнение относительно наибольшего числа. Теперь считаем таковым two
                    maxValue = two;
                }

                // Может быть, третье?
                if (maxValue < three) {
                    // Если да, меняем свое мнение относительно наибольшего числа. Теперь считаем таковым three
                    maxValue = three;
                }

                System.out.println("Наисбольшим из числел " + one + ", " + two + ", " + three + ", является число " + maxValue);
            }
        }
    }
}