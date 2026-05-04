package com.baicizhan.main.wordlistv2.repo;

import a00.i0;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.user_study_api.WordListItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import k3.v0;
import k3.w0;
import k3.x2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nIRemoteState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IRemoteState.kt\ncom/baicizhan/main/wordlistv2/repo/RemoteImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 7 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 8 Koin.kt\norg/koin/core/Koin\n+ 9 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,65:1\n1563#2:66\n1634#2,3:67\n49#3:70\n51#3:74\n49#3:75\n51#3:79\n49#3:80\n51#3:84\n49#3:85\n51#3:89\n46#4:71\n51#4:73\n46#4:76\n51#4:78\n46#4:81\n51#4:83\n46#4:86\n51#4:88\n105#5:72\n105#5:77\n105#5:82\n105#5:87\n10#6:90\n43#7:91\n124#8,4:92\n142#9:96\n*S KotlinDebug\n*F\n+ 1 IRemoteState.kt\ncom/baicizhan/main/wordlistv2/repo/RemoteImpl\n*L\n33#1:66\n33#1:67,3\n46#1:70\n46#1:74\n50#1:75\n50#1:79\n56#1:80\n56#1:84\n62#1:85\n62#1:89\n46#1:71\n46#1:73\n50#1:76\n50#1:78\n56#1:81\n56#1:83\n62#1:86\n62#1:88\n46#1:72\n50#1:77\n56#1:82\n62#1:87\n31#1:90\n31#1:91\n31#1:92,4\n31#1:96\n*E\n"})
/* loaded from: classes5.dex */
public final class RemoteImpl implements com.baicizhan.main.wordlistv2.repo.c {

    /* renamed from: c, reason: collision with root package name */
    public static final int f27907c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Context f27908a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f27909b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.RemoteImpl", f = "IRemoteState.kt", i = {0, 0, 1, 1}, l = {55, 58}, m = "cancelCutWordList", n = {"topicIds", "bookId", "topicIds", "bookId"}, s = {"L$0", "I$0", "L$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f27932a;

        /* renamed from: b, reason: collision with root package name */
        public Object f27933b;

        /* renamed from: c, reason: collision with root package name */
        public Object f27934c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f27935d;

        /* renamed from: f, reason: collision with root package name */
        public int f27937f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f27935d = obj;
            this.f27937f |= Integer.MIN_VALUE;
            return RemoteImpl.this.d(0, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.RemoteImpl", f = "IRemoteState.kt", i = {0, 1}, l = {45, 48}, m = "getWordListStatus", n = {"bookId", "bookId"}, s = {"I$0", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f27938a;

        /* renamed from: b, reason: collision with root package name */
        public Object f27939b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f27940c;

        /* renamed from: e, reason: collision with root package name */
        public int f27942e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f27940c = obj;
            this.f27942e |= Integer.MIN_VALUE;
            return RemoteImpl.this.b(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.RemoteImpl", f = "IRemoteState.kt", i = {0, 0, 1, 1}, l = {61, 64}, m = "relearnWordList", n = {"topicIds", "bookId", "topicIds", "bookId"}, s = {"L$0", "I$0", "L$0", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f27943a;

        /* renamed from: b, reason: collision with root package name */
        public Object f27944b;

        /* renamed from: c, reason: collision with root package name */
        public Object f27945c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f27946d;

        /* renamed from: f, reason: collision with root package name */
        public int f27948f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f27946d = obj;
            this.f27948f |= Integer.MIN_VALUE;
            return RemoteImpl.this.a(0, null, this);
        }
    }

    @Inject
    public RemoteImpl(@cv.b @m80.k Context context) {
        g0.p(context, "context");
        this.f27908a = context;
        this.f27909b = e0.c(new x00.a() { // from class: com.baicizhan.main.wordlistv2.repo.i
            @Override // x00.a
            public final Object invoke() {
                w0 g11;
                g11 = RemoteImpl.g(RemoteImpl.this);
                return g11;
            }
        });
    }

