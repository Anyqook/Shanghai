package db;

import org.apache.ibatis.session.SqlSession;

import bean.SqlMapClient;


public class BasketDao {
	private SqlSession session = SqlMapClient.getSession();
}
