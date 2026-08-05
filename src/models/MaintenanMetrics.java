package models;

public class MaintenanMetrics {
  private double estimatedHours;
    private int affectedDevices;
    private int completedChecks;
    private int pendingChecks;
    public MaintenanMetrics(double estimatedHours, int affectedDevices, int completedChecks, int pendingChecks) {
      this.estimatedHours = estimatedHours;
      this.affectedDevices = affectedDevices;
      this.completedChecks = completedChecks;
      this.pendingChecks = pendingChecks;
    }
    public double getEstimatedHours() {
      return estimatedHours;
    }
    public int getAffectedDevices() {
      return affectedDevices;
    }
    public int getCompletedChecks() {
      return completedChecks;
    }
    public int getPendingChecks() {
      return pendingChecks;
    }
    public double getImpact(){
      return estimatedHours * affectedDevices;
    }
    @Override
    public String toString() {
      return "MaintenanMetrics [estimatedHours=" + estimatedHours + ", affectedDevices=" + affectedDevices
          + ", completedChecks=" + completedChecks + ", pendingChecks=" + pendingChecks + "]";
    }
    
                    
  
}
