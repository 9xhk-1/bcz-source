package h40;

import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class i1 implements d.c<h1<?>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ThreadLocal<?> f58232a;

    public i1(@m80.k ThreadLocal<?> threadLocal) {
        this.f58232a = threadLocal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i1 c(i1 i1Var, ThreadLocal threadLocal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            threadLocal = i1Var.f58232a;
        }
        return i1Var.b(threadLocal);
    }

    public final ThreadLocal<?> a() {
        return this.f58232a;
    }

    @m80.k
    public final i1 b(@m80.k ThreadLocal<?> threadLocal) {
        return new i1(threadLocal);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && kotlin.jvm.internal.g0.g(this.f58232a, ((i1) obj).f58232a);
    }

    public int hashCode() {
        return this.f58232a.hashCode();
    }

    @m80.k
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f58232a + ')';
    }
}
