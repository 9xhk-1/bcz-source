package vl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import vl.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b extends c.a {
    public b(f fVar, c.b bVar, long j11, int i11) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(bVar.f94040a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = j11 + (i11 * 16);
        this.f94035a = fVar.k(allocate, j12);
        this.f94036b = fVar.k(allocate, j12 + 8);
    }
}
