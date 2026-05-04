package y40;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSinksJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SinksJvm.kt\nkotlinx/io/SinksJvmKt\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,133:1\n38#2:134\n*S KotlinDebug\n*F\n+ 1 SinksJvm.kt\nkotlinx/io/SinksJvmKt\n*L\n46#1:134\n*E\n"})
/* loaded from: classes8.dex */
public final class a0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSinksJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SinksJvm.kt\nkotlinx/io/SinksJvmKt$asByteChannel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static final class a implements WritableByteChannel {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f99285a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.a<Boolean> f99286b;

        public a(x xVar, x00.a<Boolean> aVar) {
            this.f99285a = xVar;
            this.f99286b = aVar;
        }

        @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f99285a.close();
        }

        @Override // java.nio.channels.Channel
        public boolean isOpen() {
            return !this.f99286b.invoke().booleanValue();
        }

        @Override // java.nio.channels.WritableByteChannel
        public int write(ByteBuffer source) {
            kotlin.jvm.internal.g0.p(source, "source");
            if (this.f99286b.invoke().booleanValue()) {
                throw new IllegalStateException("Underlying sink is closed.");
            }
            return a0.g(this.f99285a, source);
        }
    }

    @m80.k
    public static final WritableByteChannel c(@m80.k x xVar) {
        x00.a aVar;
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        if (xVar instanceof q) {
            aVar = new MutablePropertyReference0Impl(xVar) { // from class: y40.a0.b
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
                public Object get() {
                    return Boolean.valueOf(((q) this.receiver).f99310b);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
                public void set(Object obj) {
                    ((q) this.receiver).f99310b = ((Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(xVar instanceof y40.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new x00.a() { // from class: y40.y
                @Override // x00.a
                public final Object invoke() {
                    boolean d11;
                    d11 = a0.d();
                    return Boolean.valueOf(d11);
                }
            };
        }
        return new a(xVar, aVar);
    }

    public static final boolean d() {
        return false;
    }

    @m80.k
    public static final OutputStream e(@m80.k x xVar) {
        x00.a aVar;
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        if (xVar instanceof q) {
            aVar = new MutablePropertyReference0Impl(xVar) { // from class: y40.a0.d
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
                public Object get() {
                    return Boolean.valueOf(((q) this.receiver).f99310b);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
                public void set(Object obj) {
                    ((q) this.receiver).f99310b = ((Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(xVar instanceof y40.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new x00.a() { // from class: y40.z
                @Override // x00.a
                public final Object invoke() {
                    boolean f11;
                    f11 = a0.f();
                    return Boolean.valueOf(f11);
                }
            };
        }
        return new c(aVar, xVar);
    }

    public static final boolean f() {
        return false;
    }

    public static final int g(@m80.k x xVar, @m80.k ByteBuffer source) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(source, "source");
        long r11 = xVar.getBuffer().r();
        y40.d.h(xVar.getBuffer(), source);
        long r12 = xVar.getBuffer().r() - r11;
        xVar.U0();
        return (int) r12;
    }

    public static final void h(@m80.k x xVar, @m80.k String string, @m80.k Charset charset, int i11, int i12) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(string, "string");
        kotlin.jvm.internal.g0.p(charset, "charset");
        k0.e(string.length(), i11, i12);
        if (kotlin.jvm.internal.g0.g(charset, u30.d.f91599b)) {
            i0.p(xVar, string, i11, i12);
            return;
        }
        String substring = string.substring(i11, i12);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        byte[] bytes = substring.getBytes(charset);
        kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
        xVar.write(bytes, 0, bytes.length);
    }

    public static /* synthetic */ void i(x xVar, String str, Charset charset, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = str.length();
        }
        h(xVar, str, charset, i11, i12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSinksJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SinksJvm.kt\nkotlinx/io/SinksJvmKt$asOutputStream$1\n+ 2 Sinks.kt\nkotlinx/io/SinksKt\n*L\n1#1,133:1\n374#2,3:134\n374#2,3:137\n*S KotlinDebug\n*F\n+ 1 SinksJvm.kt\nkotlinx/io/SinksJvmKt$asOutputStream$1\n*L\n69#1:134,3\n74#1:137,3\n*E\n"})
    public static final class c extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<Boolean> f99287a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f99288b;

        public c(x00.a<Boolean> aVar, x xVar) {
            this.f99287a = aVar;
            this.f99288b = xVar;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f99288b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            if (this.f99287a.invoke().booleanValue()) {
                return;
            }
            this.f99288b.flush();
        }

        public String toString() {
            return this.f99288b + ".asOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            if (this.f99287a.invoke().booleanValue()) {
                throw new IOException("Underlying sink is closed.");
            }
            x xVar = this.f99288b;
            xVar.getBuffer().u((byte) i11);
            xVar.U0();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i11, int i12) {
            kotlin.jvm.internal.g0.p(data, "data");
            if (!this.f99287a.invoke().booleanValue()) {
                x xVar = this.f99288b;
                xVar.getBuffer().write(data, i11, i12 + i11);
                xVar.U0();
                return;
            }
            throw new IOException("Underlying sink is closed.");
        }
    }
}
