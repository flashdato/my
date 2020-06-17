package ge.itvet.data.reader;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    /**
     * csv ფაილიდან კითხულობს მონაცემებს. თითოეულ ხაზს გადასცემს კონვერტერს, კნვერტეტის მიერ დაკონვერტირებული მონაცემი,
     * დამენატება დასაბრუნებელ სიას. დაბრუნბდება ობიექტების სია.
     *
     * @param filePath  ფაილის მისამართი
     * @param converter სტიქონის გადაყვანის ლოგიკა ობიექტად.
     * @param <T>       იბიექტის ტიპი, რომელიც წერია ფაილში.
     * @return ამოკიხული ობიექტების სია.
     * @throws IOException
     */
    public static <T> List<T> readSCVData(String filePath, DataConverter<T, String> converter) throws IOException {

        // შევქმენი ფაილის წასაკითხად სკანერი.
        Scanner scanner = new Scanner(new File(filePath), StandardCharsets.UTF_8);

        // აქ ჩაიყრება დაკონვერტირებული მონაცემები.
        List<T> data = new ArrayList<>();

        // თუ რამე ჩანაწერი წერია, მაშინ პირველი ხაზი სათაურები იქნება, და სათაური უნდა გამოვტოვო
        if (scanner.hasNext()) scanner.nextLine();

        while (scanner.hasNext()) {
            /*
            ამოიკითხავს ხაზს, გადასცემს კონვერტერს პარამეტრად, დაამატებს სიას.
             */
            data.add(converter.convert(scanner.nextLine()));
        }
        return data;
    }

    public interface DataConverter<T, F> {
        T convert(F value);
    }
}
