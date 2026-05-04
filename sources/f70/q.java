package f70;

import java.nio.ByteBuffer;
import org.apache.commons.logging.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final Log f51220a;

    /* renamed from: b, reason: collision with root package name */
    public final String f51221b;

    public q(Log log, String str) {
        this.f51220a = log;
        this.f51221b = str;
    }

    public void a(int i11) {
        c(new byte[]{(byte) i11});
    }

    public void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            d(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        c(bArr);
    }

    public void c(byte[] bArr) {
        d(bArr, 0, bArr.length);
    }

    public void d(byte[] bArr, int i11, int i12) {
        j("<< ", bArr, i11, i12);
    }

    public boolean e() {
        return this.f51220a.isDebugEnabled();
    }

    public void f(int i11) {
        h(new byte[]{(byte) i11});
    }

    public void g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            i(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        h(bArr);
    }

    public void h(byte[] bArr) {
        i(bArr, 0, bArr.length);
    }

    public void i(byte[] bArr, int i11, int i12) {
        j(">> ", bArr, i11, i12);
    }

    public final void j(String str, byte[] bArr, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = 0; i13 < i12; i13++) {
            byte b11 = bArr[i11 + i13];
            if (b11 == 13) {
                sb2.append("[\\r]");
            } else if (b11 == 10) {
                sb2.append("[\\n]\"");
                sb2.insert(0, "\"");
                sb2.insert(0, str);
                this.f51220a.debug(this.f51221b + " " + sb2.toString());
                sb2.setLength(0);
            } else if (b11 < 32 || b11 > Byte.MAX_VALUE) {
                sb2.append("[0x");
                sb2.append(Integer.toHexString(b11));
                sb2.append("]");
            } else {
                sb2.append((char) b11);
            }
        }
        if (sb2.length() > 0) {
            sb2.append('\"');
            sb2.insert(0, '\"');
            sb2.insert(0, str);
            this.f51220a.debug(this.f51221b + " " + sb2.toString());
        }
    }
}
