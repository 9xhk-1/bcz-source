package sb;

import xb.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f extends s {

    /* renamed from: d, reason: collision with root package name */
    public static f f88242d;

    /* renamed from: c, reason: collision with root package name */
    public j f88243c;

    public f() {
        this.f88243c = null;
        this.f97994a = new j(30000, 20000, 10000);
        this.f88243c = new j(20000, 10000, 5000);
        this.f97995b = 5;
    }

    public static f e() {
        if (f88242d == null) {
            synchronized (f.class) {
                try {
                    if (f88242d == null) {
                        f88242d = new f();
                    }
                } finally {
                }
            }
        }
        return f88242d;
    }

    public j d() {
        return this.f88243c;
    }

    public void f(int time2g, int time3g, int timeWifi) {
        this.f88243c = new j(time2g, time3g, timeWifi);
    }

    public void g(int time2g, int time3g, int timeWifi) {
        this.f97994a = new j(time2g, time3g, timeWifi);
    }
}
