package py;

import androidx.exifinterface.media.ExifInterface;
import com.jiongji.andriod.card.R;
import h10.r;
import io.ktor.http.BadContentTypeFormatException;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.server.plugins.CannotTransformContentToTypeException;
import ix.p1;
import ix.y0;
import java.nio.charset.Charset;
import jz.s;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.l;
import y40.c0;
import yz.n;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nApplicationReceiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationReceiveFunctions.kt\nio/ktor/server/request/ApplicationReceiveFunctionsKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n*L\n1#1,226:1\n159#1:291\n72#1:292\n73#1:309\n159#1:310\n72#1,2:311\n72#1:313\n73#1:330\n72#1,2:331\n72#1:333\n73#1:350\n72#1,2:351\n72#1:353\n73#1:370\n72#1,2:371\n58#2,16:227\n58#2,16:243\n58#2,16:259\n58#2,16:275\n58#2,16:293\n58#2,16:314\n58#2,16:334\n58#2,16:354\n58#2,16:374\n58#2,16:391\n18#3:373\n18#3:390\n*S KotlinDebug\n*F\n+ 1 ApplicationReceiveFunctions.kt\nio/ktor/server/request/ApplicationReceiveFunctionsKt\n*L\n151#1:291\n151#1:292\n151#1:309\n151#1:310\n151#1:311,2\n159#1:313\n159#1:330\n159#1:331,2\n194#1:333\n194#1:350\n194#1:351,2\n202#1:353\n202#1:370\n202#1:371,2\n65#1:227,16\n72#1:243,16\n73#1:259,16\n80#1:275,16\n151#1:293,16\n159#1:314,16\n194#1:334,16\n202#1:354,16\n20#1:374,16\n217#1:391,16\n20#1:373\n217#1:390\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<Long> f81302a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f81303b = 52428800;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final xy.a<py.f> f81304c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", i = {}, l = {90}, m = "receive", n = {}, s = {})
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f81305a;

        /* renamed from: b, reason: collision with root package name */
        public int f81306b;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81305a = obj;
            this.f81306b |= Integer.MIN_VALUE;
            return b.e(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", i = {}, l = {100}, m = "receive", n = {}, s = {})
    /* renamed from: py.b$b, reason: collision with other inner class name */
    public static final class C0997b<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f81307a;

        /* renamed from: b, reason: collision with root package name */
        public int f81308b;

        public C0997b(j00.c<? super C0997b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81307a = obj;
            this.f81308b |= Integer.MIN_VALUE;
            return b.d(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", i = {}, l = {R.styleable.Theme_drawable_syncview}, m = "receiveChannel", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f81309a;

        /* renamed from: b, reason: collision with root package name */
        public int f81310b;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81309a = obj;
            this.f81310b |= Integer.MIN_VALUE;
            return b.g(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", i = {}, l = {R.styleable.Theme_drawable_syncview}, m = "receiveMultipart", n = {}, s = {})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f81311a;

        /* renamed from: b, reason: collision with root package name */
        public int f81312b;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81311a = obj;
            this.f81312b |= Integer.MIN_VALUE;
            return b.i(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", i = {0}, l = {115}, m = "receiveOrNull", n = {"$this$receiveOrNull"}, s = {"L$0"})
    public static final class e<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81313a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f81314b;

        /* renamed from: c, reason: collision with root package name */
        public int f81315c;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81314b = obj;
            this.f81315c |= Integer.MIN_VALUE;
            return b.m(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", i = {0}, l = {134}, m = "receiveOrNull", n = {"$this$receiveOrNull"}, s = {"L$0"})
    public static final class f<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81316a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f81317b;

        /* renamed from: c, reason: collision with root package name */
        public int f81318c;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81317b = obj;
            this.f81318c |= Integer.MIN_VALUE;
            return b.n(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", i = {}, l = {R.styleable.Theme_drawable_syncview}, m = "receiveParameters", n = {}, s = {})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f81319a;

        /* renamed from: b, reason: collision with root package name */
        public int f81320b;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81319a = obj;
            this.f81320b |= Integer.MIN_VALUE;
            return b.p(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", i = {0, 1}, l = {R.styleable.Theme_drawable_syncview_error, 151}, m = "receiveText", n = {"charset", "charset"}, s = {"L$0", "L$0"})
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81321a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f81322b;

        /* renamed from: c, reason: collision with root package name */
        public int f81323c;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81322b = obj;
            this.f81323c |= Integer.MIN_VALUE;
            return b.r(null, this);
        }
    }

    static {
        r rVar;
        h10.d d11 = o0.d(Long.class);
        r rVar2 = null;
        try {
            rVar = o0.B(Long.TYPE);
        } catch (Throwable unused) {
            rVar = null;
        }
        f81302a = new xy.a<>("FormFieldLimit", new gz.a(d11, rVar));
        h10.d d12 = o0.d(py.f.class);
        try {
            rVar2 = o0.B(py.f.class);
        } catch (Throwable unused2) {
        }
        f81304c = new xy.a<>("DoubleReceivePreventionToken", new gz.a(d12, rVar2));
    }

    @m80.k
    public static final xy.a<py.f> b() {
        return f81304c;
    }

    public static final long c(@m80.k zx.b bVar) {
        g0.p(bVar, "<this>");
        Long l11 = (Long) bVar.getAttributes().a(f81302a);
        return l11 != null ? l11.longValue() : f81303b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(@m80.k zx.b r4, @m80.k gz.a r5, @m80.k j00.c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof py.b.C0997b
            if (r0 == 0) goto L13
            r0 = r6
            py.b$b r0 = (py.b.C0997b) r0
            int r1 = r0.f81308b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81308b = r1
            goto L18
        L13:
            py.b$b r0 = new py.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f81307a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81308b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r6)
            r0.f81308b = r3
            java.lang.Object r6 = r4.L(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            kotlin.jvm.internal.g0.m(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: py.b.d(zx.b, gz.a, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(@m80.k zx.b r4, @m80.k h10.d<T> r5, @m80.k j00.c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof py.b.a
            if (r0 == 0) goto L13
            r0 = r6
            py.b$a r0 = (py.b.a) r0
            int r1 = r0.f81306b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81306b = r1
            goto L18
        L13:
            py.b$a r0 = new py.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f81305a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81306b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r6)
            h10.r r6 = dy.a.a(r5)
            gz.a r2 = new gz.a
            r2.<init>(r5, r6)
            r0.f81306b = r3
            java.lang.Object r6 = r4.L(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.jvm.internal.g0.m(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: py.b.e(zx.b, h10.d, j00.c):java.lang.Object");
    }

    public static final /* synthetic */ <T> Object f(zx.b bVar, j00.c<? super T> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        Object L = bVar.L(aVar, cVar);
        d0.e(1);
        if (L != null) {
            return L;
        }
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d12 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused2) {
        }
        r a11 = new gz.a(d12, null).a();
        g0.m(a11);
        throw new CannotTransformContentToTypeException(a11);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@m80.k zx.b r7, @m80.k j00.c<? super io.ktor.utils.io.g> r8) {
        /*
            boolean r0 = r8 instanceof py.b.c
            if (r0 == 0) goto L13
            r0 = r8
            py.b$c r0 = (py.b.c) r0
            int r1 = r0.f81310b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81310b = r1
            goto L18
        L13:
            py.b$c r0 = new py.b$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f81309a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81310b
            r3 = 0
            r4 = 1
            java.lang.Class<io.ktor.utils.io.g> r5 = io.ktor.utils.io.g.class
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.e.n(r8)
            goto L4f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.e.n(r8)
            h10.d r8 = kotlin.jvm.internal.o0.d(r5)
            h10.r r2 = kotlin.jvm.internal.o0.B(r5)     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
            r2 = r3
        L41:
            gz.a r6 = new gz.a
            r6.<init>(r8, r2)
            r0.f81310b = r4
            java.lang.Object r8 = r7.L(r6, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            if (r8 == 0) goto L52
            return r8
        L52:
            h10.d r7 = kotlin.jvm.internal.o0.d(r5)
            h10.r r3 = kotlin.jvm.internal.o0.B(r5)     // Catch: java.lang.Throwable -> L5a
        L5a:
            gz.a r8 = new gz.a
            r8.<init>(r7, r3)
            h10.r r7 = r8.a()
            kotlin.jvm.internal.g0.m(r7)
            io.ktor.server.plugins.CannotTransformContentToTypeException r8 = new io.ktor.server.plugins.CannotTransformContentToTypeException
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: py.b.g(zx.b, j00.c):java.lang.Object");
    }

    public static final Object h(zx.b bVar, j00.c<? super io.ktor.utils.io.g> cVar) {
        r rVar;
        h10.d d11 = o0.d(io.ktor.utils.io.g.class);
        r rVar2 = null;
        try {
            rVar = o0.B(io.ktor.utils.io.g.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        gz.a aVar = new gz.a(d11, rVar);
        d0.e(0);
        Object L = bVar.L(aVar, cVar);
        d0.e(1);
        if (L != null) {
            return L;
        }
        h10.d d12 = o0.d(io.ktor.utils.io.g.class);
        try {
            rVar2 = o0.B(io.ktor.utils.io.g.class);
        } catch (Throwable unused2) {
        }
        r a11 = new gz.a(d12, rVar2).a();
        g0.m(a11);
        throw new CannotTransformContentToTypeException(a11);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(@m80.k zx.b r6, long r7, @m80.k j00.c<? super mx.r> r9) {
        /*
            boolean r0 = r9 instanceof py.b.d
            if (r0 == 0) goto L13
            r0 = r9
            py.b$d r0 = (py.b.d) r0
            int r1 = r0.f81312b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81312b = r1
            goto L18
        L13:
            py.b$d r0 = new py.b$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f81311a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81312b
            r3 = 0
            r4 = 1
            java.lang.Class<mx.r> r5 = mx.r.class
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.e.n(r9)
            goto L52
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.e.n(r9)
            t(r6, r7)
            h10.d r7 = kotlin.jvm.internal.o0.d(r5)
            h10.r r8 = kotlin.jvm.internal.o0.B(r5)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r8 = r3
        L44:
            gz.a r9 = new gz.a
            r9.<init>(r7, r8)
            r0.f81312b = r4
            java.lang.Object r9 = r6.L(r9, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            if (r9 == 0) goto L55
            return r9
        L55:
            h10.d r6 = kotlin.jvm.internal.o0.d(r5)
            h10.r r3 = kotlin.jvm.internal.o0.B(r5)     // Catch: java.lang.Throwable -> L5d
        L5d:
            gz.a r7 = new gz.a
            r7.<init>(r6, r3)
            h10.r r6 = r7.a()
            kotlin.jvm.internal.g0.m(r6)
            io.ktor.server.plugins.CannotTransformContentToTypeException r7 = new io.ktor.server.plugins.CannotTransformContentToTypeException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: py.b.i(zx.b, long, j00.c):java.lang.Object");
    }

    public static final Object j(zx.b bVar, long j11, j00.c<? super mx.r> cVar) {
        r rVar;
        t(bVar, j11);
        h10.d d11 = o0.d(mx.r.class);
        r rVar2 = null;
        try {
            rVar = o0.B(mx.r.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        gz.a aVar = new gz.a(d11, rVar);
        d0.e(0);
        Object L = bVar.L(aVar, cVar);
        d0.e(1);
        if (L != null) {
            return L;
        }
        h10.d d12 = o0.d(mx.r.class);
        try {
            rVar2 = o0.B(mx.r.class);
        } catch (Throwable unused2) {
        }
        r a11 = new gz.a(d12, rVar2).a();
        g0.m(a11);
        throw new CannotTransformContentToTypeException(a11);
    }

    public static /* synthetic */ Object k(zx.b bVar, long j11, j00.c cVar, int i11, Object obj) {
        r rVar;
        if ((i11 & 1) != 0) {
            j11 = f81303b;
        }
        t(bVar, j11);
        h10.d d11 = o0.d(mx.r.class);
        r rVar2 = null;
        try {
            rVar = o0.B(mx.r.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        gz.a aVar = new gz.a(d11, rVar);
        d0.e(0);
        Object L = bVar.L(aVar, cVar);
        d0.e(1);
        if (L != null) {
            return L;
        }
        h10.d d12 = o0.d(mx.r.class);
        try {
            rVar2 = o0.B(mx.r.class);
        } catch (Throwable unused2) {
        }
        r a11 = new gz.a(d12, rVar2).a();
        g0.m(a11);
        throw new CannotTransformContentToTypeException(a11);
    }

    public static final /* synthetic */ <T> Object l(zx.b bVar, j00.c<? super T> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        Object L = bVar.L(aVar, cVar);
        d0.e(1);
        return L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    @yz.n(level = kotlin.DeprecationLevel.ERROR, message = "receiveOrNull is ambiguous with receiveNullable and going to be removed in 3.0.0. Please consider replacing it with runCatching with receive or receiveNullable", replaceWith = @yz.w0(expression = "kotlin.runCatching { this.receiveNullable<T>() }.getOrNull()", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m(@m80.k zx.b r4, @m80.k gz.a r5, @m80.k j00.c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof py.b.e
            if (r0 == 0) goto L13
            r0 = r6
            py.b$e r0 = (py.b.e) r0
            int r1 = r0.f81315c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81315c = r1
            goto L18
        L13:
            py.b$e r0 = new py.b$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f81314b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81315c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f81313a
            zx.b r4 = (zx.b) r4
            kotlin.e.n(r6)     // Catch: io.ktor.server.plugins.ContentTransformationException -> L2d
            return r6
        L2d:
            r5 = move-exception
            goto L46
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.e.n(r6)
            r0.f81313a = r4     // Catch: io.ktor.server.plugins.ContentTransformationException -> L2d
            r0.f81315c = r3     // Catch: io.ktor.server.plugins.ContentTransformationException -> L2d
            java.lang.Object r4 = r4.L(r5, r0)     // Catch: io.ktor.server.plugins.ContentTransformationException -> L2d
            if (r4 != r1) goto L45
            return r1
        L45:
            return r4
        L46:
            zx.a r4 = r4.w0()
            org.slf4j.Logger r4 = zx.j.c(r4)
            java.lang.String r6 = "Conversion failed, null returned"
            r4.debug(r6, r5)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: py.b.m(zx.b, gz.a, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    @yz.n(level = kotlin.DeprecationLevel.ERROR, message = "receiveOrNull is ambiguous with receiveNullable and going to be removed in 3.0.0. Please consider replacing it with runCatching with receive or receiveNullable", replaceWith = @yz.w0(expression = "kotlin.runCatching { this.receiveNullable<T>() }.getOrNull()", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object n(@m80.k zx.b r4, @m80.k h10.d<T> r5, @m80.k j00.c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof py.b.f
            if (r0 == 0) goto L13
            r0 = r6
            py.b$f r0 = (py.b.f) r0
            int r1 = r0.f81318c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81318c = r1
            goto L18
        L13:
            py.b$f r0 = new py.b$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f81317b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81318c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f81316a
            zx.b r4 = (zx.b) r4
            kotlin.e.n(r6)     // Catch: io.ktor.server.plugins.ContentTransformationException -> L2d
            return r6
        L2d:
            r5 = move-exception
            goto L46
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.e.n(r6)
            r0.f81316a = r4     // Catch: io.ktor.server.plugins.ContentTransformationException -> L2d
            r0.f81318c = r3     // Catch: io.ktor.server.plugins.ContentTransformationException -> L2d
            java.lang.Object r4 = e(r4, r5, r0)     // Catch: io.ktor.server.plugins.ContentTransformationException -> L2d
            if (r4 != r1) goto L45
            return r1
        L45:
            return r4
        L46:
            zx.a r4 = r4.w0()
            org.slf4j.Logger r4 = zx.j.c(r4)
            java.lang.String r6 = "Conversion failed, null returned"
            r4.debug(r6, r5)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: py.b.n(zx.b, h10.d, j00.c):java.lang.Object");
    }

    @n(level = DeprecationLevel.ERROR, message = "receiveOrNull is ambiguous with receiveNullable and going to be removed in 3.0.0. Please consider replacing it with runCatching with receive or receiveNullable", replaceWith = @w0(expression = "kotlin.runCatching { this.receiveNullable<T>() }.getOrNull()", imports = {}))
    public static final /* synthetic */ <T> Object o(zx.b bVar, j00.c<? super T> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        Object m11 = m(bVar, aVar, cVar);
        d0.e(1);
        return m11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(@m80.k zx.b r7, @m80.k j00.c<? super ix.p1> r8) {
        /*
            boolean r0 = r8 instanceof py.b.g
            if (r0 == 0) goto L13
            r0 = r8
            py.b$g r0 = (py.b.g) r0
            int r1 = r0.f81320b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81320b = r1
            goto L18
        L13:
            py.b$g r0 = new py.b$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f81319a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81320b
            r3 = 0
            r4 = 1
            java.lang.Class<ix.p1> r5 = ix.p1.class
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.e.n(r8)
            goto L4f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.e.n(r8)
            h10.d r8 = kotlin.jvm.internal.o0.d(r5)
            h10.r r2 = kotlin.jvm.internal.o0.B(r5)     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
            r2 = r3
        L41:
            gz.a r6 = new gz.a
            r6.<init>(r8, r2)
            r0.f81320b = r4
            java.lang.Object r8 = r7.L(r6, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            if (r8 == 0) goto L52
            return r8
        L52:
            h10.d r7 = kotlin.jvm.internal.o0.d(r5)
            h10.r r3 = kotlin.jvm.internal.o0.B(r5)     // Catch: java.lang.Throwable -> L5a
        L5a:
            gz.a r8 = new gz.a
            r8.<init>(r7, r3)
            h10.r r7 = r8.a()
            kotlin.jvm.internal.g0.m(r7)
            io.ktor.server.plugins.CannotTransformContentToTypeException r8 = new io.ktor.server.plugins.CannotTransformContentToTypeException
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: py.b.p(zx.b, j00.c):java.lang.Object");
    }

    public static final Object q(zx.b bVar, j00.c<? super p1> cVar) {
        r rVar;
        h10.d d11 = o0.d(p1.class);
        r rVar2 = null;
        try {
            rVar = o0.B(p1.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        gz.a aVar = new gz.a(d11, rVar);
        d0.e(0);
        Object L = bVar.L(aVar, cVar);
        d0.e(1);
        if (L != null) {
            return L;
        }
        h10.d d12 = o0.d(p1.class);
        try {
            rVar2 = o0.B(p1.class);
        } catch (Throwable unused2) {
        }
        r a11 = new gz.a(d12, rVar2).a();
        g0.m(a11);
        throw new CannotTransformContentToTypeException(a11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(@m80.k zx.b r10, @m80.k j00.c<? super java.lang.String> r11) {
        /*
            boolean r0 = r11 instanceof py.b.h
            if (r0 == 0) goto L13
            r0 = r11
            py.b$h r0 = (py.b.h) r0
            int r1 = r0.f81323c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81323c = r1
            goto L18
        L13:
            py.b$h r0 = new py.b$h
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f81322b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81323c
            r3 = 1
            r4 = 0
            r5 = 2
            java.lang.Class<io.ktor.utils.io.g> r6 = io.ktor.utils.io.g.class
            if (r2 == 0) goto L43
            if (r2 == r3) goto L3b
            if (r2 != r5) goto L33
            java.lang.Object r10 = r0.f81321a
            java.nio.charset.Charset r10 = (java.nio.charset.Charset) r10
            kotlin.e.n(r11)
            goto L81
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            java.lang.Object r10 = r0.f81321a
            java.nio.charset.Charset r10 = (java.nio.charset.Charset) r10
            kotlin.e.n(r11)
            goto L72
        L43:
            kotlin.e.n(r11)
            py.d r11 = r10.f()     // Catch: io.ktor.http.BadContentTypeFormatException -> L53
            java.nio.charset.Charset r11 = py.e.k(r11)     // Catch: io.ktor.http.BadContentTypeFormatException -> L53
            if (r11 != 0) goto L55
            java.nio.charset.Charset r11 = u30.d.f91599b     // Catch: io.ktor.http.BadContentTypeFormatException -> L53
            goto L55
        L53:
            r11 = move-exception
            goto La3
        L55:
            h10.d r2 = kotlin.jvm.internal.o0.d(r6)
            h10.r r7 = kotlin.jvm.internal.o0.B(r6)     // Catch: java.lang.Throwable -> L5e
            goto L5f
        L5e:
            r7 = r4
        L5f:
            gz.a r8 = new gz.a
            r8.<init>(r2, r7)
            r0.f81321a = r11
            r0.f81323c = r3
            java.lang.Object r10 = r10.L(r8, r0)
            if (r10 != r1) goto L6f
            goto L80
        L6f:
            r9 = r11
            r11 = r10
            r10 = r9
        L72:
            if (r11 == 0) goto L89
            io.ktor.utils.io.g r11 = (io.ktor.utils.io.g) r11
            r0.f81321a = r10
            r0.f81323c = r5
            java.lang.Object r11 = io.ktor.utils.io.j.G(r11, r0)
            if (r11 != r1) goto L81
        L80:
            return r1
        L81:
            y40.c0 r11 = (y40.c0) r11
            r0 = 0
            java.lang.String r10 = jz.s.g(r11, r10, r0, r5, r4)
            return r10
        L89:
            h10.d r10 = kotlin.jvm.internal.o0.d(r6)
            h10.r r4 = kotlin.jvm.internal.o0.B(r6)     // Catch: java.lang.Throwable -> L91
        L91:
            gz.a r11 = new gz.a
            r11.<init>(r10, r4)
            h10.r r10 = r11.a()
            kotlin.jvm.internal.g0.m(r10)
            io.ktor.server.plugins.CannotTransformContentToTypeException r11 = new io.ktor.server.plugins.CannotTransformContentToTypeException
            r11.<init>(r10)
            throw r11
        La3:
            io.ktor.server.plugins.BadRequestException r0 = new io.ktor.server.plugins.BadRequestException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal Content-Type format: "
            r1.append(r2)
            py.d r10 = r10.f()
            ix.q0 r10 = r10.a()
            ix.y0 r2 = ix.y0.f63006a
            java.lang.String r2 = r2.C()
            java.lang.String r10 = r10.get(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: py.b.r(zx.b, j00.c):java.lang.Object");
    }

    public static final Object s(zx.b bVar, j00.c<? super String> cVar) {
        r rVar;
        try {
            Charset k11 = py.e.k(bVar.f());
            if (k11 == null) {
                k11 = u30.d.f91599b;
            }
            h10.d d11 = o0.d(io.ktor.utils.io.g.class);
            r rVar2 = null;
            try {
                rVar = o0.B(io.ktor.utils.io.g.class);
            } catch (Throwable unused) {
                rVar = null;
            }
            gz.a aVar = new gz.a(d11, rVar);
            d0.e(0);
            Object L = bVar.L(aVar, cVar);
            d0.e(1);
            if (L != null) {
                d0.e(0);
                Object G = io.ktor.utils.io.j.G((io.ktor.utils.io.g) L, cVar);
                d0.e(1);
                return s.g((c0) G, k11, 0, 2, null);
            }
            h10.d d12 = o0.d(io.ktor.utils.io.g.class);
            try {
                rVar2 = o0.B(io.ktor.utils.io.g.class);
            } catch (Throwable unused2) {
            }
            r a11 = new gz.a(d12, rVar2).a();
            g0.m(a11);
            throw new CannotTransformContentToTypeException(a11);
        } catch (BadContentTypeFormatException e11) {
            throw new BadRequestException("Illegal Content-Type format: " + bVar.f().a().get(y0.f63006a.C()), e11);
        }
    }

    public static final void t(@m80.k zx.b bVar, long j11) {
        g0.p(bVar, "<this>");
        bVar.getAttributes().e(f81302a, Long.valueOf(j11));
    }

    @v0
    public static /* synthetic */ void a() {
    }
}
