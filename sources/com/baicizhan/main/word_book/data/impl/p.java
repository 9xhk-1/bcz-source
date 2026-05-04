package com.baicizhan.main.word_book.data.impl;

import a00.h0;
import com.baicizhan.online.user_book.UserBookItem;
import com.baicizhan.online.user_book.UserBookWord;
import com.baicizhan.online.user_book.UserBookWordDetail;
import ij.c0;
import ij.z;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class p {
    public static final z e(UserBookWordDetail userBookWordDetail) {
        int i11 = userBookWordDetail.topic_id;
        int i12 = userBookWordDetail.book_id;
        long j11 = userBookWordDetail.created_at;
        String word = userBookWordDetail.word;
        g0.o(word, "word");
        String mean = userBookWordDetail.mean;
        g0.o(mean, "mean");
        String audio_us = userBookWordDetail.audio_us;
        g0.o(audio_us, "audio_us");
        String audio_uk = userBookWordDetail.audio_uk;
        g0.o(audio_uk, "audio_uk");
        return new z(i11, i12, j11, word, mean, audio_us, audio_uk, null, 0, false, false, 1920, null);
    }

    public static final c0 f(UserBookWord userBookWord) {
        int i11 = userBookWord.topic_id;
        int i12 = userBookWord.book_id;
        long j11 = userBookWord.created_at;
        String word = userBookWord.word;
        g0.o(word, "word");
        String mean = userBookWord.mean;
        g0.o(mean, "mean");
        return new c0(i11, i12, j11, word, mean, null, userBookWord.audio_url, 32, null);
    }

    public static final kj.a g(UserBookItem userBookItem) {
        long j11 = userBookItem.user_book_id;
        String book_name = userBookItem.book_name;
        g0.o(book_name, "book_name");
        int i11 = userBookItem.word_num;
        String cover = userBookItem.cover;
        g0.o(cover, "cover");
        long j12 = userBookItem.updated_at;
        List<Integer> list = userBookItem.tags;
        if (list == null) {
            list = h0.J();
        }
        return new kj.a(j11, book_name, i11, cover, j12, list);
    }

    public static final UserBookWord h(c0 c0Var) {
        UserBookWord userBookWord = new UserBookWord();
        userBookWord.topic_id = c0Var.o();
        userBookWord.book_id = c0Var.l();
        userBookWord.created_at = c0Var.m();
        userBookWord.word = c0Var.p();
        userBookWord.mean = c0Var.n();
        return userBookWord;
    }
}
