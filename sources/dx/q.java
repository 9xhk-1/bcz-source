package dx;

import ix.q0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f48220a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final T f48221b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final q0 f48222c;

    public q(@m80.k String key, @m80.k T value, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(value, "value");
        g0.p(headers, "headers");
        this.f48220a = key;
        this.f48221b = value;
        this.f48222c = headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q e(q qVar, String str, Object obj, q0 q0Var, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = qVar.f48220a;
        }
        if ((i11 & 2) != 0) {
            obj = qVar.f48221b;
        }
        if ((i11 & 4) != 0) {
            q0Var = qVar.f48222c;
        }
        return qVar.d(str, obj, q0Var);
    }

    @m80.k
    public final String a() {
        return this.f48220a;
    }

    @m80.k
    public final T b() {
        return this.f48221b;
    }

    @m80.k
    public final q0 c() {
        return this.f48222c;
    }

    @m80.k
    public final q<T> d(@m80.k String key, @m80.k T value, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(value, "value");
        g0.p(headers, "headers");
        return new q<>(key, value, headers);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return g0.g(this.f48220a, qVar.f48220a) && g0.g(this.f48221b, qVar.f48221b) && g0.g(this.f48222c, qVar.f48222c);
    }

    @m80.k
    public final q0 f() {
        return this.f48222c;
    }

    @m80.k
    public final String g() {
        return this.f48220a;
    }

    @m80.k
    public final T h() {
        return this.f48221b;
    }

    public int hashCode() {
        return (((this.f48220a.hashCode() * 31) + this.f48221b.hashCode()) * 31) + this.f48222c.hashCode();
    }

    @m80.k
    public String toString() {
        return "FormPart(key=" + this.f48220a + ", value=" + this.f48221b + ", headers=" + this.f48222c + ')';
    }

    public /* synthetic */ q(String str, Object obj, q0 q0Var, int i11, v vVar) {
        this(str, obj, (i11 & 4) != 0 ? q0.f62976a.b() : q0Var);
    }
}
