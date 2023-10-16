package HW;

import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Налетай! Торопись! Ноутбуком запасись!");

        Map <Integer, String> models = new HashMap<>();
        Map <Integer, Integer> rams = new HashMap<>();
        Map <Integer, Integer> hdds = new HashMap<>();
        Map <Integer, String> oss = new HashMap<>();
        Map <Integer, String> colours = new HashMap <>();

        Notebook.fillModels(models);
        Notebook.fillRams(rams);
        Notebook.fillHdds(hdds);
        Notebook.fillOSs(oss);
        Notebook.fillColours(colours);

        Set <Notebook> allNotebooks = new HashSet<>();
        for (int i = 1; i <= 15; i++) {
            Notebook element = Notebook.generateNotebook(models, rams, hdds, oss, colours);            
            allNotebooks.add(element);
        }

        String userModel = "0";
        int minRam = 1;
        int minHdd = 1;
        String userOs = "0";
        String userColour = "0";

        int d = 0;
        while (d == 0) {
            System.out.println("Соберите свой ноутбук: ");
            System.out.println("1 - название(модель),");
            System.out.println("2 - объем оперативки,");
            System.out.println("3 - объем жесткого диска,");
            System.out.println("4 - операционная система,");
            System.out.println("5 - цвет.");
            System.out.println("Если определились со всеми параметрами, жмите 6");

            Scanner sc = new Scanner(System.in);
            int point = 0;
            try {
                point = Integer.parseInt(sc.nextLine());
                switch (point) {
                    case 1:
                        System.out.println("Выберите название(модель) ноутбука:");
                        System.out.println("1 - MacBook");
                        System.out.println("2 - HP");
                        System.out.println("3 - Эльбрус");
                        String indexModel = sc.nextLine();
                        try {
                            int choiceModel = Integer.parseInt(indexModel);
                            if (choiceModel < 1 || choiceModel > 3) {
                                choiceModel = 1;
                                System.out.println("Не совсем верное значение..");
                            }
                            else userOs = oss.get(choiceModel);
                        } catch (NumberFormatException ex) {
                            System.out.println("Введено всё что угодно, но не число.");
                        }
                        break;

                    case 2:
                        System.out.println("Выберите минимальный объем оперативной памяти:");
                        System.out.println("1 - 4Gb");
                        System.out.println("2 - 8Gb");
                        System.out.println("3 - 16Gb");
                        String userRam = sc.nextLine();
                        try {
                            minRam = Integer.parseInt(userRam);
                            if (minRam < 1 || minRam > 3) {
                                minRam = 1;
                                System.out.println("Не совсем верное значение..");
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("Введено всё что угодно, но не число.");
                        }
                        break;

                    case 3:
                        System.out.println("Выберите минимальный объем жесткого диска:");
                        System.out.println("1 - 128Gb");
                        System.out.println("2 - 256Gb");
                        System.out.println("3 - 512Gb");
                        String userHdd = sc.nextLine();
                        try {
                            minHdd = Integer.parseInt(userHdd);
                            if (minHdd < 1 || minHdd > 3) {
                                minHdd = 1;
                                System.out.println("Не совсем верное значение..");
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("Введено всё что угодно, но не число.");
                        }
                        break;

                    case 4:
                        System.out.println("Выберите операционную систему");
                        System.out.println("1 - MacOS");
                        System.out.println("2 - Windows");
                        System.out.println("3 - Эльбрус");
                        String indexOs = sc.nextLine();
                        try {
                            int choiceOs = Integer.parseInt(indexOs);
                            if (choiceOs < 1 || choiceOs > 3) {
                                choiceOs = 1;
                                System.out.println("Не совсем верное значение..");
                            }
                            else userOs = oss.get(choiceOs);
                        } catch (NumberFormatException ex) {
                            System.out.println("Введено всё что угодно, но не число.");
                        }
                        break;

                    case 5:
                        System.out.println("Выберите цвет");
                        System.out.println("1 - Чёрный");
                        System.out.println("2 - Белый");
                        System.out.println("3 - Индиго");
                        String indexColour = sc.nextLine();
                        try {
                            int choiceColour = Integer.parseInt(indexColour);
                            if (choiceColour < 1 || choiceColour > 3) {
                                choiceColour = 1;
                                System.out.println("Не совсем верное значение..");
                            }
                            else userColour = colours.get(choiceColour);
                        } catch (NumberFormatException ex) {
                            System.out.println("Введено всё что угодно, но не число.");
                        }
                        break;

                    case 6:
                        d = 1;
                        sc.close();
                        break;

                    default:
                        System.out.println("Не совсем верное значение. Попробуйте снова)");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Введено всё что угодно, но не число.");
            }
        }


        for (Notebook book : allNotebooks) {
            if (rams.get(minRam) <= book.ram && hdds.get(minHdd) <= book.hdd && (userModel.equals("0") || book.model.equals(userModel)) && (userOs.equals("0") || book.os.equals(userOs)) && (userColour.equals("0") || book.colour.equals(userColour))){
                d = 2;
                System.out.println(book);
            }
        }
        if (d != 2) {
            System.out.println("Ваши условия поиска не соответствуют параметрам представленных ноутбуковю");
        }
    }
}