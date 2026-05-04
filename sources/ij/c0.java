package ij;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f60627h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f60628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60629b;

    /* renamed from: c, reason: collision with root package name */
    public final long f60630c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f60631d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f60632e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f60633f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final String f60634g;

    public c0(int i11, int i12, long j11, @m80.k String word, @m80.k String meaning, @m80.l String str, @m80.l String str2) {
        g0.p(word, "word");
        g0.p(meaning, "meaning");
        this.f60628a = i11;
        this.f60629b = i12;
        this.f60630c = j11;
        this.f60631d = word;
        this.f60632e = meaning;
        this.f60633f = str;
        this.f60634g = str2;
    }

    public static /* synthetic */ c0 i(c0 c0Var, int i11, int i12, long j11, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = c0Var.f60628a;
        }
        if ((i13 & 2) != 0) {
            i12 = c0Var.f60629b;
        }
        if ((i13 & 4) != 0) {
            j11 = c0Var.f60630c;
        }
        if ((i13 & 8) != 0) {
            str = c0Var.f60631d;
        }
        if ((i13 & 16) != 0) {
            str2 = c0Var.f60632e;
        }
        if ((i13 & 32) != 0) {
            str3 = c0Var.f60633f;
        }
        if ((i13 & 64) != 0) {
            str4 = c0Var.f60634g;
        }
        long j12 = j11;
        return c0Var.h(i11, i12, j12, str, str2, str3, str4);
    }

    public final int a() {
        return this.f60628a;
    }

    public final int b() {
        return this.f60629b;
    }

    public final long c() {
        return this.f60630c;
    }

    @m80.k
    public final String d() {
        return this.f60631d;
    }

    @m80.k
    public final String e() {
        return this.f60632e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f60628a == c0Var.f60628a && this.f60629b == c0Var.f60629b && this.f60630c == c0Var.f60630c && g0.g(this.f60631d, c0Var.f60631d) && g0.g(this.f60632e, c0Var.f60632e) && g0.g(this.f60633f, c0Var.f60633f) && g0.g(this.f60634g, c0Var.f60634g);
    }

    @m80.l
    public final String f() {
        return this.f60633f;
    }

    @m80.l
    public final String g() {
        return this.f60634g;
    }

    @m80.k
    public final c0 h(int i11, int i12, long j11, @m80.k String word, @m80.k String meaning, @m80.l String str, @m80.l String str2) {
        g0.p(word, "word");
        g0.p(meaning, "meaning");
        return new c0(i11, i12, j11, word, meaning, str, str2);
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f60628a) * 31) + Integer.hashCode(this.f60629b)) * 31) + Long.hashCode(this.f60630c)) * 31) + this.f60631d.hashCode()) * 31) + this.f60632e.hashCode()) * 31;
        String str = this.f60633f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60634g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.l
    public final String j() {
        return this.f60633f;
    }

    @m80.l
    public final String k() {
        return this.f60634g;
    }

    public final int l() {
        return this.f60629b;
    }

    public final long m() {
        return this.f60630c;
    }

    @m80.k
    public final String n() {
        return this.f60632e;
    }

    public final int o() {
        return this.f60628a;
    }

    @m80.k
    public final String p() {
        return this.f60631d;
    }

    @m80.k
    public String toString() {
        return "WordFavoriteSimple(topicId=" + this.f60628a + ", bookId=" + this.f60629b + ", createdAt=" + this.f60630c + ", word=" + this.f60631d + ", meaning=" + this.f60632e + ", accent=" + this.f60633f + ", audio=" + this.f60634g + pn.j.f81007d;
    }

    public /* synthetic */ c0(int i11, int i12, long j11, String str, String str2, String str3, String str4, int i13, kotlin.jvm.internal.v vVar) {
        this(i11, i12, j11, str, str2, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : str4);
    }
}