    public static final w0 g(RemoteImpl remoteImpl) {
        dd.h.g(remoteImpl.f27908a);
        return (w0) ((x2) c4.j.f7801a.a().P().h().i(o0.d(w0.class), null, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.main.wordlistv2.repo.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(final int r6, @m80.k final java.util.List<java.lang.Integer> r7, @m80.k j00.c<? super java.util.List<? extends com.baicizhan.online.user_study_api.WordListItem>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.main.wordlistv2.repo.RemoteImpl.c
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.main.wordlistv2.repo.RemoteImpl$c r0 = (com.baicizhan.main.wordlistv2.repo.RemoteImpl.c) r0
            int r1 = r0.f27948f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27948f = r1
            goto L18
        L13:
            com.baicizhan.main.wordlistv2.repo.RemoteImpl$c r0 = new com.baicizhan.main.wordlistv2.repo.RemoteImpl$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27946d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f27948f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f27944b
            java.util.List r6 = (java.util.List) r6
            kotlin.e.n(r8)
            goto L8c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f27945c
            com.baicizhan.main.wordlistv2.repo.RemoteImpl r6 = (com.baicizhan.main.wordlistv2.repo.RemoteImpl) r6
            java.lang.Object r7 = r0.f27944b
            java.util.List r7 = (java.util.List) r7
            kotlin.e.n(r8)
            goto L67
        L44:
            kotlin.e.n(r8)
            com.baicizhan.main.home.experiment.q0 r8 = com.baicizhan.main.home.experiment.q0.f21394a
            boolean r8 = r8.b()
            if (r8 == 0) goto L6e
            k3.w0 r8 = r5.h()
            java.lang.Object r2 = l00.k.a(r7)
            r0.f27944b = r2
            r0.f27945c = r5
            r0.f27943a = r6
            r0.f27948f = r4
            java.lang.Object r8 = r8.H1(r6, r7, r0)
            if (r8 != r1) goto L66
            goto L8b
        L66:
            r6 = r5
        L67:
            java.util.List r8 = (java.util.List) r8
            java.util.List r6 = r6.f(r8)
            return r6
        L6e:
            com.baicizhan.client.business.thrift.m r8 = com.baicizhan.client.business.thrift.m.f16659a
            java.lang.String r2 = "/rpc/user_study"
            kotlinx.coroutines.flow.i r8 = r8.b(r2)
            com.baicizhan.main.wordlistv2.repo.RemoteImpl$relearnWordList$$inlined$map$1 r2 = new com.baicizhan.main.wordlistv2.repo.RemoteImpl$relearnWordList$$inlined$map$1
            r2.<init>()
            java.lang.Object r7 = l00.k.a(r7)
            r0.f27944b = r7
            r0.f27943a = r6
            r0.f27948f = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.k.w0(r2, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.repo.RemoteImpl.a(int, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.main.wordlistv2.repo.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(final int r6, @m80.k j00.c<? super java.util.List<? extends com.baicizhan.online.user_study_api.WordListItem>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.baicizhan.main.wordlistv2.repo.RemoteImpl.b
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.main.wordlistv2.repo.RemoteImpl$b r0 = (com.baicizhan.main.wordlistv2.repo.RemoteImpl.b) r0
            int r1 = r0.f27942e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27942e = r1
            goto L18
        L13:
            com.baicizhan.main.wordlistv2.repo.RemoteImpl$b r0 = new com.baicizhan.main.wordlistv2.repo.RemoteImpl$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27940c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f27942e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)
            goto L78
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f27939b
            com.baicizhan.main.wordlistv2.repo.RemoteImpl r6 = (com.baicizhan.main.wordlistv2.repo.RemoteImpl) r6
            kotlin.e.n(r7)
            goto L59
        L3c:
            kotlin.e.n(r7)
            com.baicizhan.main.home.experiment.q0 r7 = com.baicizhan.main.home.experiment.q0.f21394a
            boolean r7 = r7.b()
            if (r7 == 0) goto L60
            k3.w0 r7 = r5.h()
            r0.f27939b = r5
            r0.f27938a = r6
            r0.f27942e = r4
            java.lang.Object r7 = r7.y1(r6, r0)
            if (r7 != r1) goto L58
            goto L77
        L58:
            r6 = r5
        L59:
            java.util.List r7 = (java.util.List) r7
            java.util.List r6 = r6.f(r7)
            return r6
        L60:
            com.baicizhan.client.business.thrift.m r7 = com.baicizhan.client.business.thrift.m.f16659a
            java.lang.String r2 = "/rpc/user_study"
            kotlinx.coroutines.flow.i r7 = r7.b(r2)
            com.baicizhan.main.wordlistv2.repo.RemoteImpl$getWordListStatus$$inlined$map$1 r2 = new com.baicizhan.main.wordlistv2.repo.RemoteImpl$getWordListStatus$$inlined$map$1
            r2.<init>()
            r0.f27938a = r6
            r0.f27942e = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.k.w0(r2, r0)
            if (r7 != r1) goto L78
        L77:
            return r1
        L78:
            java.lang.String r6 = "first(...)"
            kotlin.jvm.internal.g0.o(r7, r6)
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.repo.RemoteImpl.b(int, j00.c):java.lang.Object");
    }

    @Override // com.baicizhan.main.wordlistv2.repo.c
    @m80.l
    public Object c(final int i11, @m80.k final List<Integer> list, @m80.k j00.c<? super List<WordListItem>> cVar) {
        final kotlinx.coroutines.flow.i b11 = com.baicizhan.client.business.thrift.m.f16659a.b("/rpc/user_study");
        return kotlinx.coroutines.flow.k.w0(new kotlinx.coroutines.flow.i<List<WordListItem>>() { // from class: com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 IRemoteState.kt\ncom/baicizhan/main/wordlistv2/repo/RemoteImpl\n*L\n1#1,49:1\n50#2:50\n51#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f27919a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f27920b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f27921c;

                @l00.d(c = "com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1$2", f = "IRemoteState.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, int i11, List list) {
                    this.f27919a = jVar;
                    this.f27920b = i11;
                    this.f27921c = list;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, j00.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1$2$1 r0 = (com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1$2$1 r0 = new com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.L$3
                        kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                        java.lang.Object r7 = r0.L$1
                        com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1$2$1 r7 = (com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L6d
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f27919a
                        r2 = r7
                        com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
                        int r4 = r6.f27920b
                        java.util.List r5 = r6.f27921c
                        java.util.List r2 = r2.cut_word_list(r4, r5)
                        java.lang.Object r4 = l00.k.a(r7)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r7 = l00.k.a(r7)
                        r0.L$2 = r7
                        java.lang.Object r7 = l00.k.a(r8)
                        r0.L$3 = r7
                        r7 = 0
                        r0.I$0 = r7
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L6d
                        return r1
                    L6d:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.repo.RemoteImpl$cutWordList$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super List<WordListItem>> jVar, j00.c cVar2) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, i11, list), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.main.wordlistv2.repo.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(final int r6, @m80.k final java.util.List<java.lang.Integer> r7, @m80.k j00.c<? super java.util.List<? extends com.baicizhan.online.user_study_api.WordListItem>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.main.wordlistv2.repo.RemoteImpl.a
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.main.wordlistv2.repo.RemoteImpl$a r0 = (com.baicizhan.main.wordlistv2.repo.RemoteImpl.a) r0
            int r1 = r0.f27937f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27937f = r1
            goto L18
        L13:
            com.baicizhan.main.wordlistv2.repo.RemoteImpl$a r0 = new com.baicizhan.main.wordlistv2.repo.RemoteImpl$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27935d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f27937f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f27933b
            java.util.List r6 = (java.util.List) r6
            kotlin.e.n(r8)
            goto L8c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f27934c
            com.baicizhan.main.wordlistv2.repo.RemoteImpl r6 = (com.baicizhan.main.wordlistv2.repo.RemoteImpl) r6
            java.lang.Object r7 = r0.f27933b
            java.util.List r7 = (java.util.List) r7
            kotlin.e.n(r8)
            goto L67
        L44:
            kotlin.e.n(r8)
            com.baicizhan.main.home.experiment.q0 r8 = com.baicizhan.main.home.experiment.q0.f21394a
            boolean r8 = r8.b()
            if (r8 == 0) goto L6e
            k3.w0 r8 = r5.h()
            java.lang.Object r2 = l00.k.a(r7)
            r0.f27933b = r2
            r0.f27934c = r5
            r0.f27932a = r6
            r0.f27937f = r4
            java.lang.Object r8 = r8.W0(r6, r7, r0)
            if (r8 != r1) goto L66
            goto L8b
        L66:
            r6 = r5
        L67:
            java.util.List r8 = (java.util.List) r8
            java.util.List r6 = r6.f(r8)
            return r6
        L6e:
            com.baicizhan.client.business.thrift.m r8 = com.baicizhan.client.business.thrift.m.f16659a
            java.lang.String r2 = "/rpc/user_study"
            kotlinx.coroutines.flow.i r8 = r8.b(r2)
            com.baicizhan.main.wordlistv2.repo.RemoteImpl$cancelCutWordList$$inlined$map$1 r2 = new com.baicizhan.main.wordlistv2.repo.RemoteImpl$cancelCutWordList$$inlined$map$1
            r2.<init>()
            java.lang.Object r7 = l00.k.a(r7)
            r0.f27933b = r7
            r0.f27932a = r6
            r0.f27937f = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.k.w0(r2, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.repo.RemoteImpl.d(int, java.util.List, j00.c):java.lang.Object");
    }

    public final List<WordListItem> f(List<v0> list) {
        List<v0> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        for (v0 v0Var : list2) {
            WordListItem wordListItem = new WordListItem();
            wordListItem.topic_id = v0Var.n();
            wordListItem.mastered = v0Var.j();
            wordListItem.modify_time = v0Var.k();
            wordListItem.cut = v0Var.i();
            wordListItem.next_review_day = v0Var.l();
            wordListItem.status = v0Var.m();
            arrayList.add(wordListItem);
        }
        return arrayList;
    }

    public final w0 h() {
        return (w0) this.f27909b.getValue();
    }
}
