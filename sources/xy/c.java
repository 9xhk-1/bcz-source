package xy;

import java.util.List;
import java.util.Map;
import xy.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c implements b {
    @Override // xy.b
    @m80.l
    public final <T> T a(@m80.k a<T> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return (T) j().get(key);
    }

    @Override // xy.b
    public final <T> void b(@m80.k a<T> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        j().remove(key);
    }

    @Override // xy.b
    public final boolean c(@m80.k a<?> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return j().containsKey(key);
    }

    @Override // xy.b
    @m80.l
    public <T> T d(@m80.k a<T> aVar) {
        return (T) b.a.c(this, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.b
    public final <T> void e(@m80.k a<T> key, @m80.k T value) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(value, "value");
        j().put(key, value);
    }

    @Override // xy.b
    @m80.k
    public final List<a<?>> f() {
        return a00.r0.a6(j().keySet());
    }

    @Override // xy.b
    @m80.k
    public <T> T g(@m80.k a<T> aVar) {
        return (T) b.a.a(this, aVar);
    }

    @Override // xy.b
    @m80.k
    public <T> T h(@m80.k a<T> aVar) {
        return (T) b.a.b(this, aVar);
    }

    @m80.k
    public abstract Map<a<?>, Object> j();
}
