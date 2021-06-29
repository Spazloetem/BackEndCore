package com.backend.backend.Systemtool;

public class QueryParameter {
    private String Keyword;//搜尋關鍵字
    private String OrderBy;//排序欄位
    private String SortRule;//排序方式

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String keyword) {
        Keyword = keyword;
    }

    public String getOrderBy() {
        return OrderBy;
    }

    public void setOrderBy(String orderBy) {
        OrderBy = orderBy;
    }

    public String getSortRule() {
        return SortRule;
    }

    public void setSortRule(String sortRule) {
        SortRule = sortRule;
    }
}
