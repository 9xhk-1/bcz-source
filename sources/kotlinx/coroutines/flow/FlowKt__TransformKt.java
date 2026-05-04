package kotlinx.coroutines.flow;

import a00.a1;
import c40.y1;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n17#1:174\n19#1:178\n17#1:179\n19#1:183\n46#2:168\n51#2:170\n46#2:171\n51#2:173\n46#2:175\n51#2:177\n46#2:180\n51#2:182\n46#2:184\n51#2:186\n46#2:187\n51#2:189\n46#2:190\n51#2:192\n46#2:194\n51#2:196\n105#3:169\n105#3:172\n105#3:176\n105#3:181\n105#3:185\n105#3:188\n105#3:191\n105#3:193\n105#3:195\n105#3:197\n105#3:198\n105#3:200\n1#4:199\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n32#1:174\n32#1:178\n37#1:179\n37#1:183\n17#1:168\n17#1:170\n24#1:171\n24#1:173\n32#1:175\n32#1:177\n37#1:180\n37#1:182\n42#1:184\n42#1:186\n49#1:187\n49#1:189\n56#1:190\n56#1:192\n74#1:194\n74#1:196\n17#1:169\n24#1:172\n32#1:176\n37#1:181\n42#1:185\n49#1:188\n56#1:191\n64#1:193\n74#1:195\n101#1:197\n121#1:198\n152#1:200\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__TransformKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$chunked$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
    public static final class a<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<ArrayList<T>> f68035a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f68036b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j<List<? extends T>> f68037c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1", f = "Transform.kt", i = {0}, l = {159}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$a$a, reason: collision with other inner class name */
        public static final class C0804a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f68038a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f68039b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a<T> f68040c;

            /* renamed from: d, reason: collision with root package name */
            public int f68041d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0804a(a<? super T> aVar, j00.c<? super C0804a> cVar) {
                super(cVar);
                this.f68040c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f68039b = obj;
                this.f68041d |= Integer.MIN_VALUE;
                return this.f68040c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ref.ObjectRef<ArrayList<T>> objectRef, int i11, j<? super List<? extends T>> jVar) {
            this.f68035a = objectRef;
            this.f68036b = i11;
            this.f68037c = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, j00.c<? super yz.g2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt.a.C0804a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__TransformKt$a$a r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt.a.C0804a) r0
                int r1 = r0.f68041d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f68041d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$a$a r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f68039b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f68041d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f68038a
                kotlinx.coroutines.flow.FlowKt__TransformKt$a r5 = (kotlinx.coroutines.flow.FlowKt__TransformKt.a) r5
                kotlin.e.n(r6)
                goto L64
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.e.n(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.util.ArrayList<T>> r6 = r4.f68035a
                T r6 = r6.element
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                if (r6 != 0) goto L4b
                java.util.ArrayList r6 = new java.util.ArrayList
                int r2 = r4.f68036b
                r6.<init>(r2)
                kotlin.jvm.internal.Ref$ObjectRef<java.util.ArrayList<T>> r2 = r4.f68035a
                r2.element = r6
            L4b:
                r6.add(r5)
                int r5 = r6.size()
                int r2 = r4.f68036b
                if (r5 != r2) goto L69
                kotlinx.coroutines.flow.j<java.util.List<? extends T>> r5 = r4.f68037c
                r0.f68038a = r4
                r0.f68041d = r3
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L63
                return r1
            L63:
                r5 = r4
            L64:
                kotlin.jvm.internal.Ref$ObjectRef<java.util.ArrayList<T>> r5 = r5.f68035a
                r6 = 0
                r5.element = r6
            L69:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt.a.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<R> f68042a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.q<R, T, j00.c<? super R>, Object> f68043b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j<R> f68044c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {105, 106}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f68045a;

            /* renamed from: b, reason: collision with root package name */
            public Object f68046b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f68047c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b<T> f68048d;

            /* renamed from: e, reason: collision with root package name */
            public int f68049e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, j00.c<? super a> cVar) {
                super(cVar);
                this.f68048d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f68047c = obj;
                this.f68049e |= Integer.MIN_VALUE;
                return this.f68048d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Ref.ObjectRef<R> objectRef, x00.q<? super R, ? super T, ? super j00.c<? super R>, ? extends Object> qVar, j<? super R> jVar) {
            this.f68042a = objectRef;
            this.f68043b = qVar;
            this.f68044c = jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        
            if (r7.emit(r8, r0) != r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, j00.c<? super yz.g2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt.b.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$b$a r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt.b.a) r0
                int r1 = r0.f68049e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f68049e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$b$a r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f68047c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f68049e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e.n(r8)
                goto L70
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f68046b
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                java.lang.Object r2 = r0.f68045a
                kotlinx.coroutines.flow.FlowKt__TransformKt$b r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt.b) r2
                kotlin.e.n(r8)
                goto L5a
            L40:
                kotlin.e.n(r8)
                kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r6.f68042a
                x00.q<R, T, j00.c<? super R>, java.lang.Object> r2 = r6.f68043b
                T r5 = r8.element
                r0.f68045a = r6
                r0.f68046b = r8
                r0.f68049e = r4
                java.lang.Object r7 = r2.invoke(r5, r7, r0)
                if (r7 != r1) goto L56
                goto L6f
            L56:
                r2 = r8
                r8 = r7
                r7 = r2
                r2 = r6
            L5a:
                r7.element = r8
                kotlinx.coroutines.flow.j<R> r7 = r2.f68044c
                kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r2.f68042a
                T r8 = r8.element
                r2 = 0
                r0.f68045a = r2
                r0.f68046b = r2
                r0.f68049e = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L70
            L6f:
                return r1
            L70:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt.b.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n122#2,10:109\n*E\n"})
    public static final class c<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f68050a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.q f68051b;

        public c(i iVar, x00.q qVar) {
            this.f68050a = iVar;
            this.f68051b = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super T> jVar, j00.c<? super g2> cVar) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) kotlinx.coroutines.flow.internal.s.f68282a;
            Object collect = this.f68050a.collect(new d(objectRef, this.f68051b, jVar), cVar);
            return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Object> f68052a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.q<T, T, j00.c<? super T>, Object> f68053b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j<T> f68054c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {127, 129}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f68055a;

            /* renamed from: b, reason: collision with root package name */
            public Object f68056b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f68057c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ d<T> f68058d;

            /* renamed from: e, reason: collision with root package name */
            public int f68059e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, j00.c<? super a> cVar) {
                super(cVar);
                this.f68058d = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f68057c = obj;
                this.f68059e |= Integer.MIN_VALUE;
                return this.f68058d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(Ref.ObjectRef<Object> objectRef, x00.q<? super T, ? super T, ? super j00.c<? super T>, ? extends Object> qVar, j<? super T> jVar) {
            this.f68052a = objectRef;
            this.f68053b = qVar;
            this.f68054c = jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
        
            if (r8.emit(r9, r0) == r1) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, j00.c<? super yz.g2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt.d.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__TransformKt$d$a r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt.d.a) r0
                int r1 = r0.f68059e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f68059e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$d$a r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$d$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f68057c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f68059e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e.n(r9)
                goto L79
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.f68056b
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                java.lang.Object r2 = r0.f68055a
                kotlinx.coroutines.flow.FlowKt__TransformKt$d r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt.d) r2
                kotlin.e.n(r9)
                goto L60
            L40:
                kotlin.e.n(r9)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r7.f68052a
                T r2 = r9.element
                h40.x0 r5 = kotlinx.coroutines.flow.internal.s.f68282a
                if (r2 != r5) goto L4d
                r2 = r7
                goto L63
            L4d:
                x00.q<T, T, j00.c<? super T>, java.lang.Object> r5 = r7.f68053b
                r0.f68055a = r7
                r0.f68056b = r9
                r0.f68059e = r4
                java.lang.Object r8 = r5.invoke(r2, r8, r0)
                if (r8 != r1) goto L5c
                goto L78
            L5c:
                r2 = r9
                r9 = r8
                r8 = r2
                r2 = r7
            L60:
                r6 = r9
                r9 = r8
                r8 = r6
            L63:
                r9.element = r8
                kotlinx.coroutines.flow.j<T> r8 = r2.f68054c
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r2.f68052a
                T r9 = r9.element
                r2 = 0
                r0.f68055a = r2
                r0.f68056b = r2
                r0.f68059e = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L79
            L78:
                return r1
            L79:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt.d.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n65#2,5:109\n*E\n"})
    public static final class e<T> implements i<a1<? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f68060a;

        public e(i iVar) {
            this.f68060a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super a1<? extends T>> jVar, j00.c<? super g2> cVar) {
            Object collect = this.f68060a.collect(new f(jVar, new Ref.IntRef()), cVar);
            return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,167:1\n29#2,4:168\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n*L\n67#1:168,4\n*E\n"})
    public static final class f<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j<a1<? extends T>> f68061a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f68062b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {67}, m = "emit", n = {}, s = {})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f68063a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f<T> f68064b;

            /* renamed from: c, reason: collision with root package name */
            public int f68065c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(f<? super T> fVar, j00.c<? super a> cVar) {
                super(cVar);
                this.f68064b = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f68063a = obj;
                this.f68065c |= Integer.MIN_VALUE;
                return this.f68064b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(j<? super a1<? extends T>> jVar, Ref.IntRef intRef) {
            this.f68061a = jVar;
            this.f68062b = intRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, j00.c<? super yz.g2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt.f.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__TransformKt$f$a r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt.f.a) r0
                int r1 = r0.f68065c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f68065c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$f$a r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$f$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f68063a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f68065c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e.n(r9)
                goto L4e
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                kotlin.e.n(r9)
                kotlinx.coroutines.flow.j<a00.a1<? extends T>> r9 = r7.f68061a
                a00.a1 r2 = new a00.a1
                kotlin.jvm.internal.Ref$IntRef r4 = r7.f68062b
                int r5 = r4.element
                int r6 = r5 + 1
                r4.element = r6
                if (r5 < 0) goto L51
                r2.<init>(r5, r8)
                r0.f68065c = r3
                java.lang.Object r8 = r9.emit(r2, r0)
                if (r8 != r1) goto L4e
                return r1
            L4e:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            L51:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt.f.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    @y1
    @m80.k
    public static final <T> i<List<T>> a(@m80.k i<? extends T> iVar, int i11) {
        if (i11 >= 1) {
            return new FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1(iVar, i11);
        }
        throw new IllegalArgumentException(("Expected positive chunk size, but got " + i11).toString());
    }

    @m80.k
    public static final <T> i<T> b(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(iVar, pVar);
    }

    public static final /* synthetic */ <R> i<R> c(i<?> iVar) {
        kotlin.jvm.internal.g0.w();
        return new FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(iVar);
    }

    @m80.k
    public static final <R> i<R> d(@m80.k final i<?> iVar, @m80.k final h10.d<R> dVar) {
        return (i<R>) new i<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2:50\n37#2:51\n19#2:52\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f68012a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h10.d f68013b;

                @l00.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, h10.d dVar) {
                    this.f68012a = jVar;
                    this.f68013b = dVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, j00.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e.n(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.e.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f68012a
                        h10.d r2 = r4.f68013b
                        boolean r2 = r2.B(r5)
                        if (r2 == 0) goto L47
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        yz.g2 r5 = yz.g2.f100423a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super Object> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, dVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    @m80.k
    public static final <T> i<T> e(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(iVar, pVar);
    }

    @m80.k
    public static final <T> i<T> f(@m80.k final i<? extends T> iVar) {
        return new i<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n43#2,2:50\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f68019a;

                @l00.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                    this.f68019a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, j00.c<? super yz.g2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e.n(r6)
                        goto L41
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.e.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f68019a
                        if (r5 == 0) goto L41
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        yz.g2 r5 = yz.g2.f100423a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    @m80.k
    public static final <T, R> i<R> g(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super R>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$map$$inlined$unsafeTransform$1(iVar, pVar);
    }

    @m80.k
    public static final <T, R> i<R> h(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super R>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(iVar, pVar);
    }

    @m80.k
    public static final <T> i<T> i(@m80.k final i<? extends T> iVar, @m80.k final x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return new i<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n75#2,2:50\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f68030a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x00.p f68031b;

                @l00.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {50, 51}, m = "emit", n = {"value", "$this$onEach_u24lambda_u248"}, s = {"L$0", "L$1"})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, x00.p pVar) {
                    this.f68030a = jVar;
                    this.f68031b = pVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
                
                    if (r6.emit(r2, r0) != r1) goto L23;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r6, j00.c<? super yz.g2> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3e
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.e.n(r7)
                        goto L6a
                    L2c:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L34:
                        java.lang.Object r6 = r0.L$1
                        kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                        java.lang.Object r2 = r0.L$0
                        kotlin.e.n(r7)
                        goto L5c
                    L3e:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f68030a
                        x00.p r2 = r5.f68031b
                        r0.L$0 = r6
                        r0.L$1 = r7
                        r0.label = r4
                        r4 = 6
                        kotlin.jvm.internal.d0.e(r4)
                        java.lang.Object r2 = r2.invoke(r6, r0)
                        r4 = 7
                        kotlin.jvm.internal.d0.e(r4)
                        if (r2 != r1) goto L5a
                        goto L69
                    L5a:
                        r2 = r6
                        r6 = r7
                    L5c:
                        r7 = 0
                        r0.L$0 = r7
                        r0.L$1 = r7
                        r0.label = r3
                        java.lang.Object r6 = r6.emit(r2, r0)
                        if (r6 != r1) goto L6a
                    L69:
                        return r1
                    L6a:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, pVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    @m80.k
    public static final <T, R> i<R> j(@m80.k i<? extends T> iVar, R r11, @yz.b @m80.k x00.q<? super R, ? super T, ? super j00.c<? super R>, ? extends Object> qVar) {
        return new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(r11, iVar, qVar);
    }

    @m80.k
    public static final <T> i<T> k(@m80.k i<? extends T> iVar, @m80.k x00.q<? super T, ? super T, ? super j00.c<? super T>, ? extends Object> qVar) {
        return new c(iVar, qVar);
    }

    @m80.k
    public static final <T, R> i<R> l(@m80.k i<? extends T> iVar, R r11, @yz.b @m80.k x00.q<? super R, ? super T, ? super j00.c<? super R>, ? extends Object> qVar) {
        return k.B1(iVar, r11, qVar);
    }

    @m80.k
    public static final <T> i<a1<T>> m(@m80.k i<? extends T> iVar) {
        return new e(iVar);
    }
}
