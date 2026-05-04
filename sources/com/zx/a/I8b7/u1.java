package com.zx.a.I8b7;

import androidx.collection.SieveCacheKt;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class u1 implements Closeable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends u1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0 f46711a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f46712b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InputStream f46713c;

        public a(x0 x0Var, long j11, InputStream inputStream) {
            this.f46711a = x0Var;
            this.f46712b = j11;
            this.f46713c = inputStream;
        }
    }

    public static u1 a(x0 x0Var, long j11, InputStream inputStream) {
        if (inputStream != null) {
            return new a(x0Var, j11, inputStream);
        }
        throw new NullPointerException("byte stream is null");
    }

    public final String b() throws IOException {
        return new String(a(), StandardCharsets.UTF_8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c2.a(((a) this).f46713c);
    }

    public final byte[] a() throws IOException {
        a aVar = (a) this;
        long j11 = aVar.f46712b;
        if (j11 <= SieveCacheKt.NodeLinkMask) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = aVar.f46713c;
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    c2.a(inputStream);
                    throw th2;
                }
            }
            c2.a(inputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (j11 == -1 || j11 == byteArray.length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + j11 + ") and stream length (" + byteArray.length + ") disagree");
        }
        throw new IOException("Cannot buffer entire body for content length: " + j11);
    }
}
