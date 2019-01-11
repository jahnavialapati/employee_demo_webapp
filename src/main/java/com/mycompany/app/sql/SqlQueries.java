package com.mycompany.app.sql;

import java.util.ResourceBundle;

public final class SqlQueries {
private static SqlQueries sqlQueries=new SqlQueries();

private SqlQueries() {

}
public static SqlQueries getInstance()
{
return sqlQueries;	
}
 public String insertEmployee()
 {
	 ResourceBundle bundle=ResourceBundle.getBundle("sqlquery");
	 return bundle.getString("insertEmployee");
 }

}
