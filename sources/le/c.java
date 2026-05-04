package le;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final int f71180d = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<String> f71181a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f71182b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f71183c;

    public c(@k List<String> icon, @k String exchangeUrl, boolean z11) {
        g0.p(icon, "icon");
        g0.p(exchangeUrl, "exchangeUrl");
        this.f71181a = icon;
        this.f71182b = exchangeUrl;
        this.f71183c = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c e(c cVar, List list, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cVar.f71181a;
        }
        if ((i11 & 2) != 0) {
            str = cVar.f71182b;
        }
        if ((i11 & 4) != 0) {
            z11 = cVar.f71183c;
        }
        return cVar.d(list, str, z11);
    }

    @k
    public final List<String> a() {
        return this.f71181a;
    }

    @k
    public final String b() {
        return this.f71182b;
    }

    public final boolean c() {
        return this.f71183c;
    }

    @k
    public final c d(@k List<String> icon, @k String exchangeUrl, boolean z11) {
        g0.p(icon, "icon");
        g0.p(exchangeUrl, "exchangeUrl");
        return new c(icon, exchangeUrl, z11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g0.g(this.f71181a, cVar.f71181a) && g0.g(this.f71182b, cVar.f71182b) && this.f71183c == cVar.f71183c;
    }

    @k
    public final String f() {
        return this.f71182b;
    }

    public final boolean g() {
        return this.f71183c;
    }

    @k
    public final List<String> h() {
        return this.f71181a;
    }

    public int hashCode() {
        return (((this.f71181a.hashCode() * 31) + this.f71182b.hashCode()) * 31) + Boolean.hashCode(this.f71183c);
    }

    @k
    public String toString() {
        return "ReadableExchange(icon=" + this.f71181a + ", exchangeUrl=" + this.f71182b + ", hasNew=" + this.f71183c + j.f81007d;
    }
}
