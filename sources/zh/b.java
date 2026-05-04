package zh;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f102687a = "pref_play_zhanhuwei";

    /* renamed from: b, reason: collision with root package name */
    public static final String f102688b = "pref_first_walklisten";

    /* renamed from: c, reason: collision with root package name */
    public static final String f102689c = "pref_read_sentence";

    /* renamed from: d, reason: collision with root package name */
    public static final String f102690d = "pref_read_circle";

    public static boolean a() {
        return ia.a.e().getBoolean(f102688b, true);
    }

    public static boolean b() {
        return ia.a.e().getBoolean(f102687a, true);
    }

    public static boolean c() {
        SharedPreferences e11 = ia.a.e();
        return e11 != null && e11.getBoolean(f102690d, false);
    }

    public static boolean d() {
        SharedPreferences e11 = ia.a.e();
        return e11 != null && e11.getBoolean(f102689c, false);
    }

    public static void e(boolean first) {
        ia.a.e().edit().putBoolean(f102688b, first).commit();
    }

    public static void f(boolean need) {
        SharedPreferences e11 = ia.a.e();
        if (e11 != null) {
            e11.edit().putBoolean(f102690d, need).apply();
        }
    }

    public static void g(boolean need) {
        SharedPreferences e11 = ia.a.e();
        if (e11 != null) {
            e11.edit().putBoolean(f102689c, need).apply();
        }
    }

    public static void h(boolean play) {
        ia.a.e().edit().putBoolean(f102687a, play).commit();
    }
}
