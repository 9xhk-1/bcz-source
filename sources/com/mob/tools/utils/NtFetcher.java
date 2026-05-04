package com.mob.tools.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.text.TextUtils;
import com.igexin.sdk.PushConsts;
import com.mob.commons.j;
import com.mob.tools.MobLog;
import com.mob.tools.a.g;
import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: classes7.dex */
public class NtFetcher implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private static NtFetcher f41389a;

    /* renamed from: b, reason: collision with root package name */
    private Context f41390b;

    /* renamed from: c, reason: collision with root package name */
    private DeviceHelper f41391c;

    /* renamed from: d, reason: collision with root package name */
    private BroadcastReceiver f41392d;

    /* renamed from: e, reason: collision with root package name */
    private String f41393e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f41394f;

    private NtFetcher(Context context) {
        this.f41390b = context;
        DeviceHelper deviceHelper = DeviceHelper.getInstance(context);
        this.f41391c = deviceHelper;
        if (deviceHelper.isSensitiveDevice()) {
            a();
        }
    }

    @TargetApi(21)
    private ConnectivityManager.NetworkCallback b() {
        return new ConnectivityManager.NetworkCallback() { // from class: com.mob.tools.utils.NtFetcher.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                NtFetcher.this.c();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                super.onCapabilitiesChanged(network, networkCapabilities);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                super.onLinkPropertiesChanged(network, linkProperties);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLosing(Network network, int i11) {
                super.onLosing(network, i11);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                NtFetcher.this.c();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                super.onUnavailable();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f41393e = g();
        this.f41394f = Integer.valueOf(d());
    }

    private int d() {
        if (this.f41391c.getSystemServiceSafe("phone") == null) {
            return -1;
        }
        try {
            return this.f41391c.checkPermission(j.a("035TbdbiIf.bfcabc@fOcj0cgYbf*jBbcdedebccabicjebeachdgbbeefadicdeabbcfcgchcgea")) ? g.a(this.f41390b).a().e() : g.a(this.f41390b).a().d();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return -1;
        }
    }

    private void e() {
        this.f41392d = new BroadcastReceiver() { // from class: com.mob.tools.utils.NtFetcher.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equalsIgnoreCase(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE)) {
                        NtFetcher.this.c();
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE);
        try {
            ReflectHelper.invokeInstanceMethod(this.f41390b, j.a("0162bf^g4ddbcdeXbgHbfebGgCbe^g1bc'hgEbf"), new Object[]{this.f41392d, intentFilter}, new Class[]{BroadcastReceiver.class, IntentFilter.class});
        } catch (Throwable unused) {
        }
    }

    private void f() {
        if (this.f41392d != null) {
            try {
                ReflectHelper.invokeInstanceMethod(this.f41390b, j.a("018%babibfVgCddbcdeUbg[bfeb%gLbe*g2bc%hg(bf"), new Object[]{this.f41392d}, new Class[]{BroadcastReceiver.class});
            } catch (Throwable unused) {
            }
            this.f41392d = null;
        }
    }

    private String g() {
        Object systemServiceSafe;
        NetworkInfo activeNetworkInfo;
        try {
            if (this.f41391c.checkPermission(j.a("039BbdbiTfWbfcabcQf:cjNcgVbf0jIbcdedebccabicjchededeacfcfbbcdeacgejdiebfhbbcfcgchcgea")) && (systemServiceSafe = this.f41391c.getSystemServiceSafe("connectivity")) != null && (activeNetworkInfo = ((ConnectivityManager) systemServiceSafe).getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    if (h()) {
                        return j.a("002Dfcfi");
                    }
                    if (l()) {
                        return j.a("002]hgfi");
                    }
                    return j.a(m() ? "002Yhafi" : "002Rehfi");
                }
                if (type == 1) {
                    return j.a("004Tdbbcdfbc");
                }
                switch (type) {
                    case 6:
                        return j.a("005Ndbbc-j5bdbj");
                    case 7:
                        return j.a("009:dacbba'gbEcaca$ba");
                    case 8:
                        return j.a("005fObaGjj+bg");
                    case 9:
                        return j.a("008gbagWbfbiGgb");
                    default:
                        return String.valueOf(type);
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        return j.a("004Abicabi'g");
    }

    public static NtFetcher getInstance(Context context) {
        if (f41389a == null) {
            synchronized (NtFetcher.class) {
                try {
                    if (f41389a == null) {
                        f41389a = new NtFetcher(context);
                    }
                } finally {
                }
            }
        }
        return f41389a;
    }

    private boolean h() {
        if (i() || j()) {
            return true;
        }
        return k();
    }

    private boolean i() {
        try {
            Object systemServiceSafe = this.f41391c.getSystemServiceSafe("phone");
            if (systemServiceSafe != null && this.f41391c.checkPermission(j.a("035-bdbi<f!bfcabc5fVcj6cg@bf!j<bcdedebccabicjebeachdgbbeefadicdeabbcfcgchcgea"))) {
                String manufacturer = this.f41391c.getManufacturer();
                if (!TextUtils.isEmpty(manufacturer)) {
                    if (!manufacturer.contains(j.a("006aFbabddb:gAbc"))) {
                        if (!manufacturer.contains(j.a("006Pfababddb5gCbc"))) {
                            if (manufacturer.contains(j.a("006Afaccchejeace"))) {
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (((Integer) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(systemServiceSafe, j.a("015AddNgbHcfEg0bf6h.bcbeDg@cf]bHbd_bg"), new Object[0]), j.a("016Zdd>gb'fadbcdTgbRdbcabfbhcgbg8cg"), new Object[0])).intValue() == 20) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        return false;
    }

    private boolean j() {
        try {
            Object systemServiceSafe = this.f41391c.getSystemServiceSafe("phone");
            if (systemServiceSafe != null && this.f41391c.checkPermission(j.a("035Nbdbi!f=bfcabc5f?cj=cgPbfFjXbcdedebccabicjebeachdgbbeefadicdeabbcfcgchcgea")) && Build.VERSION.SDK_INT >= 26) {
                return ((Integer) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(systemServiceSafe, j.a("0154dd1gbFcf9g(bf@hNbcbe<gWcf;bGbd;bg"), new Object[0]), j.a("010Udd0gbLcdbfcf8b,bd^bg"), new Object[0])).intValue() == 3;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean k() {
        try {
            return g.a(this.f41390b).a().d() == 20;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return false;
        }
    }

    private boolean l() {
        return g.a(this.f41390b).a().d() == 13;
    }

    private boolean m() {
        if (this.f41391c.getSystemServiceSafe("phone") == null) {
            return false;
        }
        try {
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        switch (g.a(this.f41390b).a().d()) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            default:
                return false;
        }
    }

    @Deprecated
    public synchronized int getDtNtType() {
        try {
            if (this.f41391c.isSensitiveDevice()) {
                if (this.f41394f == null) {
                }
            }
            this.f41394f = Integer.valueOf(d());
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f41394f.intValue();
    }

    public synchronized String getNtType() {
        try {
            if (this.f41391c.isSensitiveDevice()) {
                if (TextUtils.isEmpty(this.f41393e)) {
                }
            }
            this.f41393e = g();
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f41393e;
    }

    public void recycle() {
        f();
    }

    @SuppressLint({"MissingPermission"})
    private void a() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f41391c.getSystemServiceSafe("connectivity");
            if (Build.VERSION.SDK_INT >= 26 && this.f41391c.checkPermission(j.a("039NbdbiAfObfcabc>f'cjScgZbfUj5bcdedebccabicjchededeacfcfbbcdeacgejdiebfhbbcfcgchcgea"))) {
                connectivityManager.registerDefaultNetworkCallback(b());
            } else if (this.f41391c.checkPermission(j.a("039?bdbi)f:bfcabc.fTcjUcg3bf+jQbcdedebccabicjchededeacfcfbbcdeacgejdiebfhbbcfcgchcgea"))) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), b());
            } else {
                e();
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }
}
