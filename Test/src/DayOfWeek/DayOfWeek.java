package DayOfWeek;

import java.util.Scanner;


public class DayOfWeek {


    public String Caculate(int day, int month, int year) {
        StringBuilder[] Day = new StringBuilder[8];
        Day[0].append("Chủ Nhật");
        Day[1].append("Thứ Hai");
        Day[2].append("Thứ Ba");
        Day[3].append("Thứ Tư");
        Day[4].append("Thứ Năm");
        Day[5].append("Thứ Sáu");
        Day[6].append("Thứ ");
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return Day[(day + x + (31 * m0) / 12) % 7].toString();
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type day: ");

        int day = input.nextInt();
        System.out.println("Type month: ");

        int month = input.nextInt();
        System.out.println("Type year: ");

        int year = input.nextInt();
        DayOfWeek youbi = new DayOfWeek();

        System.out.println(youbi.Caculate(day, month, year));
    }
}
