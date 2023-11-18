package homework_nr6;

public class Invoice {
    static int billOfElectricalAppliances;
    String modelOFDevice;
    String modelDescription;
    int numberOfProductsPurchased;
    double amount;

    public Invoice(String modelOFDevice, String modelDescription, int numberOfProductsPurchased, double amount) {
        this.modelOFDevice = modelOFDevice;
        this.modelDescription = modelDescription;
        this.numberOfProductsPurchased = numberOfProductsPurchased;
        if (amount > 0){
            this.amount = amount;
        } else {
            this.amount = 0;
        }
    }

    public String getModelOFDevice() {
        return modelOFDevice;
    }

    public void setModelOFDevice(String modelOFDevice) {
        this.modelOFDevice = modelOFDevice;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public int getNumberOfProductsPurchased() {
        return numberOfProductsPurchased;
    }

    public void setNumberOfProductsPurchased(int numberOfProductsPurchased) {
        this.numberOfProductsPurchased = numberOfProductsPurchased;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}