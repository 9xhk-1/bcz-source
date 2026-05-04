package vl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import vl.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g extends c.AbstractC1267c {
    public g(f fVar, c.b bVar, long j11) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(bVar.f94040a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = bVar.f94042c + (j11 * bVar.f94044e);
        this.f94051a = fVar.r(allocate, j12);
        this.f94052b = fVar.r(allocate, 4 + j12);
        this.f94053c = fVar.r(allocate, 8 + j12);
        this.f94054d = fVar.r(allocate, j12 + 20);
    }
}
