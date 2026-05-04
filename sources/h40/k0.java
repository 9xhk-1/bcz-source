package h40;

import c40.v2;
import c40.z0;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MissingMainCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
/* loaded from: classes8.dex */
public final class k0 extends v2 implements c40.z0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Throwable f58235a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f58236b;

    public /* synthetic */ k0(Throwable th2, String str, int i11, kotlin.jvm.internal.v vVar) {
        this(th2, (i11 & 2) != 0 ? null : str);
    }

    @Override // c40.m0
    @m80.k
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        H();
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void H() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f58235a
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f58236b
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f58235a
            r1.<init>(r0, r2)
            throw r1
        L36:
            h40.j0.e()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h40.k0.H():java.lang.Void");
    }

    @Override // c40.z0
    @m80.k
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public Void j(long j11, @m80.k c40.n<? super g2> nVar) {
        H();
        throw new KotlinNothingValueException();
    }

    @Override // c40.z0
    @m80.k
    public c40.k1 f(long j11, @m80.k Runnable runnable, @m80.k kotlin.coroutines.d dVar) {
        H();
        throw new KotlinNothingValueException();
    }

    @Override // c40.m0
    public boolean isDispatchNeeded(@m80.k kotlin.coroutines.d dVar) {
        H();
        throw new KotlinNothingValueException();
    }

    @Override // c40.z0
    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object k(long j11, @m80.k j00.c<? super g2> cVar) {
        return z0.a.a(this, j11, cVar);
    }

    @Override // c40.v2, c40.m0
    @m80.k
    public c40.m0 limitedParallelism(int i11, @m80.l String str) {
        H();
        throw new KotlinNothingValueException();
    }

    @Override // c40.v2, c40.m0
    @m80.k
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f58235a != null) {
            str = ", cause=" + this.f58235a;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }

    public k0(@m80.l Throwable th2, @m80.l String str) {
        this.f58235a = th2;
        this.f58236b = str;
    }

    @Override // c40.v2
    @m80.k
    public v2 q() {
        return this;
    }
}
