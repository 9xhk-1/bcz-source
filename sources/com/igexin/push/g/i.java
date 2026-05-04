package com.igexin.push.g;

import androidx.media3.common.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    String f38703a;

    /* renamed from: b, reason: collision with root package name */
    String f38704b;

    /* renamed from: c, reason: collision with root package name */
    File f38705c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f38706d;

    private i(File file) {
        this.f38705c = file;
    }

    private static String a(byte[] bArr) {
        Object obj = null;
        if (bArr != null && bArr.length >= 10) {
            byte b11 = bArr[0];
            if (b11 == 71 && bArr[1] == 73 && bArr[2] == 70) {
                obj = "GIF";
            } else {
                byte b12 = bArr[1];
                if (b12 == 80 && bArr[2] == 78 && bArr[3] == 71) {
                    obj = "PNG";
                } else if (bArr[6] == 74 && bArr[7] == 70 && bArr[8] == 73 && bArr[9] == 70) {
                    obj = "JPG";
                } else if (b11 == 66 && b12 == 77) {
                    obj = "BMP";
                }
            }
        }
        return "JPG".equals(obj) ? "image/jpeg" : "GIF".equals(obj) ? "image/gif" : "PNG".equals(obj) ? MimeTypes.IMAGE_PNG : "BMP".equals(obj) ? MimeTypes.IMAGE_BMP : "application/octet-stream";
    }

    private String b() {
        File file;
        if (this.f38703a == null && (file = this.f38705c) != null && file.exists()) {
            this.f38703a = this.f38705c.getName();
        }
        return this.f38703a;
    }

    private String c() throws IOException {
        if (this.f38704b == null) {
            byte[] a11 = a();
            Object obj = null;
            if (a11 != null && a11.length >= 10) {
                byte b11 = a11[0];
                if (b11 == 71 && a11[1] == 73 && a11[2] == 70) {
                    obj = "GIF";
                } else {
                    byte b12 = a11[1];
                    if (b12 == 80 && a11[2] == 78 && a11[3] == 71) {
                        obj = "PNG";
                    } else if (a11[6] == 74 && a11[7] == 70 && a11[8] == 73 && a11[9] == 70) {
                        obj = "JPG";
                    } else if (b11 == 66 && b12 == 77) {
                        obj = "BMP";
                    }
                }
            }
            this.f38704b = "JPG".equals(obj) ? "image/jpeg" : "GIF".equals(obj) ? "image/gif" : "PNG".equals(obj) ? MimeTypes.IMAGE_PNG : "BMP".equals(obj) ? MimeTypes.IMAGE_BMP : "application/octet-stream";
        }
        return this.f38704b;
    }

    private i(String str) {
        this(new File(str));
    }

    private static String b(byte[] bArr) {
        if (bArr != null && bArr.length >= 10) {
            byte b11 = bArr[0];
            if (b11 == 71 && bArr[1] == 73 && bArr[2] == 70) {
                return "GIF";
            }
            byte b12 = bArr[1];
            if (b12 == 80 && bArr[2] == 78 && bArr[3] == 71) {
                return "PNG";
            }
            if (bArr[6] == 74 && bArr[7] == 70 && bArr[8] == 73 && bArr[9] == 70) {
                return "JPG";
            }
            if (b11 == 66 && b12 == 77) {
                return "BMP";
            }
        }
        return null;
    }

    public final byte[] a() throws IOException {
        File file;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        FileInputStream fileInputStream;
        if (this.f38706d == null && (file = this.f38705c) != null && file.exists()) {
            try {
                fileInputStream = new FileInputStream(this.f38705c);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = fileInputStream.read();
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(read);
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            if (fileInputStream == null) {
                                throw th2;
                            }
                            fileInputStream.close();
                            throw th2;
                        }
                    }
                    this.f38706d = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    fileInputStream.close();
                } catch (Throwable th4) {
                    byteArrayOutputStream = null;
                    th2 = th4;
                }
            } catch (Throwable th5) {
                byteArrayOutputStream = null;
                th2 = th5;
                fileInputStream = null;
            }
        }
        return this.f38706d;
    }

    private i(String str, byte[] bArr) {
        this.f38703a = str;
        this.f38706d = bArr;
    }

    private i(String str, byte[] bArr, String str2) {
        this(str, bArr);
        this.f38704b = str2;
    }

    private i(byte[] bArr) {
        this.f38706d = bArr;
    }
}
