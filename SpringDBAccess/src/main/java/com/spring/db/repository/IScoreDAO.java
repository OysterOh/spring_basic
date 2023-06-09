package com.spring.db.repository;

import java.util.List;

import com.spring.db.model.ScoreVO;

public interface IScoreDAO {

	//점수 등록 기능
	void insertScore(ScoreVO vo);
		
	//점수 전체 조회 기능
	List<ScoreVO> selectAllScores();
		
	//점수 삭제 기능
	void deleteScore(int stuId);
		
	//점수 개별 조회 기능
	ScoreVO selectOne(int stuId);
}
