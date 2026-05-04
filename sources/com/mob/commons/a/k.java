package com.mob.commons.a;

import com.mob.MobSDK;
import com.mob.commons.v;
import com.mob.tools.utils.Data;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class k extends c {
    public k() {
        super(com.mob.commons.n.a("002NefYg"), 0L, com.mob.commons.n.a("002NefYg"), 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (r7.exists() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (r7.exists() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bd, code lost:
    
        if (r1.isPackageInstalled(com.mob.commons.n.a("020<cfdb<k@dkcecjWg:cgdbfdfgdkJik3cfdbcjegcdee")) != false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:12:0x0059, B:14:0x0075), top: B:11:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018f A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b3 A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #2 {all -> 0x00ab, blocks: (B:140:0x0097, B:23:0x00b2, B:28:0x00c9, B:33:0x00db, B:38:0x00ed, B:43:0x00ff, B:48:0x0111, B:53:0x0123, B:58:0x0135, B:63:0x0147, B:68:0x0159, B:73:0x016b, B:78:0x017d, B:83:0x018f, B:88:0x01a1, B:93:0x01b3), top: B:139:0x0097 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object[] n() {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.k.n():java.lang.Object[]");
    }

    @Override // com.mob.commons.a.c
    public void a() {
        Object[] n11 = n();
        StringBuilder sb2 = new StringBuilder();
        if (n11 != null && n11.length == 2) {
            sb2.append(n11[0]);
        }
        com.mob.tools.utils.f fVar = new com.mob.tools.utils.f();
        int a11 = fVar.a(MobSDK.getContext());
        sb2.append(a11);
        int b11 = fVar.b(MobSDK.getContext());
        sb2.append(b11);
        int c11 = fVar.c(MobSDK.getContext());
        sb2.append(c11);
        int d11 = fVar.d(MobSDK.getContext());
        sb2.append(d11);
        int a12 = fVar.a();
        sb2.append(a12);
        int e11 = fVar.e(MobSDK.getContext());
        sb2.append(e11);
        int f11 = fVar.f(MobSDK.getContext());
        sb2.append(f11);
        int b12 = fVar.b();
        sb2.append(b12);
        String MD5 = Data.MD5(sb2.toString());
        v a13 = v.a();
        String str = v.f40439p;
        String b13 = a13.b(str, (String) null);
        if (MD5 == null || !MD5.equals(b13)) {
            v.a().a(str, MD5);
            HashMap<String, Object> hashMap = new HashMap<>();
            if (n11 != null && n11.length == 2) {
                Object obj = n11[1];
                if (obj instanceof HashMap) {
                    hashMap.putAll((HashMap) obj);
                }
            }
            hashMap.put(com.mob.commons.n.a("010AcfcieiceefBh,ebcecj5g"), Integer.valueOf(a11));
            hashMap.put(com.mob.commons.n.a("007Bcfcieidbcecg'g"), Integer.valueOf(b11));
            hashMap.put(com.mob.commons.n.a("010[cfciffdcce,cMegdbcg.k"), Integer.valueOf(c11));
            hashMap.put(com.mob.commons.n.a("008]cfcigcdcceYiZdbcg"), Integer.valueOf(d11));
            hashMap.put(com.mob.commons.n.a("008XcfcifeeecgdbcbUd"), Integer.valueOf(a12));
            hashMap.put("ckiemt", Integer.valueOf(e11));
            hashMap.put(com.mob.commons.n.a("011@cfcifedb%kk?dbcjce^dd"), Integer.valueOf(f11));
            hashMap.put(com.mob.commons.n.a("009;cfcife'd-cbcdcjegdb"), Integer.valueOf(b12));
            a("SIMUMT", hashMap);
        }
    }
}
