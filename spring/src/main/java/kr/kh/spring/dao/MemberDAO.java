package kr.kh.spring.dao;
import org.apache.ibatis.annotations.Param;

public interface MemberDAO {

	public String selectMemberName(@Param("num")String num);
}	
