package mw;

import androidx.media3.extractor.text.ttml.TtmlNode;
import c40.r0;
import com.tencent.open.SocialConstants;
import cx.f0;
import cx.w;
import cx.z;
import h10.r;
import io.ktor.utils.io.b0;
import io.ktor.utils.io.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpClientCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientCall.kt\nio/ktor/client/call/HttpClientCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,194:1\n1#2:195\n18#3:196\n58#4,16:197\n*S KotlinDebug\n*F\n+ 1 HttpClientCall.kt\nio/ktor/client/call/HttpClientCall\n*L\n124#1:196\n124#1:197,16\n*E\n"})
/* loaded from: classes8.dex */
public class a implements r0 {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C0890a f73729e = new C0890a(0 == true ? 1 : 0);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f73730f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final xy.a<Object> f73731g;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final lw.c f73732a;

    /* renamed from: b, reason: collision with root package name */
    public w f73733b;

    /* renamed from: c, reason: collision with root package name */
    public ex.c f73734c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f73735d;

    @k
    private volatile /* synthetic */ int received;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: mw.a$a, reason: collision with other inner class name */
    public static final class C0890a {
        public /* synthetic */ C0890a(v vVar) {
            this();
        }

        public C0890a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {}, l = {111}, m = TtmlNode.TAG_BODY, n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f73736a;

        /* renamed from: c, reason: collision with root package name */
        public int f73738c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f73736a = obj;
            this.f73738c |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {0, 0, 1, 1}, l = {84, 87}, m = "bodyNullable", n = {"this", "info", "this", "info"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f73739a;

        /* renamed from: b, reason: collision with root package name */
        public Object f73740b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f73741c;

        /* renamed from: e, reason: collision with root package name */
        public int f73743e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f73741c = obj;
            this.f73743e |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        r rVar = null;
        h10.d d11 = o0.d(Object.class);
        try {
            rVar = o0.B(Object.class);
        } catch (Throwable unused) {
        }
        f73731g = new xy.a<>("CustomResponse", new gz.a(d11, rVar));
        f73730f = AtomicIntegerFieldUpdater.newUpdater(a.class, com.igexin.push.core.b.F);
    }

    public a(@k lw.c client) {
        g0.p(client, "client");
        this.f73732a = client;
        this.received = 0;
    }

    public static /* synthetic */ Object m(a aVar, j00.c<? super g> cVar) {
        return aVar.i().b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k gz.a r5, @m80.k j00.c<java.lang.Object> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mw.a.b
            if (r0 == 0) goto L13
            r0 = r6
            mw.a$b r0 = (mw.a.b) r0
            int r1 = r0.f73738c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73738c = r1
            goto L18
        L13:
            mw.a$b r0 = new mw.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f73736a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f73738c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r6)
            r0.f73738c = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            kotlin.jvm.internal.g0.m(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.a.a(gz.a, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a0, code lost:
    
        if (r7 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k gz.a r6, @m80.k j00.c<java.lang.Object> r7) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.a.b(gz.a, j00.c):java.lang.Object");
    }

    public boolean d() {
        return this.f73735d;
    }

    @k
    public final lw.c e() {
        return this.f73732a;
    }

    @k
    public final xy.b getAttributes() {
        return h().getAttributes();
    }

    @Override // c40.r0
    @k
    public kotlin.coroutines.d getCoroutineContext() {
        return i().getCoroutineContext();
    }

    @k
    public final w h() {
        w wVar = this.f73733b;
        if (wVar != null) {
            return wVar;
        }
        g0.S(SocialConstants.TYPE_REQUEST);
        return null;
    }

    @k
    public final ex.c i() {
        ex.c cVar = this.f73734c;
        if (cVar != null) {
            return cVar;
        }
        g0.S("response");
        return null;
    }

    @l
    public Object l(@k j00.c<? super g> cVar) {
        return m(this, cVar);
    }

    public final void n(@k w wVar) {
        g0.p(wVar, "<set-?>");
        this.f73733b = wVar;
    }

    public final void o(@k w request) {
        g0.p(request, "request");
        n(request);
    }

    public final void p(@k ex.c cVar) {
        g0.p(cVar, "<set-?>");
        this.f73734c = cVar;
    }

    public final void r(@k ex.c response) {
        g0.p(response, "response");
        p(response);
    }

    @k
    public String toString() {
        return "HttpClientCall[" + h().getUrl() + j2.O + i().i() + l50.b.f69930l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @b0
    public a(@k lw.c client, @k z requestData, @k f0 responseData) {
        this(client);
        g0.p(client, "client");
        g0.p(requestData, "requestData");
        g0.p(responseData, "responseData");
        n(new cx.v(this, requestData));
        p(new ex.a(this, responseData));
        if (responseData.a() instanceof g) {
            return;
        }
        getAttributes().e(f73731g, responseData.a());
    }
}
