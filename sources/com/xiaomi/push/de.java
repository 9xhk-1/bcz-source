package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.push.am;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class de {

    /* renamed from: a, reason: collision with root package name */
    private static volatile de f45378a;

    /* renamed from: a, reason: collision with other field name */
    private Context f239a;

    /* renamed from: a, reason: collision with other field name */
    private final ConcurrentLinkedQueue<b> f240a;

    public class a extends b {
        public a() {
            super();
        }

        @Override // com.xiaomi.push.de.b, com.xiaomi.push.am.b
        public void b() {
            de.this.b();
        }
    }

    public class b extends am.b {

        /* renamed from: a, reason: collision with root package name */
        long f45380a = System.currentTimeMillis();

        public b() {
        }

        public boolean a() {
            return true;
        }

        @Override // com.xiaomi.push.am.b
        public void b() {
        }

        /* renamed from: b, reason: collision with other method in class */
        public final boolean m5819b() {
            return System.currentTimeMillis() - this.f45380a > 172800000;
        }
    }

    public class c extends b {

        /* renamed from: a, reason: collision with root package name */
        int f45382a;

        /* renamed from: a, reason: collision with other field name */
        File f242a;

        /* renamed from: a, reason: collision with other field name */
        String f243a;

        /* renamed from: a, reason: collision with other field name */
        boolean f244a;

        /* renamed from: b, reason: collision with root package name */
        String f45383b;

        /* renamed from: b, reason: collision with other field name */
        boolean f245b;

        public c(String str, String str2, File file, boolean z11) {
            super();
            this.f243a = str;
            this.f45383b = str2;
            this.f242a = file;
            this.f245b = z11;
        }

        @Override // com.xiaomi.push.de.b
        public boolean a() {
            if (bi.e(de.this.f239a)) {
                return true;
            }
            return this.f245b && bi.b(de.this.f239a);
        }

        @Override // com.xiaomi.push.de.b, com.xiaomi.push.am.b
        public void b() {
            try {
                if (c()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", com.xiaomi.push.service.bv.m6265a());
                    hashMap.put("token", this.f45383b);
                    hashMap.put(com.alipay.sdk.m.k.b.f10651k, bi.m5747a(de.this.f239a));
                    bi.a(this.f243a, hashMap, this.f242a, "file");
                }
                this.f244a = true;
            } catch (IOException unused) {
            }
        }

        @Override // com.xiaomi.push.am.b
        /* renamed from: c, reason: collision with other method in class */
        public void mo5820c() {
            if (!this.f244a) {
                int i11 = this.f45382a + 1;
                this.f45382a = i11;
                if (i11 < 3) {
                    de.this.f240a.add(this);
                }
            }
            if (this.f244a || this.f45382a >= 3) {
                this.f242a.delete();
            }
            de.this.a((1 << this.f45382a) * 1000);
        }

        private boolean c() {
            int i11;
            int i12 = 0;
            SharedPreferences sharedPreferences = de.this.f239a.getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                currentTimeMillis = jSONObject.getLong("time");
                i11 = jSONObject.getInt("times");
            } catch (JSONException unused) {
                i11 = 0;
            }
            if (System.currentTimeMillis() - currentTimeMillis >= 86400000) {
                currentTimeMillis = System.currentTimeMillis();
            } else {
                if (i11 > 10) {
                    return false;
                }
                i12 = i11;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", currentTimeMillis);
                jSONObject2.put("times", i12 + 1);
                sharedPreferences.edit().putString("log.requst", jSONObject2.toString()).commit();
            } catch (JSONException e11) {
                com.xiaomi.channel.commonutils.logger.b.c("JSONException on put " + e11.getMessage());
            }
            return true;
        }
    }

    private de(Context context) {
        ConcurrentLinkedQueue<b> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f240a = concurrentLinkedQueue;
        this.f239a = context;
        concurrentLinkedQueue.add(new a());
        b(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (aa.b() || aa.m5713a()) {
            return;
        }
        try {
            File file = new File(this.f239a.getExternalFilesDir(null) + "/.logcache");
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    private void c() {
        while (!this.f240a.isEmpty()) {
            b peek = this.f240a.peek();
            if (peek != null) {
                if (!peek.m5819b() && this.f240a.size() <= 6) {
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.c("remove Expired task");
                this.f240a.remove(peek);
            }
        }
    }

    public static de a(Context context) {
        if (f45378a == null) {
            synchronized (de.class) {
                try {
                    if (f45378a == null) {
                        f45378a = new de(context);
                    }
                } finally {
                }
            }
        }
        f45378a.f239a = context;
        return f45378a;
    }

    private void b(long j11) {
        if (this.f240a.isEmpty()) {
            return;
        }
        gy.a(new dg(this), j11);
    }

    public void a() {
        c();
        a(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j11) {
        b peek = this.f240a.peek();
        if (peek == null || !peek.a()) {
            return;
        }
        b(j11);
    }

    public void a(String str, String str2, Date date, Date date2, int i11, boolean z11) {
        this.f240a.add(new df(this, i11, date, date2, str, str2, z11));
        b(0L);
    }
}
