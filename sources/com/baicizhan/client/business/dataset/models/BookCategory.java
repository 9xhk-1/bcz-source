package com.baicizhan.client.business.dataset.models;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BookCategory implements Serializable {
    private String categoryId;
    private String categoryTagName;
    private String category_name;
    private List<SubCategory> sub_categories;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SubCategory implements Serializable {
        private List<Integer> book_ids;
        private String sub_name;

        public List<Integer> getBookIds() {
            return this.book_ids;
        }

        public String getSubName() {
            return this.sub_name;
        }

        public void setBookIds(List<Integer> book_ids) {
            this.book_ids = book_ids;
        }

        public void setSubName(String sub_name) {
            this.sub_name = sub_name;
        }
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.category_name;
    }

    public String getCategoryTagName() {
        return this.categoryTagName;
    }

    public List<SubCategory> getSubCategories() {
        return this.sub_categories;
    }

    public int getSubCategorySize() {
        List<SubCategory> list = this.sub_categories;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String category_name) {
        this.category_name = category_name;
    }

    public void setCategoryTagName(String categoryTagName) {
        this.categoryTagName = categoryTagName;
    }

    public void setSubCategories(List<SubCategory> sub_categories) {
        this.sub_categories = sub_categories;
    }
}
