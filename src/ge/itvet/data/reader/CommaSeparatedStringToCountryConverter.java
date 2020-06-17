package ge.itvet.data.reader;

import ge.itvet.data.model.Country;
import ge.itvet.exception.InvalidDataException;

public class CommaSeparatedStringToCountryConverter implements DataReader.DataConverter<Country, String> {

    @Override
    public Country convert(String value) throws InvalidDataException {
        // თუ მნიშვნელობა არ არსებოსბს ან ცარიელია, მაშინ ვაბრინებთ null-ს
        if (value == null || value.trim().isEmpty())
            return null;

        // მნიშვნებლობის დაყოფა მძიმით.
        String[] split = value.split(",");

        /*
        რადგან ვიცი რომ ქყეყანა 3ველისგან შეცგება, ამიტომ, სტრიქონშიც 3 მნიშვნელობა უნდა მქონდეს.
        აქ შემიძლია Exception-ის გამოყენება, მაგრამ რადგან ჯერ არ გაგვივლია, ამიტომ, ამას დავჯერდი.
         */
        if (split.length != 3)
            throw new InvalidDataException("split.length != 3 " + value);

        return new Country(split[0].trim(), Integer.parseInt(split[1].trim()), Integer.parseInt(split[2].trim()));
    }
}
