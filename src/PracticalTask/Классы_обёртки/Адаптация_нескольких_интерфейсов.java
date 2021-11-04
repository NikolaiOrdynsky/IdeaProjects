package PracticalTask.Классы_обёртки;

import java.util.HashMap;
import java.util.Map;

public class Адаптация_нескольких_интерфейсов {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        IncomeDataAdapter data = new IncomeDataAdapter(new IncomeData() {
            @Override
            public String getCountryCode() {
                return "UA";
            }

            @Override
            public String getCompany() {
                return "JavaRush Ltd.";
            }

            @Override
            public String getContactFirstName() {
                return "Ivan";
            }

            @Override
            public String getContactLastName() {
                return "Ivanov";
            }

            @Override
            public int getCountryPhoneCode() {
                return 38;
            }

            @Override
            public int getPhoneNumber() {
                return 654321;
            }
        });
        System.out.println(data.getPhoneNumber());
        System.out.println(data.getCompanyName());
        System.out.println(data.getCountryName());
        System.out.println(data.getName());
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;

        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactFirstName() + ", " + data.getContactLastName();
        }

        @Override
        public String getPhoneNumber() {
            String number = "0000000000";
            int length = String.valueOf(data.getPhoneNumber()).length();
            String result = "";
            if (length < 10) {
                result = number.substring(length).concat(String.valueOf(data.getPhoneNumber()));
            }
            return String.format("+%d(%3s)%3s-%2s-%2s", data.getCountryPhoneCode(), result.substring(0, 3),
                    result.substring(3, 6), result.substring(6, 8), result.substring(8, 10));
        }
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }
}
