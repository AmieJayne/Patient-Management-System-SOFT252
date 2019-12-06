public class Medicine {

    private String name;
    private int stockUnits;             // notifies secretary when stock is low


    public Medicine(String name, int stockUnits) {
        this.name = name;
        this.stockUnits = stockUnits;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockUnits() {
        return stockUnits;
    }

    public void setStockUnits(int stockUnits) {
        this.stockUnits = stockUnits;
    }
}
