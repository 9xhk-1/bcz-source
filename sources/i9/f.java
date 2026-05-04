package i9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.baicizhan.client.business.dataset.provider.a;
import java.lang.reflect.Type;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f {
    public static final String A = "global.key_global_showed_dual_red_dot";
    public static final String B = "global.key_global_show_export_pdf_tip";
    public static final String C = "global.key_global_show_meaning_selector_tip";
    public static final String D = "global.key_global_show_camera_tip";
    public static final String E = "global.key_global_word_book_share_disclaimer_confirmed";
    public static final String F = "global.key_global_word_book_share_disclaimer_show_date";
    public static final String G = "global.key_global_marked_words_order_reverse";
    public static final String H = "global.key_global_marked_words_mean_show";
    public static final String I = "user";
    public static final String J = "user.book_update_md5";
    public static final String K = "user.book_force_update_topics";
    public static final String L = "user.email";
    public static final String M = "user.public_key";
    public static final String N = "user.has_word_friends";
    public static final String O = "user.selftest";
    public static final String P = "user.promotion_ad";
    public static final String Q = "user.last_vocab_test_time";
    public static final String R = "user.unique_id";
    public static final String S = "user.collect_words_version";
    public static final String T = "user.shopping_timestamp";
    public static final String U = "user.pattern_switcher";
    public static final String V = "user.daka_dates";
    public static final String W = "user.problem_enable";
    public static final String X = "user.plus_review_count";
    public static final String Y = "user.speed_listen_topic_ids";
    public static final String Z = "user.read_plan_last_play";

    /* renamed from: a, reason: collision with root package name */
    public static final String f60360a = "KVHelper";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f60361a0 = "user.refresh_user_info";

    /* renamed from: b, reason: collision with root package name */
    public static final String f60362b = "global.database_version";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f60363b0 = "user.discover_list";

    /* renamed from: c, reason: collision with root package name */
    public static final String f60364c = "global.book_categories";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f60365c0 = "user.beta_type_list";

    /* renamed from: d, reason: collision with root package name */
    public static final String f60366d = "global.levels_info";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f60367d0 = "user.high_level_book_list";

    /* renamed from: e, reason: collision with root package name */
    public static final String f60368e = "global.all_tops_info";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f60369e0 = "user.default_post_daka";

    /* renamed from: f, reason: collision with root package name */
    public static final String f60370f = "global.book_list_version_v2";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f60371f0 = "user.last_remind_bind_timestamp";

    /* renamed from: g, reason: collision with root package name */
    public static final String f60372g = "global.new_feature_guide_flags";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f60373g0 = "apk.last_apk_version_name";

    /* renamed from: h, reason: collision with root package name */
    public static final String f60374h = "global.service_urls";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f60375h0 = "apk.version_prompt";

    /* renamed from: i, reason: collision with root package name */
    public static final String f60376i = "global.stat_mobile_quota";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f60377i0 = "user.primary_config";

    /* renamed from: j, reason: collision with root package name */
    public static final String f60378j = "global.stat_mobile_quota_ts";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f60379j0 = "user.new_user_group_flags";

    /* renamed from: k, reason: collision with root package name */
    public static final String f60380k = "global.book_list_with_resource";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f60381k0 = "user.user_role_info_flags";

    /* renamed from: l, reason: collision with root package name */
    public static final String f60382l = "global.word_cloze_book_table_base";

    /* renamed from: l0, reason: collision with root package name */
    public static final String f60383l0 = "user.user_enter_setting_grade";

    /* renamed from: m, reason: collision with root package name */
    public static final String f60384m = "global.net_hijack_black_list";

    /* renamed from: m0, reason: collision with root package name */
    public static final String f60385m0 = "user.word_books_max_limit";

    /* renamed from: n, reason: collision with root package name */
    public static final String f60386n = "global.word_reading_tip_shown";

    /* renamed from: n0, reason: collision with root package name */
    public static final String f60387n0 = "user.grade_update_remind";

    /* renamed from: o, reason: collision with root package name */
    public static final String f60388o = "global.new_user_exp_plan_guide";

    /* renamed from: o0, reason: collision with root package name */
    public static final String f60389o0 = "user.word_list_order_type_";

    /* renamed from: p, reason: collision with root package name */
    public static final String f60390p = "global.new_user_exp_more_count";

    /* renamed from: p0, reason: collision with root package name */
    public static final long f60391p0 = 0;

    /* renamed from: q, reason: collision with root package name */
    public static final String f60392q = "global.review_recall_mode_hide";

    /* renamed from: q0, reason: collision with root package name */
    public static final long f60393q0 = 1;

    /* renamed from: r, reason: collision with root package name */
    public static final String f60394r = "global.review_recall_guide_flag";

    /* renamed from: r0, reason: collision with root package name */
    public static final long f60395r0 = 2;

    /* renamed from: s, reason: collision with root package name */
    public static final String f60396s = "global.golden_nav_exam_assistant";

    /* renamed from: t, reason: collision with root package name */
    public static final String f60397t = "global.ocr_words_parsing_guide";

    /* renamed from: u, reason: collision with root package name */
    public static final String f60398u = "global.winning_tasks_guide";

    /* renamed from: v, reason: collision with root package name */
    public static final String f60399v = "global.rank_parsing_guide";

    /* renamed from: w, reason: collision with root package name */
    public static final String f60400w = "global.calendar_parsing_guide";

    /* renamed from: x, reason: collision with root package name */
    public static final String f60401x = "global.ocr_words_camera_taken_guide";

    /* renamed from: y, reason: collision with root package name */
    public static final String f60402y = "global.word_book_export_guide";

    /* renamed from: z, reason: collision with root package name */
    public static final String f60403z = "global.key_global_switch_mode_guide";

    public static void a(Context context, String key) {
        context.getContentResolver().delete(a.d.f16160b, "key = ?", new String[]{key});
    }

    public static void b(Context context, String parentKey) {
        context.getContentResolver().delete(a.d.f16160b, "key like ?", new String[]{parentKey + "%"});
    }

    public static boolean c(Context context, String key) {
        return f(context, key) > 0;
    }

    public static int d(Context context, String key) {
        return (int) f(context, key);
    }

    public static <T> T e(Context context, String str, Type type, boolean z11) {
        try {
            return (T) new com.google.gson.d().o(g(context, str, z11), type);
        } catch (Exception e11) {
            qb.c.c(f60360a, "", e11);
            return null;
        }
    }

    public static long f(Context context, String key) {
        String g11 = g(context, key, false);
        try {
            if (TextUtils.isEmpty(g11)) {
                return 0L;
            }
            return Long.valueOf(g11).longValue();
        } catch (Exception e11) {
            qb.c.d(f60360a, "Conversion of " + g11 + " error: " + e11.toString(), new Object[0]);
            return 0L;
        }
    }

    public static String g(Context context, String key, boolean compressed) {
        try {
            String D2 = k9.a.D(k9.c.i(a.d.f16160b).g("value").m("key = ?", key).d(context));
            if (!TextUtils.isEmpty(D2) && compressed) {
                return new String(xb.k.d(Base64.decode(D2.getBytes(), 0)));
            }
            return D2;
        } catch (Exception e11) {
            qb.c.c(f60360a, "", e11);
            return null;
        }
    }

    public static String h(String baseKey, String key) {
        return String.format(Locale.CHINA, "%s.%s", baseKey, key);
    }

    public static boolean i(Context context, String key) {
        Cursor d11 = k9.c.i(a.d.f16160b).m("key = ?", key).d(context);
        return d11 != null && d11.getCount() > 0;
    }

    public static void j(Context context, String key, boolean bool) {
        m(context, key, bool ? 1L : 0L);
    }

    public static void k(Context context, String key, int value) {
        n(context, key, Integer.toString(value), false);
    }

    public static <T> void l(Context context, String key, T value, Type type, boolean compressed) {
        n(context, key, new com.google.gson.d().A(value, type), compressed);
    }

    public static void m(Context context, String key, long value) {
        n(context, key, Long.toString(value), false);
    }

    public static void n(Context context, String key, String value, boolean compressed) {
        try {
            ContentValues contentValues = new ContentValues();
            if (compressed) {
                value = new String(Base64.encode(xb.k.b(value.getBytes()), 0));
            }
            contentValues.put(a.d.C0245a.f16161a, key);
            contentValues.put("value", value);
            context.getContentResolver().insert(a.d.f16160b, contentValues);
        } catch (Exception e11) {
            qb.c.c(f60360a, "", e11);
        }
    }
}
