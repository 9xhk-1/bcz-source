package com.baicizhan.main.rx;

import com.baicizhan.main.rx.BookAdObservables;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {
    @k
    public static final BookAdObservables.BookAdInfo a(@k th.a aVar) {
        g0.p(aVar, "<this>");
        BookAdObservables.BookAdInfo bookAdInfo = new BookAdObservables.BookAdInfo();
        bookAdInfo.book_id = aVar.j();
        bookAdInfo.show_name = aVar.m();
        bookAdInfo.jump_type = aVar.k();
        bookAdInfo.local_link = aVar.l();
        bookAdInfo.taobao_link = aVar.n();
        bookAdInfo.aId = bookAdInfo.aId;
        return bookAdInfo;
    }

    @k
    public static final th.a b(@k BookAdObservables.BookAdInfo bookAdInfo) {
        g0.p(bookAdInfo, "<this>");
        int i11 = bookAdInfo.book_id;
        String show_name = bookAdInfo.show_name;
        g0.o(show_name, "show_name");
        return new th.a(i11, show_name, bookAdInfo.jump_type, bookAdInfo.local_link, bookAdInfo.taobao_link, bookAdInfo.aId);
    }
}
