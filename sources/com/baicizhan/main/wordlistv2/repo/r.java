package com.baicizhan.main.wordlistv2.repo;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import c40.l3;
import c40.r0;
import c40.s0;
import c40.x0;
import com.baicizhan.main.receiver.LearnOperationReceiver;
import com.baicizhan.main.wordlistv2.c1;
import com.baicizhan.main.wordlistv2.repo.db.WordListResourceRecord;
import com.baicizhan.online.user_study_api.WordListItem;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import q9.x;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordListRepoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListRepoImpl.kt\ncom/baicizhan/main/wordlistv2/repo/WordListRepoImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1208#2,2:150\n1236#2,4:152\n*S KotlinDebug\n*F\n+ 1 WordListRepoImpl.kt\ncom/baicizhan/main/wordlistv2/repo/WordListRepoImpl\n*L\n75#1:150,2\n75#1:152,4\n*E\n"})
/* loaded from: classes5.dex */
public final class r implements com.baicizhan.main.wordlistv2.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f27987e = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.wordlistv2.repo.d f27988a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x f27989b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.wordlistv2.repo.c f27990c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final r0 f27991d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl", f = "WordListRepoImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {74, 75, 76}, m = "assembleData", n = {"helper", "fetch", "stateList", "resList", "collectList", "bookId", "helper", "fetch", "stateList", "resList", "collectList", "collectSet", "bookId", "helper", "fetch", "stateList", "resList", "collectList", "collectSet", "resMap", "bookId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f27992a;

        /* renamed from: b, reason: collision with root package name */
        public Object f27993b;

        /* renamed from: c, reason: collision with root package name */
        public Object f27994c;

        /* renamed from: d, reason: collision with root package name */
        public Object f27995d;

        /* renamed from: e, reason: collision with root package name */
        public Object f27996e;

        /* renamed from: f, reason: collision with root package name */
        public Object f27997f;

        /* renamed from: g, reason: collision with root package name */
        public Object f27998g;

        /* renamed from: h, reason: collision with root package name */
        public int f27999h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f28000i;

