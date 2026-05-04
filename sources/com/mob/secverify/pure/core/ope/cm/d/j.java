package com.mob.secverify.pure.core.ope.cm.d;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j {
    /* JADX WARN: Removed duplicated region for block: B:129:0x031f A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:3:0x0014, B:5:0x0021, B:6:0x003e, B:8:0x0044, B:11:0x0053, B:14:0x005f, B:16:0x0067, B:21:0x0078, B:23:0x007e, B:25:0x0084, B:26:0x00d8, B:27:0x0102, B:29:0x0108, B:31:0x0110, B:36:0x011d, B:38:0x0123, B:39:0x012d, B:40:0x014f, B:42:0x0155, B:45:0x0165, B:47:0x016b, B:48:0x018d, B:51:0x0195, B:53:0x019b, B:55:0x019f, B:57:0x01a7, B:61:0x01b3, B:63:0x01b9, B:64:0x01c9, B:65:0x01ec, B:67:0x01f4, B:69:0x01f8, B:71:0x0202, B:74:0x0205, B:76:0x020b, B:77:0x021a, B:79:0x0228, B:81:0x022e, B:83:0x0234, B:84:0x0257, B:86:0x025d, B:88:0x0263, B:90:0x0267, B:92:0x026f, B:101:0x0277, B:96:0x027a, B:98:0x0280, B:99:0x028f, B:104:0x02af, B:106:0x02b7, B:108:0x02bb, B:110:0x02c5, B:113:0x02c8, B:115:0x02ce, B:116:0x02dc, B:121:0x01ae, B:127:0x02ea, B:129:0x031f, B:131:0x0332, B:133:0x033c, B:134:0x0345, B:136:0x034a, B:138:0x0352, B:143:0x035c, B:33:0x0119, B:148:0x009d, B:150:0x00a5, B:153:0x00ae, B:155:0x00b6, B:157:0x00be, B:159:0x00ca, B:18:0x0072), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x035c A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:3:0x0014, B:5:0x0021, B:6:0x003e, B:8:0x0044, B:11:0x0053, B:14:0x005f, B:16:0x0067, B:21:0x0078, B:23:0x007e, B:25:0x0084, B:26:0x00d8, B:27:0x0102, B:29:0x0108, B:31:0x0110, B:36:0x011d, B:38:0x0123, B:39:0x012d, B:40:0x014f, B:42:0x0155, B:45:0x0165, B:47:0x016b, B:48:0x018d, B:51:0x0195, B:53:0x019b, B:55:0x019f, B:57:0x01a7, B:61:0x01b3, B:63:0x01b9, B:64:0x01c9, B:65:0x01ec, B:67:0x01f4, B:69:0x01f8, B:71:0x0202, B:74:0x0205, B:76:0x020b, B:77:0x021a, B:79:0x0228, B:81:0x022e, B:83:0x0234, B:84:0x0257, B:86:0x025d, B:88:0x0263, B:90:0x0267, B:92:0x026f, B:101:0x0277, B:96:0x027a, B:98:0x0280, B:99:0x028f, B:104:0x02af, B:106:0x02b7, B:108:0x02bb, B:110:0x02c5, B:113:0x02c8, B:115:0x02ce, B:116:0x02dc, B:121:0x01ae, B:127:0x02ea, B:129:0x031f, B:131:0x0332, B:133:0x033c, B:134:0x0345, B:136:0x034a, B:138:0x0352, B:143:0x035c, B:33:0x0119, B:148:0x009d, B:150:0x00a5, B:153:0x00ae, B:155:0x00b6, B:157:0x00be, B:159:0x00ca, B:18:0x0072), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:3:0x0014, B:5:0x0021, B:6:0x003e, B:8:0x0044, B:11:0x0053, B:14:0x005f, B:16:0x0067, B:21:0x0078, B:23:0x007e, B:25:0x0084, B:26:0x00d8, B:27:0x0102, B:29:0x0108, B:31:0x0110, B:36:0x011d, B:38:0x0123, B:39:0x012d, B:40:0x014f, B:42:0x0155, B:45:0x0165, B:47:0x016b, B:48:0x018d, B:51:0x0195, B:53:0x019b, B:55:0x019f, B:57:0x01a7, B:61:0x01b3, B:63:0x01b9, B:64:0x01c9, B:65:0x01ec, B:67:0x01f4, B:69:0x01f8, B:71:0x0202, B:74:0x0205, B:76:0x020b, B:77:0x021a, B:79:0x0228, B:81:0x022e, B:83:0x0234, B:84:0x0257, B:86:0x025d, B:88:0x0263, B:90:0x0267, B:92:0x026f, B:101:0x0277, B:96:0x027a, B:98:0x0280, B:99:0x028f, B:104:0x02af, B:106:0x02b7, B:108:0x02bb, B:110:0x02c5, B:113:0x02c8, B:115:0x02ce, B:116:0x02dc, B:121:0x01ae, B:127:0x02ea, B:129:0x031f, B:131:0x0332, B:133:0x033c, B:134:0x0345, B:136:0x034a, B:138:0x0352, B:143:0x035c, B:33:0x0119, B:148:0x009d, B:150:0x00a5, B:153:0x00ae, B:155:0x00b6, B:157:0x00be, B:159:0x00ca, B:18:0x0072), top: B:2:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(org.json.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.cm.d.j.a(org.json.JSONObject):void");
    }

    public static String b() {
        return "https://" + i.b() + "/unisdk/";
    }

    public static String c() {
        String c11 = i.c();
        if (TextUtils.isEmpty(c11)) {
            return "";
        }
        return "https://" + c11 + "/log/logReport";
    }

    public static boolean d() {
        return "1".equals(com.mob.secverify.pure.b.a.a("CLOSE_CERT_VERIFY", "1"));
    }

    public static boolean e() {
        return "1".equals(com.mob.secverify.pure.b.a.a("CLOSE_LOGS_VERSION", "0"));
    }

    public static int f() {
        return i.d();
    }

    public static int g() {
        return i.e() * 3600000;
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.has(str)) {
            com.mob.secverify.pure.b.a.b(str, jSONObject.optString(str, str2));
        }
    }

    public static boolean a() {
        return System.currentTimeMillis() >= com.mob.secverify.pure.b.a.a("client_valid", 0L);
    }

    public static String a(String str) {
        return com.mob.secverify.pure.b.a.a(str, "");
    }
}
