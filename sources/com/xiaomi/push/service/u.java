package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.xiaomi.push.fw;

/* loaded from: classes8.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private static t f46405a;

    /* renamed from: a, reason: collision with other field name */
    private static a f1036a;

    public interface a {
        void a();
    }

    private static int a(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized t m6297a(Context context) {
        synchronized (u.class) {
            try {
                t tVar = f46405a;
                if (tVar != null) {
                    return tVar;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
                String string = sharedPreferences.getString("uuid", null);
                String string2 = sharedPreferences.getString("token", null);
                String string3 = sharedPreferences.getString("security", null);
                String string4 = sharedPreferences.getString("app_id", null);
                String string5 = sharedPreferences.getString("app_token", null);
                String string6 = sharedPreferences.getString("package_name", null);
                String string7 = sharedPreferences.getString("device_id", null);
                int i11 = sharedPreferences.getInt("env_type", 1);
                if (!TextUtils.isEmpty(string7) && com.xiaomi.push.i.a(string7)) {
                    string7 = com.xiaomi.push.i.g(context);
                    sharedPreferences.edit().putString("device_id", string7).commit();
                }
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                    return null;
                }
                String g11 = com.xiaomi.push.i.g(context);
                if (!"com.xiaomi.xmsf".equals(context.getPackageName()) && !TextUtils.isEmpty(g11) && !TextUtils.isEmpty(string7) && !string7.equals(g11)) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("read_phone_state permission changes.");
                }
                t tVar2 = new t(string, string2, string3, string4, string5, string6, i11);
                f46405a = tVar2;
                return tVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:3|4|(2:8|(24:10|11|(1:13)(1:110)|14|(1:16)(1:109)|17|(1:19)(1:108)|20|21|22|23|(1:25)(1:104)|26|(6:28|(1:30)|31|(1:35)|36|(1:38))|39|(1:41)|42|(6:45|46|47|49|50|43)|54|55|(3:60|61|(2:63|64)(8:(1:67)|68|69|(2:73|(3:75|76|(5:78|(1:80)|81|82|83)(1:84)))|(1:96)|97|98|99))|103|61|(0)(0)))|111|11|(0)(0)|14|(0)(0)|17|(0)(0)|20|21|22|23|(0)(0)|26|(0)|39|(0)|42|(1:43)|54|55|(4:57|60|61|(0)(0))|103|61|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0087, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0088, code lost:
    
        com.xiaomi.channel.commonutils.logger.b.a(r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0047, B:14:0x005a, B:17:0x0066, B:20:0x0072, B:22:0x007c, B:25:0x0090, B:26:0x0099, B:28:0x00c1, B:30:0x00cd, B:31:0x00e0, B:33:0x00ea, B:35:0x00f0, B:36:0x0104, B:38:0x010a, B:39:0x010f, B:41:0x0132, B:42:0x013b, B:43:0x0172, B:45:0x0178, B:47:0x017f, B:52:0x018e, B:55:0x01bf, B:57:0x01df, B:60:0x01e6, B:61:0x01fd, B:69:0x020c, B:71:0x0229, B:73:0x022f, B:87:0x02df, B:88:0x02fe, B:89:0x02ed, B:92:0x02f1, B:94:0x0305, B:96:0x030b, B:97:0x0313, B:102:0x0212, B:107:0x0088, B:76:0x0239, B:78:0x0246, B:80:0x0264, B:81:0x027f, B:84:0x02bb), top: B:3:0x0005, inners: #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0047, B:14:0x005a, B:17:0x0066, B:20:0x0072, B:22:0x007c, B:25:0x0090, B:26:0x0099, B:28:0x00c1, B:30:0x00cd, B:31:0x00e0, B:33:0x00ea, B:35:0x00f0, B:36:0x0104, B:38:0x010a, B:39:0x010f, B:41:0x0132, B:42:0x013b, B:43:0x0172, B:45:0x0178, B:47:0x017f, B:52:0x018e, B:55:0x01bf, B:57:0x01df, B:60:0x01e6, B:61:0x01fd, B:69:0x020c, B:71:0x0229, B:73:0x022f, B:87:0x02df, B:88:0x02fe, B:89:0x02ed, B:92:0x02f1, B:94:0x0305, B:96:0x030b, B:97:0x0313, B:102:0x0212, B:107:0x0088, B:76:0x0239, B:78:0x0246, B:80:0x0264, B:81:0x027f, B:84:0x02bb), top: B:3:0x0005, inners: #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0047, B:14:0x005a, B:17:0x0066, B:20:0x0072, B:22:0x007c, B:25:0x0090, B:26:0x0099, B:28:0x00c1, B:30:0x00cd, B:31:0x00e0, B:33:0x00ea, B:35:0x00f0, B:36:0x0104, B:38:0x010a, B:39:0x010f, B:41:0x0132, B:42:0x013b, B:43:0x0172, B:45:0x0178, B:47:0x017f, B:52:0x018e, B:55:0x01bf, B:57:0x01df, B:60:0x01e6, B:61:0x01fd, B:69:0x020c, B:71:0x0229, B:73:0x022f, B:87:0x02df, B:88:0x02fe, B:89:0x02ed, B:92:0x02f1, B:94:0x0305, B:96:0x030b, B:97:0x0313, B:102:0x0212, B:107:0x0088, B:76:0x0239, B:78:0x0246, B:80:0x0264, B:81:0x027f, B:84:0x02bb), top: B:3:0x0005, inners: #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0047, B:14:0x005a, B:17:0x0066, B:20:0x0072, B:22:0x007c, B:25:0x0090, B:26:0x0099, B:28:0x00c1, B:30:0x00cd, B:31:0x00e0, B:33:0x00ea, B:35:0x00f0, B:36:0x0104, B:38:0x010a, B:39:0x010f, B:41:0x0132, B:42:0x013b, B:43:0x0172, B:45:0x0178, B:47:0x017f, B:52:0x018e, B:55:0x01bf, B:57:0x01df, B:60:0x01e6, B:61:0x01fd, B:69:0x020c, B:71:0x0229, B:73:0x022f, B:87:0x02df, B:88:0x02fe, B:89:0x02ed, B:92:0x02f1, B:94:0x0305, B:96:0x030b, B:97:0x0313, B:102:0x0212, B:107:0x0088, B:76:0x0239, B:78:0x0246, B:80:0x0264, B:81:0x027f, B:84:0x02bb), top: B:3:0x0005, inners: #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0207 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0305 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0047, B:14:0x005a, B:17:0x0066, B:20:0x0072, B:22:0x007c, B:25:0x0090, B:26:0x0099, B:28:0x00c1, B:30:0x00cd, B:31:0x00e0, B:33:0x00ea, B:35:0x00f0, B:36:0x0104, B:38:0x010a, B:39:0x010f, B:41:0x0132, B:42:0x013b, B:43:0x0172, B:45:0x0178, B:47:0x017f, B:52:0x018e, B:55:0x01bf, B:57:0x01df, B:60:0x01e6, B:61:0x01fd, B:69:0x020c, B:71:0x0229, B:73:0x022f, B:87:0x02df, B:88:0x02fe, B:89:0x02ed, B:92:0x02f1, B:94:0x0305, B:96:0x030b, B:97:0x0313, B:102:0x0212, B:107:0x0088, B:76:0x0239, B:78:0x0246, B:80:0x0264, B:81:0x027f, B:84:0x02bb), top: B:3:0x0005, inners: #1, #2, #3, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.xiaomi.push.service.t a(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.u.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):com.xiaomi.push.service.t");
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m6298a(Context context) {
        t m6297a = m6297a(context);
        if (m6297a == null || TextUtils.isEmpty(m6297a.f1035a)) {
            return null;
        }
        String[] split = m6297a.f1035a.split(EmailAutoCompleteEditText.f17091d);
        if (split.length > 0) {
            return split[0];
        }
        return null;
    }

    private static String a(Context context, boolean z11) {
        StringBuilder sb2;
        String str;
        String a11 = com.xiaomi.push.service.a.a(context).a();
        String str2 = z11 ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (com.xiaomi.push.ab.b()) {
            sb2 = new StringBuilder();
            sb2.append("http://");
            sb2.append(fw.f45591b);
            str = ":9085";
        } else {
            if (!com.xiaomi.push.n.China.name().equals(a11)) {
                return null;
            }
            sb2 = new StringBuilder();
            str = "https://cn.register.xmpush.xiaomi.com";
        }
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static void a() {
        a aVar = f1036a;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m6299a(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f46405a = null;
        a();
    }

    private static void a(Context context, int i11) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putInt("enc_req_fail_count", i11);
        edit.commit();
    }

    public static void a(Context context, t tVar) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putString("uuid", tVar.f1035a);
        edit.putString("security", tVar.f46401c);
        edit.putString("token", tVar.f46400b);
        edit.putString("app_id", tVar.f46402d);
        edit.putString("package_name", tVar.f46404f);
        edit.putString("app_token", tVar.f46403e);
        edit.putString("device_id", com.xiaomi.push.i.g(context));
        edit.putInt("env_type", tVar.f46399a);
        edit.commit();
        a();
    }

    public static void a(a aVar) {
        f1036a = aVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m6300a(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }
}
