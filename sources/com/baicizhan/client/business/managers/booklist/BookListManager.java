package com.baicizhan.client.business.managers.booklist;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import com.baicizhan.client.business.dataset.models.AllTopCategoryInfo;
import com.baicizhan.client.business.dataset.models.BookCategory;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.client.business.dataset.models.UserIdentityLevelInfo;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.managers.booklist.BookUpdateInfos;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.Profiler;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.user_study_api.BookLevelInfo;
import com.baicizhan.online.user_study_api.MergeState;
import com.baicizhan.online.user_study_api.SelectBookPlanInfo;
import com.baicizhan.online.user_study_api.UserBookBasicInfo;
import com.baicizhan.online.user_study_api.UserBookCategory;
import com.baicizhan.online.user_study_api.UserBookListInfo;
import com.baicizhan.online.user_study_api.UserSelectedBookInfo;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.baicizhan.online.user_study_api.UserSubCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.thrift.transport.TTransportException;
import org.junit.jupiter.api.j2;
import q9.x;
import rx.c;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BookListManager {
    private static final String BOOK_LIST_MANAGER_VERSION = "book_list_manager_version";
    private static final int BOOK_LIST_MANAGER_VERSION_CURRENT = 100;
    public static final int MERGE_SUCCESS = 2;
    public static final String TAG = "BookListManager";
    private static final long TIME_INTERVAL = 1000;
    private static final BookListManager sInstance = new BookListManager();
    private boolean mForceRefresh;
    private String mLockReasonDesc;
    private long mRemoteBookListVersion = 0;
    private Map<Integer, BookRecord> mBooks = Collections.EMPTY_MAP;
    private BookUpdater mBookUpdater = new BookUpdater();
    private List<BookRecord> mSelectedBook = new LinkedList();
    private List<BookCategory> mBookCategory = Collections.EMPTY_LIST;
    private HashMap<String, BookCategory> mBookCategoriesMap = new HashMap<>();
    private Profiler profiler = new Profiler();
    private boolean mLockModify = false;

    private boolean anyBooks(UserBookCategory c11) {
        if (c11.getSub_categoriesSize() <= 0) {
            return false;
        }
        Iterator<UserSubCategory> it = c11.getSub_categories().iterator();
        while (it.hasNext()) {
            if (it.next().getBook_ids().size() > 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void c(UserStudyApiService.Client client, String str, qb0.g gVar) {
        try {
            MergeState mergeState = client.get_merge_state(str);
            gVar.onNext(mergeState);
            qb.c.i(TAG, "[taskid, id, percentage, state] %s %s %d %d", str, mergeState.f28165id, Integer.valueOf(mergeState.percentage), Integer.valueOf(mergeState.state));
            while (mergeState.state != 2) {
                Thread.sleep(1000L);
                mergeState = client.get_merge_state(str);
                gVar.onNext(mergeState);
                qb.c.i(TAG, "[taskid, id, percentage, state] %s %s %d %d", str, mergeState.f28165id, Integer.valueOf(mergeState.percentage), Integer.valueOf(mergeState.state));
            }
            gVar.onCompleted();
        } catch (Exception e11) {
            gVar.onError(e11);
            throw vb0.a.c(e11);
        }
    }

    public static /* synthetic */ List e(UserStudyApiService.Client client) {
        try {
            return client.get_payed_books();
        } catch (Throwable th2) {
            throw vb0.a.c(th2);
        }
    }

    public static /* synthetic */ String g(int i11, UserStudyApiService.Client client) {
        try {
            return client.get_book_description(i11);
        } catch (Throwable th2) {
            throw vb0.a.c(th2);
        }
    }

    public static BookListManager getInstance() {
        return sInstance;
    }

    private boolean hasBookListChange() {
        return nc.b.b().getInt(BOOK_LIST_MANAGER_VERSION, -1) != 100;
    }

    private boolean isBookListComplete() {
        HashMap<String, BookCategory> hashMap;
        return this.mBookCategory.size() > 0 && this.mBooks.size() > 0 && (hashMap = this.mBookCategoriesMap) != null && hashMap.size() > 1;
    }

    private boolean isGameMode() {
        UserRecord p11 = x.r().p();
        return p11 != null && p11.getGameBeta() == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$loadSelectBook$2(UserStudyApiService.Client client) {
        try {
            updateSelectedBookInfos(client);
            return 0;
        } catch (Throwable th2) {
            throw vb0.a.c(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rx.c lambda$mergeLearnRecord$3(int i11, List list, UserStudyApiService.Client client) {
        if (list == null) {
            try {
                list = new ArrayList();
            } catch (Exception e11) {
                throw vb0.a.c(e11);
            }
        }
        String merge_already_learned_words_async = client.merge_already_learned_words_async(i11, list);
        qb.c.i(TAG, "merge async %s , book %d", merge_already_learned_words_async, Integer.valueOf(i11));
        return queryMergeResult(merge_already_learned_words_async, i11, client);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ rx.c lambda$mergeLearnRecord$4(rx.c cVar) {
        return cVar.b2(new p<Throwable, rx.c<? extends Long>>() { // from class: com.baicizhan.client.business.managers.booklist.BookListManager.6
            int count = 0;

            @Override // wb0.p
            public rx.c<? extends Long> call(Throwable throwable) {
                this.count++;
                qb.c.h(BookListManager.TAG, "mergeLearnRecord retry " + this.count, throwable);
                return (this.count >= 3 || !((throwable.getCause() instanceof TTransportException) || (throwable.getCause() instanceof LogicException))) ? rx.c.T1(throwable) : rx.c.o6(1000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ rx.c lambda$queryMergeResult$6(rx.c cVar) {
        return cVar.b2(new p<Throwable, rx.c<? extends Long>>() { // from class: com.baicizhan.client.business.managers.booklist.BookListManager.7
            int count = 0;

            @Override // wb0.p
            public rx.c<? extends Long> call(Throwable throwable) {
                this.count++;
                qb.c.h(BookListManager.TAG, "queryMergeResult retry " + this.count, throwable);
                return (!(throwable.getCause() instanceof TTransportException) || this.count >= 3) ? rx.c.T1(throwable) : rx.c.o6(1000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    private boolean loadBookListFromClient(Context context) {
        List<BookRecord> e11 = i9.a.e(context);
        if (xb.e.h(e11)) {
            qb.c.q(TAG, "get book list from client empty ", new Object[0]);
            return false;
        }
        List<BookCategory> list = (List) i9.f.e(context, i9.f.f60364c, new bp.a<List<BookCategory>>() { // from class: com.baicizhan.client.business.managers.booklist.BookListManager.5
        }.getType(), false);
        if (xb.e.h(list)) {
            return false;
        }
        HashMap hashMap = new HashMap(e11.size());
        for (BookRecord bookRecord : e11) {
            hashMap.put(Integer.valueOf(bookRecord.bookId), bookRecord);
        }
        this.mBooks = hashMap;
        setBookCategory(list);
        qb.c.b(TAG, "book category size from client: " + this.mBookCategory.size(), new Object[0]);
        return true;
    }

    private boolean loadBookListFromServer(Context context, UserStudyApiService.Client client) {
        try {
            if (!rb.d.f(context)) {
                return false;
            }
            qb.c.b(TAG, "<server> loadBookListFromServer", new Object[0]);
            UserBookListInfo userBookListInfo = client.get_all_books_basic_info_v3();
            qb.c.b(TAG, "thrift get_all_books_basic_info " + userBookListInfo.getBooks_infoSize(), new Object[0]);
            HashMap hashMap = new HashMap(userBookListInfo.getBooks_infoSize());
            for (UserBookBasicInfo userBookBasicInfo : userBookListInfo.getBooks_info()) {
                BookRecord bookRecord = new BookRecord();
                bookRecord.bookId = userBookBasicInfo.getId();
                bookRecord.bookName = userBookBasicInfo.getName();
                bookRecord.wordCount = userBookBasicInfo.total_words_count;
                bookRecord.desc = userBookBasicInfo.desc;
                bookRecord.descImage = userBookBasicInfo.img;
                bookRecord.bookFlag = userBookBasicInfo.book_flag;
                hashMap.put(Integer.valueOf(bookRecord.bookId), bookRecord);
            }
            Cursor d11 = k9.c.i(a.z.f16349b).g("book_id", a.z.C0267a.f16357h, a.z.C0267a.f16360k, a.z.C0267a.f16359j).d(context);
            if (d11 != null) {
                d11.moveToFirst();
                while (!d11.isAfterLast()) {
                    int i11 = d11.getInt(0);
                    BookRecord bookRecord2 = (BookRecord) hashMap.get(Integer.valueOf(i11));
                    if (bookRecord2 == null) {
                        qb.c.q(TAG, "book miss " + i11, new Object[0]);
                    } else {
                        bookRecord2.localBookResVer = d11.getLong(1);
                        bookRecord2.localRoadmapVer = d11.getLong(2);
                        bookRecord2.localRadioResVer = d11.getLong(3);
                    }
                    d11.moveToNext();
                }
                d11.close();
            }
            if (userBookListInfo.getCategories_infoSize() > 0) {
                ArrayList arrayList = new ArrayList(userBookListInfo.getCategories_infoSize());
                for (UserBookCategory userBookCategory : userBookListInfo.getCategories_info()) {
                    if (anyBooks(userBookCategory)) {
                        BookCategory bookCategory = new BookCategory();
                        bookCategory.setCategoryName(userBookCategory.getCategory_name());
                        ArrayList arrayList2 = new ArrayList(userBookCategory.getSub_categoriesSize());
                        for (UserSubCategory userSubCategory : userBookCategory.getSub_categories()) {
                            BookCategory.SubCategory subCategory = new BookCategory.SubCategory();
                            subCategory.setSubName(userSubCategory.getSub_name());
                            subCategory.setBookIds(userSubCategory.getBook_ids());
                            arrayList2.add(subCategory);
                        }
                        bookCategory.setSubCategories(arrayList2);
                        bookCategory.setCategoryId(userBookCategory.getCate_id());
                        bookCategory.setCategoryTagName(userBookCategory.getTag_name());
                        arrayList.add(bookCategory);
                    } else {
                        qb.c.b(TAG, "Category " + userBookCategory.getCategory_name() + " has no books!", new Object[0]);
                    }
                }
                i9.f.l(context, i9.f.f60364c, arrayList, new bp.a<List<BookCategory>>() { // from class: com.baicizhan.client.business.managers.booklist.BookListManager.2
                }.getType(), false);
                ArrayList arrayList3 = new ArrayList(userBookListInfo.getAll_topsSize());
                for (BookLevelInfo bookLevelInfo : userBookListInfo.getAll_tops()) {
                    arrayList3.add(new AllTopCategoryInfo(bookLevelInfo.cate_name, new ArrayList(bookLevelInfo.cate_ids)));
                }
                i9.f.l(context, i9.f.f60368e, arrayList3, new bp.a<List<AllTopCategoryInfo>>() { // from class: com.baicizhan.client.business.managers.booklist.BookListManager.3
                }.getType(), false);
                ArrayList arrayList4 = new ArrayList(userBookListInfo.getLevels_infoSize());
                for (BookLevelInfo bookLevelInfo2 : userBookListInfo.getLevels_info()) {
                    arrayList4.add(new UserIdentityLevelInfo(bookLevelInfo2.getRole_id(), new ArrayList(bookLevelInfo2.getCate_ids())));
                }
                i9.f.l(context, i9.f.f60366d, arrayList4, new bp.a<List<UserIdentityLevelInfo>>() { // from class: com.baicizhan.client.business.managers.booklist.BookListManager.4
                }.getType(), false);
                this.mBooks = hashMap;
                setBookCategory(arrayList);
                qb.c.b(TAG, "book category size from server: " + this.mBookCategory.size(), new Object[0]);
            }
            long j11 = this.mRemoteBookListVersion;
            if (j11 > 0) {
                i9.f.m(context, i9.f.f60370f, j11);
            }
            nc.b.b().m(BOOK_LIST_MANAGER_VERSION, 100);
            return true;
        } catch (Exception e11) {
            if (!(e11 instanceof TTransportException)) {
                qb.c.d(TAG, Log.getStackTraceString(e11), new Object[0]);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadImpl(Context context, UserStudyApiService.Client client) throws Exception {
        boolean z11;
        if (isReady()) {
            return;
        }
        long f11 = i9.f.f(context, i9.f.f60370f);
        qb.c.b(TAG, "check book_list version " + f11 + " - " + this.mRemoteBookListVersion, new Object[0]);
        if ((this.mForceRefresh || needUpdate() || hasBookListChange()) && loadBookListFromServer(context, client)) {
            this.mForceRefresh = false;
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.mForceRefresh && !z11 && !isBookListComplete()) {
            long j11 = this.mRemoteBookListVersion;
            if (f11 == j11 || j11 == 0) {
                loadBookListFromClient(context);
            }
        }
        updateSelectedBookInfos(client);
        if (z11) {
            i9.a.m(context, this.mBooks.values());
        }
        qb.c.b(TAG, "loadBookList size " + this.mBooks.size(), new Object[0]);
        if (!isBookListComplete() || hasBookListChange()) {
            throw new Exception("获取书列表失败");
        }
    }

    private boolean needUpdate() {
        long f11 = i9.f.f(pb.a.a(), i9.f.f60370f);
        qb.c.i(TAG, "%d--%d", Long.valueOf(f11), Long.valueOf(this.mRemoteBookListVersion));
        if (f11 == 0) {
            return true;
        }
        long j11 = this.mRemoteBookListVersion;
        return !(0 == j11 || j11 == f11) || isGameMode();
    }

    private rx.c<MergeState> queryMergeResult(final String taskId, final int bookId, final UserStudyApiService.Client client) {
        return rx.c.j1(new c.a() { // from class: com.baicizhan.client.business.managers.booklist.e
            @Override // wb0.b
            public final void call(Object obj) {
                BookListManager.c(UserStudyApiService.Client.this, taskId, (qb0.g) obj);
            }
        }).F4(new p() { // from class: com.baicizhan.client.business.managers.booklist.f
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c lambda$queryMergeResult$6;
                lambda$queryMergeResult$6 = BookListManager.this.lambda$queryMergeResult$6((rx.c) obj);
                return lambda$queryMergeResult$6;
            }
        });
    }

    private void setBookCategoriesMap(List<BookCategory> bookCategory) {
        this.mBookCategoriesMap.clear();
        for (BookCategory bookCategory2 : bookCategory) {
            this.mBookCategoriesMap.put(bookCategory2.getCategoryId(), bookCategory2);
        }
    }

    private void setBookCategory(List<BookCategory> bookCategory) {
        Iterator<BookCategory> it = bookCategory.iterator();
        while (it.hasNext()) {
            BookCategory next = it.next();
            if (xb.e.h(next.getSubCategories())) {
                it.remove();
            } else {
                Iterator<BookCategory.SubCategory> it2 = next.getSubCategories().iterator();
                while (it2.hasNext()) {
                    BookCategory.SubCategory next2 = it2.next();
                    if (xb.e.h(next2.getBookIds())) {
                        it2.remove();
                    } else {
                        Iterator<Integer> it3 = next2.getBookIds().iterator();
                        while (it3.hasNext()) {
                            if (getInstance().getBookById(it3.next().intValue()) == null) {
                                it3.remove();
                            }
                        }
                        if (xb.e.h(next2.getBookIds())) {
                            it2.remove();
                        }
                    }
                }
                if (xb.e.h(next.getSubCategories())) {
                    it.remove();
                }
            }
        }
        this.mBookCategory = bookCategory;
        setBookCategoriesMap(bookCategory);
    }

    private void updateSelectedBookInfos(UserStudyApiService.Client client) {
        try {
            List<SelectBookPlanInfo> list = client.get_all_selected_book_plan_info();
            ArrayList arrayList = new ArrayList(this.mBooks.size());
            if (list == null || list.size() <= 0) {
                return;
            }
            Iterator<BookRecord> it = this.mBooks.values().iterator();
            while (it.hasNext()) {
                it.next().clearSelectedInfo();
            }
            for (SelectBookPlanInfo selectBookPlanInfo : list) {
                BookRecord bookRecord = this.mBooks.get(Integer.valueOf(selectBookPlanInfo.getBook_id()));
                if (bookRecord != null) {
                    bookRecord.updateSelectedInfo(selectBookPlanInfo);
                    arrayList.add(bookRecord);
                    qb.c.b(TAG, "updateSelected " + selectBookPlanInfo + j2.O + bookRecord, new Object[0]);
                }
            }
            this.mSelectedBook = arrayList;
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public synchronized void addSelectedBook(Context context, int bookId, UserSelectedBookInfo info) {
        BookRecord bookRecord = this.mBooks.get(Integer.valueOf(bookId));
        if (bookRecord != null) {
            bookRecord.updateSelectedInfo(info);
            i9.a.n(context, bookRecord);
            this.mSelectedBook.remove(bookRecord);
            this.mSelectedBook.add(0, bookRecord);
        }
    }

    public void clear() {
        this.mBooks.clear();
        this.mBookCategory.clear();
        this.mSelectedBook.clear();
        i9.f.m(pb.a.a(), i9.f.f60370f, 0L);
    }

    public BookRecord getBookById(int bookId) {
        return this.mBooks.get(Integer.valueOf(bookId));
    }

    public List<BookCategory> getBookCategoriesById(List<String> ids) {
        ArrayList arrayList = new ArrayList();
        if (ids != null) {
            for (String str : ids) {
                BookCategory bookCategory = this.mBookCategoriesMap.get(str);
                if (bookCategory != null) {
                    arrayList.add(bookCategory);
                } else {
                    qb.c.d(TAG, "error id: " + str, new Object[0]);
                }
            }
        }
        return arrayList;
    }

    public BookUpdateInfos.BookUpdateInfo getBookUpdateInfo(int book) {
        return this.mBookUpdater.getUpdateInfo(book);
    }

    public Map<Integer, BookRecord> getBooks() {
        return this.mBooks;
    }

    public BookCategory getCategoryByBookId(int bookId) {
        BookCategory bookCategory = null;
        for (BookCategory bookCategory2 : this.mBookCategory) {
            Iterator<BookCategory.SubCategory> it = bookCategory2.getSubCategories().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().getBookIds().contains(Integer.valueOf(bookId))) {
                    bookCategory = bookCategory2;
                    break;
                }
            }
            if (bookCategory != null) {
                break;
            }
        }
        return bookCategory;
    }

    public String getLockModifyReasonDesc() {
        return this.mLockReasonDesc;
    }

    public List<BookRecord> getPurchasedBooks() {
        return new ArrayList();
    }

    public List<BookRecord> getSelectedBooks() {
        ArrayList arrayList = new ArrayList();
        if (!xb.e.h(this.mSelectedBook)) {
            arrayList.addAll(this.mSelectedBook);
            return arrayList;
        }
        for (BookRecord bookRecord : this.mBooks.values()) {
            if (bookRecord.isSelected()) {
                arrayList.add(bookRecord);
            }
        }
        return arrayList;
    }

    public boolean hasReject() {
        return this.mBookUpdater.hasReject();
    }

    public boolean isLockModify() {
        return this.mLockModify;
    }

    public boolean isReady() {
        return (this.mForceRefresh || !isBookListComplete() || needUpdate() || hasBookListChange()) ? false : true;
    }

    public BookRecord lazyLoadCurrentBookRecord(Context context, ScheduleRecord scheduleRecord) {
        BookRecord bookRecord = this.mBooks.get(Integer.valueOf(scheduleRecord.bookId));
        boolean z11 = false;
        if (bookRecord == null && (bookRecord = i9.a.g(context, scheduleRecord.bookId)) == null) {
            bookRecord = new BookRecord();
            z11 = true;
        }
        bookRecord.updateCurrentBookInfo(scheduleRecord);
        if (z11) {
            i9.a.n(context, bookRecord);
            return bookRecord;
        }
        i9.a.s(context, bookRecord, "bookName", "wordCount", "dailyCount", "reviewCount");
        return bookRecord;
    }

    public rx.c<Integer> load(final Context context) {
        return com.baicizhan.client.business.thrift.p.b("/rpc/user_study").I3(bc0.c.e()).c3(new p<UserStudyApiService.Client, Integer>() { // from class: com.baicizhan.client.business.managers.booklist.BookListManager.1
            @Override // wb0.p
            public Integer call(UserStudyApiService.Client client) {
                try {
                    BookListManager.this.loadImpl(context, client);
                    return 0;
                } catch (Throwable th2) {
                    throw vb0.a.c(th2);
                }
            }
        });
    }

    public rx.c<List<Integer>> loadHasPayedBooks() {
        return com.baicizhan.client.business.thrift.p.b("/rpc/user_study").I3(bc0.c.e()).c3(new p() { // from class: com.baicizhan.client.business.managers.booklist.c
            @Override // wb0.p
            public final Object call(Object obj) {
                return BookListManager.e((UserStudyApiService.Client) obj);
            }
        });
    }

    public rx.c<Integer> loadSelectBook() {
        return com.baicizhan.client.business.thrift.p.b("/rpc/user_study").I3(bc0.c.e()).c3(new p() { // from class: com.baicizhan.client.business.managers.booklist.g
            @Override // wb0.p
            public final Object call(Object obj) {
                Integer lambda$loadSelectBook$2;
                lambda$loadSelectBook$2 = BookListManager.this.lambda$loadSelectBook$2((UserStudyApiService.Client) obj);
                return lambda$loadSelectBook$2;
            }
        });
    }

    public rx.c<String> loadSpecialDes(final int bookId) {
        return com.baicizhan.client.business.thrift.p.b("/rpc/user_study").I3(bc0.c.e()).c3(new p() { // from class: com.baicizhan.client.business.managers.booklist.d
            @Override // wb0.p
            public final Object call(Object obj) {
                return BookListManager.g(bookId, (UserStudyApiService.Client) obj);
            }
        });
    }

    public rx.c<MergeState> mergeLearnRecord(final int bookId, final List<Integer> oldBooks) {
        qb.c.i(TAG, "mergeLearnRecord %d, %s", Integer.valueOf(bookId), oldBooks == null ? "null" : BczJson.writeToJson(oldBooks, List.class));
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/user_study").c(1)).I3(bc0.c.e()).b2(new p() { // from class: com.baicizhan.client.business.managers.booklist.a
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c lambda$mergeLearnRecord$3;
                lambda$mergeLearnRecord$3 = BookListManager.this.lambda$mergeLearnRecord$3(bookId, oldBooks, (UserStudyApiService.Client) obj);
                return lambda$mergeLearnRecord$3;
            }
        }).F4(new p() { // from class: com.baicizhan.client.business.managers.booklist.b
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c lambda$mergeLearnRecord$4;
                lambda$mergeLearnRecord$4 = BookListManager.this.lambda$mergeLearnRecord$4((rx.c) obj);
                return lambda$mergeLearnRecord$4;
            }
        });
    }

    public void refreshBookUpdateInfos() {
        this.mBookUpdater.requestUpdateInfo();
    }

    public synchronized void removeSelectedBook(Context context, int bookId) {
        BookRecord bookRecord = this.mBooks.get(Integer.valueOf(bookId));
        if (bookRecord != null) {
            bookRecord.clearSelectedInfo();
            i9.a.n(context, bookRecord);
            for (BookRecord bookRecord2 : this.mSelectedBook) {
                if (bookRecord2.bookId == bookId) {
                    this.mSelectedBook.remove(bookRecord2);
                    return;
                }
            }
        }
    }

    public void setForceRefresh() {
        this.mForceRefresh = true;
    }

    public void setLockModify(boolean lock, String reason) {
        this.mLockModify = lock;
        if (lock) {
            this.mLockReasonDesc = reason;
        } else {
            this.mLockReasonDesc = null;
        }
    }

    public void setRemoteBookListVersion(long mRemoteBookListVersion) {
        this.mRemoteBookListVersion = mRemoteBookListVersion;
    }

    public void updateBookById(int bookId, BookRecord r11) {
        this.mBooks.put(Integer.valueOf(bookId), r11);
    }

    public void userRejectUpdate(boolean reject) {
        this.mBookUpdater.userReject(reject);
    }

    public rx.c<MergeState> mergeLearnRecord(final int bookId) {
        return mergeLearnRecord(bookId, new ArrayList());
    }
}
