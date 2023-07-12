
//Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
//
//For example:
//
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28
//...

public class ExcelSheet {


    public int titleToNumber(String columnTitle) {

        int columnNum=0;

        for (int i=0;i<columnTitle.length();i++){

            columnNum=+columnNum*26;
            columnNum=columnNum+(columnTitle.charAt(i)-'A')+1;
        }
        return columnNum;
    }

    private void columnArray(int i) {
    }

    public static void main(String args[]){
        String column="ABB";

        ExcelSheet excelSheet=new ExcelSheet();
        System.out.println("result: "+excelSheet.titleToNumber(column));
    }
}