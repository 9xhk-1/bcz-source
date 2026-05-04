package com.baicizhan.main.activity.schedule.data;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import q9.x;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BookDataSource {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18895a = "BookDataSource";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SelectBookException extends RuntimeException {
        public SelectBookException(Throwable t11) {
            super(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static BookDataSource f18896a = new BookDataSource();
    }

    public static BookDataSource b() {
        return a.f18896a;
    }

    public BookRecord a(int bookId) {
        return bookId == x.r().l() ? x.r().k() : BookListManager.getInstance().getBookById(bookId);
    }

    public c<Integer> c(Context context) {
        return d(context, true);
    }

    public c<Integer> d(Context context, boolean useCache) {
        if (!useCache) {
            BookListManager.getInstance().setForceRefresh();
        }
        return BookListManager.getInstance().isReady() ? c.M2(0) : BookListManager.getInstance().load(context);
    }
}
