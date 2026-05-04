package z70;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f implements k70.a, a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f101090d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f101091e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final b f101092a;

    /* renamed from: b, reason: collision with root package name */
    public int f101093b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f101094c;

    public f(int i11, b bVar) {
        this.f101094c = null;
        e80.a.j(bVar, "ByteBuffer allocator");
        this.f101092a = bVar;
        this.f101094c = bVar.a(i11);
        this.f101093b = 0;
    }

    public boolean a() {
        v();
        return this.f101094c.hasRemaining();
    }

    @Override // k70.a
    public int available() {
        u();
        return this.f101094c.remaining();
    }

    @Override // k70.a
    public int d() {
        return this.f101094c.capacity();
    }

    @Override // k70.a
    public int length() {
        v();
        return this.f101094c.remaining();
    }

    public void p() {
        this.f101094c.clear();
        this.f101093b = 0;
    }

    public void q(int i11) {
        if (i11 > this.f101094c.capacity()) {
            s(i11);
        }
    }

    public void r() throws BufferOverflowException {
        int capacity = (this.f101094c.capacity() + 1) << 1;
        if (capacity < 0) {
            if (2147483639 <= this.f101094c.capacity()) {
                throw new BufferOverflowException();
            }
            capacity = 2147483639;
        }
        s(capacity);
    }

    public final void s(int i11) {
        ByteBuffer byteBuffer = this.f101094c;
        this.f101094c = this.f101092a.a(i11);
        byteBuffer.flip();
        this.f101094c.put(byteBuffer);
    }

    public int t() {
        return this.f101093b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[mode=");
        if (t() == 0) {
            sb2.append("in");
        } else {
            sb2.append("out");
        }
        sb2.append(" pos=");
        sb2.append(this.f101094c.position());
        sb2.append(" lim=");
        sb2.append(this.f101094c.limit());
        sb2.append(" cap=");
        sb2.append(this.f101094c.capacity());
        sb2.append("]");
        return sb2.toString();
    }

    public void u() {
        if (this.f101093b != 0) {
            if (this.f101094c.hasRemaining()) {
                this.f101094c.compact();
            } else {
                this.f101094c.clear();
            }
            this.f101093b = 0;
        }
    }

    public void v() {
        if (this.f101093b != 1) {
            this.f101094c.flip();
            this.f101093b = 1;
        }
    }
}
