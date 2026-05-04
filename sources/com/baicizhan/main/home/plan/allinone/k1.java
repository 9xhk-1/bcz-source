package com.baicizhan.main.home.plan.allinone;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f22236a = "REVIEW_SHOW_SCOPE";

    public static final String b(String str, int i11) {
        Calendar calendar = Calendar.getInstance();
        return "u_" + str + "_b_" + i11 + "_date_" + calendar.get(1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + (calendar.get(2) + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + calendar.get(5);
    }
}
