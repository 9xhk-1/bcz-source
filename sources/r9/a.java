package r9;

import com.baicizhan.client.business.util.TimeUtil;
import com.google.android.material.timepicker.TimeModel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {
    public static int a(String key) {
        long j11 = (TimeUtil.todayStart() / 1000) * 1000;
        long c11 = i9.h.f().c(key, 0L);
        qb.c.i(key, TimeModel.f32588i, Long.valueOf(c11));
        if (j11 == (c11 / 1000) * 1000) {
            return (int) (c11 % 1000);
        }
        return 0;
    }

    public static void b(String key, int count) {
        long j11 = ((TimeUtil.todayStart() / 1000) * 1000) + count;
        i9.h.f().i(key, j11);
        qb.c.i(key, TimeModel.f32588i, Long.valueOf(j11));
    }
}
