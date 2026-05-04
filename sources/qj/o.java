package qj;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import com.baicizhan.online.user_activity_api.ExportActivityInfo;
import com.baicizhan.online.user_activity_api.ExportParam;
import com.baicizhan.online.user_activity_api.ExportQuota;
import com.baicizhan.online.user_activity_api.UserActivityApiService;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class o implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final int f82325b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final UserActivityApiService.Client f82326a = (UserActivityApiService.Client) new com.baicizhan.client.business.thrift.l("/rpc/activity").a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportWordServiceImpl", f = "ExportWordService.kt", i = {}, l = {42}, m = "buyExportQuota-IoAF18A", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f82327a;

        /* renamed from: c, reason: collision with root package name */
        public int f82329c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f82327a = obj;
            this.f82329c |= Integer.MIN_VALUE;
            Object b11 = o.this.b(this);
            return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : Result.m6307boximpl(b11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportWordServiceImpl$buyExportQuota$2", f = "ExportWordService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.l<j00.c<? super ExportQuota>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f82330a;

        public b(j00.c<? super b> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return o.this.new b(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super ExportQuota> cVar) {
            return ((b) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f82330a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return o.this.f82326a.buy_export_quota();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportWordServiceImpl", f = "ExportWordService.kt", i = {0}, l = {38}, m = "doExportWord-gIAlu-s", n = {"params"}, s = {"L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f82332a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f82333b;

        /* renamed from: d, reason: collision with root package name */
        public int f82335d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f82333b = obj;
            this.f82335d |= Integer.MIN_VALUE;
            Object a11 = o.this.a(null, this);
            return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : Result.m6307boximpl(a11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportWordServiceImpl$doExportWord$2", f = "ExportWordService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f82336a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ExportParam f82338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ExportParam exportParam, j00.c<? super d> cVar) {
            super(1, cVar);
            this.f82338c = exportParam;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return o.this.new d(this.f82338c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((d) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f82336a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            o.this.f82326a.export_words(this.f82338c);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportWordServiceImpl$getExportInfo$2", f = "ExportWordService.kt", i = {0}, l = {35}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super ExportActivityInfo>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f82339a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f82340b;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = o.this.new e(cVar);
            eVar.f82340b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f82340b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f82339a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ExportActivityInfo exportActivityInfo = o.this.f82326a.get_export_activity_info();
                this.f82340b = l00.k.a(jVar);
                this.f82339a = 1;
                if (jVar.emit(exportActivityInfo, this) == l11) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super ExportActivityInfo> jVar, j00.c<? super g2> cVar) {
            return ((e) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // qj.p
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k com.baicizhan.online.user_activity_api.ExportParam r8, @m80.k j00.c<? super kotlin.Result<yz.g2>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof qj.o.c
            if (r0 == 0) goto L14
            r0 = r9
            qj.o$c r0 = (qj.o.c) r0
            int r1 = r0.f82335d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f82335d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            qj.o$c r0 = new qj.o$c
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f82333b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f82335d
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r8 = r4.f82332a
            com.baicizhan.online.user_activity_api.ExportParam r8 = (com.baicizhan.online.user_activity_api.ExportParam) r8
            kotlin.e.n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.m6317unboximpl()
            return r8
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.e.n(r9)
            c40.m0 r1 = c40.h1.c()
            qj.o$d r3 = new qj.o$d
            r9 = 0
            r3.<init>(r8, r9)
            java.lang.Object r8 = l00.k.a(r8)
            r4.f82332a = r8
            r4.f82335d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L5c
            return r0
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.o.a(com.baicizhan.online.user_activity_api.ExportParam, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // qj.p
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super kotlin.Result<? extends com.baicizhan.online.user_activity_api.ExportQuota>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof qj.o.a
            if (r0 == 0) goto L14
            r0 = r8
            qj.o$a r0 = (qj.o.a) r0
            int r1 = r0.f82329c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f82329c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            qj.o$a r0 = new qj.o$a
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f82327a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f82329c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            kotlin.e.n(r8)
            c40.m0 r1 = c40.h1.c()
            qj.o$b r3 = new qj.o$b
            r8 = 0
            r3.<init>(r8)
            r4.f82329c = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.o.b(j00.c):java.lang.Object");
    }

    @Override // qj.p
    @m80.l
    public Object c(@m80.k j00.c<? super kotlinx.coroutines.flow.i<? extends ExportActivityInfo>> cVar) {
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.K0(new e(null)), h1.c());
    }
}
