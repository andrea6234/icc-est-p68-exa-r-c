import java.util.List;
import java.util.Set;

import controllers.MaintenanceController;
import data.MaintenanceData;
import models.MaintenanceRequest;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        List<MaintenanceRequest> requests = MaintenanceData.createRequests();

MaintenanceController controller = new MaintenanceController();

Set<MaintenanceRequest> ordered =
        controller.filterAndOrderRequests(requests, 600);

List<MaintenanceRequest> urgent =
        controller.claMaintenanceRequests(requests, "URGENT");

System.out.println("Method A: " + ordered.size());
System.out.println("URGENT: " + urgent.size());
runMetodo1(requests);
    }

    private static void runMetodo1(List<MaintenanceRequest> requests) {
        for(MaintenanceRequest hola : requests){
            

        }
    }
    
}
