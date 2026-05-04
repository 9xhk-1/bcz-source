package sx;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLockFreeMPSCQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeMPSCQueue.kt\nio/ktor/network/selector/LockFreeMPSCQueue\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,243:1\n154#2,2:244\n154#2,2:246\n154#2,2:248\n*S KotlinDebug\n*F\n+ 1 LockFreeMPSCQueue.kt\nio/ktor/network/selector/LockFreeMPSCQueue\n*L\n29#1:244,2\n36#1:246,2\n47#1:248,2\n*E\n"})
/* loaded from: classes8.dex */
public final class b<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f89024a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_cur");

    @k
    private volatile /* synthetic */ Object _cur = new c(8);

    public final boolean a(@k E element) {
        g0.p(element, "element");
        while (true) {
            c cVar = (c) this._cur;
            int a11 = cVar.a(element);
            if (a11 == 0) {
                return true;
            }
            if (a11 == 1) {
                androidx.concurrent.futures.a.a(f89024a, this, cVar, cVar.h());
            } else if (a11 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            c cVar = (c) this._cur;
            if (cVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.a.a(f89024a, this, cVar, cVar.h());
            }
        }
    }

    public final boolean c() {
        return ((c) this._cur).f();
    }

    @l
    public final E d() {
        while (true) {
            c cVar = (c) this._cur;
            E e11 = (E) cVar.i();
            if (e11 != c.f89039r) {
                return e11;
            }
            androidx.concurrent.futures.a.a(f89024a, this, cVar, cVar.h());
        }
    }
}
