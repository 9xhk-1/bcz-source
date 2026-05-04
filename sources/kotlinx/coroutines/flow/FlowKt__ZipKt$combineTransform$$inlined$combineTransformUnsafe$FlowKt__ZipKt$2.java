package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2<R> extends SuspendLambda implements x00.p<j<? super R>, j00.c<? super g2>, Object> {
    final /* synthetic */ i[] $flows;
    final /* synthetic */ x00.r $transform$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n100#2,5:270\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements x00.q<j<? super R>, Object[], j00.c<? super g2>, Object> {
        final /* synthetic */ x00.r $transform$inlined;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j00.c cVar, x00.r rVar) {
            super(3, cVar);
            this.$transform$inlined = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.e.n(obj);
                j jVar = (j) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                x00.r rVar = this.$transform$inlined;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.label = 1;
                kotlin.jvm.internal.d0.e(6);
                Object invoke = rVar.invoke(jVar, obj2, obj3, this);
                kotlin.jvm.internal.d0.e(7);
                if (invoke == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(j<? super R> jVar, Object[] objArr, j00.c<? super g2> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, this.$transform$inlined);
            anonymousClass1.L$0 = jVar;
            anonymousClass1.L$1 = objArr;
            return anonymousClass1.invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(i[] iVarArr, j00.c cVar, x00.r rVar) {
        super(2, cVar);
        this.$flows = iVarArr;
        this.$transform$inlined = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2 flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2 = new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(this.$flows, cVar, this.$transform$inlined);
        flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2.L$0 = obj;
        return flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            j jVar = (j) this.L$0;
            i[] iVarArr = this.$flows;
            x00.a r11 = FlowKt__ZipKt.r();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$transform$inlined);
            this.label = 1;
            if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, r11, anonymousClass1, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }

    @Override // x00.p
    public final Object invoke(j<? super R> jVar, j00.c<? super g2> cVar) {
        return ((FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2) create(jVar, cVar)).invokeSuspend(g2.f100423a);
    }
}
