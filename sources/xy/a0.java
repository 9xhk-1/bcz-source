package xy;

import c40.l2;
import c40.l3;
import c40.n0;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCoroutinesUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesUtils.kt\nio/ktor/util/CoroutinesUtilsKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,29:1\n1317#2,2:30\n46#3,4:32\n*S KotlinDebug\n*F\n+ 1 CoroutinesUtils.kt\nio/ktor/util/CoroutinesUtilsKt\n*L\n16#1:30,2\n28#1:32,4\n*E\n"})
/* loaded from: classes8.dex */
public final class a0 {
    @m80.k
    public static final kotlin.coroutines.d a(@m80.l l2 l2Var) {
        return l3.a(l2Var).plus(new a(c40.n0.f7891d0));
    }

    public static /* synthetic */ kotlin.coroutines.d b(l2 l2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l2Var = null;
        }
        return a(l2Var);
    }

    public static final void c(@m80.k l2 l2Var, int i11) {
        kotlin.jvm.internal.g0.p(l2Var, "<this>");
        System.out.println((Object) (u30.f0.v2(" ", i11) + l2Var));
        Iterator<l2> it = l2Var.C().iterator();
        while (it.hasNext()) {
            c(it.next(), i11 + 2);
        }
        if (i11 == 0) {
            System.out.println();
        }
    }

    public static /* synthetic */ void d(l2 l2Var, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        c(l2Var, i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutinesUtils.kt\nio/ktor/util/CoroutinesUtilsKt\n*L\n1#1,48:1\n28#2:49\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements c40.n0 {
        public a(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        }
    }
}
