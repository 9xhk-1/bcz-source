package com.mob.secverify.e;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.utils.SharePrefrenceHelper;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static SharePrefrenceHelper f40737a;

    static {
        try {
            SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
            f40737a = sharePrefrenceHelper;
            sharePrefrenceHelper.open("SecVerify_SPDB_V2", 1);
        } catch (Throwable unused) {
        }
    }

    public static void a(HashMap hashMap) {
        if (hashMap == null) {
            f40737a.remove("key_config");
        } else {
            f40737a.put("key_config", hashMap);
        }
    }

    public static String b() {
        String string = f40737a.getString("cache_log");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public static String c() {
        String string = f40737a.getString("key_diao");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public static String d() {
        String string = f40737a.getString("key_dnc");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public static boolean e() {
        return f40737a.getBoolean("key_preverify_success", false);
    }

    public static boolean f() {
        return f40737a.getBoolean("key_use_wo");
    }

    public static String g() {
        return f40737a.getString("key_log");
    }

    public static int h() {
        return f40737a.getInt("key_cache_type");
    }

    public static void e(String str) {
        f40737a.putString("key_cache_url", str);
    }

    public static HashMap a() {
        Object obj = f40737a.get("key_config");
        if (obj != null) {
            return (HashMap) obj;
        }
        return null;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            f40737a.remove("key_diao");
        } else {
            f40737a.putString("key_diao", str);
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f40737a.putString("key_dnc", str);
    }

    public static void d(String str) {
        f40737a.putString("key_log", str);
    }

    public static void a(ArrayList<String> arrayList) {
        if (arrayList == null) {
            f40737a.remove("key_noup");
        } else {
            f40737a.put("key_noup", arrayList);
        }
    }

    public static void b(boolean z11) {
        f40737a.putBoolean("key_auto_pre", Boolean.valueOf(z11));
    }

    public static void b(int i11) {
        f40737a.putInt("key_cache_type", Integer.valueOf(i11));
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            f40737a.remove("cache_log");
        } else {
            f40737a.putString("cache_log", str);
        }
    }

    public static void a(boolean z11) {
        f40737a.putBoolean("key_use_wo", Boolean.valueOf(z11));
    }

    public static void a(int i11) {
        f40737a.putInt("key_oppo_net", Integer.valueOf(i11));
    }
}
