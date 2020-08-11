import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.liferay.portal.kernel.dao.jdbc.DataAccess;
    
Connection con = null;
Statement st = null;
String query = "desc HPIDAAS_FINANCE_CurrencyConversionRate";
try {
    con = DataAccess.getUpgradeOptimizedConnection();
    st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    while (rs.next()) {
        for(int i = 1;i<= rs.getMetaData().getColumnCount(); i++) {
            print(rs.getString(i) + " - ");
        }
        println();
    }
}catch(Exception e){
    println(e);
}
finally {
    DataAccess.cleanUp(con, st);
}