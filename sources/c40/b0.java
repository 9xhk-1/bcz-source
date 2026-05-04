package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,701:1\n1#2:702\n*E\n"})
/* loaded from: classes8.dex */
public final class b0<R> {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final R f7819a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final m f7820b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final x00.q<Throwable, R, kotlin.coroutines.d, yz.g2> f7821c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Object f7822d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Throwable f7823e;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(R r11, @m80.l m mVar, @m80.l x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar, @m80.l Object obj, @m80.l Throwable th2) {
        this.f7819a = r11;
        this.f7820b = mVar;
        this.f7821c = qVar;
        this.f7822d = obj;
        this.f7823e = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b0 g(b0 b0Var, Object obj, m mVar, x00.q qVar, Object obj2, Throwable th2, int i11, Object obj3) {
        R r11 = obj;
        if ((i11 & 1) != 0) {
            r11 = b0Var.f7819a;
        }
        if ((i11 & 2) != 0) {
            mVar = b0Var.f7820b;
        }
        if ((i11 & 4) != 0) {
            qVar = b0Var.f7821c;
        }
        if ((i11 & 8) != 0) {
            obj2 = b0Var.f7822d;
        }
        if ((i11 & 16) != 0) {
            th2 = b0Var.f7823e;
        }
        Throwable th3 = th2;
        x00.q qVar2 = qVar;
        return b0Var.f(r11, mVar, qVar2, obj2, th3);
    }

    public final R a() {
        return this.f7819a;
    }

    @m80.l
    public final m b() {
        return this.f7820b;
    }

    @m80.l
    public final x00.q<Throwable, R, kotlin.coroutines.d, yz.g2> c() {
        return this.f7821c;
    }

    @m80.l
    public final Object d() {
        return this.f7822d;
    }

    @m80.l
    public final Throwable e() {
        return this.f7823e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.g0.g(this.f7819a, b0Var.f7819a) && kotlin.jvm.internal.g0.g(this.f7820b, b0Var.f7820b) && kotlin.jvm.internal.g0.g(this.f7821c, b0Var.f7821c) && kotlin.jvm.internal.g0.g(this.f7822d, b0Var.f7822d) && kotlin.jvm.internal.g0.g(this.f7823e, b0Var.f7823e);
    }

    @m80.k
    public final b0<R> f(R r11, @m80.l m mVar, @m80.l x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar, @m80.l Object obj, @m80.l Throwable th2) {
        return new b0<>(r11, mVar, qVar, obj, th2);
    }

    public final boolean h() {
        return this.f7823e != null;
    }

    public int hashCode() {
        R r11 = this.f7819a;
        int hashCode = (r11 == null ? 0 : r11.hashCode()) * 31;
        m mVar = this.f7820b;
        int hashCode2 = (hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        x00.q<Throwable, R, kotlin.coroutines.d, yz.g2> qVar = this.f7821c;
        int hashCode3 = (hashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.f7822d;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.f7823e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final void i(@m80.k p<?> pVar, @m80.k Throwable th2) {
        m mVar = this.f7820b;
        if (mVar != null) {
            pVar.m(mVar, th2);
        }
        x00.q<Throwable, R, kotlin.coroutines.d, yz.g2> qVar = this.f7821c;
        if (qVar != null) {
            pVar.q(qVar, th2, this.f7819a);
        }
    }

    @m80.k
    public String toString() {
        return "CompletedContinuation(result=" + this.f7819a + ", cancelHandler=" + this.f7820b + ", onCancellation=" + this.f7821c + ", idempotentResume=" + this.f7822d + ", cancelCause=" + this.f7823e + ')';
    }

    public /* synthetic */ b0(Object obj, m mVar, x00.q qVar, Object obj2, Throwable th2, int i11, kotlin.jvm.internal.v vVar) {
        this(obj, (i11 & 2) != 0 ? null : mVar, (i11 & 4) != 0 ? null : qVar, (i11 & 8) != 0 ? null : obj2, (i11 & 16) != 0 ? null : th2);
    }
}
