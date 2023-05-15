package com.spring.db.repository;

import java.util.List;

import com.spring.db.model.BoardVO;

public interface IBoardMapper {

	//글 등록
	void insertArticle(BoardVO vo);

	//글 목록 조회
	List<BoardVO> getArticles();

	//글 상세 조회
	BoardVO getArticle(int bno);

	//글 삭제
	void deleteArticle(int bno);

	//글 수정
	void updateArticle(BoardVO vo);

}
