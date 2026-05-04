package rf;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final int f84023d = 0;

    /* renamed from: a, reason: collision with root package name */
    @wo.c("code")
    private final int f84024a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    @wo.c("msg")
    private final String f84025b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    @wo.c("data")
    private final k f84026c;

    public l(int i11, @m80.k String msg, @m80.k k data) {
        g0.p(msg, "msg");
        g0.p(data, "data");
        this.f84024a = i11;
        this.f84025b = msg;
        this.f84026c = data;
    }

    public static /* synthetic */ l e(l lVar, int i11, String str, k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = lVar.f84024a;
        }
        if ((i12 & 2) != 0) {
            str = lVar.f84025b;
        }
        if ((i12 & 4) != 0) {
            kVar = lVar.f84026c;
        }
        return lVar.d(i11, str, kVar);
    }

    public final int a() {
        return this.f84024a;
    }

    @m80.k
    public final String b() {
        return this.f84025b;
    }

    @m80.k
    public final k c() {
        return this.f84026c;
    }

    @m80.k
    public final l d(int i11, @m80.k String msg, @m80.k k data) {
        g0.p(msg, "msg");
        g0.p(data, "data");
        return new l(i11, msg, data);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f84024a == lVar.f84024a && g0.g(this.f84025b, lVar.f84025b) && g0.g(this.f84026c, lVar.f84026c);
    }

    public final int f() {
        return this.f84024a;
    }

    @m80.k
    public final k g() {
        return this.f84026c;
    }

    @m80.k
    public final String h() {
        return this.f84025b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f84024a) * 31) + this.f84025b.hashCode()) * 31) + this.f84026c.hashCode();
    }

    @m80.k
    public String toString() {
        return "RecordTokenResult(code=" + this.f84024a + ", msg=" + this.f84025b + ", data=" + this.f84026c + pn.j.f81007d;
    }
}
