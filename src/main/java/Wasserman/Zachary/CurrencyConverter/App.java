package Wasserman.Zachary.CurrencyConverter;

/**
 * Created by zacharywasserman on 11/9/16.
 */
public class App
{
    public String converter(String[] arr) {
        StringBuilder converted = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder toConvert = new StringBuilder();
            toConvert.append(arr[i]);
            while (toConvert.length() > 0) {

                char num = toConvert.charAt(0);
                if (toConvert.length() == 2 && toConvert.charAt(0) == '1')
                {
                    num = toConvert.charAt(1);
                    switch (num) {
                        case '1':
                            converted.append("Eleven");
                            break;
                        case '2':
                            converted.append("Twelve");
                            break;
                        case '3':
                            converted.append("Thirteen");
                            break;
                        case '4':
                            converted.append("Fourteen");
                            break;
                        case '5':
                            converted.append("Fifteen");
                            break;
                        case '6':
                            converted.append("Sixteen");
                            break;
                        case '7':
                            converted.append("Seventeen");
                            break;
                        case '8':
                            converted.append("Eighteen");
                            break;
                        case '9':
                            converted.append("Nineteen");
                            break;
                    }
                    toConvert.deleteCharAt(0);

                  }
                    else if (toConvert.length() == 2 || toConvert.length() == 8 || toConvert.length() == 5) {
                        switch (num) {
                            case '1':
                                converted.append("");
                                break;
                            case '2':
                                converted.append("Twenty");
                                break;
                            case '3':
                                converted.append("Thirty");
                                break;
                            case '4':
                                converted.append("Forty");
                                break;
                            case '5':
                                converted.append("Fifty");
                                break;
                            case '6':
                                converted.append("Sixty");
                                break;
                            case '7':
                                converted.append("Seventy");
                                break;
                            case '8':
                                converted.append("Eighty");
                                break;
                            case '9':
                                converted.append("Ninety");
                                break;
                        }
                    } else {
                        switch (num) {
                            case '1':
                                converted.append("One");
                                break;
                            case '2':
                                converted.append("Two");
                                break;
                            case '3':
                                converted.append("Three");
                                break;
                            case '4':
                                converted.append("Four");
                                break;
                            case '5':
                                converted.append("Five");
                                break;
                            case '6':
                                converted.append("Six");
                                break;
                            case '7':
                                converted.append("Seven");
                                break;
                            case '8':
                                converted.append("Eight");
                                break;
                            case '9':
                                converted.append("Nine");
                                break;
                            case '0':
                                converted.append("Zero");
                                break;

                        }
                    }
                    if (toConvert.length() == 10) {
                        converted.append("Billion");
                    }
                    if (toConvert.length() == 7) {
                        converted.append("Million");
                    }
                    if (toConvert.length() == 4) {
                        converted.append("Thousand");
                    }
                    if (toConvert.length() == 3 || toConvert.length() == 6 || toConvert.length() == 9) {
                        converted.append("Hundred");
                    }

                    toConvert.deleteCharAt(0);
                }

            }
            converted.append("Dollars");
            return converted.toString();
        }

    public static void main(String[] args)
    {
        App app = new App();
        String[] arr = new String[1];
        arr[0] = "9876543219";
        System.out.println(app.converter(arr));

    }

}
