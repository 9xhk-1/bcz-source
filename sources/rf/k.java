package rf;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final int f84021b = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    @wo.c("token")
    private final String f84022a;

    public k(@m80.k String token) {
        g0.p(token, "token");
        this.f84022a = token;
    }

    public static /* synthetic */ k c(k kVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kVar.f84022a;
        }
        return kVar.b(str);
    }

    @m80.k
    public final String a() {
        return this.f84022a;
    }

    @m80.k
    public final k b(@m80.k String token) {
        g0.p(token, "token");
        return new k(token);
    }

    @m80.k
    public final String d() {
        return this.f84022a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && g0.g(this.f84022a, ((k) obj).f84022a);
    }

    public int hashCode() {
        return this.f84022a.hashCode();
    }

    @m80.k
    public String toString() {
        return "RecordToken(token=" + this.f84022a + pn.j.f81007d;
    }
}
