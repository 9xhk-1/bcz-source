package tz;

import android.content.Context;

/* loaded from: classes8.dex */
public abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public Context f91236a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f91237b = null;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f91238c = false;

    public b(Context context) {
        this.f91236a = context;
    }

    @Override // tz.f
    public synchronized String a(String str) {
        if (this.f91238c) {
            return this.f91237b;
        }
        return b(str);
    }

    public abstract String b(String str);

    public abstract boolean c(String str, String str2);

    @Override // tz.f
    public synchronized void a(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (this.f91238c && str2.equals(this.f91237b)) {
            return;
        }
        if (c(str, str2)) {
            this.f91238c = true;
        } else {
            this.f91238c = false;
        }
        this.f91237b = str2;
    }
}
