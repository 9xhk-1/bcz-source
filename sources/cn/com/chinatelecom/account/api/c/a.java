package cn.com.chinatelecom.account.api.c;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static Executor f8909b = Executors.newSingleThreadExecutor();

    /* renamed from: a, reason: collision with root package name */
    public Handler f8910a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        f8909b.execute(runnable);
    }
}
