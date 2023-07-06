public class exam_21_3_20 {
    public static void main(String[] args) {
        Connection conn1 = Connection.getInsConnection();
        conn1.count();
        Connection conn2 = Connection.getInsConnection();
        conn2.count();
        Connection conn3 = Connection.getInsConnection();
        conn3.count();
        System.out.println(conn1.get()); 
    }
    
}
class Connection {
    private static Connection _in = null;
    private static int count = 0;
    static public Connection getInsConnection(){
        if(_in == null){
            Connection _in = new Connection();
            return _in;
        }
        return _in;
    }
    public void count(){
        count++;
    }
    public int get(){
        return count;
    }
}
