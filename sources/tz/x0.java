package tz;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes8.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f91405a = Executors.newSingleThreadExecutor();

    public static class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final Context f91406a;

        /* renamed from: b, reason: collision with root package name */
        public final String f91407b;

        /* renamed from: c, reason: collision with root package name */
        public final b f91408c;

        public a(Context context, String str, b bVar) {
            this.f91406a = context;
            this.f91407b = str;
            this.f91408c = bVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharedPreferences call() {
            SharedPreferences sharedPreferences = this.f91406a.getSharedPreferences(this.f91407b, 0);
            b bVar = this.f91408c;
            if (bVar != null) {
                bVar.a(sharedPreferences);
            }
            return sharedPreferences;
        }
    }

    public interface b {
        void a(SharedPreferences sharedPreferences);
    }

    public Future a(Context context, String str, b bVar) {
        FutureTask futureTask = new FutureTask(new a(context, str, bVar));
        this.f91405a.execute(futureTask);
        return futureTask;
    }
}
