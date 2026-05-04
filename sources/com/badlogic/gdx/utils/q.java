package com.badlogic.gdx.utils;

import a3.y0;
import com.badlogic.gdx.utils.l;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13430a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f13431b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13432c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13433d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13434e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13435f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final String f13436g = "\n";

    public static void a(y0 y0Var, String str, boolean z11, boolean z12) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt > '=' && charAt < 127) {
                y0Var.N(charAt == '\\' ? "\\\\" : Character.valueOf(charAt));
            } else if (charAt == '\t') {
                y0Var.O("\\t");
            } else if (charAt == '\n') {
                y0Var.O("\\n");
            } else if (charAt == '\f') {
                y0Var.O("\\f");
            } else if (charAt == '\r') {
                y0Var.O("\\r");
            } else if (charAt != ' ') {
                if (charAt == '!' || charAt == '#' || charAt == ':' || charAt == '=') {
                    y0Var.append('\\').append(charAt);
                } else if ((charAt < ' ' || charAt > '~') && z12) {
                    String hexString = Integer.toHexString(charAt);
                    y0Var.O("\\u");
                    for (int i12 = 0; i12 < 4 - hexString.length(); i12++) {
                        y0Var.append('0');
                    }
                    y0Var.O(hexString);
                } else {
                    y0Var.append(charAt);
                }
            } else if (i11 == 0 || z11) {
                y0Var.O("\\ ");
            } else {
                y0Var.append(charAt);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x011e, code lost:
    
        if (r7 != 3) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.badlogic.gdx.utils.l<java.lang.String, java.lang.String> r16, java.io.Reader r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.q.b(com.badlogic.gdx.utils.l, java.io.Reader):void");
    }

    public static void c(l<String, String> lVar, Writer writer, String str) throws IOException {
        d(lVar, writer, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(l<String, String> lVar, Writer writer, String str, boolean z11) throws IOException {
        if (str != null) {
            e(writer, str);
        }
        writer.write("#");
        writer.write(new Date().toString());
        writer.write("\n");
        y0 y0Var = new y0(200);
        l.a<String, String> it = lVar.g().iterator();
        while (it.hasNext()) {
            l.b next = it.next();
            a(y0Var, (String) next.f13394a, true, z11);
            y0Var.append('=');
            a(y0Var, (String) next.f13395b, false, z11);
            writer.write("\n");
            writer.write(y0Var.toString());
            y0Var.Y0(0);
        }
        writer.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r11.charAt(r4) != '!') goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.io.Writer r10, java.lang.String r11) throws java.io.IOException {
        /*
            java.lang.String r0 = "#"
            r10.write(r0)
            int r1 = r11.length()
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            java.lang.String r5 = "\n"
            if (r3 >= r1) goto L79
            char r6 = r11.charAt(r3)
            r7 = 13
            r8 = 10
            r9 = 255(0xff, float:3.57E-43)
            if (r6 > r9) goto L20
            if (r6 == r8) goto L20
            if (r6 != r7) goto L76
        L20:
            if (r4 == r3) goto L29
            java.lang.String r4 = r11.substring(r4, r3)
            r10.write(r4)
        L29:
            if (r6 <= r9) goto L49
            java.lang.String r4 = java.lang.Integer.toHexString(r6)
            java.lang.String r5 = "\\u"
            r10.write(r5)
            r5 = r2
        L35:
            int r6 = r4.length()
            int r6 = 4 - r6
            if (r5 >= r6) goto L45
            r6 = 48
            r10.write(r6)
            int r5 = r5 + 1
            goto L35
        L45:
            r10.write(r4)
            goto L74
        L49:
            r10.write(r5)
            if (r6 != r7) goto L5b
            int r4 = r1 + (-1)
            if (r3 == r4) goto L5b
            int r4 = r3 + 1
            char r5 = r11.charAt(r4)
            if (r5 != r8) goto L5b
            r3 = r4
        L5b:
            int r4 = r1 + (-1)
            if (r3 == r4) goto L71
            int r4 = r3 + 1
            char r5 = r11.charAt(r4)
            r6 = 35
            if (r5 == r6) goto L74
            char r4 = r11.charAt(r4)
            r5 = 33
            if (r4 == r5) goto L74
        L71:
            r10.write(r0)
        L74:
            int r4 = r3 + 1
        L76:
            int r3 = r3 + 1
            goto Lc
        L79:
            if (r4 == r3) goto L82
            java.lang.String r11 = r11.substring(r4, r3)
            r10.write(r11)
        L82:
            r10.write(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.q.e(java.io.Writer, java.lang.String):void");
    }
}
