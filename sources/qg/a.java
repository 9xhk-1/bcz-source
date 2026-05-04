package qg;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import com.huawei.hms.push.constant.RemoteMessageConst;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f82094c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m0 f82095a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public v0 f82096b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.module.exam.DoExamStateRefreshUC$invoke$1", f = "DoExamStateRefreshUC.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {46, 51, 55}, m = "invokeSuspend", n = {"$this$flow", "record", "roadMap", "bookRecord", "paramString", RemoteMessageConst.MessageBody.PARAM, "version", "wantMore", "$this$flow", "record", "roadMap", "bookRecord", "paramString", RemoteMessageConst.MessageBody.PARAM, "version", "wantMore", "$this$flow", "record", "roadMap", "bookRecord", "paramString", RemoteMessageConst.MessageBody.PARAM, "version", "wantMore"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "I$0"}, v = 1)
    /* renamed from: qg.a$a, reason: collision with other inner class name */
    public static final class C1019a extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super Boolean>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f82097a;

        /* renamed from: b, reason: collision with root package name */
        public Object f82098b;

        /* renamed from: c, reason: collision with root package name */
        public Object f82099c;

        /* renamed from: d, reason: collision with root package name */
        public Object f82100d;

        /* renamed from: e, reason: collision with root package name */
        public Object f82101e;

        /* renamed from: f, reason: collision with root package name */
        public long f82102f;

        /* renamed from: g, reason: collision with root package name */
        public int f82103g;

        /* renamed from: h, reason: collision with root package name */
        public int f82104h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f82105i;

        public C1019a(j00.c<? super C1019a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            C1019a c1019a = a.this.new C1019a(cVar);
            c1019a.f82105i = obj;
            return c1019a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0150, code lost:
        
            if (r1.emit(r7, r24) == r2) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x01ae, code lost:
        
            if (r1.emit(r7, r24) == r2) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 576
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.a.C1019a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(kotlinx.coroutines.flow.j<? super Boolean> jVar, j00.c<? super g2> cVar) {
            return ((C1019a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @Inject
    public a(@m80.k m0 repo) {
        kotlin.jvm.internal.g0.p(repo, "repo");
        this.f82095a = repo;
    }

    @m80.k
    public final kotlinx.coroutines.flow.i<Boolean> d() {
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.K0(new C1019a(null)), h1.c());
    }
}
