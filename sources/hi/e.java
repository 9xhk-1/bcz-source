package hi;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.online.user_study_api.PrimarySchoolModeConfig;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f59343a = "PrimarySchoolModeConfigHelper";

    /* renamed from: b, reason: collision with root package name */
    public static final int f59344b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f59345c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f59346d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f59347e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f59348f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f59349g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f59350h = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends bp.a<PrimarySchoolModeConfig> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends bp.a<PrimarySchoolModeConfig> {
    }

    public static PrimarySchoolModeConfig a() {
        return x.r().v();
    }

    public static PrimarySchoolModeConfig b(Context context) {
        PrimarySchoolModeConfig a11 = a();
        if (a11 != null) {
            return a11;
        }
        PrimarySchoolModeConfig primarySchoolModeConfig = (PrimarySchoolModeConfig) i9.f.e(context, i9.f.f60377i0, new a().getType(), false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getConfigLocallyAllowed: ");
        sb2.append(primarySchoolModeConfig != null);
        qb.c.b(f59343a, sb2.toString(), new Object[0]);
        return primarySchoolModeConfig;
    }

    public static int c() {
        PrimarySchoolModeConfig a11 = a();
        if (a11 == null) {
            return -1;
        }
        return a11.state;
    }

    public static boolean d() {
        PrimarySchoolModeConfig a11 = a();
        if (a11 == null) {
            return false;
        }
        int i11 = a11.state;
        return i11 == 1 || i11 == 5;
    }

    public static boolean e(Context context) {
        PrimarySchoolModeConfig b11 = b(context);
        if (b11 == null) {
            return false;
        }
        int i11 = b11.state;
        return i11 == 1 || i11 == 5;
    }

    public static boolean f(Context context) {
        PrimarySchoolModeConfig b11 = b(context);
        if (b11 != null) {
            return (b11.has_done_final_exam == 0 && !TextUtils.isEmpty(b11.final_exam_link_button)) || (b11.has_done_final_exam == 1 && !TextUtils.isEmpty(b11.final_exam_result_link));
        }
        return false;
    }

    public static boolean g(Context context) {
        PrimarySchoolModeConfig b11 = b(context);
        return (b11 == null || b11.has_done_final_exam != 1 || TextUtils.isEmpty(b11.final_exam_result_link)) ? false : true;
    }

    public static void h(Context context, PrimarySchoolModeConfig config) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("saveConfig: ");
        sb2.append(config != null);
        qb.c.b(f59343a, sb2.toString(), new Object[0]);
        if (config == null) {
            i9.f.a(context, i9.f.f60377i0);
        } else {
            i9.f.l(context, i9.f.f60377i0, config, new b().getType(), false);
        }
    }

    public static void i(PrimarySchoolModeConfig config) {
        x.r().v0(config);
    }
}
