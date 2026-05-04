package i6;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f60197a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f60198b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f60199c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f60200d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f60201e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f60202f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f60203g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f60204h;

    public b(int i11, @k String word, @k String mean, @k String phoneticUs, @k String phoneticUk, @l String str, @l String str2, @l String str3) {
        g0.p(word, "word");
        g0.p(mean, "mean");
        g0.p(phoneticUs, "phoneticUs");
        g0.p(phoneticUk, "phoneticUk");
        this.f60197a = i11;
        this.f60198b = word;
        this.f60199c = mean;
        this.f60200d = phoneticUs;
        this.f60201e = phoneticUk;
        this.f60202f = str;
        this.f60203g = str2;
        this.f60204h = str3;
    }

    public static /* synthetic */ b j(b bVar, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = bVar.f60197a;
        }
        if ((i12 & 2) != 0) {
            str = bVar.f60198b;
        }
        if ((i12 & 4) != 0) {
            str2 = bVar.f60199c;
        }
        if ((i12 & 8) != 0) {
            str3 = bVar.f60200d;
        }
        if ((i12 & 16) != 0) {
            str4 = bVar.f60201e;
        }
        if ((i12 & 32) != 0) {
            str5 = bVar.f60202f;
        }
        if ((i12 & 64) != 0) {
            str6 = bVar.f60203g;
        }
        if ((i12 & 128) != 0) {
            str7 = bVar.f60204h;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return bVar.i(i11, str, str2, str3, str10, str11, str8, str9);
    }

    public final int a() {
        return this.f60197a;
    }

    @k
    public final String b() {
        return this.f60198b;
    }

    @k
    public final String c() {
        return this.f60199c;
    }

    @k
    public final String d() {
        return this.f60200d;
    }

    @k
    public final String e() {
        return this.f60201e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f60197a == bVar.f60197a && g0.g(this.f60198b, bVar.f60198b) && g0.g(this.f60199c, bVar.f60199c) && g0.g(this.f60200d, bVar.f60200d) && g0.g(this.f60201e, bVar.f60201e) && g0.g(this.f60202f, bVar.f60202f) && g0.g(this.f60203g, bVar.f60203g) && g0.g(this.f60204h, bVar.f60204h);
    }

    @l
    public final String f() {
        return this.f60202f;
    }

    @l
    public final String g() {
        return this.f60203g;
    }

    @l
    public final String h() {
        return this.f60204h;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f60197a) * 31) + this.f60198b.hashCode()) * 31) + this.f60199c.hashCode()) * 31) + this.f60200d.hashCode()) * 31) + this.f60201e.hashCode()) * 31;
        String str = this.f60202f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60203g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60204h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final b i(int i11, @k String word, @k String mean, @k String phoneticUs, @k String phoneticUk, @l String str, @l String str2, @l String str3) {
        g0.p(word, "word");
        g0.p(mean, "mean");
        g0.p(phoneticUs, "phoneticUs");
        g0.p(phoneticUk, "phoneticUk");
        return new b(i11, word, mean, phoneticUs, phoneticUk, str, str2, str3);
    }

    @l
    public final String k() {
        return this.f60203g;
    }

    @l
    public final String l() {
        return this.f60204h;
    }

    @l
    public final String m() {
        return this.f60202f;
    }

    @k
    public final String n() {
        return this.f60199c;
    }

    @k
    public final String o() {
        return this.f60201e;
    }

    @k
    public final String p() {
        return this.f60200d;
    }

    public final int q() {
        return this.f60197a;
    }

    @k
    public final String r() {
        return this.f60198b;
    }

    @k
    public String toString() {
        return "WordEntry(topicId=" + this.f60197a + ", word=" + this.f60198b + ", mean=" + this.f60199c + ", phoneticUs=" + this.f60200d + ", phoneticUk=" + this.f60201e + ", audioUsUrl=" + this.f60202f + ", audioUkUrl=" + this.f60203g + ", audioUrl=" + this.f60204h + ')';
    }

    public /* synthetic */ b(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i12, v vVar) {
        this(i11, str, str2, str3, str4, str5, str6, (i12 & 128) != 0 ? str5 : str7);
    }
}
