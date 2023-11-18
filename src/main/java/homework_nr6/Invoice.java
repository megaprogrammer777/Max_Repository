package homework_nr6;

public class Invoice {
    static int billOfElectricalAppliances;
    String modelOFDevice;
    String modelDescription;
    int numberOfProductsPurchased;
    double priceOfProduct;

    public Invoice(String modelOFDevice, String modelDescription, int numberOfProductsPurchased, double priceOfProduct) {
        this.modelOFDevice = modelOFDevice;
        this.modelDescription = modelDescription;
        this.numberOfProductsPurchased = numberOfProductsPurchased;
        this.priceOfProduct = priceOfProduct;
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

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public static class Product {
        private int quantity;
        private double price;

        public Product(int quantity, double price) {
            setQuantity(quantity);
            setPrice(price);
        }

        public void setQuantity(int quantity) {
            this.quantity = Math.max(quantity, 0);
        }

        public void setPrice(double price) {
            this.price = Math.max(price, 0.0);
        }

        public double getAmount() {
            return quantity * price;
        }

        public static void main(String[] args) {
            Product myProduct = new Product(-5, -10.0);

            double totalAmount = myProduct.getAmount();
            System.out.println("Сумма счета: " + totalAmount);
        }
    }
}