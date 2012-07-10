package com.mkyong.stock.service;

import com.mkyong.stock.model.Stock;

public interface StockService {
	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);
}
