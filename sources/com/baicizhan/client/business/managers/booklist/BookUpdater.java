package com.baicizhan.client.business.managers.booklist;

import com.baicizhan.client.business.managers.booklist.BookUpdateInfos;
import com.baicizhan.client.business.thrift.p;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.online.user_study_api.UserStudyApiService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
class BookUpdater {
    private static final String KEY_BOOK_UPDATE_INFOS = "book_update_infos";
    private static final String KEY_BOOK_UPDATE_REJECT = "book_update_reject";
    private static final String KV_NAME = "book_updater";
    public static final String TAG = "BookListManager.BookUpdater";

    public static /* synthetic */ Object c(UserStudyApiService.Client client) {
        try {
            BookUpdateInfos from = BookUpdateInfos.from(client.get_books_replace_info());
            qb.c.i(TAG, "requestUpdateInfo %s", BczJson.writeToJson(from, BookUpdateInfos.class));
            nc.b.c(KV_NAME).o(KEY_BOOK_UPDATE_INFOS, from);
            return null;
        } catch (Exception e11) {
            qb.c.h(TAG, "", e11);
            return null;
        }
    }

    public BookUpdateInfos.BookUpdateInfo getUpdateInfo(int bookId) {
        BookUpdateInfos bookUpdateInfos = (BookUpdateInfos) nc.b.c(KV_NAME).g(KEY_BOOK_UPDATE_INFOS, BookUpdateInfos.class, null);
        if (bookUpdateInfos == null) {
            return null;
        }
        for (BookUpdateInfos.BookUpdateInfo bookUpdateInfo : bookUpdateInfos.updates) {
            if (bookUpdateInfo.oldBookId == bookId) {
                return bookUpdateInfo;
            }
        }
        return null;
    }

    public boolean hasReject() {
        return nc.b.c(KV_NAME).getBoolean(KEY_BOOK_UPDATE_REJECT, false);
    }

    public void requestUpdateInfo() {
        p.b("/rpc/user_study").I3(bc0.c.e()).c3(new wb0.p() { // from class: com.baicizhan.client.business.managers.booklist.h
            @Override // wb0.p
            public final Object call(Object obj) {
                return BookUpdater.c((UserStudyApiService.Client) obj);
            }
        }).w5(bc0.c.e()).u5(new wb0.b() { // from class: com.baicizhan.client.business.managers.booklist.i
            @Override // wb0.b
            public final void call(Object obj) {
                BookUpdater.b(obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.client.business.managers.booklist.j
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.c(BookUpdater.TAG, "", (Throwable) obj);
            }
        });
    }

    public void userReject(boolean reject) {
        nc.b.c(KV_NAME).j(KEY_BOOK_UPDATE_REJECT, reject);
    }

    public static /* synthetic */ void b(Object obj) {
    }
}
