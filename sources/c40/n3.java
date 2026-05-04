package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n263#1:286\n1#2:287\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n284#1:286\n*E\n"})
/* loaded from: classes8.dex */
public final class n3 {
    @m80.k
    public static final <T> m3<T> a(@m80.k ThreadLocal<T> threadLocal, T t11) {
        return new h40.h1(t11, threadLocal);
    }

    public static /* synthetic */ m3 b(ThreadLocal threadLocal, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = threadLocal.get();
        }
        return a(threadLocal, obj);
    }

    @m80.l
    public static final Object c(@m80.k ThreadLocal<?> threadLocal, @m80.k j00.c<? super yz.g2> cVar) {
        if (cVar.getContext().get(new h40.i1(threadLocal)) != null) {
            return yz.g2.f100423a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + cVar.getContext()).toString());
    }

    public static final Object d(ThreadLocal<?> threadLocal, j00.c<? super yz.g2> cVar) {
        kotlin.jvm.internal.d0.e(3);
        throw null;
    }

    @m80.l
    public static final Object e(@m80.k ThreadLocal<?> threadLocal, @m80.k j00.c<? super Boolean> cVar) {
        return l00.a.a(cVar.getContext().get(new h40.i1(threadLocal)) != null);
    }

    public static final Object f(ThreadLocal<?> threadLocal, j00.c<? super Boolean> cVar) {
        kotlin.jvm.internal.d0.e(3);
        throw null;
    }
}
