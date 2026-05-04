package com.igexin.push.d;

/* loaded from: classes7.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38512a = "NormalModel";

    @Override // com.igexin.push.d.b
    public final long a() {
        long j11;
        boolean a11 = com.igexin.push.g.c.a();
        com.igexin.push.core.e.f38037n = com.igexin.push.g.c.e();
        boolean z11 = com.igexin.push.core.e.f38039p;
        boolean z12 = com.igexin.push.core.e.f38042s;
        boolean z13 = com.igexin.push.core.e.f38037n;
        com.igexin.c.a.c.a.a("NormalModel|isSdkOn = " + com.igexin.push.core.e.f38039p + " isPushOn = " + com.igexin.push.core.e.f38042s + " isBlockEndTime = " + a11 + " isNetworkAvailable = " + com.igexin.push.core.e.f38037n, new Object[0]);
        if (!com.igexin.push.core.e.f38037n || !com.igexin.push.core.e.f38039p || !com.igexin.push.core.e.f38042s || !a11) {
            com.igexin.c.a.c.a.a(f38512a, "reconnect stop, interval= 20min ++++++");
            com.igexin.c.a.c.a.a("NormalModel|reconnect stop, interval= 20min ++++", new Object[0]);
            return com.igexin.push.config.c.f37548g;
        }
        long j12 = com.igexin.push.core.e.O;
        if (j12 <= 0) {
            j11 = 1;
        } else {
            j11 = j12 + (j12 <= 300 ? 150L : j12 <= 10000 ? 500L : j12 <= 30000 ? 1500L : com.igexin.push.config.c.f37553l);
        }
        com.igexin.push.core.e.O = j11;
        if (com.igexin.push.core.e.O > com.igexin.push.config.c.f37548g) {
            com.igexin.push.core.e.O = com.igexin.push.config.c.f37548g;
        }
        long j13 = com.igexin.push.core.e.O;
        com.igexin.c.a.c.a.a("NormalModel|after add auto reconnect delay time = ".concat(String.valueOf(j13)), new Object[0]);
        return j13;
    }
}
