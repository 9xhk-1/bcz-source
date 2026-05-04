package xw;

import a00.r0;
import io.ktor.client.plugins.logging.LogLevel;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import y40.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLoggingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggingUtils.kt\nio/ktor/client/plugins/logging/LoggingUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n49#1,5:75\n1053#2:70\n1863#2:71\n295#2,2:72\n1864#2:74\n*S KotlinDebug\n*F\n+ 1 LoggingUtils.kt\nio/ktor/client/plugins/logging/LoggingUtilsKt\n*L\n64#1:75,5\n17#1:70\n19#1:71\n20#1:72,2\n19#1:74\n*E\n"})
/* loaded from: classes8.dex */
public final class n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LoggingUtils.kt\nio/ktor/client/plugins/logging/LoggingUtilsKt\n*L\n1#1,102:1\n17#2:103\n*E\n"})
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l((String) ((Map.Entry) t11).getKey(), (String) ((Map.Entry) t12).getKey());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.LoggingUtilsKt", f = "LoggingUtils.kt", i = {0, 0}, l = {71}, m = "logResponseBody", n = {"$this$logResponseBody_u24lambda_u244", "charset$iv"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f98446a;

        /* renamed from: b, reason: collision with root package name */
        public Object f98447b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f98448c;

        /* renamed from: d, reason: collision with root package name */
        public int f98449d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f98448c = obj;
            this.f98449d |= Integer.MIN_VALUE;
            return n.c(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.LoggingUtilsKt", f = "LoggingUtils.kt", i = {0}, l = {50}, m = "tryReadText", n = {"charset"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f98450a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f98451b;

        /* renamed from: c, reason: collision with root package name */
        public int f98452c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f98451b = obj;
            this.f98452c |= Integer.MIN_VALUE;
            return n.e(null, null, this);
        }
    }

    public static final void a(@m80.k Appendable appendable, @m80.k String key, @m80.k String value) {
        g0.p(appendable, "<this>");
        g0.p(key, "key");
        g0.p(value, "value");
        Appendable append = appendable.append("-> " + key + ": " + value);
        g0.o(append, "append(...)");
        g0.o(append.append('\n'), "append(...)");
    }

    public static final void b(@m80.k Appendable appendable, @m80.k Set<? extends Map.Entry<String, ? extends List<String>>> headers, @m80.k List<s> sanitizedHeaders) {
        Object obj;
        g0.p(appendable, "<this>");
        g0.p(headers, "headers");
        g0.p(sanitizedHeaders, "sanitizedHeaders");
        for (Map.Entry entry : r0.z5(r0.a6(headers), new a())) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Iterator<T> it = sanitizedHeaders.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((s) obj).b().invoke(str).booleanValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            s sVar = (s) obj;
            String a11 = sVar != null ? sVar.a() : null;
            if (a11 == null) {
                a11 = r0.r3(list, "; ", null, null, 0, null, null, 62, null);
            }
            a(appendable, str, a11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@m80.k java.lang.StringBuilder r8, @m80.l ix.k r9, @m80.k io.ktor.utils.io.g r10, @m80.k j00.c<? super yz.g2> r11) {
        /*
            boolean r0 = r11 instanceof xw.n.b
            if (r0 == 0) goto L13
            r0 = r11
            xw.n$b r0 = (xw.n.b) r0
            int r1 = r0.f98449d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98449d = r1
            goto L18
        L13:
            xw.n$b r0 = new xw.n$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f98448c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f98449d
            r3 = 0
            r4 = 1
            r5 = 10
            java.lang.String r6 = "append(...)"
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r8 = r0.f98447b
            java.nio.charset.Charset r8 = (java.nio.charset.Charset) r8
            java.lang.Object r9 = r0.f98446a
            java.lang.StringBuilder r9 = (java.lang.StringBuilder) r9
            kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L36
            goto L88
        L36:
            r8 = r9
            goto L91
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            kotlin.e.n(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "BODY Content-Type: "
            r11.append(r2)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r8.append(r11)
            kotlin.jvm.internal.g0.o(r8, r6)
            r8.append(r5)
            kotlin.jvm.internal.g0.o(r8, r6)
            java.lang.String r11 = "BODY START"
            r8.append(r11)
            kotlin.jvm.internal.g0.o(r8, r6)
            r8.append(r5)
            kotlin.jvm.internal.g0.o(r8, r6)
            if (r9 == 0) goto L76
            java.nio.charset.Charset r9 = ix.m.a(r9)
            if (r9 != 0) goto L78
        L76:
            java.nio.charset.Charset r9 = u30.d.f91599b
        L78:
            r0.f98446a = r8     // Catch: java.lang.Throwable -> L91
            r0.f98447b = r9     // Catch: java.lang.Throwable -> L91
            r0.f98449d = r4     // Catch: java.lang.Throwable -> L91
            java.lang.Object r11 = io.ktor.utils.io.j.G(r10, r0)     // Catch: java.lang.Throwable -> L91
            if (r11 != r1) goto L85
            return r1
        L85:
            r7 = r9
            r9 = r8
            r8 = r7
        L88:
            y40.c0 r11 = (y40.c0) r11     // Catch: java.lang.Throwable -> L36
            r10 = 0
            r0 = 2
            java.lang.String r3 = jz.s.g(r11, r8, r10, r0, r3)     // Catch: java.lang.Throwable -> L36
            goto L92
        L91:
            r9 = r8
        L92:
            if (r3 != 0) goto L96
            java.lang.String r3 = "[response body omitted]"
        L96:
            r9.append(r3)
            kotlin.jvm.internal.g0.o(r9, r6)
            r9.append(r5)
            kotlin.jvm.internal.g0.o(r9, r6)
            java.lang.String r8 = "BODY END"
            r9.append(r8)
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xw.n.c(java.lang.StringBuilder, ix.k, io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    public static final void d(@m80.k StringBuilder log, @m80.k ex.c response, @m80.k LogLevel level, @m80.k List<s> sanitizedHeaders) {
        g0.p(log, "log");
        g0.p(response, "response");
        g0.p(level, "level");
        g0.p(sanitizedHeaders, "sanitizedHeaders");
        if (level.getInfo()) {
            log.append("RESPONSE: " + response.i());
            g0.o(log, "append(...)");
            log.append('\n');
            g0.o(log, "append(...)");
            log.append("METHOD: " + response.c().h().getMethod());
            g0.o(log, "append(...)");
            log.append('\n');
            g0.o(log, "append(...)");
            log.append("FROM: " + response.c().h().getUrl());
            g0.o(log, "append(...)");
            log.append('\n');
            g0.o(log, "append(...)");
        }
        if (level.getHeaders()) {
            log.append("COMMON HEADERS");
            g0.o(log, "append(...)");
            log.append('\n');
            g0.o(log, "append(...)");
            b(log, response.a().entries(), sanitizedHeaders);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@m80.k io.ktor.utils.io.g r5, @m80.k java.nio.charset.Charset r6, @m80.k j00.c<? super java.lang.String> r7) {
        /*
            boolean r0 = r7 instanceof xw.n.c
            if (r0 == 0) goto L13
            r0 = r7
            xw.n$c r0 = (xw.n.c) r0
            int r1 = r0.f98452c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98452c = r1
            goto L18
        L13:
            xw.n$c r0 = new xw.n$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f98451b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f98452c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r5 = r0.f98450a
            r6 = r5
            java.nio.charset.Charset r6 = (java.nio.charset.Charset) r6
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L4e
            goto L45
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.e.n(r7)
            r0.f98450a = r6     // Catch: java.lang.Throwable -> L4e
            r0.f98452c = r4     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r7 = io.ktor.utils.io.j.G(r5, r0)     // Catch: java.lang.Throwable -> L4e
            if (r7 != r1) goto L45
            return r1
        L45:
            y40.c0 r7 = (y40.c0) r7     // Catch: java.lang.Throwable -> L4e
            r5 = 0
            r0 = 2
            java.lang.String r5 = jz.s.g(r7, r6, r5, r0, r3)     // Catch: java.lang.Throwable -> L4e
            return r5
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xw.n.e(io.ktor.utils.io.g, java.nio.charset.Charset, j00.c):java.lang.Object");
    }

    public static final Object f(io.ktor.utils.io.g gVar, Charset charset, j00.c<? super String> cVar) {
        try {
            d0.e(0);
            Object G = io.ktor.utils.io.j.G(gVar, cVar);
            d0.e(1);
            return jz.s.g((c0) G, charset, 0, 2, null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
