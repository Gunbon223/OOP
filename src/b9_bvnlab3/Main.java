package b9_bvnlab3;

import b9_bvnlab3.entities.WorkerService;
import b9_bvnlab3.service.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workerArrayList = new ArrayList<>();
        WorkerService service = new WorkerService();
        service.menu(workerArrayList);
    }
}
