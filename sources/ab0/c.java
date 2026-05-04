package ab0;

import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final na0.a f2507a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, Object> f2508b;

    public c(@k na0.a _koin) {
        g0.p(_koin, "_koin");
        this.f2507a = _koin;
        this.f2508b = jb0.c.f64013a.h();
    }

    public final void a() {
        this.f2508b.clear();
    }

    public final void b(@k String key) {
        g0.p(key, "key");
        this.f2508b.remove(key);
    }

    @l
    public final <T> T c(@k String key) {
        g0.p(key, "key");
        T t11 = (T) this.f2508b.get(key);
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    @k
    public final na0.a d() {
        return this.f2507a;
    }

    public final void e(@k Map<String, ? extends Object> properties) {
        g0.p(properties, "properties");
        this.f2507a.w().a("load " + properties.size() + " properties");
        this.f2508b.putAll(properties);
    }

    public final <T> void f(@k String key, @k T value) {
        g0.p(key, "key");
        g0.p(value, "value");
        this.f2508b.put(key, value);
    }
}
