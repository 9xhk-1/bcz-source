package rf;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int f84033d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    @wo.c("dict")
    private final String f84034a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    @wo.c("rec")
    private final String f84035b;

    /* renamed from: c, reason: collision with root package name */
    @wo.c(a.b.C0242a.f16107c)
    private final int f84036c;

    public n(@m80.k String dict, @m80.k String rec, int i11) {
        g0.p(dict, "dict");
        g0.p(rec, "rec");
        this.f84034a = dict;
        this.f84035b = rec;
        this.f84036c = i11;
    }

    public static /* synthetic */ n e(n nVar, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = nVar.f84034a;
        }
        if ((i12 & 2) != 0) {
            str2 = nVar.f84035b;
        }
        if ((i12 & 4) != 0) {
            i11 = nVar.f84036c;
        }
        return nVar.d(str, str2, i11);
    }

    @m80.k
    public final String a() {
        return this.f84034a;
    }

    @m80.k
    public final String b() {
        return this.f84035b;
    }

    public final int c() {
        return this.f84036c;
    }

    @m80.k
    public final n d(@m80.k String dict, @m80.k String rec, int i11) {
        g0.p(dict, "dict");
        g0.p(rec, "rec");
        return new n(dict, rec, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return g0.g(this.f84034a, nVar.f84034a) && g0.g(this.f84035b, nVar.f84035b) && this.f84036c == nVar.f84036c;
    }

    @m80.k
    public final String f() {
        return this.f84034a;
    }

    @m80.k
    public final String g() {
        return this.f84035b;
    }

    public final int h() {
        return this.f84036c;
    }

    public int hashCode() {
        return (((this.f84034a.hashCode() * 31) + this.f84035b.hashCode()) * 31) + Integer.hashCode(this.f84036c);
    }

    @m80.k
    public String toString() {
        return "RecordWordsPhoneInfo(dict=" + this.f84034a + ", rec=" + this.f84035b + ", score=" + this.f84036c + pn.j.f81007d;
    }
}
