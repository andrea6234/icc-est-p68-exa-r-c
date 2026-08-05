package models;
public class MaintenanceRequest {
    private String requestCode;
    private String equipmentName;
    private MaintenanceMetrics metrics;
    private int urgency;
    public MaintenanceRequest(String requestCode, String equipmentName, MaintenanceMetrics metrics, int urgency) {
      this.requestCode = requestCode;
      this.equipmentName = equipmentName;
      this.metrics = metrics;
      this.urgency = urgency;
    }
    public String getRequestCode() {
      return requestCode;
    }
    public String getEquipmentName() {
      return equipmentName;
    }
    public MaintenanceMetrics getMetrics() {
      return metrics;
    }
    public int getUrgency() {
      return urgency;
    }
    @Override
    public String toString() {
      return "MaintenanceRequest [requestCode=" + requestCode + ", equipmentName=" + equipmentName + ", metrics="
          + metrics + ", urgency=" + urgency + "]";
    }
    
}


