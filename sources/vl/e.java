package vl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import vl.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e extends c.b {

    /* renamed from: m, reason: collision with root package name */
    public final f f94057m;

    public e(boolean z11, f fVar) throws IOException {
        this.f94040a = z11;
        this.f94057m = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z11 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f94041b = fVar.j(allocate, 16L);
        this.f94042c = fVar.k(allocate, 32L);
        this.f94043d = fVar.k(allocate, 40L);
        this.f94044e = fVar.j(allocate, 54L);
        this.f94045f = fVar.j(allocate, 56L);
        this.f94046g = fVar.j(allocate, 58L);
        this.f94047h = fVar.j(allocate, 60L);
        this.f94048i = fVar.j(allocate, 62L);
    }

    @Override // vl.c.b
    public c.a a(long j11, int i11) throws IOException {
        return new b(this.f94057m, this, j11, i11);
    }

    @Override // vl.c.b
    public c.AbstractC1267c b(long j11) throws IOException {
        return new h(this.f94057m, this, j11);
    }

    @Override // vl.c.b
    public c.d c(int i11) throws IOException {
        return new j(this.f94057m, this, i11);
    }
}
