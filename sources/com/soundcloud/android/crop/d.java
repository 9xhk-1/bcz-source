package com.soundcloud.android.crop;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.soundcloud.android.crop.g;
import en.r;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f41677a = "file";

    /* renamed from: b, reason: collision with root package name */
    public static final String f41678b = "content";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends g.a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final g f41679a;

        /* renamed from: b, reason: collision with root package name */
        public final ProgressDialog f41680b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f41681c;

        /* renamed from: d, reason: collision with root package name */
        public final Handler f41682d;

        /* renamed from: e, reason: collision with root package name */
        public final Runnable f41683e = new RunnableC0498a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.soundcloud.android.crop.d$a$a, reason: collision with other inner class name */
        public class RunnableC0498a implements Runnable {
            public RunnableC0498a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f41679a.J0(a.this);
                if (a.this.f41680b.getWindow() != null) {
                    a.this.f41680b.dismiss();
                }
            }
        }

        public a(g activity, Runnable job, ProgressDialog dialog, Handler handler) {
            this.f41679a = activity;
            this.f41680b = dialog;
            this.f41681c = job;
            activity.I0(this);
            this.f41682d = handler;
        }

        @Override // com.soundcloud.android.crop.g.a, com.soundcloud.android.crop.g.b
        public void b(g activity) {
            this.f41683e.run();
            this.f41682d.removeCallbacks(this.f41683e);
        }

        @Override // com.soundcloud.android.crop.g.a, com.soundcloud.android.crop.g.b
        public void c(g activity) {
            this.f41680b.show();
        }

        @Override // com.soundcloud.android.crop.g.a, com.soundcloud.android.crop.g.b
        public void d(g activity) {
            this.f41680b.hide();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f41681c.run();
            } finally {
                this.f41682d.post(this.f41683e);
            }
        }
    }

    public static void a(@Nullable Closeable c11) {
        if (c11 == null) {
            return;
        }
        try {
            c11.close();
        } catch (Throwable unused) {
        }
    }

    public static boolean b(File sourceFile, File destFile) {
        if (sourceFile != null && destFile != null) {
            try {
                ExifInterface exifInterface = new ExifInterface(sourceFile.getAbsolutePath());
                ExifInterface exifInterface2 = new ExifInterface(destFile.getAbsolutePath());
                exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION));
                exifInterface2.saveAttributes();
                return true;
            } catch (IOException e11) {
                f.b("Error copying Exif data", e11);
            }
        }
        return false;
    }

    public static int c(File imageFile) {
        if (imageFile == null) {
            return 0;
        }
        try {
            int attributeInt = new ExifInterface(imageFile.getAbsolutePath()).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e11) {
            f.b("Error getting Exif data", e11);
            return 0;
        }
    }

    public static int d(InputStream stream) {
        if (stream == null) {
            return 0;
        }
        try {
            int attributeInt = new ExifInterface(stream).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e11) {
            f.b("Error getting Exif data", e11);
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r10 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        if (r10 == null) goto L44;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File e(android.content.Context r9, android.content.ContentResolver r10, android.net.Uri r11) {
        /*
            r1 = 0
            if (r11 != 0) goto L4
            return r1
        L4:
            java.lang.String r0 = "file"
            java.lang.String r2 = r11.getScheme()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a
            java.io.File r9 = new java.io.File
            java.lang.String r10 = r11.getPath()
            r9.<init>(r10)
            return r9
        L1a:
            java.lang.String r0 = "content"
            java.lang.String r2 = r11.getScheme()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8d
            java.lang.String r0 = "_data"
            java.lang.String r2 = "_display_name"
            java.lang.String[] r5 = new java.lang.String[]{r0, r2}
            r7 = 0
            r8 = 0
            r6 = 0
            r3 = r10
            r4 = r11
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L76 java.lang.SecurityException -> L79 java.lang.IllegalArgumentException -> L7d
            if (r10 == 0) goto L70
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L50 java.lang.IllegalArgumentException -> L54 java.lang.SecurityException -> L7a
            if (r11 == 0) goto L70
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Throwable -> L50 java.lang.IllegalArgumentException -> L54 java.lang.SecurityException -> L7a
            java.lang.String r5 = "content://com.google.android.gallery3d"
            boolean r11 = r11.startsWith(r5)     // Catch: java.lang.Throwable -> L50 java.lang.IllegalArgumentException -> L54 java.lang.SecurityException -> L7a
            if (r11 == 0) goto L56
            int r11 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L50 java.lang.IllegalArgumentException -> L54 java.lang.SecurityException -> L7a
            goto L5a
        L50:
            r0 = move-exception
            r9 = r0
            r1 = r10
            goto L87
        L54:
            r1 = r10
            goto L7d
        L56:
            int r11 = r10.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L50 java.lang.IllegalArgumentException -> L54 java.lang.SecurityException -> L7a
        L5a:
            r0 = -1
            if (r11 == r0) goto L70
            java.lang.String r11 = r10.getString(r11)     // Catch: java.lang.Throwable -> L50 java.lang.IllegalArgumentException -> L54 java.lang.SecurityException -> L7a
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L50 java.lang.IllegalArgumentException -> L54 java.lang.SecurityException -> L7a
            if (r0 != 0) goto L70
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L50 java.lang.IllegalArgumentException -> L54 java.lang.SecurityException -> L7a
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L50 java.lang.IllegalArgumentException -> L54 java.lang.SecurityException -> L7a
            r10.close()
            return r0
        L70:
            if (r10 == 0) goto L8d
        L72:
            r10.close()
            goto L8d
        L76:
            r0 = move-exception
            r9 = r0
            goto L87
        L79:
            r10 = r1
        L7a:
            if (r10 == 0) goto L8d
            goto L72
        L7d:
            java.io.File r9 = f(r9, r3, r4)     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L86
            r1.close()
        L86:
            return r9
        L87:
            if (r1 == 0) goto L8c
            r1.close()
        L8c:
            throw r9
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.soundcloud.android.crop.d.e(android.content.Context, android.content.ContentResolver, android.net.Uri):java.io.File");
    }

    @Nullable
    public static File f(Context context, ContentResolver resolver, Uri uri) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        String g11;
        FileInputStream fileInputStream2 = null;
        if (uri == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(resolver.openFileDescriptor(uri, r.f50027a).getFileDescriptor());
            try {
                g11 = g(context);
                fileOutputStream = new FileOutputStream(g11);
            } catch (IOException unused) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (IOException unused2) {
            fileOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    File file = new File(g11);
                    a(fileInputStream);
                    a(fileOutputStream);
                    return file;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused3) {
            a(fileInputStream);
            a(fileOutputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            a(fileInputStream2);
            a(fileOutputStream);
            throw th;
        }
    }

    public static String g(Context context) throws IOException {
        return File.createTempFile("image", vb.a.f93812o, context.getCacheDir()).getAbsolutePath();
    }

    public static void h(g activity, String title, String message, Runnable job, Handler handler) {
        new Thread(new a(activity, job, ProgressDialog.show(activity, title, message, true, false), handler)).start();
    }
}
