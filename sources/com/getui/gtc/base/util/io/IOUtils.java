package com.getui.gtc.base.util.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes6.dex */
public class IOUtils {
    public static final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    static final char pad = '=';

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void encode(InputStream inputStream, OutputStream outputStream, int i11) throws IOException {
        Base64OutputStream base64OutputStream = new Base64OutputStream(outputStream, i11);
        copy(inputStream, base64OutputStream);
        base64OutputStream.commit();
    }

    public static byte[] gzip(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    safeClose(gZIPOutputStream2);
                    safeClose(byteArrayOutputStream);
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    safeClose(gZIPOutputStream);
                    safeClose(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    public static byte[] readFile(File file) throws IOException {
        FileInputStream fileInputStream;
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th3) {
                th2 = th3;
                byteArrayOutputStream = null;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                }
                return byteArray;
            } catch (Throwable th4) {
                th2 = th4;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (byteArrayOutputStream == null) {
                    throw th2;
                }
                try {
                    byteArrayOutputStream.close();
                    throw th2;
                } catch (IOException unused4) {
                    throw th2;
                }
            }
        } catch (Throwable th5) {
            fileInputStream = null;
            th2 = th5;
            byteArrayOutputStream = null;
        }
    }

    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void saveToFile(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        safeClose(fileOutputStream2);
                        return;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                safeClose(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable, java.io.InputStream, java.util.zip.GZIPInputStream] */
    public static byte[] unGzip(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream2;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ?? gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = gZIPInputStream.read();
                            if (read == -1) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                safeClose(gZIPInputStream);
                                safeClose(byteArrayOutputStream);
                                safeClose(byteArrayInputStream);
                                return byteArray;
                            }
                            byteArrayOutputStream.write(read);
                        } catch (Throwable th3) {
                            th2 = th3;
                            byteArrayOutputStream2 = gZIPInputStream;
                            safeClose(byteArrayOutputStream2);
                            safeClose(byteArrayOutputStream);
                            safeClose(byteArrayInputStream);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    byteArrayOutputStream = null;
                    th2 = th4;
                    byteArrayOutputStream2 = gZIPInputStream;
                }
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                th2 = th;
                byteArrayOutputStream2 = byteArrayOutputStream;
                safeClose(byteArrayOutputStream2);
                safeClose(byteArrayOutputStream);
                safeClose(byteArrayInputStream);
                throw th2;
            }
        } catch (Throwable th6) {
            th = th6;
            byteArrayInputStream = null;
            byteArrayOutputStream = null;
        }
    }

    public static void copy(byte[] bArr, OutputStream outputStream) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return;
                } else {
                    outputStream.write(bArr2, 0, read);
                }
            }
        } catch (IOException e11) {
            safeClose(byteArrayInputStream);
            throw e11;
        }
    }

    public static byte[] encode(byte[] bArr, int i11) throws RuntimeException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                encode(byteArrayInputStream, byteArrayOutputStream, i11);
                safeClose(byteArrayInputStream);
                safeClose(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e11) {
                throw new RuntimeException("Unexpected I/O error", e11);
            }
        } catch (Throwable th2) {
            safeClose(byteArrayInputStream);
            safeClose(byteArrayOutputStream);
            throw th2;
        }
    }

    public static void saveToFile(InputStream inputStream, String str) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        safeClose(fileOutputStream2);
                        return;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                safeClose(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void saveToFile(byte[] bArr, File file) throws IOException {
        FileOutputStream fileOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    safeClose(byteArrayInputStream);
                    safeClose(fileOutputStream);
                    return;
                }
                fileOutputStream.write(bArr2, 0, read);
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream2 = byteArrayInputStream;
            safeClose(byteArrayInputStream2);
            safeClose(fileOutputStream);
            throw th;
        }
    }
}
