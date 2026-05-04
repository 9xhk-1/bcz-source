package com.baicizhan.main.rx;

import android.util.SparseArray;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.advertise_api.BookAd;
import com.baicizhan.online.advertise_api.BookAdV2;
import com.google.gson.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import qb.c;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BookAdObservables {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24797a = "BookAdObservables";

    /* renamed from: b, reason: collision with root package name */
    public static final String f24798b = "BookAdTime";

    /* renamed from: c, reason: collision with root package name */
    public static final String f24799c = "BookAdData";

    /* renamed from: d, reason: collision with root package name */
    public static final String f24800d = "bookAds";

    /* renamed from: e, reason: collision with root package name */
    public static final int f24801e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f24802f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static SparseArray<BookAdInfo> f24803g;

    /* renamed from: h, reason: collision with root package name */
    public static SparseArray<BookAdInfo> f24804h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookAdInfo implements NoProguard {
        public static final int LOCAL = 1;
        public static final int TAOBAO = 2;
        public String aId;
        public int book_id;
        public int jump_type;
        public String local_link;
        public String show_name;
        public String taobao_link;

        public static BookAdInfo from(BookAd bookAd) {
            BookAdInfo bookAdInfo = new BookAdInfo();
            bookAdInfo.book_id = bookAd.book_id;
            bookAdInfo.show_name = bookAd.show_name;
            bookAdInfo.jump_type = bookAd.jump_type;
            bookAdInfo.local_link = bookAd.local_link;
            bookAdInfo.taobao_link = bookAd.taobao_link;
            bookAdInfo.aId = bookAd.aid;
            return bookAdInfo;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookAdInfos implements NoProguard {
        public List<BookAdInfo> homepageInfos;
        public List<BookAdInfo> wordListInfos;

        public static BookAdInfos from(List<BookAd> homepageBookAds, List<BookAd> wordListBookAds) {
            BookAdInfos bookAdInfos = new BookAdInfos();
            bookAdInfos.homepageInfos = new ArrayList();
            if (homepageBookAds != null && !homepageBookAds.isEmpty()) {
                Iterator<BookAd> it = homepageBookAds.iterator();
                while (it.hasNext()) {
                    bookAdInfos.homepageInfos.add(BookAdInfo.from(it.next()));
                }
            }
            bookAdInfos.wordListInfos = new ArrayList();
            if (wordListBookAds != null && !wordListBookAds.isEmpty()) {
                Iterator<BookAd> it2 = wordListBookAds.iterator();
                while (it2.hasNext()) {
                    bookAdInfos.wordListInfos.add(BookAdInfo.from(it2.next()));
                }
            }
            return bookAdInfos;
        }

        public SparseArray<BookAdInfo> toMap(int type) {
            SparseArray<BookAdInfo> sparseArray = new SparseArray<>();
            for (BookAdInfo bookAdInfo : type == 1 ? this.homepageInfos : this.wordListInfos) {
                sparseArray.put(bookAdInfo.book_id, bookAdInfo);
            }
            return sparseArray;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<BookAdInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f24805a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f24806b;

        public a(final int val$type, final int val$bookId) {
            this.f24805a = val$type;
            this.f24806b = val$bookId;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BookAdInfo call() throws Exception {
            if (BookAdObservables.d(this.f24805a)) {
                return BookAdObservables.g(this.f24806b, this.f24805a);
            }
            if (!TimeUtil.getTodayEn().equals(nc.b.c(BookAdObservables.f24800d).getString(BookAdObservables.f24798b, ""))) {
                throw new RuntimeException("expire try server");
            }
            String string = nc.b.c(BookAdObservables.f24800d).getString(BookAdObservables.f24799c, "");
            c.b(BookAdObservables.f24797a, "bookId %d, data %s", Integer.valueOf(this.f24806b), string);
            BookAdObservables.j((BookAdInfos) new d().n(string, BookAdInfos.class));
            return BookAdObservables.g(this.f24806b, this.f24805a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<AdvertiseApiService.Client, rx.c<BookAdInfo>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f24807a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f24808b;

        public b(final int val$bookId, final int val$type) {
            this.f24807a = val$bookId;
            this.f24808b = val$type;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<BookAdInfo> call(AdvertiseApiService.Client client) {
            try {
                BookAdV2 bookAdV2 = client.get_books_ad_v2();
                BookAdInfos from = BookAdInfos.from(bookAdV2.homepage, bookAdV2.wordlist);
                String z11 = new d().z(from);
                c.b(BookAdObservables.f24797a, "bookId %d, data %s", Integer.valueOf(this.f24807a), z11);
                BookAdObservables.j(from);
                nc.b.c(BookAdObservables.f24800d).p(BookAdObservables.f24799c, z11);
                nc.b.c(BookAdObservables.f24800d).p(BookAdObservables.f24798b, TimeUtil.getTodayEn());
                return rx.c.M2(BookAdObservables.g(this.f24807a, this.f24808b));
            } catch (Exception e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    public static boolean d(final int type) {
        return (type == 1 && f24803g != null) || (type == 2 && f24804h != null);
    }

    public static rx.c<BookAdInfo> e(final int bookId, final int type) {
        return rx.c.z2(new a(type, bookId)).w5(bc0.c.e());
    }

    public static rx.c<BookAdInfo> f(final int bookId, final int type) {
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/advertise")).b2(new b(bookId, type)).w5(bc0.c.e());
    }

    public static BookAdInfo g(final int bookId, final int type) {
        SparseArray<BookAdInfo> sparseArray;
        SparseArray<BookAdInfo> sparseArray2;
        if (type == 2 && (sparseArray2 = f24804h) != null) {
            return sparseArray2.get(bookId);
        }
        if (type != 1 || (sparseArray = f24803g) == null) {
            return null;
        }
        return sparseArray.get(bookId);
    }

    public static rx.c<BookAdInfo> h(int bookId) {
        return e(bookId, 1).U3(f(bookId, 1));
    }

    public static rx.c<BookAdInfo> i(int bookId) {
        return e(bookId, 2).U3(f(bookId, 2));
    }

    public static void j(BookAdInfos infos) {
        f24803g = infos.toMap(1);
        f24804h = infos.toMap(2);
    }
}
