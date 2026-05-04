package io.ktor.utils.io;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.utils.io.g;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteReadChannelOperations.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteReadChannelOperations.jvm.kt\nio/ktor/utils/io/ByteReadChannelOperations_jvmKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,189:1\n176#1:194\n177#1,12:196\n15#2,3:190\n1#3:193\n1#3:195\n1#3:209\n99#4:208\n100#4,8:210\n*S KotlinDebug\n*F\n+ 1 ByteReadChannelOperations.jvm.kt\nio/ktor/utils/io/ByteReadChannelOperations_jvmKt\n*L\n92#1:194\n92#1:196,12\n18#1:190,3\n92#1:195\n143#1:209\n143#1:208\n143#1:210,8\n*E\n"})
/* loaded from: classes8.dex */
public final class l {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0, 0, 0, 0}, l = {198}, m = "copyTo", n = {"$this$copyTo", "copied", "copy", "$this$read$iv", "limit", "min$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "I$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62255a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62256b;

        /* renamed from: c, reason: collision with root package name */
        public Object f62257c;

        /* renamed from: d, reason: collision with root package name */
        public Object f62258d;

        /* renamed from: e, reason: collision with root package name */
        public long f62259e;

        /* renamed from: f, reason: collision with root package name */
        public int f62260f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f62261g;

