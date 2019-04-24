package data;

public class DataObject2Java implements IDataObject2Java {


    String value1;

    DataObject2Java(String type) {
    }

    public static void main(String[] args) {
        DataObject2Java dataObject2Java = new DataObject2Java("test");
        dataObject2Java.value1 = "";

        DataObject2 dataObject2 = new DataObject2("test");
//        dataObject2.setValue2("value2");
    }

}
