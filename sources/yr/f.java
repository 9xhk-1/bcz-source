package yr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f extends AsyncTask<Context, Integer, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f100281a = "f";

    /* renamed from: b, reason: collision with root package name */
    public static final long f100282b = 432000000;

    /* renamed from: c, reason: collision with root package name */
    public static final String f100283c = "lastCheckTime";

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f100284d = false;

    @SuppressLint({"NewApi"})
    public static void b() {
        if (e()) {
            h.e(f100281a, "checkUpgradeBks, execute check task");
            new f().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, c.a());
        }
    }

    public static boolean e() {
        if (f100284d) {
            return false;
        }
        Context a11 = c.a();
        if (a11 == null) {
            h.g(f100281a, "checkUpgradeBks, context is null");
            return false;
        }
        f100284d = true;
        long b11 = j.b(f100283c, 0L, a11);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b11 > f100282b) {
            j.h(f100283c, currentTimeMillis, a11);
            return true;
        }
        h.e(f100281a, "checkUpgradeBks, ignore");
        return false;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Context... contextArr) {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = a.n(contextArr[0]);
        } catch (Exception e11) {
            h.d(f100281a, "doInBackground: exception : " + e11.getMessage());
            inputStream = null;
        }
        h.b(f100281a, "doInBackground: get bks from hms tss cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        if (inputStream == null) {
            return Boolean.FALSE;
        }
        g.g(inputStream);
        return Boolean.TRUE;
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            h.e(f100281a, "onPostExecute: upate done");
        } else {
            h.d(f100281a, "onPostExecute: upate failed");
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        h.e(f100281a, "onProgressUpdate");
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        h.b(f100281a, "onPreExecute");
    }
}
