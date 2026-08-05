package controllers;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.MaintenanceRequest;

public class MaintenanceController {
  public Set<MaintenanceRequest> filterAndOrderRequests(List <MaintenanceRequest> requests, double maximumImpact){
    Set<MaintenanceRequest> ordenar = new TreeSet<>((s1,s2)->{
       int comparador = Double.compare(s1.getMetrics().getImpact(), s2.getMetrics().getImpact());
        if( comparador != 0){
        return comparador;
      }
      int compara = Double.compare(s2.getUrgency(), s1.getUrgency());
        if(compara != 0){
        return compara;
      }
      return s2.getRequestCode().compareToIgnoreCase(s1.getRequestCode()); 

      });
      for(MaintenanceRequest hola : requests){
        if(hola.getMetrics().getImpact()<= maximumImpact){
          ordenar.add(hola);
        }

      }
      return ordenar;

    
  }
  public List<MaintenanceRequest> claMaintenanceRequests(List<MaintenanceRequest> requests, String requestedCategory){
    Comparator<MaintenanceRequest> comparador = (t1,t2)->{
      int comparate = Integer.compare(t1.getMetrics().getCompletedChecks(), t2.getMetrics().getCompletedChecks());{
        if (comparate != 0){
          return comparate;

        }
        int comparete1 = Double.compare(t2.getMetrics().getImpact(), t1.getMetrics().getImpact());
          if (comparete1 != 0){
            return comparete1;

        }
        return t1.getRequestCode().compareToIgnoreCase(t2.getRequestCode());

      }
    };
    Map<String,TreeSet<MaintenanceRequest>> mapa = new TreeMap<>();
    mapa.put("URGENT", new TreeSet<>(comparador));
    mapa.put("PLANNED", new TreeSet<>(comparador));
    mapa.put("ROUTINE", new TreeSet<>(comparador));
for (MaintenanceRequest maintenanceRequest : requests) {
  if(maintenanceRequest.getUrgency() >= 5 || maintenanceRequest.getMetrics().getCompletedChecks()>=18){
    mapa.get("URGENT").add(maintenanceRequest);
  }else if(maintenanceRequest.getMetrics().getImpact()>=700){
   mapa.get("PLANNED").add(maintenanceRequest);


  }else 
    mapa.get("ROUTINE").add(maintenanceRequest);
  }
  


  }
}
     
      


  


  

