package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
/* loaded from: classes8.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final o3 f7899a = new o3();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final ThreadLocal<o1> f7900b = h40.j1.a(new h40.x0("ThreadLocalEventLoop"));

    @m80.l
    public final o1 a() {
        return f7900b.get();
    }

    @m80.k
    public final o1 b() {
        ThreadLocal<o1> threadLocal = f7900b;
        o1 o1Var = threadLocal.get();
        if (o1Var != null) {
            return o1Var;
        }
        o1 a11 = r1.a();
        threadLocal.set(a11);
        return a11;
    }

    public final void c() {
        f7900b.set(null);
    }

    public final void d(@m80.k o1 o1Var) {
        f7900b.set(o1Var);
    }
}
