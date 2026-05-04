package com.igexin.push.f;

import android.database.Cursor;
import com.igexin.push.core.b.k;
import com.igexin.push.core.d;
import com.igexin.push.core.n;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import java.util.PriorityQueue;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class e implements com.igexin.push.f.b.c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e f38580a;

    /* renamed from: b, reason: collision with root package name */
    private String f38581b = "ReDisplayTask";

    /* renamed from: c, reason: collision with root package name */
    private volatile long f38582c = 0;

    public static e a() {
        if (f38580a == null) {
            synchronized (e.class) {
                try {
                    if (f38580a == null) {
                        f38580a = new e();
                    }
                } finally {
                }
            }
        }
        return f38580a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PriorityQueue<k> e() {
        PriorityQueue<k> priorityQueue = new PriorityQueue<>();
        Cursor cursor = null;
        try {
            cursor = d.a.f37956a.f37950i.a("message", new String[0], "status = '1' and notify_status = '1' and redisplay_freq != '0' and redisplay_num <= redisplay_freq and expect_redisplay_time <= " + (System.currentTimeMillis() / 1000));
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    priorityQueue.offer(new k(cursor.getBlob(cursor.getColumnIndex("msgextra")), new String(com.igexin.c.b.a.c(cursor.getBlob(cursor.getColumnIndex("info")))), cursor.getLong(cursor.getColumnIndex("expect_redisplay_time"))));
                }
            }
            if (cursor != null) {
                return priorityQueue;
            }
        } catch (Throwable th2) {
            try {
                com.igexin.c.a.c.a.a(th2);
                com.igexin.c.a.c.a.b(this.f38581b, "get redisplay message" + th2.toString());
                if (cursor != null) {
                    cursor.close();
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return priorityQueue;
    }

    @Override // com.igexin.push.f.b.c
    public final boolean c() {
        boolean z11 = System.currentTimeMillis() / 1000 >= this.f38582c;
        com.igexin.c.a.c.a.a(this.f38581b + " | ReDisplayTask isMatch =" + z11 + "， nextReDisplayTime =" + this.f38582c, new Object[0]);
        return z11;
    }

    public final void d() {
        Cursor cursor = null;
        try {
            cursor = d.a.f37956a.f37950i.a("message", new String[0], "status = '1' and notify_status = '1' and redisplay_freq != '0' and redisplay_num <= redisplay_freq  order by expect_redisplay_time asc limit 1");
            if (cursor != null && cursor.getCount() == 1 && cursor.moveToFirst()) {
                this.f38582c = cursor.getLong(cursor.getColumnIndex("expect_redisplay_time"));
            } else {
                this.f38582c = Long.MAX_VALUE;
            }
            System.currentTimeMillis();
        } catch (Throwable th2) {
            try {
                com.igexin.c.a.c.a.a(th2);
                com.igexin.c.a.c.a.b(this.f38581b, " get next redisplay message fail" + th2.toString());
                if (cursor != null) {
                    cursor.close();
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    @Override // com.igexin.push.f.b.c
    public final void b() {
        if (com.igexin.push.g.c.a(System.currentTimeMillis())) {
            com.igexin.c.a.c.a.b(this.f38581b, "message in silent time period, ignored...");
        } else {
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new d() { // from class: com.igexin.push.f.e.1
                @Override // com.igexin.push.f.d
                public final void b() {
                    JSONObject a11;
                    String string;
                    String string2;
                    String a12;
                    PushTaskBean pushTaskBean;
                    String actionIdByType;
                    PriorityQueue e11 = e.this.e();
                    String unused = e.this.f38581b;
                    e11.size();
                    com.igexin.c.a.c.a.a(e.this.f38581b + " | priorityQueue size = " + e11.size(), new Object[0]);
                    while (true) {
                        k kVar = (k) e11.poll();
                        if (kVar == null) {
                            return;
                        }
                        try {
                            a11 = kVar.a();
                            string = a11.getString("taskid");
                            string2 = a11.getString("messageid");
                            com.igexin.push.core.a.b.d();
                            a12 = com.igexin.push.core.a.b.a(string, string2);
                            pushTaskBean = com.igexin.push.core.e.f38006ah.get(a12);
                        } catch (Throwable th2) {
                            String unused2 = e.this.f38581b;
                            com.igexin.c.a.c.a.a(th2);
                        }
                        if (pushTaskBean == null) {
                            n.a().a(a11, kVar.f37801f, false);
                            pushTaskBean = com.igexin.push.core.e.f38006ah.get(a12);
                            if (pushTaskBean != null) {
                                if (n.a().a(string, string2) != PushMessageInterface.ActionPrepareState.success) {
                                }
                            }
                            String unused3 = e.this.f38581b;
                        }
                        if (n.a().a(pushTaskBean.getConditionMap(), string, pushTaskBean) && (actionIdByType = pushTaskBean.getActionIdByType("notification")) != null) {
                            n.a().a(string, string2, actionIdByType);
                        }
                        String unused32 = e.this.f38581b;
                    }
                }
            }, true);
        }
    }

    @Override // com.igexin.push.f.b.c
    public final void a(long j11) {
    }
}
