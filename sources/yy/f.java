package yy;

import c40.b2;
import c40.h1;
import c40.q0;
import c40.s0;
import io.ktor.utils.io.j0;
import io.ktor.utils.io.l;
import io.ktor.utils.io.l0;
import io.ktor.utils.io.m;
import io.ktor.utils.io.m0;
import io.ktor.utils.io.q;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFileChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt\n+ 2 WriteSuspendSession.kt\nio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt\n+ 3 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,108:1\n51#2,4:109\n55#2,3:119\n59#2,3:142\n51#2,4:145\n55#2,3:155\n59#2,3:178\n195#3,6:113\n203#3,20:122\n195#3,6:149\n203#3,20:158\n*S KotlinDebug\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt\n*L\n64#1:109,4\n64#1:119,3\n64#1:142,3\n73#1:145,4\n73#1:155,3\n73#1:178,3\n64#1:113,6\n64#1:122,20\n73#1:149,6\n73#1:158,20\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.cio.FileChannelsKt$readChannel$writer$1", f = "FileChannels.kt", i = {0, 0}, l = {42}, m = "invokeSuspend", n = {"$this$use$iv", "closed$iv"}, s = {"L$0", "I$0"})
    @u0({"SMAP\nFileChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt$readChannel$writer$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,108:1\n1#2:109\n12#3,14:110\n*S KotlinDebug\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt$readChannel$writer$1\n*L\n40#1:110,14\n*E\n"})
    public static final class a extends SuspendLambda implements p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100382a;

        /* renamed from: b, reason: collision with root package name */
        public int f100383b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f100384c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f100385d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f100386e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f100387f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c0<RandomAccessFile> f100388g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j11, long j12, long j13, c0<? extends RandomAccessFile> c0Var, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f100385d = j11;
            this.f100386e = j12;
            this.f100387f = j13;
            this.f100388g = c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f100385d, this.f100386e, this.f100387f, this.f100388g, cVar);
            aVar.f100384c = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f100383b
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r11.f100384c
                r1 = r0
                java.io.Closeable r1 = (java.io.Closeable) r1
                kotlin.e.n(r12)     // Catch: java.lang.Throwable -> L14
                goto L68
            L14:
                r0 = move-exception
            L15:
                r12 = r0
                goto L73
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                kotlin.e.n(r12)
                java.lang.Object r12 = r11.f100384c
                r4 = r12
                io.ktor.utils.io.m0 r4 = (io.ktor.utils.io.m0) r4
                long r5 = r11.f100385d
                r7 = 0
                int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                r1 = 0
                if (r12 < 0) goto L32
                r12 = r2
                goto L33
            L32:
                r12 = r1
            L33:
                if (r12 == 0) goto La1
                long r5 = r11.f100386e
                long r7 = r11.f100387f
                r9 = 1
                long r9 = r7 - r9
                int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r12 > 0) goto L43
                r12 = r2
                goto L44
            L43:
                r12 = r1
            L44:
                if (r12 == 0) goto L7e
                yz.c0<java.io.RandomAccessFile> r12 = r11.f100388g
                java.io.RandomAccessFile r12 = yy.f.c(r12)
                long r5 = r11.f100385d
                long r7 = r11.f100386e
                java.nio.channels.FileChannel r3 = r12.getChannel()     // Catch: java.lang.Throwable -> L70
                java.lang.String r9 = "getChannel(...)"
                kotlin.jvm.internal.g0.o(r3, r9)     // Catch: java.lang.Throwable -> L70
                r11.f100384c = r12     // Catch: java.lang.Throwable -> L70
                r11.f100382a = r1     // Catch: java.lang.Throwable -> L70
                r11.f100383b = r2     // Catch: java.lang.Throwable -> L70
                r9 = r11
                java.lang.Object r1 = yy.f.k(r3, r4, r5, r7, r9)     // Catch: java.lang.Throwable -> L70
                if (r1 != r0) goto L67
                return r0
            L67:
                r1 = r12
            L68:
                yz.g2 r12 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L14
                if (r1 == 0) goto L6f
                r1.close()
            L6f:
                return r12
            L70:
                r0 = move-exception
                r1 = r12
                goto L15
            L73:
                if (r1 == 0) goto L7d
                r1.close()     // Catch: java.lang.Throwable -> L79
                goto L7d
            L79:
                r0 = move-exception
                yz.r.a(r12, r0)
            L7d:
                throw r12
            L7e:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "endInclusive points to the position out of the file: file size = "
                r12.append(r0)
                r12.append(r7)
                java.lang.String r0 = ", endInclusive = "
                r12.append(r0)
                r12.append(r5)
                java.lang.String r12 = r12.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r0.<init>(r12)
                throw r0
            La1:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "start position shouldn't be negative but it is "
                r12.append(r0)
                r12.append(r5)
                java.lang.String r12 = r12.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: yy.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.cio.FileChannelsKt$writeChannel$1", f = "FileChannels.kt", i = {0, 0, 0}, l = {104}, m = "invokeSuspend", n = {"$this$use$iv", "file", "closed$iv"}, s = {"L$0", "L$1", "I$0"})
    @u0({"SMAP\nFileChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt$writeChannel$1\n+ 2 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,108:1\n12#2,14:109\n*S KotlinDebug\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt$writeChannel$1\n*L\n103#1:109,14\n*E\n"})
    public static final class b extends SuspendLambda implements p<j0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f100389a;

        /* renamed from: b, reason: collision with root package name */
        public int f100390b;

        /* renamed from: c, reason: collision with root package name */
        public int f100391c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f100392d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ File f100393e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f100393e = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f100393e, cVar);
            bVar.f100392d = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j0 j0Var, j00.c<? super g2> cVar) {
            return ((b) create(j0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RandomAccessFile randomAccessFile;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            ?? r12 = this.f100391c;
            try {
                if (r12 == 0) {
                    kotlin.e.n(obj);
                    j0 j0Var = (j0) this.f100392d;
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f100393e, "rw");
                    io.ktor.utils.io.g a11 = j0Var.a();
                    FileChannel channel = randomAccessFile2.getChannel();
                    g0.o(channel, "getChannel(...)");
                    this.f100392d = randomAccessFile2;
                    this.f100389a = randomAccessFile2;
                    this.f100390b = 0;
                    this.f100391c = 1;
                    obj = l.e(a11, channel, 0L, this, 2, null);
                    if (obj == l11) {
                        return l11;
                    }
                    randomAccessFile = randomAccessFile2;
                    r12 = randomAccessFile2;
                } else {
                    if (r12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    randomAccessFile = (RandomAccessFile) this.f100389a;
                    Closeable closeable = (Closeable) this.f100392d;
                    kotlin.e.n(obj);
                    r12 = closeable;
                }
                randomAccessFile.setLength(((Number) obj).longValue());
                g2 g2Var = g2.f100423a;
                if (r12 != 0) {
                    r12.close();
                }
                return g2Var;
            } catch (Throwable th2) {
                if (r12 == 0) {
                    throw th2;
                }
                try {
                    r12.close();
                    throw th2;
                } catch (Throwable th3) {
                    r.a(th2, th3);
                    throw th2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.cio.FileChannelsKt", f = "FileChannels.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {142, 178}, m = "writeToScope", n = {"$this$writeToScope", "$this$writeWhile$iv", "done$iv", "$this$writeToScope", "position", "$this$writeWhile$iv", "done$iv", "endInclusive"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "J$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f100394a;

        /* renamed from: b, reason: collision with root package name */
        public Object f100395b;

        /* renamed from: c, reason: collision with root package name */
        public Object f100396c;

        /* renamed from: d, reason: collision with root package name */
        public Object f100397d;

        /* renamed from: e, reason: collision with root package name */
        public long f100398e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f100399f;

        /* renamed from: g, reason: collision with root package name */
        public int f100400g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f100399f = obj;
            this.f100400g |= Integer.MIN_VALUE;
            return f.k(null, null, 0L, 0L, this);
        }
    }

    @k
    public static final io.ktor.utils.io.g d(@k final File file, long j11, long j12, @k kotlin.coroutines.d coroutineContext) {
        g0.p(file, "<this>");
        g0.p(coroutineContext, "coroutineContext");
        long length = file.length();
        final c0 c11 = e0.c(new x00.a() { // from class: yy.d
            @Override // x00.a
            public final Object invoke() {
                RandomAccessFile f11;
                f11 = f.f(file);
                return f11;
            }
        });
        l0 C = q.C(s0.a(coroutineContext), new q0("file-reader").plus(coroutineContext), false, new a(j11, j12, length, c11, null));
        q.h(C, new x00.a() { // from class: yy.e
            @Override // x00.a
            public final Object invoke() {
                g2 h11;
                h11 = f.h(c0.this);
                return h11;
            }
        });
        return C.b();
    }

    public static /* synthetic */ io.ktor.utils.io.g e(File file, long j11, long j12, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = -1;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            dVar = h1.c();
        }
        return d(file, j13, j14, dVar);
    }

    public static final RandomAccessFile f(File file) {
        return new RandomAccessFile(file, en.r.f50027a);
    }

    public static final RandomAccessFile g(c0<? extends RandomAccessFile> c0Var) {
        return c0Var.getValue();
    }

    public static final g2 h(c0 c0Var) {
        g(c0Var).close();
        return g2.f100423a;
    }

    @k
    public static final m i(@k File file, @k kotlin.coroutines.d coroutineContext) {
        g0.p(file, "<this>");
        g0.p(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.j.R(b2.f7824a, new q0("file-writer").plus(coroutineContext), true, new b(file, null)).b();
    }

    public static /* synthetic */ m j(File file, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = h1.c();
        }
        return i(file, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x021b, code lost:
    
        if (r12.g(r3) == r4) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x021b -> B:11:0x021e). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(@m80.k java.nio.channels.SeekableByteChannel r20, @m80.k io.ktor.utils.io.m0 r21, long r22, long r24, @m80.k j00.c<? super yz.g2> r26) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yy.f.k(java.nio.channels.SeekableByteChannel, io.ktor.utils.io.m0, long, long, j00.c):java.lang.Object");
    }
}
