package com.baicizhan.main.wikiv2.studyv2.data;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.ZResource;
import com.baicizhan.client.business.dataset.models.ZWiki;
import com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.ZpkInfo;
import java.util.List;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 loader.kt\ncom/baicizhan/main/wikiv2/studyv2/data/LoaderKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,150:1\n49#2:151\n51#2:155\n49#2:156\n51#2:160\n49#2:161\n51#2:165\n46#3:152\n51#3:154\n46#3:157\n51#3:159\n46#3:162\n51#3:164\n105#4:153\n105#4:158\n105#4:163\n*S KotlinDebug\n*F\n+ 1 loader.kt\ncom/baicizhan/main/wikiv2/studyv2/data/LoaderKt\n*L\n50#1:151\n50#1:155\n72#1:156\n72#1:160\n103#1:161\n103#1:165\n50#1:152\n50#1:154\n72#1:157\n72#1:159\n103#1:162\n103#1:164\n50#1:153\n72#1:158\n103#1:163\n*E\n"})
/* loaded from: classes3.dex */
public final class LoaderKt {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f25958a = "WikiLoaderIml";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$extract$1", f = "loader.kt", i = {0}, l = {86}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 loader.kt\ncom/baicizhan/main/wikiv2/studyv2/data/LoaderKt$extract$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1#2:151\n*E\n"})
    public static final class a extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super List<? extends Object>>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25977a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25978b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TopicRecord f25979c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.wikiv2.studyv2.data.c f25980d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TopicRecord topicRecord, com.baicizhan.main.wikiv2.studyv2.data.c cVar, j00.c<? super a> cVar2) {
            super(2, cVar2);
            this.f25979c = topicRecord;
            this.f25980d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f25979c, this.f25980d, cVar);
            aVar.f25978b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<?> a11;
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f25978b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25977a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                TopicRecord topicRecord = this.f25979c;
                ZResource readResource = ZPackUtils.readResource(topicRecord.bookId, topicRecord.zpkName);
                TopicRecord topicRecord2 = this.f25979c;
                Triple<ZResource, ZWiki, ? extends TopicRecord> triple = new Triple<>(readResource, ZPackUtils.readWiki(topicRecord2.bookId, topicRecord2.zpkName), this.f25979c);
                if (triple.getFirst() == null || triple.getSecond() == null || triple.getThird() == null) {
                    triple = null;
                }
                if (triple == null || (a11 = this.f25980d.c(triple)) == null) {
                    a11 = this.f25980d.a(this.f25979c);
                }
                this.f25978b = l00.k.a(jVar);
                this.f25977a = 1;
                if (jVar.emit(a11, this) == l11) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super List<? extends Object>> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$extract$2", f = "loader.kt", i = {0, 0}, l = {98}, m = "invokeSuspend", n = {"$this$catch", "e"}, s = {"L$0", "L$1"}, v = 1)
    public static final class b extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super List<? extends Object>>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25981a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25982b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25983c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.wikiv2.studyv2.data.c f25984d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TopicRecord f25985e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.baicizhan.main.wikiv2.studyv2.data.c cVar, TopicRecord topicRecord, j00.c<? super b> cVar2) {
            super(3, cVar2);
            this.f25984d = cVar;
            this.f25985e = topicRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f25982b;
            Throwable th2 = (Throwable) this.f25983c;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25981a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                qb.c.c(LoaderKt.f25958a, "extract failed try topic record", th2);
                List<?> a11 = this.f25984d.a(this.f25985e);
                this.f25982b = l00.k.a(jVar);
                this.f25983c = l00.k.a(th2);
                this.f25981a = 1;
                if (jVar.emit(a11, this) == l11) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super List<? extends Object>> jVar, Throwable th2, j00.c<? super g2> cVar) {
            b bVar = new b(this.f25984d, this.f25985e, cVar);
            bVar.f25982b = jVar;
            bVar.f25983c = th2;
            return bVar.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$1", f = "loader.kt", i = {0}, l = {102}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super DictionaryRecord>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25986a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25987b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f25988c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f25988c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f25988c, cVar);
            cVar2.f25987b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f25987b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25986a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                DictionaryRecord a11 = i9.i.a(pb.a.a(), this.f25988c);
                this.f25987b = l00.k.a(jVar);
                this.f25986a = 1;
                if (jVar.emit(a11, this) == l11) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super DictionaryRecord> jVar, j00.c<? super g2> cVar) {
            return ((c) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDisk$1", f = "loader.kt", i = {0}, l = {55}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super TopicRecord>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25989a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25990b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f25991c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f25992d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f25993e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i11, int i12, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f25991c = context;
            this.f25992d = i11;
            this.f25993e = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f25991c, this.f25992d, this.f25993e, cVar);
            dVar.f25990b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f25990b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25989a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                TopicRecord d11 = i9.l.d(this.f25991c, this.f25992d, this.f25993e);
                if (d11 == null || !sh.t.b(d11)) {
                    d11 = null;
                }
                this.f25990b = l00.k.a(jVar);
                this.f25989a = 1;
                if (jVar.emit(d11, this) == l11) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super TopicRecord> jVar, j00.c<? super g2> cVar) {
            return ((d) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$1", f = "loader.kt", i = {0, 0}, l = {71}, m = "invokeSuspend", n = {"$this$flow", "client"}, s = {"L$0", "L$1"}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super ZpkInfo>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f25994a;

        /* renamed from: b, reason: collision with root package name */
        public int f25995b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25996c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f25997d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f25998e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i11, int i12, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f25997d = i11;
            this.f25998e = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = new e(this.f25997d, this.f25998e, cVar);
            eVar.f25996c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f25996c;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25995b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ResourceService.Client client = (ResourceService.Client) new com.baicizhan.client.business.thrift.l("/rpc/resource_api").c(1).b(10000).d(10000).a();
                ZpkInfo zpkInfo = client.get_zpk_infos(TopicIdMapingUtils.buildTopicKeyList(a00.g0.l(l00.a.f(this.f25997d)), this.f25998e)).get(0);
                this.f25996c = l00.k.a(jVar);
                this.f25994a = l00.k.a(client);
                this.f25995b = 1;
                if (jVar.emit(zpkInfo, this) == l11) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super ZpkInfo> jVar, j00.c<? super g2> cVar) {
            return ((e) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$3", f = "loader.kt", i = {0, 0}, l = {81}, m = "invokeSuspend", n = {"$this$catch", "e"}, s = {"L$0", "L$1"}, v = 1)
    public static final class f extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super TopicRecord>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25999a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26000b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26001c;

        public f(j00.c<? super f> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f26000b;
            Throwable th2 = (Throwable) this.f26001c;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25999a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                qb.c.c(LoaderKt.f25958a, "", th2);
                this.f26000b = l00.k.a(jVar);
                this.f26001c = l00.k.a(th2);
                this.f25999a = 1;
                if (jVar.emit(null, this) == l11) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super TopicRecord> jVar, Throwable th2, j00.c<? super g2> cVar) {
            f fVar = new f(cVar);
            fVar.f26000b = jVar;
            fVar.f26001c = th2;
            return fVar.invokeSuspend(g2.f100423a);
        }
    }

    public static final boolean f(TopicRecord topicRecord, Context context) {
        return rb.d.f(context) && !sh.t.c(topicRecord);
    }

    public static final kotlinx.coroutines.flow.i<List<?>> g(TopicRecord topicRecord, com.baicizhan.main.wikiv2.studyv2.data.c cVar) {
        return kotlinx.coroutines.flow.k.v(kotlinx.coroutines.flow.k.K0(new a(topicRecord, cVar, null)), new b(cVar, topicRecord, null));
    }

    public static final kotlinx.coroutines.flow.i<List<?>> h(int i11, final com.baicizhan.main.wikiv2.studyv2.data.c cVar) {
        final kotlinx.coroutines.flow.i K0 = kotlinx.coroutines.flow.k.K0(new c(i11, null));
        return new kotlinx.coroutines.flow.i<List<?>>() { // from class: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @kotlin.jvm.internal.u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 loader.kt\ncom/baicizhan/main/wikiv2/studyv2/data/LoaderKt\n*L\n1#1,49:1\n50#2:50\n104#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f25961a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f25962b;

                @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1$2", f = "loader.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, c cVar) {
                    this.f25961a = jVar;
                    this.f25962b = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, j00.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1$2$1 r0 = (com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1$2$1 r0 = new com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.L$3
                        kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                        java.lang.Object r6 = r0.L$1
                        com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1$2$1 r6 = (com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L6e
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f25961a
                        r2 = r6
                        com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord r2 = (com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord) r2
                        com.baicizhan.main.wikiv2.studyv2.data.c r4 = r5.f25962b
                        kotlin.jvm.internal.g0.m(r2)
                        java.util.List r2 = r4.b(r2)
                        java.lang.Object r4 = l00.k.a(r6)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r6 = l00.k.a(r6)
                        r0.L$2 = r6
                        java.lang.Object r6 = l00.k.a(r7)
                        r0.L$3 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L6e
                        return r1
                    L6e:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromDb$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super List<?>> jVar, j00.c cVar2) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, cVar), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    public static final kotlinx.coroutines.flow.i<TopicRecord> i(Context context, int i11, int i12) {
        return kotlinx.coroutines.flow.k.K0(new d(context, i11, i12, null));
    }

    public static final kotlinx.coroutines.flow.i<TopicRecord> j(final Context context, final int i11, final int i12) {
        final kotlinx.coroutines.flow.i K0 = kotlinx.coroutines.flow.k.K0(new e(i12, i11, null));
        return kotlinx.coroutines.flow.k.v(new kotlinx.coroutines.flow.i<TopicRecord>() { // from class: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @kotlin.jvm.internal.u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 loader.kt\ncom/baicizhan/main/wikiv2/studyv2/data/LoaderKt\n*L\n1#1,49:1\n50#2:50\n73#3,6:51\n*E\n"})
            /* renamed from: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f25967a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f25968b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f25969c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Context f25970d;

                @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1$2", f = "loader.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, int i11, int i12, Context context) {
                    this.f25967a = jVar;
                    this.f25968b = i11;
                    this.f25969c = i12;
                    this.f25970d = context;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, j00.c r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1$2$1 r0 = (com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1$2$1 r0 = new com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r8 = r0.L$3
                        kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
                        java.lang.Object r8 = r0.L$1
                        com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1$2$1 r8 = (com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1.AnonymousClass2.AnonymousClass1) r8
                        kotlin.e.n(r9)
                        goto L90
                    L31:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L39:
                        kotlin.e.n(r9)
                        kotlinx.coroutines.flow.j r9 = r7.f25967a
                        r2 = r8
                        com.baicizhan.online.resource_api.ZpkInfo r2 = (com.baicizhan.online.resource_api.ZpkInfo) r2
                        sh.s r4 = new sh.s
                        int r5 = r7.f25968b
                        int r6 = r7.f25969c
                        r4.<init>(r5, r6)
                        r4.n(r2)
                        android.content.Context r2 = r7.f25970d
                        int r5 = r7.f25968b
                        int r6 = r7.f25969c
                        com.baicizhan.client.business.dataset.models.TopicRecord r2 = i9.l.d(r2, r5, r6)
                        r4.m(r2)
                        rx.d r2 = bc0.c.e()
                        rx.c r2 = th.s.d(r4, r2)
                        yb0.b r2 = r2.t6()
                        java.lang.Object r2 = r2.b()
                        com.baicizhan.client.business.dataset.models.TopicRecord r2 = (com.baicizhan.client.business.dataset.models.TopicRecord) r2
                        java.lang.Object r4 = l00.k.a(r8)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r8 = l00.k.a(r8)
                        r0.L$2 = r8
                        java.lang.Object r8 = l00.k.a(r9)
                        r0.L$3 = r8
                        r8 = 0
                        r0.I$0 = r8
                        r0.label = r3
                        java.lang.Object r8 = r9.emit(r2, r0)
                        if (r8 != r1) goto L90
                        return r1
                    L90:
                        yz.g2 r8 = yz.g2.f100423a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadFromNet$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super TopicRecord> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, i11, i12, context), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, new f(null));
    }

    public static final kotlinx.coroutines.flow.i<TopicRecord> k(Context context, int i11, int i12, boolean z11) {
        final kotlinx.coroutines.flow.i C0 = kotlinx.coroutines.flow.k.C0(i(context, i11, i12), new LoaderKt$loadZpk$1(z11, context, i11, i12, null));
        return new kotlinx.coroutines.flow.i<TopicRecord>() { // from class: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @kotlin.jvm.internal.u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 loader.kt\ncom/baicizhan/main/wikiv2/studyv2/data/LoaderKt\n*L\n1#1,49:1\n50#2:50\n51#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f25972a;

                @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1$2", f = "loader.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                    this.f25972a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, j00.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1$2$1 r0 = (com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1$2$1 r0 = new com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.L$3
                        kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                        java.lang.Object r6 = r0.L$1
                        com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1$2$1 r6 = (com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L67
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f25972a
                        r2 = r6
                        com.baicizhan.client.business.dataset.models.TopicRecord r2 = (com.baicizhan.client.business.dataset.models.TopicRecord) r2
                        if (r2 == 0) goto L6a
                        java.lang.Object r4 = l00.k.a(r6)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r6 = l00.k.a(r6)
                        r0.L$2 = r6
                        java.lang.Object r6 = l00.k.a(r7)
                        r0.L$3 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L67
                        return r1
                    L67:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    L6a:
                        java.lang.RuntimeException r6 = new java.lang.RuntimeException
                        java.lang.String r7 = "zpk load failed"
                        r6.<init>(r7)
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super TopicRecord> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }
}
