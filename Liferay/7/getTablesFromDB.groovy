import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
import com.liferay.portal.kernel.dao.jdbc.DataAccess;
  
Connection con = null;
Statement st = null;
try {
    con = DataAccess.getUpgradeOptimizedConnection();
    md = con.getMetaData();
    def count=0;
    ResultSet rs = md.getTables(null, null, "%", null);
    while (rs.next()) {
      println(++count + " - " +rs.getString(3));
    }
     
}catch (Exception e){
    print(e);
}
finally {
    DataAccess.cleanUp(con, st);
}