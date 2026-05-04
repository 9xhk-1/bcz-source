package com.baicizhan.client.business.dataset.provider;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16087a = "baicizhandb";

    /* renamed from: c, reason: collision with root package name */
    public static final String f16089c = "raw_query";

    /* renamed from: d, reason: collision with root package name */
    public static final String f16090d = "raw_exec";

    /* renamed from: b, reason: collision with root package name */
    public static final String f16088b = "com.jiongji.andriod.card.provider";

    /* renamed from: e, reason: collision with root package name */
    public static final Uri f16091e = new Uri.Builder().scheme("content").authority(f16088b).build();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.dataset.provider.a$a, reason: collision with other inner class name */
    public static class C0239a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16092a = "ts_offline_road_map_ids";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$a$a, reason: collision with other inner class name */
        public static class C0240a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16093a = "topic_id_index";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16094b = "topic_id";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16095c = "options";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16096d = "tapescript_id";
        }

        public static Uri a(int bookId) {
            return a.d(c.f16130e, b(bookId));
        }

        public static String b(int bookId) {
            return String.format(Locale.US, "%s_%02d", f16092a, Integer.valueOf(bookId));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a0 {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16097a = "ZBOOKWORDINFO";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16098b = a.d(c.f16132g, f16097a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$a0$a, reason: collision with other inner class name */
        public static class C0241a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16099a = "BOOK_ID";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16100b = "UPDATETIME";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16101c = "TYPE";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16102d = "ALL_WORD";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16103a = "tb_collect_words";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16104b = a.d(c.f16132g, f16103a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$b$a, reason: collision with other inner class name */
        public static final class C0242a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16105a = "universe_topic_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16106b = "create_at";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16107c = "score";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16108d = "word";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16109e = "meanCn";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16110f = "accent";

            /* renamed from: g, reason: collision with root package name */
            public static final String f16111g = "audio";
        }

        public static void a(SQLiteDatabase db2) {
            db2.execSQL("CREATE TABLE IF NOT EXISTS tb_collect_words (\"universe_topic_id\" INTEGER PRIMARY KEY NOT NULL ,\"word\" TEXT,\"meanCn\" TEXT,\"accent\" TEXT,\"audio\" TEXT,\"create_at\" INTEGER NOT NULL ,\"score\" INTEGER NOT NULL );");
        }

        public static void b(SQLiteDatabase db2) {
            db2.execSQL("DROP TABLE IF EXISTS tb_collect_words");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b0 {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16112a = "ZLOGINUSER";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16113b = a.d(c.f16128c, f16112a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$b0$a, reason: collision with other inner class name */
        public static class C0243a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16114a = "USER";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16115b = "ZSESSION";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16116c = "ZLOGINTYPE";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16117d = "ZPASSWORDMD5";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16118e = "ZSAVESTATUS";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16119f = "ZPROFILEIMAGE";

            /* renamed from: g, reason: collision with root package name */
            public static final String f16120g = "ZSEX";

            /* renamed from: h, reason: collision with root package name */
            public static final String f16121h = "ZUSERNICKNAME";

            /* renamed from: i, reason: collision with root package name */
            public static final String f16122i = "ZPHONE";

            /* renamed from: j, reason: collision with root package name */
            public static final String f16123j = "ZLASTLOGINTIME";

            /* renamed from: k, reason: collision with root package name */
            public static final String f16124k = "ZBIRTHDAY";

            /* renamed from: l, reason: collision with root package name */
            public static final String f16125l = "ZLOCATION";

            /* renamed from: m, reason: collision with root package name */
            public static final String f16126m = "ZEDUCATION";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c {

        /* renamed from: b, reason: collision with root package name */
        public static final String f16127b = "baicizhanproperty.db";

        /* renamed from: c, reason: collision with root package name */
        public static final String f16128c = "baicizhanuser.db";

        /* renamed from: d, reason: collision with root package name */
        public static final String f16129d = "baicizhantopic.db";

        /* renamed from: e, reason: collision with root package name */
        public static final String f16130e = "baicizhantopicproblem.db";

        /* renamed from: f, reason: collision with root package name */
        public static final String f16131f = "baicizhanwordradiotopic.db";

        /* renamed from: g, reason: collision with root package name */
        public static final String f16132g = "baicizhandoexampleinfo.db";

        /* renamed from: h, reason: collision with root package name */
        public static final String f16133h = "jiongjidaily_json.sqlite";

        /* renamed from: i, reason: collision with root package name */
        public static final String f16134i = "word_media.db";

        /* renamed from: j, reason: collision with root package name */
        public static final String f16135j = "lockdb.db";

        /* renamed from: k, reason: collision with root package name */
        public static final String f16136k = "jiongdailycloze.sqlite";

        /* renamed from: l, reason: collision with root package name */
        public static final String f16137l = "lookup.db";

        public c() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c0 {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16139a = "ZSHORTPHRASETOPICRESOURCE";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16140b = a.d(c.f16129d, f16139a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$c0$a, reason: collision with other inner class name */
        public static class C0244a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16141a = "TOPIC";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16142b = "ZWORD";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16143c = "ZSENTENCE";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16144d = "ZWORDVIDEO";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16145e = "ZSENTENCEVIDEO";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16146f = "ZIMAGEPATH";

            /* renamed from: g, reason: collision with root package name */
            public static final String f16147g = "ZWORDMEAN";

            /* renamed from: h, reason: collision with root package name */
            public static final String f16148h = "ZWORDVARIANTS";

            /* renamed from: i, reason: collision with root package name */
            public static final String f16149i = "ZSIMILAR_HIGHLIGHT";

            /* renamed from: j, reason: collision with root package name */
            public static final String f16150j = "ZSENTENCE2";

            /* renamed from: k, reason: collision with root package name */
            public static final String f16151k = "ZSENTENCE_TRANS";

            /* renamed from: l, reason: collision with root package name */
            public static final String f16152l = "ZSENTENCE_TRANS2";

            /* renamed from: m, reason: collision with root package name */
            public static final String f16153m = "ZSENTENCEVIDEO2";

            /* renamed from: n, reason: collision with root package name */
            public static final String f16154n = "ZEXPLAINCIDEO";

            /* renamed from: o, reason: collision with root package name */
            public static final String f16155o = "ZEXPLAIN";

            /* renamed from: p, reason: collision with root package name */
            public static final String f16156p = "ZSENTENCEWORDHIGHLIGHT";

            /* renamed from: q, reason: collision with root package name */
            public static final String f16157q = "ZSENTENCEWORDHIGHLIGHT2";

            /* renamed from: r, reason: collision with root package name */
            public static final String f16158r = "ZEXAMINFO";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16159a = "KVDICT";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16160b = a.d(c.f16132g, f16159a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$d$a, reason: collision with other inner class name */
        public static class C0245a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16161a = "key";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16162b = "value";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16163a = "dict_a_b";

        /* renamed from: j, reason: collision with root package name */
        public static final Uri f16172j = a.d(c.f16137l, f16163a);

        /* renamed from: b, reason: collision with root package name */
        public static final String f16164b = "dict_c";

        /* renamed from: k, reason: collision with root package name */
        public static final Uri f16173k = a.d(c.f16137l, f16164b);

        /* renamed from: c, reason: collision with root package name */
        public static final String f16165c = "dict_d_f";

        /* renamed from: l, reason: collision with root package name */
        public static final Uri f16174l = a.d(c.f16137l, f16165c);

        /* renamed from: d, reason: collision with root package name */
        public static final String f16166d = "dict_g_k";

        /* renamed from: m, reason: collision with root package name */
        public static final Uri f16175m = a.d(c.f16137l, f16166d);

        /* renamed from: e, reason: collision with root package name */
        public static final String f16167e = "dict_l_o";

        /* renamed from: n, reason: collision with root package name */
        public static final Uri f16176n = a.d(c.f16137l, f16167e);

        /* renamed from: f, reason: collision with root package name */
        public static final String f16168f = "dict_p_r";

        /* renamed from: o, reason: collision with root package name */
        public static final Uri f16177o = a.d(c.f16137l, f16168f);

        /* renamed from: g, reason: collision with root package name */
        public static final String f16169g = "dict_s";

        /* renamed from: p, reason: collision with root package name */
        public static final Uri f16178p = a.d(c.f16137l, f16169g);

        /* renamed from: h, reason: collision with root package name */
        public static final String f16170h = "dict_t_z";

        /* renamed from: q, reason: collision with root package name */
        public static final Uri f16179q = a.d(c.f16137l, f16170h);

        /* renamed from: i, reason: collision with root package name */
        public static final String f16171i = "dict_bcz";

        /* renamed from: r, reason: collision with root package name */
        public static final Uri f16180r = a.d(c.f16137l, f16171i);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$e$a, reason: collision with other inner class name */
        public static final class C0246a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16181a = "topic_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16182b = "word";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16183c = "accent";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16184d = "mean_cn";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16185e = "freq";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16186f = "word_length";
        }

        public static Uri a(String key) {
            char charAt = key.toLowerCase().charAt(0);
            return (charAt < 'a' || charAt > 'b') ? charAt == 'c' ? f16173k : (charAt < 'd' || charAt > 'f') ? (charAt < 'g' || charAt > 'k') ? (charAt < 'l' || charAt > 'o') ? (charAt < 'p' || charAt > 'r') ? charAt == 's' ? f16178p : f16179q : f16177o : f16176n : f16175m : f16174l : f16172j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16187a = "topic_book_map";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16188b = a.d(c.f16137l, f16187a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$f$a, reason: collision with other inner class name */
        public static final class C0247a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16189a = "topic_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16190b = "book_ids";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16191a = "tb_phrase_match_result";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$g$a, reason: collision with other inner class name */
        public static class C0248a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16192a = "word_topic_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16193b = "result";
        }

        public static Uri a(int bookId) {
            return a.d(c.f16130e, b(bookId));
        }

        public static String b(int bookId) {
            return String.format(Locale.US, "%s_%02d", f16191a, Integer.valueOf(bookId));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16194a = "ZPROPERTY";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16195b = a.d(c.f16127b, f16194a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$h$a, reason: collision with other inner class name */
        public static class C0249a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16196a = "KEY";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16197b = "VALUE";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16198a = "topic_resource";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$i$a, reason: collision with other inner class name */
        public static class C0250a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16199a = "topic";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16200b = "zpk_path";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16201c = "update_flag_md5";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16202d = "coverage";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16203e = "zpk_version";
        }

        public static Uri a(int bookId) {
            return a.d(c.f16129d, b(bookId));
        }

        public static String b(int bookId) {
            return String.format(Locale.US, "%s_%02d", f16198a, Integer.valueOf(bookId));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16204a = "ts_learn_offline_dotopic_sync_ids";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$j$a, reason: collision with other inner class name */
        public static class C0251a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16205a = "topic_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16206b = "topic_obn";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16207c = "topic_day";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16208d = "total_time";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16209e = "do_num";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16210f = "err_num";

            /* renamed from: g, reason: collision with root package name */
            public static final String f16211g = "sync_state";

            /* renamed from: h, reason: collision with root package name */
            public static final String f16212h = "is_today_new";

            /* renamed from: i, reason: collision with root package name */
            public static final String f16213i = "last_do_time";

            /* renamed from: j, reason: collision with root package name */
            public static final String f16214j = "radio_state";

            /* renamed from: k, reason: collision with root package name */
            public static final String f16215k = "radio_post_state";

            /* renamed from: l, reason: collision with root package name */
            public static final String f16216l = "radio_skip_state";

            /* renamed from: m, reason: collision with root package name */
            public static final String f16217m = "radio_tv_state";

            /* renamed from: n, reason: collision with root package name */
            public static final String f16218n = "create_at";

            /* renamed from: o, reason: collision with root package name */
            public static final String f16219o = "extra";

            /* renamed from: p, reason: collision with root package name */
            public static final String f16220p = "review_round";
        }

        public static Uri a(int bookId) {
            return a.d(c.f16130e, b(bookId));
        }

        public static String b(int bookId) {
            return String.format(Locale.US, "%s_%02d", f16204a, Integer.valueOf(bookId));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16221a = "ts_offline_dotopic_sync_ids";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$k$a, reason: collision with other inner class name */
        public static class C0252a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16222a = "topic_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16223b = "topic_obn";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16224c = "topic_day";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16225d = "total_time";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16226e = "do_num";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16227f = "err_num";

            /* renamed from: g, reason: collision with root package name */
            public static final String f16228g = "sync_state";

            /* renamed from: h, reason: collision with root package name */
            public static final String f16229h = "is_today_new";

            /* renamed from: i, reason: collision with root package name */
            public static final String f16230i = "last_do_time";

            /* renamed from: j, reason: collision with root package name */
            public static final String f16231j = "tag_id";

            /* renamed from: k, reason: collision with root package name */
            public static final String f16232k = "review_round";
        }

        public static Uri a(int bookId) {
            return a.d(c.f16130e, b(bookId));
        }

        public static String b(int bookId) {
            return String.format(Locale.US, "%s_%02d", f16221a, Integer.valueOf(bookId));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16233a = "ts_offline_sync_state";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16234b = a.d(c.f16130e, f16233a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$l$a, reason: collision with other inner class name */
        public static class C0253a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16235a = "book_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16236b = "run_time";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16237c = "want_more_count";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16238d = "combo_count";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16239e = "max_combo_count";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16240a = "ts_topic_data_all";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16241b = a.d(c.f16133h, f16240a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$m$a, reason: collision with other inner class name */
        public static class C0254a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16242a = "topic_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16243b = "topic_updatetime";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16244c = "topic_complete";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16245d = "topic_word";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16246e = "topic_word_transfrom";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16247f = "topic_word_interpret";

            /* renamed from: g, reason: collision with root package name */
            public static final String f16248g = "topic_example";

            /* renamed from: h, reason: collision with root package name */
            public static final String f16249h = "topic_example_interpret";

            /* renamed from: i, reason: collision with root package name */
            public static final String f16250i = "topic_image";

            /* renamed from: j, reason: collision with root package name */
            public static final String f16251j = "topic_image_size";

            /* renamed from: k, reason: collision with root package name */
            public static final String f16252k = "topic_thumbnail";

            /* renamed from: l, reason: collision with root package name */
            public static final String f16253l = "topic_thumbnail_size";

            /* renamed from: m, reason: collision with root package name */
            public static final String f16254m = "topic_word_audio_url";

            /* renamed from: n, reason: collision with root package name */
            public static final String f16255n = "topic_example_audio_url";

            /* renamed from: o, reason: collision with root package name */
            public static final String f16256o = "topic_read";

            /* renamed from: p, reason: collision with root package name */
            public static final String f16257p = "topic_accent";

            /* renamed from: q, reason: collision with root package name */
            public static final String f16258q = "topic_attr_options";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16259a = "ts_word_radio_half_time";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16260b = a.d(c.f16131f, f16259a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$n$a, reason: collision with other inner class name */
        public static class C0255a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16261a = "ws_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16262b = "ws_bookid";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16263c = "ws_complete";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16264d = "ws_audio";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16265e = "ws_update_time";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16266f = "ws_word_tv";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16267a = "ts_word_station_data_all";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16268b = a.d(c.f16131f, f16267a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$o$a, reason: collision with other inner class name */
        public static class C0256a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16269a = "ws_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16270b = "ws_complete";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16271c = "ws_word";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16272d = "ws_word_type";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16273e = "ws_word_cn";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16274f = "ws_sentence";

            /* renamed from: g, reason: collision with root package name */
            public static final String f16275g = "ws_desc";

            /* renamed from: h, reason: collision with root package name */
            public static final String f16276h = "ws_audio";

            /* renamed from: i, reason: collision with root package name */
            public static final String f16277i = "ws_audio_high";

            /* renamed from: j, reason: collision with root package name */
            public static final String f16278j = "ws_update_time";

            /* renamed from: k, reason: collision with root package name */
            public static final String f16279k = "tv_vedio_path";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16280a = "ts_word_cloze";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$p$a, reason: collision with other inner class name */
        public static final class C0257a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16281a = "topic_id";
        }

        public static Uri a(int bookId) {
            return a.d(c.f16130e, b(bookId));
        }

        public static String b(int bookId) {
            return String.format(Locale.US, "%s_%02d", "ts_word_cloze", Integer.valueOf(bookId));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class q {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16282a = "ts_word_cloze";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16283b = a.d(c.f16136k, "ts_word_cloze");

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$q$a, reason: collision with other inner class name */
        public static final class C0258a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16284a = "topic_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16285b = "cloze_data";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class r {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16286a = "tb_search_history";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16287b = a.d(c.f16135j, f16286a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$r$a, reason: collision with other inner class name */
        public static class C0259a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16288a = "time";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16289b = "book_id";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16290c = "topic_id";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16291d = "word";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16292e = "accent";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16293f = "cnmean";

            /* renamed from: g, reason: collision with root package name */
            public static final String f16294g = "audio";

            /* renamed from: h, reason: collision with root package name */
            public static final String f16295h = "example";

            /* renamed from: i, reason: collision with root package name */
            public static final String f16296i = "cnexample";

            /* renamed from: j, reason: collision with root package name */
            public static final String f16297j = "image";

            /* renamed from: k, reason: collision with root package name */
            public static final String f16298k = "vivid";

            /* renamed from: l, reason: collision with root package name */
            public static final String f16299l = "enmean";

            /* renamed from: m, reason: collision with root package name */
            public static final String f16300m = "root";

            /* renamed from: n, reason: collision with root package name */
            public static final String f16301n = "zpk_path";

            /* renamed from: o, reason: collision with root package name */
            public static final String f16302o = "flag";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class s {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16303a = "tb_word_media_book";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16304b = a.d(c.f16134i, "tb_word_media_book");

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$s$a, reason: collision with other inner class name */
        public static class C0260a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16305a = "loaded_book_id";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class t {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16306a = "tb_word_media_mid";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16307b = a.d(c.f16134i, "tb_word_media_mid");

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$t$a, reason: collision with other inner class name */
        public static class C0261a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16308a = "path";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16309b = "type";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class u {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16310a = "tb_word_media_mid_update";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16311b = a.d(c.f16134i, "tb_word_media_mid_update");

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$u$a, reason: collision with other inner class name */
        public static class C0262a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16312a = "fm_mid_update";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16313b = "tv_mid_update";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class v {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16314a = "tb_word_media";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$v$a, reason: collision with other inner class name */
        public static class C0263a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16315a = "topic_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16316b = "topic_word";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16317c = "topic_word_type";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16318d = "topic_word_cnmean";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16319e = "topic_sentence";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16320f = "m4a_audio_path";

            /* renamed from: g, reason: collision with root package name */
            public static final String f16321g = "amr_audio_path";

            /* renamed from: h, reason: collision with root package name */
            public static final String f16322h = "tv_path";

            /* renamed from: i, reason: collision with root package name */
            public static final String f16323i = "tv_snapshot_path";

            /* renamed from: j, reason: collision with root package name */
            public static final String f16324j = "fm_updated_at";

            /* renamed from: k, reason: collision with root package name */
            public static final String f16325k = "tv_updated_at";
        }

        public static Uri a(int bookId) {
            return a.d(c.f16134i, b(bookId));
        }

        public static String b(int bookId) {
            return String.format(Locale.US, "%s_%02d", f16314a, Integer.valueOf(bookId));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class w {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16326a = "tb_word_media_update";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$w$a, reason: collision with other inner class name */
        public static class C0264a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16327a = "word_topic_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16328b = "fm_updated_at";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16329c = "tv_updated_at";
        }

        public static Uri a(int bookId) {
            return a.d(c.f16134i, b(bookId));
        }

        public static String b(int bookId) {
            return String.format(Locale.US, "%s_%02d", f16326a, Integer.valueOf(bookId));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class x {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16330a = "word_tv_learn_ids";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16331b = a.d(c.f16134i, f16330a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$x$a, reason: collision with other inner class name */
        public static class C0265a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16332a = "topic_id";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class y {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16333a = "ZBOOKFINISHINFO";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16334b = a.d(c.f16132g, f16333a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$y$a, reason: collision with other inner class name */
        public static class C0266a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16335a = "book_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16336b = "word_finish_count";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16337c = "is_current_select_book";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16338d = "sync_state";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16339e = "daka_days";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16340f = "last_daka_times";

            /* renamed from: g, reason: collision with root package name */
            public static final String f16341g = "max_offline_days";

            /* renamed from: h, reason: collision with root package name */
            public static final String f16342h = "max_offline_problem_count";

            /* renamed from: i, reason: collision with root package name */
            public static final String f16343i = "book_name";

            /* renamed from: j, reason: collision with root package name */
            public static final String f16344j = "daily_count";

            /* renamed from: k, reason: collision with root package name */
            public static final String f16345k = "review_count";

            /* renamed from: l, reason: collision with root package name */
            public static final String f16346l = "book_desc";

            /* renamed from: m, reason: collision with root package name */
            public static final String f16347m = "book_desc_img";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class z {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16348a = "ZBOOKRESOURCE";

        /* renamed from: b, reason: collision with root package name */
        public static final Uri f16349b = a.d(c.f16132g, f16348a);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.dataset.provider.a$z$a, reason: collision with other inner class name */
        public static class C0267a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f16350a = "book_id";

            /* renamed from: b, reason: collision with root package name */
            public static final String f16351b = "updatetime";

            /* renamed from: c, reason: collision with root package name */
            public static final String f16352c = "setdatetime";

            /* renamed from: d, reason: collision with root package name */
            public static final String f16353d = "daily_count";

            /* renamed from: e, reason: collision with root package name */
            public static final String f16354e = "review_count";

            /* renamed from: f, reason: collision with root package name */
            public static final String f16355f = "word_count";

            /* renamed from: g, reason: collision with root package name */
            public static final String f16356g = "bookname";

            /* renamed from: h, reason: collision with root package name */
            public static final String f16357h = "update_local_data";

            /* renamed from: i, reason: collision with root package name */
            public static final String f16358i = "description";

            /* renamed from: j, reason: collision with root package name */
            public static final String f16359j = "zword_radio_update_time";

            /* renamed from: k, reason: collision with root package name */
            public static final String f16360k = "roadmap_ver";

            /* renamed from: l, reason: collision with root package name */
            public static final String f16361l = "poster_ver";

            /* renamed from: m, reason: collision with root package name */
            public static final String f16362m = "book_desc";

            /* renamed from: n, reason: collision with root package name */
            public static final String f16363n = "book_desc_img";

            /* renamed from: o, reason: collision with root package name */
            public static final String f16364o = "book_flag";
        }
    }

    public static Uri a(final String method, final String arg) {
        Uri.Builder appendPath = f16091e.buildUpon().appendPath(method);
        if (arg != null) {
            appendPath.query(arg);
        }
        return appendPath.build();
    }

    public static Uri b(final String database, final String sql) {
        return f16091e.buildUpon().appendPath(database).appendPath(f16090d).query(sql).build();
    }

    public static Uri c(final String database, final String sql) {
        return f16091e.buildUpon().appendPath(database).appendPath(f16089c).query(sql).build();
    }

    public static Uri d(final String database, final String table) {
        return f16091e.buildUpon().appendPath(database).appendPath(table).build();
    }
}
