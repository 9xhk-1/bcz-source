package io.ktor.websocket;

import c40.k1;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import xy.z0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class d {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final c f62381i = new c(null);

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final byte[] f62382j = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f62383a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final FrameType f62384b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final byte[] f62385c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final k1 f62386d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f62387e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f62388f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f62389g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final ByteBuffer f62390h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends d {
        public /* synthetic */ a(boolean z11, byte[] bArr, boolean z12, boolean z13, boolean z14, int i11, kotlin.jvm.internal.v vVar) {
            this(z11, bArr, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? false : z14);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z11, @m80.k byte[] data, boolean z12, boolean z13, boolean z14) {
            super(z11, FrameType.BINARY, data, io.ktor.websocket.f.f62392a, z12, z13, z14, null);
            kotlin.jvm.internal.g0.p(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z11, @m80.k ByteBuffer buffer) {
            this(z11, z0.i(buffer));
            kotlin.jvm.internal.g0.p(buffer, "buffer");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z11, @m80.k byte[] data) {
            this(z11, data, false, false, false);
            kotlin.jvm.internal.g0.p(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z11, @m80.k y40.c0 packet) {
            this(z11, y40.g0.c(packet));
            kotlin.jvm.internal.g0.p(packet, "packet");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nFrame.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Frame.kt\nio/ktor/websocket/Frame$Close\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,158:1\n15#2,3:159\n*S KotlinDebug\n*F\n+ 1 Frame.kt\nio/ktor/websocket/Frame$Close\n*L\n89#1:159,3\n*E\n"})
    public static final class b extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k byte[] data) {
            super(true, FrameType.CLOSE, data, io.ktor.websocket.f.f62392a, false, false, false, null);
            kotlin.jvm.internal.g0.p(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@m80.k y40.c0 packet) {
            this(y40.g0.c(packet));
            kotlin.jvm.internal.g0.p(packet, "packet");
        }

        public b() {
            this(d.f62382j);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@m80.k ByteBuffer buffer) {
            this(z0.i(buffer));
            kotlin.jvm.internal.g0.p(buffer, "buffer");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(@m80.k io.ktor.websocket.CloseReason r9) {
            /*
                r8 = this;
                java.lang.String r0 = "reason"
                kotlin.jvm.internal.g0.p(r9, r0)
                y40.b r1 = new y40.b
                r1.<init>()
                short r0 = r9.e()
                r1.writeShort(r0)
                java.lang.String r2 = r9.g()
                r6 = 14
                r7 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                jz.s.p(r1, r2, r3, r4, r5, r6, r7)
                r8.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.d.b.<init>(io.ktor.websocket.CloseReason):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f62391a;

            static {
                int[] iArr = new int[FrameType.values().length];
                try {
                    iArr[FrameType.BINARY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FrameType.TEXT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FrameType.CLOSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FrameType.PING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FrameType.PONG.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f62391a = iArr;
            }
        }

        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final d a(boolean z11, @m80.k FrameType frameType, @m80.k byte[] data, boolean z12, boolean z13, boolean z14) {
            kotlin.jvm.internal.g0.p(frameType, "frameType");
            kotlin.jvm.internal.g0.p(data, "data");
            int i11 = a.f62391a[frameType.ordinal()];
            if (i11 == 1) {
                return new a(z11, data, z12, z13, z14);
            }
            if (i11 == 2) {
                return new f(z11, data, z12, z13, z14);
            }
            if (i11 == 3) {
                return new b(data);
            }
            if (i11 == 4) {
                return new C0728d(data);
            }
            if (i11 == 5) {
                return new e(data, io.ktor.websocket.f.f62392a);
            }
            throw new NoWhenBranchMatchedException();
        }

        public c() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: io.ktor.websocket.d$d, reason: collision with other inner class name */
    public static final class C0728d extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0728d(@m80.k byte[] data) {
            super(true, FrameType.PING, data, io.ktor.websocket.f.f62392a, false, false, false, null);
            kotlin.jvm.internal.g0.p(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0728d(@m80.k y40.c0 packet) {
            this(y40.g0.c(packet));
            kotlin.jvm.internal.g0.p(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0728d(@m80.k ByteBuffer buffer) {
            this(z0.i(buffer));
            kotlin.jvm.internal.g0.p(buffer, "buffer");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends d {
        public /* synthetic */ f(boolean z11, byte[] bArr, boolean z12, boolean z13, boolean z14, int i11, kotlin.jvm.internal.v vVar) {
            this(z11, bArr, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? false : z14);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z11, @m80.k byte[] data, boolean z12, boolean z13, boolean z14) {
            super(z11, FrameType.TEXT, data, io.ktor.websocket.f.f62392a, z12, z13, z14, null);
            kotlin.jvm.internal.g0.p(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(boolean z11, @m80.k byte[] data) {
            this(z11, data, false, false, false);
            kotlin.jvm.internal.g0.p(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(@m80.k String text) {
            this(true, jz.s.m(text, null, 1, null));
            kotlin.jvm.internal.g0.p(text, "text");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(boolean z11, @m80.k y40.c0 packet) {
            this(z11, y40.g0.c(packet));
            kotlin.jvm.internal.g0.p(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(boolean z11, @m80.k ByteBuffer buffer) {
            this(z11, z0.i(buffer));
            kotlin.jvm.internal.g0.p(buffer, "buffer");
        }
    }

    public /* synthetic */ d(boolean z11, FrameType frameType, byte[] bArr, k1 k1Var, boolean z12, boolean z13, boolean z14, kotlin.jvm.internal.v vVar) {
        this(z11, frameType, bArr, k1Var, z12, z13, z14);
    }

    @m80.k
    public final d b() {
        c cVar = f62381i;
        boolean z11 = this.f62383a;
        FrameType frameType = this.f62384b;
        byte[] bArr = this.f62385c;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return cVar.a(z11, frameType, copyOf, this.f62387e, this.f62388f, this.f62389g);
    }

    @m80.k
    public final ByteBuffer c() {
        return this.f62390h;
    }

    @m80.k
    public final byte[] d() {
        return this.f62385c;
    }

    @m80.k
    public final k1 e() {
        return this.f62386d;
    }

    public final boolean f() {
        return this.f62383a;
    }

    @m80.k
    public final FrameType g() {
        return this.f62384b;
    }

    public final boolean h() {
        return this.f62387e;
    }

    public final boolean i() {
        return this.f62388f;
    }

    public final boolean j() {
        return this.f62389g;
    }

    @m80.k
    public String toString() {
        return "Frame " + this.f62384b + " (fin=" + this.f62383a + ", buffer len = " + this.f62385c.length + ')';
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends d {
        public /* synthetic */ e(byte[] bArr, k1 k1Var, int i11, kotlin.jvm.internal.v vVar) {
            this(bArr, (i11 & 2) != 0 ? io.ktor.websocket.f.f62392a : k1Var);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k byte[] data, @m80.k k1 disposableHandle) {
            super(true, FrameType.PONG, data, disposableHandle, false, false, false, null);
            kotlin.jvm.internal.g0.p(data, "data");
            kotlin.jvm.internal.g0.p(disposableHandle, "disposableHandle");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public e(@m80.k y40.c0 packet) {
            this(y40.g0.c(packet), io.ktor.websocket.f.f62392a);
            kotlin.jvm.internal.g0.p(packet, "packet");
        }

        public /* synthetic */ e(ByteBuffer byteBuffer, k1 k1Var, int i11, kotlin.jvm.internal.v vVar) {
            this(byteBuffer, (i11 & 2) != 0 ? io.ktor.websocket.f.f62392a : k1Var);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public e(@m80.k ByteBuffer buffer, @m80.k k1 disposableHandle) {
            this(z0.i(buffer), disposableHandle);
            kotlin.jvm.internal.g0.p(buffer, "buffer");
            kotlin.jvm.internal.g0.p(disposableHandle, "disposableHandle");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public e(@m80.k ByteBuffer buffer) {
            this(z0.i(buffer), io.ktor.websocket.f.f62392a);
            kotlin.jvm.internal.g0.p(buffer, "buffer");
        }
    }

    public d(boolean z11, FrameType frameType, byte[] bArr, k1 k1Var, boolean z12, boolean z13, boolean z14) {
        this.f62383a = z11;
        this.f62384b = frameType;
        this.f62385c = bArr;
        this.f62386d = k1Var;
        this.f62387e = z12;
        this.f62388f = z13;
        this.f62389g = z14;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        kotlin.jvm.internal.g0.o(wrap, "wrap(...)");
        this.f62390h = wrap;
    }

    public /* synthetic */ d(boolean z11, FrameType frameType, byte[] bArr, k1 k1Var, boolean z12, boolean z13, boolean z14, int i11, kotlin.jvm.internal.v vVar) {
        this(z11, frameType, bArr, (i11 & 8) != 0 ? io.ktor.websocket.f.f62392a : k1Var, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13, (i11 & 64) != 0 ? false : z14, null);
    }
}
