package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e3
@kotlin.jvm.internal.u0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
/* loaded from: classes8.dex */
public final class v<T> extends ClassValue<q1<T>> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n*L\n1#1,219:1\n*E\n"})
    public static final class a implements x00.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<T> f63480a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.a<? extends T> aVar) {
            this.f63480a = aVar;
        }

        @Override // x00.a
        public final T invoke() {
            return this.f63480a.invoke();
        }
    }

    @Override // java.lang.ClassValue
    @m80.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q1<T> computeValue(@m80.k Class<?> type) {
        kotlin.jvm.internal.g0.p(type, "type");
        return new q1<>();
    }

    public final T b(@m80.k Class<?> key, @m80.k x00.a<? extends T> factory) {
        Object obj;
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(factory, "factory");
        obj = get(key);
        kotlin.jvm.internal.g0.o(obj, "get(...)");
        q1 q1Var = (q1) obj;
        T t11 = q1Var.f63452a.get();
        return t11 != null ? t11 : (T) q1Var.a(new a(factory));
    }

    public final boolean c(@m80.k Class<?> key) {
        Object obj;
        kotlin.jvm.internal.g0.p(key, "key");
        obj = get(key);
        return ((q1) obj).f63452a.get() != null;
    }
}
