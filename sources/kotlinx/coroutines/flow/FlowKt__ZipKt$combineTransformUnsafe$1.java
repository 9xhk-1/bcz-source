package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class FlowKt__ZipKt$combineTransformUnsafe$1<R> extends SuspendLambda implements x00.p<j<? super R>, j00.c<? super g2>, Object> {
    final /* synthetic */ i<T>[] $flows;
    final /* synthetic */ x00.q<j<? super R>, T[], j00.c<? super g2>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends SuspendLambda implements x00.q<j<? super R>, T[], j00.c<? super g2>, Object> {
        final /* synthetic */ x00.q<j<? super R>, T[], j00.c<? super g2>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(x00.q<? super j<? super R>, ? super T[], ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.e.n(obj);
                j jVar = (j) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                x00.q<j<? super R>, T[], j00.c<? super g2>, Object> qVar = this.$transform;
                this.L$0 = null;
                this.label = 1;
                if (qVar.invoke(jVar, objArr, this) == l11) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$transform.invoke((j) this.L$0, (Object[]) this.L$1, this);
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(j<? super R> jVar, T[] tArr, j00.c<? super g2> cVar) {
            kotlin.jvm.internal.g0.w();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, cVar);
            anonymousClass1.L$0 = jVar;
            anonymousClass1.L$1 = tArr;
            return anonymousClass1.invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransformUnsafe$1(i<? extends T>[] iVarArr, x00.q<? super j<? super R>, ? super T[], ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super FlowKt__ZipKt$combineTransformUnsafe$1> cVar) {
        super(2, cVar);
        this.$flows = iVarArr;
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        FlowKt__ZipKt$combineTransformUnsafe$1 flowKt__ZipKt$combineTransformUnsafe$1 = new FlowKt__ZipKt$combineTransformUnsafe$1(this.$flows, this.$transform, cVar);
        flowKt__ZipKt$combineTransformUnsafe$1.L$0 = obj;
        return flowKt__ZipKt$combineTransformUnsafe$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            j jVar = (j) this.L$0;
            i<T>[] iVarArr = this.$flows;
            x00.a r11 = FlowKt__ZipKt.r();
            kotlin.jvm.internal.g0.w();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, null);
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

    public final Object invokeSuspend$$forInline(Object obj) {
        j jVar = (j) this.L$0;
        i<T>[] iVarArr = this.$flows;
        x00.a r11 = FlowKt__ZipKt.r();
        kotlin.jvm.internal.g0.w();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, null);
        kotlin.jvm.internal.d0.e(0);
        kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, r11, anonymousClass1, this);
        kotlin.jvm.internal.d0.e(1);
        return g2.f100423a;
    }

    @Override // x00.p
    public final Object invoke(j<? super R> jVar, j00.c<? super g2> cVar) {
        return ((FlowKt__ZipKt$combineTransformUnsafe$1) create(jVar, cVar)).invokeSuspend(g2.f100423a);
    }
}
