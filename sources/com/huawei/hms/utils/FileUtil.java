package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;

    /* renamed from: a, reason: collision with root package name */
    private static boolean f36701a = false;

    /* renamed from: b, reason: collision with root package name */
    private static ScheduledExecutorService f36702b = Executors.newSingleThreadScheduledExecutor();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f36703a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f36704b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36705c;

        public a(File file, long j11, String str) {
            this.f36703a = file;
            this.f36704b = j11;
            this.f36705c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RandomAccessFile randomAccessFile;
            Throwable th2;
            File file = this.f36703a;
            if (file == null) {
                HMSLog.e("FileUtil", "In writeFile Failed to get local file.");
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile == null || !(parentFile.mkdirs() || parentFile.isDirectory())) {
                HMSLog.e("FileUtil", "In writeFile, Failed to create directory.");
                return;
            }
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    long length = this.f36703a.length();
                    if (length > this.f36704b) {
                        String canonicalPath = this.f36703a.getCanonicalPath();
                        if (!this.f36703a.delete()) {
                            HMSLog.e("FileUtil", "last file delete failed.");
                        }
                        randomAccessFile2 = new RandomAccessFile(new File(canonicalPath), "rw");
                    } else {
                        randomAccessFile = new RandomAccessFile(this.f36703a, "rw");
                        try {
                            randomAccessFile.seek(length);
                            randomAccessFile2 = randomAccessFile;
                        } catch (IOException e11) {
                            e = e11;
                            randomAccessFile2 = randomAccessFile;
                            HMSLog.e("FileUtil", "writeFile exception:", e);
                            IOUtils.closeQuietly(randomAccessFile2);
                        } catch (Throwable th3) {
                            th2 = th3;
                            IOUtils.closeQuietly(randomAccessFile);
                            throw th2;
                        }
                    }
                    randomAccessFile2.writeBytes(this.f36705c + System.getProperty("line.separator"));
                } catch (Throwable th4) {
                    randomAccessFile = null;
                    th2 = th4;
                }
            } catch (IOException e12) {
                e = e12;
            }
            IOUtils.closeQuietly(randomAccessFile2);
        }
    }

    public static boolean verifyHash(String str, File file) {
        byte[] digest = SHA256.digest(file);
        return digest != null && HEX.encodeHexString(digest, true).equalsIgnoreCase(str);
    }

    public static void writeFile(File file, String str, long j11) {
        f36702b.execute(new a(file, j11, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j11, int i11) {
        if (file != null && file.isFile() && file.exists()) {
            if (!f36701a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    HMSLog.e("FileUtil", "file delete failed.");
                }
                f36701a = true;
            }
            writeFile(file2, str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + j11 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i11, LOCAL_REPORT_FILE_MAX_SIZE);
        }
    }
}
