package com.baicizhan.main.word_book.data.impl;

import a00.i0;
import a00.r0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.user_book.AddBookReq;
import com.baicizhan.online.user_book.AddSingleWordRsp;
import com.baicizhan.online.user_book.AddWordsRsp;
import com.baicizhan.online.user_book.AddWordsToBooksRsp;
import com.baicizhan.online.user_book.MatchWordReq;
import com.baicizhan.online.user_book.ShareBookInfo;
import com.baicizhan.online.user_book.UpdateBookReq;
import com.baicizhan.online.user_book.UserBookInfo;
import com.baicizhan.online.user_book.UserBookItem;
import com.baicizhan.online.user_book.UserBookService;
import com.baicizhan.online.user_book.UserBookWord;
import com.baicizhan.online.user_book.UserBookWordDetail;
import com.baicizhan.online.user_study_api.CopperExchangeInfo;
import com.baicizhan.online.user_study_api.CopperExchangeReq;
import com.baicizhan.online.user_study_api.CopperExchangeRsp;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import ij.a0;
import ij.b0;
import ij.c0;
import ij.d0;
import ij.w;
import ij.x;
import ij.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nWordBookServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookServiceImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1563#2:150\n1634#2,3:151\n1563#2:155\n1634#2,3:156\n1563#2:159\n1634#2,3:160\n1563#2:163\n1634#2,3:164\n1563#2:167\n1634#2,3:168\n1563#2:171\n1634#2,3:172\n1563#2:175\n1634#2,3:176\n1563#2:179\n1634#2,3:180\n1#3:154\n*S KotlinDebug\n*F\n+ 1 WordBookServiceImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookServiceImpl\n*L\n81#1:150\n81#1:151,3\n93#1:155\n93#1:156,3\n95#1:159\n95#1:160,3\n97#1:163\n97#1:164,3\n100#1:167\n100#1:168,3\n103#1:171\n103#1:172,3\n106#1:175\n106#1:176,3\n120#1:179\n120#1:180,3\n*E\n"})
/* loaded from: classes5.dex */
public final class o implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final int f26697a = 0;

    @Override // ij.w
    @m80.l
    public Object a(long j11, @m80.k j00.c<? super List<z>> cVar) {
        z e11;
        List<UserBookWordDetail> list = u().get_user_book_words(j11);
        g0.o(list, "get_user_book_words(...)");
        List<UserBookWordDetail> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        for (UserBookWordDetail userBookWordDetail : list2) {
            g0.m(userBookWordDetail);
            e11 = p.e(userBookWordDetail);
            arrayList.add(e11);
        }
        return arrayList;
    }

    @Override // ij.w
    @m80.l
    public Object b(@m80.k j00.c<? super x> cVar) {
        kj.a g11;
        UserBookInfo userBookInfo = u().get_user_books();
        int i11 = userBookInfo.max_limit;
        List<UserBookItem> user_books = userBookInfo.user_books;
        g0.o(user_books, "user_books");
        List<UserBookItem> list = user_books;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (UserBookItem userBookItem : list) {
            g0.m(userBookItem);
            g11 = p.g(userBookItem);
            arrayList.add(g11);
        }
        return new x(i11, arrayList, userBookInfo.isSetCopper_limit() ? userBookInfo.copper_limit : 0);
    }

    @Override // ij.w
    @m80.l
    public Object c(int i11, @m80.k j00.c<? super ij.b> cVar) {
        CopperExchangeRsp copper_exchange = w().copper_exchange(new CopperExchangeReq(i11));
        boolean z11 = copper_exchange.code == 0;
        String message = copper_exchange.message;
        g0.o(message, "message");
        return new ij.b(z11, message);
    }

    @Override // ij.w
    @m80.l
    public Object d(@m80.k String str, @m80.k j00.c<? super kj.a> cVar) {
        kj.a g11;
        UserBookItem add_user_book = u().add_user_book(str);
        g0.o(add_user_book, "add_user_book(...)");
        g11 = p.g(add_user_book);
        return g11;
    }

    @Override // ij.w
    @m80.l
    public Object e(@m80.k Set<Long> set, @m80.k List<c0> list, @m80.k j00.c<? super b0> cVar) {
        z e11;
        kj.a g11;
        UserBookWord h11;
        UserBookService.Client u11 = u();
        List<Long> a62 = r0.a6(set);
        List<c0> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            h11 = p.h((c0) it.next());
            arrayList.add(h11);
        }
        AddWordsToBooksRsp add_words_to_books = u11.add_words_to_books(a62, arrayList);
        List<UserBookItem> book_infos = add_words_to_books.book_infos;
        g0.o(book_infos, "book_infos");
        List<UserBookItem> list3 = book_infos;
        ArrayList arrayList2 = new ArrayList(i0.d0(list3, 10));
        for (UserBookItem userBookItem : list3) {
            g0.m(userBookItem);
            g11 = p.g(userBookItem);
            arrayList2.add(g11);
        }
        List<UserBookWordDetail> words = add_words_to_books.words;
        g0.o(words, "words");
        List<UserBookWordDetail> list4 = words;
        ArrayList arrayList3 = new ArrayList(i0.d0(list4, 10));
        for (UserBookWordDetail userBookWordDetail : list4) {
            g0.m(userBookWordDetail);
            e11 = p.e(userBookWordDetail);
            arrayList3.add(e11);
        }
        return new b0(arrayList2, arrayList3);
    }

    @Override // ij.w
    @m80.l
    public Object f(@m80.k String str, @m80.k j00.c<? super kj.a> cVar) {
        kj.a g11;
        UserBookItem add_user_book_by_code = u().add_user_book_by_code(str);
        g0.o(add_user_book_by_code, "add_user_book_by_code(...)");
        g11 = p.g(add_user_book_by_code);
        return g11;
    }

    @Override // ij.w
    @m80.l
    public Object g(long j11, @m80.k List<Integer> list, @m80.k j00.c<? super kj.a> cVar) {
        kj.a g11;
        UserBookItem delete_user_book_words = u().delete_user_book_words(j11, list);
        g0.o(delete_user_book_words, "delete_user_book_words(...)");
        g11 = p.g(delete_user_book_words);
        return g11;
    }

    @Override // ij.w
    @m80.l
    public Object h(long j11, @m80.k j00.c<? super Long> cVar) {
        return l00.a.g(u().delete_user_book(j11));
    }

    @Override // ij.w
    @m80.l
    public Object i(int i11, @m80.k j00.c<? super ij.a> cVar) {
        CopperExchangeInfo copperExchangeInfo = w().get_copper_exchange_info(i11);
        String title = copperExchangeInfo.title;
        g0.o(title, "title");
        String icon = copperExchangeInfo.icon;
        g0.o(icon, "icon");
        String count = copperExchangeInfo.count;
        g0.o(count, "count");
        int i12 = copperExchangeInfo.copper_cost;
        int i13 = copperExchangeInfo.copper_hold;
        String jump_url = copperExchangeInfo.jump_url;
        g0.o(jump_url, "jump_url");
        String copper_desc = copperExchangeInfo.copper_desc;
        g0.o(copper_desc, "copper_desc");
        return new ij.a(title, icon, count, i12, i13, jump_url, copper_desc);
    }

    @Override // ij.w
    @m80.l
    public Object j(@m80.k byte[] bArr, @m80.k j00.c<? super List<c0>> cVar) {
        c0 f11;
        List<UserBookWord> match_words_ocr_draw = v().match_words_ocr_draw(ByteBuffer.wrap(bArr));
        g0.o(match_words_ocr_draw, "match_words_ocr_draw(...)");
        List<UserBookWord> list = match_words_ocr_draw;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (UserBookWord userBookWord : list) {
            g0.m(userBookWord);
            f11 = p.f(userBookWord);
            arrayList.add(f11);
        }
        return arrayList;
    }

    @Override // ij.w
    @m80.l
    public Object k(long j11, @m80.k String str, @m80.k List<Integer> list, @m80.k j00.c<? super kj.a> cVar) {
        kj.a g11;
        UserBookItem update_user_book_info = u().update_user_book_info(new UpdateBookReq().setUser_book_id(j11).setBook_name(str).setTags(list));
        g0.o(update_user_book_info, "update_user_book_info(...)");
        g11 = p.g(update_user_book_info);
        return g11;
    }

    @Override // ij.w
    @m80.l
    public Object l(@m80.k String str, @m80.k j00.c<? super ij.i> cVar) {
        ShareBookInfo shareBookInfo = u().get_share_code_info(str);
        return new ij.i(shareBookInfo.valid, shareBookInfo.book_name);
    }

    @Override // ij.w
    @m80.l
    public Object m(@m80.k byte[] bArr, @m80.k j00.c<? super List<c0>> cVar) {
        c0 f11;
        List<UserBookWord> match_words_ocr = v().match_words_ocr(ByteBuffer.wrap(bArr));
        g0.o(match_words_ocr, "match_words_ocr(...)");
        List<UserBookWord> list = match_words_ocr;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (UserBookWord userBookWord : list) {
            g0.m(userBookWord);
            f11 = p.f(userBookWord);
            arrayList.add(f11);
        }
        return arrayList;
    }

    @Override // ij.w
    @m80.l
    public Object n(long j11, @m80.k List<c0> list, @m80.k j00.c<? super a0> cVar) {
        kj.a g11;
        z e11;
        UserBookWord h11;
        UserBookService.Client u11 = u();
        List<c0> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            h11 = p.h((c0) it.next());
            arrayList.add(h11);
        }
        AddWordsRsp add_words_to_book = u11.add_words_to_book(j11, arrayList);
        UserBookItem book_info = add_words_to_book.book_info;
        g0.o(book_info, "book_info");
        g11 = p.g(book_info);
        List<UserBookWordDetail> words = add_words_to_book.words;
        g0.o(words, "words");
        List<UserBookWordDetail> list3 = words;
        ArrayList arrayList2 = new ArrayList(i0.d0(list3, 10));
        for (UserBookWordDetail userBookWordDetail : list3) {
            g0.m(userBookWordDetail);
            e11 = p.e(userBookWordDetail);
            arrayList2.add(e11);
        }
        return new a0(g11, arrayList2);
    }

    @Override // ij.w
    @m80.l
    public Object o(long j11, @m80.k String str, @m80.k j00.c<? super kj.a> cVar) {
        kj.a g11;
        UserBookItem update_user_book_name = u().update_user_book_name(str, j11);
        g0.o(update_user_book_name, "update_user_book_name(...)");
        g11 = p.g(update_user_book_name);
        return g11;
    }

    @Override // ij.w
    @m80.l
    public Object p(@m80.k String str, @m80.k j00.c<? super List<c0>> cVar) {
        c0 f11;
        List<UserBookWord> match_words = u().match_words(str);
        g0.o(match_words, "match_words(...)");
        List<UserBookWord> list = match_words;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (UserBookWord userBookWord : list) {
            g0.m(userBookWord);
            f11 = p.f(userBookWord);
            arrayList.add(f11);
        }
        return arrayList;
    }

    @Override // ij.w
    @m80.l
    public Object q(@m80.k c0 c0Var, @m80.k List<Long> list, @m80.k j00.c<? super d0> cVar) {
        UserBookWord h11;
        UserBookService.Client u11 = u();
        h11 = p.h(c0Var);
        AddSingleWordRsp add_word_to_books = u11.add_word_to_books(h11, list);
        long j11 = add_word_to_books.updated_at;
        UserBookWordDetail userBookWordDetail = add_word_to_books.word;
        return new d0(j11, userBookWordDetail != null ? p.e(userBookWordDetail) : null);
    }

    @Override // ij.w
    @m80.l
    public Object r(@m80.k String str, @m80.k List<Integer> list, @m80.k j00.c<? super kj.a> cVar) {
        kj.a g11;
        UserBookService.Client u11 = u();
        AddBookReq addBookReq = new AddBookReq(str);
        addBookReq.setTags(list);
        UserBookItem add_user_book_v2 = u11.add_user_book_v2(addBookReq);
        g0.o(add_user_book_v2, "add_user_book_v2(...)");
        g11 = p.g(add_user_book_v2);
        return g11;
    }

    @Override // ij.w
    @m80.l
    public Object s(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super List<c0>> cVar) {
        c0 f11;
        List<UserBookWord> match_words_v2 = u().match_words_v2(new MatchWordReq(i11, list));
        g0.o(match_words_v2, "match_words_v2(...)");
        List<UserBookWord> list2 = match_words_v2;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        for (UserBookWord userBookWord : list2) {
            g0.m(userBookWord);
            f11 = p.f(userBookWord);
            arrayList.add(f11);
        }
        return arrayList;
    }

    @Override // ij.w
    @m80.l
    public Object t(long j11, @m80.k j00.c<? super String> cVar) {
        String str = u().get_user_book_share_code(j11);
        g0.o(str, "get_user_book_share_code(...)");
        return str;
    }

    public final UserBookService.Client u() {
        return (UserBookService.Client) new com.baicizhan.client.business.thrift.l("/rpc/user_book").a();
    }

    public final UserBookService.Client v() {
        return (UserBookService.Client) new com.baicizhan.client.business.thrift.l("/rpc/user_book").b(30000).d(30000).a();
    }

    public final UserStudyApiService.Client w() {
        return (UserStudyApiService.Client) new com.baicizhan.client.business.thrift.l("/rpc/user_study").a();
    }
}
