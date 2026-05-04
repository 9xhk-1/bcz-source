package io.ktor.websocket;

import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import xy.z0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Serializer.kt\nio/ktor/websocket/Serializer\n+ 2 Utils.kt\nio/ktor/websocket/UtilsKt__UtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n14#2:128\n14#2:129\n14#2:130\n14#2:131\n14#2:132\n1#3:133\n*S KotlinDebug\n*F\n+ 1 Serializer.kt\nio/ktor/websocket/Serializer\n*L\n75#1:128\n76#1:129\n77#1:130\n78#1:131\n82#1:132\n*E\n"})
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ArrayBlockingQueue<d> f62543a = new ArrayBlockingQueue<>(1024);

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public ByteBuffer f62544b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public ByteBuffer f62545c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public FrameType f62546d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f62547e;

    public final void a(@m80.k d f11) {
        kotlin.jvm.internal.g0.p(f11, "f");
        this.f62543a.put(f11);
    }

    public final int b(d dVar, boolean z11) {
        int remaining = dVar.c().remaining();
        return (remaining < 126 ? 2 : remaining <= 32767 ? 4 : 10) + f(z11);
    }

    public final boolean c() {
        return (this.f62543a.isEmpty() && this.f62544b == null) ? false : true;
    }

    public final boolean d() {
        return this.f62547e;
    }

    public final int e() {
        return this.f62543a.remainingCapacity();
    }

    public final int f(boolean z11) {
        return z11 ? 4 : 0;
    }

    public final ByteBuffer g(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f62545c;
        if (byteBuffer2 != null) {
            ByteBuffer c11 = z0.c(byteBuffer, 0, 1, null);
            p.d(c11, byteBuffer2);
            if (c11 != null) {
                return c11;
            }
        }
        return byteBuffer;
    }

    public final void h(@m80.k ByteBuffer buffer) {
        d peek;
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        while (l(buffer) && (peek = this.f62543a.peek()) != null) {
            boolean z11 = this.f62547e;
            j(z11);
            if (buffer.remaining() < b(peek, z11)) {
                return;
            }
            i(peek, buffer, z11);
            this.f62543a.remove();
            this.f62544b = g(peek.c());
        }
    }

    public final void i(d dVar, ByteBuffer byteBuffer, boolean z11) {
        int opcode;
        ByteBuffer duplicate;
        int remaining = dVar.c().remaining();
        if (remaining >= 126) {
            remaining = remaining <= 65535 ? 126 : 127;
        }
        FrameType frameType = this.f62546d;
        if (frameType == null) {
            if (!dVar.f()) {
                this.f62546d = dVar.g();
            }
            opcode = dVar.g().getOpcode();
        } else if (frameType == dVar.g()) {
            if (dVar.f()) {
                this.f62546d = null;
            }
            opcode = 0;
        } else {
            if (!dVar.g().getControlFrame()) {
                throw new IllegalStateException("Can't continue with different data frame opcode");
            }
            opcode = dVar.g().getOpcode();
        }
        byteBuffer.put((byte) (opcode | (dVar.f() ? 128 : 0) | (dVar.h() ? 64 : 0) | (dVar.i() ? 32 : 0) | (dVar.j() ? 16 : 0)));
        byteBuffer.put((byte) ((z11 ? 128 : 0) | remaining));
        if (remaining == 126) {
            byteBuffer.putShort((short) dVar.c().remaining());
        } else if (remaining == 127) {
            byteBuffer.putLong(dVar.c().remaining());
        }
        ByteBuffer byteBuffer2 = this.f62545c;
        if (byteBuffer2 == null || (duplicate = byteBuffer2.duplicate()) == null) {
            return;
        }
        z0.h(duplicate, byteBuffer, 0, 2, null);
    }

    public final void j(boolean z11) {
        ByteBuffer byteBuffer;
        if (z11) {
            byteBuffer = ByteBuffer.allocate(4);
            byteBuffer.putInt(Random.Default.nextInt());
            byteBuffer.clear();
        } else {
            byteBuffer = null;
        }
        this.f62545c = byteBuffer;
    }

    public final void k(boolean z11) {
        this.f62547e = z11;
    }

    public final boolean l(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f62544b;
        if (byteBuffer2 == null) {
            return true;
        }
        z0.h(byteBuffer2, byteBuffer, 0, 2, null);
        if (byteBuffer2.hasRemaining()) {
            return false;
        }
        this.f62544b = null;
        return true;
    }
}
