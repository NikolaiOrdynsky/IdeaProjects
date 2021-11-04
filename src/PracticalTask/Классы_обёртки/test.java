package PracticalTask.Классы_обёртки;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/*
Исправить ошибку. Классы и интерфейсы
*/

public class test {
    {
        System.out.println("This is the Solution class");
    }

    public static void main(String... args) throws IOException {
        try (
                FileOutputStream outputStream = new FileOutputStream(args[0]);
                InputStream is = test.class.getClassLoader().getResourceAsStream(args[1]);
        ) {
            ;
            byte[] b = new byte[is.available()];
            outputStream.write(is.read(b));

            int value = 123_456_789;
            System.out.println(value);

            Example result = null;
            String s = "a";
            switch (s) {
                case "a": {
                    result = new test().new A();
                    break;
                }
                case "b": {
                    result = new test().new B();
                    break;
                }
                case "c": {
                    result = new test().new C();
                    break;
                }
            }

            if (result instanceof A) {
                A p = (A) result;
                System.out.println(p.getClass().getSimpleName());
            }

        } catch (IOException e) {
        }
    }

    interface Example {
    }

    class A implements Example {
        {
            System.out.println("This is the A class");
        }
    }

    class B implements Example {
        {
            System.out.println("This is the B class");
        }
    }

    class C extends A {
        {
            System.out.println("This is the C class");
        }
    }
}
