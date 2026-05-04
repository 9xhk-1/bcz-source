package com.mob.mgs.impl;

import android.text.TextUtils;
import com.mob.tools.network.NetCommunicator;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f40602a;

    /* renamed from: c, reason: collision with root package name */
    private volatile String f40604c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f40606e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f40607f;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f40603b = false;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f40605d = new byte[0];

    private f() {
    }

    public void b() {
        if (this.f40603b) {
            e.a().a("MgsGlobal already initialized");
        } else {
            new h() { // from class: com.mob.mgs.impl.f.1
                @Override // com.mob.mgs.impl.h
                public void a() throws Throwable {
                    e.a().a("MgsGlobal init: start");
                    f.this.f();
                    f.this.f40603b = true;
                    e.a().a("MgsGlobal init: done");
                }
            }.start();
        }
    }

    public String c() {
        if (TextUtils.isEmpty(this.f40604c)) {
            e.a().b("WARNING: getDuidQuick got null!");
        }
        return this.f40604c;
    }

    public boolean d() {
        return this.f40606e;
    }

    public String e() {
        return this.f40607f;
    }

    public String f() {
        HashMap<String, Object> b11;
        if (TextUtils.isEmpty(this.f40604c)) {
            synchronized (this.f40605d) {
                try {
                    if (TextUtils.isEmpty(this.f40604c) && (b11 = com.mob.commons.e.b(null)) != null) {
                        this.f40604c = (String) b11.get(NetCommunicator.KEY_DUID);
                        this.f40606e = ((Boolean) b11.get(NetCommunicator.KEY_IS_MODIFIED)).booleanValue();
                        this.f40607f = (String) b11.get(NetCommunicator.KEY_DUID_PREVIOUS);
                        e.a().a("MC Global -> duid: " + this.f40604c + ", duidPre: " + this.f40607f + ", isModified: " + this.f40606e);
                    }
                } finally {
                }
            }
        }
        return this.f40604c;
    }

    public static f a() {
        if (f40602a == null) {
            synchronized (f.class) {
                try {
                    if (f40602a == null) {
                        f40602a = new f();
                    }
                } finally {
                }
            }
        }
        return f40602a;
    }
}
