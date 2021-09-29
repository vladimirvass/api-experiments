package dbk.datapool.demo.data;


/**
 * Enumeration of Product data set providing item name and its SKU
 * @author vlad vasilev
 */
public enum ProductData {

    NONE(""),
    CARTIER_LOVE_AMBRAND("470601027700000"),
    MAISON_FRANCIS_KURKDJIAN("346909005100000"),
    TOMMY_HILFIGER("211006000286046");

    public String productSKU;


    /**
     * One parameter constructor for retrieving enum value
     * @param productSKU as string
     */
    ProductData(String productSKU) {
        this.productSKU = productSKU;
    }

    /**
     * Returns the name of this enum constant, exactly as declared in its enum declaration
     * @return The name of this enum constant
     */
    public String value() {
        return name();
    }

    /**
     * Return string from the enum value
     * @return the enum option(StockKeepingUnit of the product) as text
     */
    public String getProductSKU() {
        return this.productSKU;
    }
}
