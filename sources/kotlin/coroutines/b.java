package kotlin.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.d.b;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@kotlin.c
/* loaded from: classes8.dex */
public abstract class b<B extends d.b, E extends B> implements d.c<E> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<d.b, E> f66931a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d.c<?> f66932b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.d$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, x00.l<? super kotlin.coroutines.d$b, ? extends E extends B>, x00.l<kotlin.coroutines.d$b, E extends B>] */
    public b(@k d.c<B> baseKey, @k l<? super d.b, ? extends E> safeCast) {
        g0.p(baseKey, "baseKey");
        g0.p(safeCast, "safeCast");
        this.f66931a = safeCast;
        this.f66932b = baseKey instanceof b ? (d.c<B>) ((b) baseKey).f66932b : baseKey;
    }

    public final boolean a(@k d.c<?> key) {
        g0.p(key, "key");
        return key == this || this.f66932b == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/d$b;)TE; */
    @m80.l
    public final d.b b(@k d.b element) {
        g0.p(element, "element");
        return (d.b) this.f66931a.invoke(element);
    }
}
