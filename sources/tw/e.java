package tw;

import a00.l1;
import com.huawei.hms.framework.common.ContainerUtils;
import cx.y;
import io.ktor.client.plugins.cache.ValidateStatus;
import ix.d1;
import ix.m0;
import ix.q0;
import ix.r0;
import ix.x0;
import ix.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.e0;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpCacheEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1755#2,3:143\n295#2,2:146\n295#2,2:148\n295#2,2:151\n1#3:150\n*S KotlinDebug\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntryKt\n*L\n68#1:143,3\n70#1:146,2\n105#1:148,2\n127#1:151,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.HttpCacheEntryKt", f = "HttpCacheEntry.kt", i = {0, 0}, l = {18}, m = "HttpCacheEntry", n = {"response", "isShared"}, s = {"L$0", "Z$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f91042a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91043b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f91044c;

        /* renamed from: d, reason: collision with root package name */
        public int f91045d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f91044c = obj;
            this.f91045d |= Integer.MIN_VALUE;
            return e.b(false, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(boolean r4, @m80.k ex.c r5, @m80.k j00.c<? super tw.c> r6) {
        /*
            boolean r0 = r6 instanceof tw.e.a
            if (r0 == 0) goto L13
            r0 = r6
            tw.e$a r0 = (tw.e.a) r0
            int r1 = r0.f91045d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91045d = r1
            goto L18
        L13:
            tw.e$a r0 = new tw.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f91044c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91045d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r4 = r0.f91042a
            java.lang.Object r5 = r0.f91043b
            ex.c r5 = (ex.c) r5
            kotlin.e.n(r6)
            goto L4b
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.e.n(r6)
            io.ktor.utils.io.g r6 = r5.b()
            r0.f91043b = r5
            r0.f91042a = r4
            r0.f91045d = r3
            java.lang.Object r6 = io.ktor.utils.io.j.G(r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            y40.c0 r6 = (y40.c0) r6
            byte[] r6 = y40.g0.c(r6)
            tw.c r0 = new tw.c
            r1 = 2
            r2 = 0
            bz.b r4 = d(r5, r4, r2, r1, r2)
            java.util.Map r1 = g(r5)
            r0.<init>(r4, r1, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tw.e.b(boolean, ex.c, j00.c):java.lang.Object");
    }

    @k
    public static final bz.b c(@k ex.c cVar, boolean z11, @k x00.a<bz.b> fallback) {
        String str;
        Object obj;
        String g11;
        List o52;
        String str2;
        g0.p(cVar, "<this>");
        g0.p(fallback, "fallback");
        List<m0> a11 = d1.a(cVar);
        Long l11 = null;
        if (z11) {
            List<m0> list = a11;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String g12 = ((m0) it.next()).g();
                    str = fx.d.f52406m;
                    if (f0.J2(g12, fx.d.f52406m, false, 2, null)) {
                        break;
                    }
                }
            }
        }
        str = fx.d.f52395b;
        Iterator<T> it2 = a11.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (f0.J2(((m0) obj).g(), str, false, 2, null)) {
                break;
            }
        }
        m0 m0Var = (m0) obj;
        if (m0Var != null && (g11 = m0Var.g()) != null && (o52 = k0.o5(g11, new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, null)) != null && (str2 = (String) o52.get(1)) != null) {
            l11 = e0.r1(str2);
        }
        if (l11 != null) {
            return bz.a.c(cVar.e(), l11.longValue() * 1000);
        }
        String str3 = cVar.a().get(y0.f63006a.L());
        if (str3 == null) {
            return fallback.invoke();
        }
        if (g0.g(str3, "0") || k0.O3(str3)) {
            return fallback.invoke();
        }
        try {
            return ix.e0.b(str3);
        } catch (Throwable unused) {
            return fallback.invoke();
        }
    }

    public static /* synthetic */ bz.b d(ex.c cVar, boolean z11, x00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = new x00.a() { // from class: tw.d
                @Override // x00.a
                public final Object invoke() {
                    bz.b e11;
                    e11 = e.e();
                    return e11;
                }
            };
        }
        return c(cVar, z11, aVar);
    }

    public static final bz.b e() {
        return io.ktor.util.date.a.c(null, 1, null);
    }

    @k
    public static final ValidateStatus f(@k bz.b cacheExpires, @k q0 responseHeaders, @k y request) {
        int i11;
        Object obj;
        Integer num;
        String g11;
        Integer p12;
        String g12;
        List o52;
        String str;
        g0.p(cacheExpires, "cacheExpires");
        g0.p(responseHeaders, "responseHeaders");
        g0.p(request, "request");
        r0 a11 = request.a();
        y0 y0Var = y0.f63006a;
        List<String> a12 = responseHeaders.a(y0Var.u());
        Object obj2 = null;
        List<m0> f11 = x0.f(a12 != null ? a00.r0.r3(a12, ",", null, null, 0, null, null, 62, null) : null);
        List<String> a13 = a11.a(y0Var.u());
        List<m0> f12 = x0.f(a13 != null ? a00.r0.r3(a13, ",", null, null, 0, null, null, 62, null) : null);
        if (f12.contains(tw.a.f90988a.b())) {
            g.d().trace("\"no-cache\" is set for " + request.j() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        List<m0> list = f12;
        Iterator<T> it = list.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (f0.J2(((m0) obj).g(), "max-age=", false, 2, null)) {
                break;
            }
        }
        m0 m0Var = (m0) obj;
        if (m0Var == null || (g12 = m0Var.g()) == null || (o52 = k0.o5(g12, new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, null)) == null || (str = (String) o52.get(1)) == null) {
            num = null;
        } else {
            Integer p13 = e0.p1(str);
            num = Integer.valueOf(p13 != null ? p13.intValue() : 0);
        }
        if (num != null && num.intValue() == 0) {
            g.d().trace("\"max-age\" is not set for " + request.j() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        tw.a aVar = tw.a.f90988a;
        if (f11.contains(aVar.b())) {
            g.d().trace("\"no-cache\" is set for " + request.j() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        long z11 = cacheExpires.z() - io.ktor.util.date.a.d();
        if (z11 > 0) {
            g.d().trace("Cached response is valid for " + request.j() + ", should not validate");
            return ValidateStatus.ShouldNotValidate;
        }
        if (f11.contains(aVar.a())) {
            g.d().trace("\"must-revalidate\" is set for " + request.j() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (f0.J2(((m0) next).g(), "max-stale=", false, 2, null)) {
                obj2 = next;
                break;
            }
        }
        m0 m0Var2 = (m0) obj2;
        if (m0Var2 != null && (g11 = m0Var2.g()) != null) {
            String substring = g11.substring(10);
            g0.o(substring, "substring(...)");
            if (substring != null && (p12 = e0.p1(substring)) != null) {
                i11 = p12.intValue();
            }
        }
        if (z11 + (i11 * 1000) > 0) {
            g.d().trace("Cached response is stale for " + request.j() + " but less than max-stale, should warn");
            return ValidateStatus.ShouldWarn;
        }
        g.d().trace("Cached response is stale for " + request.j() + ", should validate cached response");
        return ValidateStatus.ShouldValidate;
    }

    @k
    public static final Map<String, String> g(@k ex.c cVar) {
        g0.p(cVar, "<this>");
        List<String> q11 = d1.q(cVar);
        if (q11 == null) {
            return l1.z();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        q0 a11 = cVar.c().h().a();
        for (String str : q11) {
            String str2 = a11.get(str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put(str, str2);
        }
        return linkedHashMap;
    }
}
