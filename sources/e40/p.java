package e40;

import c40.r2;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.JobCancellationException;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,39:1\n732#2,3:40\n732#2,3:43\n732#2,3:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n17#1:40,3\n23#1:43,3\n30#1:46,3\n*E\n"})
/* loaded from: classes8.dex */
public class p<E> extends c40.a<g2> implements o<E> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final o<E> f49157d;

    public p(@m80.k kotlin.coroutines.d dVar, @m80.k o<E> oVar, boolean z11, boolean z12) {
        super(dVar, z11, z12);
        this.f49157d = oVar;
    }

    @Override // e40.k0
    @m80.l
    public Object H(@m80.k j00.c<? super E> cVar) {
        return this.f49157d.H(cVar);
    }

    @Override // e40.k0
    @m80.l
    @o00.i
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @w0(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object J(@m80.k j00.c<? super E> cVar) {
        return this.f49157d.J(cVar);
    }

    @Override // e40.k0
    @m80.k
    public k40.h<s<E>> K() {
        return this.f49157d.K();
    }

    @Override // e40.k0
    @m80.k
    public k40.h<E> M() {
        return this.f49157d.M();
    }

    @Override // e40.k0
    @m80.l
    public Object N(@m80.k j00.c<? super s<? extends E>> cVar) {
        Object N = this.f49157d.N(cVar);
        kotlin.coroutines.intrinsics.b.l();
        return N;
    }

    @Override // e40.k0
    @m80.k
    public Object O() {
        return this.f49157d.O();
    }

    @Override // e40.k0
    public boolean P() {
        return this.f49157d.P();
    }

    @Override // e40.k0
    @m80.k
    public k40.h<E> Q() {
        return this.f49157d.Q();
    }

    @Override // c40.r2, c40.l2
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(Throwable th2) {
        p0(new JobCancellationException(t0(), null, this));
        return true;
    }

    @m80.l
    public Object b(E e11, @m80.k j00.c<? super g2> cVar) {
        return this.f49157d.b(e11, cVar);
    }

    @Override // c40.r2, c40.l2
    public final void cancel(@m80.l CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(t0(), null, this);
        }
        p0(cancellationException);
    }

    @m80.k
    public k40.j<E, l0<E>> d() {
        return this.f49157d.d();
    }

    @m80.k
    public final o<E> e2() {
        return this.f49157d;
    }

    @Override // e40.k0
    public boolean isEmpty() {
        return this.f49157d.isEmpty();
    }

    @Override // e40.k0
    @m80.k
    public q<E> iterator() {
        return this.f49157d.iterator();
    }

    @m80.k
    public Object m(E e11) {
        return this.f49157d.m(e11);
    }

    @Override // e40.l0
    public boolean o() {
        return this.f49157d.o();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @w0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e11) {
        return this.f49157d.offer(e11);
    }

    @Override // c40.r2
    public void p0(@m80.k Throwable th2) {
        CancellationException R1 = r2.R1(this, th2, null, 1, null);
        this.f49157d.cancel(R1);
        l0(R1);
    }

    @Override // e40.k0
    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @w0(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return this.f49157d.poll();
    }

    @Override // e40.l0
    public void u(@m80.k x00.l<? super Throwable, g2> lVar) {
        this.f49157d.u(lVar);
    }

    public boolean z(@m80.l Throwable th2) {
        return this.f49157d.z(th2);
    }

    @Override // c40.r2, c40.l2
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        p0(new JobCancellationException(t0(), null, this));
    }

    @m80.k
    public final o<E> getChannel() {
        return this;
    }
}
