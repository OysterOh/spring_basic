package com.spring.db.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.db.common.BoardMapper;
import com.spring.db.model.BoardVO;

@Repository
public class BoardDAO implements IBoardDAO {

	//내부 클래스 선언
	class ArticleList implements RowMapper<BoardVO>{

		/*
		 <th>번호</th>
         <th>제목</th>
         <th>작성자</th>
         <th>비고</th>
         private int boardNo;
		 private String writer;
		 private String title;
		 private String content;
		 private LocalDateTime regDate;
		 */
		@Override
		public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//			System.out.println("mapRow 호출");
//			BoardVO vo = new BoardVO(
//					rs.getInt("board_no"),
//					rs.getString("writer"),
//					rs.getString("title"),
//					rs.getString("content"),
//					rs.getTimestamp("reg_date").toLocalDateTime()
//					);
//			return vo;
			return new BoardVO(
					rs.getInt("board_no"),
					rs.getString("writer"),
					rs.getString("title"),
					rs.getString("content"),
					rs.getTimestamp("reg_date").toLocalDateTime()
					);
		}

	}
	@Autowired
	private JdbcTemplate template;
	 @Override
	   public void insertArticle(BoardVO vo) {
	      String sql = "INSERT INTO jdbc_board "
	            + "(writer, title, content) "
	            + "VALUES(?,?,?)";
	      template.update(sql, vo.getWriter(), vo.getTitle(), vo.getContent());
	   }

	   @Override
	   public List<BoardVO> getArticles() {
	      String sql = "SELECT * FROM jdbc_board ORDER BY board_no DESC";
	      return template.query(sql, new BoardMapper());
	   }

	   @Override
	   public BoardVO getArticle(int bno) {
	      String sql = "SELECT * FROM jdbc_board WHERE board_no=?";
	      return template.queryForObject(sql, new BoardMapper(), bno);
	   }

	   @Override
	   public void deleteArticle(int bno) {
	      String sql = "DELETE FROM jdbc_board WHERE board_no=?";
	      template.update(sql, bno);

	   }

	   @Override
	   public void updateArticle(BoardVO vo) {
	      String sql = "UPDATE jdbc_board SET writer=?, title=?, content=? WHERE board_no=?";
	      template.update(sql, vo.getWriter(), vo.getTitle(), vo.getContent(), vo.getBoardNo());

	   }

	}