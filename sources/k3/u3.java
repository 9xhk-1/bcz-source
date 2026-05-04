package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65640a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65641b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65642c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65643d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String[] f65644e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f65645f;

    /* renamed from: g, reason: collision with root package name */
    public final int f65646g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final t3[] f65647h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final String f65648i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public final String f65649j;

    /* renamed from: k, reason: collision with root package name */
    public final int f65650k;

    public u3(@m80.k String weiboShareTxt, @m80.k String weiboShareImgUrl, @m80.k String weixinShareTitle, @m80.k String weixinShareUrl, @m80.k String[] weixinSharePicUrls, @m80.k String qzoneShareUrl, int i11, @m80.k t3[] dakaDates, @m80.l String str, @m80.l String str2, int i12) {
        kotlin.jvm.internal.g0.p(weiboShareTxt, "weiboShareTxt");
        kotlin.jvm.internal.g0.p(weiboShareImgUrl, "weiboShareImgUrl");
        kotlin.jvm.internal.g0.p(weixinShareTitle, "weixinShareTitle");
        kotlin.jvm.internal.g0.p(weixinShareUrl, "weixinShareUrl");
        kotlin.jvm.internal.g0.p(weixinSharePicUrls, "weixinSharePicUrls");
        kotlin.jvm.internal.g0.p(qzoneShareUrl, "qzoneShareUrl");
        kotlin.jvm.internal.g0.p(dakaDates, "dakaDates");
        this.f65640a = weiboShareTxt;
        this.f65641b = weiboShareImgUrl;
        this.f65642c = weixinShareTitle;
        this.f65643d = weixinShareUrl;
        this.f65644e = weixinSharePicUrls;
        this.f65645f = qzoneShareUrl;
        this.f65646g = i11;
        this.f65647h = dakaDates;
        this.f65648i = str;
        this.f65649j = str2;
        this.f65650k = i12;
    }

    public static /* synthetic */ u3 m(u3 u3Var, String str, String str2, String str3, String str4, String[] strArr, String str5, int i11, t3[] t3VarArr, String str6, String str7, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = u3Var.f65640a;
        }
        if ((i13 & 2) != 0) {
            str2 = u3Var.f65641b;
        }
        if ((i13 & 4) != 0) {
            str3 = u3Var.f65642c;
        }
        if ((i13 & 8) != 0) {
            str4 = u3Var.f65643d;
        }
        if ((i13 & 16) != 0) {
            strArr = u3Var.f65644e;
        }
        if ((i13 & 32) != 0) {
            str5 = u3Var.f65645f;
        }
        if ((i13 & 64) != 0) {
            i11 = u3Var.f65646g;
        }
        if ((i13 & 128) != 0) {
            t3VarArr = u3Var.f65647h;
        }
        if ((i13 & 256) != 0) {
            str6 = u3Var.f65648i;
        }
        if ((i13 & 512) != 0) {
            str7 = u3Var.f65649j;
        }
        if ((i13 & 1024) != 0) {
            i12 = u3Var.f65650k;
        }
        String str8 = str7;
        int i14 = i12;
        t3[] t3VarArr2 = t3VarArr;
        String str9 = str6;
        String str10 = str5;
        int i15 = i11;
        String[] strArr2 = strArr;
        String str11 = str3;
        return u3Var.l(str, str2, str11, str4, strArr2, str10, i15, t3VarArr2, str9, str8, i14);
    }

    @m80.k
    public final String a() {
        return this.f65640a;
    }

    @m80.l
    public final String b() {
        return this.f65649j;
    }

    public final int c() {
        return this.f65650k;
    }

    @m80.k
    public final String d() {
        return this.f65641b;
    }

    @m80.k
    public final String e() {
        return this.f65642c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return kotlin.jvm.internal.g0.g(this.f65640a, u3Var.f65640a) && kotlin.jvm.internal.g0.g(this.f65641b, u3Var.f65641b) && kotlin.jvm.internal.g0.g(this.f65642c, u3Var.f65642c) && kotlin.jvm.internal.g0.g(this.f65643d, u3Var.f65643d) && Arrays.equals(this.f65644e, u3Var.f65644e) && kotlin.jvm.internal.g0.g(this.f65645f, u3Var.f65645f) && this.f65646g == u3Var.f65646g && Arrays.equals(this.f65647h, u3Var.f65647h) && kotlin.jvm.internal.g0.g(this.f65648i, u3Var.f65648i) && kotlin.jvm.internal.g0.g(this.f65649j, u3Var.f65649j);
    }

    @m80.k
    public final String f() {
        return this.f65643d;
    }

    @m80.k
    public final String[] g() {
        return this.f65644e;
    }

    @m80.k
    public final String h() {
        return this.f65645f;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f65640a.hashCode() * 31) + this.f65641b.hashCode()) * 31) + this.f65642c.hashCode()) * 31) + this.f65643d.hashCode()) * 31) + Arrays.hashCode(this.f65644e)) * 31) + this.f65645f.hashCode()) * 31) + this.f65646g) * 31) + Arrays.hashCode(this.f65647h)) * 31;
        String str = this.f65648i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f65649j;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final int i() {
        return this.f65646g;
    }

    @m80.k
    public final t3[] j() {
        return this.f65647h;
    }

    @m80.l
    public final String k() {
        return this.f65648i;
    }

    @m80.k
    public final u3 l(@m80.k String weiboShareTxt, @m80.k String weiboShareImgUrl, @m80.k String weixinShareTitle, @m80.k String weixinShareUrl, @m80.k String[] weixinSharePicUrls, @m80.k String qzoneShareUrl, int i11, @m80.k t3[] dakaDates, @m80.l String str, @m80.l String str2, int i12) {
        kotlin.jvm.internal.g0.p(weiboShareTxt, "weiboShareTxt");
        kotlin.jvm.internal.g0.p(weiboShareImgUrl, "weiboShareImgUrl");
        kotlin.jvm.internal.g0.p(weixinShareTitle, "weixinShareTitle");
        kotlin.jvm.internal.g0.p(weixinShareUrl, "weixinShareUrl");
        kotlin.jvm.internal.g0.p(weixinSharePicUrls, "weixinSharePicUrls");
        kotlin.jvm.internal.g0.p(qzoneShareUrl, "qzoneShareUrl");
        kotlin.jvm.internal.g0.p(dakaDates, "dakaDates");
        return new u3(weiboShareTxt, weiboShareImgUrl, weixinShareTitle, weixinShareUrl, weixinSharePicUrls, qzoneShareUrl, i11, dakaDates, str, str2, i12);
    }

    @m80.k
    public final t3[] n() {
        return this.f65647h;
    }

    @m80.k
    public final String o() {
        return this.f65645f;
    }

    public final int p() {
        return this.f65650k;
    }

    public final int q() {
        return this.f65646g;
    }

    @m80.k
    public final String r() {
        return this.f65641b;
    }

    @m80.k
    public final String s() {
        return this.f65640a;
    }

    @m80.k
    public final String[] t() {
        return this.f65644e;
    }

    @m80.k
    public String toString() {
        return "UserDakaShareModel(weiboShareTxt=" + this.f65640a + ", weiboShareImgUrl=" + this.f65641b + ", weixinShareTitle=" + this.f65642c + ", weixinShareUrl=" + this.f65643d + ", weixinSharePicUrls=" + Arrays.toString(this.f65644e) + ", qzoneShareUrl=" + this.f65645f + ", totalDakaDays=" + this.f65646g + ", dakaDates=" + Arrays.toString(this.f65647h) + ", xhsShareTitle=" + this.f65648i + ", xhsShareContent=" + this.f65649j + ", todayWordCount=" + this.f65650k + ')';
    }

    @m80.k
    public final String u() {
        return this.f65642c;
    }

    @m80.k
    public final String v() {
        return this.f65643d;
    }

    @m80.l
    public final String w() {
        return this.f65649j;
    }

    @m80.l
    public final String x() {
        return this.f65648i;
    }
}
