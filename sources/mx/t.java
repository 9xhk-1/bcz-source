package mx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.content.MultipartKt$asFlow$1", f = "Multipart.kt", i = {0, 1}, l = {112, 113}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super b0>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f73823a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f73824b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f73825c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f73825c = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f73825c, cVar);
            aVar.f73824b = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:6:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f73823a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r5.f73824b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.e.n(r6)
            L15:
                r6 = r1
                goto L2e
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1f:
                java.lang.Object r1 = r5.f73824b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.e.n(r6)
                goto L3e
            L27:
                kotlin.e.n(r6)
                java.lang.Object r6 = r5.f73824b
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
            L2e:
                mx.r r1 = r5.f73825c
                r5.f73824b = r6
                r5.f73823a = r3
                java.lang.Object r1 = r1.a(r5)
                if (r1 != r0) goto L3b
                goto L4f
            L3b:
                r4 = r1
                r1 = r6
                r6 = r4
            L3e:
                mx.b0 r6 = (mx.b0) r6
                if (r6 != 0) goto L45
                yz.g2 r6 = yz.g2.f100423a
                return r6
            L45:
                r5.f73824b = r1
                r5.f73823a = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L15
            L4f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mx.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(kotlinx.coroutines.flow.j<? super b0> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.content.MultipartKt", f = "Multipart.kt", i = {0, 1, 1}, l = {130, 135}, m = "readAllParts", n = {"$this$readAllParts", "$this$readAllParts", "parts"}, s = {"L$0", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f73826a;

        /* renamed from: b, reason: collision with root package name */
        public Object f73827b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f73828c;

        /* renamed from: d, reason: collision with root package name */
        public int f73829d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f73828c = obj;
            this.f73829d |= Integer.MIN_VALUE;
            return t.c(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements kotlinx.coroutines.flow.j, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.p<Object, j00.c<Object>, Object> f73830a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(x00.p<Object, ? super j00.c<Object>, ? extends Object> function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f73830a = function;
        }

        @Override // kotlinx.coroutines.flow.j
        public final /* synthetic */ Object emit(Object obj, j00.c cVar) {
            return this.f73830a.invoke(obj, cVar);
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof kotlinx.coroutines.flow.j) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f73830a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @m80.k
    public static final kotlinx.coroutines.flow.i<b0> a(@m80.k r rVar) {
        kotlin.jvm.internal.g0.p(rVar, "<this>");
        return kotlinx.coroutines.flow.k.K0(new a(rVar, null));
    }

    @m80.l
    public static final Object b(@m80.k r rVar, @m80.k x00.p<? super b0, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        Object collect = a(rVar).collect(new c(pVar), cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (r7 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0070 -> B:11:0x0073). Please report as a decompilation issue!!! */
    @m80.l
    @yz.n(level = kotlin.DeprecationLevel.ERROR, message = "This method can deadlock on large requests. Use `forEachPart` instead.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@m80.k mx.r r6, @m80.k j00.c<? super java.util.List<? extends mx.b0>> r7) {
        /*
            boolean r0 = r7 instanceof mx.t.b
            if (r0 == 0) goto L13
            r0 = r7
            mx.t$b r0 = (mx.t.b) r0
            int r1 = r0.f73829d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73829d = r1
            goto L18
        L13:
            mx.t$b r0 = new mx.t$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f73828c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f73829d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f73827b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r2 = r0.f73826a
            mx.r r2 = (mx.r) r2
            kotlin.e.n(r7)
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f73826a
            mx.r r6 = (mx.r) r6
            kotlin.e.n(r7)
            goto L52
        L44:
            kotlin.e.n(r7)
            r0.f73826a = r6
            r0.f73829d = r4
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L52
            goto L72
        L52:
            mx.b0 r7 = (mx.b0) r7
            if (r7 != 0) goto L5b
            java.util.List r6 = a00.h0.J()
            return r6
        L5b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r7)
            r5 = r2
            r2 = r6
            r6 = r5
        L66:
            r0.f73826a = r2
            r0.f73827b = r6
            r0.f73829d = r3
            java.lang.Object r7 = r2.a(r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            mx.b0 r7 = (mx.b0) r7
            if (r7 != 0) goto L78
            return r6
        L78:
            r6.add(r7)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: mx.t.c(mx.r, j00.c):java.lang.Object");
    }
}
