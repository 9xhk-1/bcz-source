package tz;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes8.dex */
public class d extends b {
    public d(Context context) {
        super(context);
    }

    @Override // tz.b
    public String b(String str) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        try {
            return d(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Installation", str));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // tz.b
    public boolean c(String str, String str2) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return false;
        }
        try {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Installation", str);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            e(file, str2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final String d(File file) throws IOException {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, en.r.f50027a);
            try {
                byte[] bArr = new byte[(int) randomAccessFile2.length()];
                randomAccessFile2.readFully(bArr);
                String str = new String(bArr);
                try {
                    randomAccessFile2.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void e(File file, String str) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(str.getBytes());
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
