package com.getui.gtc.f;

import com.getui.gtc.api.OnDycEnableChangedListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final b f30058c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final List<OnDycEnableChangedListener> f30059a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f30060b = new AtomicBoolean(false);

    private b() {
    }

    public static b a() {
        return f30058c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0207, code lost:
    
        if (r7.equals("aW1zaTI=") != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02bd, code lost:
    
        if (r7.equals("Y2VsbF9pbmZvX25ldw==") != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
    
        if (r7.equals("bWFjX2FsbA==") != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d2 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:176:0x0077, B:178:0x007f, B:12:0x0089, B:15:0x0093, B:16:0x0098, B:18:0x00a0, B:19:0x00a5, B:22:0x00b0, B:25:0x00bb, B:28:0x00c6, B:31:0x00d1, B:34:0x00dc, B:36:0x00e4, B:37:0x00e9, B:40:0x00f4, B:43:0x00ff, B:46:0x010a, B:48:0x0112, B:49:0x0117, B:51:0x011f, B:52:0x02bf, B:53:0x0124, B:56:0x0130, B:59:0x013c, B:62:0x0148, B:64:0x0150, B:65:0x0154, B:68:0x0160, B:70:0x0168, B:71:0x016b, B:72:0x0170, B:75:0x0179, B:77:0x0181, B:78:0x0186, B:81:0x0192, B:84:0x019c, B:86:0x01a4, B:87:0x01a9, B:89:0x01b1, B:90:0x01b9, B:93:0x01c5, B:96:0x01d1, B:99:0x01dd, B:102:0x01e9, B:105:0x01f5, B:108:0x0201, B:110:0x0209, B:111:0x020e, B:113:0x0216, B:114:0x021b, B:116:0x0223, B:117:0x022a, B:120:0x0252, B:121:0x0233, B:123:0x023b, B:124:0x0242, B:126:0x024c, B:127:0x0257, B:129:0x025f, B:130:0x0263, B:132:0x026b, B:133:0x026f, B:136:0x027b, B:139:0x0287, B:142:0x0293, B:145:0x029f, B:148:0x02ab, B:151:0x02b7, B:153:0x02c2, B:154:0x02cc, B:156:0x02d2, B:159:0x02de), top: B:175:0x0077 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.Boolean> b(java.util.Map<java.lang.String, java.lang.String> r25) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.f.b.b(java.util.Map):java.util.Map");
    }

    public static String a(Map<String, Boolean> map) {
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = {"dim-2-1-21-5", "dim-2-1-21-3", "dim-2-1-21-1", "dim-2-1-21-2"};
        for (int i11 = 0; i11 < 4; i11++) {
            Boolean bool = map.get(strArr[i11]);
            sb2.append((bool == null || !bool.booleanValue()) ? "0" : "1");
        }
        return sb2.toString();
    }

    public final void a(OnDycEnableChangedListener onDycEnableChangedListener) {
        if (this.f30060b.get() || onDycEnableChangedListener == null) {
            return;
        }
        synchronized (this.f30059a) {
            this.f30059a.add(onDycEnableChangedListener);
        }
    }
}
