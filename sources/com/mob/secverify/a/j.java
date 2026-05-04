package com.mob.secverify.a;

import com.mob.secverify.common.exception.VerifyException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private String f40663a;

    /* renamed from: b, reason: collision with root package name */
    private String f40664b;

    /* renamed from: c, reason: collision with root package name */
    private int f40665c;

    /* renamed from: d, reason: collision with root package name */
    private String f40666d;

    /* renamed from: e, reason: collision with root package name */
    private int f40667e;

    /* renamed from: f, reason: collision with root package name */
    private String f40668f;

    /* renamed from: g, reason: collision with root package name */
    private long f40669g;

    /* renamed from: h, reason: collision with root package name */
    private long f40670h;

    /* renamed from: i, reason: collision with root package name */
    private long f40671i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f40672j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f40673k;

    /* renamed from: l, reason: collision with root package name */
    private String f40674l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f40675m;

    /* renamed from: o, reason: collision with root package name */
    private VerifyException f40677o;

    /* renamed from: p, reason: collision with root package name */
    private String f40678p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f40679q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f40680r = false;

    /* renamed from: n, reason: collision with root package name */
    private final long f40676n = System.currentTimeMillis();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.mob.secverify.a.j$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40681a;

        static {
            int[] iArr = new int[com.mob.secverify.b.d.values().length];
            f40681a = iArr;
            try {
                iArr[com.mob.secverify.b.d.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40681a[com.mob.secverify.b.d.PREVERIFY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40681a[com.mob.secverify.b.d.AUTHPAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40681a[com.mob.secverify.b.d.VERIFY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public j(com.mob.secverify.b.d dVar, String str) {
        int i11 = AnonymousClass1.f40681a[dVar.ordinal()];
        if (i11 == 1) {
            this.f40663a = "init";
        } else if (i11 == 2) {
            this.f40663a = "preVerify";
        } else if (i11 == 3) {
            this.f40663a = "authPageOpend";
        } else if (i11 == 4) {
            this.f40663a = "verify";
        }
        this.f40664b = str;
    }

    public boolean a() {
        return this.f40680r;
    }

    public String b() {
        return this.f40678p;
    }

    public VerifyException c() {
        return this.f40677o;
    }

    public String d() {
        return this.f40663a;
    }

    public String e() {
        return this.f40664b;
    }

    public int f() {
        return this.f40665c;
    }

    public String g() {
        return this.f40666d;
    }

    public int h() {
        return this.f40667e;
    }

    public String i() {
        return this.f40668f;
    }

    public long j() {
        return this.f40669g;
    }

    public long k() {
        return this.f40670h;
    }

    public long l() {
        return this.f40671i;
    }

    public boolean m() {
        return this.f40672j;
    }

    public boolean n() {
        return this.f40673k;
    }

    public String o() {
        return this.f40674l;
    }

    public boolean p() {
        return this.f40675m;
    }

    public boolean q() {
        return this.f40679q;
    }

    public void a(boolean z11) {
        this.f40680r = z11;
    }

    public void b(String str) {
        this.f40666d = str;
    }

    public void c(String str) {
        this.f40668f = str;
    }

    public void d(String str) {
        this.f40674l = str;
    }

    public void a(String str) {
        this.f40678p = str;
    }

    public void b(int i11) {
        this.f40667e = i11;
    }

    public void c(long j11) {
        this.f40671i = j11;
    }

    public void a(VerifyException verifyException) {
        this.f40677o = verifyException;
    }

    public void b(long j11) {
        this.f40670h = j11;
    }

    public void c(boolean z11) {
        this.f40679q = z11;
    }

    public void a(int i11) {
        this.f40665c = i11;
    }

    public void b(boolean z11) {
        this.f40675m = z11;
    }

    public void a(long j11) {
        this.f40669g = j11;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:44:0x00e2
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public com.mob.secverify.a.j a(com.mob.secverify.common.exception.VerifyException r9, boolean r10) {
        /*
            r8 = this;
            java.lang.Throwable r0 = r9.getCause()
            java.lang.String r1 = r9.getMessage()
            int r9 = r9.getCode()
            java.lang.String r2 = "CTCC"
            java.lang.String r3 = "CMCC"
            java.lang.String r4 = "CUCC"
            java.lang.String r5 = ""
            if (r10 == 0) goto L91
            java.lang.String r6 = "init"
            java.lang.String r7 = r8.f40664b
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L29
            com.mob.secverify.b.a r6 = com.mob.secverify.b.a.Init_Server_Error
            int r6 = r6.a()
            if (r9 != r6) goto L29
            r1 = r5
        L29:
            java.lang.String r6 = "preVerify"
            java.lang.String r7 = r8.f40664b
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L5d
            java.lang.String r6 = com.mob.secverify.pure.core.ope.a.f40830a
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L41
            com.mob.secverify.common.exception.VerifyErr r9 = com.mob.secverify.common.exception.VerifyErr.C_ONE_KEY_OBTAIN_CU_OPERATOR_ACCESS_CODE_ERR
            int r9 = r9.getCode()
        L41:
            java.lang.String r6 = com.mob.secverify.pure.core.ope.a.f40830a
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L4f
            com.mob.secverify.common.exception.VerifyErr r9 = com.mob.secverify.common.exception.VerifyErr.C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_CODE_ERR
            int r9 = r9.getCode()
        L4f:
            java.lang.String r6 = com.mob.secverify.pure.core.ope.a.f40830a
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L5d
            com.mob.secverify.common.exception.VerifyErr r9 = com.mob.secverify.common.exception.VerifyErr.C_ONE_KEY_OBTAIN_CT_OPERATOR_ACCESS_CODE_ERR
            int r9 = r9.getCode()
        L5d:
            java.lang.String r6 = "verify"
            java.lang.String r7 = r8.f40664b
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L91
            java.lang.String r6 = com.mob.secverify.pure.core.ope.a.f40830a
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L75
            com.mob.secverify.common.exception.VerifyErr r9 = com.mob.secverify.common.exception.VerifyErr.C_ONE_KEY_OBTAIN_CU_OPERATOR_ACCESS_TOKEN_ERR
            int r9 = r9.getCode()
        L75:
            java.lang.String r6 = com.mob.secverify.pure.core.ope.a.f40830a
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L83
            com.mob.secverify.common.exception.VerifyErr r9 = com.mob.secverify.common.exception.VerifyErr.C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_TOKEN_ERR
            int r9 = r9.getCode()
        L83:
            java.lang.String r6 = com.mob.secverify.pure.core.ope.a.f40830a
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L91
            com.mob.secverify.common.exception.VerifyErr r9 = com.mob.secverify.common.exception.VerifyErr.C_ONE_KEY_OBTAIN_CT_OPERATOR_ACCESS_TOKEN_ERR
            int r9 = r9.getCode()
        L91:
            java.lang.String r6 = r8.f40668f
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L9a
            r5 = r1
        L9a:
            if (r0 == 0) goto Le2
            java.lang.String r5 = r0.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto Le2
            java.lang.String r0 = com.mob.secverify.pure.core.ope.a.f40830a     // Catch: java.lang.Throwable -> Le2
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto Lba
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le2
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = "status"
            int r0 = r0.optInt(r2)     // Catch: java.lang.Throwable -> Le2
            goto Le3
        Lba:
            java.lang.String r0 = com.mob.secverify.pure.core.ope.a.f40830a     // Catch: java.lang.Throwable -> Le2
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto Lce
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le2
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = "resultCode"
            int r0 = r0.optInt(r2)     // Catch: java.lang.Throwable -> Le2
            goto Le3
        Lce:
            java.lang.String r0 = com.mob.secverify.pure.core.ope.a.f40830a     // Catch: java.lang.Throwable -> Le2
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto Le2
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le2
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = "result"
            int r0 = r0.optInt(r2)     // Catch: java.lang.Throwable -> Le2
            goto Le3
        Le2:
            r0 = r9
        Le3:
            r8.f40665c = r9
            r8.f40666d = r1
            r8.f40667e = r0
            r8.f40668f = r5
            r8.f40675m = r10
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.a.j.a(com.mob.secverify.common.exception.VerifyException, boolean):com.mob.secverify.a.j");
    }
}
