package o0;

import android.view.View;
import androidx.annotation.MainThread;
import c40.b2;
import c40.h1;
import c40.l2;
import c40.r0;
import c40.x0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nViewTargetRequestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewTargetRequestManager.kt\ncoil/request/ViewTargetRequestManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* loaded from: classes3.dex */
public final class p implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final View f75495a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public n f75496b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public l2 f75497c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public o f75498d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f75499e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75500a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.k
        public final j00.c<g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
            return p.this.new a(cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@m80.k r0 r0Var, @m80.l j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f75500a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            p.this.e(null);
            return g2.f100423a;
        }
    }

    public p(@m80.k View view) {
        this.f75495a = view;
    }

    public final synchronized void a() {
        l2 f11;
        try {
            l2 l2Var = this.f75497c;
            if (l2Var != null) {
                l2.a.b(l2Var, null, 1, null);
            }
            f11 = c40.k.f(b2.f7824a, h1.e().q(), null, new a(null), 2, null);
            this.f75497c = f11;
            this.f75496b = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @m80.k
    public final synchronized n b(@m80.k x0<? extends g> x0Var) {
        n nVar = this.f75496b;
        if (nVar != null && u0.l.A() && this.f75499e) {
            this.f75499e = false;
            nVar.b(x0Var);
            return nVar;
        }
        l2 l2Var = this.f75497c;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.f75497c = null;
        n nVar2 = new n(this.f75495a, x0Var);
        this.f75496b = nVar2;
        return nVar2;
    }

    @m80.l
    public final synchronized g c() {
        n nVar;
        x0<g> a11;
        nVar = this.f75496b;
        return (nVar == null || (a11 = nVar.a()) == null) ? null : (g) u0.l.i(a11);
    }

    public final synchronized boolean d(@m80.k n nVar) {
        return nVar != this.f75496b;
    }

    @MainThread
    public final void e(@m80.l o oVar) {
        o oVar2 = this.f75498d;
        if (oVar2 != null) {
            oVar2.dispose();
        }
        this.f75498d = oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public void onViewAttachedToWindow(@m80.k View view) {
        o oVar = this.f75498d;
        if (oVar == null) {
            return;
        }
        this.f75499e = true;
        oVar.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public void onViewDetachedFromWindow(@m80.k View view) {
        o oVar = this.f75498d;
        if (oVar != null) {
            oVar.dispose();
        }
    }
}
