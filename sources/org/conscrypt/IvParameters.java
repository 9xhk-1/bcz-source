package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class IvParameters extends AlgorithmParametersSpi {

    /* renamed from: iv, reason: collision with root package name */
    private byte[] f77775iv;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AES extends IvParameters {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ChaCha20 extends IvParameters {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DESEDE extends IvParameters {
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        long j11 = 0;
        try {
            try {
                j11 = NativeCrypto.asn1_write_init();
                NativeCrypto.asn1_write_octetstring(j11, this.f77775iv);
                return NativeCrypto.asn1_write_finish(j11);
            } catch (IOException e11) {
                NativeCrypto.asn1_write_cleanup(j11);
                throw e11;
            }
        } finally {
            NativeCrypto.asn1_write_free(j11);
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.f77775iv);
        }
        throw new InvalidParameterSpecException("Incompatible AlgorithmParametersSpec class: " + cls);
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
            throw new InvalidParameterSpecException("Only IvParameterSpec is supported");
        }
        this.f77775iv = (byte[]) ((IvParameterSpec) algorithmParameterSpec).getIV().clone();
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Conscrypt IV AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        long j11;
        try {
            j11 = NativeCrypto.asn1_read_init(bArr);
            try {
                byte[] asn1_read_octetstring = NativeCrypto.asn1_read_octetstring(j11);
                if (NativeCrypto.asn1_read_is_empty(j11)) {
                    this.f77775iv = asn1_read_octetstring;
                    NativeCrypto.asn1_read_free(j11);
                    return;
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th2) {
                th = th2;
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
            if (str.equals("RAW")) {
                return (byte[]) this.f77775iv.clone();
            }
            throw new IOException("Unsupported format: " + str);
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (str != null && !str.equals("ASN.1")) {
            if (str.equals("RAW")) {
                this.f77775iv = (byte[]) bArr.clone();
                return;
            }
            throw new IOException("Unsupported format: " + str);
        }
        engineInit(bArr);
    }
}
