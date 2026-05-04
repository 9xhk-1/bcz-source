package com.getui.gtc.a.a;

import android.net.Network;
import com.huawei.hms.iap.entity.OrderStatusCode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public String f29693a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f29694b;

    /* renamed from: c, reason: collision with root package name */
    public Network f29695c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29696d;

    /* renamed from: e, reason: collision with root package name */
    public e f29697e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29698f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29699g;

    /* renamed from: h, reason: collision with root package name */
    public int f29700h;

    /* renamed from: i, reason: collision with root package name */
    public int f29701i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29702j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f29703k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29704l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29705m;

    /* renamed from: n, reason: collision with root package name */
    public HashMap<String, String> f29706n;

    public f() {
        this.f29695c = null;
        this.f29700h = 30000;
        this.f29701i = OrderStatusCode.ORDER_STATE_CANCEL;
        this.f29702j = true;
        this.f29703k = true;
        this.f29704l = false;
        this.f29705m = true;
        this.f29706n = new HashMap<>();
    }

    public void a() {
    }

    public f(String str) {
        this.f29695c = null;
        this.f29700h = 30000;
        this.f29701i = OrderStatusCode.ORDER_STATE_CANCEL;
        this.f29702j = true;
        this.f29703k = true;
        this.f29704l = false;
        this.f29705m = true;
        HashMap<String, String> hashMap = new HashMap<>();
        this.f29706n = hashMap;
        this.f29693a = str;
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
    }

    public void a(int i11) {
    }

    public void a(Map<String, List<String>> map, byte[] bArr) {
    }
}
