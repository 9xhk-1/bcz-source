package com.meizu.cloud.pushsdk.c.c;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u30.u0;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f39541a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private final String f39542b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39543c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39544d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39545e;

    /* renamed from: f, reason: collision with root package name */
    private final int f39546f;

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f39547g;

    /* renamed from: h, reason: collision with root package name */
    private final List<String> f39548h;

    /* renamed from: i, reason: collision with root package name */
    private final String f39549i;

    /* renamed from: j, reason: collision with root package name */
    private final String f39550j;

    /* renamed from: com.meizu.cloud.pushsdk.c.c.f$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39551a;

        static {
            int[] iArr = new int[a.EnumC0475a.values().length];
            f39551a = iArr;
            try {
                iArr[a.EnumC0475a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39551a[a.EnumC0475a.INVALID_HOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39551a[a.EnumC0475a.UNSUPPORTED_SCHEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39551a[a.EnumC0475a.MISSING_SCHEME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39551a[a.EnumC0475a.INVALID_PORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f39552a;

        /* renamed from: d, reason: collision with root package name */
        String f39555d;

        /* renamed from: f, reason: collision with root package name */
        final List<String> f39557f;

        /* renamed from: g, reason: collision with root package name */
        List<String> f39558g;

        /* renamed from: h, reason: collision with root package name */
        String f39559h;

        /* renamed from: b, reason: collision with root package name */
        String f39553b = "";

        /* renamed from: c, reason: collision with root package name */
        String f39554c = "";

        /* renamed from: e, reason: collision with root package name */
        int f39556e = -1;

        /* renamed from: com.meizu.cloud.pushsdk.c.c.f$a$a, reason: collision with other inner class name */
        public enum EnumC0475a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f39557f = arrayList;
            arrayList.add("");
        }

        private static int b(String str, int i11, int i12) {
            if (i12 - i11 < 2) {
                return -1;
            }
            char charAt = str.charAt(i11);
            boolean z11 = charAt < 'a' || charAt > 'z';
            boolean z12 = charAt < 'A' || charAt > 'Z';
            if (z11 && z12) {
                return -1;
            }
            for (int i13 = i11 + 1; i13 < i12; i13++) {
                char charAt2 = str.charAt(i13);
                if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                    if (charAt2 == ':') {
                        return i13;
                    }
                    return -1;
                }
            }
            return -1;
        }

        private static int c(String str, int i11, int i12) {
            int i13 = 0;
            while (i11 < i12) {
                char charAt = str.charAt(i11);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i13++;
                i11++;
            }
            return i13;
        }

        private static int d(String str, int i11, int i12) {
            while (i11 < i12) {
                char charAt = str.charAt(i11);
                if (charAt == ':') {
                    return i11;
                }
                if (charAt == '[') {
                    do {
                        i11++;
                        if (i11 < i12) {
                        }
                    } while (str.charAt(i11) != ']');
                }
                i11++;
            }
            return i12;
        }

        private static String e(String str, int i11, int i12) {
            String b11 = f.b(str, i11, i12, false);
            if (!b11.contains(":")) {
                return m.a(b11);
            }
            InetAddress f11 = (b11.startsWith("[") && b11.endsWith("]")) ? f(b11, 1, b11.length() - 1) : f(b11, 0, b11.length());
            if (f11 == null) {
                return null;
            }
            byte[] address = f11.getAddress();
            if (address.length == 16) {
                return a(address);
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.net.InetAddress f(java.lang.String r12, int r13, int r14) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = 0
                r3 = -1
                r4 = r2
                r5 = r3
                r6 = r5
            L9:
                r7 = 0
                if (r13 >= r14) goto L79
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r13 + 2
                r9 = 2
                if (r8 > r14) goto L27
                java.lang.String r10 = "::"
                boolean r10 = r12.regionMatches(r13, r10, r2, r9)
                if (r10 == 0) goto L27
                if (r5 == r3) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r14) goto L25
                goto L79
            L25:
                r6 = r8
                goto L4b
            L27:
                if (r4 == 0) goto L34
                java.lang.String r8 = ":"
                r10 = 1
                boolean r8 = r12.regionMatches(r13, r8, r2, r10)
                if (r8 == 0) goto L36
                int r13 = r13 + 1
            L34:
                r6 = r13
                goto L4b
            L36:
                java.lang.String r8 = "."
                boolean r13 = r12.regionMatches(r13, r8, r2, r10)
                if (r13 == 0) goto L4a
                int r13 = r4 + (-2)
                boolean r12 = a(r12, r6, r14, r1, r13)
                if (r12 != 0) goto L47
                return r7
            L47:
                int r4 = r4 + 2
                goto L79
            L4a:
                return r7
            L4b:
                r8 = r2
                r13 = r6
            L4d:
                if (r13 >= r14) goto L60
                char r10 = r12.charAt(r13)
                int r10 = com.meizu.cloud.pushsdk.c.c.f.a(r10)
                if (r10 != r3) goto L5a
                goto L60
            L5a:
                int r8 = r8 << 4
                int r8 = r8 + r10
                int r13 = r13 + 1
                goto L4d
            L60:
                int r10 = r13 - r6
                if (r10 == 0) goto L78
                r11 = 4
                if (r10 <= r11) goto L68
                goto L78
            L68:
                int r7 = r4 + 1
                int r10 = r8 >>> 8
                r10 = r10 & 255(0xff, float:3.57E-43)
                byte r10 = (byte) r10
                r1[r4] = r10
                int r4 = r4 + r9
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L78:
                return r7
            L79:
                if (r4 == r0) goto L8a
                if (r5 != r3) goto L7e
                return r7
            L7e:
                int r12 = r4 - r5
                int r13 = 16 - r12
                java.lang.System.arraycopy(r1, r5, r1, r13, r12)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r2)
            L8a:
                java.net.InetAddress r12 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L8f
                return r12
            L8f:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.c.c.f.a.f(java.lang.String, int, int):java.net.InetAddress");
        }

        private static int g(String str, int i11, int i12) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(f.b(str, i11, i12, "", false, false, false, true));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        public int a() {
            int i11 = this.f39556e;
            return i11 != -1 ? i11 : f.a(this.f39552a);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f39552a);
            sb2.append("://");
            if (!this.f39553b.isEmpty() || !this.f39554c.isEmpty()) {
                sb2.append(this.f39553b);
                if (!this.f39554c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f39554c);
                }
                sb2.append('@');
            }
            if (this.f39555d.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.f39555d);
                sb2.append(l50.b.f69930l);
            } else {
                sb2.append(this.f39555d);
            }
            int a11 = a();
            if (a11 != f.a(this.f39552a)) {
                sb2.append(':');
                sb2.append(a11);
            }
            f.a(sb2, this.f39557f);
            if (this.f39558g != null) {
                sb2.append(s60.d.f88057a);
                f.b(sb2, this.f39558g);
            }
            if (this.f39559h != null) {
                sb2.append('#');
                sb2.append(this.f39559h);
            }
            return sb2.toString();
        }

        private void c() {
            if (!this.f39557f.remove(r0.size() - 1).isEmpty() || this.f39557f.isEmpty()) {
                this.f39557f.add("");
            } else {
                this.f39557f.set(r0.size() - 1, "");
            }
        }

        public EnumC0475a a(f fVar, String str) {
            String str2 = str;
            int a11 = m.a(str2, 0, str2.length());
            int b11 = m.b(str2, a11, str2.length());
            if (b(str2, a11, b11) != -1) {
                if (str2.regionMatches(true, a11, "https:", 0, 6)) {
                    this.f39552a = "https";
                    a11 += 6;
                    str2 = str;
                } else {
                    str2 = str;
                    if (!str2.regionMatches(true, a11, "http:", 0, 5)) {
                        return EnumC0475a.UNSUPPORTED_SCHEME;
                    }
                    this.f39552a = "http";
                    a11 += 5;
                }
            } else {
                if (fVar == null) {
                    return EnumC0475a.MISSING_SCHEME;
                }
                this.f39552a = fVar.f39542b;
            }
            int c11 = c(str2, a11, b11);
            char c12 = '#';
            if (c11 >= 2 || fVar == null || !fVar.f39542b.equals(this.f39552a)) {
                int i11 = a11 + c11;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    a11 = m.a(str2, i11, b11, "@/\\?#");
                    char charAt = a11 != b11 ? str2.charAt(a11) : (char) 65535;
                    if (charAt == 65535 || charAt == c12 || charAt == '/' || charAt == '\\' || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z11) {
                            str2 = str;
                            this.f39554c += "%40" + f.b(str2, i11, a11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        } else {
                            int a12 = m.a(str2, i11, a11, ':');
                            String b12 = f.b(str2, i11, a12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            if (z12) {
                                b12 = this.f39553b + "%40" + b12;
                            }
                            this.f39553b = b12;
                            if (a12 != a11) {
                                a11 = a11;
                                this.f39554c = f.b(str, a12 + 1, a11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                z11 = true;
                            } else {
                                a11 = a11;
                            }
                            str2 = str;
                            z12 = true;
                        }
                        i11 = a11 + 1;
                    }
                    c12 = '#';
                }
                int d11 = d(str2, i11, a11);
                int i12 = d11 + 1;
                this.f39555d = e(str2, i11, d11);
                if (i12 < a11) {
                    int g11 = g(str2, i12, a11);
                    this.f39556e = g11;
                    if (g11 == -1) {
                        return EnumC0475a.INVALID_PORT;
                    }
                } else {
                    this.f39556e = f.a(this.f39552a);
                }
                if (this.f39555d == null) {
                    return EnumC0475a.INVALID_HOST;
                }
            } else {
                this.f39553b = fVar.a();
                this.f39554c = fVar.b();
                this.f39555d = fVar.f39545e;
                this.f39556e = fVar.f39546f;
                this.f39557f.clear();
                this.f39557f.addAll(fVar.c());
                if (a11 == b11 || str2.charAt(a11) == '#') {
                    a(fVar.d());
                }
            }
            int a13 = m.a(str2, a11, b11, "?#");
            a(str2, a11, a13);
            if (a13 < b11 && str2.charAt(a13) == '?') {
                int a14 = m.a(str2, a13, b11, '#');
                this.f39558g = f.b(f.b(str2, a13 + 1, a14, okhttp3.i.f77290q, true, false, true, true));
                a13 = a14;
            }
            if (a13 < b11 && str2.charAt(a13) == '#') {
                this.f39559h = f.b(str2, a13 + 1, b11, "", true, false, false, false);
            }
            return EnumC0475a.SUCCESS;
        }

        public f b() {
            if (this.f39552a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f39555d != null) {
                return new f(this, null);
            }
            throw new IllegalStateException("host == null");
        }

        private boolean b(String str) {
            return ".".equals(str) || "%2e".equalsIgnoreCase(str);
        }

        private boolean c(String str) {
            return zr.m.f102856e.equals(str) || "%2e.".equalsIgnoreCase(str) || ".%2e".equalsIgnoreCase(str) || "%2e%2e".equalsIgnoreCase(str);
        }

        public a a(String str) {
            this.f39558g = str != null ? f.b(f.a(str, okhttp3.i.f77290q, true, false, true, true)) : null;
            return this;
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (this.f39558g == null) {
                this.f39558g = new ArrayList();
            }
            this.f39558g.add(f.a(str, okhttp3.i.f77291r, false, false, true, true));
            this.f39558g.add(str2 != null ? f.a(str2, okhttp3.i.f77291r, false, false, true, true) : null);
            return this;
        }

        private static String a(byte[] bArr) {
            int i11 = -1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i13 < bArr.length) {
                int i15 = i13;
                while (i15 < 16 && bArr[i15] == 0 && bArr[i15 + 1] == 0) {
                    i15 += 2;
                }
                int i16 = i15 - i13;
                if (i16 > i14) {
                    i11 = i13;
                    i14 = i16;
                }
                i13 = i15 + 2;
            }
            com.meizu.cloud.pushsdk.c.g.b bVar = new com.meizu.cloud.pushsdk.c.g.b();
            while (i12 < bArr.length) {
                if (i12 == i11) {
                    bVar.b(58);
                    i12 += i14;
                    if (i12 == 16) {
                        bVar.b(58);
                    }
                } else {
                    if (i12 > 0) {
                        bVar.b(58);
                    }
                    bVar.d(((bArr[i12] & 255) << 8) | (bArr[i12 + 1] & 255));
                    i12 += 2;
                }
            }
            return bVar.h();
        }

        private void a(String str, int i11, int i12) {
            if (i11 == i12) {
                return;
            }
            char charAt = str.charAt(i11);
            if (charAt == '/' || charAt == '\\') {
                this.f39557f.clear();
                this.f39557f.add("");
                i11++;
            } else {
                List<String> list = this.f39557f;
                list.set(list.size() - 1, "");
            }
            int i13 = i11;
            while (i13 < i12) {
                int a11 = m.a(str, i13, i12, "/\\");
                boolean z11 = a11 < i12;
                String str2 = str;
                a(str2, i13, a11, z11, true);
                if (z11) {
                    a11++;
                }
                i13 = a11;
                str = str2;
            }
        }

        private void a(String str, int i11, int i12, boolean z11, boolean z12) {
            String b11 = f.b(str, i11, i12, okhttp3.i.f77288o, z12, false, false, true);
            if (b(b11)) {
                return;
            }
            if (c(b11)) {
                c();
                return;
            }
            if (this.f39557f.get(r10.size() - 1).isEmpty()) {
                this.f39557f.set(r10.size() - 1, b11);
            } else {
                this.f39557f.add(b11);
            }
            if (z11) {
                this.f39557f.add("");
            }
        }

        private static boolean a(String str, int i11, int i12, byte[] bArr, int i13) {
            int i14 = i13;
            while (i11 < i12) {
                if (i14 == bArr.length) {
                    return false;
                }
                if (i14 != i13) {
                    if (str.charAt(i11) != '.') {
                        return false;
                    }
                    i11++;
                }
                int i15 = i11;
                int i16 = 0;
                while (i15 < i12) {
                    char charAt = str.charAt(i15);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    if ((i16 == 0 && i11 != i15) || (i16 = ((i16 * 10) + charAt) - 48) > 255) {
                        return false;
                    }
                    i15++;
                }
                if (i15 - i11 == 0) {
                    return false;
                }
                bArr[i14] = (byte) i16;
                i14++;
                i11 = i15;
            }
            return i14 == i13 + 4;
        }
    }

    private f(a aVar) {
        this.f39542b = aVar.f39552a;
        this.f39543c = a(aVar.f39553b, false);
        this.f39544d = a(aVar.f39554c, false);
        this.f39545e = aVar.f39555d;
        this.f39546f = aVar.a();
        this.f39547g = a(aVar.f39557f, false);
        List<String> list = aVar.f39558g;
        this.f39548h = list != null ? a(list, true) : null;
        String str = aVar.f39559h;
        this.f39549i = str != null ? a(str, false) : null;
        this.f39550j = aVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(char c11) {
        if (c11 >= '0' && c11 <= '9') {
            return c11 - '0';
        }
        if (c11 >= 'a' && c11 <= 'f') {
            return c11 - 'W';
        }
        if (c11 < 'A' || c11 > 'F') {
            return -1;
        }
        return c11 - '7';
    }

    public String d() {
        if (this.f39548h == null) {
            return null;
        }
        int indexOf = this.f39550j.indexOf(63);
        int i11 = indexOf + 1;
        String str = this.f39550j;
        return this.f39550j.substring(i11, m.a(str, indexOf + 2, str.length(), '#'));
    }

    public String e() {
        if (this.f39549i == null) {
            return null;
        }
        return this.f39550j.substring(this.f39550j.indexOf(35) + 1);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && ((f) obj).f39550j.equals(this.f39550j);
    }

    public a f() {
        a aVar = new a();
        aVar.f39552a = this.f39542b;
        aVar.f39553b = a();
        aVar.f39554c = b();
        aVar.f39555d = this.f39545e;
        aVar.f39556e = this.f39546f != a(this.f39542b) ? this.f39546f : -1;
        aVar.f39557f.clear();
        aVar.f39557f.addAll(c());
        aVar.a(d());
        aVar.f39559h = e();
        return aVar;
    }

    public int hashCode() {
        return this.f39550j.hashCode();
    }

    public String toString() {
        return this.f39550j;
    }

    public /* synthetic */ f(a aVar, AnonymousClass1 anonymousClass1) {
        this(aVar);
    }

    public static int a(String str) {
        if ("http".equals(str)) {
            return 80;
        }
        return "https".equals(str) ? 443 : -1;
    }

    public static f c(String str) {
        a aVar = new a();
        if (aVar.a((f) null, str) == a.EnumC0475a.SUCCESS) {
            return aVar.b();
        }
        return null;
    }

    public String b() {
        if (this.f39544d.isEmpty()) {
            return "";
        }
        return this.f39550j.substring(this.f39550j.indexOf(58, this.f39542b.length() + 3) + 1, this.f39550j.indexOf(64));
    }

    public String a() {
        if (this.f39543c.isEmpty()) {
            return "";
        }
        int length = this.f39542b.length() + 3;
        String str = this.f39550j;
        return this.f39550j.substring(length, m.a(str, length, str.length(), ":@"));
    }

    public List<String> c() {
        int indexOf = this.f39550j.indexOf(47, this.f39542b.length() + 3);
        String str = this.f39550j;
        int a11 = m.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a11) {
            int i11 = indexOf + 1;
            int a12 = m.a(this.f39550j, i11, a11, '/');
            arrayList.add(this.f39550j.substring(i11, a12));
            indexOf = a12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, int i11, int i12, String str2, boolean z11, boolean z12, boolean z13, boolean z14) {
        int i13 = i11;
        while (i13 < i12) {
            int codePointAt = str.codePointAt(i13);
            int i14 = i13;
            if (a(codePointAt, i13, str, i12, str2, z11, z12, z13, z14)) {
                com.meizu.cloud.pushsdk.c.g.b bVar = new com.meizu.cloud.pushsdk.c.g.b();
                bVar.a(str, i11, i14);
                a(bVar, str, i14, i12, str2, z11, z12, z13, z14);
                return bVar.h();
            }
            i13 = i14 + Character.charCount(codePointAt);
        }
        return str.substring(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, int i11, int i12, boolean z11) {
        for (int i13 = i11; i13 < i12; i13++) {
            char charAt = str.charAt(i13);
            boolean z12 = false;
            boolean z13 = charAt == '%';
            if (charAt == '+' && z11) {
                z12 = true;
            }
            if (z13 || z12) {
                com.meizu.cloud.pushsdk.c.g.b bVar = new com.meizu.cloud.pushsdk.c.g.b();
                bVar.a(str, i11, i13);
                a(bVar, str, i13, i12, z11);
                return bVar.h();
            }
        }
        return str.substring(i11, i12);
    }

    public static List<String> b(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 <= str.length()) {
            int indexOf = str.indexOf(38, i11);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i11);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i11, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i11, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i11 = indexOf + 1;
        }
        return arrayList;
    }

    public static String a(String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14) {
        return b(str, 0, str.length(), str2, z11, z12, z13, z14);
    }

    public static void b(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11 += 2) {
            String str = list.get(i11);
            String str2 = list.get(i11 + 1);
            if (i11 > 0) {
                sb2.append(u0.f91708d);
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    public static String a(String str, boolean z11) {
        return b(str, 0, str.length(), z11);
    }

    private List<String> a(List<String> list, boolean z11) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? a(next, z11) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(com.meizu.cloud.pushsdk.c.g.b bVar, String str, int i11, int i12, String str2, boolean z11, boolean z12, boolean z13, boolean z14) {
        com.meizu.cloud.pushsdk.c.g.b bVar2 = null;
        int i13 = i11;
        while (i13 < i12) {
            int codePointAt = str.codePointAt(i13);
            if (codePointAt == 43 && z13) {
                bVar.b(z11 ? "+" : "%2B");
            } else if (a(codePointAt, i13, str, i12, str2, z11, z12, z13, z14)) {
                if (bVar2 == null) {
                    bVar2 = new com.meizu.cloud.pushsdk.c.g.b();
                }
                bVar2.a(codePointAt);
                while (!bVar2.c()) {
                    byte f11 = bVar2.f();
                    bVar.b(37);
                    char[] cArr = f39541a;
                    bVar.b((int) cArr[((f11 & 255) >> 4) & 15]);
                    bVar.b((int) cArr[f11 & 15]);
                }
            } else {
                bVar.a(codePointAt);
            }
            i13 += Character.charCount(codePointAt);
        }
    }

    private static void a(com.meizu.cloud.pushsdk.c.g.b bVar, String str, int i11, int i12, boolean z11) {
        int i13;
        while (i11 < i12) {
            int codePointAt = str.codePointAt(i11);
            if (codePointAt != 37 || (i13 = i11 + 2) >= i12) {
                if (codePointAt == 43 && z11) {
                    bVar.b(32);
                }
                bVar.a(codePointAt);
            } else {
                int b11 = b(str.charAt(i11 + 1));
                int b12 = b(str.charAt(i13));
                if (b11 != -1 && b12 != -1) {
                    bVar.b((b11 << 4) + b12);
                    i11 = i13;
                }
                bVar.a(codePointAt);
            }
            i11 += Character.charCount(codePointAt);
        }
    }

    public static void a(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append('/');
            sb2.append(list.get(i11));
        }
    }

    private static boolean a(int i11, int i12, String str, int i13, String str2, boolean z11, boolean z12, boolean z13, boolean z14) {
        if (i11 < 32 || i11 == 127) {
            return true;
        }
        if ((i11 >= 128 && z14) || str2.indexOf(i11) != -1) {
            return true;
        }
        boolean z15 = !z11 || (z12 && !a(str, i12, i13));
        if (i11 == 37 && z15) {
            return true;
        }
        return i11 == 43 && z13;
    }

    private static boolean a(String str, int i11, int i12) {
        int i13 = i11 + 2;
        return i13 < i12 && str.charAt(i11) == '%' && b(str.charAt(i11 + 1)) != -1 && b(str.charAt(i13)) != -1;
    }
}
