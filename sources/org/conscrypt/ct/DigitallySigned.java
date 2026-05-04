package org.conscrypt.ct;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class DigitallySigned {
    private final HashAlgorithm hashAlgorithm;
    private final byte[] signature;
    private final SignatureAlgorithm signatureAlgorithm;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum HashAlgorithm {
        NONE,
        MD5,
        SHA1,
        SHA224,
        SHA256,
        SHA384,
        SHA512;

        private static HashAlgorithm[] values = values();

        public static HashAlgorithm valueOf(int i11) {
            try {
                return values[i11];
            } catch (IndexOutOfBoundsException e11) {
                throw new IllegalArgumentException("Invalid hash algorithm " + i11, e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum SignatureAlgorithm {
        ANONYMOUS,
        RSA,
        DSA,
        ECDSA;

        private static SignatureAlgorithm[] values = values();

        public static SignatureAlgorithm valueOf(int i11) {
            try {
                return values[i11];
            } catch (IndexOutOfBoundsException e11) {
                throw new IllegalArgumentException("Invalid signature algorithm " + i11, e11);
            }
        }
    }

    public DigitallySigned(HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, byte[] bArr) {
        this.hashAlgorithm = hashAlgorithm;
        this.signatureAlgorithm = signatureAlgorithm;
        this.signature = bArr;
    }

    public static DigitallySigned decode(InputStream inputStream) throws SerializationException {
        try {
            return new DigitallySigned(Serialization.readNumber(inputStream, 1), Serialization.readNumber(inputStream, 1), Serialization.readVariableBytes(inputStream, 2));
        } catch (IllegalArgumentException e11) {
            throw new SerializationException(e11);
        }
    }

    public String getAlgorithm() {
        return String.format("%swith%s", this.hashAlgorithm, this.signatureAlgorithm);
    }

    public HashAlgorithm getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public SignatureAlgorithm getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public DigitallySigned(int i11, int i12, byte[] bArr) {
        this(HashAlgorithm.valueOf(i11), SignatureAlgorithm.valueOf(i12), bArr);
    }

    public static DigitallySigned decode(byte[] bArr) throws SerializationException {
        return decode(new ByteArrayInputStream(bArr));
    }
}
