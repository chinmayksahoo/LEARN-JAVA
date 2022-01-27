package com.company;

public class SwitchCaseEnumExample {
    public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}
    public static void main(String[] args) {
        Day[] DayNow = Day.values();
        for(Day Now : DayNow){
            switch (Now){
                case Sun -> System.out.println("Sunday");
                case Mon -> System.out.println("Monday");
                case Tue -> System.out.println("Tuesday");
                case Wed -> System.out.println("Wednesday");
                case Thu -> System.out.println("Thursday");
                case Fri -> System.out.println("Friday");
                case Sat -> System.out.println("Saturday");
            }
        }
    }
}
