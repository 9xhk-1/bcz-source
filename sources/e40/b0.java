package e40;

import c40.a3;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a3
@yz.n(level = DeprecationLevel.ERROR, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
/* loaded from: classes8.dex */
public final class b0<E> implements d<E> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e<E> f49018a;

    public b0(e<E> eVar) {
        this.f49018a = eVar;
    }

    @Override // e40.d
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    public /* synthetic */ boolean a(Throwable th2) {
        return this.f49018a.a(th2);
    }

    @Override // e40.l0
    @m80.l
    public Object b(E e11, @m80.k j00.c<? super g2> cVar) {
        return this.f49018a.b(e11, cVar);
    }

    public final E c() {
        return this.f49018a.C2();
    }

    @Override // e40.d
    public void cancel(@m80.l CancellationException cancellationException) {
        this.f49018a.cancel(cancellationException);
    }

    @Override // e40.l0
    @m80.k
    public k40.j<E, l0<E>> d() {
        return this.f49018a.d();
    }

    @m80.l
    public final E e() {
        return this.f49018a.E2();
    }

    @Override // e40.d
    @m80.k
    public k0<E> h() {
        return this.f49018a.h();
    }

    @Override // e40.l0
    @m80.k
    public Object m(E e11) {
        return this.f49018a.m(e11);
    }

    @Override // e40.l0
    public boolean o() {
        return this.f49018a.o();
    }

    @Override // e40.l0
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @w0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e11) {
        return this.f49018a.offer(e11);
    }

    @Override // e40.l0
    public void u(@m80.k x00.l<? super Throwable, g2> lVar) {
        this.f49018a.u(lVar);
    }

    @Override // e40.l0
    public boolean z(@m80.l Throwable th2) {
        return this.f49018a.z(th2);
    }

    public b0() {
        this(new e(-1));
    }

    public b0(E e11) {
        this();
        m(e11);
    }
}
