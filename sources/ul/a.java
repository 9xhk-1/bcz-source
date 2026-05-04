package ul;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ul.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a implements d.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f92280a = 5;

    /* renamed from: b, reason: collision with root package name */
    public static final int f92281b = 4096;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ul.a$a, reason: collision with other inner class name */
    public static class C1240a {

        /* renamed from: a, reason: collision with root package name */
        public ZipFile f92282a;

        /* renamed from: b, reason: collision with root package name */
        public ZipEntry f92283b;

        public C1240a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f92282a = zipFile;
            this.f92283b = zipEntry;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    @Override // ul.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r9, java.lang.String[] r10, java.lang.String r11, java.io.File r12, ul.e r13) {
        /*
            r8 = this;
            r0 = 0
            ul.a$a r1 = r8.d(r9, r10, r11, r13)     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto L8f
            r9 = 0
            r10 = r9
        L9:
            int r2 = r10 + 1
            r3 = 5
            if (r10 >= r3) goto L84
            java.lang.String r10 = "Found %s! Extracting..."
            java.lang.Object[] r3 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> L25
            r13.m(r10, r3)     // Catch: java.lang.Throwable -> L25
            boolean r10 = r12.exists()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L82
            if (r10 != 0) goto L29
            boolean r10 = r12.createNewFile()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L82
            if (r10 != 0) goto L29
            goto L82
        L25:
            r9 = move-exception
            r0 = r1
            goto La4
        L29:
            java.util.zip.ZipFile r10 = r1.f92282a     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.io.FileNotFoundException -> L78
            java.util.zip.ZipEntry r3 = r1.f92283b     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.io.FileNotFoundException -> L78
            java.io.InputStream r10 = r10.getInputStream(r3)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.io.FileNotFoundException -> L78
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6e java.io.FileNotFoundException -> L70
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6e java.io.FileNotFoundException -> L70
            long r4 = r8.c(r10, r3)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L68
            java.io.FileDescriptor r6 = r3.getFD()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L68
            r6.sync()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L68
            long r6 = r12.length()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L68
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L50
        L49:
            r8.b(r10)     // Catch: java.lang.Throwable -> L25
            r8.b(r3)     // Catch: java.lang.Throwable -> L25
            goto L82
        L50:
            r8.b(r10)     // Catch: java.lang.Throwable -> L25
            r8.b(r3)     // Catch: java.lang.Throwable -> L25
            r10 = 1
            r12.setReadable(r10, r9)     // Catch: java.lang.Throwable -> L25
            r12.setExecutable(r10, r9)     // Catch: java.lang.Throwable -> L25
            r12.setWritable(r10)     // Catch: java.lang.Throwable -> L25
            java.util.zip.ZipFile r9 = r1.f92282a     // Catch: java.io.IOException -> L8e
            if (r9 == 0) goto L8e
        L64:
            r9.close()     // Catch: java.io.IOException -> L8e
            goto L8e
        L68:
            r9 = move-exception
        L69:
            r0 = r10
            goto L7b
        L6b:
            r9 = move-exception
            r3 = r0
            goto L69
        L6e:
            r3 = r0
            goto L49
        L70:
            r3 = r0
            goto L49
        L72:
            r9 = move-exception
            r3 = r0
            goto L7b
        L75:
            r10 = r0
            r3 = r10
            goto L49
        L78:
            r10 = r0
            r3 = r10
            goto L49
        L7b:
            r8.b(r0)     // Catch: java.lang.Throwable -> L25
            r8.b(r3)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L82:
            r10 = r2
            goto L9
        L84:
            java.lang.String r9 = "FATAL! Couldn't extract the library from the APK!"
            r13.l(r9)     // Catch: java.lang.Throwable -> L25
            java.util.zip.ZipFile r9 = r1.f92282a     // Catch: java.io.IOException -> L8e
            if (r9 == 0) goto L8e
            goto L64
        L8e:
            return
        L8f:
            java.lang.String[] r9 = r8.e(r9, r11)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L94
            goto L9d
        L94:
            r9 = move-exception
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L25
        L9d:
            com.getkeepsafe.relinker.MissingLibraryException r12 = new com.getkeepsafe.relinker.MissingLibraryException     // Catch: java.lang.Throwable -> L25
            r12.<init>(r11, r10, r9)     // Catch: java.lang.Throwable -> L25
            throw r12     // Catch: java.lang.Throwable -> L25
        La3:
            r9 = move-exception
        La4:
            if (r0 == 0) goto Lad
            java.util.zip.ZipFile r10 = r0.f92282a     // Catch: java.io.IOException -> Lad
            if (r10 == 0) goto Lad
            r10.close()     // Catch: java.io.IOException -> Lad
        Lad:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ul.a.a(android.content.Context, java.lang.String[], java.lang.String, java.io.File, ul.e):void");
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j11 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j11;
            }
            outputStream.write(bArr, 0, read);
            j11 += read;
        }
    }

    public final C1240a d(Context context, String[] strArr, String str, e eVar) {
        String[] f11 = f(context);
        int length = f11.length;
        int i11 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i11 >= length) {
                return null;
            }
            String str2 = f11[i11];
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i12 = i13;
                }
            }
            if (zipFile != null) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    if (i14 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(e.f92290g);
                            char c11 = File.separatorChar;
                            sb2.append(c11);
                            sb2.append(str3);
                            sb2.append(c11);
                            sb2.append(str);
                            String sb3 = sb2.toString();
                            eVar.m("Looking for %s in APK %s...", sb3, str2);
                            ZipEntry entry = zipFile.getEntry(sb3);
                            if (entry != null) {
                                return new C1240a(zipFile, entry);
                            }
                        }
                        i14 = i15;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i11++;
        }
    }

    public final String[] e(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e.f92290g);
        char c11 = File.separatorChar;
        sb2.append(c11);
        sb2.append("([^\\");
        sb2.append(c11);
        sb2.append("]*)");
        sb2.append(c11);
        sb2.append(str);
        Pattern compile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final String[] f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
