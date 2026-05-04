package okio;

import a00.q;
import ix.g;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.l1;
import m80.k;
import m80.l;
import u30.f0;
import w00.j;
import w00.o;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n42#2,7:365\n52#2:372\n55#2:373\n62#2,4:374\n66#2:379\n68#2:381\n74#2,23:382\n102#2,23:405\n129#2,2:428\n131#2,9:431\n143#2:440\n146#2:441\n149#2:442\n152#2:443\n160#2:444\n170#2,3:445\n169#2:448\n183#2,2:449\n188#2:451\n192#2:452\n196#2:453\n200#2:454\n204#2,7:455\n217#2:462\n221#2,8:463\n233#2,4:471\n242#2,5:475\n251#2,6:480\n257#2,9:487\n301#2,8:496\n129#2,2:504\n131#2,9:507\n312#2,9:516\n67#3:378\n73#3:380\n73#3:486\n1#4:430\n1#4:506\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:365,7\n71#1:372\n108#1:373\n110#1:374,4\n110#1:379\n110#1:381\n112#1:382,23\n114#1:405,23\n118#1:428,2\n118#1:431,9\n120#1:440\n129#1:441\n131#1:442\n133#1:443\n152#1:444\n159#1:445,3\n159#1:448\n166#1:449,2\n168#1:451\n170#1:452\n172#1:453\n174#1:454\n180#1:455,7\n183#1:462\n186#1:463,8\n188#1:471,4\n190#1:475,5\n192#1:480,6\n192#1:487,9\n194#1:496,8\n194#1:504,2\n194#1:507,9\n194#1:516,9\n110#1:378\n110#1:380\n192#1:486\n118#1:430\n194#1:506\n*E\n"})
/* loaded from: classes8.dex */
public class ByteString implements Serializable, Comparable<ByteString> {

    @k
    public static final a Companion = new a(null);

    @w00.g
    @k
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    @k
    private final byte[] data;
    private transient int hashCode;

