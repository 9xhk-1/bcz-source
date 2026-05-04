package xy;

import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y0 {
    @m80.k
    public static final InputStream a(@m80.k y40.c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return new a(c0Var);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y40.c0 f98668a;

        public a(y40.c0 c0Var) {
            this.f98668a = c0Var;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f98668a.close();
        }

        @Override // java.io.InputStream
        public int read() {
            if (jz.n.a(this.f98668a)) {
                return -1;
            }
            return this.f98668a.readByte();
        }

        @Override // java.io.InputStream
        public long skip(long j11) {
            return jz.j.g(this.f98668a, j11);
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer, int i11, int i12) {
            kotlin.jvm.internal.g0.p(buffer, "buffer");
            if (jz.n.a(this.f98668a)) {
                return -1;
            }
            return jz.n.b(this.f98668a, buffer, i11, i12);
        }
    }
}
