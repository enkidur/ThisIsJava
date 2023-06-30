package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import Model.board;

public class Db {
	private Connection conn;
	
	public Db() {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String pw="1234";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection(url, user, pw);
			//System.out.println("접속성공");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	public Connection getConn() {
		return conn;
	}
	public void crate(board board) {
		String sql ="insert into lmh_board(bno,btitle,bcontent,bname,bdate) "+
				"values(LMH_SEQ.nextval,?,?,?,sysdate)";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getBname());
			pstmt.executeUpdate();
			System.out.println("글이 등록되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void read(board board) {
		String sql ="select * from lmh_board where bno = ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1,board.getNumber());
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("####################");
				System.out.println("번호: " + board.getNumber());
				System.out.println("제목: " + rs.getString("btitle"));
				System.out.println("내용: " + rs.getString("bcontent"));
				System.out.println("작성자: "+ rs.getString("bname"));
				System.out.println("작성일시: " +rs.getString("bdate"));
				System.out.println("####################");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void allRead(board board) {
		String sql ="select * from lmh_board order by bno";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			ResultSet rs=pstmt.executeQuery();

			System.out.println("----------------------------------------");
			System.out.println("글번호		작성자		작성일시			제목");
			System.out.println("----------------------------------------");
			
			while(rs.next())
				System.out.println(rs.getString("bno")+"		"+rs.getString("bname")+"		"+rs.getString("bdate")+"		"+rs.getString("btitle"));

			
			System.out.println("----------------------------------------");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delete(board board) {
		String sql ="delete from lmh_board where bno =?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1,board.getNumber());
			ResultSet rs=pstmt.executeQuery();
			System.out.println("글이 삭제되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update(board board) {
		String sql="update lmh_board set btitle=?, bcontent=?,bname = ? where bno = ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getBname());
			pstmt.setInt(4, board.getNumber());
			pstmt.executeUpdate();
			System.out.println("글이 수정되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
