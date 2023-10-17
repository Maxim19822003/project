package HW_notebook;

import java.util.Map;
import java.util.Random;

public class Notebook {
    String model;
    int ram;
    int hdd;
    String os;
    String colour;

    @Override
    public String toString(){
        return "Модель: " + model + ", ОЗУ: " + ram + ", HDD: " + hdd + ", OS: " + os;
    }

    static Map <Integer, String> fillModels (Map <Integer, String> models) {
    models.put(1, "MacBook");
    models.put(2, "HP");
    models.put(3, "Эльбрус");
    return models;
    }

    static Map <Integer, Integer> fillRams (Map <Integer, Integer> rams) {
    rams.put(1, 4);
    rams.put(2, 8);
    rams.put(3, 16);
    return rams;
    }

    static Map <Integer, Integer> fillHdds (Map <Integer, Integer> hdds) {
    hdds.put(1, 128);
    hdds.put(2, 256);
    hdds.put(3, 512);
    return hdds;
    }

    static Map <Integer, String> fillOSs (Map <Integer, String> oss) {
    oss.put(1, "MacOS");
    oss.put(2, "Windows");
    oss.put(3, "Эльбрус");
    return oss;
    }

    static Map <Integer, String> fillColours (Map <Integer, String> colours) {
    colours.put(1, "Чёрный");
    colours.put(2, "Белый");
    colours.put(3, "Индиго");
    return colours;
    }
  
    static Notebook generateNotebook(Map <Integer, String> models, Map <Integer, Integer> rams, Map <Integer, Integer> hdds, Map <Integer, String> oss, Map <Integer, String> colours){
        Notebook kc = new Notebook();
        Random random = new Random();
        int index = random.nextInt(1, 4);
        kc.model = models.get(index);
        index = random.nextInt(1, 4);
        kc.ram = rams.get(index);
        index = random.nextInt(1, 4);
        kc.hdd = hdds.get(index);
        index = random.nextInt(1, 4);
        kc.os = oss.get(index);
        index = random.nextInt(1, 4);
        kc.colour = colours.get(index);
        index = random.nextInt(1, 4);
        return kc;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
          return true;
        }
        if (!(obj instanceof Notebook)){
            return false;
        }
        Notebook notebook = (Notebook) obj;
        return ram == notebook.ram && hdd == notebook.hdd && model.equals(notebook.model)  && os.equals(notebook.os) && colour.equals(notebook.colour);
    }

    @Override
    public int hashCode() {
        return 9 * ram + 10 * hdd + 11 * model.hashCode() + 12 * os.hashCode() + 13 * colour.hashCode();
    }    
}
