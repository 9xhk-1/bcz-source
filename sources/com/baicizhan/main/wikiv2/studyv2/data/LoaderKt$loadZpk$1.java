package com.baicizhan.main.wikiv2.studyv2.data;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$1", f = "loader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@kotlin.jvm.internal.u0({"SMAP\nloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 loader.kt\ncom/baicizhan/main/wikiv2/studyv2/data/LoaderKt$loadZpk$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,150:1\n49#2:151\n51#2:155\n46#3:152\n51#3:154\n105#4:153\n*S KotlinDebug\n*F\n+ 1 loader.kt\ncom/baicizhan/main/wikiv2/studyv2/data/LoaderKt$loadZpk$1\n*L\n44#1:151\n44#1:155\n44#1:152\n44#1:154\n44#1:153\n*E\n"})
/* loaded from: classes3.dex */
public final class LoaderKt$loadZpk$1 extends SuspendLambda implements x00.p<TopicRecord, j00.c<? super kotlinx.coroutines.flow.i<? extends TopicRecord>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26002a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f26005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26007f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$1$2", f = "loader.kt", i = {0}, l = {48}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super TopicRecord>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26008a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26009b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TopicRecord f26010c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TopicRecord topicRecord, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f26010c = topicRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f26010c, cVar);
            aVar.f26009b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f26009b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26008a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                TopicRecord topicRecord = this.f26010c;
                this.f26009b = l00.k.a(jVar);
                this.f26008a = 1;
                if (jVar.emit(topicRecord, this) == l11) {
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
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoaderKt$loadZpk$1(boolean z11, Context context, int i11, int i12, j00.c<? super LoaderKt$loadZpk$1> cVar) {
        super(2, cVar);
        this.f26004c = z11;
        this.f26005d = context;
        this.f26006e = i11;
        this.f26007f = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        LoaderKt$loadZpk$1 loaderKt$loadZpk$1 = new LoaderKt$loadZpk$1(this.f26004c, this.f26005d, this.f26006e, this.f26007f, cVar);
        loaderKt$loadZpk$1.f26003b = obj;
        return loaderKt$loadZpk$1;
    }

    @Override // x00.p
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(TopicRecord topicRecord, j00.c<? super kotlinx.coroutines.flow.i<? extends TopicRecord>> cVar) {
        return ((LoaderKt$loadZpk$1) create(topicRecord, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r4 != false) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f26003b
            com.baicizhan.client.business.dataset.models.TopicRecord r0 = (com.baicizhan.client.business.dataset.models.TopicRecord) r0
            kotlin.coroutines.intrinsics.b.l()
            int r1 = r3.f26002a
            if (r1 != 0) goto L38
            kotlin.e.n(r4)
            if (r0 == 0) goto L28
            boolean r4 = r3.f26004c
            if (r4 == 0) goto L1d
            android.content.Context r4 = r3.f26005d
            boolean r4 = com.baicizhan.main.wikiv2.studyv2.data.LoaderKt.a(r0, r4)
            if (r4 == 0) goto L1d
            goto L28
        L1d:
            com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$1$a r4 = new com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$1$a
            r1 = 0
            r4.<init>(r0, r1)
            kotlinx.coroutines.flow.i r4 = kotlinx.coroutines.flow.k.K0(r4)
            return r4
        L28:
            android.content.Context r4 = r3.f26005d
            int r1 = r3.f26006e
            int r2 = r3.f26007f
            kotlinx.coroutines.flow.i r4 = com.baicizhan.main.wikiv2.studyv2.data.LoaderKt.d(r4, r1, r2)
            com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$1$invokeSuspend$$inlined$map$1 r1 = new com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$1$invokeSuspend$$inlined$map$1
            r1.<init>()
            return r1
        L38:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wikiv2.studyv2.data.LoaderKt$loadZpk$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
