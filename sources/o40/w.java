package o40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestCoroutineExceptionHandler.kt\nkotlinx/coroutines/test/TestCoroutineExceptionHandler\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n29#2:37\n29#2:39\n29#2:41\n16#3:38\n16#3:40\n16#3:42\n1863#4,2:43\n*S KotlinDebug\n*F\n+ 1 TestCoroutineExceptionHandler.kt\nkotlinx/coroutines/test/TestCoroutineExceptionHandler\n*L\n15#1:37\n24#1:39\n27#1:41\n15#1:38\n24#1:40\n27#1:42\n31#1:43,2\n*E\n"})
/* loaded from: classes8.dex */
public final class w extends kotlin.coroutines.a implements c40.n0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<Throwable> f75850a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Object f75851b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f75852c;

    public w() {
        super(c40.n0.f7891d0);
        this.f75850a = new ArrayList();
        this.f75851b = new Object();
    }

    @Override // c40.n0
    public void handleException(@m80.k kotlin.coroutines.d dVar, @m80.k Throwable th2) {
        synchronized (this.f75851b) {
            try {
                if (this.f75852c) {
                    h40.j.a(dVar, th2);
                }
                this.f75850a.add(th2);
                g2 g2Var = g2.f100423a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void q() {
        synchronized (this.f75851b) {
            try {
                this.f75852c = true;
                Throwable th2 = (Throwable) a00.r0.L2(this.f75850a);
                if (th2 != null) {
                    Iterator it = a00.r0.g2(this.f75850a, 1).iterator();
                    while (it.hasNext()) {
                        ((Throwable) it.next()).printStackTrace();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @m80.k
    public final List<Throwable> w() {
        List<Throwable> a62;
        synchronized (this.f75851b) {
            a62 = a00.r0.a6(this.f75850a);
        }
        return a62;
    }
}
