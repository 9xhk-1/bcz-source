package okio;

import a00.q;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.c1;
import m60.i;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
/* loaded from: classes8.dex */
public final class SegmentedByteString extends ByteString {

    @k
    private final transient int[] directory;

    @k
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(@k byte[][] segments, @k int[] directory) {
        super(ByteString.EMPTY.getData$okio());
        g0.p(segments, "segments");
        g0.p(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        g0.n(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // okio.ByteString
    @k
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        g0.o(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    @Override // okio.ByteString
    @k
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    @k
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    public void copyInto(int i11, @k byte[] target, int i12, int i13) {
        g0.p(target, "target");
        long j11 = i13;
        l60.h.e(size(), i11, j11);
        l60.h.e(target.length, i12, j11);
        int i14 = i13 + i11;
        int n11 = i.n(this, i11);
        while (i11 < i14) {
            int i15 = n11 == 0 ? 0 : getDirectory$okio()[n11 - 1];
            int i16 = getDirectory$okio()[n11] - i15;
            int i17 = getDirectory$okio()[getSegments$okio().length + n11];
            int min = Math.min(i14, i16 + i15) - i11;
            int i18 = i17 + (i11 - i15);
            q.v0(getSegments$okio()[n11], target, i12, i18, i18 + min);
            i12 += min;
            i11 += min;
            n11++;
        }
    }

    @Override // okio.ByteString
    @k
    public ByteString digest$okio(@k String algorithm) {
        g0.p(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments$okio().length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = getDirectory$okio()[length + i11];
            int i14 = getDirectory$okio()[i11];
            messageDigest.update(getSegments$okio()[i11], i13, i14 - i12);
            i11++;
            i12 = i14;
        }
        byte[] digest = messageDigest.digest();
        g0.m(digest);
        return new ByteString(digest);
    }

    @Override // okio.ByteString
    public boolean equals(@l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @k
    public final int[] getDirectory$okio() {
        return this.directory;
    }

    @k
    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int i14 = getDirectory$okio()[length + i11];
            int i15 = getDirectory$okio()[i11];
            byte[] bArr = getSegments$okio()[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        setHashCode$okio(i12);
        return i12;
    }

    @Override // okio.ByteString
    @k
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    @k
    public ByteString hmac$okio(@k String algorithm, @k ByteString key) {
        g0.p(algorithm, "algorithm");
        g0.p(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments$okio().length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                int i13 = getDirectory$okio()[length + i11];
                int i14 = getDirectory$okio()[i11];
                mac.update(getSegments$okio()[i11], i13, i14 - i12);
                i11++;
                i12 = i14;
            }
            byte[] doFinal = mac.doFinal();
            g0.o(doFinal, "doFinal(...)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    @Override // okio.ByteString
    public int indexOf(@k byte[] other, int i11) {
        g0.p(other, "other");
        return toByteString().indexOf(other, i11);
    }

    @Override // okio.ByteString
    @k
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i11) {
        l60.h.e(getDirectory$okio()[getSegments$okio().length - 1], i11, 1L);
        int n11 = i.n(this, i11);
        return getSegments$okio()[n11][(i11 - (n11 == 0 ? 0 : getDirectory$okio()[n11 - 1])) + getDirectory$okio()[getSegments$okio().length + n11]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(@k byte[] other, int i11) {
        g0.p(other, "other");
        return toByteString().lastIndexOf(other, i11);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i11, @k ByteString other, int i12, int i13) {
        g0.p(other, "other");
        if (i11 < 0 || i11 > size() - i13) {
            return false;
        }
        int i14 = i13 + i11;
        int n11 = i.n(this, i11);
        while (i11 < i14) {
            int i15 = n11 == 0 ? 0 : getDirectory$okio()[n11 - 1];
            int i16 = getDirectory$okio()[n11] - i15;
            int i17 = getDirectory$okio()[getSegments$okio().length + n11];
            int min = Math.min(i14, i16 + i15) - i11;
            if (!other.rangeEquals(i12, getSegments$okio()[n11], i17 + (i11 - i15), min)) {
                return false;
            }
            i12 += min;
            i11 += min;
            n11++;
        }
        return true;
    }

    @Override // okio.ByteString
    @k
    public String string(@k Charset charset) {
        g0.p(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    @k
    public ByteString substring(int i11, int i12) {
        int k11 = l60.h.k(this, i12);
        if (i11 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i11 + " < 0").toString());
        }
        if (k11 > size()) {
            throw new IllegalArgumentException(("endIndex=" + k11 + " > length(" + size() + ')').toString());
        }
        int i13 = k11 - i11;
        if (i13 < 0) {
            throw new IllegalArgumentException(("endIndex=" + k11 + " < beginIndex=" + i11).toString());
        }
        if (i11 == 0 && k11 == size()) {
            return this;
        }
        if (i11 == k11) {
            return ByteString.EMPTY;
        }
        int n11 = i.n(this, i11);
        int n12 = i.n(this, k11 - 1);
        byte[][] bArr = (byte[][]) q.l1(getSegments$okio(), n11, n12 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (n11 <= n12) {
            int i14 = n11;
            int i15 = 0;
            while (true) {
                iArr[i15] = Math.min(getDirectory$okio()[i14] - i11, i13);
                int i16 = i15 + 1;
                iArr[i15 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i14];
                if (i14 == n12) {
                    break;
                }
                i14++;
                i15 = i16;
            }
        }
        int i17 = n11 != 0 ? getDirectory$okio()[n11 - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i11 - i17);
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    @k
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    @k
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    @k
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            int i14 = getDirectory$okio()[length + i11];
            int i15 = getDirectory$okio()[i11];
            int i16 = i15 - i12;
            q.v0(getSegments$okio()[i11], bArr, i13, i14, i14 + i16);
            i13 += i16;
            i11++;
            i12 = i15;
        }
        return bArr;
    }

    @Override // okio.ByteString
    @k
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write(@k OutputStream out) throws IOException {
        g0.p(out, "out");
        int length = getSegments$okio().length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = getDirectory$okio()[length + i11];
            int i14 = getDirectory$okio()[i11];
            out.write(getSegments$okio()[i11], i13, i14 - i12);
            i11++;
            i12 = i14;
        }
    }

    @Override // okio.ByteString
    public void write$okio(@k l60.k buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        int i13 = i11 + i12;
        int n11 = i.n(this, i11);
        while (i11 < i13) {
            int i14 = n11 == 0 ? 0 : getDirectory$okio()[n11 - 1];
            int i15 = getDirectory$okio()[n11] - i14;
            int i16 = getDirectory$okio()[getSegments$okio().length + n11];
            int min = Math.min(i13, i15 + i14) - i11;
            int i17 = i16 + (i11 - i14);
            c1 c1Var = new c1(getSegments$okio()[n11], i17, i17 + min, true, false);
            c1 c1Var2 = buffer.f70446a;
            if (c1Var2 == null) {
                c1Var.f70389g = c1Var;
                c1Var.f70388f = c1Var;
                buffer.f70446a = c1Var;
            } else {
                g0.m(c1Var2);
                c1 c1Var3 = c1Var2.f70389g;
                g0.m(c1Var3);
                c1Var3.c(c1Var);
            }
            i11 += min;
            n11++;
        }
        buffer.g1(buffer.size() + i12);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i11, @k byte[] other, int i12, int i13) {
        g0.p(other, "other");
        if (i11 < 0 || i11 > size() - i13 || i12 < 0 || i12 > other.length - i13) {
            return false;
        }
        int i14 = i13 + i11;
        int n11 = i.n(this, i11);
        while (i11 < i14) {
            int i15 = n11 == 0 ? 0 : getDirectory$okio()[n11 - 1];
            int i16 = getDirectory$okio()[n11] - i15;
            int i17 = getDirectory$okio()[getSegments$okio().length + n11];
            int min = Math.min(i14, i16 + i15) - i11;
            if (!l60.h.d(getSegments$okio()[n11], i17 + (i11 - i15), other, i12, min)) {
                return false;
            }
            i12 += min;
            i11 += min;
            n11++;
        }
        return true;
    }
}
