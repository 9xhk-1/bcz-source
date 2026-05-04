package com.mob.commons.b;

import android.content.Context;
import android.text.TextUtils;
import com.mob.commons.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f40157a = com.mob.commons.n.a("005$dkBk9efceef");

    /* renamed from: b, reason: collision with root package name */
    private static b f40158b;

    /* renamed from: c, reason: collision with root package name */
    private Context f40159c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, Object> f40160d = new HashMap<>();

    private b(Context context) {
        this.f40159c = context;
        try {
            HashMap hashMap = (HashMap) a(a(context, f40157a));
            if (hashMap == null || hashMap.size() <= 0) {
                return;
            }
            this.f40160d.putAll(hashMap);
        } catch (Throwable unused) {
        }
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            try {
                if (f40158b == null) {
                    f40158b = new b(context);
                }
                bVar = f40158b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public synchronized HashMap<String, Object> a() {
        return this.f40160d;
    }

    public synchronized boolean a(String str, String str2, String str3, String str4, boolean z11) {
        HashMap hashMap;
        try {
            hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(com.mob.commons.n.a("004Cdbcecd>g"), str);
            }
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put(com.mob.commons.n.a("004<cececdQg"), str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put(com.mob.commons.n.a("004i1cecd-g"), str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put(com.mob.commons.n.a("004BcbNg'cd'g"), str4);
            }
            hashMap.put(com.mob.commons.n.a("009;efcbUdd=dbcg<chg"), Boolean.valueOf(z11));
        } catch (Throwable unused) {
            return false;
        }
        return a(a(this.f40159c, f40157a), hashMap);
    }

    private static File a(Context context, String str) {
        try {
            File file = new File(context.getFilesDir().getAbsolutePath() + com.mob.commons.n.a("005f)fgdbeb8f"));
            if (!file.exists() || !file.isDirectory()) {
                file.delete();
                file.mkdirs();
            }
            return new File(file, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Object a(File file) {
        ObjectInputStream objectInputStream;
        try {
            if (file.exists()) {
                try {
                    objectInputStream = new ObjectInputStream(new GZIPInputStream(new FileInputStream(file)));
                    try {
                        Object readObject = objectInputStream.readObject();
                        r.a(objectInputStream);
                        return readObject;
                    } catch (Throwable th2) {
                        th = th2;
                        r.a(objectInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream = null;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static boolean a(File file, Object obj) {
        ObjectOutputStream objectOutputStream;
        try {
            if (file.exists()) {
                file.delete();
            }
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
            ObjectOutputStream objectOutputStream2 = null;
            try {
                objectOutputStream = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream(file)));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                objectOutputStream.writeObject(obj);
                objectOutputStream.flush();
                r.a(objectOutputStream);
                return true;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream2 = objectOutputStream;
                r.a(objectOutputStream2);
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
