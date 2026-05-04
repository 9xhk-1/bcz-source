package pa;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f80324d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f80325e = 86400000;

    public c() {
        super("LastXdayStrategy");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @Override // pa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.io.File> b(java.util.List<java.io.File> r9, java.lang.Object... r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r10 == 0) goto L18
            int r2 = r10.length
            if (r2 <= 0) goto L18
            r10 = r10[r1]
            boolean r2 = r10 instanceof java.lang.Integer
            if (r2 == 0) goto L18
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            goto L19
        L18:
            r10 = 2
        L19:
            long r2 = java.lang.System.currentTimeMillis()
        L1d:
            if (r1 >= r10) goto L5b
            java.util.Date r4 = new java.util.Date
            r5 = 86400000(0x5265c00, float:7.82218E-36)
            int r5 = r5 * r1
            long r5 = (long) r5
            long r5 = r2 - r5
            r4.<init>(r5)
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r6 = "yyyyMMdd"
            java.util.Locale r7 = java.util.Locale.getDefault()
            r5.<init>(r6, r7)
            java.lang.String r4 = r5.format(r4)
            java.util.Iterator r5 = r9.iterator()
        L3e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L58
            java.lang.Object r6 = r5.next()
            java.io.File r6 = (java.io.File) r6
            java.lang.String r7 = r6.getName()
            boolean r7 = r7.contains(r4)
            if (r7 == 0) goto L3e
            r0.add(r6)
            goto L3e
        L58:
            int r1 = r1 + 1
            goto L1d
        L5b:
            java.util.Iterator r9 = r9.iterator()
        L5f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L7b
            java.lang.Object r10 = r9.next()
            java.io.File r10 = (java.io.File) r10
            java.lang.String r1 = r10.getName()
            java.lang.String r2 = ".mmap2"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L5f
            r0.add(r10)
            goto L5f
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.c.b(java.util.List, java.lang.Object[]):java.util.List");
    }
}
