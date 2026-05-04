package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
/* loaded from: classes8.dex */
public final class FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1<R> implements i<R> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i[] f68076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x00.p f68077b;

    public FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(i[] iVarArr, x00.p pVar) {
        this.f68076a = iVarArr;
        this.f68077b = pVar;
    }

    @Override // kotlinx.coroutines.flow.i
    public Object collect(j<? super R> jVar, j00.c<? super g2> cVar) {
        i[] iVarArr = this.f68076a;
        x00.a r11 = FlowKt__ZipKt.r();
        kotlin.jvm.internal.g0.w();
        Object a11 = kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, r11, new FlowKt__ZipKt$combineUnsafe$1$1(this.f68077b, null), cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    public Object g(j jVar, j00.c cVar) {
        kotlin.jvm.internal.d0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.this.collect(null, this);
            }
        };
        kotlin.jvm.internal.d0.e(5);
        i[] iVarArr = this.f68076a;
        x00.a r11 = FlowKt__ZipKt.r();
        kotlin.jvm.internal.g0.w();
        FlowKt__ZipKt$combineUnsafe$1$1 flowKt__ZipKt$combineUnsafe$1$1 = new FlowKt__ZipKt$combineUnsafe$1$1(this.f68077b, null);
        kotlin.jvm.internal.d0.e(0);
        kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, r11, flowKt__ZipKt$combineUnsafe$1$1, cVar);
        kotlin.jvm.internal.d0.e(1);
        return g2.f100423a;
    }
}
