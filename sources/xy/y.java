package xy;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAttributesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributesJvm.kt\nio/ktor/util/ConcurrentSafeAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: classes8.dex */
public final class y extends c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ConcurrentHashMap<a<?>, Object> f98667a = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.b
    @m80.k
    public <T> T i(@m80.k a<T> key, @m80.k x00.a<? extends T> block) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(block, "block");
        T t11 = (T) j().get(key);
        if (t11 != null) {
            return t11;
        }
        T invoke = block.invoke();
        Object putIfAbsent = j().putIfAbsent(key, invoke);
        if (putIfAbsent != 0) {
            invoke = putIfAbsent;
        }
        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return invoke;
    }

    @Override // xy.c
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ConcurrentHashMap<a<?>, Object> j() {
        return this.f98667a;
    }
}
