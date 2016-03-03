package test;

import s.dto.QueryObject;
import s.solr.SearchClient;

public class t {

	public static void main(String[] args) {
		QueryObject queryObject = new QueryObject();
		/** 以下所有参数都非必填 **/
		queryObject.setKeyword("*");// 搜索关键词
		queryObject.setPageNum(1);// 分页页码
		queryObject.setPageSize(20);// 每页条数
		queryObject.setOrderType(6);// 排序 0默认（最高） 1默认（最底） 2上架时间（最新） 3上架时间（最旧） 4人气（最高） 
		 								// 5人气（最低） 6价格（最高） 7价格（最低） 8热销(最高) 9热销（最低）10收藏（最高）11收藏（最低）
		queryObject.setStoreType(2); // 店铺类型 0:企业 1：合作社 2:所有
		queryObject.setStartPrice("0");// 价格区间开始
		queryObject.setEndPrice("999999");// 价格区间结束
//		queryObject.setStoreId(634);// 店铺id
		queryObject.setSearchType(1);//搜索类型1:商品 2:店铺
//		queryObject.setBrandId(892);
//		queryObject.setSaleAreaId("4524292");//商品销售地一级地址
//		queryObject.setSecondSaleAreaId("4524414");//商品销售地二级地址
		System.out.println(SearchClient.search(queryObject));
		
		
	}

}
