package com.spring.db.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.spring.db.model.BoardVO;

public class BoardDAO implements IBoardDAO {

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
			System.out.println("mapRow 호출");
			BoardVO vo = new BoardVO(
					rs.getInt("boardNo"),
					rs.getString("writer"),
					rs.getString("title"),
					rs.getString("content"),
					rs.getTimestamp("reg_date").toLocalDateTime()
					);
			return vo;
		}

	}
	@Override
	public void insertArticle(BoardVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BoardVO> getArticles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO getArticle(int bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteArticle(int bno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateArticle(BoardVO vo) {
		// TODO Auto-generated method stub

	}

}
