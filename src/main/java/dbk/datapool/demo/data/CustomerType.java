package dbk.datapool.demo.data;


/**
 * Enumeration of Customer data set providing customers from 3 different user groups
 * @author vlad vasilev
 */
public enum CustomerType {

    NONE(""),
    GUEST("auto_guest@gmail.com"),
    CONTRACTOR("auto_contractor@gmail.com"),
    REGULAR("auto_regular@gmail.com");

    public String customerType;


    /**
     * One parameter constructor for retrieving enum value
     * @param customerType as string
     */
    CustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     * Return string from the enum value
     * @return the enum option(customer type account) as text
     */
    public String getCustomerType() {
        return this.customerType;
    }
}
