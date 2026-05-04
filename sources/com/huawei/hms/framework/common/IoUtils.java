package com.huawei.hms.framework.common;

import android.database.Cursor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class IoUtils {
    private static final int BUFF_SIZE = 4096;
    private static final int MAX_SIZE = 16777216;

    private IoUtils() {
    }

    public static void close(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static void closeSecure(Reader reader) {
        closeSecure((Closeable) reader);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        String packageName = ContextHolder.getAppContext() != null ? ContextHolder.getAppContext().getPackageName() : "";
        byte[] bArr = new byte[4096];
        long j11 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j11;
            }
            if (j11 > j60.e.B && !"com.huawei.health".equals(packageName)) {
                throw new IOException("input data too large for byte.");
            }
            outputStream.write(bArr, 0, read);
            j11 += read;
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void closeSecure(Writer writer) {
        closeSecure((Closeable) writer);
    }

    public static void closeSecure(InputStream inputStream) {
        closeSecure((Closeable) inputStream);
    }

    public static void closeSecure(OutputStream outputStream) {
        closeSecure((Closeable) outputStream);
    }

    public static void closeSecure(Closeable closeable) {
        if (closeable == null) {
            Logger.w("IOUtil", "closeable is null");
            return;
        }
        try {
            closeable.close();
        } catch (IOException e11) {
            Logger.w("IOUtil", "closeSecure IOException", e11);
        }
    }
}
