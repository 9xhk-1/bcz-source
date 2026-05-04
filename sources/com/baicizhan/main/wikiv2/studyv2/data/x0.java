package com.baicizhan.main.wikiv2.studyv2.data;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class x0 implements o0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f26130i = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f26131a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26132b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f26133c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f26134d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f26135e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final Uri f26136f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final w f26137g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f26138h;

    public x0(int i11, int i12, @m80.k String word, @m80.l String str, @m80.k String phonetic, @m80.l Uri uri, @m80.l w wVar, @m80.k MutableLiveData<Boolean> playStatus) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(phonetic, "phonetic");
        kotlin.jvm.internal.g0.p(playStatus, "playStatus");
        this.f26131a = i11;
        this.f26132b = i12;
        this.f26133c = word;
        this.f26134d = str;
        this.f26135e = phonetic;
        this.f26136f = uri;
        this.f26137g = wVar;
        this.f26138h = playStatus;
    }

    public static /* synthetic */ x0 k(x0 x0Var, int i11, int i12, String str, String str2, String str3, Uri uri, w wVar, MutableLiveData mutableLiveData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = x0Var.f26131a;
        }
        if ((i13 & 2) != 0) {
            i12 = x0Var.f26132b;
        }
        if ((i13 & 4) != 0) {
            str = x0Var.f26133c;
        }
        if ((i13 & 8) != 0) {
            str2 = x0Var.f26134d;
        }
        if ((i13 & 16) != 0) {
            str3 = x0Var.f26135e;
        }
        if ((i13 & 32) != 0) {
            uri = x0Var.f26136f;
        }
        if ((i13 & 64) != 0) {
            wVar = x0Var.f26137g;
        }
        if ((i13 & 128) != 0) {
            mutableLiveData = x0Var.f26138h;
        }
        w wVar2 = wVar;
        MutableLiveData mutableLiveData2 = mutableLiveData;
        String str4 = str3;
        Uri uri2 = uri;
        return x0Var.j(i11, i12, str, str2, str4, uri2, wVar2, mutableLiveData2);
    }

    @Override // com.baicizhan.main.wikiv2.studyv2.data.o0
    @m80.k
    public MutableLiveData<Boolean> a() {
        return this.f26138h;
    }

    public final int b() {
        return this.f26131a;
    }

    public final int c() {
        return this.f26132b;
    }

    @m80.k
    public final String d() {
        return this.f26133c;
    }

    @m80.l
    public final String e() {
        return this.f26134d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f26131a == x0Var.f26131a && this.f26132b == x0Var.f26132b && kotlin.jvm.internal.g0.g(this.f26133c, x0Var.f26133c) && kotlin.jvm.internal.g0.g(this.f26134d, x0Var.f26134d) && kotlin.jvm.internal.g0.g(this.f26135e, x0Var.f26135e) && kotlin.jvm.internal.g0.g(this.f26136f, x0Var.f26136f) && kotlin.jvm.internal.g0.g(this.f26137g, x0Var.f26137g) && kotlin.jvm.internal.g0.g(this.f26138h, x0Var.f26138h);
    }

    @m80.k
    public final String f() {
        return this.f26135e;
    }

    @m80.l
    public final Uri g() {
        return this.f26136f;
    }

    @m80.l
    public final w h() {
        return this.f26137g;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f26131a) * 31) + Integer.hashCode(this.f26132b)) * 31) + this.f26133c.hashCode()) * 31;
        String str = this.f26134d;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26135e.hashCode()) * 31;
        Uri uri = this.f26136f;
        int hashCode3 = (hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        w wVar = this.f26137g;
        return ((hashCode3 + (wVar != null ? wVar.hashCode() : 0)) * 31) + this.f26138h.hashCode();
    }

    @m80.k
    public final MutableLiveData<Boolean> i() {
        return this.f26138h;
    }

    @m80.k
    public final x0 j(int i11, int i12, @m80.k String word, @m80.l String str, @m80.k String phonetic, @m80.l Uri uri, @m80.l w wVar, @m80.k MutableLiveData<Boolean> playStatus) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(phonetic, "phonetic");
        kotlin.jvm.internal.g0.p(playStatus, "playStatus");
        return new x0(i11, i12, word, str, phonetic, uri, wVar, playStatus);
    }

    @m80.l
    public final Uri l() {
        return this.f26136f;
    }

    public final int m() {
        return this.f26132b;
    }

    @m80.l
    public final w n() {
        return this.f26137g;
    }

    @m80.k
    public final String o() {
        return this.f26135e;
    }

    @m80.l
    public final String p() {
        return this.f26134d;
    }

    public final int q() {
        return this.f26131a;
    }

    @m80.k
    public final String r() {
        return this.f26133c;
    }

    @m80.k
    public String toString() {
        return "WordBasic(topicId=" + this.f26131a + ", bookId=" + this.f26132b + ", word=" + this.f26133c + ", split=" + this.f26134d + ", phonetic=" + this.f26135e + ", audio=" + this.f26136f + ", examInfo=" + this.f26137g + ", playStatus=" + this.f26138h + pn.j.f81007d;
    }

    public /* synthetic */ x0(int i11, int i12, String str, String str2, String str3, Uri uri, w wVar, MutableLiveData mutableLiveData, int i13, kotlin.jvm.internal.v vVar) {
        this(i11, i12, str, str2, str3, uri, wVar, (i13 & 128) != 0 ? new MutableLiveData() : mutableLiveData);
    }
}
