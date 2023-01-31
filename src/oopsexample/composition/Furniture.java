package oopsexample.composition;

public class Furniture {

    private boolean isBed;
    private boolean isTable;
    private String tableType;

    public Furniture(boolean isBed, boolean isTable, String tableType) {
        this.isBed = isBed;
        this.isTable = isTable;
        this.tableType = tableType;
    }

    public void findRoomType() {

        if (isBed) {
            System.out.println("This is a Bed room");
        } else if (isTable && tableType.equalsIgnoreCase("DinningTable")) {
            System.out.println("This is a Dinning room");
        } else if (isTable && tableType.equalsIgnoreCase("OfficeDesk")) {
            System.out.println("This is a Office");
        } else {
            System.out.println("Unknow Room");
        }
    }

    public boolean isBed() {
        return isBed;
    }

    public boolean isTable() {
        return isTable;
    }

    public String getTableType() {
        return tableType;
    }
}