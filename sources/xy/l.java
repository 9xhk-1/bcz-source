package xy;

import c40.l2;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final long f98560a = 4096;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", f = "ByteChannels.kt", i = {1}, l = {62, 64, 65, 79, 80, 79, 80, 79, 80}, m = "invokeSuspend", n = {"it"}, s = {"L$4"})
    @kotlin.jvm.internal.u0({"SMAP\nByteChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannels.kt\nio/ktor/util/ByteChannelsKt$copyToBoth$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f98561a;

        /* renamed from: b, reason: collision with root package name */
        public Object f98562b;

        /* renamed from: c, reason: collision with root package name */
        public Object f98563c;

        /* renamed from: d, reason: collision with root package name */
        public Object f98564d;

        /* renamed from: e, reason: collision with root package name */
        public Object f98565e;

        /* renamed from: f, reason: collision with root package name */
        public int f98566f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f98567g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f98568h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f98569i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar, io.ktor.utils.io.m mVar2, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f98567g = gVar;
            this.f98568h = mVar;
            this.f98569i = mVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f98567g, this.f98568h, this.f98569i, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0157, code lost:
        
            if (r9.j(r8) == r0) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x012a, code lost:
        
            if (r9.j(r8) == r0) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x011e, code lost:
        
            if (r9.j(r8) == r0) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x014b, code lost:
        
            if (r9.j(r8) != r0) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0172, code lost:
        
            if (r1.j(r8) != r0) goto L76;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:28:0x00f7, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e, B:38:0x00a7, B:57:0x00ff, B:58:0x0102, B:59:0x0103, B:63:0x012d, B:70:0x006c, B:27:0x00f5, B:40:0x00b0, B:50:0x00ec, B:54:0x00fd), top: B:2:0x0007, inners: #3, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x012d A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:28:0x00f7, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e, B:38:0x00a7, B:57:0x00ff, B:58:0x0102, B:59:0x0103, B:63:0x012d, B:70:0x006c, B:27:0x00f5, B:40:0x00b0, B:50:0x00ec, B:54:0x00fd), top: B:2:0x0007, inners: #3, #5 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ea -> B:26:0x00f5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xy.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.ByteChannelsKt$split$1", f = "ByteChannels.kt", i = {0, 0, 1, 1}, l = {27, 32}, m = "invokeSuspend", n = {"$this$launch", "buffer", "$this$launch", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @kotlin.jvm.internal.u0({"SMAP\nByteChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannels.kt\nio/ktor/util/ByteChannelsKt$split$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f98570a;

        /* renamed from: b, reason: collision with root package name */
        public int f98571b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f98572c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f98573d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.b f98574e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.b f98575f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.util.ByteChannelsKt$split$1$1", f = "ByteChannels.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f98576a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.b f98577b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ byte[] f98578c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f98579d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.ktor.utils.io.b bVar, byte[] bArr, int i11, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f98577b = bVar;
                this.f98578c = bArr;
                this.f98579d = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f98577b, this.f98578c, this.f98579d, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f98576a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.utils.io.b bVar = this.f98577b;
                    byte[] bArr = this.f98578c;
                    int i12 = this.f98579d;
                    this.f98576a = 1;
                    if (io.ktor.utils.io.q.r(bVar, bArr, 0, i12, this) == l11) {
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
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.util.ByteChannelsKt$split$1$2", f = "ByteChannels.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: xy.l$b$b, reason: collision with other inner class name */
        public static final class C1333b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f98580a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.b f98581b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ byte[] f98582c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f98583d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1333b(io.ktor.utils.io.b bVar, byte[] bArr, int i11, j00.c<? super C1333b> cVar) {
                super(2, cVar);
                this.f98581b = bVar;
                this.f98582c = bArr;
                this.f98583d = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C1333b(this.f98581b, this.f98582c, this.f98583d, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                return ((C1333b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f98580a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.utils.io.b bVar = this.f98581b;
                    byte[] bArr = this.f98582c;
                    int i12 = this.f98583d;
                    this.f98580a = 1;
                    if (io.ktor.utils.io.q.r(bVar, bArr, 0, i12, this) == l11) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.ktor.utils.io.g gVar, io.ktor.utils.io.b bVar, io.ktor.utils.io.b bVar2, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f98573d = gVar;
            this.f98574e = bVar;
            this.f98575f = bVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f98573d, this.f98574e, this.f98575f, cVar);
            bVar.f98572c = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
        
            if (c40.f.a(r0, r16) == r7) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0052 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0019, B:9:0x004a, B:11:0x0052, B:16:0x0065, B:18:0x006d, B:20:0x00a6, B:26:0x00c0, B:31:0x0031), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0019, B:9:0x004a, B:11:0x0052, B:16:0x0065, B:18:0x006d, B:20:0x00a6, B:26:0x00c0, B:31:0x0031), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0019, B:9:0x004a, B:11:0x0052, B:16:0x0065, B:18:0x006d, B:20:0x00a6, B:26:0x00c0, B:31:0x0031), top: B:2:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006b -> B:9:0x004a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a3 -> B:9:0x004a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xy.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void c(@m80.k io.ktor.utils.io.g gVar, @m80.k final io.ktor.utils.io.m first, @m80.k final io.ktor.utils.io.m second) {
        l2 f11;
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        kotlin.jvm.internal.g0.p(first, "first");
        kotlin.jvm.internal.g0.p(second, "second");
        f11 = c40.k.f(c40.b2.f7824a, c40.h1.a(), null, new a(gVar, first, second, null), 2, null);
        f11.z0(new x00.l() { // from class: xy.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = l.d(io.ktor.utils.io.m.this, second, (Throwable) obj);
                return d11;
            }
        });
    }

    public static final g2 d(io.ktor.utils.io.m mVar, io.ktor.utils.io.m mVar2, Throwable th2) {
        if (th2 == null) {
            return g2.f100423a;
        }
        io.ktor.utils.io.q.e(mVar, th2);
        io.ktor.utils.io.q.e(mVar2, th2);
        return g2.f100423a;
    }

    @m80.k
    public static final Pair<io.ktor.utils.io.g, io.ktor.utils.io.g> e(@m80.k io.ktor.utils.io.g gVar, @m80.k c40.r0 coroutineScope) {
        l2 f11;
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        kotlin.jvm.internal.g0.p(coroutineScope, "coroutineScope");
        final io.ktor.utils.io.b bVar = new io.ktor.utils.io.b(true);
        final io.ktor.utils.io.b bVar2 = new io.ktor.utils.io.b(true);
        f11 = c40.k.f(coroutineScope, null, null, new b(gVar, bVar, bVar2, null), 3, null);
        f11.z0(new x00.l() { // from class: xy.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f12;
                f12 = l.f(io.ktor.utils.io.b.this, bVar2, (Throwable) obj);
                return f12;
            }
        });
        return yz.h1.a(bVar, bVar2);
    }

    public static final g2 f(io.ktor.utils.io.b bVar, io.ktor.utils.io.b bVar2, Throwable th2) {
        if (th2 == null) {
            return g2.f100423a;
        }
        bVar.a(th2);
        bVar2.a(th2);
        return g2.f100423a;
    }
}
