package jf;

import android.content.Context;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f64066a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f64067b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f64068c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f64069d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f64070e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f64071f = -1;

    public static String a(Context context, int type) {
        if (context == null) {
            return null;
        }
        if (type == 1) {
            return context.getString(R.string.userinfo_edit_school_type_primary);
        }
        if (type == 2) {
            return context.getString(R.string.userinfo_edit_school_type_middle);
        }
        if (type == 3) {
            return context.getString(R.string.userinfo_edit_school_type_high);
        }
        if (type == 4) {
            return context.getString(R.string.userinfo_edit_school_type_high_vocation);
        }
        if (type != 5) {
            return null;
        }
        return context.getString(R.string.userinfo_edit_school_type_college);
    }
}
