package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nExecutors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Executors.kt\nkotlinx/coroutines/ResumeUndispatchedRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
/* loaded from: classes8.dex */
public final class f3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m0 f7857a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final n<yz.g2> f7858b;

    /* JADX WARN: Multi-variable type inference failed */
    public f3(@m80.k m0 m0Var, @m80.k n<? super yz.g2> nVar) {
        this.f7857a = m0Var;
        this.f7858b = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7858b.l(this.f7857a, yz.g2.f100423a);
    }
}
