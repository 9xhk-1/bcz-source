package wx;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final ByteBuffer f96954a;

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        g0.o(allocate, "allocate(...)");
        f96954a = allocate;
    }

    @k
    public static final ByteBuffer a() {
        return f96954a;
    }

    public static final void b(@k byte[] bArr, int i11, long j11) {
        g0.p(bArr, "<this>");
        for (int i12 = 0; i12 < 8; i12++) {
            bArr[i12 + i11] = (byte) (j11 >>> ((7 - i12) * 8));
        }
    }

    public static final void c(@k byte[] bArr, int i11, short s11) {
        g0.p(bArr, "<this>");
        for (int i12 = 0; i12 < 2; i12++) {
            bArr[i12 + i11] = (byte) (s11 >>> ((1 - i12) * 8));
        }
    }
}
