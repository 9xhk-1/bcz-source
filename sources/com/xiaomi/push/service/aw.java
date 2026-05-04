package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public class aw {

    /* renamed from: a, reason: collision with root package name */
    private static long f46257a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f46258a;

        /* renamed from: a, reason: collision with other field name */
        byte[] f942a;

        public a(byte[] bArr, int i11) {
            this.f942a = bArr;
            this.f46258a = i11;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public long f46259a;

        /* renamed from: a, reason: collision with other field name */
        public Bitmap f943a;

        public b(Bitmap bitmap, long j11) {
            this.f943a = bitmap;
            this.f46259a = j11;
        }
    }

    private static int a(Context context, InputStream inputStream) {
        int i11;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("decode dimension failed for bitmap.");
            return 1;
        }
        int round = Math.round((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f);
        int i12 = options.outWidth;
        if (i12 <= round || (i11 = options.outHeight) <= round) {
            return 1;
        }
        return Math.min(i12 / round, i11 / round);
    }

    private static Bitmap b(Context context, String str) {
        Throwable th2;
        FileInputStream fileInputStream;
        Bitmap bitmap;
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon", com.xiaomi.push.bo.a(str));
        FileInputStream fileInputStream2 = null;
        Bitmap bitmap2 = null;
        fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e11) {
                e = e11;
                bitmap = null;
            }
        } catch (Throwable th3) {
            FileInputStream fileInputStream3 = fileInputStream2;
            th2 = th3;
            fileInputStream = fileInputStream3;
        }
        try {
            bitmap2 = BitmapFactory.decodeStream(fileInputStream);
            file.setLastModified(System.currentTimeMillis());
            com.xiaomi.push.y.a((Closeable) fileInputStream);
            return bitmap2;
        } catch (Exception e12) {
            e = e12;
            Bitmap bitmap3 = bitmap2;
            fileInputStream2 = fileInputStream;
            bitmap = bitmap3;
            com.xiaomi.channel.commonutils.logger.b.a(e);
            com.xiaomi.push.y.a((Closeable) fileInputStream2);
            return bitmap;
        } catch (Throwable th4) {
            th2 = th4;
            com.xiaomi.push.y.a((Closeable) fileInputStream);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static Bitmap a(Context context, String str) {
        InputStream inputStream;
        InputStream inputStream2;
        Uri parse = Uri.parse(str);
        ?? r02 = 0;
        r02 = 0;
        try {
            try {
                inputStream = context.getContentResolver().openInputStream(parse);
            } catch (Throwable th2) {
                th = th2;
                r02 = context;
            }
            try {
                int a11 = a(context, inputStream);
                inputStream2 = context.getContentResolver().openInputStream(parse);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = a11;
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2, null, options);
                    com.xiaomi.push.y.a((Closeable) inputStream2);
                    com.xiaomi.push.y.a((Closeable) inputStream);
                    return decodeStream;
                } catch (IOException e11) {
                    e = e11;
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    com.xiaomi.push.y.a((Closeable) inputStream2);
                    com.xiaomi.push.y.a((Closeable) inputStream);
                    return null;
                }
            } catch (IOException e12) {
                e = e12;
                inputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
                com.xiaomi.push.y.a((Closeable) r02);
                com.xiaomi.push.y.a((Closeable) inputStream);
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
            inputStream2 = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        r1.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:59:0x009c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.xiaomi.push.service.aw.a a(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.aw.a(java.lang.String, boolean):com.xiaomi.push.service.aw$a");
    }

    public static b a(Context context, String str, boolean z11) {
        ByteArrayInputStream byteArrayInputStream = null;
        b bVar = new b(null, 0L);
        Bitmap b11 = b(context, str);
        try {
            if (b11 != null) {
                bVar.f943a = b11;
                return bVar;
            }
            try {
                a a11 = a(str, z11);
                if (a11 == null) {
                    com.xiaomi.push.y.a((Closeable) null);
                    return bVar;
                }
                bVar.f46259a = a11.f46258a;
                byte[] bArr = a11.f942a;
                if (bArr != null) {
                    if (z11) {
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                        try {
                            int a12 = a(context, byteArrayInputStream2);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = a12;
                            bVar.f943a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                            byteArrayInputStream = byteArrayInputStream2;
                        } catch (Exception e11) {
                            e = e11;
                            byteArrayInputStream = byteArrayInputStream2;
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                            com.xiaomi.push.y.a((Closeable) byteArrayInputStream);
                            return bVar;
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayInputStream = byteArrayInputStream2;
                            com.xiaomi.push.y.a((Closeable) byteArrayInputStream);
                            throw th;
                        }
                    } else {
                        bVar.f943a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    }
                }
                a(context, a11.f942a, str);
                com.xiaomi.push.y.a((Closeable) byteArrayInputStream);
                return bVar;
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void a(Context context) {
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (file.exists()) {
            if (f46257a == 0) {
                f46257a = com.xiaomi.push.x.a(file);
            }
            if (f46257a > 15728640) {
                try {
                    File[] listFiles = file.listFiles();
                    for (int i11 = 0; i11 < listFiles.length; i11++) {
                        if (!listFiles[i11].isDirectory() && Math.abs(System.currentTimeMillis() - listFiles[i11].lastModified()) > 1209600) {
                            listFiles[i11].delete();
                        }
                    }
                } catch (Exception e11) {
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                }
                f46257a = 0L;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.Context r5, byte[] r6, java.lang.String r7) {
        /*
            if (r6 != 0) goto L8
            java.lang.String r5 = "cannot save small icon cause bitmap is null"
            com.xiaomi.channel.commonutils.logger.b.m5639a(r5)
            return
        L8:
            a(r5)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = r5.getCacheDir()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = "mipush_icon"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L37
            r0.mkdirs()
        L37:
            java.io.File r1 = new java.io.File
            java.lang.String r7 = com.xiaomi.push.bo.a(r7)
            r1.<init>(r0, r7)
            r7 = 0
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            if (r0 != 0) goto L51
            r1.createNewFile()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            goto L51
        L4b:
            r5 = move-exception
            r0 = r7
            goto Lad
        L4e:
            r6 = move-exception
            r0 = r7
            goto L71
        L51:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            r3.write(r6)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r3.flush()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            com.xiaomi.push.y.a(r3)
        L64:
            com.xiaomi.push.y.a(r0)
            goto L78
        L68:
            r5 = move-exception
            r7 = r3
            goto Lad
        L6b:
            r6 = move-exception
            r7 = r3
            goto L71
        L6e:
            r5 = move-exception
            goto Lad
        L70:
            r6 = move-exception
        L71:
            com.xiaomi.channel.commonutils.logger.b.a(r6)     // Catch: java.lang.Throwable -> L6e
            com.xiaomi.push.y.a(r7)
            goto L64
        L78:
            long r6 = com.xiaomi.push.service.aw.f46257a
            r3 = 0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 != 0) goto Lac
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.io.File r5 = r5.getCacheDir()
            java.lang.String r5 = r5.getPath()
            r7.append(r5)
            java.lang.String r5 = java.io.File.separator
            r7.append(r5)
            r7.append(r2)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            long r5 = com.xiaomi.push.x.a(r6)
            long r0 = r1.length()
            long r5 = r5 + r0
            com.xiaomi.push.service.aw.f46257a = r5
        Lac:
            return
        Lad:
            com.xiaomi.push.y.a(r7)
            com.xiaomi.push.y.a(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.aw.a(android.content.Context, byte[], java.lang.String):void");
    }
}
