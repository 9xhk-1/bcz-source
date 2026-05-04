package c40;

import c40.l2;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.coroutines.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.JobCancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,692:1\n1317#2,2:693\n1317#2,2:695\n1317#2,2:697\n1317#2,2:699\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n520#1:693,2\n534#1:695,2\n628#1:697,2\n652#1:699,2\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class p2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<Throwable, yz.g2> {
        public a(Object obj) {
            super(1, obj, q2.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((q2) this.receiver).D(th2);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(Throwable th2) {
            a(th2);
            return yz.g2.f100423a;
        }
    }

    @m80.k
    public static final k1 A(@m80.k l2 l2Var, boolean z11, @m80.k q2 q2Var) {
        return l2Var instanceof r2 ? ((r2) l2Var).n1(z11, q2Var) : l2Var.G0(q2Var.C(), z11, new a(q2Var));
    }

    public static /* synthetic */ k1 B(l2 l2Var, boolean z11, q2 q2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return n2.B(l2Var, z11, q2Var);
    }

    public static final boolean C(@m80.k kotlin.coroutines.d dVar) {
        l2 l2Var = (l2) dVar.get(l2.f7886e0);
        if (l2Var != null) {
            return l2Var.isActive();
        }
        return true;
    }

    public static final Throwable D(Throwable th2, l2 l2Var) {
        return th2 == null ? new JobCancellationException("Job was cancelled", null, l2Var) : th2;
    }

    @m80.k
    public static final a0 a(@m80.l l2 l2Var) {
        return new m2(l2Var);
    }

    @w00.j(name = "Job")
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ l2 b(l2 l2Var) {
        return n2.a(l2Var);
    }

    public static /* synthetic */ a0 c(l2 l2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l2Var = null;
        }
        return n2.a(l2Var);
    }

    public static /* synthetic */ l2 d(l2 l2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l2Var = null;
        }
        return b(l2Var);
    }

    public static final void e(@m80.k l2 l2Var, @m80.k String str, @m80.l Throwable th2) {
        l2Var.cancel(t1.a(str, th2));
    }

    public static final void g(@m80.k kotlin.coroutines.d dVar, @m80.l CancellationException cancellationException) {
        l2 l2Var = (l2) dVar.get(l2.f7886e0);
        if (l2Var != null) {
            l2Var.cancel(cancellationException);
        }
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(kotlin.coroutines.d dVar, Throwable th2) {
        d.b bVar = dVar.get(l2.f7886e0);
        r2 r2Var = bVar instanceof r2 ? (r2) bVar : null;
        if (r2Var == null) {
            return false;
        }
        r2Var.p0(D(th2, r2Var));
        return true;
    }

    public static /* synthetic */ void i(l2 l2Var, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        n2.e(l2Var, str, th2);
    }

    public static /* synthetic */ void j(kotlin.coroutines.d dVar, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        n2.g(dVar, cancellationException);
    }

    public static /* synthetic */ boolean k(kotlin.coroutines.d dVar, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        return h(dVar, th2);
    }

    @m80.l
    public static final Object l(@m80.k l2 l2Var, @m80.k j00.c<? super yz.g2> cVar) {
        l2.a.b(l2Var, null, 1, null);
        Object K0 = l2Var.K0(cVar);
        return K0 == kotlin.coroutines.intrinsics.b.l() ? K0 : yz.g2.f100423a;
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(l2 l2Var, Throwable th2) {
        for (l2 l2Var2 : l2Var.C()) {
            r2 r2Var = l2Var2 instanceof r2 ? (r2) l2Var2 : null;
            if (r2Var != null) {
                r2Var.p0(D(th2, l2Var));
            }
        }
    }

    public static final void o(@m80.k l2 l2Var, @m80.l CancellationException cancellationException) {
        Iterator<l2> it = l2Var.C().iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(kotlin.coroutines.d dVar, Throwable th2) {
        l2 l2Var = (l2) dVar.get(l2.f7886e0);
        if (l2Var == null) {
            return;
        }
        for (l2 l2Var2 : l2Var.C()) {
            r2 r2Var = l2Var2 instanceof r2 ? (r2) l2Var2 : null;
            if (r2Var != null) {
                r2Var.p0(D(th2, l2Var));
            }
        }
    }

    public static final void r(@m80.k kotlin.coroutines.d dVar, @m80.l CancellationException cancellationException) {
        q30.m<l2> C;
        l2 l2Var = (l2) dVar.get(l2.f7886e0);
        if (l2Var == null || (C = l2Var.C()) == null) {
            return;
        }
        Iterator<l2> it = C.iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static /* synthetic */ void s(l2 l2Var, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        n(l2Var, th2);
    }

    public static /* synthetic */ void t(l2 l2Var, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        n2.o(l2Var, cancellationException);
    }

    public static /* synthetic */ void u(kotlin.coroutines.d dVar, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        q(dVar, th2);
    }

    public static /* synthetic */ void v(kotlin.coroutines.d dVar, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        n2.r(dVar, cancellationException);
    }

    @m80.k
    public static final k1 w(@m80.k l2 l2Var, @m80.k k1 k1Var) {
        return B(l2Var, false, new m1(k1Var), 1, null);
    }

    public static final void x(@m80.k l2 l2Var) {
        if (!l2Var.isActive()) {
            throw l2Var.y0();
        }
    }

    public static final void y(@m80.k kotlin.coroutines.d dVar) {
        l2 l2Var = (l2) dVar.get(l2.f7886e0);
        if (l2Var != null) {
            n2.y(l2Var);
        }
    }

    @m80.k
    public static final l2 z(@m80.k kotlin.coroutines.d dVar) {
        l2 l2Var = (l2) dVar.get(l2.f7886e0);
        if (l2Var != null) {
            return l2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + dVar).toString());
    }
}
