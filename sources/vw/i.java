package vw;

import a00.r0;
import ix.c0;
import ix.n;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpCookies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookiesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Logger f94335a = ez.a.a("io.ktor.client.plugins.HttpCookies");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {136}, m = "cookies", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f94336a;

        /* renamed from: b, reason: collision with root package name */
        public int f94337b;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f94336a = obj;
            this.f94337b |= Integer.MIN_VALUE;
            return i.c(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {142}, m = "cookies", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f94338a;

        /* renamed from: b, reason: collision with root package name */
        public int f94339b;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f94338a = obj;
            this.f94339b |= Integer.MIN_VALUE;
            return i.d(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class c extends FunctionReferenceImpl implements x00.l<n, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f94340a = new c();

        public c() {
            super(1, c0.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(n p02) {
            g0.p(p02, "p0");
            return c0.q(p02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@m80.k lw.c r4, @m80.k ix.t2 r5, @m80.k j00.c<? super java.util.List<ix.n>> r6) {
        /*
            boolean r0 = r6 instanceof vw.i.a
            if (r0 == 0) goto L13
            r0 = r6
            vw.i$a r0 = (vw.i.a) r0
            int r1 = r0.f94337b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94337b = r1
            goto L18
        L13:
            vw.i$a r0 = new vw.i$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f94336a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94337b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r6)
            vw.h$a r6 = vw.h.f94294d
            java.lang.Object r4 = rw.z.c(r4, r6)
            vw.h r4 = (vw.h) r4
            if (r4 == 0) goto L4d
            r0.f94337b = r3
            java.lang.Object r6 = r4.e7(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L4c
            goto L4d
        L4c:
            return r6
        L4d:
            java.util.List r4 = a00.h0.J()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.i.c(lw.c, ix.t2, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@m80.k lw.c r4, @m80.k java.lang.String r5, @m80.k j00.c<? super java.util.List<ix.n>> r6) {
        /*
            boolean r0 = r6 instanceof vw.i.b
            if (r0 == 0) goto L13
            r0 = r6
            vw.i$b r0 = (vw.i.b) r0
            int r1 = r0.f94339b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94339b = r1
            goto L18
        L13:
            vw.i$b r0 = new vw.i$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f94338a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94339b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r6)
            vw.h$a r6 = vw.h.f94294d
            java.lang.Object r4 = rw.z.c(r4, r6)
            vw.h r4 = (vw.h) r4
            if (r4 == 0) goto L51
            ix.t2 r5 = ix.l2.f(r5)
            r0.f94339b = r3
            java.lang.Object r6 = r4.e7(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L50
            goto L51
        L50:
            return r6
        L51:
            java.util.List r4 = a00.h0.J()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.i.d(lw.c, java.lang.String, j00.c):java.lang.Object");
    }

    @l
    public static final n e(@k List<n> list, @k String name) {
        Object obj;
        g0.p(list, "<this>");
        g0.p(name, "name");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (g0.g(((n) obj).t(), name)) {
                break;
            }
        }
        return (n) obj;
    }

    public static final String f(List<n> list) {
        return r0.r3(list, "; ", null, null, 0, null, c.f94340a, 30, null);
    }
}
