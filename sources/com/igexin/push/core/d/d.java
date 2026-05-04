package com.igexin.push.core.d;

import android.text.TextUtils;
import com.getui.gtc.base.util.io.IOUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.igexin.push.core.ServiceManager;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37972a = "grp.prop";

    /* renamed from: b, reason: collision with root package name */
    public static final String f37973b = "itmp";

    /* renamed from: c, reason: collision with root package name */
    public static final String f37974c = "itop";

    /* renamed from: d, reason: collision with root package name */
    public static final String f37975d = "c";

    /* renamed from: e, reason: collision with root package name */
    public static final String f37976e = "i";

    /* renamed from: f, reason: collision with root package name */
    public static final String f37977f = "p";

    /* renamed from: g, reason: collision with root package name */
    public static final String f37978g = "s";

    /* renamed from: h, reason: collision with root package name */
    public static final String f37979h = "t145gt";

    /* renamed from: i, reason: collision with root package name */
    public static final String f37980i = "t145main";

    /* renamed from: j, reason: collision with root package name */
    private static final String f37981j = "RpConfig";

    /* renamed from: k, reason: collision with root package name */
    private static final d f37982k = new d();

    /* renamed from: l, reason: collision with root package name */
    private final String f37983l;

    /* renamed from: m, reason: collision with root package name */
    private long f37984m;

    /* renamed from: n, reason: collision with root package name */
    private final Map<String, String> f37985n = new HashMap();

    /* renamed from: com.igexin.push.core.d.d$3, reason: invalid class name */
    public class AnonymousClass3 extends com.igexin.push.core.g.a<RandomAccessFile> {
        public AnonymousClass3() {
        }

        private void a() {
            d.this.b();
        }

        @Override // com.igexin.push.core.g.a
        public final /* bridge */ /* synthetic */ void a(RandomAccessFile randomAccessFile) {
            d.this.b();
        }
    }

    /* renamed from: com.igexin.push.core.d.d$4, reason: invalid class name */
    public class AnonymousClass4 extends com.igexin.push.core.g.a<RandomAccessFile> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37991a;

        public AnonymousClass4(String str) {
            this.f37991a = str;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(RandomAccessFile randomAccessFile) {
            if (d.this.b()) {
                d.this.a(randomAccessFile);
            }
            d.this.f37985n.remove(this.f37991a);
            try {
                randomAccessFile.setLength(0L);
                for (Map.Entry entry : d.this.f37985n.entrySet()) {
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
            if (d.this.b()) {
                d.this.a(randomAccessFile2);
            }
            d.this.f37985n.remove(this.f37991a);
            try {
                randomAccessFile2.setLength(0L);
                for (Map.Entry entry : d.this.f37985n.entrySet()) {
                    randomAccessFile2.writeBytes(((String) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((String) entry.getValue()));
                    randomAccessFile2.writeBytes("\n");
                }
            } catch (IOException e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
    }

    private d() {
        String str = ServiceManager.f37612b.getFilesDir().getAbsolutePath() + "/grp.prop";
        this.f37983l = str;
        try {
            File file = new File(str);
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
            return Integer.parseInt(a(str));
        } catch (NumberFormatException e11) {
            com.igexin.c.a.c.a.a(e11);
            if (iArr == null || iArr.length != 1) {
                return -1;
            }
            return iArr[0];
        }
    }

    private void c(String str) {
        a(new AnonymousClass4(str).a((com.igexin.push.core.g.a) new AnonymousClass3()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        long lastModified = new File(this.f37983l).lastModified();
        boolean z11 = this.f37984m != lastModified;
        this.f37984m = lastModified;
        return z11;
    }

    public final long a(String str, long... jArr) {
        try {
            return Long.parseLong(a(str));
        } catch (NumberFormatException e11) {
            com.igexin.c.a.c.a.a(e11);
            if (jArr.length == 1) {
                return jArr[0];
            }
            return 0L;
        }
    }

    public static d a() {
        return f37982k;
    }

    public final boolean b(String str) {
        return Boolean.parseBoolean(a(str));
    }

    public final String a(String str) {
        if (b()) {
            a(new com.igexin.push.core.g.a<RandomAccessFile>() { // from class: com.igexin.push.core.d.d.5
                /* renamed from: a, reason: avoid collision after fix types in other method */
                private void a2(RandomAccessFile randomAccessFile) {
                    d.this.a(randomAccessFile);
                }

                @Override // com.igexin.push.core.g.a
                public final /* bridge */ /* synthetic */ void a(RandomAccessFile randomAccessFile) {
                    d.this.a(randomAccessFile);
                }
            });
        }
        return this.f37985n.get(str);
    }

    public final ArrayList<String> a(String str, ArrayList<String> arrayList) {
        String a11 = a(str);
        try {
            if (TextUtils.isEmpty(a11)) {
                return arrayList;
            }
            ArrayList<String> arrayList2 = new ArrayList<>();
            JSONArray jSONArray = new JSONArray(a11);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String optString = jSONArray.optString(i11);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList2.add(optString);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return arrayList;
        }
    }

    public final void a(com.igexin.push.core.g.a<RandomAccessFile> aVar) {
        RandomAccessFile randomAccessFile;
        FileLock fileLock = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(new File(this.f37983l), "rw");
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
                    com.igexin.c.a.c.a.a("RpConfig| getProcessLock err：" + e.toString(), new Object[0]);
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
        a(new com.igexin.push.core.g.a<RandomAccessFile>() { // from class: com.igexin.push.core.d.d.2
            /* renamed from: a, reason: avoid collision after fix types in other method */
            private void a2(RandomAccessFile randomAccessFile) {
                String jSONArray;
                if (d.this.b()) {
                    d.this.a(randomAccessFile);
                }
                Object obj2 = obj;
                if (obj2 instanceof List) {
                    try {
                        jSONArray = new JSONArray((Collection) obj).toString();
                    } catch (Throwable th2) {
                        com.igexin.c.a.c.a.a(th2);
                        return;
                    }
                } else {
                    jSONArray = String.valueOf(obj2);
                }
                d.this.f37985n.put(str, jSONArray);
                try {
                    randomAccessFile.setLength(0L);
                    for (Map.Entry entry : d.this.f37985n.entrySet()) {
                        randomAccessFile.writeBytes(((String) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((String) entry.getValue()));
                        randomAccessFile.writeBytes("\n");
                    }
                } catch (IOException e11) {
                    com.igexin.c.a.c.a.a(e11);
                }
            }

            @Override // com.igexin.push.core.g.a
            public final /* synthetic */ void a(RandomAccessFile randomAccessFile) {
                String jSONArray;
                RandomAccessFile randomAccessFile2 = randomAccessFile;
                if (d.this.b()) {
                    d.this.a(randomAccessFile2);
                }
                Object obj2 = obj;
                if (obj2 instanceof List) {
                    try {
                        jSONArray = new JSONArray((Collection) obj).toString();
                    } catch (Throwable th2) {
                        com.igexin.c.a.c.a.a(th2);
                        return;
                    }
                } else {
                    jSONArray = String.valueOf(obj2);
                }
                d.this.f37985n.put(str, jSONArray);
                try {
                    randomAccessFile2.setLength(0L);
                    for (Map.Entry entry : d.this.f37985n.entrySet()) {
                        randomAccessFile2.writeBytes(((String) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((String) entry.getValue()));
                        randomAccessFile2.writeBytes("\n");
                    }
                } catch (IOException e11) {
                    com.igexin.c.a.c.a.a(e11);
                }
            }
        }.a(new com.igexin.push.core.g.a<RandomAccessFile>() { // from class: com.igexin.push.core.d.d.1
            private void a() {
                d.this.b();
            }

            @Override // com.igexin.push.core.g.a
            public final /* bridge */ /* synthetic */ void a(RandomAccessFile randomAccessFile) {
                d.this.b();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(RandomAccessFile randomAccessFile) {
        int i11;
        try {
            this.f37985n.clear();
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine == null) {
                    return true;
                }
                int indexOf = readLine.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                if (indexOf >= 0 && (i11 = indexOf + 1) != readLine.length()) {
                    this.f37985n.put(readLine.substring(0, indexOf), readLine.substring(i11));
                }
            }
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return false;
        }
    }
}
