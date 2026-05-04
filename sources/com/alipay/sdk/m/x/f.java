package com.alipay.sdk.m.x;

import java.util.Iterator;
import java.util.Stack;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public Stack<e> f11227a = new Stack<>();

    public void a(e eVar) {
        this.f11227a.push(eVar);
    }

    public boolean b() {
        return this.f11227a.isEmpty();
    }

    public e c() {
        return this.f11227a.pop();
    }

    public void a() {
        if (b()) {
            return;
        }
        Iterator<e> it = this.f11227a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f11227a.clear();
    }
}
