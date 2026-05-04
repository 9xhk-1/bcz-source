package com.huawei.updatesdk.b.g;

import android.os.AsyncTask;
import com.huawei.updatesdk.a.b.c.c.d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final List<AsyncTask> f36909a = new CopyOnWriteArrayList();

    public static com.huawei.updatesdk.a.b.c.b a(com.huawei.updatesdk.b.b.c cVar, com.huawei.updatesdk.a.b.c.c.a aVar) {
        com.huawei.updatesdk.a.b.c.b bVar = new com.huawei.updatesdk.a.b.c.b(cVar, aVar);
        a(bVar);
        return bVar;
    }

    public static d a(com.huawei.updatesdk.a.b.c.c.c cVar) {
        return new com.huawei.updatesdk.a.b.c.b(cVar, null).c();
    }

    public static List<AsyncTask> a() {
        return f36909a;
    }

    public static void a(AsyncTask asyncTask) {
        if (asyncTask == null) {
            return;
        }
        for (AsyncTask asyncTask2 : f36909a) {
            if (asyncTask2 != null && (asyncTask2.getStatus() == AsyncTask.Status.FINISHED || asyncTask2.isCancelled())) {
                f36909a.remove(asyncTask2);
            }
        }
        f36909a.add(asyncTask);
    }

    private static void a(com.huawei.updatesdk.a.b.c.b bVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("executeTask, ActiveCount:");
        ThreadPoolExecutor threadPoolExecutor = c.f36910a;
        sb2.append(threadPoolExecutor.getActiveCount());
        sb2.append(", TaskCount:");
        sb2.append(threadPoolExecutor.getTaskCount());
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreAgent", sb2.toString());
        bVar.a(threadPoolExecutor);
    }
}
