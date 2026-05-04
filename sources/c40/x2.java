package c40;

import c40.l2;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x2 extends kotlin.coroutines.a implements l2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x2 f8011a = new x2();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f8012b = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    public x2() {
        super(l2.f7886e0);
    }

    @Override // c40.l2
    @m80.k
    public q30.m<l2> C() {
        return q30.x.l();
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    @m80.k
    public k1 G0(boolean z11, boolean z12, @m80.k x00.l<? super Throwable, yz.g2> lVar) {
        return y2.f8014a;
    }

    @Override // c40.l2
    @m80.l
    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    public Object K0(@m80.k j00.c<? super yz.g2> cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @m80.k
    public l2 P0(@m80.k l2 l2Var) {
        return l2.a.i(this, l2Var);
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable th2) {
        return false;
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel(null);
    }

    @Override // c40.l2
    public boolean e() {
        return false;
    }

    @Override // c40.l2
    @m80.l
    public l2 getParent() {
        return null;
    }

    @Override // c40.l2
    public boolean isActive() {
        return true;
    }

    @Override // c40.l2
    public boolean isCancelled() {
        return false;
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    @m80.k
    public u m0(@m80.k w wVar) {
        return y2.f8014a;
    }

    @Override // c40.l2
    @m80.k
    public k40.f o0() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    public boolean start() {
        return false;
    }

    @m80.k
    public String toString() {
        return "NonCancellable";
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    @m80.k
    public CancellationException y0() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    @m80.k
    public k1 z0(@m80.k x00.l<? super Throwable, yz.g2> lVar) {
        return y2.f8014a;
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    public void cancel(@m80.l CancellationException cancellationException) {
    }

    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    public static /* synthetic */ void E() {
    }

    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    public static /* synthetic */ void H() {
    }

    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    public static /* synthetic */ void I() {
    }

    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    public static /* synthetic */ void L() {
    }

    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    public static /* synthetic */ void q() {
    }

    @yz.n(level = DeprecationLevel.WARNING, message = f8012b)
    public static /* synthetic */ void w() {
    }
}
