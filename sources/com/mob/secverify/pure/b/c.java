package com.mob.secverify.pure.b;

import com.mob.secverify.pure.entity.PreVerifyResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f40741a;

    /* renamed from: b, reason: collision with root package name */
    private PreVerifyResult f40742b;

    /* renamed from: c, reason: collision with root package name */
    private com.mob.secverify.a.a f40743c;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f40745e;

    /* renamed from: f, reason: collision with root package name */
    private int f40746f;

    /* renamed from: i, reason: collision with root package name */
    private String f40749i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f40750j;

    /* renamed from: d, reason: collision with root package name */
    private boolean f40744d = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40747g = true;

    /* renamed from: h, reason: collision with root package name */
    private String f40748h = "LphSZLqaUeFdyaQq";

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f40751k = new AtomicInteger(0);

    private c() {
    }

    public static c a() {
        if (f40741a == null) {
            synchronized (c.class) {
                try {
                    if (f40741a == null) {
                        f40741a = new c();
                    }
                } finally {
                }
            }
        }
        return f40741a;
    }

    public PreVerifyResult b() {
        return this.f40742b;
    }

    public com.mob.secverify.a.a c() {
        return this.f40743c;
    }

    public List<String> d() {
        if (this.f40745e == null) {
            this.f40745e = new ArrayList();
        }
        return this.f40745e;
    }

    public int e() {
        return this.f40746f;
    }

    public String f() {
        return this.f40748h;
    }

    public boolean g() {
        return this.f40750j;
    }

    public void b(String str) {
        this.f40749i = str;
    }

    public void b(boolean z11) {
        this.f40750j = z11;
    }

    public void a(PreVerifyResult preVerifyResult) {
        this.f40742b = preVerifyResult;
    }

    public void a(com.mob.secverify.a.a aVar) {
        this.f40743c = aVar;
    }

    public void a(List<String> list) {
        this.f40745e = list;
    }

    public void a(boolean z11) {
        this.f40744d = z11;
    }

    public void a(int i11) {
        this.f40746f = i11;
    }

    public void a(String str) {
        this.f40748h = str;
    }
}
