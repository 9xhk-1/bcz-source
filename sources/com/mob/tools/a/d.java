package com.mob.tools.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import com.mob.commons.a.l;
import com.mob.commons.j;
import com.mob.tools.MobLog;
import com.mob.tools.utils.ReflectHelper;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import kc.u;

/* loaded from: classes7.dex */
public class d implements f {

    /* renamed from: a, reason: collision with root package name */
    private Context f41173a;

    /* renamed from: b, reason: collision with root package name */
    private Object f41174b;

    /* renamed from: c, reason: collision with root package name */
    private PackageManager f41175c;

    public d(Context context) {
        this.f41173a = context;
    }

    @Override // com.mob.tools.a.f
    public String a() {
        try {
            if (Build.VERSION.SDK_INT >= 29 || !c.a(this.f41173a).a().h(j.a("035 bdbi+fNbfcabc^fLcj9cgTbfNj^bcdedebccabicjebeachdgbbeefadicdeabbcfcgchcgea"))) {
                return null;
            }
            if (this.f41174b == null) {
                this.f41174b = c("phone");
            }
            return (String) a(this.f41174b, j.a("011NddAgb1dg+ghPbcbePg6ce=f"), new Object[0]);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.f
    public String b() {
        try {
            if (Build.VERSION.SDK_INT >= 29 || !c.a(this.f41173a).a().h(j.a("035=bdbi;fZbfcabcAfXcj4cg]bf(jNbcdedebccabicjebeachdgbbeefadicdeabbcfcgchcgea"))) {
                return null;
            }
            if (this.f41174b == null) {
                this.f41174b = c("phone");
            }
            return (String) a(this.f41174b, j.a("015Rdd$gb%cfbadadebebfbcdaDgSbfceXf"), new Object[0]);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.f
    public Enumeration<NetworkInterface> c() {
        try {
            return NetworkInterface.getNetworkInterfaces();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.f
    public int d() {
        try {
            if (this.f41174b == null) {
                this.f41174b = c("phone");
            }
            return ((Integer) ReflectHelper.invokeInstanceMethod(this.f41174b, j.a("014Mdd gb9cdMgb_dbcabfbhcgbg*cg"), new Object[0])).intValue();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return -1;
        }
    }

    @Override // com.mob.tools.a.f
    public int e() {
        try {
            if (!c.a(this.f41173a).a().h(j.a("0358bdbiUfKbfcabcAf:cj'cgXbfVjYbcdedebccabicjebeachdgbbeefadicdeabbcfcgchcgea"))) {
                return -1;
            }
            if (this.f41174b == null) {
                this.f41174b = c("phone");
            }
            return ((Integer) ReflectHelper.invokeInstanceMethod(this.f41174b, j.a("018AddMgbQdgbdEb(bdcd@gb_dbcabfbhcgbgHcg"), new Object[0])).intValue();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return -1;
        }
    }

    public Object c(String str) {
        try {
            return this.f41173a.getSystemService(str);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.f
    public String a(int i11) {
        try {
            if (Build.VERSION.SDK_INT >= 29 || !c.a(this.f41173a).a().h(j.a("035!bdbiAf?bfcabcEf+cj4cg9bfZj0bcdedebccabicjebeachdgbbeefadicdeabbcfcgchcgea"))) {
                return null;
            }
            if (this.f41174b == null) {
                this.f41174b = c("phone");
            }
            return (String) a(this.f41174b, j.a("0111dd%gbTdgNgh_bcbe,g:ceZf"), new Object[]{Integer.valueOf(i11)}, new Class[]{Integer.TYPE});
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.f
    public ResolveInfo b(Intent intent, int i11) {
        try {
            return (ResolveInfo) ReflectHelper.invokeInstanceMethod(this.f41173a.getPackageManager(), "resolveActivity", new Object[]{intent, Integer.valueOf(i11)}, new Class[]{Intent.class, Integer.TYPE});
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.f
    public Location b(String str) {
        try {
            if (!c.a(this.f41173a).a().h(j.a("039EbdbiNf^bfcabcPfCcj'cgCbfFj+bcdedebccabicjchededeacfcfbbfbcecdeabbcidiedchcgcedicd")) && (Build.VERSION.SDK_INT < 29 || !c.a(this.f41173a).a().h(j.a("045FbdbiLf1bfcabc)f?cjNcgZbf_j'bcdedebccabicjchededeacfcfbbdhchedfhfiebdicccddgbbcidiedchcgcedicd")))) {
                return null;
            }
            LocationManager locationManager = (LocationManager) c(u.S);
            if (locationManager != null) {
                return (Location) ReflectHelper.invokeInstanceMethod(locationManager, j.a("020$dd?gb@cibdde+bTfhbicadbbicicabebd,b=bccabi"), str);
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.f
    public String a(String str) {
        try {
            Object invokeStaticMethod = ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(j.a("0276bdbi^fBbfcabcCfOcjcadecjcfbgde(bgj!eebfca9cg1bfKbUbc4g(de")), j.a("003<dd8gb"), str);
            if (invokeStaticMethod != null) {
                return String.valueOf(invokeStaticMethod);
            }
            return "";
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return "";
        }
    }

    @Override // com.mob.tools.a.f
    public ApplicationInfo b(String str, int i11) throws PackageManager.NameNotFoundException {
        if (this.f41175c == null) {
            this.f41175c = this.f41173a.getPackageManager();
        }
        return this.f41175c.getApplicationInfo(str, i11);
    }

    @Override // com.mob.tools.a.f
    public String a(String str, String str2) {
        try {
            Object invokeStaticMethod = ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(j.a("027 bdbiFf+bfcabcKf@cjcadecjcfbgdeVbgj)eebfcaQcg-bfQb=bcGg<de")), j.a("003Odd)gb"), str, str2);
            if (invokeStaticMethod != null) {
                return String.valueOf(invokeStaticMethod);
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.f
    public List<ResolveInfo> a(Intent intent, int i11) {
        try {
            return (List) ReflectHelper.invokeInstanceMethod(this.f41173a.getPackageManager(), "queryIntentServices", new Object[]{intent, Integer.valueOf(i11)}, new Class[]{Intent.class, Integer.TYPE});
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.f
    public PackageInfo a(String str, int i11) throws PackageManager.NameNotFoundException {
        if (this.f41175c == null) {
            this.f41175c = this.f41173a.getPackageManager();
        }
        return this.f41175c.getPackageInfo(str, i11);
    }

    @Override // com.mob.tools.a.f
    public void a(String str, long j11, float f11, LocationListener locationListener) {
        try {
            if (!c.a(this.f41173a).a().h(j.a("039)bdbiUf1bfcabcUf<cj7cg1bf]j.bcdedebccabicjchededeacfcfbbfbcecdeabbcidiedchcgcedicd")) && (Build.VERSION.SDK_INT < 29 || !c.a(this.f41173a).a().h(j.a("045.bdbi^f)bfcabc:f_cj$cgYbfYjUbcdedebccabicjchededeacfcfbbdhchedfhfiebdicccddgbbcidiedchcgcedicd")))) {
                return;
            }
            LocationManager locationManager = (LocationManager) c(u.S);
            if (locationManager != null) {
                ReflectHelper.invokeInstanceMethod(locationManager, j.a("022Tbf6gi8ba*g,de.b)cicabebd7bUbccabiccScf,bdPbgKde"), new Object[]{str, Long.valueOf(j11), Float.valueOf(f11), locationListener, l.a().b()}, new Class[]{String.class, Long.TYPE, Float.TYPE, LocationListener.class, Looper.class});
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    @Override // com.mob.tools.a.f
    public Enumeration<InetAddress> a(NetworkInterface networkInterface) {
        try {
            return (Enumeration) ReflectHelper.invokeInstanceMethod(networkInterface, "getInetAddresses", new Object[0]);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public <T> T a(Object obj, String str, Object... objArr) {
        try {
            return (T) ReflectHelper.invokeInstanceMethod(obj, str, objArr);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public <T> T a(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
        try {
            return (T) ReflectHelper.invokeInstanceMethod(obj, str, objArr, clsArr);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }
}
