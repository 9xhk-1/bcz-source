package com.baicizhan.main.wikiv2.studyv2.data;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class r0 implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f26085b = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c f26086a = new c(v0.f26118a.a());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.WikiDataLoaderIml$load$1", f = "loader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<TopicRecord, j00.c<? super kotlinx.coroutines.flow.i<? extends List<?>>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26087a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26088b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = r0.this.new a(cVar);
            aVar.f26088b = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopicRecord topicRecord, j00.c<? super kotlinx.coroutines.flow.i<? extends List<?>>> cVar) {
            return ((a) create(topicRecord, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.i g11;
            TopicRecord topicRecord = (TopicRecord) this.f26088b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26087a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            g11 = LoaderKt.g(topicRecord, r0.this.f26086a);
            return g11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.data.WikiDataLoaderIml$load$2", f = "loader.kt", i = {0, 0, 1, 1}, l = {33, 33}, m = "invokeSuspend", n = {"$this$catch", "e", "$this$catch", "e"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class b extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super List<?>>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26090a;

        /* renamed from: b, reason: collision with root package name */
        public int f26091b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26092c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f26093d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f26094e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r0 f26095f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, r0 r0Var, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f26094e = i11;
            this.f26095f = r0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
        
            if (r3.emit(r7, r6) == r2) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f26092c
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
                java.lang.Object r1 = r6.f26093d
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
                int r3 = r6.f26091b
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2a
                if (r3 == r5) goto L22
                if (r3 != r4) goto L1a
                kotlin.e.n(r7)
                goto L70
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                java.lang.Object r3 = r6.f26090a
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.j) r3
                kotlin.e.n(r7)
                goto L58
            L2a:
                kotlin.e.n(r7)
                java.lang.String r7 = "WikiLoaderIml"
                java.lang.String r3 = ""
                qb.c.c(r7, r3, r1)
                int r7 = r6.f26094e
                com.baicizhan.main.wikiv2.studyv2.data.r0 r3 = r6.f26095f
                com.baicizhan.main.wikiv2.studyv2.data.c r3 = com.baicizhan.main.wikiv2.studyv2.data.r0.c(r3)
                kotlinx.coroutines.flow.i r7 = com.baicizhan.main.wikiv2.studyv2.data.LoaderKt.c(r7, r3)
                java.lang.Object r3 = l00.k.a(r0)
                r6.f26092c = r3
                java.lang.Object r3 = l00.k.a(r1)
                r6.f26093d = r3
                r6.f26090a = r0
                r6.f26091b = r5
                java.lang.Object r7 = kotlinx.coroutines.flow.k.K1(r7, r6)
                if (r7 != r2) goto L57
                goto L6f
            L57:
                r3 = r0
            L58:
                java.lang.Object r0 = l00.k.a(r0)
                r6.f26092c = r0
                java.lang.Object r0 = l00.k.a(r1)
                r6.f26093d = r0
                r0 = 0
                r6.f26090a = r0
                r6.f26091b = r4
                java.lang.Object r7 = r3.emit(r7, r6)
                if (r7 != r2) goto L70
            L6f:
                return r2
            L70:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wikiv2.studyv2.data.r0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.q
        public final Object invoke(kotlinx.coroutines.flow.j<? super List<?>> jVar, Throwable th2, j00.c<? super g2> cVar) {
            b bVar = new b(this.f26094e, this.f26095f, cVar);
            bVar.f26092c = jVar;
            bVar.f26093d = th2;
            return bVar.invokeSuspend(g2.f100423a);
        }
    }

    @Override // com.baicizhan.main.wikiv2.studyv2.data.q0
    @m80.k
    public kotlinx.coroutines.flow.i<List<?>> a(@m80.k Context context, int i11, int i12, boolean z11) {
        kotlinx.coroutines.flow.i k11;
        kotlinx.coroutines.flow.i d11;
        kotlin.jvm.internal.g0.p(context, "context");
        k11 = LoaderKt.k(context, i11, i12, z11);
        d11 = FlowKt__MergeKt.d(k11, 0, new a(null), 1, null);
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.v(d11, new b(i12, this, null)), h1.c());
    }
}
