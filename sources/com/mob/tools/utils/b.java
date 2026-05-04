package com.mob.tools.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import com.mob.commons.n;
import com.mob.tools.MobLog;
import com.mob.tools.a.g;
import kc.u;

@SuppressLint({"MissingPermission"})
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f41453a;

    /* renamed from: b, reason: collision with root package name */
    private Location f41454b;

    /* renamed from: c, reason: collision with root package name */
    private Location f41455c;

    /* renamed from: d, reason: collision with root package name */
    private LocationManager f41456d;

    /* renamed from: e, reason: collision with root package name */
    private LocationListener f41457e = new LocationListener() { // from class: com.mob.tools.utils.b.1
        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            try {
                try {
                    b.this.f41456d.removeUpdates(this);
                    b.this.f41455c = new Location(location);
                    b.this.f41454b = new Location(location);
                    b.this.f41458f = System.currentTimeMillis();
                    synchronized (b.this) {
                        notifyAll();
                    }
                } catch (Throwable th2) {
                    try {
                        MobLog.getInstance().d(th2);
                        synchronized (b.this) {
                            notifyAll();
                        }
                    } catch (Throwable th3) {
                        synchronized (b.this) {
                            notifyAll();
                            throw th3;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i11, Bundle bundle) {
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private long f41458f;

    private b() {
    }

    private Location b(Context context, int i11, int i12, boolean z11) {
        Throwable th2;
        Location location = null;
        try {
            DeviceHelper deviceHelper = DeviceHelper.getInstance(context);
            if (deviceHelper.checkPermission(n.a("039?cecjYgDcgdbcd gEdkIdhZcgIkMcdefefcddbcjdkdifefefbdgdgccgcdfdefbccdjejfedidhdfejde"))) {
                if (this.f41456d == null) {
                    this.f41456d = (LocationManager) deviceHelper.getSystemServiceSafe(u.S);
                }
                if (this.f41456d == null) {
                    return null;
                }
                synchronized (this) {
                    if (i11 != 0) {
                        try {
                            if (this.f41456d.isProviderEnabled(PermissionStatusUtilKt.PERMISSION_GPS)) {
                                try {
                                    g.a(context).a().a(n.a("0039ee9d1ef"), 1000L, 0.0f, this.f41457e);
                                    wait(i11 * 1000);
                                } catch (Throwable th3) {
                                    MobLog.getInstance().d(th3);
                                }
                                this.f41456d.removeUpdates(this.f41457e);
                            }
                        } finally {
                        }
                    }
                    if (i12 != 0 && this.f41456d.isProviderEnabled("network")) {
                        try {
                            g.a(context).a().a(n.a("007>cjYhcQecdbcgci"), 1000L, 0.0f, this.f41457e);
                            wait(i12 * 1000);
                        } catch (Throwable th4) {
                            MobLog.getInstance().d(th4);
                        }
                        this.f41456d.removeUpdates(this.f41457e);
                    }
                }
            }
            if (this.f41455c == null && z11) {
                try {
                    Location b11 = g.a(context).a().b(n.a("003Uee?d_ef"));
                    this.f41455c = b11;
                    if (b11 == null) {
                        this.f41455c = g.a(context).a().b(n.a("0070cj$hc0ecdbcgci"));
                    }
                } catch (Throwable th5) {
                    MobLog.getInstance().w(th5);
                }
            }
            if (this.f41455c == null) {
                return null;
            }
            this.f41454b = new Location(this.f41455c);
            this.f41458f = System.currentTimeMillis();
            Location location2 = new Location(this.f41455c);
            try {
                this.f41455c = null;
                return location2;
            } catch (Throwable th6) {
                location = location2;
                th2 = th6;
                MobLog.getInstance().d(th2);
                return location;
            }
        } catch (Throwable th7) {
            th2 = th7;
            MobLog.getInstance().d(th2);
            return location;
        }
    }

    public static b a() {
        if (f41453a == null) {
            synchronized (b.class) {
                try {
                    if (f41453a == null) {
                        f41453a = new b();
                    }
                } finally {
                }
            }
        }
        return f41453a;
    }

    public Location a(Context context, int i11, int i12, boolean z11) {
        return a(context, i11, i12, z11, false);
    }

    public Location a(Context context, int i11, int i12, boolean z11, boolean z12) {
        Location a11;
        Location a12 = a(z12);
        if (a12 != null) {
            return a12;
        }
        synchronized (b.class) {
            try {
                a11 = a(z12);
                if (a11 == null) {
                    a11 = b(context, i11, i12, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a11;
    }

    private Location a(boolean z11) {
        if (z11 || this.f41454b == null || System.currentTimeMillis() - this.f41458f > 180000) {
            return null;
        }
        return new Location(this.f41454b);
    }
}
