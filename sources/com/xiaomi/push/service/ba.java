package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.push.hm;
import com.xiaomi.push.hn;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class ba {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ba f46272a;

    /* renamed from: a, reason: collision with other field name */
    protected SharedPreferences f952a;

    /* renamed from: a, reason: collision with other field name */
    private HashSet<a> f953a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    protected SharedPreferences f46273b;

    public static abstract class a implements Runnable {
        private String mDescription;
        private int mId;

        public a(int i11, String str) {
            this.mId = i11;
            this.mDescription = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.mId == ((a) obj).mId;
        }

        public int hashCode() {
            return this.mId;
        }

        public abstract void onCallback();

        @Override // java.lang.Runnable
        public final void run() {
            onCallback();
        }
    }

    private ba(Context context) {
        this.f952a = context.getSharedPreferences("mipush_oc_normal", 0);
        this.f46273b = context.getSharedPreferences("mipush_oc_custom", 0);
    }

    public int a(int i11, int i12) {
        SharedPreferences sharedPreferences;
        try {
            String a11 = a(i11);
            if (this.f46273b.contains(a11)) {
                sharedPreferences = this.f46273b;
            } else {
                if (!this.f952a.contains(a11)) {
                    return i12;
                }
                sharedPreferences = this.f952a;
            }
            i11 = sharedPreferences.getInt(a11, 0);
            return i11;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a(i11 + " oc int error " + e11);
            return i12;
        }
    }

    public void b() {
        com.xiaomi.channel.commonutils.logger.b.c("OC_Callback : receive new oc data");
        HashSet hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f953a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }

    public int a(hn hnVar, int i11) {
        try {
            return this.f952a.getInt(a(hnVar), i11);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a(hnVar + " version error " + e11);
            return i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [long] */
    public long a(int i11, long j11) {
        SharedPreferences sharedPreferences;
        try {
            String a11 = a(i11);
            if (this.f46273b.contains(a11)) {
                sharedPreferences = this.f46273b;
            } else {
                if (!this.f952a.contains(a11)) {
                    return j11;
                }
                sharedPreferences = this.f952a;
            }
            i11 = sharedPreferences.getLong(a11, 0L);
            return i11;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a(i11 + " oc long error " + e11);
            return j11;
        }
    }

    public static ba a(Context context) {
        if (f46272a == null) {
            synchronized (ba.class) {
                try {
                    if (f46272a == null) {
                        f46272a = new ba(context);
                    }
                } finally {
                }
            }
        }
        return f46272a;
    }

    private String a(int i11) {
        return "oc_" + i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    public String a(int i11, String str) {
        SharedPreferences sharedPreferences;
        try {
            String a11 = a(i11);
            if (this.f46273b.contains(a11)) {
                sharedPreferences = this.f46273b;
            } else {
                if (!this.f952a.contains(a11)) {
                    return str;
                }
                sharedPreferences = this.f952a;
            }
            i11 = sharedPreferences.getString(a11, null);
            return i11;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a(i11 + " oc string error " + e11);
            return str;
        }
    }

    private String a(hn hnVar) {
        return "oc_version_" + hnVar.a();
    }

    public synchronized void a() {
        this.f953a.clear();
    }

    private void a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        Object obj = pair.second;
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        } else {
            String str2 = (String) obj;
            if (str.equals(a(hm.AppIsInstalledList.a()))) {
                editor.putString(str, com.xiaomi.push.bl.a(str2));
            } else {
                editor.putString(str, str2);
            }
        }
    }

    public synchronized void a(a aVar) {
        if (!this.f953a.contains(aVar)) {
            this.f953a.add(aVar);
        }
    }

    public void a(List<Pair<Integer, Object>> list) {
        if (com.xiaomi.push.ad.a(list)) {
            return;
        }
        SharedPreferences.Editor edit = this.f46273b.edit();
        for (Pair<Integer, Object> pair : list) {
            Object obj = pair.first;
            if (obj != null) {
                String a11 = a(((Integer) obj).intValue());
                if (pair.second == null) {
                    edit.remove(a11);
                } else {
                    a(edit, pair, a11);
                }
            }
        }
        edit.apply();
    }

    public void a(List<Pair<hn, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (com.xiaomi.push.ad.a(list) || com.xiaomi.push.ad.a(list2)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("not update oc, because versions or configs are empty");
            return;
        }
        SharedPreferences.Editor edit = this.f952a.edit();
        edit.clear();
        for (Pair<hn, Integer> pair : list) {
            Object obj = pair.first;
            if (obj != null && pair.second != null) {
                edit.putInt(a((hn) obj), ((Integer) pair.second).intValue());
            }
        }
        for (Pair<Integer, Object> pair2 : list2) {
            Object obj2 = pair2.first;
            if (obj2 != null && pair2.second != null) {
                a(edit, pair2, a(((Integer) obj2).intValue()));
            }
        }
        edit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    public boolean a(int i11, boolean z11) {
        SharedPreferences sharedPreferences;
        try {
            String a11 = a(i11);
            if (this.f46273b.contains(a11)) {
                sharedPreferences = this.f46273b;
            } else {
                if (!this.f952a.contains(a11)) {
                    return z11;
                }
                sharedPreferences = this.f952a;
            }
            i11 = sharedPreferences.getBoolean(a11, false);
            return i11;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a(i11 + " oc boolean error " + e11);
            return z11;
        }
    }
}
