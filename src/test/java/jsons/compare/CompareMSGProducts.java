package jsons.compare;

import com.google.common.collect.ImmutableSet;
import dbk.datapool.demo.helper.ReadJsonFromFile;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareMSGProducts {

    ReadJsonFromFile jsonObject;

    @Test
    public void comparePIMandICM() {
        jsonObject = new ReadJsonFromFile();

        // Get a collection of all ICM SKUs
        List<Object> icmSKUs = jsonObject.getAllSKUsFromICMJSON("ICMProducts.json");
        System.out.println("Number of all valid ICM SKUs : " + icmSKUs.size());

        // Get a collection of all PIM SKUs
        List<Object> pimSKUs = jsonObject.getAllSKUsFromPIMJSON("PIMProducts.json");
        System.out.println("Number of all valid PIM SKUs : " + pimSKUs.size());

        // Compare both collections
        List<Object> differences = jsonObject.getDifferencesBetweenTwoCollections(icmSKUs, pimSKUs);

        // Print out the number of all SKUs IMPORTED into Intershop
        System.out.println("Number of all valid PIM SKUs IMPORTED into Intershop (incl. duplicates): " + differences.size());

        // Java, expensive as performance
        Set<Object> pureJavaSet = new HashSet<>(differences);
        System.out.println("Number of all valid PIM SKUs IMPORTED into Intershop (unique SKUs only, Java): " + pureJavaSet.size());

        // transform List<Object> to Set<Object> by using Guava lib
        Set<Object> set = ImmutableSet.copyOf(differences);
        // Print out the number of missing SKUs in Intershop, no duplicates
        System.out.println("Number of all valid PIM SKUs IMPORTED into Intershop (unique SKUs only, Guava): " + set.size() + "\n");

        // Print out the missing SKUs in Intershop (excl. duplicates)
        System.out.println(set);

    }

}
