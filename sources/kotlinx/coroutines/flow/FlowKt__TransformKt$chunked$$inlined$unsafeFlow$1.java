package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n153#2,12:109\n165#2:122\n1#3:121\n*E\n"})
/* loaded from: classes8.dex */
public final class FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1<T> implements i<List<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f68002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68003b;

    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0}, l = {110, 120}, m = "collect", n = {"$this$chunked_u24lambda_u2413", "result"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1, reason: invalid class name */
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
            return FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1(i iVar, int i11) {
        this.f68002a = iVar;
        this.f68003b = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r2.emit(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.j<? super java.util.List<? extends T>> r8, j00.c<? super yz.g2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r9)
            goto L74
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            kotlin.e.n(r9)
            goto L60
        L40:
            kotlin.e.n(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            kotlinx.coroutines.flow.i r2 = r7.f68002a
            kotlinx.coroutines.flow.FlowKt__TransformKt$a r5 = new kotlinx.coroutines.flow.FlowKt__TransformKt$a
            int r6 = r7.f68003b
            r5.<init>(r9, r6, r8)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r2 = r2.collect(r5, r0)
            if (r2 != r1) goto L5e
            goto L73
        L5e:
            r2 = r8
            r8 = r9
        L60:
            T r8 = r8.element
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L74
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r8 = r2.emit(r8, r0)
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.j, j00.c):java.lang.Object");
    }
}
