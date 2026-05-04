package rw;

import a00.w1;
import androidx.core.app.NotificationCompat;
import com.tencent.open.SocialConstants;
import ix.e1;
import ix.g1;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.slf4j.Logger;
import sw.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpRedirect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRedirect.kt\nio/ktor/client/plugins/HttpRedirectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n1#2:116\n*E\n"})
/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Set<ix.e1> f84622a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Logger f84623b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final hx.a<ex.c> f84624c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final sw.b<d0> f84625d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<d0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84626a = new a();

        public a() {
            super(0, d0.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            return new d0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1", f = "HttpRedirect.kt", i = {0, 0}, l = {97, 102}, m = "invokeSuspend", n = {"$this$on", SocialConstants.TYPE_REQUEST}, s = {"L$0", "L$1"})
    public static final class b extends SuspendLambda implements x00.q<q.a, cx.y, j00.c<? super mw.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84627a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84628b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84629c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f84630d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f84631e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ sw.d<d0> f84632f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z11, boolean z12, sw.d<d0> dVar, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f84630d = z11;
            this.f84631e = z12;
            this.f84632f = dVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q.a aVar, cx.y yVar, j00.c<? super mw.a> cVar) {
            b bVar = new b(this.f84630d, this.f84631e, this.f84632f, cVar);
            bVar.f84628b = aVar;
            bVar.f84629c = yVar;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            cx.y yVar;
            q.a aVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84627a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                q.a aVar2 = (q.a) this.f84628b;
                yVar = (cx.y) this.f84629c;
                this.f84628b = aVar2;
                this.f84629c = yVar;
                this.f84627a = 1;
                Object a11 = aVar2.a(yVar, this);
                if (a11 != l11) {
                    aVar = aVar2;
                    obj = a11;
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            yVar = (cx.y) this.f84629c;
            aVar = (q.a) this.f84628b;
            kotlin.e.n(obj);
            cx.y yVar2 = yVar;
            mw.a aVar3 = (mw.a) obj;
            if (this.f84630d && !f0.f84622a.contains(aVar3.h().getMethod())) {
                return aVar3;
            }
            boolean z11 = this.f84631e;
            lw.c b11 = this.f84632f.b();
            this.f84628b = null;
            this.f84629c = null;
            this.f84627a = 2;
            Object c11 = f0.c(aVar, yVar2, aVar3, z11, b11, this);
            return c11 == l11 ? l11 : c11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpRedirectKt", f = "HttpRedirect.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {91}, m = "HttpRedirect$lambda$2$handleCall", n = {"$this$HttpRedirect_u24lambda_u242_u24handleCall", c90.k.f8409a, "client", NotificationCompat.CATEGORY_CALL, "requestBuilder", "originProtocol", "originAuthority", "allowHttpsDowngrade"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f84633a;

        /* renamed from: b, reason: collision with root package name */
        public Object f84634b;

        /* renamed from: c, reason: collision with root package name */
        public Object f84635c;

        /* renamed from: d, reason: collision with root package name */
        public Object f84636d;

        /* renamed from: e, reason: collision with root package name */
        public Object f84637e;

        /* renamed from: f, reason: collision with root package name */
        public Object f84638f;

        /* renamed from: g, reason: collision with root package name */
        public Object f84639g;

        /* renamed from: h, reason: collision with root package name */
        public Object f84640h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f84641i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f84642j;

        /* renamed from: k, reason: collision with root package name */
        public int f84643k;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f84642j = obj;
            this.f84643k |= Integer.MIN_VALUE;
            return f0.c(null, null, null, false, null, this);
        }
    }

    static {
        e1.a aVar = ix.e1.f62753b;
        f84622a = w1.u(aVar.c(), aVar.d());
        f84623b = ez.a.a("io.ktor.client.plugins.HttpRedirect");
        f84624c = new hx.a<>();
        f84625d = sw.i.b("HttpRedirect", a.f84626a, new x00.l() { // from class: rw.e0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b11;
                b11 = f0.b((sw.d) obj);
                return b11;
            }
        });
    }

    public static final g2 b(sw.d createClientPlugin) {
        kotlin.jvm.internal.g0.p(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.g(sw.q.f88973a, new b(((d0) createClientPlugin.f()).b(), ((d0) createClientPlugin.f()).a(), createClientPlugin, null));
        return g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, cx.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0197 -> B:10:0x019e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(sw.q.a r17, cx.y r18, mw.a r19, boolean r20, lw.c r21, j00.c<? super mw.a> r22) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rw.f0.c(sw.q$a, cx.y, mw.a, boolean, lw.c, j00.c):java.lang.Object");
    }

    @m80.k
    public static final sw.b<d0> f() {
        return f84625d;
    }

    @m80.k
    public static final hx.a<ex.c> h() {
        return f84624c;
    }

    public static final boolean i(ix.g1 g1Var) {
        int p02 = g1Var.p0();
        g1.a aVar = ix.g1.f62797c;
        return p02 == aVar.t().p0() || p02 == aVar.l().p0() || p02 == aVar.T().p0() || p02 == aVar.G().p0() || p02 == aVar.P().p0();
    }

    public static /* synthetic */ void g() {
    }
}
