package com.igexin.push.core.f;

import android.app.NotificationManager;
import android.content.Intent;
import android.text.TextUtils;
import com.igexin.push.core.b;
import com.igexin.push.core.e;
import com.igexin.push.core.e.c;
import com.igexin.push.core.n;
import com.igexin.push.extension.mod.PushTaskBean;
import com.igexin.sdk.main.FeedbackImpl;
import java.util.HashSet;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38152a = "NotificationExecutor";

    /* renamed from: b, reason: collision with root package name */
    private static a f38153b;

    public static a a() {
        if (f38153b == null) {
            synchronized (a.class) {
                try {
                    if (f38153b == null) {
                        f38153b = new a();
                    }
                } finally {
                }
            }
        }
        return f38153b;
    }

    public static void a(Intent intent) {
        String str;
        String stringExtra = intent.getStringExtra("taskid");
        String stringExtra2 = intent.getStringExtra("groupId");
        HashSet<String> hashSet = e.f38008aj.get(stringExtra2);
        Integer num = e.f38009ak.get(stringExtra2);
        if (hashSet != null && !hashSet.isEmpty()) {
            hashSet.remove(stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2) && num != null && hashSet != null && hashSet.isEmpty()) {
            ((NotificationManager) e.f38035l.getSystemService("notification")).cancel(num.intValue());
            e.f38008aj.remove(stringExtra2);
            e.f38009ak.remove(stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("checkpackage");
        String stringExtra4 = intent.getStringExtra("accesstoken");
        if (stringExtra3 == null || stringExtra4 == null || !stringExtra3.equals(e.f38035l.getPackageName()) || !stringExtra4.equals(e.aC)) {
            return;
        }
        intent.putExtra("accesstoken", e.f38012an);
        n.a().a(intent);
        c.a();
        c.a(stringExtra, b.f37714ak, intent.getIntExtra("redisplayFreq", 0));
        PushTaskBean pushTaskBean = new PushTaskBean();
        pushTaskBean.setAppid(intent.getStringExtra("appid"));
        pushTaskBean.setMessageId(intent.getStringExtra("messageid"));
        pushTaskBean.setTaskId(stringExtra);
        pushTaskBean.setId(intent.getStringExtra("id"));
        intent.getStringExtra("bigStyle");
        intent.getStringExtra("notifyStyle");
        try {
            int parseInt = Integer.parseInt(intent.getStringExtra("feedbackid")) + 30010;
            pushTaskBean.setCurrentActionid(parseInt);
            if (intent.getBooleanExtra("isFloat", false)) {
                str = "notifyFloat:" + intent.getStringExtra("bigStyle");
            } else {
                str = "notifyStyle:" + intent.getStringExtra("notifyStyle");
            }
            FeedbackImpl.getInstance().feedbackMessageAction(pushTaskBean, String.valueOf(parseInt), str);
        } catch (Exception unused) {
        }
    }
}
