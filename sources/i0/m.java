package i0;

import coil.decode.DataSource;
import f0.k0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m extends h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k0 f60052a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f60053b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final DataSource f60054c;

    public m(@m80.k k0 k0Var, @m80.l String str, @m80.k DataSource dataSource) {
        super(null);
        this.f60052a = k0Var;
        this.f60053b = str;
        this.f60054c = dataSource;
    }

    public static /* synthetic */ m b(m mVar, k0 k0Var, String str, DataSource dataSource, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            k0Var = mVar.f60052a;
        }
        if ((i11 & 2) != 0) {
            str = mVar.f60053b;
        }
        if ((i11 & 4) != 0) {
            dataSource = mVar.f60054c;
        }
        return mVar.a(k0Var, str, dataSource);
    }

    @m80.k
    public final m a(@m80.k k0 k0Var, @m80.l String str, @m80.k DataSource dataSource) {
        return new m(k0Var, str, dataSource);
    }

    @m80.k
    public final DataSource c() {
        return this.f60054c;
    }

    @m80.l
    public final String d() {
        return this.f60053b;
    }

    @m80.k
    public final k0 e() {
        return this.f60052a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return g0.g(this.f60052a, mVar.f60052a) && g0.g(this.f60053b, mVar.f60053b) && this.f60054c == mVar.f60054c;
    }

    public int hashCode() {
        int hashCode = this.f60052a.hashCode() * 31;
        String str = this.f60053b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f60054c.hashCode();
    }
}
