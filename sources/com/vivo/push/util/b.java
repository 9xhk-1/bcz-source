package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected Context f45082a;

    /* renamed from: b, reason: collision with root package name */
    private String f45083b;

    /* renamed from: c, reason: collision with root package name */
    private volatile SharedPreferences f45084c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, String> f45085d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private HashMap<String, Long> f45086e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private HashMap<String, Integer> f45087f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private HashMap<String, Boolean> f45088g = new HashMap<>();

    private List<String> c(String str) {
        String[] split;
        if (this.f45082a == null) {
            p.c("BaseSharePreference", " parsLocalIv error mContext is null ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Context context = this.f45082a;
            Object a11 = z.a(context, context.getPackageName(), str);
            if (a11 == null) {
                return null;
            }
            String str2 = new String(Base64.decode(a11.toString(), 2));
            if (!TextUtils.isEmpty(str2) && (split = str2.split(",#@")) != null && split.length >= 4) {
                for (String str3 : split) {
                    arrayList.add(str3.replace(",#@", ""));
                }
                if (arrayList.size() < 4) {
                    return null;
                }
                return arrayList;
            }
            return null;
        } catch (Exception e11) {
            p.c("BaseSharePreference", " parsLocalIv error e =" + e11.getMessage());
            e11.printStackTrace();
            return arrayList;
        }
    }

    public final void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("sharedFileName can't be null");
        }
        this.f45083b = str;
        this.f45084c = context.getSharedPreferences(str, 0);
        this.f45082a = context;
        List<String> c11 = c("local_iv");
        if (c11 == null || c11.size() < 4) {
            p.a("BaseSharePreference", " initSecureCode error list is null ");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.vivo.push.secure_sub_iv", c11.get(1));
        hashMap.put("com.vivo.push.secure_sub_key", c11.get(2));
        hashMap.put("com.vivo.push.secure_cache_iv", c11.get(3));
        hashMap.put("com.vivo.push.secure_cache_key", c11.get(0));
        a(hashMap);
    }

    public final String b(String str, String str2) {
        String str3 = this.f45085d.get(str);
        if (str3 != null) {
            return str3;
        }
        b();
        if (this.f45084c != null) {
            str3 = this.f45084c.getString(str, str2);
            if (!TextUtils.isEmpty(str3) && !str3.equals(str2)) {
                this.f45085d.put(str, str3);
            }
        }
        return str3;
    }

    public final long b(String str, long j11) {
        Long l11 = this.f45086e.get(str);
        if (l11 != null) {
            return l11.longValue();
        }
        b();
        if (this.f45084c != null) {
            l11 = Long.valueOf(this.f45084c.getLong(str, j11));
            if (!l11.equals(Long.valueOf(j11))) {
                this.f45086e.put(str, l11);
            }
        }
        return l11.longValue();
    }

    public final void a(String str, String str2) {
        this.f45085d.put(str, str2);
        b();
        if (this.f45084c != null) {
            SharedPreferences.Editor edit = this.f45084c.edit();
            edit.putString(str, str2);
            a(edit);
        }
    }

    public final void b(String str) {
        this.f45086e.remove(str);
        this.f45087f.remove(str);
        this.f45088g.remove(str);
        this.f45085d.remove(str);
        b();
        if (this.f45084c != null) {
            SharedPreferences.Editor edit = this.f45084c.edit();
            if (this.f45084c.contains(str)) {
                edit.remove(str);
                a(edit);
            }
        }
    }

    private void a(Map<String, String> map) {
        if (map.size() > 0) {
            b();
            if (this.f45084c != null) {
                SharedPreferences.Editor edit = this.f45084c.edit();
                for (String str : map.keySet()) {
                    String str2 = map.get(str);
                    this.f45085d.put(str, str2);
                    edit.putString(str, str2);
                }
                a(edit);
            }
        }
    }

    private void b() {
        if (this.f45084c == null) {
            Context context = this.f45082a;
            if (context != null) {
                this.f45084c = context.getSharedPreferences(this.f45083b, 0);
                return;
            }
            throw new RuntimeException("SharedPreferences is not init", new Throwable());
        }
    }

    public final void a(String str, int i11) {
        this.f45087f.put(str, Integer.valueOf(i11));
        b();
        if (this.f45084c != null) {
            SharedPreferences.Editor edit = this.f45084c.edit();
            edit.putInt(str, i11);
            a(edit);
        }
    }

    public final void a(String str, long j11) {
        this.f45086e.put(str, Long.valueOf(j11));
        b();
        if (this.f45084c != null) {
            SharedPreferences.Editor edit = this.f45084c.edit();
            edit.putLong(str, j11);
            a(edit);
        }
    }

    public final int a(String str) {
        Integer num = this.f45087f.get(str);
        if (num != null) {
            return num.intValue();
        }
        b();
        if (this.f45084c != null) {
            num = Integer.valueOf(this.f45084c.getInt(str, 0));
            if (!num.equals(0)) {
                this.f45087f.put(str, num);
            }
        }
        return num.intValue();
    }

    public static void a(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    public final void a() {
        this.f45086e.clear();
        this.f45087f.clear();
        this.f45088g.clear();
        this.f45085d.clear();
        b();
        if (this.f45084c != null) {
            SharedPreferences.Editor edit = this.f45084c.edit();
            edit.clear();
            a(edit);
        }
    }
}
