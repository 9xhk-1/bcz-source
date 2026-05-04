package c40;

import kotlinx.coroutines.CoroutineStart;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g2
/* loaded from: classes8.dex */
public abstract class a<T> extends r2 implements l2, j00.c<T>, r0 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f7814c;

    public a(@m80.k kotlin.coroutines.d dVar, boolean z11, boolean z12) {
        super(z12);
        if (z11) {
            m1((l2) dVar.get(l2.f7886e0));
        }
        this.f7814c = dVar.plus(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c40.r2
    public final void F1(@m80.l Object obj) {
        if (!(obj instanceof c0)) {
            c2(obj);
        } else {
            c0 c0Var = (c0) obj;
            b2(c0Var.f7827a, c0Var.a());
        }
    }

    public void Z1(@m80.l Object obj) {
        e0(obj);
    }

    public final <R> void d2(@m80.k CoroutineStart coroutineStart, R r11, @m80.k x00.p<? super R, ? super j00.c<? super T>, ? extends Object> pVar) {
        coroutineStart.invoke(pVar, r11, this);
    }

    @Override // j00.c
    @m80.k
    public final kotlin.coroutines.d getContext() {
        return this.f7814c;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f7814c;
    }

    @Override // c40.r2, c40.l2
    public boolean isActive() {
        return super.isActive();
    }

    @Override // c40.r2
    public final void l1(@m80.k Throwable th2) {
        o0.b(this.f7814c, th2);
    }

    @Override // j00.c
    public final void resumeWith(@m80.k Object obj) {
        Object w12 = w1(e0.b(obj));
        if (w12 == s2.f7963b) {
            return;
        }
        Z1(w12);
    }

    @Override // c40.r2
    @m80.k
    public String t0() {
        return u0.a(this) + " was cancelled";
    }

    @Override // c40.r2
    @m80.k
    public String x1() {
        String g11 = k0.g(this.f7814c);
        if (g11 == null) {
            return super.x1();
        }
        return '\"' + g11 + "\":" + super.x1();
    }

    public static /* synthetic */ void a2() {
    }

    public void c2(T t11) {
    }

    public void b2(@m80.k Throwable th2, boolean z11) {
    }
}
