package t7;

import a00.a0;
import c40.l3;
import c40.r0;
import c40.s0;
import c40.x0;
import com.baicizhan.main.receiver.LearnOperationReceiver;
import com.microsoft.thrifty.service.a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3.k4;
import k3.l4;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import l7.i0;
import oa0.r;
import y7.d;
import yz.g2;
import z8.b2;
import z8.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {k4.class})
@u0({"SMAP\nWordListServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListServiceImpl.kt\ncom/baicizhan/app/biz/wordlist/WordListServiceImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 8 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,152:1\n6#2:153\n64#3,2:154\n66#3:157\n67#3,2:163\n6#4:156\n124#5,4:158\n142#6:162\n12#7,3:165\n15#7,10:180\n12#8,12:168\n1208#9,2:190\n1236#9,4:192\n37#10,2:196\n*S KotlinDebug\n*F\n+ 1 WordListServiceImpl.kt\ncom/baicizhan/app/biz/wordlist/WordListServiceImpl\n*L\n37#1:153\n37#1:154,2\n37#1:157\n37#1:163,2\n37#1:156\n37#1:158,4\n37#1:162\n-1#1:165,3\n-1#1:180,10\n-1#1:168,12\n74#1:190,2\n74#1:192,4\n87#1:196,2\n*E\n"})
/* loaded from: classes3.dex */
public final class n implements k4 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v7.b f89854b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r7.h f89855c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.leaning.a f89856d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final r7.e f89857e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final l7.p f89858f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final o7.c f89859g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final r0 f89860h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl", f = "WordListServiceImpl.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {63, 73, 74, 75}, m = "assembleData", n = {"fetch", "fetch", "schedule", "stateList", "resList", "collectList", "fetch", "schedule", "stateList", "resList", "collectList", "collectSet", "fetch", "schedule", "stateList", "resList", "collectList", "collectSet", "resMap"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89861a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89862b;

        /* renamed from: c, reason: collision with root package name */
        public Object f89863c;

        /* renamed from: d, reason: collision with root package name */
        public Object f89864d;

        /* renamed from: e, reason: collision with root package name */
        public Object f89865e;

        /* renamed from: f, reason: collision with root package name */
        public Object f89866f;

        /* renamed from: g, reason: collision with root package name */
        public Object f89867g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f89868h;

        /* renamed from: j, reason: collision with root package name */
        public int f89870j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89868h = obj;
            this.f89870j |= Integer.MIN_VALUE;
            return n.this.I0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl$assembleData$collectList$1", f = "WordListServiceImpl.kt", i = {}, l = {71, 71}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nWordListServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListServiceImpl.kt\ncom/baicizhan/app/biz/wordlist/WordListServiceImpl$assembleData$collectList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1563#2:153\n1634#2,3:154\n*S KotlinDebug\n*F\n+ 1 WordListServiceImpl.kt\ncom/baicizhan/app/biz/wordlist/WordListServiceImpl$assembleData$collectList$1\n*L\n71#1:153\n71#1:154,3\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends Integer>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f89871a;

