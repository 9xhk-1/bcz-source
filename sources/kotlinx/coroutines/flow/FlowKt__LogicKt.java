package kotlinx.coroutines.flow;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logic.kt\nkotlinx/coroutines/flow/FlowKt__LogicKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n124#2,17:109\n124#2,17:126\n*S KotlinDebug\n*F\n+ 1 Logic.kt\nkotlinx/coroutines/flow/FlowKt__LogicKt\n*L\n36#1:109,17\n73#1:126,17\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__LogicKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", i = {0, 0}, l = {119}, m = TtmlNode.COMBINE_ALL, n = {"foundCounterExample", "collector$iv"}, s = {"L$0", "L$1"})
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67912a;

        /* renamed from: b, reason: collision with root package name */
        public Object f67913b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f67914c;

        /* renamed from: d, reason: collision with root package name */
        public int f67915d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67914c = obj;
            this.f67915d |= Integer.MIN_VALUE;
            return k.a(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", i = {0, 0}, l = {119}, m = r60.c.f83281b, n = {"found", "collector$iv"}, s = {"L$0", "L$1"})
    public static final class b<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67916a;

        /* renamed from: b, reason: collision with root package name */
        public Object f67917b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f67918c;

        /* renamed from: d, reason: collision with root package name */
        public int f67919d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67918c = obj;
            this.f67919d |= Integer.MIN_VALUE;
            return k.b(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", i = {}, l = {107}, m = "none", n = {}, s = {})
    public static final class c<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f67920a;

        /* renamed from: b, reason: collision with root package name */
        public int f67921b;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67920a = obj;
            this.f67921b |= Integer.MIN_VALUE;
            return k.e1(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k x00.p<? super T, ? super j00.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @m80.k j00.c<? super java.lang.Boolean> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LogicKt.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LogicKt$a r0 = (kotlinx.coroutines.flow.FlowKt__LogicKt.a) r0
            int r1 = r0.f67915d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67915d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LogicKt$a r0 = new kotlinx.coroutines.flow.FlowKt__LogicKt$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f67914c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67915d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f67913b
            kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1 r4 = (kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1) r4
            java.lang.Object r5 = r0.f67912a
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref.BooleanRef) r5
            kotlin.e.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L65
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e.n(r6)
            kotlin.jvm.internal.Ref$BooleanRef r6 = new kotlin.jvm.internal.Ref$BooleanRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1 r2 = new kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1
            r2.<init>(r5, r6)
            r0.f67912a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f67913b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f67915d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L65
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            kotlinx.coroutines.flow.internal.o.b(r6, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            c40.n2.z(r4)
        L65:
            boolean r4 = r5.element
            r4 = r4 ^ r3
            java.lang.Boolean r4 = l00.a.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LogicKt.a(kotlinx.coroutines.flow.i, x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k x00.p<? super T, ? super j00.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @m80.k j00.c<? super java.lang.Boolean> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LogicKt.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LogicKt$b r0 = (kotlinx.coroutines.flow.FlowKt__LogicKt.b) r0
            int r1 = r0.f67919d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67919d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LogicKt$b r0 = new kotlinx.coroutines.flow.FlowKt__LogicKt$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f67918c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67919d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f67917b
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1 r4 = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1) r4
            java.lang.Object r5 = r0.f67916a
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref.BooleanRef) r5
            kotlin.e.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L65
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e.n(r6)
            kotlin.jvm.internal.Ref$BooleanRef r6 = new kotlin.jvm.internal.Ref$BooleanRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1 r2 = new kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1
            r2.<init>(r5, r6)
            r0.f67916a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f67917b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f67919d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L65
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            kotlinx.coroutines.flow.internal.o.b(r6, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            c40.n2.z(r4)
        L65:
            boolean r4 = r5.element
            java.lang.Boolean r4 = l00.a.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LogicKt.b(kotlinx.coroutines.flow.i, x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k x00.p<? super T, ? super j00.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @m80.k j00.c<? super java.lang.Boolean> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LogicKt.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LogicKt$c r0 = (kotlinx.coroutines.flow.FlowKt__LogicKt.c) r0
            int r1 = r0.f67921b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67921b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LogicKt$c r0 = new kotlinx.coroutines.flow.FlowKt__LogicKt$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f67920a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67921b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r6)
            r0.f67921b = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.k.b(r4, r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            r4 = r4 ^ r3
            java.lang.Boolean r4 = l00.a.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LogicKt.c(kotlinx.coroutines.flow.i, x00.p, j00.c):java.lang.Object");
    }
}
