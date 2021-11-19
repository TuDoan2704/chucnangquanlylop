package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BEAN.LopHoc;

public class DAOLopHoc {
public static List<LopHoc> DisplayQuestion(Connection conn){
		
		List<LopHoc> list = new ArrayList<>();
		PreparedStatement ptmt = null;		
		
		String sql = "select * from lop";
		try {
			ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("Malop");
				String tenlop = rs.getString("Tenlop");
				list.add(new LopHoc(id,tenlop));						
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
		
	}
}
