package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u3<U, T extends U> extends h40.t0<T> implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final long f7990e;

    public u3(long j11, @m80.k j00.c<? super U> cVar) {
        super(cVar.getContext(), cVar);
        this.f7990e = j11;
    }

    @Override // java.lang.Runnable
    public void run() {
        l0(v3.a(this.f7990e, a1.d(getContext()), this));
    }

    @Override // c40.a, c40.r2
    @m80.k
    public String x1() {
        return super.x1() + "(timeMillis=" + this.f7990e + ')';
    }
}
