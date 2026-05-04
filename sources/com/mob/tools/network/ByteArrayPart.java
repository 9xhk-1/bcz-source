package com.mob.tools.network;

import com.mob.tools.utils.Data;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

@Deprecated
/* loaded from: classes7.dex */
public class ByteArrayPart extends HTTPPart {

    /* renamed from: a, reason: collision with root package name */
    private BufferedByteArrayOutputStream f41309a;

    @Override // com.mob.tools.network.HTTPPart
    public InputStream a() throws Throwable {
        BufferedByteArrayOutputStream bufferedByteArrayOutputStream = this.f41309a;
        if (bufferedByteArrayOutputStream == null) {
            return new ByteArrayInputStream(new byte[0]);
        }
        byte[] buffer = bufferedByteArrayOutputStream.getBuffer();
        return (buffer == null || this.f41309a.size() <= 0) ? new ByteArrayInputStream(new byte[0]) : new ByteArrayInputStream(buffer, 0, this.f41309a.size());
    }

    public ByteArrayPart append(byte[] bArr) throws Throwable {
        if (this.f41309a == null) {
            this.f41309a = new BufferedByteArrayOutputStream(bArr.length);
        }
        this.f41309a.write(bArr);
        this.f41309a.flush();
        return this;
    }

    @Override // com.mob.tools.network.HTTPPart
    public long b() throws Throwable {
        if (this.f41309a == null) {
            return 0L;
        }
        return r0.size();
    }

    public String toString() {
        byte[] buffer;
        BufferedByteArrayOutputStream bufferedByteArrayOutputStream = this.f41309a;
        if (bufferedByteArrayOutputStream == null || (buffer = bufferedByteArrayOutputStream.getBuffer()) == null) {
            return null;
        }
        return Data.byteToHex(buffer, 0, this.f41309a.size());
    }
}
