package ia;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import i9.j;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f60450a = "baicizhan.pref";

    /* renamed from: b, reason: collision with root package name */
    public static Context f60451b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f60452c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f60453d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final String f60454e = "pref_theme";

    /* renamed from: f, reason: collision with root package name */
    public static final String f60455f = "pref_notice_setting_time";

    /* renamed from: g, reason: collision with root package name */
    public static final String f60456g = "pref_notice_setting_enable";

    /* renamed from: h, reason: collision with root package name */
    public static final String f60457h = "pref_guide_flags";

    /* renamed from: i, reason: collision with root package name */
    public static final String f60458i = "pref_old_user_guide_flags";

    /* renamed from: j, reason: collision with root package name */
    public static final String f60459j = "pref_complete_review_count";

    /* renamed from: k, reason: collision with root package name */
    public static final String f60460k = "pref_last_user_info_time";

    /* renamed from: l, reason: collision with root package name */
    public static final String f60461l = "pref_ad_show_index";

    /* renamed from: m, reason: collision with root package name */
    public static final String f60462m = "pref_lookup_db_enabled";

    /* renamed from: n, reason: collision with root package name */
    public static final String f60463n = "pref_voice_recog_enabled";

    /* renamed from: o, reason: collision with root package name */
    public static final String f60464o = "pref_last_bcz_account";

    /* renamed from: p, reason: collision with root package name */
    public static final String f60465p = "pref_main_tab_promotion_time";

    /* renamed from: q, reason: collision with root package name */
    public static final String f60466q = "pref_last_plus_review_count_date";

    /* renamed from: r, reason: collision with root package name */
    public static final String f60467r = "pref_learn_record_last_sync_time";

    /* renamed from: s, reason: collision with root package name */
    public static final String f60468s = "pref_little_class_update_time";

    /* renamed from: t, reason: collision with root package name */
    public static final String f60469t = "pref_feedback_update_time";

    /* renamed from: u, reason: collision with root package name */
    public static final String f60470u = "pref_campaign_update_time";

    /* renamed from: v, reason: collision with root package name */
    public static final String f60471v = "pref_remind_study_dialog";

    /* renamed from: w, reason: collision with root package name */
    public static final String f60472w = "pref_last_remind_time";

    public static boolean a(String key, boolean defvalue) {
        SharedPreferences e11 = e();
        return e11 != null ? e11.getBoolean(key, defvalue) : defvalue;
    }

    public static float b(String key) {
        SharedPreferences e11 = e();
        if (e11 != null) {
            return e11.getFloat(key, 0.0f);
        }
        return 0.0f;
    }

    public static int c(String key) {
        SharedPreferences e11 = e();
        if (e11 != null) {
            return e11.getInt(key, 0);
        }
        return 0;
    }

    public static long d(String key) {
        SharedPreferences e11 = e();
        if (e11 != null) {
            return e11.getLong(key, 0L);
        }
        return 0L;
    }

    public static SharedPreferences e() {
        Context a11 = pb.a.a() != null ? pb.a.a() : f60451b;
        if (a11 != null) {
            return a11.getSharedPreferences(f60450a, 0);
        }
        c.d("", "get shared preferences failed for null context. process id [%d]", Integer.valueOf(Process.myPid()));
        return null;
    }

    public static String f(String key) {
        SharedPreferences e11 = e();
        if (e11 != null) {
            return e11.getString(key, null);
        }
        return null;
    }

    public static int g() {
        SharedPreferences e11 = e();
        if (e11 != null) {
            return e11.getInt(f60454e, 0);
        }
        return 0;
    }

    public static boolean h() {
        return j.c(f60462m, false);
    }

    public static void i(String key, boolean value) {
        SharedPreferences e11 = e();
        if (e11 != null) {
            e11.edit().putBoolean(key, value).apply();
        }
    }

    public static void j(String key, float value) {
        SharedPreferences e11 = e();
        if (e11 != null) {
            e11.edit().putFloat(key, value).apply();
        }
    }

    public static void k(String key, int value) {
        SharedPreferences e11 = e();
        if (e11 != null) {
            e11.edit().putInt(key, value).apply();
        }
    }

    public static void l(String key, long value) {
        SharedPreferences e11 = e();
        if (e11 != null) {
            e11.edit().putLong(key, value).apply();
        }
    }

    public static void m(String key, String value) {
        SharedPreferences e11 = e();
        if (e11 != null) {
            e11.edit().putString(key, value).apply();
        }
    }

    public static void n(Context context) {
        f60451b = context.getApplicationContext();
    }

    public static void o(boolean enabled) {
        j.n(f60462m, enabled);
    }

    public static void p(int theme) {
        SharedPreferences e11 = e();
        if (e11 != null) {
            SharedPreferences.Editor edit = e11.edit();
            edit.putInt(f60454e, theme);
            edit.apply();
        }
    }
}
