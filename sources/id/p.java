package id;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final int f60514c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<String> f60515a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60516b;

    public p(@m80.k List<String> options, int i11) {
        g0.p(options, "options");
        this.f60515a = options;
        this.f60516b = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p d(p pVar, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = pVar.f60515a;
        }
        if ((i12 & 2) != 0) {
            i11 = pVar.f60516b;
        }
        return pVar.c(list, i11);
    }

    @m80.k
    public final List<String> a() {
        return this.f60515a;
    }

    public final int b() {
        return this.f60516b;
    }

    @m80.k
    public final p c(@m80.k List<String> options, int i11) {
        g0.p(options, "options");
        return new p(options, i11);
    }

    @m80.k
    public final List<String> e() {
        return this.f60515a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return g0.g(this.f60515a, pVar.f60515a) && this.f60516b == pVar.f60516b;
    }

    public final int f() {
        return this.f60516b;
    }

    public int hashCode() {
        return (this.f60515a.hashCode() * 31) + Integer.hashCode(this.f60516b);
    }

    @m80.k
    public String toString() {
        return "AIImproveClassOption(options=" + this.f60515a + ", rightIdx=" + this.f60516b + pn.j.f81007d;
    }
}
