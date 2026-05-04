package kj;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f66612e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f66613a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f66614b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f66615c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f66616d;

    public c(long j11, @k String word, @k String meaning, @l String str) {
        g0.p(word, "word");
        g0.p(meaning, "meaning");
        this.f66613a = j11;
        this.f66614b = word;
        this.f66615c = meaning;
        this.f66616d = str;
    }

    public static /* synthetic */ c f(c cVar, long j11, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = cVar.f66613a;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = cVar.f66614b;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = cVar.f66615c;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = cVar.f66616d;
        }
        return cVar.e(j12, str4, str5, str3);
    }

    public final long a() {
        return this.f66613a;
    }

    @k
    public final String b() {
        return this.f66614b;
    }

    @k
    public final String c() {
        return this.f66615c;
    }

    @l
    public final String d() {
        return this.f66616d;
    }

    @k
    public final c e(long j11, @k String word, @k String meaning, @l String str) {
        g0.p(word, "word");
        g0.p(meaning, "meaning");
        return new c(j11, word, meaning, str);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f66613a == cVar.f66613a && g0.g(this.f66614b, cVar.f66614b) && g0.g(this.f66615c, cVar.f66615c) && g0.g(this.f66616d, cVar.f66616d);
    }

    @l
    public final String g() {
        return this.f66616d;
    }

    @k
    public final String h() {
        return this.f66615c;
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.f66613a) * 31) + this.f66614b.hashCode()) * 31) + this.f66615c.hashCode()) * 31;
        String str = this.f66616d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final long i() {
        return this.f66613a;
    }

    @k
    public final String j() {
        return this.f66614b;
    }

    @k
    public String toString() {
        return "WordFavoriteItemBasic(universeTopicId=" + this.f66613a + ", word=" + this.f66614b + ", meaning=" + this.f66615c + ", accent=" + this.f66616d + j.f81007d;
    }
}
