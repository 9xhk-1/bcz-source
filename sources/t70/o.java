package t70;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class o implements f {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f89970a;

    public o(z70.b bVar) {
        e80.a.j(bVar, "ByteBuffer allocator");
        this.f89970a = bVar.a(2048);
    }

    @Override // t70.f
    public void a(m70.a aVar, m70.g gVar) throws IOException {
        do {
            this.f89970a.clear();
        } while (aVar.read(this.f89970a) > 0);
    }

    @Override // t70.f
    public void b() {
    }
}
