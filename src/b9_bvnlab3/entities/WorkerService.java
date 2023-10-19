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

    public void upSalary(ArrayList<Worker> workers) {
        System.out.print("Nhap ten cong nhan tang luong: ");
        String workerInput = scan.nextLine();
        for (Worker i:
             workers) {
            if(i.getName().equalsIgnoreCase(workerInput)) {
                System.out.print("Nhap so luong tang: ");

                i.setSalary((i.getSalary())+Double.parseDouble(scan.nextLine()));
            }
        }
    }
    public void downSalary(ArrayList<Worker> workers) {
        System.out.print("Nhap ten cong nhan giam luong: ");
        String workerInput = scan.nextLine();
        for (Worker i:
                workers) {
            if(i.getName().equalsIgnoreCase(workerInput)) {
                System.out.print("Nhap so luong giam: ");

                i.setSalary((i.getSalary())-Double.parseDouble(scan.nextLine()));
            }
        }
    }

     public void menu(ArrayList<Worker> workers ) {
            System.out.println("Menu: ");
            System.out.println("1.AddWorker"+
                    "\n2.UpSalary"+"\n3.DownSalary"+
                    "\n4.Display information salary"+"\n4.Exit");
         System.out.println("Nhap lua chon: ");
            String choice = scan.nextLine();
         do {

             switch (choice) {
                 case "1":
                     inputWorkerArray(workers);
                     break;
                 case "2":
                     upSalary(workers);
                     break;
                 case "3":
                     downSalary(workers);
                     break;
             }
             System.out.println("Nhap lua chon: ");
             choice = scan.nextLine();
             if (choice.equalsIgnoreCase("4")) {
                 System.out.println(workers);
             }
         }
         while (choice.equalsIgnoreCase("4")==false);

        }

    }


