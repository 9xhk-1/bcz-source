package io.ktor.network.tls.extensions;

import io.ktor.network.tls.TLSException;
import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class HashAlgorithm {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ HashAlgorithm[] $VALUES;

    @k
    public static final a Companion;
    private final byte code;

    @k
    private final String macName;

    @k
    private final String openSSLName;
    public static final HashAlgorithm NONE = new HashAlgorithm("NONE", 0, (byte) 0, "", "");
    public static final HashAlgorithm MD5 = new HashAlgorithm("MD5", 1, (byte) 1, "MD5", "HmacMD5");
    public static final HashAlgorithm SHA1 = new HashAlgorithm("SHA1", 2, (byte) 2, "SHA-1", "HmacSHA1");
    public static final HashAlgorithm SHA224 = new HashAlgorithm("SHA224", 3, (byte) 3, "SHA-224", "HmacSHA224");
    public static final HashAlgorithm SHA256 = new HashAlgorithm("SHA256", 4, (byte) 4, "SHA-256", qr.b.f82657b);
    public static final HashAlgorithm SHA384 = new HashAlgorithm("SHA384", 5, (byte) 5, "SHA-384", "HmacSHA384");
    public static final HashAlgorithm SHA512 = new HashAlgorithm("SHA512", 6, (byte) 6, "SHA-512", "HmacSHA512");
    public static final HashAlgorithm INTRINSIC = new HashAlgorithm("INTRINSIC", 7, (byte) 8, "INTRINSIC", "Intrinsic");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSignatureAlgorithm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureAlgorithm.kt\nio/ktor/network/tls/extensions/HashAlgorithm$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final HashAlgorithm a(byte b11) {
            Object obj;
            Iterator<E> it = HashAlgorithm.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((HashAlgorithm) obj).getCode() == b11) {
                    break;
                }
            }
            HashAlgorithm hashAlgorithm = (HashAlgorithm) obj;
            if (hashAlgorithm != null) {
                return hashAlgorithm;
            }
            throw new TLSException("Unknown hash algorithm: " + ((int) b11), null, 2, null);
        }

        public a() {
        }
    }

    private static final /* synthetic */ HashAlgorithm[] $values() {
        return new HashAlgorithm[]{NONE, MD5, SHA1, SHA224, SHA256, SHA384, SHA512, INTRINSIC};
    }

    static {
        HashAlgorithm[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private HashAlgorithm(String str, int i11, byte b11, String str2, String str3) {
        this.code = b11;
        this.openSSLName = str2;
        this.macName = str3;
    }

    @k
    public static m00.a<HashAlgorithm> getEntries() {
        return $ENTRIES;
    }

    public static HashAlgorithm valueOf(String str) {
        return (HashAlgorithm) Enum.valueOf(HashAlgorithm.class, str);
    }

    public static HashAlgorithm[] values() {
        return (HashAlgorithm[]) $VALUES.clone();
    }

    public final byte getCode() {
        return this.code;
    }

    @k
    public final String getMacName() {
        return this.macName;
    }

    @k
    public final String getOpenSSLName() {
        return this.openSSLName;
    }
}
