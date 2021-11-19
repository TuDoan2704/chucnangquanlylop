package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BEAN.GiaoVien;

public class DAOGiaoVien {
	
public static List<GiaoVien> displayGiaoVien(Connection conn){
		
		List<GiaoVien> list = new ArrayList<>();
		PreparedStatement ptmt = null;		
		
		String sql = "select * from giaovien";
		try {
			ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("magiaovien");
				String tengv = rs.getString("tengiaovien");
				list.add(new GiaoVien(id,tengv));						
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
		
	}
}
