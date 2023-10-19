package b9_bvnlab3.entities;

import b9_bvnlab3.service.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public static Scanner scan = new Scanner(System.in);
    public Worker input() {
        Worker worker = new Worker();
        System.out.print("Nhap ten: ");
        worker.setName(scan.nextLine());
        System.out.print("Nhap tuoi: ");
        worker.setAge(Integer.parseInt(scan.nextLine()));
        System.out.print("Nhap noi lam viec: ");
        worker.setWorkPlace(scan.nextLine());
        System.out.print("Nhap luong: ");
        worker.setSalary(Double.parseDouble(scan.nextLine()));
        return worker;
    }

    public void inputWorkerArray(ArrayList<Worker> workers) {
        String choice="";
        do {
            workers.add(input());
            System.out.print("B co muon nhap tiep(y/n):");
            choice = scan.nextLine();
        }
        while (choice.equalsIgnoreCase("y"));
    }

    public void upSalary(ArrayList<Worker> workers,String operator) {
        System.out.print("Nhap ten cong nhan tang luong: ");
        String workerInput = scan.nextLine();
        for (Worker i :
                workers) {
            if (i.getName().equalsIgnoreCase(workerInput) && operator.equalsIgnoreCase("+")) {
                System.out.print("Nhap so luong tang: ");

                i.setSalary((i.getSalary()) + Double.parseDouble(scan.nextLine()));
                break;
            } else {
                if (i.getName().equalsIgnoreCase(workerInput)) {
                    System.out.print("Nhap so luong giam: ");
                    i.setSalary((i.getSalary()) - Double.parseDouble(scan.nextLine()));
                    break;
                }

            }
        }
    }

     public void menu(ArrayList<Worker> workers ) {
           String choice = "";
         do {
             System.out.println("========  Menu: ========");
             System.out.println("1.AddWorker"+
                     "\n2.UpSalary"+"\n3.DownSalary"+
                     "\n4.Display information salary"+"\n4.Exit");
             System.out.println("Nhap lua chon: ");
              choice = scan.nextLine();
             switch (choice) {
                 case "1":
                     inputWorkerArray(workers);
                     break;
                 case "2":
                     upSalary(workers,"+");
                     break;
                 case "3":
                     upSalary(workers,"-");
                     break;

             }
             if (choice.equalsIgnoreCase("4")) {
                 System.out.println(workers);
             }
             else System.out.println("Sai lua chon :0 chon lai");
         }
         while (choice.equalsIgnoreCase("4")==false);
        }
}


