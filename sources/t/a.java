package t;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a implements Camera.AutoFocusCallback {

    /* renamed from: e, reason: collision with root package name */
    public static final String f89060e = "AutoFocusManager";

    /* renamed from: f, reason: collision with root package name */
    public static final long f89061f = 2000;

    /* renamed from: g, reason: collision with root package name */
    public static final Collection<String> f89062g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f89063a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f89064b;

    /* renamed from: c, reason: collision with root package name */
    public final Camera f89065c;

    /* renamed from: d, reason: collision with root package name */
    public AsyncTask<?, ?, ?> f89066d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: t.a$a, reason: collision with other inner class name */
    public final class AsyncTaskC1168a extends AsyncTask<Object, Object, Object> {
        @Override // android.os.AsyncTask
        public Object doInBackground(Object... voids) {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
            }
            synchronized (a.this) {
                try {
                    if (a.this.f89063a) {
                        a.this.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return null;
        }

        public AsyncTaskC1168a() {
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f89062g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Context context, Camera camera) {
        this.f89065c = camera;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String focusMode = camera.getParameters().getFocusMode();
        boolean z11 = defaultSharedPreferences.getBoolean(v.a.f92797p, true) && f89062g.contains(focusMode);
        this.f89064b = z11;
        qb.c.i(f89060e, "Current focus mode '" + focusMode + "'; use auto focus? " + z11, new Object[0]);
        b();
    }

    public synchronized void b() {
        if (this.f89064b) {
            this.f89063a = true;
            try {
                this.f89065c.autoFocus(this);
            } catch (RuntimeException e11) {
                qb.c.p(f89060e, "Unexpected exception while focusing", e11);
            }
        }
    }

    public synchronized void c() {
        if (this.f89064b) {
            try {
                this.f89065c.cancelAutoFocus();
            } catch (RuntimeException e11) {
                qb.c.p(f89060e, "Unexpected exception while cancelling focusing", e11);
            }
        }
        AsyncTask<?, ?, ?> asyncTask = this.f89066d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f89066d = null;
        }
        this.f89063a = false;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean success, Camera theCamera) {
        if (this.f89063a) {
            AsyncTaskC1168a asyncTaskC1168a = new AsyncTaskC1168a();
            this.f89066d = asyncTaskC1168a;
            u.b.a(asyncTaskC1168a);
        }
    }
}
