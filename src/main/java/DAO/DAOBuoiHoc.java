package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BEAN.BuoiHoc;
import BEAN.LopHoc;

public class DAOBuoiHoc {

public static List<BuoiHoc> DisplayBuoiHoc(Connection conn){
		
		List<BuoiHoc> list = new ArrayList<>();
		PreparedStatement ptmt = null;		
		
		String sql = "select * from buoihoc";
		try {
			ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("mabuoihoc");
				String tenbuoihoc = rs.getString("tenbuoihoc");
				list.add(new BuoiHoc(id,tenbuoihoc));						
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
		
	}
}