        /* renamed from: h, reason: collision with root package name */
        public int f62262h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62261g = obj;
            this.f62262h |= Integer.MIN_VALUE;
            return l.d(null, null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0}, l = {182}, m = "read", n = {"$this$read", "consumer", "min"}, s = {"L$0", "L$1", "I$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62263a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62264b;

        /* renamed from: c, reason: collision with root package name */
        public int f62265c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62266d;

        /* renamed from: e, reason: collision with root package name */
        public int f62267e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62266d = obj;
            this.f62267e |= Integer.MIN_VALUE;
            return l.g(null, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0}, l = {35}, m = "readAvailable", n = {"$this$readAvailable", "buffer"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62268a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62269b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62270c;

        /* renamed from: d, reason: collision with root package name */
        public int f62271d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62270c = obj;
            this.f62271d |= Integer.MIN_VALUE;
            return l.k(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0}, l = {118}, m = "readFully", n = {"$this$readFully", "buffer"}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62272a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62273b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62274c;

        /* renamed from: d, reason: collision with root package name */
        public int f62275d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62274c = obj;
            this.f62275d |= Integer.MIN_VALUE;
            return l.l(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0}, l = {107}, m = "skipDelimiter", n = {"$this$skipDelimiter", TtmlNode.RUBY_DELIMITER, "i"}, s = {"L$0", "L$1", "I$0"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62276a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62277b;

        /* renamed from: c, reason: collision with root package name */
        public int f62278c;

        /* renamed from: d, reason: collision with root package name */
        public int f62279d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f62280e;

        /* renamed from: f, reason: collision with root package name */
        public int f62281f;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62280e = obj;
            this.f62281f |= Integer.MIN_VALUE;
            return l.n(null, null, this);
        }
    }

    @m80.k
    public static final g b(@m80.k ByteBuffer content) {
        kotlin.jvm.internal.g0.p(content, "content");
        y40.b bVar = new y40.b();
        jz.g.a(bVar, content);
        return io.ktor.utils.io.c.b(bVar);
    }

    @m80.k
    public static final z40.c c(@m80.k ByteBuffer buffer) {
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        byte[] bArr = new byte[buffer.remaining()];
        buffer.mark();
        buffer.get(bArr);
        buffer.reset();
        return new z40.c(bArr, 0, 0, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fb, code lost:
    
        if (r7.f() != false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0094 -> B:20:0x00f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b3 -> B:10:0x00b7). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@m80.k io.ktor.utils.io.g r7, @m80.k final java.nio.channels.WritableByteChannel r8, final long r9, @m80.k j00.c<? super java.lang.Long> r11) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.l.d(io.ktor.utils.io.g, java.nio.channels.WritableByteChannel, long, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object e(g gVar, WritableByteChannel writableByteChannel, long j11, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return d(gVar, writableByteChannel, j11, cVar);
    }

    public static final g2 f(long j11, Ref.LongRef longRef, WritableByteChannel writableByteChannel, ByteBuffer bb2) {
        kotlin.jvm.internal.g0.p(bb2, "bb");
        long j12 = j11 - longRef.element;
        if (j12 < bb2.remaining()) {
            int limit = bb2.limit();
            bb2.limit(bb2.position() + ((int) j12));
            while (bb2.hasRemaining()) {
                writableByteChannel.write(bb2);
            }
            bb2.limit(limit);
            longRef.element += j12;
        } else {
            long j13 = 0;
            while (bb2.hasRemaining()) {
                j13 += writableByteChannel.write(bb2);
            }
            longRef.element += j13;
        }
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@m80.k io.ktor.utils.io.g r4, int r5, @m80.k x00.l<? super java.nio.ByteBuffer, yz.g2> r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.l.b
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.l$b r0 = (io.ktor.utils.io.l.b) r0
            int r1 = r0.f62267e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62267e = r1
            goto L18
        L13:
            io.ktor.utils.io.l$b r0 = new io.ktor.utils.io.l$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f62266d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62267e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r5 = r0.f62265c
            java.lang.Object r4 = r0.f62264b
            r6 = r4
            x00.l r6 = (x00.l) r6
            java.lang.Object r4 = r0.f62263a
            io.ktor.utils.io.g r4 = (io.ktor.utils.io.g) r4
            kotlin.e.n(r7)
            goto L68
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.e.n(r7)
            if (r5 < 0) goto La9
            int r7 = io.ktor.utils.io.j.m(r4)
            if (r7 <= 0) goto L57
            int r7 = io.ktor.utils.io.j.m(r4)
            if (r7 < r5) goto L57
            y40.c0 r4 = r4.e()
            jz.i.b(r4, r6)
            yz.g2 r4 = yz.g2.f100423a
            return r4
        L57:
            r0.f62263a = r4
            r0.f62264b = r6
            r0.f62265c = r5
            r0.f62267e = r3
            r7 = 0
            r2 = 0
            java.lang.Object r7 = io.ktor.utils.io.g.b.a(r4, r7, r0, r3, r2)
            if (r7 != r1) goto L68
            return r1
        L68:
            boolean r7 = r4.f()
            if (r7 == 0) goto L99
            if (r5 > 0) goto L71
            goto L99
        L71:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Not enough bytes available: required "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = " but "
            r7.append(r5)
            int r4 = io.ktor.utils.io.j.m(r4)
            r7.append(r4)
            java.lang.String r4 = " available"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            throw r6
        L99:
            int r5 = io.ktor.utils.io.j.m(r4)
            if (r5 <= 0) goto La6
            y40.c0 r4 = r4.e()
            jz.i.b(r4, r6)
        La6:
            yz.g2 r4 = yz.g2.f100423a
            return r4
        La9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "min should be positive or zero"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.l.g(io.ktor.utils.io.g, int, x00.l, j00.c):java.lang.Object");
    }

    public static final Object h(g gVar, int i11, x00.l<? super ByteBuffer, g2> lVar, j00.c<? super g2> cVar) {
        if (i11 < 0) {
            throw new IllegalArgumentException("min should be positive or zero");
        }
        if (j.m(gVar) > 0 && j.m(gVar) >= i11) {
            jz.i.b(gVar.e(), lVar);
            return g2.f100423a;
        }
        kotlin.jvm.internal.d0.e(0);
        g.b.a(gVar, 0, cVar, 1, null);
        kotlin.jvm.internal.d0.e(1);
        if (!gVar.f() || i11 <= 0) {
            if (j.m(gVar) > 0) {
                jz.i.b(gVar.e(), lVar);
            }
            return g2.f100423a;
        }
        throw new EOFException("Not enough bytes available: required " + i11 + " but " + j.m(gVar) + " available");
    }

    public static /* synthetic */ Object i(g gVar, int i11, x00.l lVar, j00.c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("min should be positive or zero");
        }
        if (j.m(gVar) > 0 && j.m(gVar) >= i11) {
            jz.i.b(gVar.e(), lVar);
            return g2.f100423a;
        }
        kotlin.jvm.internal.d0.e(0);
        g.b.a(gVar, 0, cVar, 1, null);
        kotlin.jvm.internal.d0.e(1);
        if (!gVar.f() || i11 <= 0) {
            if (j.m(gVar) > 0) {
                jz.i.b(gVar.e(), lVar);
            }
            return g2.f100423a;
        }
        throw new EOFException("Not enough bytes available: required " + i11 + " but " + j.m(gVar) + " available");
    }

    public static final int j(@m80.k g gVar, @m80.k x00.l<? super ByteBuffer, Integer> block) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        if (gVar.f() || gVar.e().J()) {
            return -1;
        }
        d50.d dVar = d50.d.f47268a;
        y40.b buffer = gVar.e().getBuffer();
        if (buffer.J()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        y40.t k11 = buffer.k();
        kotlin.jvm.internal.g0.m(k11);
        byte[] b11 = k11.b(true);
        int h11 = k11.h();
        ByteBuffer wrap = ByteBuffer.wrap(b11, h11, k11.d() - h11);
        kotlin.jvm.internal.g0.m(wrap);
        int intValue = block.invoke(wrap).intValue();
        if (intValue == 0) {
            return intValue;
        }
        if (intValue < 0) {
            throw new IllegalStateException("Returned negative read bytes count");
        }
        if (intValue > k11.n()) {
            throw new IllegalStateException("Returned too many bytes");
        }
        buffer.skip(intValue);
        return intValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(@m80.k io.ktor.utils.io.g r5, @m80.k java.nio.ByteBuffer r6, @m80.k j00.c<? super java.lang.Integer> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.l.c
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.l$c r0 = (io.ktor.utils.io.l.c) r0
            int r1 = r0.f62271d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62271d = r1
            goto L18
        L13:
            io.ktor.utils.io.l$c r0 = new io.ktor.utils.io.l$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f62270c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62271d
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r5 = r0.f62269b
            r6 = r5
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r5 = r0.f62268a
            io.ktor.utils.io.g r5 = (io.ktor.utils.io.g) r5
            kotlin.e.n(r7)
            goto L62
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.e.n(r7)
            boolean r7 = r5.f()
            if (r7 == 0) goto L49
            java.lang.Integer r5 = l00.a.f(r3)
            return r5
        L49:
            y40.c0 r7 = r5.e()
            boolean r7 = r7.J()
            if (r7 == 0) goto L62
            r0.f62268a = r5
            r0.f62269b = r6
            r0.f62271d = r4
            r7 = 0
            r2 = 0
            java.lang.Object r7 = io.ktor.utils.io.g.b.a(r5, r7, r0, r4, r2)
            if (r7 != r1) goto L62
            return r1
        L62:
            boolean r7 = r5.f()
            if (r7 == 0) goto L6d
            java.lang.Integer r5 = l00.a.f(r3)
            return r5
        L6d:
            y40.c0 r5 = r5.e()
            int r5 = y40.f0.g(r5, r6)
            java.lang.Integer r5 = l00.a.f(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.l.k(io.ktor.utils.io.g, java.nio.ByteBuffer, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0046 -> B:11:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:10:0x005a). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(@m80.k io.ktor.utils.io.g r5, @m80.k java.nio.ByteBuffer r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.l.d
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.l$d r0 = (io.ktor.utils.io.l.d) r0
            int r1 = r0.f62275d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62275d = r1
            goto L18
        L13:
            io.ktor.utils.io.l$d r0 = new io.ktor.utils.io.l$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f62274c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62275d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f62273b
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            java.lang.Object r6 = r0.f62272a
            io.ktor.utils.io.g r6 = (io.ktor.utils.io.g) r6
            kotlin.e.n(r7)
            goto L5a
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.e.n(r7)
        L3c:
            boolean r7 = r6.hasRemaining()
            if (r7 == 0) goto L65
            int r7 = io.ktor.utils.io.j.m(r5)
            if (r7 != 0) goto L5d
            r0.f62272a = r5
            r0.f62273b = r6
            r0.f62275d = r3
            r7 = 0
            r2 = 0
            java.lang.Object r7 = io.ktor.utils.io.g.b.a(r5, r7, r0, r3, r2)
            if (r7 != r1) goto L57
            return r1
        L57:
            r4 = r6
            r6 = r5
            r5 = r4
        L5a:
            r4 = r6
            r6 = r5
            r5 = r4
        L5d:
            y40.c0 r7 = r5.e()
            y40.f0.g(r7, r6)
            goto L3c
        L65:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.l.l(io.ktor.utils.io.g, java.nio.ByteBuffer, j00.c):java.lang.Object");
    }

    @m80.l
    public static final Object m(@m80.k g gVar, @m80.k ByteBuffer byteBuffer, @m80.k j00.c<? super g2> cVar) {
        Object n11 = n(gVar, c(byteBuffer), cVar);
        return n11 == kotlin.coroutines.intrinsics.b.l() ? n11 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005c -> B:10:0x0061). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(@m80.k io.ktor.utils.io.g r7, @m80.k z40.c r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.l.e
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.l$e r0 = (io.ktor.utils.io.l.e) r0
            int r1 = r0.f62281f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62281f = r1
            goto L18
        L13:
            io.ktor.utils.io.l$e r0 = new io.ktor.utils.io.l$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f62280e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62281f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r7 = r0.f62279d
            int r8 = r0.f62278c
            java.lang.Object r2 = r0.f62277b
            z40.c r2 = (z40.c) r2
            java.lang.Object r4 = r0.f62276a
            io.ktor.utils.io.g r4 = (io.ktor.utils.io.g) r4
            kotlin.e.n(r9)
            goto L61
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.e.n(r9)
            int r9 = r8.g()
            r2 = 0
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L49:
            if (r2 >= r7) goto L7b
            r0.f62276a = r8
            r0.f62277b = r9
            r0.f62278c = r2
            r0.f62279d = r7
            r0.f62281f = r3
            java.lang.Object r4 = io.ktor.utils.io.j.y(r8, r0)
            if (r4 != r1) goto L5c
            return r1
        L5c:
            r6 = r4
            r4 = r8
            r8 = r2
            r2 = r9
            r9 = r6
        L61:
            java.lang.Number r9 = (java.lang.Number) r9
            byte r9 = r9.byteValue()
            byte r5 = r2.e(r8)
            if (r9 != r5) goto L73
            int r8 = r8 + 1
            r9 = r2
            r2 = r8
            r8 = r4
            goto L49
        L73:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Delimiter is not found"
            r7.<init>(r8)
            throw r7
        L7b:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.l.n(io.ktor.utils.io.g, z40.c, j00.c):java.lang.Object");
    }
}
