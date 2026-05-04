package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65242a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String[] f65243b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String[] f65244c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String[] f65245d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f65246e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f65247f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final String f65248g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final Integer f65249h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final Integer f65250i;

    public c0(@m80.k String name, @m80.k String[] images, @m80.k String[] colors, @m80.l String[] strArr, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l Integer num, @m80.l Integer num2) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(images, "images");
        kotlin.jvm.internal.g0.p(colors, "colors");
        this.f65242a = name;
        this.f65243b = images;
        this.f65244c = colors;
        this.f65245d = strArr;
        this.f65246e = str;
        this.f65247f = str2;
        this.f65248g = str3;
        this.f65249h = num;
        this.f65250i = num2;
    }

    public static /* synthetic */ c0 k(c0 c0Var, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c0Var.f65242a;
        }
        if ((i11 & 2) != 0) {
            strArr = c0Var.f65243b;
        }
        if ((i11 & 4) != 0) {
            strArr2 = c0Var.f65244c;
        }
        if ((i11 & 8) != 0) {
            strArr3 = c0Var.f65245d;
        }
        if ((i11 & 16) != 0) {
            str2 = c0Var.f65246e;
        }
        if ((i11 & 32) != 0) {
            str3 = c0Var.f65247f;
        }
        if ((i11 & 64) != 0) {
            str4 = c0Var.f65248g;
        }
        if ((i11 & 128) != 0) {
            num = c0Var.f65249h;
        }
        if ((i11 & 256) != 0) {
            num2 = c0Var.f65250i;
        }
        Integer num3 = num;
        Integer num4 = num2;
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        String[] strArr4 = strArr2;
        return c0Var.j(str, strArr, strArr4, strArr3, str7, str5, str6, num3, num4);
    }

    @m80.k
    public final String a() {
        return this.f65242a;
    }

    @m80.k
    public final String[] b() {
        return this.f65243b;
    }

    @m80.k
    public final String[] c() {
        return this.f65244c;
    }

    @m80.l
    public final String[] d() {
        return this.f65245d;
    }

    @m80.l
    public final String e() {
        return this.f65246e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!kotlin.jvm.internal.g0.g(this.f65242a, c0Var.f65242a) || !Arrays.equals(this.f65243b, c0Var.f65243b) || !Arrays.equals(this.f65244c, c0Var.f65244c)) {
            return false;
        }
        String[] strArr = this.f65245d;
        if (strArr != null) {
            String[] strArr2 = c0Var.f65245d;
            if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                return false;
            }
        } else if (c0Var.f65245d != null) {
            return false;
        }
        return kotlin.jvm.internal.g0.g(this.f65246e, c0Var.f65246e) && kotlin.jvm.internal.g0.g(this.f65247f, c0Var.f65247f) && kotlin.jvm.internal.g0.g(this.f65248g, c0Var.f65248g) && kotlin.jvm.internal.g0.g(this.f65249h, c0Var.f65249h) && kotlin.jvm.internal.g0.g(this.f65250i, c0Var.f65250i);
    }

    @m80.l
    public final String f() {
        return this.f65247f;
    }

    @m80.l
    public final String g() {
        return this.f65248g;
    }

    @m80.l
    public final Integer h() {
        return this.f65249h;
    }

    public int hashCode() {
        int hashCode = ((((this.f65242a.hashCode() * 31) + Arrays.hashCode(this.f65243b)) * 31) + Arrays.hashCode(this.f65244c)) * 31;
        String[] strArr = this.f65245d;
        int hashCode2 = (hashCode + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String str = this.f65246e;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f65247f;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f65248g;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f65249h;
        int intValue = (hashCode5 + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.f65250i;
        return intValue + (num2 != null ? num2.intValue() : 0);
    }

    @m80.l
    public final Integer i() {
        return this.f65250i;
    }

    @m80.k
    public final c0 j(@m80.k String name, @m80.k String[] images, @m80.k String[] colors, @m80.l String[] strArr, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l Integer num, @m80.l Integer num2) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(images, "images");
        kotlin.jvm.internal.g0.p(colors, "colors");
        return new c0(name, images, colors, strArr, str, str2, str3, num, num2);
    }

    @m80.k
    public final String[] l() {
        return this.f65244c;
    }

    @m80.l
    public final String[] m() {
        return this.f65245d;
    }

    @m80.k
    public final String[] n() {
        return this.f65243b;
    }

    @m80.k
    public final String o() {
        return this.f65242a;
    }

    @m80.l
    public final String p() {
        return this.f65247f;
    }

    @m80.l
    public final String q() {
        return this.f65248g;
    }

    @m80.l
    public final String r() {
        return this.f65246e;
    }

    @m80.l
    public final Integer s() {
        return this.f65249h;
    }

    @m80.l
    public final Integer t() {
        return this.f65250i;
    }

    @m80.k
    public String toString() {
        return "DakaBackgroundCategoryModel(name=" + this.f65242a + ", images=" + Arrays.toString(this.f65243b) + ", colors=" + Arrays.toString(this.f65244c) + ", imageIds=" + Arrays.toString(this.f65245d) + ", sentence=" + this.f65246e + ", senMean=" + this.f65247f + ", senSource=" + this.f65248g + ", winDays=" + this.f65249h + ", winType=" + this.f65250i + ')';
    }
}
