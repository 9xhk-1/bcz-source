package jz;

import kotlin.jvm.internal.g0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o {
    public static final void b(@m80.k byte[] bArr, int i11, int i12) {
        g0.p(bArr, "<this>");
        bArr[i11] = (byte) (i12 >> 24);
        bArr[i11 + 1] = (byte) (i12 >> 16);
        bArr[i11 + 2] = (byte) (i12 >> 8);
        bArr[i11 + 3] = (byte) i12;
    }

    public static final <T> T c(int i11, @m80.k x00.l<? super byte[], ? extends T> block) {
        g0.p(block, "block");
        return block.invoke(new byte[i11]);
    }

    @yz.n(message = "ByteArray instead", replaceWith = @w0(expression = "ByteArray", imports = {}))
    public static /* synthetic */ void a() {
    }
}
