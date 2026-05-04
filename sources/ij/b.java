package ij;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f60616c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f60617a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f60618b;

    public b(boolean z11, @m80.k String message) {
        g0.p(message, "message");
        this.f60617a = z11;
        this.f60618b = message;
    }

    public static /* synthetic */ b d(b bVar, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = bVar.f60617a;
        }
        if ((i11 & 2) != 0) {
            str = bVar.f60618b;
        }
        return bVar.c(z11, str);
    }

    public final boolean a() {
        return this.f60617a;
    }

    @m80.k
    public final String b() {
        return this.f60618b;
    }

    @m80.k
    public final b c(boolean z11, @m80.k String message) {
        g0.p(message, "message");
        return new b(z11, message);
    }

    @m80.k
    public final String e() {
        return this.f60618b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f60617a == bVar.f60617a && g0.g(this.f60618b, bVar.f60618b);
    }

    public final boolean f() {
        return this.f60617a;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f60617a) * 31) + this.f60618b.hashCode();
    }

    @m80.k
    public String toString() {
        return "CopperExchangeResult(success=" + this.f60617a + ", message=" + this.f60618b + pn.j.f81007d;
    }
}
