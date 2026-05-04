package no;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.zip.Checksum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@uo.j
/* loaded from: classes7.dex */
public final class g extends c implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final t<? extends Checksum> f75262a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75263b;

    /* renamed from: c, reason: collision with root package name */
    public final String f75264c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends no.a {

        /* renamed from: b, reason: collision with root package name */
        public final Checksum f75265b;

        @Override // no.o
        public m h() {
            long value = this.f75265b.getValue();
            return g.this.f75263b == 32 ? m.i((int) value) : m.j(value);
        }

        @Override // no.a
        public void k(byte b11) {
            this.f75265b.update(b11);
        }

        @Override // no.a
        public void n(byte[] bytes, int off, int len) {
            this.f75265b.update(bytes, off, len);
        }

        public b(Checksum checksum) {
            this.f75265b = (Checksum) Preconditions.checkNotNull(checksum);
        }
    }

    public g(t<? extends Checksum> checksumSupplier, int bits, String toString) {
        this.f75262a = (t) Preconditions.checkNotNull(checksumSupplier);
        Preconditions.checkArgument(bits == 32 || bits == 64, "bits (%s) must be either 32 or 64", bits);
        this.f75263b = bits;
        this.f75264c = (String) Preconditions.checkNotNull(toString);
    }

    @Override // no.n
    public int h() {
        return this.f75263b;
    }

    @Override // no.n
    public o i() {
        return new b(this.f75262a.get());
    }

    public String toString() {
        return this.f75264c;
    }
}
