package u;

import android.annotation.SuppressLint;
import android.os.AsyncTask;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {
    @SuppressLint({"NewApi"})
    public static void a(AsyncTask<?, ?, ?> task) {
        task.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    }
}
