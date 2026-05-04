package jp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class l extends t {
    public static String q(int i11, String str) {
        if (str.charAt(i11) != '(') {
            return null;
        }
        String substring = str.substring(i11 + 1);
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < substring.length(); i12++) {
            char charAt = substring.charAt(i12);
            if (charAt == ')') {
                return sb2.toString();
            }
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String r(int i11, String str) {
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(i11);
        for (int i12 = 0; i12 < substring.length(); i12++) {
            char charAt = substring.charAt(i12);
            if (charAt != '(') {
                sb2.append(charAt);
            } else {
                if (q(i12, substring) != null) {
                    break;
                }
                sb2.append('(');
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x020d, code lost:
    
        if (r2.equals(com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SHARE_TO_QQ) == false) goto L13;
     */
    @Override // jp.t
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jp.k k(com.google.zxing.k r24) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.l.k(com.google.zxing.k):jp.k");
    }
}
