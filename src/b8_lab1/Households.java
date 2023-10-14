package b8_lab1;

import java.time.LocalDate;
import java.util.ArrayList;

import static b8_lab1.Main.scan;

public class Households {
    private int id;
    private int houseNumber;
    private ArrayList<FamilyMember> familyMemberLists;
    private int memberNumber;


    public ArrayList<FamilyMember> familyInput(int n) {
        ArrayList<FamilyMember> familyMembers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten thanh vien thu "+(i+1)+": ");
            String name = scan.nextLine();
            System.out.printf("Nhap id: ");
            int id = Integer.parseInt(scan.nextLine());
            System.out.printf("Nhap dob:(dd-MM-YY) ");
            String dob = scan.nextLine();

            System.out.print("Nhap cong viec: ");
            String job = scan.nextLine();
            FamilyMember familyMember = new FamilyMember(id,name,dob,job);
            familyMembers.add(familyMember);
        }
        return familyMembers;
    }

    public void setFamilyMemberLists(ArrayList<FamilyMember> familyMemberLists) {
        this.familyMemberLists = familyMemberLists;
    }

    public ArrayList<FamilyMember> getFamilyMemberLists() {
        return familyMemberLists;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }


    public Households(int id, int houseNumber, int memberNumber) {
        this.id = id;
        this.houseNumber = houseNumber;
        this.memberNumber = memberNumber;
    }

    public Households() {
    }

    @Override
    public String toString() {
        return "Households co " +
                "id= " + id +
                ", houseNumber= " + houseNumber +"so thanh vien: "+ memberNumber+" "
                ;
    }
}
