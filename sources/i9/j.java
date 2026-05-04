package i9;

import android.content.ContentValues;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f60410a = "PropertyHelper";

    /* renamed from: b, reason: collision with root package name */
    public static a f60411b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f60412c = "app_root";

    /* renamed from: d, reason: collision with root package name */
    public static final String f60413d = "current_book_id";

    /* renamed from: e, reason: collision with root package name */
    public static final String f60414e = "show_image_mean";

    /* renamed from: f, reason: collision with root package name */
    public static final String f60415f = "sound_effect";

    /* renamed from: g, reason: collision with root package name */
    public static final String f60416g = "show_sentence_translation";

    /* renamed from: h, reason: collision with root package name */
    public static final String f60417h = "anto_danced";

    /* renamed from: i, reason: collision with root package name */
    public static final String f60418i = "share_mode_classical_new";

    /* renamed from: j, reason: collision with root package name */
    public static final String f60419j = "show_deformation";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends ContentObserver {

        /* renamed from: b, reason: collision with root package name */
        public static final String f60420b = new String();

        /* renamed from: a, reason: collision with root package name */
        public Map<String, String> f60421a;

        public a(Handler handler) {
            super(handler);
            this.f60421a = Collections.synchronizedMap(new HashMap());
        }

        public void a(String key) {
            this.f60421a.remove(key);
            pb.a.a().getContentResolver().delete(a.h.f16195b, "KEY = ?", new String[]{key});
        }

        public String b(String key, String def) {
            String str = this.f60421a.get(key);
            if (str == null) {
                Cursor cursor = null;
                try {
                    try {
                        Cursor d11 = k9.c.i(a.h.f16195b).m("KEY = ?", key).g(a.h.C0249a.f16197b).d(pb.a.a());
                        if (d11 != null && d11.getCount() != 0) {
                            d11.moveToFirst();
                            String string = d11.getString(0);
                            this.f60421a.put(key, string);
                            d11.close();
                            return string;
                        }
                        this.f60421a.put(key, f60420b);
                        if (d11 != null) {
                            d11.close();
                            return def;
                        }
                    } catch (Exception e11) {
                        qb.c.d(j.f60410a, e11.toString(), new Object[0]);
                        if (0 != 0) {
                            cursor.close();
                        }
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th2;
                }
            } else if (str != f60420b) {
                return str;
            }
            return def;
        }

        public void c(String key, String value) {
            this.f60421a.put(key, value);
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.h.C0249a.f16196a, key);
            contentValues.put(a.h.C0249a.f16197b, value);
            pb.a.a().getContentResolver().insert(a.h.f16195b, contentValues);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) {
            super.onChange(selfChange, uri);
            String queryParameter = uri.getQueryParameter(a.d.C0245a.f16161a);
            if (TextUtils.isEmpty(queryParameter)) {
                this.f60421a.clear();
            } else {
                this.f60421a.remove(queryParameter);
            }
        }
    }

    public static void a(String key) {
        f60411b.a(key);
    }

    public static boolean b(String key) {
        return c(key, false);
    }

    public static boolean c(String key, boolean def) {
        return g(key, def ? 1L : 0L) != 0;
    }

    public static int d(String key) {
        return e(key, 0);
    }

    public static int e(String key, int def) {
        return (int) g(key, def);
    }

    public static long f(String key) {
        return g(key, 0L);
    }

    public static long g(String key, long def) {
        String i11 = i(key, null);
        if (!TextUtils.isEmpty(i11)) {
            try {
                return Long.valueOf(i11).longValue();
            } catch (Exception unused) {
            }
        }
        return def;
    }

    public static String h(String key) {
        return i(key, null);
    }

    public static String i(String key, String def) {
        return f60411b.b(key, def);
    }

    public static void j() {
        f60411b = new a(new Handler(Looper.getMainLooper()));
        pb.a.a().getContentResolver().registerContentObserver(a.h.f16195b, true, f60411b);
    }

    public static void k(String key, int value) {
        l(key, value);
    }

    public static void l(String key, long value) {
        m(key, Long.toString(value));
    }

    public static void m(String key, String value) {
        f60411b.c(key, value);
    }

    public static void n(String key, boolean value) {
        l(key, value ? 1L : 0L);
    }
}
