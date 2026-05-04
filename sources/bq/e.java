package bq;

import com.google.zxing.FormatException;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e {
    public static final char[] A = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    public static final char[] B = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    public static final BigInteger[] C;
    public static final int D = 2;

    /* renamed from: a, reason: collision with root package name */
    public static final int f7175a = 900;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7176b = 901;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7177c = 902;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7178d = 924;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7179e = 925;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7180f = 926;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7181g = 927;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7182h = 928;

    /* renamed from: i, reason: collision with root package name */
    public static final int f7183i = 923;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7184j = 922;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7185k = 913;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7186l = 15;

    /* renamed from: m, reason: collision with root package name */
    public static final int f7187m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f7188n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f7189o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f7190p = 3;

    /* renamed from: q, reason: collision with root package name */
    public static final int f7191q = 4;

    /* renamed from: r, reason: collision with root package name */
    public static final int f7192r = 5;

    /* renamed from: s, reason: collision with root package name */
    public static final int f7193s = 6;

    /* renamed from: t, reason: collision with root package name */
    public static final int f7194t = 25;

    /* renamed from: u, reason: collision with root package name */
    public static final int f7195u = 27;

    /* renamed from: v, reason: collision with root package name */
    public static final int f7196v = 27;

    /* renamed from: w, reason: collision with root package name */
    public static final int f7197w = 28;

    /* renamed from: x, reason: collision with root package name */
    public static final int f7198x = 28;

    /* renamed from: y, reason: collision with root package name */
    public static final int f7199y = 29;

    /* renamed from: z, reason: collision with root package name */
    public static final int f7200z = 29;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7201a;

        static {
            int[] iArr = new int[b.values().length];
            f7201a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7201a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7201a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7201a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7201a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7201a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        C = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i11 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = C;
            if (i11 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i11] = bigIntegerArr2[i11 - 1].multiply(valueOf);
            i11++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x0089. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r19, int[] r20, java.nio.charset.Charset r21, int r22, java.lang.StringBuilder r23) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.e.a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kp.d b(int[] r6, java.lang.String r7) throws com.google.zxing.FormatException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = r6[r2]
            aq.c r3 = new aq.c
            r3.<init>()
            r4 = 2
        L12:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L6d
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L58
            switch(r2) {
                case 900: goto L53;
                case 901: goto L4e;
                case 902: goto L49;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 922: goto L44;
                case 923: goto L44;
                case 924: goto L4e;
                case 925: goto L41;
                case 926: goto L3e;
                case 927: goto L2d;
                case 928: goto L28;
                default: goto L21;
            }
        L21:
            int r4 = r4 + (-1)
            int r2 = g(r6, r4, r0)
            goto L60
        L28:
            int r2 = d(r6, r4, r3)
            goto L60
        L2d:
            int r2 = r4 + 1
            r1 = r6[r4]
            com.google.zxing.common.CharacterSetECI r1 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L60
        L3e:
            int r2 = r4 + 2
            goto L60
        L41:
            int r2 = r4 + 1
            goto L60
        L44:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
        L49:
            int r2 = f(r6, r4, r0)
            goto L60
        L4e:
            int r2 = a(r2, r6, r1, r4, r0)
            goto L60
        L53:
            int r2 = g(r6, r4, r0)
            goto L60
        L58:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L60:
            int r4 = r6.length
            if (r2 >= r4) goto L68
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L12
        L68:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
        L6d:
            int r6 = r0.length()
            if (r6 == 0) goto L81
            kp.d r6 = new kp.d
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.o(r3)
            return r6
        L81:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.e.b(int[], java.lang.String):kp.d");
    }

    public static String c(int[] iArr, int i11) throws FormatException {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i12 = 0; i12 < i11; i12++) {
            bigInteger = bigInteger.add(C[(i11 - i12) - 1].multiply(BigInteger.valueOf(iArr[i12])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    public static int d(int[] iArr, int i11, aq.c cVar) throws FormatException {
        if (i11 + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i12 = 0;
        while (i12 < 2) {
            iArr2[i12] = iArr[i11];
            i12++;
            i11++;
        }
        cVar.t(Integer.parseInt(c(iArr2, 2)));
        StringBuilder sb2 = new StringBuilder();
        int g11 = g(iArr, i11, sb2);
        cVar.n(sb2.toString());
        int i13 = iArr[g11] == 923 ? g11 + 1 : -1;
        while (g11 < iArr[0]) {
            int i14 = iArr[g11];
            if (i14 == 922) {
                g11++;
                cVar.q(true);
            } else {
                if (i14 != 923) {
                    throw FormatException.getFormatInstance();
                }
                switch (iArr[g11 + 1]) {
                    case 0:
                        StringBuilder sb3 = new StringBuilder();
                        g11 = g(iArr, g11 + 2, sb3);
                        cVar.o(sb3.toString());
                        break;
                    case 1:
                        StringBuilder sb4 = new StringBuilder();
                        g11 = f(iArr, g11 + 2, sb4);
                        cVar.s(Integer.parseInt(sb4.toString()));
                        break;
                    case 2:
                        StringBuilder sb5 = new StringBuilder();
                        g11 = f(iArr, g11 + 2, sb5);
                        cVar.v(Long.parseLong(sb5.toString()));
                        break;
                    case 3:
                        StringBuilder sb6 = new StringBuilder();
                        g11 = g(iArr, g11 + 2, sb6);
                        cVar.u(sb6.toString());
                        break;
                    case 4:
                        StringBuilder sb7 = new StringBuilder();
                        g11 = g(iArr, g11 + 2, sb7);
                        cVar.l(sb7.toString());
                        break;
                    case 5:
                        StringBuilder sb8 = new StringBuilder();
                        g11 = f(iArr, g11 + 2, sb8);
                        cVar.p(Long.parseLong(sb8.toString()));
                        break;
                    case 6:
                        StringBuilder sb9 = new StringBuilder();
                        g11 = f(iArr, g11 + 2, sb9);
                        cVar.m(Integer.parseInt(sb9.toString()));
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
        }
        if (i13 != -1) {
            int i15 = g11 - i13;
            if (cVar.k()) {
                i15--;
            }
            cVar.r(Arrays.copyOfRange(iArr, i13, i15 + i13));
        }
        return g11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(int[] iArr, int[] iArr2, int i11, StringBuilder sb2) {
        b bVar;
        int i12;
        b bVar2 = b.ALPHA;
        b bVar3 = bVar2;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = iArr[i13];
            char c11 = ' ';
            switch (a.f7201a[bVar2.ordinal()]) {
                case 1:
                    if (i14 < 26) {
                        i12 = i14 + 65;
                        c11 = (char) i12;
                        break;
                    } else {
                        if (i14 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i14 != 913) {
                            switch (i14) {
                                case 27:
                                    bVar2 = b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    b bVar4 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar4;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                        break;
                    }
                case 2:
                    if (i14 < 26) {
                        i12 = i14 + 97;
                        c11 = (char) i12;
                        break;
                    } else {
                        if (i14 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i14 != 913) {
                            switch (i14) {
                                case 27:
                                    bVar = b.ALPHA_SHIFT;
                                    b bVar42 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar42;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    b bVar422 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar422;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                        break;
                    }
                case 3:
                    if (i14 < 25) {
                        c11 = B[i14];
                        break;
                    } else {
                        if (i14 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i14 != 913) {
                            switch (i14) {
                                case 25:
                                    bVar2 = b.PUNCT;
                                    break;
                                case 27:
                                    bVar2 = b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = b.ALPHA;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    b bVar4222 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar4222;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                        break;
                    }
                    break;
                case 4:
                    if (i14 < 29) {
                        c11 = A[i14];
                        break;
                    } else {
                        if (i14 == 29) {
                            bVar2 = b.ALPHA;
                        } else if (i14 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i14 == 913) {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                        break;
                    }
                case 5:
                    if (i14 < 26) {
                        c11 = (char) (i14 + 65);
                    } else if (i14 != 26) {
                        bVar2 = i14 != 900 ? bVar3 : b.ALPHA;
                        c11 = 0;
                        break;
                    }
                    bVar2 = bVar3;
                    break;
                case 6:
                    if (i14 >= 29) {
                        if (i14 == 29) {
                            bVar2 = b.ALPHA;
                        } else if (i14 != 900) {
                            if (i14 == 913) {
                                sb2.append((char) iArr2[i13]);
                            }
                            c11 = 0;
                        } else {
                            bVar2 = b.ALPHA;
                        }
                        c11 = 0;
                        break;
                    } else {
                        c11 = A[i14];
                    }
                    bVar2 = bVar3;
                    break;
                default:
                    c11 = 0;
                    break;
            }
            if (c11 != 0) {
                sb2.append(c11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r10.append(c(r0, r3));
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(int[] r8, int r9, java.lang.StringBuilder r10) throws com.google.zxing.FormatException {
        /*
            r0 = 15
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            r4 = r8[r1]
            if (r9 >= r4) goto L43
            if (r2 != 0) goto L43
            int r5 = r9 + 1
            r6 = r8[r9]
            r7 = 1
            if (r5 != r4) goto L15
            r2 = r7
        L15:
            r4 = 900(0x384, float:1.261E-42)
            if (r6 >= r4) goto L1f
            r0[r3] = r6
            int r3 = r3 + 1
        L1d:
            r9 = r5
            goto L2e
        L1f:
            if (r6 == r4) goto L2d
            r4 = 901(0x385, float:1.263E-42)
            if (r6 == r4) goto L2d
            r4 = 928(0x3a0, float:1.3E-42)
            if (r6 == r4) goto L2d
            switch(r6) {
                case 922: goto L2d;
                case 923: goto L2d;
                case 924: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L1d
        L2d:
            r2 = r7
        L2e:
            int r4 = r3 % 15
            if (r4 == 0) goto L38
            r4 = 902(0x386, float:1.264E-42)
            if (r6 == r4) goto L38
            if (r2 == 0) goto L7
        L38:
            if (r3 <= 0) goto L7
            java.lang.String r3 = c(r0, r3)
            r10.append(r3)
            r3 = r1
            goto L7
        L43:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.e.f(int[], int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0036. Please report as an issue. */
    public static int g(int[] iArr, int i11, StringBuilder sb2) {
        int i12 = iArr[0];
        int[] iArr2 = new int[(i12 - i11) << 1];
        int[] iArr3 = new int[(i12 - i11) << 1];
        boolean z11 = false;
        int i13 = 0;
        while (i11 < iArr[0] && !z11) {
            int i14 = i11 + 1;
            int i15 = iArr[i11];
            if (i15 < 900) {
                iArr2[i13] = i15 / 30;
                iArr2[i13 + 1] = i15 % 30;
                i13 += 2;
            } else if (i15 != 913) {
                if (i15 != 928) {
                    switch (i15) {
                        case 900:
                            iArr2[i13] = 900;
                            i13++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i15) {
                            }
                    }
                }
                z11 = true;
            } else {
                iArr2[i13] = 913;
                i11 += 2;
                iArr3[i13] = iArr[i14];
                i13++;
            }
            i11 = i14;
        }
        e(iArr2, iArr3, i13, sb2);
        return i11;
    }
}