        /* renamed from: b, reason: collision with root package name */
        public int f89872b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0<List<j2>> f89874d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x0<? extends List<j2>> x0Var, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f89874d = x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return n.this.new b(this.f89874d, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<Integer>> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        
            if (r6 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f89872b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                return r6
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f89871a
                r7.h r1 = (r7.h) r1
                kotlin.e.n(r6)
                goto L38
            L22:
                kotlin.e.n(r6)
                t7.n r6 = t7.n.this
                r7.h r1 = t7.n.B0(r6)
                c40.x0<java.util.List<z8.j2>> r6 = r5.f89874d
                r5.f89871a = r1
                r5.f89872b = r3
                java.lang.Object r6 = r6.i(r5)
                if (r6 != r0) goto L38
                goto L6a
            L38:
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r4 = a00.i0.d0(r6, r4)
                r3.<init>(r4)
                java.util.Iterator r6 = r6.iterator()
            L49:
                boolean r4 = r6.hasNext()
                if (r4 == 0) goto L5f
                java.lang.Object r4 = r6.next()
                z8.j2 r4 = (z8.j2) r4
                int r4 = r4.f101671a
                java.lang.Integer r4 = l00.a.f(r4)
                r3.add(r4)
                goto L49
            L5f:
                r6 = 0
                r5.f89871a = r6
                r5.f89872b = r2
                java.lang.Object r6 = r1.h(r3, r5)
                if (r6 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: t7.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends Integer>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<Integer>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl$assembleData$resList$1", f = "WordListServiceImpl.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends t7.k>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f89875a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.app.biz.leaning.c f89877c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.baicizhan.app.biz.leaning.c cVar, j00.c<? super c> cVar2) {
            super(2, cVar2);
            this.f89877c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return n.this.new c(this.f89877c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<t7.k>> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f89875a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            v7.b bVar = n.this.f89854b;
            int m11 = this.f89877c.m();
            this.f89875a = 1;
            Object b11 = bVar.b(m11, this);
            return b11 == l11 ? l11 : b11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends t7.k>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<t7.k>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl$assembleData$stateList$1", f = "WordListServiceImpl.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends j2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f89878a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.p<Integer, j00.c<? super List<j2>>, Object> f89879b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.app.biz.leaning.c f89880c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(x00.p<? super Integer, ? super j00.c<? super List<j2>>, ? extends Object> pVar, com.baicizhan.app.biz.leaning.c cVar, j00.c<? super d> cVar2) {
            super(2, cVar2);
            this.f89879b = pVar;
            this.f89880c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f89879b, this.f89880c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<j2>> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f89878a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            x00.p<Integer, j00.c<? super List<j2>>, Object> pVar = this.f89879b;
            Integer f11 = l00.a.f(this.f89880c.m());
            this.f89878a = 1;
            Object invoke = pVar.invoke(f11, this);
            return invoke == l11 ? l11 : invoke;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends j2>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<j2>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl", f = "WordListServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {40}, m = "getWordList", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordListServiceImpl$getWordList$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordListServiceImpl$getWordList$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89881a;

        /* renamed from: b, reason: collision with root package name */
        public int f89882b;

        /* renamed from: c, reason: collision with root package name */
        public int f89883c;

        /* renamed from: d, reason: collision with root package name */
        public int f89884d;

        /* renamed from: e, reason: collision with root package name */
        public int f89885e;

        /* renamed from: f, reason: collision with root package name */
        public long f89886f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f89887g;

        /* renamed from: i, reason: collision with root package name */
        public int f89889i;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89887g = obj;
            this.f89889i |= Integer.MIN_VALUE;
            return n.this.r1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl$getWordList$2$1$1", f = "WordListServiceImpl.kt", i = {0}, l = {41}, m = "invokeSuspend", n = {"it"}, s = {"I$0"}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<Integer, j00.c<? super List<? extends j2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f89890a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f89891b;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            f fVar = n.this.new f(cVar);
            fVar.f89891b = ((Number) obj).intValue();
            return fVar;
        }

        public final Object invoke(int i11, j00.c<? super List<j2>> cVar) {
            return ((f) create(Integer.valueOf(i11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11 = this.f89891b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f89890a;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            b2 T1 = n.this.T1();
            this.f89891b = i11;
            this.f89890a = 1;
            Object R0 = T1.R0(i11, this);
            return R0 == l11 ? l11 : R0;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, j00.c<? super List<? extends j2>> cVar) {
            return invoke(num.intValue(), (j00.c<? super List<j2>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl", f = "WordListServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {46}, m = LearnOperationReceiver.f24791b, n = {"topicIds", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordListServiceImpl$kill$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordListServiceImpl$kill$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89893a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89894b;

        /* renamed from: c, reason: collision with root package name */
        public int f89895c;

        /* renamed from: d, reason: collision with root package name */
        public int f89896d;

        /* renamed from: e, reason: collision with root package name */
        public int f89897e;

        /* renamed from: f, reason: collision with root package name */
        public int f89898f;

        /* renamed from: g, reason: collision with root package name */
        public long f89899g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f89900h;

        /* renamed from: j, reason: collision with root package name */
        public int f89902j;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89900h = obj;
            this.f89902j |= Integer.MIN_VALUE;
            return n.this.Q0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl$kill$2$1$1", f = "WordListServiceImpl.kt", i = {0}, l = {47}, m = "invokeSuspend", n = {"it"}, s = {"I$0"}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<Integer, j00.c<? super List<? extends j2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f89903a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f89904b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Integer[] f89906d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Integer[] numArr, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f89906d = numArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            h hVar = n.this.new h(this.f89906d, cVar);
            hVar.f89904b = ((Number) obj).intValue();
            return hVar;
        }

        public final Object invoke(int i11, j00.c<? super List<j2>> cVar) {
            return ((h) create(Integer.valueOf(i11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11 = this.f89904b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f89903a;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            b2 T1 = n.this.T1();
            List<Integer> dz2 = a0.dz(this.f89906d);
            this.f89904b = i11;
            this.f89903a = 1;
            Object Y4 = T1.Y4(i11, dz2, this);
            return Y4 == l11 ? l11 : Y4;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, j00.c<? super List<? extends j2>> cVar) {
            return invoke(num.intValue(), (j00.c<? super List<j2>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl", f = "WordListServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {58}, m = "reLearn", n = {"topicIds", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordListServiceImpl$reLearn$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordListServiceImpl$reLearn$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89907a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89908b;

        /* renamed from: c, reason: collision with root package name */
        public int f89909c;

        /* renamed from: d, reason: collision with root package name */
        public int f89910d;

        /* renamed from: e, reason: collision with root package name */
        public int f89911e;

        /* renamed from: f, reason: collision with root package name */
        public int f89912f;

        /* renamed from: g, reason: collision with root package name */
        public long f89913g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f89914h;

        /* renamed from: j, reason: collision with root package name */
        public int f89916j;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89914h = obj;
            this.f89916j |= Integer.MIN_VALUE;
            return n.this.b2(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl$reLearn$2$1$1", f = "WordListServiceImpl.kt", i = {0}, l = {59}, m = "invokeSuspend", n = {"it"}, s = {"I$0"}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<Integer, j00.c<? super List<? extends j2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f89917a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f89918b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Integer[] f89920d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Integer[] numArr, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f89920d = numArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            j jVar = n.this.new j(this.f89920d, cVar);
            jVar.f89918b = ((Number) obj).intValue();
            return jVar;
        }

        public final Object invoke(int i11, j00.c<? super List<j2>> cVar) {
            return ((j) create(Integer.valueOf(i11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11 = this.f89918b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f89917a;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            b2 T1 = n.this.T1();
            List<Integer> dz2 = a0.dz(this.f89920d);
            this.f89918b = i11;
            this.f89917a = 1;
            Object m82 = T1.m8(i11, dz2, this);
            return m82 == l11 ? l11 : m82;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, j00.c<? super List<? extends j2>> cVar) {
            return invoke(num.intValue(), (j00.c<? super List<j2>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class k implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f89921a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f89922b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f89923c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f89924a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f89925b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f89926c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f89924a = eVar;
                this.f89925b = cVar;
                this.f89926c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f89924a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f89924a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f89925b.b(this.f89926c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public k(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f89921a = dVar;
            this.f89922b = eVar;
            this.f89923c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f89922b, this.f89923c, this.f89921a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f89921a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) kotlin.jvm.internal.x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl", f = "WordListServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {52}, m = "unKill", n = {"topicIds", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordListServiceImpl$unKill$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordListServiceImpl$unKill$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89927a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89928b;

        /* renamed from: c, reason: collision with root package name */
        public int f89929c;

        /* renamed from: d, reason: collision with root package name */
        public int f89930d;

        /* renamed from: e, reason: collision with root package name */
        public int f89931e;

        /* renamed from: f, reason: collision with root package name */
        public int f89932f;

        /* renamed from: g, reason: collision with root package name */
        public long f89933g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f89934h;

        /* renamed from: j, reason: collision with root package name */
        public int f89936j;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89934h = obj;
            this.f89936j |= Integer.MIN_VALUE;
            return n.this.a1(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.WordListServiceImpl$unKill$2$1$1", f = "WordListServiceImpl.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"it"}, s = {"I$0"}, v = 1)
    public static final class m extends SuspendLambda implements x00.p<Integer, j00.c<? super List<? extends j2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f89937a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f89938b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Integer[] f89940d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Integer[] numArr, j00.c<? super m> cVar) {
            super(2, cVar);
            this.f89940d = numArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            m mVar = n.this.new m(this.f89940d, cVar);
            mVar.f89938b = ((Number) obj).intValue();
            return mVar;
        }

        public final Object invoke(int i11, j00.c<? super List<j2>> cVar) {
            return ((m) create(Integer.valueOf(i11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11 = this.f89938b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f89937a;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            b2 T1 = n.this.T1();
            List<Integer> dz2 = a0.dz(this.f89940d);
            this.f89938b = i11;
            this.f89937a = 1;
            Object L4 = T1.L4(i11, dz2, this);
            return L4 == l11 ? l11 : L4;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, j00.c<? super List<? extends j2>> cVar) {
            return invoke(num.intValue(), (j00.c<? super List<j2>>) cVar);
        }
    }

    public n(@m80.k v7.b resRepo, @m80.k r7.h userBookWords, @m80.k com.baicizhan.app.biz.leaning.a learnRepo, @m80.k r7.e sync, @m80.k l7.p thrift, @m80.k o7.c cdn) {
        g0.p(resRepo, "resRepo");
        g0.p(userBookWords, "userBookWords");
        g0.p(learnRepo, "learnRepo");
        g0.p(sync, "sync");
        g0.p(thrift, "thrift");
        g0.p(cdn, "cdn");
        this.f89854b = resRepo;
        this.f89855c = userBookWords;
        this.f89856d = learnRepo;
        this.f89857e = sync;
        this.f89858f = thrift;
        this.f89859g = cdn;
        this.f89860h = s0.a(c4.o.b().plus(l3.c(null, 1, null)));
    }

    public static final l4 N1(Map map, Set set, n nVar, j2 it) {
        g0.p(it, "it");
        t7.k kVar = (t7.k) map.get(Integer.valueOf(it.f101671a));
        g0.m(kVar);
        return t7.a.a(kVar, it, set.contains(Integer.valueOf(it.f101671a)), nVar.f89859g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b2 T1() {
        return (b2) w7.f.b(new k(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    public static final boolean p1(Map map, j2 it) {
        g0.p(it, "it");
        return map.get(Integer.valueOf(it.f101671a)) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r1 == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015d A[LOOP:0: B:20:0x0157->B:22:0x015d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I0(x00.p<? super java.lang.Integer, ? super j00.c<? super java.util.List<z8.j2>>, ? extends java.lang.Object> r23, j00.c<? super k3.l4[]> r24) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.n.I0(x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.k4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q0(@m80.k java.lang.Integer[] r11, @m80.k j00.c<? super k3.l4[]> r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.n.Q0(java.lang.Integer[], j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.k4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a1(@m80.k java.lang.Integer[] r11, @m80.k j00.c<? super k3.l4[]> r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.n.a1(java.lang.Integer[], j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.k4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b2(@m80.k java.lang.Integer[] r11, @m80.k j00.c<? super k3.l4[]> r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.n.b2(java.lang.Integer[], j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.k4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r1(@m80.k j00.c<? super k3.l4[]> r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.n.r1(j00.c):java.lang.Object");
    }
}