        /* renamed from: k, reason: collision with root package name */
        public int f28002k;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f28000i = obj;
            this.f28002k |= Integer.MIN_VALUE;
            return r.this.j(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl$assembleData$collectList$1", f = "WordListRepoImpl.kt", i = {1}, l = {71, 72}, m = "invokeSuspend", n = {"collectList"}, s = {"L$0"}, v = 1)
    @u0({"SMAP\nWordListRepoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListRepoImpl.kt\ncom/baicizhan/main/wordlistv2/repo/WordListRepoImpl$assembleData$collectList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1563#2:150\n1634#2,3:151\n*S KotlinDebug\n*F\n+ 1 WordListRepoImpl.kt\ncom/baicizhan/main/wordlistv2/repo/WordListRepoImpl$assembleData$collectList$1\n*L\n72#1:150\n72#1:151,3\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super Set<? extends Integer>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f28003a;

        /* renamed from: b, reason: collision with root package name */
        public int f28004b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hj.m f28005c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0<List<WordListItem>> f28006d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(hj.m mVar, x0<? extends List<? extends WordListItem>> x0Var, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f28005c = mVar;
            this.f28006d = x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f28005c, this.f28006d, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super Set<Integer>> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
        
            if (r5 == r0) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0058 A[LOOP:0: B:7:0x0052->B:9:0x0058, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f28004b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r4.f28003a
                java.util.List r0 = (java.util.List) r0
                kotlin.e.n(r5)
                goto L41
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1e:
                kotlin.e.n(r5)
                goto L30
            L22:
                kotlin.e.n(r5)
                hj.m r5 = r4.f28005c
                r4.f28004b = r3
                java.lang.Object r5 = r5.C(r4)
                if (r5 != r0) goto L30
                goto L3e
            L30:
                java.util.List r5 = (java.util.List) r5
                c40.x0<java.util.List<com.baicizhan.online.user_study_api.WordListItem>> r1 = r4.f28006d
                r4.f28003a = r5
                r4.f28004b = r2
                java.lang.Object r1 = r1.i(r4)
                if (r1 != r0) goto L3f
            L3e:
                return r0
            L3f:
                r0 = r5
                r5 = r1
            L41:
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = a00.i0.d0(r5, r2)
                r1.<init>(r2)
                java.util.Iterator r5 = r5.iterator()
            L52:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L68
                java.lang.Object r2 = r5.next()
                com.baicizhan.online.user_study_api.WordListItem r2 = (com.baicizhan.online.user_study_api.WordListItem) r2
                int r2 = r2.topic_id
                java.lang.Integer r2 = l00.a.f(r2)
                r1.add(r2)
                goto L52
            L68:
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Set r5 = a00.r0.f6(r0)
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Set r5 = a00.r0.n3(r1, r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.repo.r.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Set<? extends Integer>> cVar) {
            return invoke2(r0Var, (j00.c<? super Set<Integer>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl$assembleData$resList$1", f = "WordListRepoImpl.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends WordListResourceRecord>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28007a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28009c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f28009c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return r.this.new c(this.f28009c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<WordListResourceRecord>> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f28007a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.main.wordlistv2.repo.d dVar = r.this.f27988a;
            int i12 = this.f28009c;
            this.f28007a = 1;
            Object b11 = dVar.b(i12, this);
            return b11 == l11 ? l11 : b11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends WordListResourceRecord>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<WordListResourceRecord>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl$assembleData$stateList$1", f = "WordListRepoImpl.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends WordListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28010a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.p<Integer, j00.c<? super List<? extends WordListItem>>, Object> f28011b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28012c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(x00.p<? super Integer, ? super j00.c<? super List<? extends WordListItem>>, ? extends Object> pVar, int i11, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f28011b = pVar;
            this.f28012c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f28011b, this.f28012c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super List<? extends WordListItem>> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f28010a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            x00.p<Integer, j00.c<? super List<? extends WordListItem>>, Object> pVar = this.f28011b;
            Integer f11 = l00.a.f(this.f28012c);
            this.f28010a = 1;
            Object invoke = pVar.invoke(f11, this);
            return invoke == l11 ? l11 : invoke;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl", f = "WordListRepoImpl.kt", i = {0}, l = {26}, m = "getWordList", n = {"helper"}, s = {"L$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f28013a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f28014b;

        /* renamed from: d, reason: collision with root package name */
        public int f28016d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f28014b = obj;
            this.f28016d |= Integer.MIN_VALUE;
            return r.this.c(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl$getWordList$2", f = "WordListRepoImpl.kt", i = {0}, l = {27}, m = "invokeSuspend", n = {"it"}, s = {"I$0"}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<Integer, j00.c<? super List<? extends WordListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28017a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f28018b;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            f fVar = r.this.new f(cVar);
            fVar.f28018b = ((Number) obj).intValue();
            return fVar;
        }

        public final Object invoke(int i11, j00.c<? super List<? extends WordListItem>> cVar) {
            return ((f) create(Integer.valueOf(i11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11 = this.f28018b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f28017a;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.main.wordlistv2.repo.c cVar = r.this.f27990c;
            this.f28018b = i11;
            this.f28017a = 1;
            Object b11 = cVar.b(i11, this);
            return b11 == l11 ? l11 : b11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, j00.c<? super List<? extends WordListItem>> cVar) {
            return invoke(num.intValue(), cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl", f = "WordListRepoImpl.kt", i = {0, 0}, l = {36}, m = LearnOperationReceiver.f24791b, n = {"helper", "topicIds"}, s = {"L$0", "L$1"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f28020a;

        /* renamed from: b, reason: collision with root package name */
        public Object f28021b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28022c;

        /* renamed from: e, reason: collision with root package name */
        public int f28024e;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f28022c = obj;
            this.f28024e |= Integer.MIN_VALUE;
            return r.this.d(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl$kill$2", f = "WordListRepoImpl.kt", i = {0}, l = {37}, m = "invokeSuspend", n = {"it"}, s = {"I$0"}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<Integer, j00.c<? super List<? extends WordListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28025a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f28026b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f28028d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<Integer> list, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f28028d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            h hVar = r.this.new h(this.f28028d, cVar);
            hVar.f28026b = ((Number) obj).intValue();
            return hVar;
        }

        public final Object invoke(int i11, j00.c<? super List<? extends WordListItem>> cVar) {
            return ((h) create(Integer.valueOf(i11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11 = this.f28026b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f28025a;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.main.wordlistv2.repo.c cVar = r.this.f27990c;
            List<Integer> list = this.f28028d;
            this.f28026b = i11;
            this.f28025a = 1;
            Object c11 = cVar.c(i11, list, this);
            return c11 == l11 ? l11 : c11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, j00.c<? super List<? extends WordListItem>> cVar) {
            return invoke(num.intValue(), cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl", f = "WordListRepoImpl.kt", i = {0, 0}, l = {54}, m = "reLearn", n = {"helper", "topicIds"}, s = {"L$0", "L$1"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f28029a;

        /* renamed from: b, reason: collision with root package name */
        public Object f28030b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28031c;

        /* renamed from: e, reason: collision with root package name */
        public int f28033e;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f28031c = obj;
            this.f28033e |= Integer.MIN_VALUE;
            return r.this.a(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl$reLearn$2", f = "WordListRepoImpl.kt", i = {0}, l = {55}, m = "invokeSuspend", n = {"it"}, s = {"I$0"}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<Integer, j00.c<? super List<? extends WordListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28034a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f28035b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f28037d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<Integer> list, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f28037d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            j jVar = r.this.new j(this.f28037d, cVar);
            jVar.f28035b = ((Number) obj).intValue();
            return jVar;
        }

        public final Object invoke(int i11, j00.c<? super List<? extends WordListItem>> cVar) {
            return ((j) create(Integer.valueOf(i11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11 = this.f28035b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f28034a;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.main.wordlistv2.repo.c cVar = r.this.f27990c;
            List<Integer> list = this.f28037d;
            this.f28035b = i11;
            this.f28034a = 1;
            Object a11 = cVar.a(i11, list, this);
            return a11 == l11 ? l11 : a11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, j00.c<? super List<? extends WordListItem>> cVar) {
            return invoke(num.intValue(), cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl", f = "WordListRepoImpl.kt", i = {0, 0}, l = {45}, m = "unKill", n = {"helper", "topicIds"}, s = {"L$0", "L$1"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f28038a;

        /* renamed from: b, reason: collision with root package name */
        public Object f28039b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28040c;

        /* renamed from: e, reason: collision with root package name */
        public int f28042e;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f28040c = obj;
            this.f28042e |= Integer.MIN_VALUE;
            return r.this.b(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordListRepoImpl$unKill$2", f = "WordListRepoImpl.kt", i = {0}, l = {46}, m = "invokeSuspend", n = {"it"}, s = {"I$0"}, v = 1)
    public static final class l extends SuspendLambda implements x00.p<Integer, j00.c<? super List<? extends WordListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28043a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f28044b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f28046d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List<Integer> list, j00.c<? super l> cVar) {
            super(2, cVar);
            this.f28046d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            l lVar = r.this.new l(this.f28046d, cVar);
            lVar.f28044b = ((Number) obj).intValue();
            return lVar;
        }

        public final Object invoke(int i11, j00.c<? super List<? extends WordListItem>> cVar) {
            return ((l) create(Integer.valueOf(i11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11 = this.f28044b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f28043a;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.main.wordlistv2.repo.c cVar = r.this.f27990c;
            List<Integer> list = this.f28046d;
            this.f28044b = i11;
            this.f28043a = 1;
            Object d11 = cVar.d(i11, list, this);
            return d11 == l11 ? l11 : d11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, j00.c<? super List<? extends WordListItem>> cVar) {
            return invoke(num.intValue(), cVar);
        }
    }

    @Inject
    public r(@m80.k com.baicizhan.main.wordlistv2.repo.d resRepo, @m80.k x studyMgr, @m80.k com.baicizhan.main.wordlistv2.repo.c remote) {
        g0.p(resRepo, "resRepo");
        g0.p(studyMgr, "studyMgr");
        g0.p(remote, "remote");
        this.f27988a = resRepo;
        this.f27989b = studyMgr;
        this.f27990c = remote;
        this.f27991d = s0.a(h1.c().plus(l3.c(null, 1, null)));
    }

    public static final boolean k(Map map, WordListItem it) {
        g0.p(it, "it");
        return map.get(Integer.valueOf(it.topic_id)) != null;
    }

    public static final c1 l(Map map, Set set, WordListItem it) {
        g0.p(it, "it");
        WordListResourceRecord wordListResourceRecord = (WordListResourceRecord) map.get(Integer.valueOf(it.topic_id));
        g0.m(wordListResourceRecord);
        return com.baicizhan.main.wordlistv2.repo.a.a(wordListResourceRecord, it, set.contains(Integer.valueOf(it.topic_id)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.baicizhan.main.wordlistv2.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k hj.m r7, @m80.k java.util.List<java.lang.Integer> r8, @m80.k j00.c<? super java.util.List<com.baicizhan.main.wordlistv2.c1>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.wordlistv2.repo.r.i
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.main.wordlistv2.repo.r$i r0 = (com.baicizhan.main.wordlistv2.repo.r.i) r0
            int r1 = r0.f28033e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28033e = r1
            goto L18
        L13:
            com.baicizhan.main.wordlistv2.repo.r$i r0 = new com.baicizhan.main.wordlistv2.repo.r$i
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f28031c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f28033e
            r3 = 0
            java.lang.String r4 = "IWordListRepo"
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 != r5) goto L34
            java.lang.Object r7 = r0.f28030b
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.f28029a
            hj.m r7 = (hj.m) r7
            kotlin.e.n(r9)
            goto L61
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.e.n(r9)
            java.lang.String r9 = "reLearn"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            qb.c.i(r4, r9, r2)
            com.baicizhan.main.wordlistv2.repo.r$j r9 = new com.baicizhan.main.wordlistv2.repo.r$j
            r2 = 0
            r9.<init>(r8, r2)
            java.lang.Object r2 = l00.k.a(r7)
            r0.f28029a = r2
            java.lang.Object r8 = l00.k.a(r8)
            r0.f28030b = r8
            r0.f28033e = r5
            java.lang.Object r9 = r6.j(r7, r9, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            r7 = r9
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "reLearn: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            qb.c.i(r4, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.repo.r.a(hj.m, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.baicizhan.main.wordlistv2.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k hj.m r7, @m80.k java.util.List<java.lang.Integer> r8, @m80.k j00.c<? super java.util.List<com.baicizhan.main.wordlistv2.c1>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.wordlistv2.repo.r.k
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.main.wordlistv2.repo.r$k r0 = (com.baicizhan.main.wordlistv2.repo.r.k) r0
            int r1 = r0.f28042e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28042e = r1
            goto L18
        L13:
            com.baicizhan.main.wordlistv2.repo.r$k r0 = new com.baicizhan.main.wordlistv2.repo.r$k
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f28040c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f28042e
            r3 = 0
            java.lang.String r4 = "IWordListRepo"
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 != r5) goto L34
            java.lang.Object r7 = r0.f28039b
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.f28038a
            hj.m r7 = (hj.m) r7
            kotlin.e.n(r9)
            goto L61
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.e.n(r9)
            java.lang.String r9 = "unKill"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            qb.c.i(r4, r9, r2)
            com.baicizhan.main.wordlistv2.repo.r$l r9 = new com.baicizhan.main.wordlistv2.repo.r$l
            r2 = 0
            r9.<init>(r8, r2)
            java.lang.Object r2 = l00.k.a(r7)
            r0.f28038a = r2
            java.lang.Object r8 = l00.k.a(r8)
            r0.f28039b = r8
            r0.f28042e = r5
            java.lang.Object r9 = r6.j(r7, r9, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            r7 = r9
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "unKill: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            qb.c.i(r4, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.repo.r.b(hj.m, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.baicizhan.main.wordlistv2.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k hj.m r7, @m80.k j00.c<? super java.util.List<com.baicizhan.main.wordlistv2.c1>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.baicizhan.main.wordlistv2.repo.r.e
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.main.wordlistv2.repo.r$e r0 = (com.baicizhan.main.wordlistv2.repo.r.e) r0
            int r1 = r0.f28016d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28016d = r1
            goto L18
        L13:
            com.baicizhan.main.wordlistv2.repo.r$e r0 = new com.baicizhan.main.wordlistv2.repo.r$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f28014b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f28016d
            r3 = 0
            java.lang.String r4 = "IWordListRepo"
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 != r5) goto L30
            java.lang.Object r7 = r0.f28013a
            hj.m r7 = (hj.m) r7
            kotlin.e.n(r8)
            goto L57
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.e.n(r8)
            java.lang.String r8 = "getWordList"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            qb.c.i(r4, r8, r2)
            com.baicizhan.main.wordlistv2.repo.r$f r8 = new com.baicizhan.main.wordlistv2.repo.r$f
            r2 = 0
            r8.<init>(r2)
            java.lang.Object r2 = l00.k.a(r7)
            r0.f28013a = r2
            r0.f28016d = r5
            java.lang.Object r8 = r6.j(r7, r8, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            r7 = r8
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getWordList: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            qb.c.i(r4, r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.repo.r.c(hj.m, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.baicizhan.main.wordlistv2.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k hj.m r7, @m80.k java.util.List<java.lang.Integer> r8, @m80.k j00.c<? super java.util.List<com.baicizhan.main.wordlistv2.c1>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.wordlistv2.repo.r.g
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.main.wordlistv2.repo.r$g r0 = (com.baicizhan.main.wordlistv2.repo.r.g) r0
            int r1 = r0.f28024e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28024e = r1
            goto L18
        L13:
            com.baicizhan.main.wordlistv2.repo.r$g r0 = new com.baicizhan.main.wordlistv2.repo.r$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f28022c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f28024e
            r3 = 0
            java.lang.String r4 = "IWordListRepo"
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 != r5) goto L34
            java.lang.Object r7 = r0.f28021b
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.f28020a
            hj.m r7 = (hj.m) r7
            kotlin.e.n(r9)
            goto L61
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.e.n(r9)
            java.lang.String r9 = "kill"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            qb.c.i(r4, r9, r2)
            com.baicizhan.main.wordlistv2.repo.r$h r9 = new com.baicizhan.main.wordlistv2.repo.r$h
            r2 = 0
            r9.<init>(r8, r2)
            java.lang.Object r2 = l00.k.a(r7)
            r0.f28020a = r2
            java.lang.Object r8 = l00.k.a(r8)
            r0.f28021b = r8
            r0.f28024e = r5
            java.lang.Object r9 = r6.j(r7, r9, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            r7 = r9
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "kill: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            qb.c.i(r4, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.repo.r.d(hj.m, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0150 A[LOOP:0: B:19:0x014a->B:21:0x0150, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(hj.m r23, x00.p<? super java.lang.Integer, ? super j00.c<? super java.util.List<? extends com.baicizhan.online.user_study_api.WordListItem>>, ? extends java.lang.Object> r24, j00.c<? super java.util.List<com.baicizhan.main.wordlistv2.c1>> r25) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.repo.r.j(hj.m, x00.p, j00.c):java.lang.Object");
    }
}
