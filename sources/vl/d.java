package vl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import vl.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d extends c.b {

    /* renamed from: m, reason: collision with root package name */
    public final f f94056m;

    public d(boolean z11, f fVar) throws IOException {
        this.f94040a = z11;
        this.f94056m = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z11 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f94041b = fVar.j(allocate, 16L);
        this.f94042c = fVar.r(allocate, 28L);
        this.f94043d = fVar.r(allocate, 32L);
        this.f94044e = fVar.j(allocate, 42L);
        this.f94045f = fVar.j(allocate, 44L);
        this.f94046g = fVar.j(allocate, 46L);
        this.f94047h = fVar.j(allocate, 48L);
        this.f94048i = fVar.j(allocate, 50L);
    }

    @Override // vl.c.b
    public c.a a(long j11, int i11) throws IOException {
        return new a(this.f94056m, this, j11, i11);
    }

    @Override // vl.c.b
    public c.AbstractC1267c b(long j11) throws IOException {
        return new g(this.f94056m, this, j11);
    }

    @Override // vl.c.b
    public c.d c(int i11) throws IOException {
        return new i(this.f94056m, this, i11);
    }
}
