package edu.janiru;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        String phone,name;
        int a,b,c,d,e,f,g;

        Scanner input = new Scanner(System.in);

        System.out.println("=========================================================================================  ");
        System.out.print("  __          __  _");	System.out.print("	  	");	System.out.print("	       ");		System.out.print(" _          ");	System.out.println("  _   __  __            _");
        System.out.print("  \\ \\        / / | |");	System.out.print("	  	");	System.out.print("	       ");		System.out.print("| |         ");	System.out.println(" (_) |  \\/  |          | |");
        System.out.print("   \\ \\  /\\  / /__| |");	System.out.print(" ___ ___ ");		System.out.print(" _ __ ___   ___   ");		System.out.print("| |_ ___    ");	System.out.println("  _  | \\  / | __ _ _ __| |_");
        System.out.print("    \\ \\/  \\/ / _ \\ |");	System.out.print("/ __/ _ \\");		System.out.print("| '_ ` _ \\ / _ \\  ");	System.out.print("| __/   \\   ");	System.out.println(" | | | |\\/| |/ _` | '__| __|   ");
        System.out.print("     \\  /\\  /  __/ |");	System.out.print(" (_| (_) ");		System.out.print("| | | | | |  __/  "); 	System.out.print("| || (_) |  ");	System.out.println(" | | | |  | | (_| | |  | |_");
        System.out.print("      \\/  \\/ \\___|_|");	System.out.print("\\___\\___/");	System.out.print("|_| |_| |_|\\___|   ");	System.out.print("\\__\\___/   ");	System.out.println(" |_| |_|  |_|\\__,_|_|   \\__|      ");
        System.out.print('\n');
        System.out.println("=========================================================================================  ");



        System.out.print('\n');
        System.out.print("Enter Customer Phone Number  -  ");
        phone = input.nextLine();

        System.out.print('\n');

        System.out.print("Enter Customer Name  -  ");

        name = input.nextLine();

        System.out.print('\n');
        System.out.println("=========================================================================================  ");


        System.out.println(" ");

        System.out.println("Enter the number of items you want to buy:");
        System.out.println(" ");

        System.out.println(" ");

        System.out.print("Basmathi Qty(Kg) - ");
        a = input.nextInt();
        System.out.print('\n');

        System.out.print("Dhal Qty(Kg)     - ");
        b = input.nextInt();
        System.out.print('\n');

        System.out.print("Sugar Qty(Kg)    - ");
        c = input.nextInt();
        System.out.print('\n');

        System.out.print("Highland Qty     - ");
        d = input.nextInt();
        System.out.print('\n');

        System.out.print("Yoghurt Qty      - ");
        e = input.nextInt();
        System.out.print('\n');

        System.out.print("Flour Qty(Kg)    - ");
        f = input.nextInt();
        System.out.print('\n');

        System.out.print("Soap Qty         - ");
        g = input.nextInt();
        System.out.print('\n');

        System.out.println("_________________________________________________________________________________________  ");
        System.out.print('\n');
        System.out.println(" ");
        double ua = 250, ub=180, uc=150, ud=1200, ue=50, uf=120,ug=160;

        double pa = ua*a;
        double pb = ub*b;
        double pc = uc*c;
        double pd = ud*d;
        double pe = ue*e;
        double pf = uf*f;
        double pg = ug*g;

        double total = pa+pb+pc+pd+pe+pf+pg;

        double dis = 10;
        double discount = (dis/100)*total;

        double fin = total - discount;


        System.out.println("+---------------------------------------------------+");

        System.out.printf("| %-10s   %-22s  %-10s |\n", "", " _   __  __            _", "");
        System.out.printf("| %-10s   %-22s  %-9s |\n", "", "(_) |  \\/  |          | |", "");
        System.out.printf("| %-10s   %-22s  %-8s |\n", "", " _  | \\  / | __ _ _ __| |_", "");
        System.out.printf("| %-10s   %-22s  %-5s |\n", "", "| | | |\\/| |/ _` | '__| __|  ", "");
        System.out.printf("| %-10s   %-22s  %-9s |\n", "", "| | | |  | | (_| | |  | |", "");
        System.out.printf("| %-10s   %-22s  %-7s |\n", "", "|_| |_|  |_|\\__,_|_|   \\__|", "");

        System.out.println("+---------------------------------------------------+");

        System.out.printf("| %-10s   %-26s  %-8s |\n", "", "# Tel   : "+phone, "");
        System.out.printf("| %-10s   %-26s  %-8s |\n", "", "# Name  :  "+name, "");


        System.out.println("+--------------+-------+-----------------+----------+");
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "Item", "Qty", "Unit Price", "Price");
        System.out.println("+--------------+-------+-----------------+----------+");
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "# Basmathi", a, ua, pa);
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "", "", "", "");
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "# Dhal", b, ub, pb);
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "", "", "", "");
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "# Suger", c, uc, pc);
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "", "", "", "");
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "# Highland", d, ud, pd);
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "", "", "", "");
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "# Yoghurt", e, ue, pe);
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "", "", "", "");
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "# Flour", f, uf, pf);
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "", "", "", "");
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "# Soap", g, ug, pg);
        System.out.printf("| %-12s | %-5s | %-15s | %-8s |\n", "", "", "", "");
        System.out.println("+--------------+-------+-----------------+----------+");
        System.out.printf("| %-20s | %-15s | %-8s |\n", "", "Total", total);
        System.out.println("|                      +-----------------+----------+");
        System.out.printf("| %-20s | %-15s | %-8s |\n", "", "Discount(10%)", discount);
        System.out.println("|                      +-----------------+----------+");
        System.out.printf("| %-20s | %-15s | %-8s |\n", "", "Price", fin);
        System.out.println("+----------------------+-----------------+----------+");




    }
}
