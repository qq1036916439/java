package com.zzq.utils;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 张志强
 * @param <T>
 */
public class PageUtil<T> {
    private Integer currentPage;//当前页
    private  Integer totalPages;//总叶页数
    private List<T>  list; //当前页中的属性
    private Integer total; //总记录数
    private Integer eachPage;//每页条数
    public PageUtil() {
        this.currentPage=1; }



    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        if(currentPage<1||currentPage==null)
        {this.currentPage = 1;}
        else
        this.currentPage = currentPage;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        if(currentPage==null)
        {this.currentPage=0;}
        this.totalPages = totalPages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        if(list==null){
            list =new LinkedList<>();
        }
        this.list = list;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        if(total==null){
            total=0;
        }
        this.total = total;
    }

    public Integer getEachPage() {
        return eachPage;
    }

    public void setEachPage(Integer eachPage) {
        this.eachPage = eachPage;
    }
}
