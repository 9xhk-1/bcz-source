package p40;

import c40.l2;
import c40.m2;
import c40.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;
import yz.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReportingSupervisorJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportingSupervisorJob.kt\nkotlinx/coroutines/test/internal/ReportingSupervisorJob\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
/* loaded from: classes8.dex */
public final class c extends m2 {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<Throwable, g2> f78909d;

    public /* synthetic */ c(l2 l2Var, l lVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : l2Var, lVar);
    }

    @k
    public final l<Throwable, g2> a2() {
        return this.f78909d;
    }

    @Override // c40.r2
    public boolean u0(@k Throwable th2) {
        try {
            this.f78909d.invoke(th2);
        } catch (Throwable th3) {
            r.a(th2, th3);
            o0.b(this, th2);
        }
        g2 g2Var = g2.f100423a;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@m80.l l2 l2Var, @k l<? super Throwable, g2> lVar) {
        super(l2Var);
        this.f78909d = lVar;
    }
}