    @l
    private transient String utf8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 ByteStringNonJs.kt\nokio/internal/-ByteStringNonJs\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n269#2:365\n273#2,3:366\n280#2,3:369\n287#2,2:372\n25#3:374\n27#3,7:376\n1#4:375\n1#4:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ ByteString k(a aVar, String str, Charset charset, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                charset = u30.d.f91599b;
            }
            return aVar.j(str, charset);
        }

        public static /* synthetic */ ByteString p(a aVar, byte[] bArr, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = 0;
            }
            if ((i13 & 2) != 0) {
                i12 = l60.h.f();
            }
            return aVar.o(bArr, i11, i12);
        }

        @l
        @j(name = "-deprecated_decodeBase64")
        @n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        public final ByteString a(@k String string) {
            g0.p(string, "string");
            return h(string);
        }

        @j(name = "-deprecated_decodeHex")
        @n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @k
        public final ByteString b(@k String string) {
            g0.p(string, "string");
            return i(string);
        }

        @j(name = "-deprecated_encodeString")
        @n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @k
        public final ByteString c(@k String string, @k Charset charset) {
            g0.p(string, "string");
            g0.p(charset, "charset");
            return j(string, charset);
        }

        @j(name = "-deprecated_encodeUtf8")
        @n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @k
        public final ByteString d(@k String string) {
            g0.p(string, "string");
            return l(string);
        }

        @j(name = "-deprecated_of")
        @n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @k
        public final ByteString e(@k ByteBuffer buffer) {
            g0.p(buffer, "buffer");
            return m(buffer);
        }

        @j(name = "-deprecated_of")
        @n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @k
        public final ByteString f(@k byte[] array, int i11, int i12) {
            g0.p(array, "array");
            return o(array, i11, i12);
        }

        @j(name = "-deprecated_read")
        @n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @k
        public final ByteString g(@k InputStream inputstream, int i11) {
            g0.p(inputstream, "inputstream");
            return q(inputstream, i11);
        }

        @l
        @o
        public final ByteString h(@k String str) {
            g0.p(str, "<this>");
            byte[] a11 = okio.a.a(str);
            if (a11 != null) {
                return new ByteString(a11);
            }
            return null;
        }

        @o
        @k
        public final ByteString i(@k String str) {
            g0.p(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = i11 * 2;
                bArr[i11] = (byte) ((m60.d.c(str.charAt(i12)) << 4) + m60.d.c(str.charAt(i12 + 1)));
            }
            return new ByteString(bArr);
        }

        @j(name = "encodeString")
        @o
        @k
        public final ByteString j(@k String str, @k Charset charset) {
            g0.p(str, "<this>");
            g0.p(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            g0.o(bytes, "getBytes(...)");
            return new ByteString(bytes);
        }

        @o
        @k
        public final ByteString l(@k String str) {
            g0.p(str, "<this>");
            ByteString byteString = new ByteString(l1.a(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        @j(name = "of")
        @o
        @k
        public final ByteString m(@k ByteBuffer byteBuffer) {
            g0.p(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        @o
        @k
        public final ByteString n(@k byte... data) {
            g0.p(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            g0.o(copyOf, "copyOf(...)");
            return new ByteString(copyOf);
        }

        @j(name = "of")
        @o
        @k
        public final ByteString o(@k byte[] bArr, int i11, int i12) {
            g0.p(bArr, "<this>");
            int l11 = l60.h.l(bArr, i12);
            l60.h.e(bArr.length, i11, l11);
            return new ByteString(q.f1(bArr, i11, l11 + i11));
        }

        @j(name = "read")
        @o
        @k
        public final ByteString q(@k InputStream inputStream, int i11) throws IOException {
            g0.p(inputStream, "<this>");
            if (i11 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i11).toString());
            }
            byte[] bArr = new byte[i11];
            int i12 = 0;
            while (i12 < i11) {
                int read = inputStream.read(bArr, i12, i11 - i12);
                if (read == -1) {
                    throw new EOFException();
                }
                i12 += read;
            }
            return new ByteString(bArr);
        }

        public a() {
        }
    }

    public ByteString(@k byte[] data) {
        g0.p(data, "data");
        this.data = data;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i11, byte[] bArr, int i12, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i14 & 1) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        byteString.copyInto(i11, bArr, i12, i13);
    }

    @l
    @o
    public static final ByteString decodeBase64(@k String str) {
        return Companion.h(str);
    }

    @o
    @k
    public static final ByteString decodeHex(@k String str) {
        return Companion.i(str);
    }

    @j(name = "encodeString")
    @o
    @k
    public static final ByteString encodeString(@k String str, @k Charset charset) {
        return Companion.j(str, charset);
    }

    @o
    @k
    public static final ByteString encodeUtf8(@k String str) {
        return Companion.l(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return byteString.indexOf(byteString2, i11);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i12 & 2) != 0) {
            i11 = l60.h.f();
        }
        return byteString.lastIndexOf(byteString2, i11);
    }

    @j(name = "of")
    @o
    @k
    public static final ByteString of(@k ByteBuffer byteBuffer) {
        return Companion.m(byteBuffer);
    }

    @j(name = "read")
    @o
    @k
    public static final ByteString read(@k InputStream inputStream, int i11) throws IOException {
        return Companion.q(inputStream, i11);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString q11 = Companion.q(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, q11.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = l60.h.f();
        }
        return byteString.substring(i11, i12);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @j(name = "-deprecated_getByte")
    @n(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @w0(expression = "this[index]", imports = {}))
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m6330deprecated_getByte(int i11) {
        return getByte(i11);
    }

    @j(name = "-deprecated_size")
    @n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = g.b.f62794h, imports = {}))
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m6331deprecated_size() {
        return size();
    }

    @k
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        g0.o(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    @k
    public String base64() {
        return okio.a.c(getData$okio(), null, 1, null);
    }

    @k
    public String base64Url() {
        return okio.a.b(getData$okio(), okio.a.e());
    }

    public void copyInto(int i11, @k byte[] target, int i12, int i13) {
        g0.p(target, "target");
        q.v0(getData$okio(), target, i12, i11, i13 + i11);
    }

    @k
    public ByteString digest$okio(@k String algorithm) {
        g0.p(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, size());
        byte[] digest = messageDigest.digest();
        g0.m(digest);
        return new ByteString(digest);
    }

    public final boolean endsWith(@k ByteString suffix) {
        g0.p(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(@l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    @j(name = "getByte")
    public final byte getByte(int i11) {
        return internalGet$okio(i11);
    }

    @k
    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    @l
    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    @k
    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i11 = 0;
        for (byte b11 : getData$okio()) {
            int i12 = i11 + 1;
            cArr[i11] = m60.c.G()[(b11 >> 4) & 15];
            i11 += 2;
            cArr[i12] = m60.c.G()[b11 & 15];
        }
        return f0.L1(cArr);
    }

    @k
    public ByteString hmac$okio(@k String algorithm, @k ByteString key) {
        g0.p(algorithm, "algorithm");
        g0.p(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] doFinal = mac.doFinal(this.data);
            g0.o(doFinal, "doFinal(...)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    @k
    public ByteString hmacSha1(@k ByteString key) {
        g0.p(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    @k
    public ByteString hmacSha256(@k ByteString key) {
        g0.p(key, "key");
        return hmac$okio(qr.b.f82657b, key);
    }

    @k
    public ByteString hmacSha512(@k ByteString key) {
        g0.p(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    @w00.k
    public final int indexOf(@k ByteString other) {
        g0.p(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    @k
    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i11) {
        return getData$okio()[i11];
    }

    @w00.k
    public final int lastIndexOf(@k ByteString other) {
        g0.p(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    @k
    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i11, @k ByteString other, int i12, int i13) {
        g0.p(other, "other");
        return other.rangeEquals(i12, getData$okio(), i11, i13);
    }

    public final void setHashCode$okio(int i11) {
        this.hashCode = i11;
    }

    public final void setUtf8$okio(@l String str) {
        this.utf8 = str;
    }

    @k
    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    @k
    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    @k
    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    @j(name = g.b.f62794h)
    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(@k ByteString prefix) {
        g0.p(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    @k
    public String string(@k Charset charset) {
        g0.p(charset, "charset");
        return new String(this.data, charset);
    }

    @w00.k
    @k
    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    @k
    public ByteString toAsciiLowercase() {
        for (int i11 = 0; i11 < getData$okio().length; i11++) {
            byte b11 = getData$okio()[i11];
            if (b11 >= 65 && b11 <= 90) {
                byte[] data$okio = getData$okio();
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
        return this;
    }

    @k
    public ByteString toAsciiUppercase() {
        for (int i11 = 0; i11 < getData$okio().length; i11++) {
            byte b11 = getData$okio()[i11];
            if (b11 >= 97 && b11 <= 122) {
                byte[] data$okio = getData$okio();
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
        return this;
    }

    @k
    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @k
    public String toString() {
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int b11 = m60.c.b(getData$okio(), 64);
        if (b11 != -1) {
            String utf8 = utf8();
            String substring = utf8.substring(0, b11);
            g0.o(substring, "substring(...)");
            String z22 = f0.z2(f0.z2(f0.z2(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), c1.g.f7467d, "\\r", false, 4, null);
            if (b11 >= utf8.length()) {
                return "[text=" + z22 + l50.b.f69930l;
            }
            return "[size=" + getData$okio().length + " text=" + z22 + "…]";
        }
        if (getData$okio().length <= 64) {
            return "[hex=" + hex() + l50.b.f69930l;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(getData$okio().length);
        sb2.append(" hex=");
        int k11 = l60.h.k(this, 64);
        if (k11 <= getData$okio().length) {
            if (k11 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb2.append((k11 == getData$okio().length ? this : new ByteString(q.f1(getData$okio(), 0, k11))).hex());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
    }

    @k
    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String c11 = l1.c(internalArray$okio());
        setUtf8$okio(c11);
        return c11;
    }

    public void write(@k OutputStream out) throws IOException {
        g0.p(out, "out");
        out.write(this.data);
    }

    public void write$okio(@k l60.k buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        m60.c.F(this, buffer, i11, i12);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return byteString.indexOf(bArr, i11);
    }

    @o
    @k
    public static final ByteString of(@k byte... bArr) {
        return Companion.n(bArr);
    }

    @Override // java.lang.Comparable
    public int compareTo(@k ByteString other) {
        g0.p(other, "other");
        int size = size();
        int size2 = other.size();
        int min = Math.min(size, size2);
        for (int i11 = 0; i11 < min; i11++) {
            int i12 = getByte(i11) & 255;
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

    public final boolean endsWith(@k byte[] suffix) {
        g0.p(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    @w00.k
    public final int indexOf(@k byte[] other) {
        g0.p(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    @w00.k
    public final int lastIndexOf(@k byte[] other) {
        g0.p(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public boolean rangeEquals(int i11, @k byte[] other, int i12, int i13) {
        g0.p(other, "other");
        return i11 >= 0 && i11 <= getData$okio().length - i13 && i12 >= 0 && i12 <= other.length - i13 && l60.h.d(getData$okio(), i11, other, i12, i13);
    }

    public final boolean startsWith(@k byte[] prefix) {
        g0.p(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    @w00.k
    @k
    public final ByteString substring(int i11) {
        return substring$default(this, i11, 0, 2, null);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i12 & 2) != 0) {
            i11 = l60.h.f();
        }
        return byteString.lastIndexOf(bArr, i11);
    }

    @j(name = "of")
    @o
    @k
    public static final ByteString of(@k byte[] bArr, int i11, int i12) {
        return Companion.o(bArr, i11, i12);
    }

    @w00.k
    public final int indexOf(@k ByteString other, int i11) {
        g0.p(other, "other");
        return indexOf(other.internalArray$okio(), i11);
    }

    @w00.k
    public final int lastIndexOf(@k ByteString other, int i11) {
        g0.p(other, "other");
        return lastIndexOf(other.internalArray$okio(), i11);
    }

    @w00.k
    @k
    public ByteString substring(int i11, int i12) {
        int k11 = l60.h.k(this, i12);
        if (i11 >= 0) {
            if (k11 <= getData$okio().length) {
                if (k11 - i11 >= 0) {
                    return (i11 == 0 && k11 == getData$okio().length) ? this : new ByteString(q.f1(getData$okio(), i11, k11));
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    @w00.k
    public int indexOf(@k byte[] other, int i11) {
        g0.p(other, "other");
        int length = getData$okio().length - other.length;
        int max = Math.max(i11, 0);
        if (max > length) {
            return -1;
        }
        while (!l60.h.d(getData$okio(), max, other, 0, other.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    @w00.k
    public int lastIndexOf(@k byte[] other, int i11) {
        g0.p(other, "other");
        for (int min = Math.min(l60.h.k(this, i11), getData$okio().length - other.length); -1 < min; min--) {
            if (l60.h.d(getData$okio(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }
}
