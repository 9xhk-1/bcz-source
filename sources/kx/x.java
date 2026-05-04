package kx;

import a00.h0;
import a00.r0;
import a00.w1;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import da0.v1;
import io.ktor.http.cio.ParserException;
import ix.e1;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpParser.kt\nio/ktor/http/cio/HttpParserKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1088#2,2:307\n1#3:309\n*S KotlinDebug\n*F\n+ 1 HttpParser.kt\nio/ktor/http/cio/HttpParserKt\n*L\n145#1:307,2\n*E\n"})
/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final int f69046a = 8192;

    /* renamed from: b, reason: collision with root package name */
    public static final int f69047b = 100;

    /* renamed from: c, reason: collision with root package name */
    public static final int f69048c = 999;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Set<Character> f69049d = w1.u('/', Character.valueOf(s60.d.f88057a), '#', '@');

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final lx.c<String> f69050e = lx.c.f71645b.c(h0.Q("HTTP/1.0", "HTTP/1.1"));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0}, l = {86}, m = "parseHeaders", n = {"builder"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f69051a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f69052b;

        /* renamed from: c, reason: collision with root package name */
        public int f69053c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f69052b = obj;
            this.f69053c |= Integer.MIN_VALUE;
            return x.i(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0, 0, 0, 0}, l = {101}, m = "parseHeaders", n = {"input", "builder", "range", "headers"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f69054a;

        /* renamed from: b, reason: collision with root package name */
        public Object f69055b;

        /* renamed from: c, reason: collision with root package name */
        public Object f69056c;

        /* renamed from: d, reason: collision with root package name */
        public Object f69057d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f69058e;

        /* renamed from: f, reason: collision with root package name */
        public int f69059f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f69058e = obj;
            this.f69059f |= Integer.MIN_VALUE;
            return x.j(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {30, 45}, m = "parseRequest", n = {"input", "builder", "range", "builder", "method", v1.a.f47590a, "version"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f69060a;

        /* renamed from: b, reason: collision with root package name */
        public Object f69061b;

        /* renamed from: c, reason: collision with root package name */
        public Object f69062c;

        /* renamed from: d, reason: collision with root package name */
        public Object f69063d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f69064e;

        /* renamed from: f, reason: collision with root package name */
        public int f69065f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f69064e = obj;
            this.f69065f |= Integer.MIN_VALUE;
            return x.o(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {63, 72}, m = "parseResponse", n = {"input", "builder", "range", "builder", "version", "statusText", HiAnalyticsConstant.HaKey.BI_KEY_RESULT}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f69066a;

        /* renamed from: b, reason: collision with root package name */
        public Object f69067b;

        /* renamed from: c, reason: collision with root package name */
        public Object f69068c;

        /* renamed from: d, reason: collision with root package name */
        public int f69069d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f69070e;

        /* renamed from: f, reason: collision with root package name */
        public int f69071f;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f69070e = obj;
            this.f69071f |= Integer.MIN_VALUE;
            return x.p(null, this);
        }
    }

    public static final Void c(CharSequence charSequence, char c11) {
        throw new ParserException("Character with code " + (c11 & 255) + " is not allowed in header names, \n" + ((Object) charSequence));
    }

    public static final boolean d(char c11) {
        return g0.t(c11, 32) <= 0 || k0.m3("\"(),/:;<=>?@[\\]{}", c11, false, 2, null);
    }

    public static final Void e(CharSequence charSequence, lx.j jVar) {
        throw new ParserException("No colon in HTTP header in " + charSequence.subSequence(jVar.b(), jVar.a()).toString() + " in builder: \n" + ((Object) charSequence));
    }

    public static final int f(@m80.k lx.d text, @m80.k lx.j range) {
        g0.p(text, "text");
        g0.p(range, "range");
        int a11 = range.a();
        for (int b11 = range.b(); b11 < a11; b11++) {
            char charAt = text.charAt(b11);
            if (charAt == ':' && b11 != range.b()) {
                range.d(b11 + 1);
                return b11;
            }
            if (d(charAt)) {
                g(text, b11, range.b(), charAt);
                throw new KotlinNothingValueException();
            }
        }
        e(text, range);
        throw new KotlinNothingValueException();
    }

    public static final Void g(lx.d dVar, int i11, int i12, char c11) {
        if (c11 == ':') {
            throw new ParserException("Empty header names are not allowed as per RFC7230.");
        }
        if (i11 == i12) {
            throw new ParserException("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
        }
        c(dVar, c11);
        throw new KotlinNothingValueException();
    }

    public static final void h(@m80.k lx.d text, @m80.k lx.j range) {
        g0.p(text, "text");
        g0.p(range, "range");
        int b11 = range.b();
        int a11 = range.a();
        int d11 = lx.k.d(text, b11, a11);
        if (d11 >= a11) {
            range.d(a11);
            return;
        }
        int i11 = d11;
        int i12 = i11;
        while (i11 < a11) {
            char charAt = text.charAt(i11);
            if (charAt != '\t') {
                if (charAt == '\n' || charAt == '\r') {
                    c(text, charAt);
                    throw new KotlinNothingValueException();
                }
                if (charAt != ' ') {
                    i12 = i11;
                }
            }
            i11++;
        }
        range.d(d11);
        range.c(i12 + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(@m80.k io.ktor.utils.io.g r7, @m80.k j00.c<? super kx.s> r8) {
        /*
            boolean r0 = r8 instanceof kx.x.a
            if (r0 == 0) goto L14
            r0 = r8
            kx.x$a r0 = (kx.x.a) r0
            int r1 = r0.f69053c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f69053c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            kx.x$a r0 = new kx.x$a
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f69052b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f69053c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.f69051a
            lx.d r7 = (lx.d) r7
            kotlin.e.n(r8)
            goto L51
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.e.n(r8)
            r8 = r2
            lx.d r2 = new lx.d
            r1 = 0
            r2.<init>(r1, r8, r1)
            r4.f69051a = r2
            r4.f69053c = r8
            r3 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            java.lang.Object r8 = k(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L50
            return r0
        L50:
            r7 = r2
        L51:
            kx.s r8 = (kx.s) r8
            if (r8 != 0) goto L5a
            kx.s r8 = new kx.s
            r8.<init>(r7)
        L5a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.x.i(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:14:0x0067, B:16:0x006f, B:19:0x0078, B:22:0x008c, B:33:0x00b3, B:34:0x00ba, B:35:0x00bb, B:37:0x00c7), top: B:13:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:14:0x0067, B:16:0x006f, B:19:0x0078, B:22:0x008c, B:33:0x00b3, B:34:0x00ba, B:35:0x00bb, B:37:0x00c7), top: B:13:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0065 -> B:13:0x0067). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(@m80.k io.ktor.utils.io.g r12, @m80.k lx.d r13, @m80.k lx.j r14, @m80.k j00.c<? super kx.s> r15) {
        /*
            boolean r0 = r15 instanceof kx.x.b
            if (r0 == 0) goto L13
            r0 = r15
            kx.x$b r0 = (kx.x.b) r0
            int r1 = r0.f69059f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69059f = r1
            goto L18
        L13:
            kx.x$b r0 = new kx.x$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f69058e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f69059f
            r3 = 8192(0x2000, float:1.14794E-41)
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 != r4) goto L44
            java.lang.Object r12 = r0.f69057d
            kx.s r12 = (kx.s) r12
            java.lang.Object r13 = r0.f69056c
            lx.j r13 = (lx.j) r13
            java.lang.Object r14 = r0.f69055b
            lx.d r14 = (lx.d) r14
            java.lang.Object r2 = r0.f69054a
            io.ktor.utils.io.g r2 = (io.ktor.utils.io.g) r2
            kotlin.e.n(r15)     // Catch: java.lang.Throwable -> L40
            r5 = r14
            r14 = r13
            r13 = r5
            r5 = r12
            r12 = r2
            goto L67
        L40:
            r0 = move-exception
            r13 = r0
            goto Lce
        L44:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L4c:
            kotlin.e.n(r15)
            kx.s r15 = new kx.s
            r15.<init>(r13)
        L54:
            r0.f69054a = r12     // Catch: java.lang.Throwable -> Lcb
            r0.f69055b = r13     // Catch: java.lang.Throwable -> Lcb
            r0.f69056c = r14     // Catch: java.lang.Throwable -> Lcb
            r0.f69057d = r15     // Catch: java.lang.Throwable -> Lcb
            r0.f69059f = r4     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r2 = io.ktor.utils.io.j.K(r12, r13, r3, r0)     // Catch: java.lang.Throwable -> Lcb
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r15
            r15 = r2
        L67:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Throwable -> L74
            boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> L74
            if (r15 != 0) goto L78
            r5.p()     // Catch: java.lang.Throwable -> L74
            r12 = 0
            return r12
        L74:
            r0 = move-exception
            r13 = r0
            r12 = r5
            goto Lce
        L78:
            int r15 = r13.length()     // Catch: java.lang.Throwable -> L74
            r14.c(r15)     // Catch: java.lang.Throwable -> L74
            int r15 = r14.a()     // Catch: java.lang.Throwable -> L74
            int r2 = r14.b()     // Catch: java.lang.Throwable -> L74
            int r15 = r15 - r2
            if (r15 == 0) goto Lbb
            if (r15 >= r3) goto Lb3
            int r8 = r14.b()     // Catch: java.lang.Throwable -> L74
            int r9 = f(r13, r14)     // Catch: java.lang.Throwable -> L74
            int r6 = lx.i.i(r13, r8, r9)     // Catch: java.lang.Throwable -> L74
            int r15 = r14.a()     // Catch: java.lang.Throwable -> L74
            h(r13, r14)     // Catch: java.lang.Throwable -> L74
            int r10 = r14.b()     // Catch: java.lang.Throwable -> L74
            int r11 = r14.a()     // Catch: java.lang.Throwable -> L74
            int r7 = lx.i.i(r13, r10, r11)     // Catch: java.lang.Throwable -> L74
            r14.d(r15)     // Catch: java.lang.Throwable -> L74
            r5.o(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L74
            r15 = r5
            goto L54
        Lb3:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.String r13 = "Header line length limit exceeded"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L74
            throw r12     // Catch: java.lang.Throwable -> L74
        Lbb:
            ix.y0 r12 = ix.y0.f63006a     // Catch: java.lang.Throwable -> L74
            java.lang.String r12 = r12.P()     // Catch: java.lang.Throwable -> L74
            java.lang.CharSequence r12 = r5.g(r12)     // Catch: java.lang.Throwable -> L74
            if (r12 == 0) goto Lca
            w(r12)     // Catch: java.lang.Throwable -> L74
        Lca:
            return r5
        Lcb:
            r0 = move-exception
            r13 = r0
            r12 = r15
        Lce:
            r12.p()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.x.j(io.ktor.utils.io.g, lx.d, lx.j, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object k(io.ktor.utils.io.g gVar, lx.d dVar, lx.j jVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            jVar = new lx.j(0, 0);
        }
        return j(gVar, dVar, jVar, cVar);
    }

    public static final e1 l(CharSequence charSequence, lx.j jVar) {
        lx.k.c(charSequence, jVar);
        e1 e1Var = (e1) r0.p5(lx.c.c(lx.i.g(), charSequence, jVar.b(), jVar.a(), false, new x00.p() { // from class: kx.v
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                boolean m11;
                m11 = x.m(((Character) obj).charValue(), ((Integer) obj2).intValue());
                return Boolean.valueOf(m11);
            }
        }, 8, null));
        if (e1Var == null) {
            return n(charSequence, jVar);
        }
        jVar.d(jVar.b() + e1Var.l().length());
        return e1Var;
    }

    public static final boolean m(char c11, int i11) {
        return c11 == ' ';
    }

    public static final e1 n(CharSequence charSequence, lx.j jVar) {
        return new e1(lx.k.b(charSequence, jVar).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e7 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #2 {all -> 0x00ed, blocks: (B:16:0x00e1, B:20:0x00e7), top: B:15:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:12:0x0039, B:33:0x008b, B:36:0x0094, B:38:0x00a5, B:40:0x00be, B:42:0x00c4, B:44:0x00ca, B:48:0x00f0, B:49:0x00f7, B:50:0x00f8, B:51:0x00ff, B:52:0x0100, B:53:0x0126, B:55:0x0077), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kx.x$c] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0088 -> B:33:0x008b). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(@m80.k io.ktor.utils.io.g r14, @m80.k j00.c<? super kx.b0> r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.x.o(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ce A[Catch: all -> 0x00d5, TryCatch #1 {all -> 0x00d5, blocks: (B:15:0x00ca, B:17:0x00ce, B:19:0x00d9), top: B:14:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:34:0x0059, B:35:0x0086, B:38:0x008f), top: B:33:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(@m80.k io.ktor.utils.io.g r14, @m80.k j00.c<? super kx.f0> r15) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.x.p(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        throw new java.lang.NumberFormatException("Illegal digit " + r4 + " in status code " + r6.subSequence(r7.b(), lx.k.a(r6, r7)).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int q(java.lang.CharSequence r6, lx.j r7) {
        /*
            lx.k.c(r6, r7)
            int r0 = r7.a()
            int r1 = r7.b()
            int r2 = r7.a()
            r3 = 0
        L10:
            if (r1 >= r2) goto L7d
            char r4 = r6.charAt(r1)
            r5 = 32
            if (r4 != r5) goto L3e
            boolean r6 = u(r3)
            if (r6 != 0) goto L22
            r0 = r1
            goto L7d
        L22:
            io.ktor.http.cio.ParserException r6 = new io.ktor.http.cio.ParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Status-code must be 3-digit. Status received: "
            r7.append(r0)
            r7.append(r3)
            r0 = 46
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L3e:
            r5 = 48
            if (r5 > r4) goto L4e
            r5 = 58
            if (r4 >= r5) goto L4e
            int r3 = r3 * 10
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L10
        L4e:
            int r0 = r7.b()
            int r7 = lx.k.a(r6, r7)
            java.lang.CharSequence r6 = r6.subSequence(r0, r7)
            java.lang.String r6 = r6.toString()
            java.lang.NumberFormatException r7 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Illegal digit "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " in status code "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L7d:
            r7.d(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.x.q(java.lang.CharSequence, lx.j):int");
    }

    public static final CharSequence r(CharSequence charSequence, lx.j jVar) {
        lx.k.c(charSequence, jVar);
        int b11 = jVar.b();
        int a11 = lx.k.a(charSequence, jVar);
        int i11 = a11 - b11;
        if (i11 <= 0) {
            return "";
        }
        if (i11 == 1 && charSequence.charAt(b11) == '/') {
            jVar.d(a11);
            return "/";
        }
        CharSequence subSequence = charSequence.subSequence(b11, a11);
        jVar.d(a11);
        return subSequence;
    }

    public static final CharSequence s(CharSequence charSequence, lx.j jVar) {
        lx.k.c(charSequence, jVar);
        if (jVar.b() >= jVar.a()) {
            throw new IllegalStateException(("Failed to parse version: " + ((Object) charSequence)).toString());
        }
        String str = (String) r0.p5(lx.c.c(f69050e, charSequence, jVar.b(), jVar.a(), false, new x00.p() { // from class: kx.w
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                boolean t11;
                t11 = x.t(((Character) obj).charValue(), ((Integer) obj2).intValue());
                return Boolean.valueOf(t11);
            }
        }, 8, null));
        if (str != null) {
            jVar.d(jVar.b() + str.length());
            return str;
        }
        v(lx.k.b(charSequence, jVar));
        throw new KotlinNothingValueException();
    }

    public static final boolean t(char c11, int i11) {
        return c11 == ' ';
    }

    public static final boolean u(int i11) {
        return i11 < 100 || i11 > 999;
    }

    public static final Void v(CharSequence charSequence) {
        throw new ParserException("Unsupported HTTP version: " + ((Object) charSequence));
    }

    public static final void w(CharSequence charSequence) {
        if (k0.t3(charSequence, ":", false, 2, null)) {
            throw new ParserException("Host header with ':' should contains port: " + ((Object) charSequence));
        }
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            Set<Character> set = f69049d;
            if (set.contains(Character.valueOf(charAt))) {
                throw new ParserException("Host cannot contain any of the following symbols: " + set);
            }
        }
    }
}
