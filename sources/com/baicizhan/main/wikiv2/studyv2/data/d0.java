package com.baicizhan.main.wikiv2.studyv2.data;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class d0 implements o0 {

    /* renamed from: j, reason: collision with root package name */
    public static final int f26028j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final long f26029a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f26030b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f26031c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f26032d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Uri f26033e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final Uri f26034f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final String f26035g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final String f26036h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f26037i;

    public d0(long j11, @m80.k String sentence, @m80.k String translate, @m80.k String word, @m80.k Uri audio, @m80.l Uri uri, @m80.l String str, @m80.l String str2, @m80.k MutableLiveData<Boolean> playStatus) {
        kotlin.jvm.internal.g0.p(sentence, "sentence");
        kotlin.jvm.internal.g0.p(translate, "translate");
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(audio, "audio");
        kotlin.jvm.internal.g0.p(playStatus, "playStatus");
        this.f26029a = j11;
        this.f26030b = sentence;
        this.f26031c = translate;
        this.f26032d = word;
        this.f26033e = audio;
        this.f26034f = uri;
        this.f26035g = str;
        this.f26036h = str2;
        this.f26037i = playStatus;
    }

    public static /* synthetic */ d0 l(d0 d0Var, long j11, String str, String str2, String str3, Uri uri, Uri uri2, String str4, String str5, MutableLiveData mutableLiveData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = d0Var.f26029a;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = d0Var.f26030b;
        }
        String str6 = str;
        if ((i11 & 4) != 0) {
            str2 = d0Var.f26031c;
        }
        return d0Var.k(j12, str6, str2, (i11 & 8) != 0 ? d0Var.f26032d : str3, (i11 & 16) != 0 ? d0Var.f26033e : uri, (i11 & 32) != 0 ? d0Var.f26034f : uri2, (i11 & 64) != 0 ? d0Var.f26035g : str4, (i11 & 128) != 0 ? d0Var.f26036h : str5, (i11 & 256) != 0 ? d0Var.f26037i : mutableLiveData);
    }

    @Override // com.baicizhan.main.wikiv2.studyv2.data.o0
    @m80.k
    public MutableLiveData<Boolean> a() {
        return this.f26037i;
    }

    public final long b() {
        return this.f26029a;
    }

    @m80.k
    public final String c() {
        return this.f26030b;
    }

    @m80.k
    public final String d() {
        return this.f26031c;
    }

    @m80.k
    public final String e() {
        return this.f26032d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f26029a == d0Var.f26029a && kotlin.jvm.internal.g0.g(this.f26030b, d0Var.f26030b) && kotlin.jvm.internal.g0.g(this.f26031c, d0Var.f26031c) && kotlin.jvm.internal.g0.g(this.f26032d, d0Var.f26032d) && kotlin.jvm.internal.g0.g(this.f26033e, d0Var.f26033e) && kotlin.jvm.internal.g0.g(this.f26034f, d0Var.f26034f) && kotlin.jvm.internal.g0.g(this.f26035g, d0Var.f26035g) && kotlin.jvm.internal.g0.g(this.f26036h, d0Var.f26036h) && kotlin.jvm.internal.g0.g(this.f26037i, d0Var.f26037i);
    }

    @m80.k
    public final Uri f() {
        return this.f26033e;
    }

    @m80.l
    public final Uri g() {
        return this.f26034f;
    }

    @m80.l
    public final String h() {
        return this.f26035g;
    }

    public int hashCode() {
        int hashCode = ((((((((Long.hashCode(this.f26029a) * 31) + this.f26030b.hashCode()) * 31) + this.f26031c.hashCode()) * 31) + this.f26032d.hashCode()) * 31) + this.f26033e.hashCode()) * 31;
        Uri uri = this.f26034f;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.f26035g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26036h;
        return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f26037i.hashCode();
    }

    @m80.l
    public final String i() {
        return this.f26036h;
    }

    @m80.k
    public final MutableLiveData<Boolean> j() {
        return this.f26037i;
    }

    @m80.k
    public final d0 k(long j11, @m80.k String sentence, @m80.k String translate, @m80.k String word, @m80.k Uri audio, @m80.l Uri uri, @m80.l String str, @m80.l String str2, @m80.k MutableLiveData<Boolean> playStatus) {
        kotlin.jvm.internal.g0.p(sentence, "sentence");
        kotlin.jvm.internal.g0.p(translate, "translate");
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(audio, "audio");
        kotlin.jvm.internal.g0.p(playStatus, "playStatus");
        return new d0(j11, sentence, translate, word, audio, uri, str, str2, playStatus);
    }

    @m80.k
    public final Uri m() {
        return this.f26033e;
    }

    @m80.l
    public final Uri n() {
        return this.f26034f;
    }

    @m80.l
    public final String o() {
        return this.f26035g;
    }

    @m80.l
    public final String p() {
        return this.f26036h;
    }

    public final long q() {
        return this.f26029a;
    }

    @m80.k
    public final String r() {
        return this.f26030b;
    }

    @m80.k
    public final String s() {
        return this.f26031c;
    }

    @m80.k
    public final String t() {
        return this.f26032d;
    }

    @m80.k
    public String toString() {
        return "Sentence(sId=" + this.f26029a + ", sentence=" + this.f26030b + ", translate=" + this.f26031c + ", word=" + this.f26032d + ", audio=" + this.f26033e + ", image=" + this.f26034f + ", origin=" + this.f26035g + ", phrase=" + this.f26036h + ", playStatus=" + this.f26037i + pn.j.f81007d;
    }

    public /* synthetic */ d0(long j11, String str, String str2, String str3, Uri uri, Uri uri2, String str4, String str5, MutableLiveData mutableLiveData, int i11, kotlin.jvm.internal.v vVar) {
        this(j11, str, str2, str3, uri, (i11 & 32) != 0 ? null : uri2, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? new MutableLiveData() : mutableLiveData);
    }
}
