package tz;

import android.content.SharedPreferences;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes8.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public Future f91387a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91388b = "";

    public v0(Future future) {
        this.f91387a = future;
    }

    public String a(String str) {
        try {
            return ((SharedPreferences) this.f91387a.get()).getString(str, "");
        } catch (InterruptedException | ExecutionException unused) {
            return "";
        }
    }

    public w0 b() {
        try {
            return w0.f(((SharedPreferences) this.f91387a.get()).getString("FM_config_data", ""));
        } catch (InterruptedException | ExecutionException unused) {
            return new w0();
        }
    }

    public void c(String str, long j11) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f91387a.get()).edit();
            edit.putLong(str, j11);
            edit.apply();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    public void d(String str, String str2) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f91387a.get()).edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    public void e(String str, p0 p0Var) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f91387a.get()).edit();
            edit.putInt(str, p0Var.a());
            edit.apply();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    public void f(o oVar) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f91387a.get()).edit();
            edit.putString("FM_pb_data", oVar == null ? "" : oVar.l());
            edit.apply();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    public void g(w0 w0Var) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f91387a.get()).edit();
            edit.putString("FM_config_data", w0Var.toString());
            edit.apply();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    public long h(String str) {
        try {
            return ((SharedPreferences) this.f91387a.get()).getLong(str, 0L);
        } catch (InterruptedException | ExecutionException unused) {
            return 0L;
        }
    }

    public o i() {
        try {
            return o.j(((SharedPreferences) this.f91387a.get()).getString("FM_pb_data", ""));
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public p0 j(String str) {
        try {
            return p0.b(((SharedPreferences) this.f91387a.get()).getInt(str, p0.f91349c.a()));
        } catch (InterruptedException | ExecutionException unused) {
            return p0.f91349c;
        }
    }

    public void k() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f91387a.get()).edit();
            edit.clear();
            edit.apply();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }
}
