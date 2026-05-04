package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.internal.c;
import kotlinx.coroutines.flow.m0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,130:1\n29#2:131\n29#2:133\n29#2:136\n16#3:132\n16#3:134\n16#3:137\n1#4:135\n13402#5,2:138\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n27#1:131\n42#1:133\n73#1:136\n27#1:132\n42#1:134\n73#1:137\n92#1:138,2\n*E\n"})
/* loaded from: classes8.dex */
public abstract class a<S extends c<?>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public S[] f68153a;

    /* renamed from: b, reason: collision with root package name */
    public int f68154b;

    /* renamed from: c, reason: collision with root package name */
    public int f68155c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public y f68156d;

    @m80.k
    public final m0<Integer> f() {
        y yVar;
        synchronized (this) {
            yVar = this.f68156d;
            if (yVar == null) {
                yVar = new y(this.f68154b);
                this.f68156d = yVar;
            }
        }
        return yVar;
    }

    @m80.k
    public final S i() {
        S s11;
        y yVar;
        synchronized (this) {
            try {
                S[] sArr = this.f68153a;
                if (sArr == null) {
                    sArr = k(2);
                    this.f68153a = sArr;
                } else if (this.f68154b >= sArr.length) {
                    Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    g0.o(copyOf, "copyOf(...)");
                    this.f68153a = (S[]) ((c[]) copyOf);
                    sArr = (S[]) ((c[]) copyOf);
                }
                int i11 = this.f68155c;
                do {
                    s11 = sArr[i11];
                    if (s11 == null) {
                        s11 = j();
                        sArr[i11] = s11;
                    }
                    i11++;
                    if (i11 >= sArr.length) {
                        i11 = 0;
                    }
                    g0.n(s11, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s11.a(this));
                this.f68155c = i11;
                this.f68154b++;
                yVar = this.f68156d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (yVar != null) {
            yVar.e0(1);
        }
        return s11;
    }

    @m80.k
    public abstract S j();

    @m80.k
    public abstract S[] k(int i11);

    public final void l(@m80.k x00.l<? super S, g2> lVar) {
        c[] cVarArr;
        if (this.f68154b == 0 || (cVarArr = this.f68153a) == null) {
            return;
        }
        for (c cVar : cVarArr) {
            if (cVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    public final void m(@m80.k S s11) {
        y yVar;
        int i11;
        j00.c<g2>[] b11;
        synchronized (this) {
            try {
                int i12 = this.f68154b - 1;
                this.f68154b = i12;
                yVar = this.f68156d;
                if (i12 == 0) {
                    this.f68155c = 0;
                }
                g0.n(s11, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b11 = s11.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (j00.c<g2> cVar : b11) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
            }
        }
        if (yVar != null) {
            yVar.e0(-1);
        }
    }

    public final int n() {
        return this.f68154b;
    }

    @m80.l
    public final S[] o() {
        return this.f68153a;
    }
}
