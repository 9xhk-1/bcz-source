package com.tencent.open.utils;

import en.r;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final n f44573a = new n(101010256);

    /* renamed from: b, reason: collision with root package name */
    private static final o f44574b = new o(38651);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Properties f44575a;

        /* renamed from: b, reason: collision with root package name */
        byte[] f44576b;

        private a() {
            this.f44575a = new Properties();
        }

        public void a(byte[] bArr) throws IOException {
            if (bArr == null) {
                return;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int length = b.f44574b.a().length;
            byte[] bArr2 = new byte[length];
            wrap.get(bArr2);
            if (!b.f44574b.equals(new o(bArr2))) {
                throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + "]");
            }
            if (bArr.length - length <= 2) {
                return;
            }
            byte[] bArr3 = new byte[2];
            wrap.get(bArr3);
            int b11 = new o(bArr3).b();
            if ((bArr.length - length) - 2 < b11) {
                return;
            }
            byte[] bArr4 = new byte[b11];
            wrap.get(bArr4);
            this.f44575a.load(new ByteArrayInputStream(bArr4));
            int length2 = ((bArr.length - length) - b11) - 2;
            if (length2 > 0) {
                byte[] bArr5 = new byte[length2];
                this.f44576b = bArr5;
                wrap.get(bArr5);
            }
        }

        public String toString() {
            return "ApkExternalInfo [p=" + this.f44575a + ", otherData=" + Arrays.toString(this.f44576b) + "]";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(File file, String str) throws IOException {
        RandomAccessFile randomAccessFile = null;
        Object[] objArr = 0;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, r.f50027a);
            try {
                byte[] a11 = a(randomAccessFile2);
                if (a11 == null) {
                    randomAccessFile2.close();
                    return null;
                }
                a aVar = new a();
                aVar.a(a11);
                String property = aVar.f44575a.getProperty(str);
                randomAccessFile2.close();
                return property;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(File file) throws IOException {
        return a(file, "channelNo");
    }

    private static byte[] a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] a11 = f44573a.a();
        int read = randomAccessFile.read();
        while (read != -1) {
            if (read == a11[0] && randomAccessFile.read() == a11[1] && randomAccessFile.read() == a11[2] && randomAccessFile.read() == a11[3]) {
                randomAccessFile.seek(length + 20);
                byte[] bArr = new byte[2];
                randomAccessFile.readFully(bArr);
                int b11 = new o(bArr).b();
                if (b11 == 0) {
                    return null;
                }
                byte[] bArr2 = new byte[b11];
                randomAccessFile.read(bArr2);
                return bArr2;
            }
            length--;
            randomAccessFile.seek(length);
            read = randomAccessFile.read();
        }
        throw new ZipException("archive is not a ZIP archive");
    }
}
