package com.ino.service;

import com.ino.dao.MenuMapper;
import com.ino.dto.MenuDto;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static com.ino.common.Template.getSqlSession;

public class MenuService {

    private MenuMapper menuMapper;

    public List<MenuDto> selectMenuByNameOrCategory1(Map<String, String> searchMap) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDto> list = menuMapper.selectMenuByNameOrCategory1(searchMap);
        sqlSession.close();
        return list;
    }

    public int deleteMenu(List<Integer> deleteMenuCodes) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("deleteMenuCodes", deleteMenuCodes);

        int result = menuMapper.deleteMenu(map);
        if(result == deleteMenuCodes.size()) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }

    public List<MenuDto> selectMenuByCodeOrSearchAll(int menuCode) {

        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDto> list = menuMapper.selectMenuByCodeOrSearchAll(menuCode);
        sqlSession.close();
        return list;
    }

    public List<MenuDto> selectMenuByNameOrCategory2(Map<String, Object> searchMap) {

        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDto> list = menuMapper.selectMenuByNameOrCategory2(searchMap);
        sqlSession.close();
        return list;
    }

    public int updateMenu(Map<String, Object> searchMap) {

        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = menuMapper.updateMenu(searchMap);
        if(result>0) {
            System.out.println("update completed");
            sqlSession.commit();
        } else {
            System.out.println("update failed");
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }
}
