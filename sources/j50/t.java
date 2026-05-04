package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n52#1:220,3\n52#1:224\n52#1:223\n*E\n"})
/* loaded from: classes8.dex */
public final class t<T> implements y2<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.l<h10.d<?>, f50.i<T>> f63464a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v<m<T>> f63465b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n1#1,219:1\n52#2:220\n*E\n"})
    public static final class a implements x00.a<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h10.d f63467b;

        public a(h10.d dVar) {
            this.f63467b = dVar;
        }

        @Override // x00.a
        public final T invoke() {
            return (T) new m(t.this.d().invoke(this.f63467b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@m80.k x00.l<? super h10.d<?>, ? extends f50.i<T>> compute) {
        kotlin.jvm.internal.g0.p(compute, "compute");
        this.f63464a = compute;
        this.f63465b = new v<>();
    }

    @Override // j50.y2
    public boolean b(@m80.k h10.d<?> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return this.f63465b.c(w00.b.d(key));
    }

    @Override // j50.y2
    @m80.l
    public f50.i<T> c(@m80.k h10.d<Object> key) {
        Object obj;
        kotlin.jvm.internal.g0.p(key, "key");
        obj = this.f63465b.get(w00.b.d(key));
        kotlin.jvm.internal.g0.o(obj, "get(...)");
        q1 q1Var = (q1) obj;
        T t11 = q1Var.f63452a.get();
        if (t11 == null) {
            t11 = (T) q1Var.a(new a(key));
        }
        return t11.f63422a;
    }

    @m80.k
    public final x00.l<h10.d<?>, f50.i<T>> d() {
        return this.f63464a;
    }
}
