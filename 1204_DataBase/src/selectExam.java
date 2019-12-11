import java.sql.Connection;
import java.util.ArrayList;

public class selectExam {
    private static DBHelper dbHelper = null;
    private static Connection conn = null;

    public static void main(String[] args) {
        dbHelper = DBHelper.getInstance();
        conn = dbHelper.open();
        if(conn != null){
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

        ArrayList<T1> tableList = new ArrayList<>();
        tableList = dbHelper.select();
        for (T1 item: tableList) {
            System.out.println(item);
        }

        T1 table = new T1();
        table.setName("이지은");
        table.setMonth(5);
        table.setDay(10);
        table.setBirth_option("0510");
        table.setPhone("010-0000-0000");
        table.setGroup1(1);
        table.setGroup2(2);
        table.setGroup3(3);
        table.setGroup3(3);
        dbHelper.insert(table);

        tableList = new ArrayList<>();
        tableList = dbHelper.select();
        for (T1 item: tableList) {
            System.out.println(item);
        }


        dbHelper.close();
    }
}
