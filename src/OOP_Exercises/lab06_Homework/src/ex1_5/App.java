package OOP_Exercises.lab06_Homework.src.ex1_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        /* TODO: write code to test program */
        testOriginalData();

        System.out.println("\n===============================");
        testSortIncreasingByPopulation();
        testSortDecreasingByPopulation();

        System.out.println("\n===============================");
        testSortIncreasingByArea();
        testSortDecreasingByArea();

        System.out.println("\n===============================");
        testSortIncreasingByGdp();
        testSortDecreasingByGdp();

        System.out.println("\n===============================");
        testFilterAfricaCountry();
        testFilterAsiaCountry();
        testFilterEuropeCountry();
        testFilterNorthAmericaCountry();
        testFilterOceaniaCountry();
        testFilterSouthAmericaCountry();

        System.out.println("\n===============================");
        testFilterMostPopulousCountries();
        testFilterLeastPopulousCountries();

        System.out.println("\n===============================");
        testFilterLargestAreaCountries();
        testFilterSmallestAreaCountries();

        System.out.println("\n===============================");
        testFilterHighestGdpCountries();
        testFilterLowestGdpCountries();

    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
                switch (dataList.get(5)) {
                    case "Africa":
                        Country africa = new AfricaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                        countryManager.append(africa);
                        break;
                    case "Asia":
                        Country asia = new AsiaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                        countryManager.append(asia);
                        break;
                    case "Europe":
                        Country europe = new EuropeCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                        countryManager.append(europe);
                        break;
                    case "North America":
                        Country northAmerica = new NorthAmericaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                        countryManager.append(northAmerica);
                        break;
                    case "Oceania":
                        Country oceania = new OceaniaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                        countryManager.append(oceania);
                        break;
                    case "South America":
                        Country southAmerica = new SouthAmericaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                        countryManager.append(southAmerica);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "C:\\Users\\DELL\\TestJava\\JavaProgramming\\OOP_EXERCISES\\Lab6_Homework\\src\\data\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }
}

