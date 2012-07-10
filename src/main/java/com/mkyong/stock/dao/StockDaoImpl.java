package com.mkyong.stock.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mkyong.stock.model.Stock;
import com.mkyong.util.CustomHibernateDaoSupport;

@Repository("stockDao")
public class StockDaoImpl extends CustomHibernateDaoSupport implements StockDao {

	public void save(Stock stock) {
		getHibernateTemplate().save(stock);
	}

	public void update(Stock stock) {
		getHibernateTemplate().update(stock);
	}

	public void delete(Stock stock) {
		getHibernateTemplate().delete(stock);

	}

	public Stock findByStockCode(String stockCode) {
		@SuppressWarnings("rawtypes")
		List list = getHibernateTemplate().find("from Stock where stockCode=?",
				stockCode);
		return (Stock) list.get(0);
	}

}
