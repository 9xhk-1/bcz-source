package n40;

import com.google.common.util.concurrent.s2;
import h40.x0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n370#1,2:397\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n383#1:397,2\n*E\n"})
/* loaded from: classes8.dex */
public final class m extends h40.u0<m> {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f74466e;

    public m(long j11, @m80.l m mVar, int i11) {
        super(j11, mVar, i11);
        int i12;
        i12 = l.f74461f;
        this.f74466e = new AtomicReferenceArray(i12);
    }

    public final boolean D(int i11, @m80.l Object obj, @m80.l Object obj2) {
        return s2.a(F(), i11, obj, obj2);
    }

    @m80.l
    public final Object E(int i11) {
        return F().get(i11);
    }

    public final /* synthetic */ AtomicReferenceArray F() {
        return this.f74466e;
    }

    @m80.l
    public final Object G(int i11, @m80.l Object obj) {
        return F().getAndSet(i11, obj);
    }

    public final void H(int i11, @m80.l Object obj) {
        F().set(i11, obj);
    }

    @m80.k
    public String toString() {
        return "SemaphoreSegment[id=" + this.f58276c + ", hashCode=" + hashCode() + l50.b.f69930l;
    }

    @Override // h40.u0
    public int y() {
        int i11;
        i11 = l.f74461f;
        return i11;
    }

    @Override // h40.u0
    public void z(int i11, @m80.l Throwable th2, @m80.k kotlin.coroutines.d dVar) {
        x0 x0Var;
        x0Var = l.f74460e;
        F().set(i11, x0Var);
        A();
    }
}
