package com.spring.db.service;

import java.util.List;

import com.spring.db.model.BoardVO;

public interface IBoardService {

	//글 작성 화면을 열어주는 메서드
	void insertArticle(BoardVO vo);
    //작성된 글 등록 처리 요청
	
    //글 목록 화면 요청
	List<BoardVO> getArticles();
	
    //글 내용 상세보기 요청 처리 메서드
	BoardVO getArticle(int bno);
	
    //글 수정하기 화면으로 이동 요청
	void modifyArticle(BoardVO vo);
	
    //삭제는 알아서 작성해 주세요. (삭제 클릭하면 해당 글이 삭제될 수 있도록)
	void deleteArticle(int num);

	
	
}
