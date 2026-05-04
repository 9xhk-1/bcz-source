package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg;

/* loaded from: classes8.dex */
class fb implements bg.b.a {

    /* renamed from: a, reason: collision with root package name */
    private int f45552a;

    /* renamed from: a, reason: collision with other field name */
    private fv f385a;

    /* renamed from: a, reason: collision with other field name */
    private XMPushService f386a;

    /* renamed from: a, reason: collision with other field name */
    private bg.b f387a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f389a = false;

    /* renamed from: a, reason: collision with other field name */
    private bg.c f388a = bg.c.binding;

    public fb(XMPushService xMPushService, bg.b bVar) {
        this.f386a = xMPushService;
        this.f387a = bVar;
    }

    private void b() {
        this.f387a.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r4 = this;
            r4.b()
            boolean r0 = r4.f389a
            if (r0 != 0) goto L9
            goto L85
        L9:
            int r0 = r4.f45552a
            r1 = 11
            if (r0 != r1) goto L11
            goto L85
        L11:
            com.xiaomi.push.fg r0 = com.xiaomi.push.fg.m5936a()
            com.xiaomi.push.ez r0 = r0.m5938a()
            int[] r1 = com.xiaomi.push.fd.f45554a
            com.xiaomi.push.service.bg$c r2 = r4.f388a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L33
            r3 = 3
            if (r1 == r3) goto L2a
            goto L5e
        L2a:
            com.xiaomi.push.ey r1 = com.xiaomi.push.ey.BIND_SUCCESS
        L2c:
            int r1 = r1.a()
            r0.f371a = r1
            goto L5e
        L33:
            int r1 = r4.f45552a
            r3 = 17
            if (r1 != r3) goto L3c
            com.xiaomi.push.ey r1 = com.xiaomi.push.ey.BIND_TCP_READ_TIMEOUT
            goto L2c
        L3c:
            r3 = 21
            if (r1 != r3) goto L43
            com.xiaomi.push.ey r1 = com.xiaomi.push.ey.BIND_TIMEOUT
            goto L2c
        L43:
            com.xiaomi.push.ff r1 = com.xiaomi.push.fg.a()     // Catch: java.lang.NullPointerException -> L5d
            java.lang.Exception r1 = r1.a()     // Catch: java.lang.NullPointerException -> L5d
            com.xiaomi.push.fe$a r1 = com.xiaomi.push.fe.c(r1)     // Catch: java.lang.NullPointerException -> L5d
            com.xiaomi.push.ey r3 = r1.f45555a     // Catch: java.lang.NullPointerException -> L5d
            int r3 = r3.a()     // Catch: java.lang.NullPointerException -> L5d
            r0.f371a = r3     // Catch: java.lang.NullPointerException -> L5d
            java.lang.String r1 = r1.f390a     // Catch: java.lang.NullPointerException -> L5d
            r0.c(r1)     // Catch: java.lang.NullPointerException -> L5d
            goto L5e
        L5d:
            r0 = 0
        L5e:
            if (r0 == 0) goto L85
            com.xiaomi.push.fv r1 = r4.f385a
            java.lang.String r1 = r1.mo5965a()
            r0.b(r1)
            com.xiaomi.push.service.bg$b r1 = r4.f387a
            java.lang.String r1 = r1.f968b
            r0.d(r1)
            r0.f374b = r2
            com.xiaomi.push.service.bg$b r1 = r4.f387a     // Catch: java.lang.NumberFormatException -> L7e
            java.lang.String r1 = r1.f46286g     // Catch: java.lang.NumberFormatException -> L7e
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L7e
            byte r1 = (byte) r1     // Catch: java.lang.NumberFormatException -> L7e
            r0.a(r1)     // Catch: java.lang.NumberFormatException -> L7e
        L7e:
            com.xiaomi.push.fg r1 = com.xiaomi.push.fg.m5936a()
            r1.a(r0)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fb.c():void");
    }

    public void a() {
        this.f387a.a(this);
        this.f385a = this.f386a.m6206a();
    }

    @Override // com.xiaomi.push.service.bg.b.a
    public void a(bg.c cVar, bg.c cVar2, int i11) {
        if (!this.f389a && cVar == bg.c.binding) {
            this.f388a = cVar2;
            this.f45552a = i11;
            this.f389a = true;
        }
        this.f386a.a(new fc(this, 4));
    }
}
