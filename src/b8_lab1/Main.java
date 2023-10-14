package b8_lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Households house = new Households(3, 4, 2);
        house.setFamilyMemberLists(house.familyInput(house.getMemberNumber()));

        System.out.println(house.toString());
        for (FamilyMember i :
                house.getFamilyMemberLists()) {
            i.display();
        }
    }
}
