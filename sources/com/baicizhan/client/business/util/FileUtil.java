package com.baicizhan.client.business.util;

import android.content.res.AssetManager;
import android.os.Environment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FileUtil {
    private FileUtil() {
    }

    public static boolean checkDir(String dir) {
        if (!checkSD()) {
            return false;
        }
        File file = new File(dir);
        if (file.exists() || file.mkdirs()) {
            return true;
        }
        if (qb.d.b()) {
            qb.c.d("", "error fulldirObj.mkdirs:" + dir, new Object[0]);
        }
        return false;
    }

    public static boolean checkSD() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean copyFromAssetsToLocal(android.content.res.AssetManager r6, java.lang.String r7, java.lang.String r8) {
        /*
            boolean r0 = checkDir(r8)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            getAllPathsFromAssets(r6, r7, r0)
            java.util.Iterator r7 = r0.iterator()
        L14:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lc2
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r2 = new java.io.File
            r2.<init>(r8, r0)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L2c
            goto L14
        L2c:
            boolean r3 = mkdirs(r0)
            if (r3 != 0) goto L33
            return r1
        L33:
            r3 = 0
            java.io.InputStream r0 = r6.open(r0)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
        L4a:
            int r3 = r0.read(r2)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            r5 = -1
            if (r3 == r5) goto L5b
            r4.write(r2, r1, r3)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            goto L4a
        L55:
            r6 = move-exception
            r3 = r4
            goto Laa
        L58:
            r6 = move-exception
            r3 = r4
            goto L78
        L5b:
            r4.flush()     // Catch: java.io.IOException -> L62
            r4.close()     // Catch: java.io.IOException -> L62
            goto L66
        L62:
            r2 = move-exception
            r2.printStackTrace()
        L66:
            r0.close()     // Catch: java.io.IOException -> L6a
            goto L14
        L6a:
            r0 = move-exception
            r0.printStackTrace()
            goto L14
        L6f:
            r6 = move-exception
            goto Laa
        L71:
            r6 = move-exception
            goto L78
        L73:
            r6 = move-exception
            r0 = r3
            goto Laa
        L76:
            r6 = move-exception
            r0 = r3
        L78:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L88
            r3.flush()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L84
            r3.close()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L84
            goto L88
        L84:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L6f
        L88:
            if (r0 == 0) goto L92
            r0.close()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L8e
            goto L92
        L8e:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L6f
        L92:
            if (r3 == 0) goto L9f
            r3.flush()     // Catch: java.io.IOException -> L9b
            r3.close()     // Catch: java.io.IOException -> L9b
            goto L9f
        L9b:
            r6 = move-exception
            r6.printStackTrace()
        L9f:
            if (r0 == 0) goto La9
            r0.close()     // Catch: java.io.IOException -> La5
            goto La9
        La5:
            r6 = move-exception
            r6.printStackTrace()
        La9:
            return r1
        Laa:
            if (r3 == 0) goto Lb7
            r3.flush()     // Catch: java.io.IOException -> Lb3
            r3.close()     // Catch: java.io.IOException -> Lb3
            goto Lb7
        Lb3:
            r7 = move-exception
            r7.printStackTrace()
        Lb7:
            if (r0 == 0) goto Lc1
            r0.close()     // Catch: java.io.IOException -> Lbd
            goto Lc1
        Lbd:
            r7 = move-exception
            r7.printStackTrace()
        Lc1:
            throw r6
        Lc2:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.FileUtil.copyFromAssetsToLocal(android.content.res.AssetManager, java.lang.String, java.lang.String):boolean");
    }

    public static void getAllPathsFromAssets(AssetManager amr, String path, List<String> outputs) {
        try {
            String[] list = amr.list(path);
            if (list == null) {
                outputs.add(path);
                return;
            }
            for (String str : list) {
                getAllPathsFromAssets(amr, path + File.separator + str, outputs);
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    public static byte[] getFileData(String absPath) {
        return getFileData(null, absPath);
    }

    public static boolean mkdirs(String path) {
        File file = new File(path);
        if (file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            int lastIndexOf = path.lastIndexOf("/");
            if (lastIndexOf < 0) {
                return true;
            }
            path = path.substring(0, lastIndexOf);
        }
        return checkDir(path);
    }

    public static boolean saveFile(String absPath, byte[] data) {
        return saveFile(null, absPath, data);
    }

    public static byte[] getFileData(String dir, String filename) {
        if (dir == null && filename != null) {
            int lastIndexOf = filename.lastIndexOf("/");
            String substring = filename.substring(0, lastIndexOf);
            filename = filename.substring(lastIndexOf);
            dir = substring;
        }
        if (!checkDir(dir)) {
            return null;
        }
        File file = new File(dir, filename);
        try {
            if (!file.exists()) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    fileInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e11) {
            if (qb.d.b()) {
                qb.c.d("", "error = " + e11.getMessage(), new Object[0]);
            }
            return null;
        }
    }

    public static boolean saveFile(String dir, String filename, byte[] data) {
        if (dir == null && filename != null) {
            int lastIndexOf = filename.lastIndexOf("/");
            String substring = filename.substring(0, lastIndexOf);
            filename = filename.substring(lastIndexOf);
            dir = substring;
        }
        if (!checkDir(dir)) {
            return false;
        }
        File file = new File(dir, filename);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if ((file.exists() && !file.delete()) || !file.createNewFile()) {
                    return false;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(data, 0, data.length);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    return true;
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    if (qb.d.b()) {
                        qb.c.d("", "error = " + e.getMessage(), new Object[0]);
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e12) {
                            if (qb.d.b()) {
                                qb.c.d("", "error = " + e12.getMessage(), new Object[0]);
                            }
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e13) {
                            if (qb.d.b()) {
                                qb.c.d("", "error = " + e13.getMessage(), new Object[0]);
                            }
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e = e14;
        }
    }
}
