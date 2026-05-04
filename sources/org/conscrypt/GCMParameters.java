package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class GCMParameters extends AlgorithmParametersSpi {
    private static final int DEFAULT_TLEN = 96;

    /* renamed from: iv, reason: collision with root package name */
    private byte[] f77774iv;
    private int tLen;

    public GCMParameters() {
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        long j11;
        long j12;
        long j13 = 0;
        try {
            j11 = NativeCrypto.asn1_write_init();
        } catch (IOException e11) {
            e = e11;
            j12 = 0;
        } catch (Throwable th2) {
            th = th2;
            j11 = 0;
        }
        try {
            j13 = NativeCrypto.asn1_write_sequence(j11);
            NativeCrypto.asn1_write_octetstring(j13, this.f77774iv);
            if (this.tLen != 96) {
                NativeCrypto.asn1_write_uint64(j13, r4 / 8);
            }
            byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j11);
            NativeCrypto.asn1_write_free(j13);
            NativeCrypto.asn1_write_free(j11);
            return asn1_write_finish;
        } catch (IOException e12) {
            e = e12;
            j12 = j13;
            j13 = j11;
            try {
                NativeCrypto.asn1_write_cleanup(j13);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                long j14 = j12;
                j11 = j13;
                j13 = j14;
                NativeCrypto.asn1_write_free(j13);
                NativeCrypto.asn1_write_free(j11);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            NativeCrypto.asn1_write_free(j13);
            NativeCrypto.asn1_write_free(j11);
            throw th;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls != null && cls.getName().equals("javax.crypto.spec.GCMParameterSpec")) {
            return cls.cast(Platform.toGCMParameterSpec(this.tLen, this.f77774iv));
        }
        throw new InvalidParameterSpecException("Unsupported class: " + cls);
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        GCMParameters fromGCMParameterSpec = Platform.fromGCMParameterSpec(algorithmParameterSpec);
        if (fromGCMParameterSpec == null) {
            throw new InvalidParameterSpecException("Only GCMParameterSpec is supported");
        }
        this.tLen = fromGCMParameterSpec.tLen;
        this.f77774iv = fromGCMParameterSpec.f77774iv;
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Conscrypt GCM AlgorithmParameters";
    }

    public byte[] getIV() {
        return this.f77774iv;
    }

    public int getTLen() {
        return this.tLen;
    }

    public GCMParameters(int i11, byte[] bArr) {
        this.tLen = i11;
        this.f77774iv = bArr;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        long j11;
        try {
            j11 = NativeCrypto.asn1_read_init(bArr);
            try {
                long asn1_read_sequence = NativeCrypto.asn1_read_sequence(j11);
                byte[] asn1_read_octetstring = NativeCrypto.asn1_read_octetstring(asn1_read_sequence);
                int asn1_read_uint64 = !NativeCrypto.asn1_read_is_empty(asn1_read_sequence) ? ((int) NativeCrypto.asn1_read_uint64(asn1_read_sequence)) * 8 : 96;
                if (NativeCrypto.asn1_read_is_empty(asn1_read_sequence) && NativeCrypto.asn1_read_is_empty(j11)) {
                    this.f77774iv = asn1_read_octetstring;
                    this.tLen = asn1_read_uint64;
                    NativeCrypto.asn1_read_free(asn1_read_sequence);
                    NativeCrypto.asn1_read_free(j11);
                    return;
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th2) {
                th = th2;
                NativeCrypto.asn1_read_free(0L);
                NativeCrypto.asn1_read_free(j11);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j11 = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        if (str != null && !str.equals("ASN.1")) {
            throw new IOException("Unsupported format: " + str);
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (str != null && !str.equals("ASN.1")) {
            throw new IOException("Unsupported format: " + str);
        }
        engineInit(bArr);
    }
}
