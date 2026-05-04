package com.huawei.hms.opendevice;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class s {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                HMSLog.w("StreamUtil", "close IOException");
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
                HMSLog.w("StreamUtil", "close HttpURLConnection Exception");
            }
        }
    }

    public static String a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read = inputStream.read();
        while (-1 != read) {
            byteArrayOutputStream.write(read);
            read = inputStream.read();
        }
        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
        a((Closeable) inputStream);
        zr.e.d(byteArrayOutputStream);
        return byteArrayOutputStream2;
    }

    public static void a(File file) throws IOException {
        if (file.exists()) {
            return;
        }
        if (file.getParentFile() != null) {
            if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                HMSLog.e("StreamUtil", "make parent dirs failed.");
                throw new IOException("make parent dirs failed");
            }
            if (file.createNewFile()) {
                return;
            }
            HMSLog.e("StreamUtil", "create file failed.");
            throw new IOException("create file failed");
        }
        HMSLog.e("StreamUtil", "parent file is null.");
        throw new IOException("parent file is null");
    }

    public static String a(String str) {
        InputStreamReader inputStreamReader;
        File file = new File(str);
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-8");
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                        } catch (FileNotFoundException unused) {
                            bufferedReader = bufferedReader2;
                            HMSLog.e("StreamUtil", "file not exist.");
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                            return sb2.toString();
                        } catch (IOException unused2) {
                            bufferedReader = bufferedReader2;
                            HMSLog.e("StreamUtil", "read value IOException.");
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                            return sb2.toString();
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                            throw th;
                        }
                    }
                    IOUtils.closeQuietly((Reader) inputStreamReader);
                    IOUtils.closeQuietly((Reader) bufferedReader2);
                } catch (FileNotFoundException unused3) {
                } catch (IOException unused4) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException unused5) {
            inputStreamReader = null;
        } catch (IOException unused6) {
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
        }
        return sb2.toString();
    }
}
