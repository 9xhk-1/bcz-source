package f00;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import o00.f;
import w00.j;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ThreadsKt")
@u0({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f50343a;

        public a(x00.a<g2> aVar) {
            this.f50343a = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f50343a.invoke();
        }
    }

    @f
    public static final <T> T a(ThreadLocal<T> threadLocal, x00.a<? extends T> aVar) {
        g0.p(threadLocal, "<this>");
        g0.p(aVar, "default");
        T t11 = threadLocal.get();
        if (t11 != null) {
            return t11;
        }
        T invoke = aVar.invoke();
        threadLocal.set(invoke);
        return invoke;
    }

    @k
    public static final Thread b(boolean z11, boolean z12, @l ClassLoader classLoader, @l String str, int i11, @k x00.a<g2> block) {
        g0.p(block, "block");
        a aVar = new a(block);
        if (z12) {
            aVar.setDaemon(true);
        }
        if (i11 > 0) {
            aVar.setPriority(i11);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z11) {
            aVar.start();
        }
        return aVar;
    }

    public static /* synthetic */ Thread c(boolean z11, boolean z12, ClassLoader classLoader, String str, int i11, x00.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = true;
        }
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        if ((i12 & 4) != 0) {
            classLoader = null;
        }
        if ((i12 & 8) != 0) {
            str = null;
        }
        if ((i12 & 16) != 0) {
            i11 = -1;
        }
        int i13 = i11;
        String str2 = str;
        return b(z11, z12, classLoader, str2, i13, aVar);
    }
}
