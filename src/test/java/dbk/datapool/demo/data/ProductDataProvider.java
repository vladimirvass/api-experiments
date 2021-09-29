package dbk.datapool.demo.data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Class to implement the data provider method/s for the testng product suite
 * @author vlad vasilev
 */
public final class ProductDataProvider {

    /**
     * Obtain a data provider for all product SKUs in the 'ProductData' enum
     * The default option is not returned
     * @return An iterator for the matching enum options
     */
    @DataProvider(name = "allProductSKUOptions")
    public static Iterator<Object[]> getProductSKUOptions() {
        final Collection<Object[]> productSKUs = new ArrayList<>();
        productSKUs.addAll(EnumSet.complementOf(EnumSet.of(ProductData.NONE)).stream()
                .map(e -> new Object[]{e})
                .collect(Collectors.toList()));
        return productSKUs.iterator();
    }

}
