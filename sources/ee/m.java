package ee;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.main.activity.idenity.UserIdentity;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49711a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f49712b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f49713c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f49714d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f49715e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f49716f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f49717g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f49718h = 0;

    public static final boolean a() {
        UserRecord.Role role;
        UserRecord p11 = q9.x.r().p();
        int i11 = (p11 == null || (role = p11.getRole()) == null) ? 0 : role.grade;
        return 1 <= i11 && i11 < 25;
    }

    public static final int b() {
        UserRecord p11 = q9.x.r().p();
        int i11 = (p11 == null || p11.getRole() == null) ? 0 : p11.getRole().role;
        if (i11 == 1 || i11 == 2) {
            return i11;
        }
        return 1;
    }

    @m80.k
    public static final String c(int i11, @m80.k Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        String[] stringArray = context.getResources().getStringArray(R.array.grade);
        kotlin.jvm.internal.g0.o(stringArray, "getStringArray(...)");
        if (1 > i11 || i11 >= 25) {
            return "";
        }
        String str = stringArray[i11];
        kotlin.jvm.internal.g0.o(str, "get(...)");
        return str;
    }

    @m80.k
    public static final UserIdentity d(int i11) {
        return (1 > i11 || i11 >= 7) ? (7 > i11 || i11 >= 10) ? (10 > i11 || i11 >= 13) ? (13 > i11 || i11 >= 20) ? (20 > i11 || i11 >= 23) ? UserIdentity.COLLEGE : UserIdentity.PRIMARY : UserIdentity.COLLEGE : UserIdentity.HIGH : UserIdentity.JUNIOR_HIGH : UserIdentity.PRIMARY;
    }
}
