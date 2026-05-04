package com.xiaomi.push.service;

import com.xiaomi.push.aj;

/* loaded from: classes8.dex */
final class al extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f46243a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ ax f927a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f928a;

    public al(String str, ax axVar, int i11) {
        this.f928a = str;
        this.f927a = axVar;
        this.f46243a = i11;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return this.f928a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f927a.a(this.f46243a);
    }
}
