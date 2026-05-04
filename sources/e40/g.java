package e40;

import c40.l2;
import c40.o0;
import c40.r2;
import e40.l0;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.JobCancellationException;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,124:1\n732#2,3:125\n732#2,3:128\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n*L\n73#1:125,3\n79#1:128,3\n*E\n"})
/* loaded from: classes8.dex */
public class g<E> extends c40.a<g2> implements i0<E>, d<E> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d<E> f49042d;

    public g(@m80.k kotlin.coroutines.d dVar, @m80.k d<E> dVar2, boolean z11) {
        super(dVar, false, z11);
        this.f49042d = dVar2;
        m1((l2) dVar.get(l2.f7886e0));
    }

    @Override // c40.r2, c40.l2
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(Throwable th2) {
        if (th2 == null) {
            th2 = new JobCancellationException(t0(), null, this);
        }
        p0(th2);
        return true;
    }

    @Override // e40.l0
    @m80.l
    public Object b(E e11, @m80.k j00.c<? super g2> cVar) {
        return this.f49042d.b(e11, cVar);
    }

    @Override // c40.a
    public void b2(@m80.k Throwable th2, boolean z11) {
        if (this.f49042d.z(th2) || z11) {
            return;
        }
        o0.b(getContext(), th2);
    }

    @Override // c40.r2, c40.l2
    public final void cancel(@m80.l CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(t0(), null, this);
        }
        p0(cancellationException);
    }

    @Override // e40.l0
    @m80.k
    public k40.j<E, l0<E>> d() {
        return this.f49042d.d();
    }

    @m80.k
    public final d<E> e2() {
        return this.f49042d;
    }

    @Override // c40.a
    /* renamed from: f2, reason: merged with bridge method [inline-methods] */
    public void c2(@m80.k g2 g2Var) {
        l0.a.a(this.f49042d, null, 1, null);
    }

    @m80.k
    public k0<E> h() {
        return this.f49042d.h();
    }

    @Override // c40.a, c40.r2, c40.l2
    public boolean isActive() {
        return super.isActive();
    }

    @Override // e40.l0
    @m80.k
    public Object m(E e11) {
        return this.f49042d.m(e11);
    }

    @Override // e40.l0
    public boolean o() {
        return this.f49042d.o();
    }

    @Override // e40.l0
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @w0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e11) {
        return this.f49042d.offer(e11);
    }

    @Override // c40.r2
    public void p0(@m80.k Throwable th2) {
        CancellationException R1 = r2.R1(this, th2, null, 1, null);
        this.f49042d.cancel(R1);
        l0(R1);
    }

    @Override // e40.l0
    public void u(@m80.k x00.l<? super Throwable, g2> lVar) {
        this.f49042d.u(lVar);
    }

    @Override // e40.l0
    public boolean z(@m80.l Throwable th2) {
        boolean z11 = this.f49042d.z(th2);
        start();
        return z11;
    }

    @Override // e40.i0
    @m80.k
    public l0<E> getChannel() {
        return this;
    }
}
