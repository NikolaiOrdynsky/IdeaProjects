package AleksandrVasko.Collections.ArrayList;




import java.util.Scanner;

public class Main {
    private static void instruction() {
        System.out.println("""
                Нажмите :\s
                1.Добавить задачу в конец коллекции.\s
                2.Добавить задачу в определенную позицию коллекции.
                3.Получить индекс порядковой позиции задачи в коллекции.
                4.Изменить задачу  в коллекции, в указанной позиции.
                5.Удалить задачу из коллекции.
                6.Показать элементы коллекции.
                """
        );
    }

    public static void main(String[] args) {
        ArrayLists list = new ArrayLists();
        Scanner console = new Scanner(System.in);
        instruction();
        int input = console.nextInt();

        while (!(input == 0)) {
            switch (input) {
                case 1 -> {
                    System.out.println("1.Добавить задачу в конец коллекции.");
                    System.out.println("Введите тело задачи.");
                    console.nextLine();
                    String task1 = console.nextLine();
                    // list.addInList(task1);
                    list.addSortAlfavit(task1);
                    System.out.println("Операция выполнена.");
                    System.out.println("Введите следущую команду :");
                    input = console.nextInt();
                }
                case 2 -> {
                    System.out.println("2.Добавить задачу в определенную позицию коллекции.");
                    System.out.println("Введите тело задачи.");
                    console.nextLine();
                    String task2 = console.nextLine();
                    System.out.println("Введите номер позиции задачи в коллекции. Длинна коллекции :" + list.sizeList());
                    int index = console.nextInt();
                    list.addInIndexList(index, task2);
                    System.out.println("Операция выполнена.");
                    System.out.println("Введите следущую команду :");
                    input = console.nextInt();
                }
                case 3 -> {
                    System.out.println("3.Получить индекс порядковой позиции задачи в коллекции.");
                    System.out.println("Введите тело задачи.");
                    console.nextLine();
                    String task3 = console.nextLine();
                    System.out.println(list.seurchIndexList(task3));
                    System.out.println("Операция выполнена.");
                    System.out.println("Введите следущую команду :");
                    input = console.nextInt();
                }
                case 4 -> {
                    System.out.println("4.Изменить задачу  в коллекции, в указанной позиции.");
                    System.out.println("Введите тело задачи.");
                    console.nextLine();
                    String task4 = console.nextLine();
                    System.out.println("Введите порядковый номер задачи которую нужно заменить :");
                    int index2 = console.nextInt();
                    list.setList(index2, task4);
                    System.out.println("Операция выполнена.");
                    System.out.println("Введите следущую команду :");
                    input = console.nextInt();
                }
                case 5 -> {
                    System.out.println("5.Удалить задачу из коллекции.");
                    System.out.println("Порядковый номер задачи которую нужно удалить :");
                    console.nextLine();
                    int index3 = console.nextInt();
                    list.removeList(index3);
                    System.out.println("Операция выполнена.");
                    System.out.println("Введите следущую команду :");
                    input = console.nextInt();
                }
                case 6 -> {
                    console.nextLine();
                    list.printList();
                    System.out.println("Операция выполнена.");
                    System.out.println("Введите следущую команду :");
                    input = console.nextInt();
                }
                default -> input = 0;
            }
        }
    }
}
