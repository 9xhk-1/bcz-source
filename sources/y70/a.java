package y70;

import ix.g;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a implements d {
    @Override // y70.d
    public c a(int i11) {
        return new C1348a(i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y70.a$a, reason: collision with other inner class name */
    public static final class C1348a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f99489a;

        public C1348a(int i11) {
            e80.a.k(i11, g.b.f62794h);
            this.f99489a = ByteBuffer.allocate(i11);
        }

        @Override // y70.c
        public boolean a() {
            return this.f99489a.position() > 0;
        }

        @Override // y70.c
        public ByteBuffer acquire() {
            return this.f99489a;
        }

        @Override // y70.c
        public boolean b() {
            return true;
        }

        @Override // y70.c
        public void release() {
        }
    }
}
