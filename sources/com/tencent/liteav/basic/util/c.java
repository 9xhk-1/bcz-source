package com.tencent.liteav.basic.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class c {
    public static boolean a(long j11) {
        return true;
    }

    public static String b(String str) {
        File file = new File(str);
        StringBuilder sb2 = new StringBuilder("");
        BufferedReader bufferedReader = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            bufferedReader2.close();
                            String sb3 = sb2.toString();
                            try {
                                bufferedReader2.close();
                                return sb3;
                            } catch (IOException e11) {
                                throw new RuntimeException("IOException occurred. ", e11);
                            }
                        }
                        sb2.append(readLine);
                    } catch (IOException e12) {
                        e = e12;
                        bufferedReader = bufferedReader2;
                        throw new RuntimeException("IOException occurred. ", e);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e13) {
                                throw new RuntimeException("IOException occurred. ", e13);
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
    }

    public static long a(File file) {
        return a(file, 5);
    }

    public static long a(File file, int i11) {
        long length;
        long j11 = 0;
        if (i11 <= 0) {
            return 0L;
        }
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    length = a(file2, i11 - 1);
                } else {
                    length = file2.length();
                }
                j11 += length;
            }
            return j11;
        } catch (Exception e11) {
            TXCLog.i("FileUtil", "getFolderSize exception " + e11.toString());
            return j11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            android.content.res.AssetManager r2 = r2.getAssets()
            r0 = 0
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            a(r2, r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            a(r2)
            r3.flush()     // Catch: java.io.IOException -> L3e
            r3.close()     // Catch: java.io.IOException -> L3e
            return
        L1b:
            r4 = move-exception
        L1c:
            r0 = r2
            goto L40
        L1e:
            r4 = move-exception
        L1f:
            r0 = r2
            goto L2c
        L21:
            r4 = move-exception
            r3 = r0
            goto L1c
        L24:
            r4 = move-exception
            r3 = r0
            goto L1f
        L27:
            r4 = move-exception
            r3 = r0
            goto L40
        L2a:
            r4 = move-exception
            r3 = r0
        L2c:
            java.lang.String r2 = "FileUtil"
            java.lang.String r1 = "copy asset file failed."
            com.tencent.liteav.basic.log.TXCLog.e(r2, r1, r4)     // Catch: java.lang.Throwable -> L3f
            a(r0)
            if (r3 == 0) goto L3e
            r3.flush()     // Catch: java.io.IOException -> L3e
            r3.close()     // Catch: java.io.IOException -> L3e
        L3e:
            return
        L3f:
            r4 = move-exception
        L40:
            a(r0)
            if (r3 == 0) goto L4b
            r3.flush()     // Catch: java.io.IOException -> L4b
            r3.close()     // Catch: java.io.IOException -> L4b
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.util.c.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static String b(Context context, String str) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open(str);
                byte[] bArr = new byte[inputStream.available()];
                if (inputStream.read(bArr) <= 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    return "";
                }
                inputStream.close();
                String str2 = new String(bArr, "utf-8");
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
                return str2;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th2;
            }
        } catch (IOException e11) {
            TXCLog.e("FileUtil", "read asset file failed.", e11);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return "";
        }
    }

    public static void a(InputStream inputStream, String str) throws IOException {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            a(inputStream, fileOutputStream);
            a(fileOutputStream);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            a(fileOutputStream2);
            throw th;
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
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

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.FileOutputStream, java.io.OutputStream] */
    public static void a(String str, byte[] bArr) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                try {
                    str = new FileOutputStream(new File((String) str));
                    try {
                        bufferedOutputStream = new BufferedOutputStream(str);
                    } catch (Exception e11) {
                        e = e11;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.close();
                    str.close();
                } catch (Exception e12) {
                    e = e12;
                    bufferedOutputStream2 = bufferedOutputStream;
                    TXCLog.e("FileUtil", "write file failed.", e);
                    if (bufferedOutputStream2 != null) {
                        bufferedOutputStream2.close();
                    }
                    if (str != 0) {
                        str.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedOutputStream2 != null) {
                        try {
                            bufferedOutputStream2.close();
                        } catch (Exception unused) {
                            throw th;
                        }
                    }
                    if (str != 0) {
                        str.close();
                    }
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
                str = 0;
            } catch (Throwable th4) {
                th = th4;
                str = 0;
            }
        } catch (Exception unused2) {
        }
    }

    public static boolean a(Context context, String str) {
        try {
            for (String str2 : context.getAssets().list("")) {
                if (str2.equals(str.trim())) {
                    TXCLog.i("isAssetFileExists", str + " exist");
                    return true;
                }
            }
            TXCLog.i("isAssetFileExists", str + " not exist");
            return false;
        } catch (IOException unused) {
            TXCLog.i("isAssetFileExists", str + " not exist");
            return false;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
