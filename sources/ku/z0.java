package ku;

import com.typesafe.config.ConfigException;
import ku.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class z0<V extends d> {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f68887a;

    /* renamed from: b, reason: collision with root package name */
    public final V f68888b;

    public z0(x0 x0Var, V v11) {
        this.f68887a = x0Var;
        this.f68888b = v11;
    }

    public static <V extends d> z0<V> c(x0 x0Var, V v11) {
        return new z0<>(x0Var, v11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z0<c> a() {
        if (this.f68888b instanceof c) {
            return this;
        }
        throw new ConfigException.BugOrBroken("Expecting a resolve result to be an object, but it was " + this.f68888b);
    }

    public z0<V> d() {
        return c(this.f68887a.g(), this.f68888b);
    }

    public String toString() {
        return "ResolveResult(" + this.f68888b + pn.j.f81007d;
    }

    public z0<d> b() {
        return this;
    }
}
