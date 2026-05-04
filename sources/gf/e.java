package gf;

import android.content.Context;
import android.util.SparseIntArray;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f53666a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f53667b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f53668c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f53669d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static SparseIntArray f53670e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f53670e = sparseIntArray;
        sparseIntArray.put(4, R.string.userinfo_edit_edu_phd);
        f53670e.put(3, R.string.userinfo_edit_edu_post_graduate);
        f53670e.put(2, R.string.userinfo_edit_edu_bachelor);
        f53670e.put(1, R.string.userinfo_edit_edu_college);
    }

    public static String a(Context context, int type) {
        int i11 = f53670e.get(type, -1);
        if (i11 == -1) {
            return null;
        }
        return context.getString(i11);
    }
}
