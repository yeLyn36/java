import java.sql.*;
import java.util.ArrayList;

public class DBHelper {

    //DB 연결
    //DB 연결 해제
    private static Connection conn = null;
    private static DBHelper instance = null;
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String HOST_NAME = "localhost";
    private static final int PORT = 3306;
    private static final String DATABASE = "myJavaDB";
    private static final String id = "root";
    private static final String password = "mirim2";

    public static DBHelper getInstance() {
        if(instance == null){
            instance = new DBHelper();
        }
        return instance;
    }

    public Connection open(){
        try {
            //1. JDBC DRIVER 연결
            Class.forName(JDBC_DRIVER);
            String url = "jdbc:mysql://" + HOST_NAME + ":" + PORT + "/" + DATABASE + "?serverTimezone=UTC";
            conn = DriverManager.getConnection(url, id, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void close(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<T1> select() {
        ArrayList<T1> tableList = new ArrayList<>();
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            String sql = "select * from first";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                T1 t1 = new T1();
                t1.setName(rs.getString("name"));
                t1.setMonth(rs.getInt("month"));
                t1.setDay(rs.getInt("day"));
                t1.setBirth_option(rs.getString("birth_option"));
                t1.setPhone(rs.getString("phone"));
                t1.setGroup1(rs.getInt("group1"));
                t1.setGroup2(rs.getInt("group2"));
                t1.setGroup3(rs.getInt("group3"));
                t1.setGroup4(rs.getInt("group4"));
                tableList.add(t1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableList;
    }

    public int insert(T1 table1){
        String sql = "insert into first values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = null;
        int result = 0;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, table1.getName());
            pstmt.setInt(2, table1.getMonth());
            pstmt.setInt(3, table1.getDay());
            pstmt.setString(4, table1.getBirth_option());
            pstmt.setString(5, table1.getPhone());
            pstmt.setInt(6, table1.getGroup1());
            pstmt.setInt(7, table1.getGroup2());
            pstmt.setInt(8, table1.getGroup3());
            pstmt.setInt(9, table1.getGroup4());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
