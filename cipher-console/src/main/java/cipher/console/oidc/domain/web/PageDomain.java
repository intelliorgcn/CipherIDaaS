package cipher.console.oidc.domain.web;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: TK
 * @Date: 2018/11/29 11:41
 * 应用分页
 */
public class PageDomain {
    private Integer currentPage;//当前页数
    private Integer prevPage;//上一页的页数
    private Integer nextPage;//下一页页数
    private List<ApplicationSysInfo> showUsers =new ArrayList<ApplicationSysInfo>();//应用内容
    private List<Integer> showPageNums =new ArrayList<Integer>();//总页数比如{1,2，3，4,5}
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(Integer prevPage) {
        this.prevPage = prevPage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public List<ApplicationSysInfo> getShowUsers() {
        return showUsers;
    }

    public void setShowUsers(List<ApplicationSysInfo> showUsers) {
        this.showUsers = showUsers;
    }

    public List<Integer> getShowPageNums() {
        return showPageNums;
    }

    public void setShowPageNums(List<Integer> showPageNums) {
        this.showPageNums = showPageNums;
    }

    @Override
    public String toString() {
        return "PageDomain{" +
                "currentPage=" + currentPage +
                ", prevPage=" + prevPage +
                ", nextPage=" + nextPage +
                ", showUsers=" + showUsers +
                ", showPageNums=" + showPageNums +
                '}';
    }
}
