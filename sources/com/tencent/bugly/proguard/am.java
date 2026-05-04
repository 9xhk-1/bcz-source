package com.tencent.bugly.proguard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class am {
    public static boolean a(File file, String str, long j11, boolean z11) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, z11));
            boolean a11 = a(bufferedWriter, str.toCharArray(), str.length(), file.length(), j11);
            bufferedWriter.close();
            return a11;
        } catch (Throwable th2) {
            al.a(th2);
            return false;
        }
    }

    private static List<File> b(String str, final String str2, final String str3, long j11) {
        ArrayList arrayList = new ArrayList();
        if (str2 == null || str3 == null) {
            al.d("prefix %s and/or postfix %s is null.", str2, str3);
            return arrayList;
        }
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.tencent.bugly.proguard.am.1
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str4) {
                        return str4 != null && str4.startsWith(str2) && str4.endsWith(str3);
                    }
                });
                if (listFiles != null && listFiles.length != 0) {
                    return a(listFiles, str2, str3, currentTimeMillis - j11);
                }
            } catch (Throwable th2) {
                al.a(th2);
            }
        }
        return arrayList;
    }

    private static boolean a(Writer writer, char[] cArr, int i11, long j11, long j12) {
        if (j11 >= j12) {
            return false;
        }
        try {
            if ((i11 * 2) + j11 <= j12) {
                writer.write(cArr, 0, i11);
            } else {
                writer.write(cArr, 0, (int) ((j12 - j11) / 2));
            }
            writer.flush();
            return true;
        } catch (IOException e11) {
            al.a(e11);
            return false;
        }
    }

    public static void a(String str, String str2, String str3, long j11) {
        try {
            int i11 = 0;
            for (File file : b(str, str2, str3, j11)) {
                al.c("File %s is to be deleted.", file.getName());
                if (file.delete()) {
                    i11++;
                }
            }
            al.c("Number of overdue trace files that has deleted: ".concat(String.valueOf(i11)), new Object[0]);
        } catch (Throwable th2) {
            al.a(th2);
        }
    }

    private static List<File> a(File[] fileArr, String str, String str2, long j11) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            long a11 = a(file.getName(), str, str2);
            if (a11 >= 0 && 0 <= a11 && a11 <= j11) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public static long a(String str, String str2, String str3) {
        if (str == null) {
            al.d("File name is null.", new Object[0]);
            return -1L;
        }
        try {
            if (str.startsWith(str2) && str.endsWith(str3)) {
                return Long.parseLong(str.substring(str2.length(), str.indexOf(str3)));
            }
        } catch (Throwable th2) {
            al.a(th2);
        }
        return -1L;
    }

    public static boolean a(String str, String str2, int i11) {
        al.c("rqdp{  sv sd start} %s", str);
        if (str2 != null && str2.trim().length() > 0) {
            File file = new File(str);
            try {
                if (!file.exists()) {
                    if (file.getParentFile() != null) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                long j11 = i11;
                return a(file, str2, j11, file.length() < j11);
            } catch (Throwable th2) {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return false;
    }
}
