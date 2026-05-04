package com.mob.commons.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class h extends g {

    /* renamed from: c, reason: collision with root package name */
    private a f40202c;

    /* renamed from: d, reason: collision with root package name */
    private a f40203d;

    /* renamed from: e, reason: collision with root package name */
    private a f40204e;

    /* renamed from: f, reason: collision with root package name */
    private a f40205f;

    /* renamed from: g, reason: collision with root package name */
    private a f40206g;

    /* renamed from: h, reason: collision with root package name */
    private BroadcastReceiver f40207h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f40209a;

        /* renamed from: b, reason: collision with root package name */
        private long f40210b;

        /* renamed from: c, reason: collision with root package name */
        private String f40211c;

        public a(String str) {
            this.f40209a = str;
        }

        public void a(long j11) {
            this.f40210b = j11;
        }

        public boolean b() {
            return this.f40210b > System.currentTimeMillis();
        }

        public String a() {
            return this.f40211c;
        }

        public void a(String str) {
            this.f40211c = str;
        }
    }

    public h(Context context) {
        super(context);
        this.f40202c = new a(com.mob.commons.n.a("004Ccb3g(cdWg"));
        this.f40203d = new a(com.mob.commons.n.a("004FdbcecdAg"));
        this.f40204e = new a(com.mob.commons.n.a("004iZcecd=g"));
        this.f40205f = new a(com.mob.commons.n.a("004=cececd0g"));
        this.f40206g = new a(com.mob.commons.n.a("009Refcb=dd7dbcgWchg"));
    }

    private void j() {
        try {
            if (this.f40207h == null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(com.mob.commons.n.a("044<cfdb>k@dkTkh*cdekcbdkegdcch=khDdkdbZdh,cjcd7gKdkdifedhdfejdeccejfffbdeccdfehccfegbdidegjfb"));
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.mob.commons.b.h.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        String stringExtra;
                        ArrayList<String> stringArrayListExtra;
                        if (context == null || intent == null) {
                            return;
                        }
                        try {
                            boolean z11 = false;
                            if (intent.getIntExtra(com.mob.commons.n.a("016SdbSdhDcjdfXgPdedb:c=cdegchgcdcceee"), 0) == 2 && (stringArrayListExtra = intent.getStringArrayListExtra(com.mob.commons.n.a("0177db-dhXcjdf:gHffcecfciceee8hKdjcdefFc"))) != null) {
                                z11 = stringArrayListExtra.contains(context.getPackageName());
                            }
                            if (!z11 || (stringExtra = intent.getStringExtra(com.mob.commons.n.a("010]db=dhVcjdf%gOdhch*dh"))) == null) {
                                return;
                            }
                            if (stringExtra.equals(com.mob.commons.n.a("004Ccb*gJcd]g"))) {
                                h.this.f40202c.a(0L);
                                return;
                            }
                            if (stringExtra.equals(com.mob.commons.n.a("004%dbcecd2g"))) {
                                h.this.f40203d.a(0L);
                            } else if (stringExtra.equals(com.mob.commons.n.a("004i?cecdDg"))) {
                                h.this.f40204e.a(0L);
                            } else if (stringExtra.equals(com.mob.commons.n.a("004;cececdPg"))) {
                                h.this.f40205f.a(0L);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                };
                this.f40207h = broadcastReceiver;
                this.f40184a.registerReceiver(broadcastReceiver, intentFilter, com.mob.commons.n.a("048Ucfdb'kGdkEkh;cdekcbdkegdcch'khVdkdb3dh:cjcdNg1dkUdh>cgYk-cdefefcddbcjdkejfffbdeccdfehccfegbdidegjfb"), null);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.mob.commons.b.g
    public synchronized String e() {
        Context context = this.f40184a;
        if (context == null) {
            return null;
        }
        return a(context.getApplicationContext(), this.f40203d, false);
    }

    @Override // com.mob.commons.b.g
    public synchronized String f() {
        Context context = this.f40184a;
        if (context == null) {
            return null;
        }
        return a(context.getApplicationContext(), this.f40202c, false);
    }

    @Override // com.mob.commons.b.g
    public synchronized String g() {
        Context context = this.f40184a;
        if (context == null) {
            return null;
        }
        return a(context.getApplicationContext(), this.f40204e, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if (r9 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        if (r9 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(android.content.Context r9, com.mob.commons.b.h.a r10, boolean r11) {
        /*
            r8 = this;
            r1 = 0
            if (r10 != 0) goto L4
            return r1
        L4:
            if (r11 != 0) goto L11
            boolean r0 = r10.b()
            if (r0 == 0) goto L11
            java.lang.String r9 = com.mob.commons.b.h.a.a(r10)
            return r9
        L11:
            java.lang.String r0 = "0361cfdbcjPch1cj9ceff5cfdb?kOdk!kh5cdekcbdkegdcchTkhLdkdb>dh$cjcd<g+efWg)ciEf"
            java.lang.String r0 = com.mob.commons.n.a(r0)
            android.net.Uri r3 = android.net.Uri.parse(r0)
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r9 = com.mob.commons.b.h.a.b(r10)     // Catch: java.lang.Throwable -> L9c
            java.lang.String[] r6 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L9c
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9c
            r0 = 1
            r2 = 0
            if (r9 == 0) goto L86
            r9.moveToFirst()     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "005i!cedccb)h"
            java.lang.String r3 = com.mob.commons.n.a(r3)     // Catch: java.lang.Throwable -> L49
            int r3 = r9.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L49
            if (r3 < 0) goto L4c
            java.lang.String r3 = r9.getString(r3)     // Catch: java.lang.Throwable -> L49
            r10.a(r3)     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r0 = move-exception
            r10 = r0
            goto L9f
        L4c:
            r3 = r1
        L4d:
            if (r11 != 0) goto L82
            java.lang.String r11 = "007h)ck(d4cdcg[hg"
            java.lang.String r11 = com.mob.commons.n.a(r11)     // Catch: java.lang.Throwable -> L49
            int r11 = r9.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L49
            if (r11 < 0) goto L62
            long r4 = r9.getLong(r11)     // Catch: java.lang.Throwable -> L49
            r10.a(r4)     // Catch: java.lang.Throwable -> L49
        L62:
            java.lang.String r10 = "004'cfdb-gh"
            java.lang.String r10 = com.mob.commons.n.a(r10)     // Catch: java.lang.Throwable -> L49
            int r10 = r9.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L49
            if (r10 < 0) goto L82
            int r10 = r9.getInt(r10)     // Catch: java.lang.Throwable -> L49
            r11 = 1000(0x3e8, float:1.401E-42)
            if (r10 == r11) goto L82
            r8.j()     // Catch: java.lang.Throwable -> L49
            boolean r10 = r8.a(r2)     // Catch: java.lang.Throwable -> L49
            if (r10 != 0) goto L82
            r8.a(r0)     // Catch: java.lang.Throwable -> L49
        L82:
            r9.close()     // Catch: java.lang.Throwable -> L85
        L85:
            return r3
        L86:
            if (r11 == 0) goto L8d
            java.lang.String r11 = "1"
            r10.a(r11)     // Catch: java.lang.Throwable -> L49
        L8d:
            boolean r10 = r8.a(r2)     // Catch: java.lang.Throwable -> L49
            if (r10 == 0) goto L96
            r8.a(r0)     // Catch: java.lang.Throwable -> L49
        L96:
            if (r9 == 0) goto La9
        L98:
            r9.close()     // Catch: java.lang.Throwable -> La9
            goto La9
        L9c:
            r0 = move-exception
            r10 = r0
            r9 = r1
        L9f:
            com.mob.commons.b.c r11 = com.mob.commons.b.c.a()     // Catch: java.lang.Throwable -> Laa
            r11.a(r10)     // Catch: java.lang.Throwable -> Laa
            if (r9 == 0) goto La9
            goto L98
        La9:
            return r1
        Laa:
            r0 = move-exception
            r10 = r0
            if (r9 == 0) goto Lb1
            r9.close()     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.b.h.a(android.content.Context, com.mob.commons.b.h$a, boolean):java.lang.String");
    }

    @Override // com.mob.commons.b.g
    public synchronized String b() {
        Context context = this.f40184a;
        if (context == null) {
            return null;
        }
        return a(context.getApplicationContext(), this.f40205f, false);
    }

    private boolean a(boolean z11) {
        a aVar;
        if (!z11 && (aVar = this.f40206g) != null && aVar.a() != null) {
            return this.f40206g.a().equals("0");
        }
        String a11 = a(this.f40184a, this.f40206g, true);
        return a11 != null && "0".equals(a11);
    }
}
