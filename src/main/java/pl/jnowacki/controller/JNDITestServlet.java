package pl.jnowacki.controller;

import pl.jnowacki.model.Tool;
import pl.jnowacki.model.ToolType;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/jndi")
public class JNDITestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        Context ctx = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/MyToolDB");

            con = ds.getConnection();
            stmt = con.createStatement();

            rs = stmt.executeQuery("SELECT * FROM tools");

            while (rs.next()) {

                long toolId = rs.getLong("id");
                String toolName = rs.getString("name");
                ToolType toolType = ToolType.valueOf(rs.getString("type"));
                boolean toolAvailability = rs.getBoolean("available");

                System.out.println(new Tool(toolId, toolName, toolType, toolAvailability));
            }

        }catch(NamingException | SQLException e){
            e.printStackTrace();
        } finally{
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
                if (ctx != null) {
                    ctx.close();
                }
            } catch (SQLException e) {
                System.out.println("Exception in closing DB resources");
            } catch (NamingException e) {
                System.out.println("Exception in closing Context");
            }

        }
    }
}
