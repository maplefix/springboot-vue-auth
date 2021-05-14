package top.maplefix.auth.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author: Maple
 * @description: 文章Dao层
 * @date: 2021/5/12 17:31
 */
public interface ArticleDao {
    /**
     * 新增文章
     */
    int addArticle(JSONObject jsonObject);

    /**
     * 统计文章总数
     */
    int countArticle(JSONObject jsonObject);

    /**
     * 文章列表
     */
    List<JSONObject> listArticle(JSONObject jsonObject);

    /**
     * 更新文章
     */
    int updateArticle(JSONObject jsonObject);
}
