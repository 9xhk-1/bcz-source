package com.igexin.push.d.a;

import com.baicizhan.main.vld.bonding.j;
import com.heytap.mcssdk.constant.IntentConstant;
import com.igexin.c.a.b.a.a.h;
import com.igexin.c.a.b.d;
import com.igexin.c.a.b.g;
import com.igexin.push.d.c.e;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38389a = "com.igexin.push.d.a.c";

    /* renamed from: b, reason: collision with root package name */
    public static int f38390b = -1;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f38391g;

    private c(String str) {
        super(str, (byte) 0);
    }

    private static byte a(h hVar) throws IOException {
        return (byte) b(hVar, 1);
    }

    private static int b(h hVar, int i11) throws IOException {
        byte[] a11 = a(hVar, i11);
        if (i11 == 1) {
            return a11[0] & 255;
        }
        if (i11 == 2) {
            return g.a(a11, 0);
        }
        if (i11 == 4) {
            return g.c(a11, 0);
        }
        return 0;
    }

    private static int c(h hVar) throws IOException {
        return b(hVar, 4);
    }

    public static d a() {
        c cVar = new c("socketProtocol");
        new a(IntentConstant.COMMAND, cVar);
        return cVar;
    }

    private Object b(h hVar, e eVar) throws Exception {
        byte b11;
        if (eVar.f38454i == 48 && (b11 = (byte) b(hVar, 1)) > 0) {
            this.f38391g = a(hVar, b11);
        }
        if (eVar.f38451f == 0) {
            com.igexin.push.d.c.a aVar = new com.igexin.push.d.c.a();
            aVar.f38411f = eVar.f38449d;
            aVar.f38407b = (byte) 0;
            return aVar;
        }
        byte[] a11 = a(hVar, 3);
        short a12 = g.a(a11, 0);
        int i11 = a11[2] & 255;
        com.igexin.push.d.c.a aVar2 = new com.igexin.push.d.c.a();
        aVar2.f38406a = a12;
        aVar2.f38407b = (byte) i11;
        aVar2.f38411f = eVar.f38449d;
        if (i11 != 26) {
            com.igexin.c.a.c.a.a(f38389a, "decodeRC4, cmd != MsgFormatedReceive.COMMAND, return");
            return null;
        }
        if (a12 > 0) {
            byte[] a13 = a(hVar, a12);
            if (eVar.f38454i == 48) {
                byte[] bArr = this.f38391g;
                a13 = com.igexin.c.a.a.a.a(a13, bArr == null ? com.igexin.c.a.b.e.a().f37159f : com.igexin.c.b.a.a(bArr));
            }
            byte b12 = eVar.f38453h;
            if (b12 == Byte.MIN_VALUE) {
                a13 = g.b(a13);
            } else if (b12 != 0) {
                return null;
            }
            aVar2.a(a13);
        }
        return aVar2;
    }

    private static e a(com.igexin.push.d.c.a aVar) {
        e eVar = new e();
        eVar.f38447b = e.f38446a;
        eVar.a(aVar.f38408c);
        eVar.f38451f = aVar.f38407b > 0 ? 1 : 0;
        eVar.f38449d = 7;
        eVar.f38448c = 11;
        eVar.f38452g = aVar.f38409d;
        int length = 11 + com.igexin.push.g.g.c().length;
        eVar.f38448c = length;
        if (aVar.f38406a <= 0) {
            if (eVar.f38454i == 0) {
                eVar.f38461p = 0;
            }
            com.igexin.c.a.b.e.c();
            return eVar;
        }
        eVar.f38462q = com.igexin.push.g.g.e();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        eVar.f38463r = currentTimeMillis;
        byte[] a11 = com.igexin.push.g.g.a(aVar, eVar.f38462q, currentTimeMillis);
        eVar.f38460o = a11;
        int length2 = a11.length;
        eVar.f38461p = length2;
        length = eVar.f38448c + length2;
        eVar.f38448c = length;
        com.igexin.c.a.b.e.c();
        return eVar;
    }

    @Override // com.igexin.c.a.b.d
    public final Object b(Object obj) throws Exception {
        com.igexin.push.d.c.a aVar;
        byte b11;
        h hVar = obj instanceof h ? (h) obj : null;
        if (hVar == null) {
            String str = f38389a;
            com.igexin.c.a.c.a.a(str, "syncIns is null");
            com.igexin.c.a.c.a.a(str + "|syncIns is null", new Object[0]);
            return null;
        }
        byte[] a11 = a(hVar, 8);
        if (g.c(a11, 0) != 1944742139) {
            return null;
        }
        e eVar = new e();
        eVar.f38448c = a11[4] & 255;
        eVar.f38449d = a11[5] & 255;
        eVar.a(a11[6]);
        eVar.f38451f = a11[7] & 255;
        int i11 = eVar.f38449d;
        if (i11 == 7) {
            if (eVar.f38454i == 48) {
                com.igexin.c.a.c.a.a(f38389a, "decodeAes, encryptType = 0x30, return");
                return null;
            }
            byte b12 = (byte) b(hVar, 1);
            if (b12 > 0) {
                a(hVar, b12);
            }
            eVar.f38452g = (byte) b(hVar, 1);
            byte b13 = (byte) b(hVar, 1);
            eVar.f38461p = b13;
            if (b13 > 0) {
                eVar.f38460o = a(hVar, b13);
            }
            if (eVar.f38451f != 0) {
                byte[] a12 = a(hVar, 11);
                int c11 = g.c(a12, 0);
                if (c11 <= f38390b) {
                    f38390b = -1;
                    throw new Exception("server packetId can't be less than previous");
                }
                f38390b = c11;
                int c12 = g.c(a12, 4);
                short a13 = g.a(a12, 8);
                int i12 = a12[10] & 255;
                com.igexin.push.d.c.a aVar2 = new com.igexin.push.d.c.a();
                aVar2.f38406a = a13;
                aVar2.f38407b = (byte) i12;
                aVar2.f38411f = eVar.f38449d;
                aVar2.f38412g = eVar.f38454i;
                if (a13 > 0) {
                    byte[] a14 = a(hVar, a13);
                    byte b14 = eVar.f38454i;
                    if (b14 == 16) {
                        a14 = com.igexin.push.g.g.d(a14, com.igexin.push.g.g.b(g.b(c12)));
                    } else if (b14 == 32) {
                        if (i12 != 26) {
                            return null;
                        }
                        com.igexin.c.a.c.a.a(f38389a, "decodeAes, encryptType = 0x20, special");
                        a14 = com.igexin.push.g.g.e(a14, g.b(c12));
                    } else if (b14 != 0) {
                        return null;
                    }
                    byte b15 = eVar.f38453h;
                    if (b15 == Byte.MIN_VALUE) {
                        a14 = g.b(a14);
                    } else if (b15 != 0) {
                        return null;
                    }
                    aVar2.a(a14);
                    if (!Arrays.equals(eVar.f38460o, com.igexin.push.g.g.a(aVar2, c11, c12))) {
                        String str2 = f38389a;
                        com.igexin.c.a.c.a.a(str2, "decode signature error!!!!");
                        com.igexin.c.a.c.a.a(str2 + "|decode signature error!!!!", new Object[0]);
                        return null;
                    }
                } else if (a13 < 0) {
                    String str3 = f38389a;
                    com.igexin.c.a.c.a.a(str3, "data len < 0, error");
                    com.igexin.c.a.c.a.a(str3 + "|data len < 0, error", new Object[0]);
                    return null;
                }
                return aVar2;
            }
            aVar = new com.igexin.push.d.c.a();
        } else {
            if (i11 != 1) {
                String str4 = f38389a;
                com.igexin.c.a.c.a.a(str4, "server socket resp version = " + eVar.f38449d + ", not support!!!");
                com.igexin.c.a.c.a.a(str4 + "|server socket resp version = " + eVar.f38449d + ", not support !!!", new Object[0]);
                return null;
            }
            if (eVar.f38454i == 48 && (b11 = (byte) b(hVar, 1)) > 0) {
                this.f38391g = a(hVar, b11);
            }
            if (eVar.f38451f != 0) {
                byte[] a15 = a(hVar, 3);
                short a16 = g.a(a15, 0);
                int i13 = a15[2] & 255;
                com.igexin.push.d.c.a aVar3 = new com.igexin.push.d.c.a();
                aVar3.f38406a = a16;
                aVar3.f38407b = (byte) i13;
                aVar3.f38411f = eVar.f38449d;
                if (i13 != 26) {
                    com.igexin.c.a.c.a.a(f38389a, "decodeRC4, cmd != MsgFormatedReceive.COMMAND, return");
                    return null;
                }
                if (a16 > 0) {
                    byte[] a17 = a(hVar, a16);
                    if (eVar.f38454i == 48) {
                        byte[] bArr = this.f38391g;
                        a17 = com.igexin.c.a.a.a.a(a17, bArr == null ? com.igexin.c.a.b.e.a().f37159f : com.igexin.c.b.a.a(bArr));
                    }
                    byte b16 = eVar.f38453h;
                    if (b16 == Byte.MIN_VALUE) {
                        a17 = g.b(a17);
                    } else if (b16 != 0) {
                        return null;
                    }
                    aVar3.a(a17);
                }
                return aVar3;
            }
            aVar = new com.igexin.push.d.c.a();
        }
        aVar.f38411f = eVar.f38449d;
        aVar.f38407b = (byte) 0;
        return aVar;
    }

    private static Object a(h hVar, e eVar) throws Exception {
        if (eVar.f38454i == 48) {
            com.igexin.c.a.c.a.a(f38389a, "decodeAes, encryptType = 0x30, return");
            return null;
        }
        byte b11 = (byte) b(hVar, 1);
        if (b11 > 0) {
            a(hVar, b11);
        }
        eVar.f38452g = (byte) b(hVar, 1);
        byte b12 = (byte) b(hVar, 1);
        eVar.f38461p = b12;
        if (b12 > 0) {
            eVar.f38460o = a(hVar, b12);
        }
        if (eVar.f38451f == 0) {
            com.igexin.push.d.c.a aVar = new com.igexin.push.d.c.a();
            aVar.f38411f = eVar.f38449d;
            aVar.f38407b = (byte) 0;
            return aVar;
        }
        byte[] a11 = a(hVar, 11);
        int c11 = g.c(a11, 0);
        if (c11 <= f38390b) {
            f38390b = -1;
            throw new Exception("server packetId can't be less than previous");
        }
        f38390b = c11;
        int c12 = g.c(a11, 4);
        short a12 = g.a(a11, 8);
        int i11 = a11[10] & 255;
        com.igexin.push.d.c.a aVar2 = new com.igexin.push.d.c.a();
        aVar2.f38406a = a12;
        aVar2.f38407b = (byte) i11;
        aVar2.f38411f = eVar.f38449d;
        aVar2.f38412g = eVar.f38454i;
        if (a12 > 0) {
            byte[] a13 = a(hVar, a12);
            byte b13 = eVar.f38454i;
            if (b13 == 16) {
                a13 = com.igexin.push.g.g.d(a13, com.igexin.push.g.g.b(g.b(c12)));
            } else if (b13 == 32) {
                if (i11 != 26) {
                    return null;
                }
                com.igexin.c.a.c.a.a(f38389a, "decodeAes, encryptType = 0x20, special");
                a13 = com.igexin.push.g.g.e(a13, g.b(c12));
            } else if (b13 != 0) {
                return null;
            }
            byte b14 = eVar.f38453h;
            if (b14 == Byte.MIN_VALUE) {
                a13 = g.b(a13);
            } else if (b14 != 0) {
                return null;
            }
            aVar2.a(a13);
            if (!Arrays.equals(eVar.f38460o, com.igexin.push.g.g.a(aVar2, c11, c12))) {
                String str = f38389a;
                com.igexin.c.a.c.a.a(str, "decode signature error!!!!");
                com.igexin.c.a.c.a.a(str + "|decode signature error!!!!", new Object[0]);
                return null;
            }
        } else if (a12 < 0) {
            String str2 = f38389a;
            com.igexin.c.a.c.a.a(str2, "data len < 0, error");
            com.igexin.c.a.c.a.a(str2 + "|data len < 0, error", new Object[0]);
            return null;
        }
        return aVar2;
    }

    private static short b(h hVar) throws IOException {
        return (short) b(hVar, 2);
    }

    @Override // com.igexin.c.a.b.d
    public final Object a(Object obj) throws Exception {
        int i11;
        byte[] bArr = null;
        if (obj instanceof com.igexin.push.d.c.a) {
            com.igexin.push.d.c.a aVar = (com.igexin.push.d.c.a) obj;
            e eVar = new e();
            eVar.f38447b = e.f38446a;
            eVar.a(aVar.f38408c);
            eVar.f38451f = aVar.f38407b > 0 ? 1 : 0;
            eVar.f38449d = 7;
            eVar.f38448c = 11;
            eVar.f38452g = aVar.f38409d;
            int length = com.igexin.push.g.g.c().length + 11;
            eVar.f38448c = length;
            if (aVar.f38406a > 0) {
                eVar.f38462q = com.igexin.push.g.g.e();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                eVar.f38463r = currentTimeMillis;
                byte[] a11 = com.igexin.push.g.g.a(aVar, eVar.f38462q, currentTimeMillis);
                eVar.f38460o = a11;
                int length2 = a11.length;
                eVar.f38461p = length2;
                eVar.f38448c += length2;
            } else if (eVar.f38454i == 0) {
                eVar.f38461p = 0;
                eVar.f38448c = length;
            }
            com.igexin.c.a.b.e.c();
            if (aVar.f38407b > 0 && aVar.f38406a > 0) {
                if ((eVar.f38453h & j.f25378c) == 128) {
                    aVar.a(g.a(aVar.f38410e));
                }
                byte b11 = eVar.f38454i;
                if ((b11 & 48) == 16) {
                    byte[] b12 = com.igexin.push.g.g.b(g.b(eVar.f38463r));
                    if ((eVar.f38452g & 16) != 16) {
                        aVar.a(com.igexin.push.g.g.c(aVar.f38410e, b12));
                    }
                } else if ((b11 & 48) != 0) {
                    if ((b11 & 48) == 48) {
                        String str = f38389a;
                        com.igexin.c.a.c.a.a(str, "encry type = 0x30 not support");
                        com.igexin.c.a.c.a.a(str + "|encry type = 0x30 not support", new Object[0]);
                        return null;
                    }
                    if ((b11 & 48) != 32) {
                        String str2 = f38389a;
                        com.igexin.c.a.c.a.a(str2, "encry type = " + (eVar.f38454i & 48) + " not support");
                        com.igexin.c.a.c.a.a(str2 + "|encry type = " + (eVar.f38454i & 48) + " not support", new Object[0]);
                        return null;
                    }
                    String str3 = f38389a;
                    com.igexin.c.a.c.a.a(str3, "encry type = 0x20 reserved");
                    com.igexin.c.a.c.a.a(str3 + "|encry type = 0x20 reserved", new Object[0]);
                }
            }
            bArr = new byte[eVar.f38448c + (aVar.f38407b > 0 ? aVar.f38406a + 11 : 0)];
            g.a(e.f38446a, bArr, 0);
            bArr[4] = (byte) eVar.f38448c;
            bArr[5] = (byte) eVar.f38449d;
            int i12 = eVar.f38450e | eVar.f38453h | eVar.f38454i | eVar.f38455j;
            eVar.f38450e = i12;
            bArr[6] = (byte) i12;
            bArr[7] = (byte) eVar.f38451f;
            byte[] c11 = com.igexin.push.g.g.c();
            bArr[8] = (byte) c11.length;
            int a12 = g.a(c11, bArr, 9, c11.length);
            int i13 = eVar.f38452g | eVar.f38456k | eVar.f38457l | eVar.f38458m | eVar.f38459n;
            eVar.f38452g = i13;
            bArr[a12 + 9] = (byte) i13;
            int i14 = a12 + 10;
            if (aVar.f38406a > 0) {
                int i15 = eVar.f38461p;
                bArr[i14] = (byte) i15;
                int i16 = a12 + 11;
                i11 = i16 + g.a(eVar.f38460o, bArr, i16, i15);
            } else {
                bArr[i14] = 0;
                i11 = a12 + 11;
            }
            if (aVar.f38407b > 0) {
                int a13 = i11 + g.a(eVar.f38462q, bArr, i11);
                int a14 = a13 + g.a(eVar.f38463r, bArr, a13);
                int b13 = a14 + g.b(aVar.f38406a, bArr, a14);
                bArr[b13] = aVar.f38407b;
                int i17 = b13 + 1;
                int i18 = aVar.f38406a;
                if (i18 > 0) {
                    g.a(aVar.f38410e, bArr, i17, i18);
                }
            }
        }
        return bArr;
    }

    private static byte[] a(h hVar, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        hVar.a(bArr);
        return bArr;
    }
}
