package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ci;

/* loaded from: classes8.dex */
public class cc extends ce {
    public cc(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    public static cc a(Context context, String str, int i11) {
        com.xiaomi.channel.commonutils.logger.b.b("delete  messages when db size is too bigger");
        String m5789a = ci.a(context).m5789a(str);
        if (TextUtils.isEmpty(m5789a)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rowDataId in (select ");
        sb2.append("rowDataId from " + m5789a);
        sb2.append(" order by createTimeStamp asc");
        sb2.append(" limit ?)");
        return new cc(str, sb2.toString(), new String[]{String.valueOf(i11)}, "a job build to delete history message");
    }

    private void a(long j11) {
        String[] strArr = ((ci.d) this).f208a;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        strArr[0] = String.valueOf(j11);
    }

    @Override // com.xiaomi.push.ci.a
    public void a(Context context, Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            long a11 = co.a(m5791a());
            long j11 = ca.f191a;
            if (a11 <= j11) {
                com.xiaomi.channel.commonutils.logger.b.b("db size is suitable");
                return;
            }
            long j12 = (long) ((((a11 - j11) * 1.2d) / j11) * longValue);
            a(j12);
            bw.a(context).a("begin delete " + j12 + "noUpload messages , because db size is " + a11 + "B");
            super.a(context, obj);
        }
    }
}
