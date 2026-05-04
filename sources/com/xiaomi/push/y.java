package com.xiaomi.push;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes8.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f46420a = {"jpg", "png", "bmp", "gif", "webp"};

    public static String a(File file) {
        InputStreamReader inputStreamReader;
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)));
            try {
                try {
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read == -1) {
                            String stringWriter2 = stringWriter.toString();
                            a(inputStreamReader);
                            a(stringWriter);
                            return stringWriter2;
                        }
                        stringWriter.write(cArr, 0, read);
                    }
                } catch (IOException e11) {
                    e = e11;
                    com.xiaomi.channel.commonutils.logger.b.c("read file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    a(inputStreamReader);
                    a(stringWriter);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader2 = inputStreamReader;
                a(inputStreamReader2);
                a(stringWriter);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            a(inputStreamReader2);
            a(stringWriter);
            throw th;
        }
    }

    public static void b(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        if (file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read < 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(File file, File file2) {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new FileOutputStream(file, false));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                a(zipOutputStream, file2, null, null);
                a(zipOutputStream);
            } catch (FileNotFoundException unused) {
                zipOutputStream2 = zipOutputStream;
                a(zipOutputStream2);
            } catch (IOException e11) {
                e = e11;
                zipOutputStream2 = zipOutputStream;
                com.xiaomi.channel.commonutils.logger.b.m5639a("zip file failure + " + e.getMessage());
                a(zipOutputStream2);
            } catch (Throwable th3) {
                th = th3;
                zipOutputStream2 = zipOutputStream;
                a(zipOutputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            a(zipOutputStream2);
        } catch (IOException e12) {
            e = e12;
        }
    }

    public static void a(File file, String str) {
        BufferedWriter bufferedWriter;
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.b.c("mkdir " + file.getAbsolutePath());
            file.getParentFile().mkdirs();
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
        try {
            bufferedWriter.write(str);
            a(bufferedWriter);
        } catch (IOException e12) {
            e = e12;
            bufferedWriter2 = bufferedWriter;
            com.xiaomi.channel.commonutils.logger.b.c("write file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
            a(bufferedWriter2);
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            a(bufferedWriter2);
            throw th;
        }
    }

    public static void a(ZipOutputStream zipOutputStream, File file, String str, FileFilter fileFilter) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                if (file.isDirectory()) {
                    File[] listFiles = fileFilter != null ? file.listFiles(fileFilter) : file.listFiles();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    String str3 = File.separator;
                    sb2.append(str3);
                    zipOutputStream.putNextEntry(new ZipEntry(sb2.toString()));
                    if (!TextUtils.isEmpty(str)) {
                        str2 = str + str3;
                    }
                    for (int i11 = 0; i11 < listFiles.length; i11++) {
                        a(zipOutputStream, listFiles[i11], str2 + listFiles[i11].getName(), null);
                    }
                    File[] listFiles2 = file.listFiles(new z());
                    if (listFiles2 != null) {
                        for (File file2 : listFiles2) {
                            a(zipOutputStream, file2, str2 + File.separator + file2.getName(), fileFilter);
                        }
                    }
                } else {
                    zipOutputStream.putNextEntry(TextUtils.isEmpty(str) ? new ZipEntry(String.valueOf(new Date().getTime()) + ".txt") : new ZipEntry(str));
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                zipOutputStream.write(bArr, 0, read);
                            }
                        }
                        fileInputStream = fileInputStream2;
                    } catch (IOException e11) {
                        e = e11;
                        fileInputStream = fileInputStream2;
                        com.xiaomi.channel.commonutils.logger.b.d("zipFiction failed with exception:" + e.toString());
                        a((Closeable) fileInputStream);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        a((Closeable) fileInputStream);
                        throw th;
                    }
                }
                a((Closeable) fileInputStream);
            } catch (IOException e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6304a(File file) {
        try {
            if (file.isDirectory()) {
                return false;
            }
            if (file.exists()) {
                return true;
            }
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                return file.createNewFile();
            }
            return false;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read <= 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        a((Closeable) inputStream);
                        a(byteArrayOutputStream);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    a((Closeable) inputStream);
                    a(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th2) {
                a((Closeable) inputStream);
                a(byteArrayOutputStream);
                throw th2;
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception unused) {
            return bArr;
        }
    }
}
