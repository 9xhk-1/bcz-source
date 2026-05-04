package a5;

import c40.r0;
import com.baicizhan.app.biz.game.impl.unity.proto.MsgType;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import d5.e;
import d5.j;
import d5.m;
import j00.c;
import k3.f1;
import k3.u;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import m80.l;
import oa0.r;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {f1.class})
@u0({"SMAP\nUnityServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnityServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/unity/UnityServiceImpl\n+ 2 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 3 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n*L\n1#1,41:1\n12#2,3:42\n15#2,10:57\n12#3,12:45\n*S KotlinDebug\n*F\n+ 1 UnityServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/unity/UnityServiceImpl\n*L\n-1#1:42,3\n-1#1:57,10\n-1#1:45,12\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements f1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f1940b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d5.a f1941c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.impl.unity.UnityServiceImpl", f = "UnityServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {25}, m = "bridge", n = {"msg", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UnityServiceImpl$bridge$2", "$i$f$bizCatch", "$i$a$-bizCatch-UnityServiceImpl$bridge$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    /* renamed from: a5.a$a, reason: collision with other inner class name */
    public static final class C0009a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f1942a;

        /* renamed from: b, reason: collision with root package name */
        public Object f1943b;

        /* renamed from: c, reason: collision with root package name */
        public int f1944c;

        /* renamed from: d, reason: collision with root package name */
        public int f1945d;

        /* renamed from: e, reason: collision with root package name */
        public int f1946e;

        /* renamed from: f, reason: collision with root package name */
        public int f1947f;

        /* renamed from: g, reason: collision with root package name */
        public long f1948g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f1949h;

        /* renamed from: j, reason: collision with root package name */
        public int f1951j;

        public C0009a(c<? super C0009a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f1949h = obj;
            this.f1951j |= Integer.MIN_VALUE;
            return a.this.A0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.impl.unity.UnityServiceImpl$bridge$2$1$1", f = "UnityServiceImpl.kt", i = {0}, l = {31}, m = "invokeSuspend", n = {HiAnalyticsConstant.Direction.REQUEST}, s = {"L$0"}, v = 1)
    public static final class b extends SuspendLambda implements p<r0, c<? super u>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f1952a;

        /* renamed from: b, reason: collision with root package name */
        public int f1953b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f1954c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f1955d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, a aVar, c<? super b> cVar) {
            super(2, cVar);
            this.f1954c = str;
            this.f1955d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new b(this.f1954c, this.f1955d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super u> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j jVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f1953b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                z6.b.j(z6.b.f101032b, a5.b.f1956a, "msg from Unity: " + this.f1954c, null, 4, null);
                if (!this.f1955d.f1940b.c(this.f1954c)) {
                    return new u(false, null);
                }
                j a11 = this.f1955d.f1940b.a(this.f1954c);
                d5.a aVar = this.f1955d.f1941c;
                this.f1952a = a11;
                this.f1953b = 1;
                Object b11 = aVar.b(a11, this);
                if (b11 == l11) {
                    return l11;
                }
                jVar = a11;
                obj = b11;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) this.f1952a;
                kotlin.e.n(obj);
            }
            String b12 = this.f1955d.f1940b.b((m) obj);
            if (jVar.o() != MsgType.Call.getValue()) {
                b12 = null;
            }
            z6.b bVar = z6.b.f101032b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("msg to Unity: ");
            sb2.append(b12 != null ? u30.r0.A9(b12, 300) : null);
            z6.b.j(bVar, a5.b.f1956a, sb2.toString(), null, 4, null);
            return new u(true, b12);
        }
    }

    public a(@k e protocolProcess, @k d5.a handler) {
        g0.p(protocolProcess, "protocolProcess");
        g0.p(handler, "handler");
        this.f1940b = protocolProcess;
        this.f1941c = handler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0 A[Catch: all -> 0x00d8, TryCatch #2 {all -> 0x00d8, blocks: (B:22:0x00b9, B:24:0x00c0, B:26:0x00c4, B:28:0x00c8, B:30:0x00cc, B:32:0x00d0, B:43:0x0137, B:34:0x00db, B:36:0x00e6, B:38:0x00fa, B:40:0x010e, B:42:0x0123), top: B:21:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123 A[Catch: all -> 0x00d8, TryCatch #2 {all -> 0x00d8, blocks: (B:22:0x00b9, B:24:0x00c0, B:26:0x00c4, B:28:0x00c8, B:30:0x00cc, B:32:0x00d0, B:43:0x0137, B:34:0x00db, B:36:0x00e6, B:38:0x00fa, B:40:0x010e, B:42:0x0123), top: B:21:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.f1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A0(@m80.k java.lang.String r11, @m80.k j00.c<? super k3.u> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.a.A0(java.lang.String, j00.c):java.lang.Object");
    }
}
