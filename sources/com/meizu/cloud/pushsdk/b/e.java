package com.meizu.cloud.pushsdk.b;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/* loaded from: classes7.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f39409a = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: b, reason: collision with root package name */
    private final d f39410b = new d("lo");

    /* renamed from: c, reason: collision with root package name */
    private BufferedWriter f39411c;

    public class a implements Comparator<File> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long lastModified = file.lastModified() - file2.lastModified();
            if (lastModified > 0) {
                return -1;
            }
            return lastModified == 0 ? 0 : 1;
        }
    }

    public void a() throws IOException {
        BufferedWriter bufferedWriter = this.f39411c;
        if (bufferedWriter != null) {
            bufferedWriter.flush();
            this.f39411c.close();
            this.f39411c = null;
        }
    }

    public void a(File file) {
        File[] listFiles = file.listFiles(new FileFilter() { // from class: com.meizu.cloud.pushsdk.b.e.1
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return file2.getName().endsWith(".log.txt");
            }
        });
        if (listFiles != null) {
            if (listFiles.length > 7) {
                Arrays.sort(listFiles, new a());
                for (int i11 = 7; i11 < listFiles.length; i11++) {
                    listFiles[i11].delete();
                }
            }
        }
    }

    public void a(String str) throws IOException {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("create " + str + " dir failed!!!");
        }
        String format = this.f39409a.format(new Date());
        File file2 = new File(str, format + ".log.txt");
        if (!file2.exists()) {
            if (file2.createNewFile()) {
                a(file);
            } else {
                Log.e("EncryptionWriter", "create new file " + format + " failed !!!");
            }
        }
        this.f39411c = new BufferedWriter(new FileWriter(file2, true));
    }

    public void a(String str, String str2, String str3) throws IOException {
        if (this.f39411c != null) {
            this.f39411c.write(this.f39410b.a((str + str2 + " " + str3).getBytes()));
            this.f39411c.write("\r\n");
        }
    }
}
