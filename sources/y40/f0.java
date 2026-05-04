package y40;

import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSourcesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourcesJvm.kt\nkotlinx/io/SourcesJvmKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n99#2:178\n100#2,8:180\n1#3:179\n*S KotlinDebug\n*F\n+ 1 SourcesJvm.kt\nkotlinx/io/SourcesJvmKt\n*L\n41#1:178\n41#1:180,8\n41#1:179\n*E\n"})
/* loaded from: classes8.dex */
public final class f0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ReadableByteChannel {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f99294a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.a<Boolean> f99295b;

        public a(c0 c0Var, x00.a<Boolean> aVar) {
            this.f99294a = c0Var;
            this.f99295b = aVar;
        }

        @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f99294a.close();
        }

        @Override // java.nio.channels.Channel
        public boolean isOpen() {
            return !this.f99295b.invoke().booleanValue();
        }

        @Override // java.nio.channels.ReadableByteChannel
        public int read(ByteBuffer sink) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            return f0.g(this.f99294a, sink);
        }
    }

    @m80.k
    public static final ReadableByteChannel c(@m80.k c0 c0Var) {
        x00.a aVar;
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        if (c0Var instanceof r) {
            aVar = new MutablePropertyReference0Impl(c0Var) { // from class: y40.f0.b
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
                public Object get() {
                    return Boolean.valueOf(((r) this.receiver).f99313b);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
                public void set(Object obj) {
                    ((r) this.receiver).f99313b = ((Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(c0Var instanceof y40.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new x00.a() { // from class: y40.e0
                @Override // x00.a
                public final Object invoke() {
                    boolean d11;
                    d11 = f0.d();
                    return Boolean.valueOf(d11);
                }
            };
        }
        return new a(c0Var, aVar);
    }

    public static final boolean d() {
        return false;
    }

    @m80.k
    public static final InputStream e(@m80.k c0 c0Var) {
        x00.a aVar;
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        if (c0Var instanceof r) {
            aVar = new MutablePropertyReference0Impl(c0Var) { // from class: y40.f0.d
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
                public Object get() {
                    return Boolean.valueOf(((r) this.receiver).f99313b);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
                public void set(Object obj) {
                    ((r) this.receiver).f99313b = ((Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(c0Var instanceof y40.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new x00.a() { // from class: y40.d0
                @Override // x00.a
                public final Object invoke() {
                    boolean f11;
                    f11 = f0.f();
                    return Boolean.valueOf(f11);
                }
            };
        }
        return new c(aVar, c0Var);
    }

    public static final boolean f() {
        return false;
    }

    public static final int g(@m80.k c0 c0Var, @m80.k ByteBuffer sink) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (c0Var.getBuffer().r() == 0) {
            c0Var.request(8192L);
            if (c0Var.getBuffer().r() == 0) {
                return -1;
            }
        }
        return y40.d.d(c0Var.getBuffer(), sink);
    }

    @m80.k
    public static final String h(@m80.k c0 c0Var, long j11, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        c0Var.F(j11);
        return j(c0Var.getBuffer(), j11, charset);
    }

    @m80.k
    public static final String i(@m80.k c0 c0Var, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        for (long j11 = 1; c0Var.request(j11); j11 *= 2) {
        }
        return j(c0Var.getBuffer(), c0Var.getBuffer().r(), charset);
    }

    public static final String j(y40.b bVar, long j11, Charset charset) {
        String str;
        int i11;
        if (j11 < 0 || j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount (" + j11 + ") is not within the range [0..2147483647)").toString());
        }
        if (bVar.r() < j11) {
            throw new EOFException("Buffer contains less bytes then required (byteCount: " + j11 + ", size: " + bVar.r() + ')');
        }
        if (j11 == 0) {
            return "";
        }
        d50.d dVar = d50.d.f47268a;
        if (bVar.J()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t k11 = bVar.k();
        kotlin.jvm.internal.g0.m(k11);
        byte[] b11 = k11.b(true);
        int h11 = k11.h();
        if (k11.d() - h11 >= j11) {
            i11 = (int) j11;
            str = new String(b11, h11, i11, charset);
        } else {
            str = null;
            i11 = 0;
        }
        if (i11 != 0) {
            if (i11 < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (i11 > k11.n()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            bVar.skip(i11);
        }
        return str == null ? new String(g0.d(bVar, (int) j11), charset) : str;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSourcesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourcesJvm.kt\nkotlinx/io/SourcesJvmKt$asInputStream$1\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,177:1\n95#2:178\n107#2:179\n*S KotlinDebug\n*F\n+ 1 SourcesJvm.kt\nkotlinx/io/SourcesJvmKt$asInputStream$1\n*L\n115#1:178\n127#1:179\n*E\n"})
    public static final class c extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<Boolean> f99296a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f99297b;

        public c(x00.a<Boolean> aVar, c0 c0Var) {
            this.f99296a = aVar;
            this.f99297b = c0Var;
        }

        @Override // java.io.InputStream
        public int available() {
            if (this.f99296a.invoke().booleanValue()) {
                throw new IOException("Underlying source is closed.");
            }
            return (int) Math.min(this.f99297b.getBuffer().r(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f99297b.close();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f99296a.invoke().booleanValue()) {
                throw new IOException("Underlying source is closed.");
            }
            if (this.f99297b.J()) {
                return -1;
            }
            return this.f99297b.readByte() & 255;
        }

        public String toString() {
            return this.f99297b + ".asInputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i11, int i12) {
            kotlin.jvm.internal.g0.p(data, "data");
            if (!this.f99296a.invoke().booleanValue()) {
                k0.g(data.length, i11, i12);
                return this.f99297b.c7(data, i11, i12 + i11);
            }
            throw new IOException("Underlying source is closed.");
        }
    }
}
