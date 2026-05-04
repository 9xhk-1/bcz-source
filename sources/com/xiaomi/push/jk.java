package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes8.dex */
public class jk extends jn {

    /* renamed from: a, reason: collision with root package name */
    protected InputStream f46176a;

    /* renamed from: a, reason: collision with other field name */
    protected OutputStream f847a;

    public jk() {
        this.f46176a = null;
        this.f847a = null;
    }

    @Override // com.xiaomi.push.jn
    public int a(byte[] bArr, int i11, int i12) {
        InputStream inputStream = this.f46176a;
        if (inputStream == null) {
            throw new jo(1, "Cannot read from null inputStream");
        }
        try {
            int read = inputStream.read(bArr, i11, i12);
            if (read >= 0) {
                return read;
            }
            throw new jo(4);
        } catch (IOException e11) {
            throw new jo(0, e11);
        }
    }

    public jk(OutputStream outputStream) {
        this.f46176a = null;
        this.f847a = outputStream;
    }

    @Override // com.xiaomi.push.jn
    /* renamed from: a, reason: collision with other method in class */
    public void mo6179a(byte[] bArr, int i11, int i12) {
        OutputStream outputStream = this.f847a;
        if (outputStream == null) {
            throw new jo(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i11, i12);
        } catch (IOException e11) {
            throw new jo(0, e11);
        }
    }
}
