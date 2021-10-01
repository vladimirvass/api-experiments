package ie.msg.products.databinding.icm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductItem {

    @JsonProperty("product-type")
    private ProductType productType;

    @JsonProperty("@sku")
    private String asku;

    @JsonProperty("supplier")
    private Supplier supplier;

    @JsonProperty("available")
    private String available;

    @JsonProperty("online")
    private String online;

    @JsonProperty("sku")
    private String sku;

    @JsonProperty("custom-attributes")
    private CustomAttributes customAttributes;

    @JsonProperty("manufacturer")
    private Manufacturer manufacturer;

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getaSku() {
        return asku;
    }

    public void setaSku(String asku) {
        this.sku = asku;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public CustomAttributes getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(CustomAttributes customAttributes) {
        this.customAttributes = customAttributes;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return
                "ProductItem{" +
                        "product-type = '" + productType + '\'' +
                        ",@sku = '" + sku + '\'' +
                        ",supplier = '" + supplier + '\'' +
                        ",available = '" + available + '\'' +
                        ",online = '" + online + '\'' +
                        ",sku = '" + sku + '\'' +
                        ",custom-attributes = '" + customAttributes + '\'' +
                        ",manufacturer = '" + manufacturer + '\'' +
                        "}";
    }
}