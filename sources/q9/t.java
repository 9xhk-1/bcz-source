package q9;

import com.baicizhan.client.business.managers.booklist.BookListManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class t implements tv.h<BookListManager> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final t f81969a = new t();
    }

    public static BookListManager a() {
        return (BookListManager) tv.s.f(s.f81967a.a());
    }

    public static t b() {
        return a.f81969a;
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public BookListManager get() {
        return a();
    }
}
