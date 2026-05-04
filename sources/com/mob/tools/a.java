package com.mob.tools;

import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.utils.ResHelper;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.HashSet;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f41141a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f41142b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private volatile HashSet<String> f41143c = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private File f41144d;

    /* renamed from: e, reason: collision with root package name */
    private int f41145e;

    /* renamed from: f, reason: collision with root package name */
    private String f41146f;

    /* renamed from: com.mob.tools.a$a, reason: collision with other inner class name */
    public interface InterfaceC0492a {
        void a(String str);

        boolean a();
    }

    public a(String str, String str2, int i11) {
        this.f41145e = i11;
        if (str2 == null) {
            str2 = "null";
        } else if (TextUtils.isDigitsOnly(str2)) {
            str2 = str + str2;
        }
        this.f41146f = str2;
        File dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContextSafely(), str);
        this.f41144d = dataCacheFile;
        if (dataCacheFile.isDirectory()) {
            return;
        }
        this.f41144d.mkdirs();
    }

    private boolean b(String str) {
        synchronized (this.f41143c) {
            try {
                if (this.f41143c.contains(str)) {
                    return true;
                }
                this.f41143c.add(str);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void c(String str) {
        synchronized (this.f41143c) {
            this.f41143c.remove(str);
        }
    }

    public void a(String str) {
        a(str, false);
    }

    public void a(String str, boolean z11) {
        String str2;
        FileWriter fileWriter;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            str2 = Base64.encodeToString(str.getBytes("utf-8"), 2);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        synchronized (f41141a) {
            File a11 = a(z11);
            try {
                fileWriter = new FileWriter(a11, true);
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter);
                    try {
                        bufferedWriter2.newLine();
                        bufferedWriter2.write(str2);
                        ResHelper.closeIOs(bufferedWriter2);
                        ResHelper.closeIOs(fileWriter);
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedWriter = bufferedWriter2;
                        try {
                            MobLog.getInstance().d(th);
                            ResHelper.closeIOs(bufferedWriter);
                            ResHelper.closeIOs(fileWriter);
                            c(a11.getName());
                        } catch (Throwable th4) {
                            ResHelper.closeIOs(bufferedWriter);
                            ResHelper.closeIOs(fileWriter);
                            c(a11.getName());
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                fileWriter = null;
            }
            c(a11.getName());
        }
    }

    private File a(boolean z11) {
        File file;
        File[] listFiles = this.f41144d.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            int i11 = 1;
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.startsWith(this.f41146f)) {
                    String[] split = name.split("_");
                    if (!z11 && split.length == 3) {
                        try {
                            int parseInt = Integer.parseInt(split[2]);
                            if (parseInt < this.f41145e && !b(name)) {
                                File file3 = new File(this.f41144d, a(this.f41146f, "_", Integer.valueOf(i11), "_", Integer.valueOf(parseInt + 1)));
                                return file2.renameTo(file3) ? file3 : file2;
                            }
                        } catch (Throwable th2) {
                            MobLog.getInstance().d(th2);
                        }
                    }
                    if (split.length > 1) {
                        try {
                            if (Integer.parseInt(split[1]) == i11) {
                                i11++;
                            }
                        } catch (Throwable th3) {
                            MobLog.getInstance().d(th3);
                        }
                    }
                }
            }
            file = new File(this.f41144d, a(this.f41146f, "_", Integer.valueOf(i11), "_", 0));
        } else {
            file = new File(this.f41144d, a(this.f41146f, "_", 1, "_", 0));
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
        return file;
    }

    public void a(InterfaceC0492a interfaceC0492a) {
        FileReader fileReader;
        if (interfaceC0492a == null) {
            return;
        }
        synchronized (f41142b) {
            File[] listFiles = this.f41144d.listFiles(new FilenameFilter() { // from class: com.mob.tools.a.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return !TextUtils.isEmpty(str) && str.startsWith(a.this.f41146f);
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    String name = file.getName();
                    if (!b(name)) {
                        BufferedReader bufferedReader = null;
                        try {
                            fileReader = new FileReader(file);
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(fileReader);
                                while (true) {
                                    try {
                                        String readLine = bufferedReader2.readLine();
                                        if (readLine == null) {
                                            break;
                                        } else {
                                            interfaceC0492a.a(new String(Base64.decode(readLine, 2), "utf-8"));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bufferedReader = bufferedReader2;
                                        try {
                                            MobLog.getInstance().d(th);
                                            ResHelper.closeIOs(bufferedReader);
                                            ResHelper.closeIOs(fileReader);
                                            c(name);
                                        } catch (Throwable th3) {
                                            ResHelper.closeIOs(bufferedReader);
                                            ResHelper.closeIOs(fileReader);
                                            c(name);
                                            throw th3;
                                        }
                                    }
                                }
                                if (interfaceC0492a.a()) {
                                    file.delete();
                                }
                                ResHelper.closeIOs(bufferedReader2);
                                ResHelper.closeIOs(fileReader);
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileReader = null;
                        }
                        c(name);
                    }
                }
            }
        }
    }

    public void a(long j11) {
        synchronized (f41142b) {
            try {
                File[] listFiles = this.f41144d.listFiles(new FilenameFilter() { // from class: com.mob.tools.a.2
                    @Override // java.io.FilenameFilter
                    public boolean accept(File file, String str) {
                        return !TextUtils.isEmpty(str) && str.startsWith(a.this.f41146f);
                    }
                });
                if (listFiles != null && listFiles.length > 0) {
                    long j12 = 0;
                    for (File file : listFiles) {
                        j12 += file.length();
                    }
                    if (j12 >= j11) {
                        for (File file2 : listFiles) {
                            file2.delete();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            sb2.append(obj);
        }
        return sb2.toString();
    }
}
