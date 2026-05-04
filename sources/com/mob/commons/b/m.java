package com.mob.commons.b;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.text.TextUtils;
import com.mob.commons.b.g;
import com.mob.tools.MobLog;

/* loaded from: classes7.dex */
public class m extends g {

    /* renamed from: c, reason: collision with root package name */
    private a f40213c;

    /* renamed from: d, reason: collision with root package name */
    private a f40214d;

    /* renamed from: e, reason: collision with root package name */
    private a f40215e;

    /* renamed from: f, reason: collision with root package name */
    private String f40216f;

    public static class a extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        private int f40217a;

        /* renamed from: b, reason: collision with root package name */
        private m f40218b;

        public a(m mVar, int i11) {
            super(null);
            this.f40217a = i11;
            this.f40218b = mVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            m mVar = this.f40218b;
            if (mVar != null) {
                mVar.a(z11, this.f40217a);
            }
        }
    }

    public m(Context context) {
        super(context);
        this.f40213c = null;
        this.f40214d = null;
        this.f40215e = null;
        this.f40216f = "100215079";
        if (!TextUtils.isEmpty(com.mob.commons.n.f40399i)) {
            this.f40216f = com.mob.commons.n.f40399i;
        }
        MobLog.getInstance().d("oamt vivo appid: " + this.f40216f, new Object[0]);
    }

    private String b(int i11) {
        if (i11 == 0) {
            return com.mob.commons.j.a("051]becabiGbg0biIbdee8beca6jTcj=hNbcHh cacj?hj)decjce8fUeebfcaNhRbc6fg:bfWe7ceNfgDbiFb,bcdfbc=g6bfce7fe!dichcedg");
        }
        if (i11 == 1) {
            return com.mob.commons.j.a("052GbecabiSbg@biVbdee8beca0j^cjGhSbcDhKcacjKhj)decjceAfKeebfca*hJbc)fgBbf6eDce fg3bi;bGbcdfbc=gAbfceLfeMecchcedgbb") + this.f40216f;
        }
        if (i11 != 2) {
            return null;
        }
        return com.mob.commons.j.a("0521becabiBbgSbi$bdeeEbeca>j3cj[h)bcXh.cacj,hj9decjceGfZeebfca0hCbc2fgKbfOe)ce^fgFbiSb3bcdfbc,g!bfceNfeSchchcedgbb") + this.f40216f;
    }

    @Override // com.mob.commons.b.g
    public g.c c() {
        g.c cVar = new g.c();
        cVar.f40198b = a(0);
        cVar.f40201e = a(1);
        String a11 = a(2);
        cVar.f40199c = a11;
        if (TextUtils.isEmpty(a11)) {
            cVar.f40199c = i();
        }
        return cVar;
    }

    @Override // com.mob.commons.b.g
    public synchronized boolean h() {
        return "1".equals(a(com.mob.commons.j.a("034cg]bfdebcdeUb)cjdebgdecjbc]fg:biCb>bcdfbcOg1bfbcCf-cjdebaKccGcabfTbgf"), "0"));
    }

    private String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(com.mob.commons.j.a("027;bdbi2f1bfcabcMfIcjcadecjcfbgdePbgjHeebfcaIcg;bfFb.bcLg-de"));
            return (String) cls.getMethod(com.mob.commons.j.a("003_ddSgb"), String.class, String.class).invoke(cls, str, com.mob.commons.j.a("007Ibabibhbicadbbi"));
        } catch (Throwable th2) {
            c.a().a(th2);
            return str2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r2 != null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(int r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.b(r9)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.net.Uri r3 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L42
            android.content.Context r0 = r8.f40184a     // Catch: java.lang.Throwable -> L42
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L42
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L39
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L39
            java.lang.String r0 = "005hQbdcbba7g"
            java.lang.String r0 = com.mob.commons.j.a(r0)     // Catch: java.lang.Throwable -> L37
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L37
            r2.close()     // Catch: java.lang.Throwable -> L33
        L33:
            r8.c(r9)     // Catch: java.lang.Throwable -> L36
        L36:
            return r0
        L37:
            r0 = move-exception
            goto L44
        L39:
            if (r2 == 0) goto L3e
        L3b:
            r2.close()     // Catch: java.lang.Throwable -> L3e
        L3e:
            r8.c(r9)     // Catch: java.lang.Throwable -> L4e
            goto L4e
        L42:
            r0 = move-exception
            r2 = r1
        L44:
            com.mob.commons.b.c r3 = com.mob.commons.b.c.a()     // Catch: java.lang.Throwable -> L4f
            r3.a(r0)     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L3e
            goto L3b
        L4e:
            return r1
        L4f:
            r0 = move-exception
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.lang.Throwable -> L55
        L55:
            r8.c(r9)     // Catch: java.lang.Throwable -> L58
        L58:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.b.m.a(int):java.lang.String");
    }

    private void c(int i11) {
        if (i11 == 0) {
            if (this.f40213c == null) {
                this.f40213c = new a(this, 0);
                this.f40184a.getContentResolver().registerContentObserver(Uri.parse(b(0)), true, this.f40213c);
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 == 2 && this.f40215e == null) {
                this.f40215e = new a(this, 2);
                this.f40184a.getContentResolver().registerContentObserver(Uri.parse(b(2)), false, this.f40215e);
                return;
            }
            return;
        }
        if (this.f40214d == null) {
            this.f40214d = new a(this, 1);
            this.f40184a.getContentResolver().registerContentObserver(Uri.parse(b(1)), false, this.f40214d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z11, int i11) {
        try {
            String a11 = a(i11);
            if (i11 == 0) {
                a(a11);
            } else if (i11 == 2) {
                b(a11);
            } else if (i11 == 1) {
                c(a11);
            }
        } catch (Throwable unused) {
        }
    }
}
