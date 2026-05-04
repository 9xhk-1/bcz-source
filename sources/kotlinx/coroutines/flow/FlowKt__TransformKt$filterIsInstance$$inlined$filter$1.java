package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
/* loaded from: classes8.dex */
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 implements i<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f68008a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2:50\n32#2:51\n19#2:52\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f68009a;

        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(j00.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(j jVar) {
            this.f68009a = jVar;
        }

        public final Object a(Object obj, j00.c cVar) {
            kotlin.jvm.internal.d0.e(4);
            new AnonymousClass1(cVar);
            kotlin.jvm.internal.d0.e(5);
            j jVar = this.f68009a;
            kotlin.jvm.internal.g0.y(3, "R");
            if (obj != null) {
                kotlin.jvm.internal.d0.e(0);
                jVar.emit(obj, cVar);
                kotlin.jvm.internal.d0.e(1);
            }
            return g2.f100423a;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, j00.c r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e.n(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.e.n(r7)
                kotlinx.coroutines.flow.j r7 = r5.f68009a
                r2 = 3
                java.lang.String r4 = "R"
                kotlin.jvm.internal.g0.y(r2, r4)
                if (r6 == 0) goto L47
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    public FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(i iVar) {
        this.f68008a = iVar;
    }

    @Override // kotlinx.coroutines.flow.i
    public Object collect(j<? super Object> jVar, j00.c cVar) {
        i iVar = this.f68008a;
        kotlin.jvm.internal.g0.w();
        Object collect = iVar.collect(new AnonymousClass2(jVar), cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    public Object g(j jVar, j00.c cVar) {
        kotlin.jvm.internal.d0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.this.collect(null, this);
            }
        };
        kotlin.jvm.internal.d0.e(5);
        i iVar = this.f68008a;
        kotlin.jvm.internal.g0.w();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(jVar);
        kotlin.jvm.internal.d0.e(0);
        iVar.collect(anonymousClass2, cVar);
        kotlin.jvm.internal.d0.e(1);
        return g2.f100423a;
    }
}
