package m60;

import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.l1;
import okio.ByteString;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-ByteString")
@u0({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,342:1\n129#1,2:348\n131#1,9:351\n67#2:343\n73#2:344\n73#2:346\n73#2:347\n67#2:375\n73#2:387\n1#3:345\n1#3:350\n212#4,7:360\n122#4:367\n219#4,5:368\n122#4:373\n226#4:374\n228#4:376\n397#4,2:377\n122#4:379\n400#4,6:380\n127#4:386\n406#4:388\n122#4:389\n407#4,13:390\n122#4:403\n422#4:404\n122#4:405\n425#4:406\n230#4,3:407\n440#4,3:410\n122#4:413\n443#4:414\n127#4:415\n446#4,10:416\n127#4:426\n456#4:427\n122#4:428\n457#4,4:429\n127#4:433\n461#4:434\n122#4:435\n462#4,14:436\n122#4:450\n477#4,2:451\n122#4:453\n481#4:454\n122#4:455\n484#4:456\n234#4,3:457\n500#4,3:460\n122#4:463\n503#4:464\n127#4:465\n506#4,2:466\n127#4:468\n510#4,10:469\n127#4:479\n520#4:480\n122#4:481\n521#4,4:482\n127#4:486\n525#4:487\n122#4:488\n526#4,4:489\n127#4:493\n530#4:494\n122#4:495\n531#4,15:496\n122#4:511\n547#4,2:512\n122#4:514\n550#4,2:515\n122#4:517\n554#4:518\n122#4:519\n557#4:520\n241#4:521\n122#4:522\n242#4,5:523\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n308#1:348,2\n308#1:351,9\n65#1:343\n66#1:344\n256#1:346\n257#1:347\n327#1:375\n327#1:387\n308#1:350\n327#1:360,7\n332#1:367\n327#1:368,5\n332#1:373\n327#1:374\n327#1:376\n327#1:377,2\n332#1:379\n327#1:380,6\n327#1:386\n327#1:388\n332#1:389\n327#1:390,13\n332#1:403\n327#1:404\n332#1:405\n327#1:406\n327#1:407,3\n327#1:410,3\n332#1:413\n327#1:414\n327#1:415\n327#1:416,10\n327#1:426\n327#1:427\n332#1:428\n327#1:429,4\n327#1:433\n327#1:434\n332#1:435\n327#1:436,14\n332#1:450\n327#1:451,2\n332#1:453\n327#1:454\n332#1:455\n327#1:456\n327#1:457,3\n327#1:460,3\n332#1:463\n327#1:464\n327#1:465\n327#1:466,2\n327#1:468\n327#1:469,10\n327#1:479\n327#1:480\n332#1:481\n327#1:482,4\n327#1:486\n327#1:487\n332#1:488\n327#1:489,4\n327#1:493\n327#1:494\n332#1:495\n327#1:496,15\n332#1:511\n327#1:512,2\n332#1:514\n327#1:515,2\n332#1:517\n327#1:518\n332#1:519\n327#1:520\n327#1:521\n332#1:522\n327#1:523,5\n*E\n"})
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final char[] f72408a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};

    @m80.k
    public static final ByteString A(@m80.k ByteString byteString) {
        g0.p(byteString, "<this>");
        for (int i11 = 0; i11 < byteString.getData$okio().length; i11++) {
            byte b11 = byteString.getData$okio()[i11];
            if (b11 >= 97 && b11 <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                g0.o(copyOf, "copyOf(...)");
                copyOf[i11] = (byte) (b11 + ws.c.f96768m);
                for (int i12 = i11 + 1; i12 < copyOf.length; i12++) {
                    byte b12 = copyOf[i12];
                    if (b12 >= 97 && b12 <= 122) {
                        copyOf[i12] = (byte) (b12 + ws.c.f96768m);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    @m80.k
    public static final byte[] B(@m80.k ByteString byteString) {
        g0.p(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @m80.k
    public static final ByteString C(@m80.k byte[] bArr, int i11, int i12) {
        g0.p(bArr, "<this>");
        int l11 = l60.h.l(bArr, i12);
        l60.h.e(bArr.length, i11, l11);
        return new ByteString(a00.q.f1(bArr, i11, l11 + i11));
    }

    @m80.k
    public static final String D(@m80.k ByteString byteString) {
        ByteString byteString2 = byteString;
        g0.p(byteString2, "<this>");
        if (byteString2.getData$okio().length == 0) {
            return "[size=0]";
        }
        int b11 = b(byteString2.getData$okio(), 64);
        if (b11 != -1) {
            String utf8 = byteString2.utf8();
            String substring = utf8.substring(0, b11);
            g0.o(substring, "substring(...)");
            String z22 = f0.z2(f0.z2(f0.z2(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), c1.g.f7467d, "\\r", false, 4, null);
            if (b11 >= utf8.length()) {
                return "[text=" + z22 + l50.b.f69930l;
            }
            return "[size=" + byteString2.getData$okio().length + " text=" + z22 + "…]";
        }
        if (byteString2.getData$okio().length <= 64) {
            return "[hex=" + byteString2.hex() + l50.b.f69930l;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(byteString2.getData$okio().length);
        sb2.append(" hex=");
        int k11 = l60.h.k(byteString2, 64);
        if (k11 > byteString2.getData$okio().length) {
            throw new IllegalArgumentException(("endIndex > length(" + byteString2.getData$okio().length + ')').toString());
        }
        if (k11 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (k11 != byteString2.getData$okio().length) {
            byteString2 = new ByteString(a00.q.f1(byteString2.getData$okio(), 0, k11));
        }
        sb2.append(byteString2.hex());
        sb2.append("…]");
        return sb2.toString();
    }

    @m80.k
    public static final String E(@m80.k ByteString byteString) {
        g0.p(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String c11 = l1.c(byteString.internalArray$okio());
        byteString.setUtf8$okio(c11);
        return c11;
    }

    public static final void F(@m80.k ByteString byteString, @m80.k l60.k buffer, int i11, int i12) {
        g0.p(byteString, "<this>");
        g0.p(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i11, i12);
    }

    @m80.k
    public static final char[] G() {
        return f72408a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0065, code lost:
    
        r6 = yz.g2.f100423a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01af, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.c.b(byte[], int):int");
    }

    @m80.k
    public static final String c(@m80.k ByteString byteString) {
        g0.p(byteString, "<this>");
        return okio.a.c(byteString.getData$okio(), null, 1, null);
    }

    @m80.k
    public static final String d(@m80.k ByteString byteString) {
        g0.p(byteString, "<this>");
        return okio.a.b(byteString.getData$okio(), okio.a.e());
    }

    public static final int e(@m80.k ByteString byteString, @m80.k ByteString other) {
        g0.p(byteString, "<this>");
        g0.p(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int min = Math.min(size, size2);
        for (int i11 = 0; i11 < min; i11++) {
            int i12 = byteString.getByte(i11) & 255;
            int i13 = other.getByte(i11) & 255;
            if (i12 != i13) {
                return i12 < i13 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void f(@m80.k ByteString byteString, int i11, @m80.k byte[] target, int i12, int i13) {
        g0.p(byteString, "<this>");
        g0.p(target, "target");
        a00.q.v0(byteString.getData$okio(), target, i12, i11, i13 + i11);
    }

    @m80.l
    public static final ByteString g(@m80.k String str) {
        g0.p(str, "<this>");
        byte[] a11 = okio.a.a(str);
        if (a11 != null) {
            return new ByteString(a11);
        }
        return null;
    }

    @m80.k
    public static final ByteString h(@m80.k String str) {
        g0.p(str, "<this>");
        ByteString byteString = new ByteString(l1.a(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean i(@m80.k ByteString byteString, @m80.k ByteString suffix) {
        g0.p(byteString, "<this>");
        g0.p(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean j(@m80.k ByteString byteString, @m80.k byte[] suffix) {
        g0.p(byteString, "<this>");
        g0.p(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final boolean k(@m80.k ByteString byteString, @m80.l Object obj) {
        g0.p(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString2 = (ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte l(@m80.k ByteString byteString, int i11) {
        g0.p(byteString, "<this>");
        return byteString.getData$okio()[i11];
    }

    public static final int m(@m80.k ByteString byteString) {
        g0.p(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final int n(@m80.k ByteString byteString) {
        g0.p(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(hashCode);
        return hashCode;
    }

    @m80.k
    public static final String o(@m80.k ByteString byteString) {
        g0.p(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i11 = 0;
        for (byte b11 : byteString.getData$okio()) {
            int i12 = i11 + 1;
            cArr[i11] = G()[(b11 >> 4) & 15];
            i11 += 2;
            cArr[i12] = G()[b11 & 15];
        }
        return f0.L1(cArr);
    }

    public static final int p(@m80.k ByteString byteString, @m80.k byte[] other, int i11) {
        g0.p(byteString, "<this>");
        g0.p(other, "other");
        int length = byteString.getData$okio().length - other.length;
        int max = Math.max(i11, 0);
        if (max > length) {
            return -1;
        }
        while (!l60.h.d(byteString.getData$okio(), max, other, 0, other.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    @m80.k
    public static final byte[] q(@m80.k ByteString byteString) {
        g0.p(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final int r(@m80.k ByteString byteString, @m80.k ByteString other, int i11) {
        g0.p(byteString, "<this>");
        g0.p(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i11);
    }

    public static final int s(@m80.k ByteString byteString, @m80.k byte[] other, int i11) {
        g0.p(byteString, "<this>");
        g0.p(other, "other");
        for (int min = Math.min(l60.h.k(byteString, i11), byteString.getData$okio().length - other.length); -1 < min; min--) {
            if (l60.h.d(byteString.getData$okio(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    @m80.k
    public static final ByteString t(@m80.k byte[] data) {
        g0.p(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        g0.o(copyOf, "copyOf(...)");
        return new ByteString(copyOf);
    }

    public static final boolean u(@m80.k ByteString byteString, int i11, @m80.k ByteString other, int i12, int i13) {
        g0.p(byteString, "<this>");
        g0.p(other, "other");
        return other.rangeEquals(i12, byteString.getData$okio(), i11, i13);
    }

    public static final boolean v(@m80.k ByteString byteString, int i11, @m80.k byte[] other, int i12, int i13) {
        g0.p(byteString, "<this>");
        g0.p(other, "other");
        return i11 >= 0 && i11 <= byteString.getData$okio().length - i13 && i12 >= 0 && i12 <= other.length - i13 && l60.h.d(byteString.getData$okio(), i11, other, i12, i13);
    }

    public static final boolean w(@m80.k ByteString byteString, @m80.k ByteString prefix) {
        g0.p(byteString, "<this>");
        g0.p(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final boolean x(@m80.k ByteString byteString, @m80.k byte[] prefix) {
        g0.p(byteString, "<this>");
        g0.p(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }

    @m80.k
    public static final ByteString y(@m80.k ByteString byteString, int i11, int i12) {
        g0.p(byteString, "<this>");
        int k11 = l60.h.k(byteString, i12);
        if (i11 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (k11 <= byteString.getData$okio().length) {
            if (k11 - i11 >= 0) {
                return (i11 == 0 && k11 == byteString.getData$okio().length) ? byteString : new ByteString(a00.q.f1(byteString.getData$okio(), i11, k11));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
    }

    @m80.k
    public static final ByteString z(@m80.k ByteString byteString) {
        g0.p(byteString, "<this>");
        for (int i11 = 0; i11 < byteString.getData$okio().length; i11++) {
            byte b11 = byteString.getData$okio()[i11];
            if (b11 >= 65 && b11 <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                g0.o(copyOf, "copyOf(...)");
                copyOf[i11] = (byte) (b11 + 32);
                for (int i12 = i11 + 1; i12 < copyOf.length; i12++) {
                    byte b12 = copyOf[i12];
                    if (b12 >= 65 && b12 <= 90) {
                        copyOf[i12] = (byte) (b12 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }
}
