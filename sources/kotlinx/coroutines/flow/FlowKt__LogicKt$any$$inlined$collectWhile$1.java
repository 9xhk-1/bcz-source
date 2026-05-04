package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Logic.kt\nkotlinx/coroutines/flow/FlowKt__LogicKt\n*L\n1#1,131:1\n37#2,3:132\n*E\n"})
/* loaded from: classes8.dex */
public final class FlowKt__LogicKt$any$$inlined$collectWhile$1<T> implements j<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x00.p f67910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f67911b;

    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1", f = "Logic.kt", i = {0}, l = {132}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(j00.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LogicKt$any$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LogicKt$any$$inlined$collectWhile$1(x00.p pVar, Ref.BooleanRef booleanRef) {
        this.f67910a = pVar;
        this.f67911b = booleanRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(T r5, j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1 r5 = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1) r5
            kotlin.e.n(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            x00.p r6 = r4.f67910a
            r0.L$0 = r4
            r0.label = r3
            r2 = 6
            kotlin.jvm.internal.d0.e(r2)
            java.lang.Object r6 = r6.invoke(r5, r0)
            r5 = 7
            kotlin.jvm.internal.d0.e(r5)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5a
            kotlin.jvm.internal.Ref$BooleanRef r0 = r5.f67911b
            r0.element = r3
        L5a:
            if (r6 != 0) goto L5f
            yz.g2 r5 = yz.g2.f100423a
            return r5
        L5f:
            kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1.emit(java.lang.Object, j00.c):java.lang.Object");
    }
}
