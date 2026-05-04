package y70;

import ix.g;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b implements d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public ByteBuffer f99490a;

        /* renamed from: b, reason: collision with root package name */
        public final int f99491b;

        public a(int i11) {
            e80.a.k(i11, g.b.f62794h);
            this.f99491b = i11;
        }

        @Override // y70.c
        public boolean a() {
            ByteBuffer byteBuffer = this.f99490a;
            return byteBuffer != null && byteBuffer.position() > 0;
        }

        @Override // y70.c
        public ByteBuffer acquire() {
            ByteBuffer byteBuffer = this.f99490a;
            if (byteBuffer != null) {
                return byteBuffer;
            }
            ByteBuffer allocate = ByteBuffer.allocate(this.f99491b);
            this.f99490a = allocate;
            return allocate;
        }

        @Override // y70.c
        public boolean b() {
            return this.f99490a != null;
        }

        @Override // y70.c
        public void release() {
            this.f99490a = null;
        }
    }

    @Override // y70.d
    public c a(int i11) {
        return new a(i11);
    }
}
