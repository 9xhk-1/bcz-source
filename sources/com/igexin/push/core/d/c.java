package com.igexin.push.core.d;

import android.text.TextUtils;
import com.getui.gtc.base.util.io.IOUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.igexin.push.g.j;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Map;
import n6.m;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37961a = "guard.me";

    /* renamed from: b, reason: collision with root package name */
    public static final String f37962b = "guard.others";

    /* renamed from: c, reason: collision with root package name */
    private static final String f37963c = "GuardConfig";

    /* renamed from: d, reason: collision with root package name */
    private static final c f37964d = new c();

    /* renamed from: e, reason: collision with root package name */
    private long f37965e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f37966f = new HashMap();

    private c() {
        try {
            if (TextUtils.isEmpty(j.f38713g)) {
                j.a();
            }
            File file = new File(j.f38713g);
            if (file.exists()) {
                return;
            }
            file.createNewFile();
        } catch (IOException e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    private int a(String str, int... iArr) {
        try {
            return Integer.parseInt(b(str));
        } catch (NumberFormatException e11) {
            com.igexin.c.a.c.a.a(e11);
            if (iArr == null || iArr.length != 1) {
                return -1;
            }
            return iArr[0];
        }
    }

    private String b(String str) {
        if (b()) {
            a(new com.igexin.push.core.g.a<RandomAccessFile>() { // from class: com.igexin.push.core.d.c.3
                /* renamed from: a, reason: avoid collision after fix types in other method */
                private void a2(RandomAccessFile randomAccessFile) {
                    c.this.a(randomAccessFile);
                }

                @Override // com.igexin.push.core.g.a
                public final /* bridge */ /* synthetic */ void a(RandomAccessFile randomAccessFile) {
                    c.this.a(randomAccessFile);
                }
            });
        }
        return this.f37966f.get(str);
    }

    private static Boolean c(String str) {
        if (str == null) {
            return null;
        }
        if (str.equalsIgnoreCase(m.f74525c)) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    private long a(String str, long... jArr) {
        try {
            return Long.parseLong(b(str));
        } catch (NumberFormatException e11) {
            com.igexin.c.a.c.a.a(e11);
            if (jArr == null || jArr.length != 1) {
                return 0L;
            }
            return jArr[0];
        }
    }

    public static c a() {
        return f37964d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        long lastModified = new File(j.f38713g).lastModified();
        boolean z11 = this.f37965e != lastModified;
        this.f37965e = lastModified;
        return z11;
    }

    public final Boolean a(String str) {
        String b11 = b(str);
        if (b11 == null) {
            return null;
        }
        return c(b11);
    }

    private static void a(com.igexin.push.core.g.a<RandomAccessFile> aVar) {
        RandomAccessFile randomAccessFile;
        FileLock fileLock = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(new File(j.f38713g), "rw");
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                    if (fileLock.isValid()) {
                        aVar.a((com.igexin.push.core.g.a<RandomAccessFile>) randomAccessFile);
                    }
                    if (fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    IOUtils.safeClose(randomAccessFile);
                } catch (Exception e11) {
                    e = e11;
                    com.igexin.c.a.c.a.a(e);
                    com.igexin.c.a.c.a.a("GuardConfig| getProcessLock err：" + e.toString(), new Object[0]);
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    IOUtils.safeClose(randomAccessFile);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0 && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException unused3) {
                    }
                }
                IOUtils.safeClose(null);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                fileLock.release();
            }
            IOUtils.safeClose(null);
            throw th;
        }
    }

    public final void a(final String str, final Object obj) {
        a(new com.igexin.push.core.g.a<RandomAccessFile>() { // from class: com.igexin.push.core.d.c.2
            /* renamed from: a, reason: avoid collision after fix types in other method */
            private void a2(RandomAccessFile randomAccessFile) {
                if (c.this.b()) {
                    c.this.a(randomAccessFile);
                }
                c.this.f37966f.put(str, String.valueOf(obj));
                try {
                    randomAccessFile.setLength(0L);
                    for (Map.Entry entry : c.this.f37966f.entrySet()) {
                        randomAccessFile.writeBytes(((String) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((String) entry.getValue()));
                        randomAccessFile.writeBytes("\n");
                    }
                } catch (IOException e11) {
                    com.igexin.c.a.c.a.a(e11);
                }
            }

            @Override // com.igexin.push.core.g.a
            public final /* synthetic */ void a(RandomAccessFile randomAccessFile) {
                RandomAccessFile randomAccessFile2 = randomAccessFile;
                if (c.this.b()) {
                    c.this.a(randomAccessFile2);
                }
                c.this.f37966f.put(str, String.valueOf(obj));
                try {
                    randomAccessFile2.setLength(0L);
                    for (Map.Entry entry : c.this.f37966f.entrySet()) {
                        randomAccessFile2.writeBytes(((String) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((String) entry.getValue()));
                        randomAccessFile2.writeBytes("\n");
                    }
                } catch (IOException e11) {
                    com.igexin.c.a.c.a.a(e11);
                }
            }
        }.a(new com.igexin.push.core.g.a<RandomAccessFile>() { // from class: com.igexin.push.core.d.c.1
            private void a() {
                c.this.b();
            }

            @Override // com.igexin.push.core.g.a
            public final /* bridge */ /* synthetic */ void a(RandomAccessFile randomAccessFile) {
                c.this.b();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(RandomAccessFile randomAccessFile) {
        int i11;
        try {
            this.f37966f.clear();
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine == null) {
                    return true;
                }
                int indexOf = readLine.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                if (indexOf >= 0 && (i11 = indexOf + 1) != readLine.length()) {
                    this.f37966f.put(readLine.substring(0, indexOf), readLine.substring(i11));
                }
            }
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return false;
        }
    }
}
