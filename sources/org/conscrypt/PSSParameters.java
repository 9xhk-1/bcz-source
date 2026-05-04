package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class PSSParameters extends AlgorithmParametersSpi {
    private PSSParameterSpec spec = PSSParameterSpec.DEFAULT;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        long j11;
        Throwable th2;
        long j12;
        IOException e11;
        long j13 = 0;
        try {
            try {
                j12 = NativeCrypto.asn1_write_init();
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                long asn1_write_sequence = NativeCrypto.asn1_write_sequence(j12);
                try {
                    OAEPParameters.writeHashAndMgfHash(asn1_write_sequence, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                    if (this.spec.getSaltLength() != 20) {
                        try {
                            j13 = NativeCrypto.asn1_write_tag(asn1_write_sequence, 2);
                            NativeCrypto.asn1_write_uint64(j13, this.spec.getSaltLength());
                            NativeCrypto.asn1_write_flush(asn1_write_sequence);
                            NativeCrypto.asn1_write_free(j13);
                        } catch (Throwable th4) {
                            NativeCrypto.asn1_write_flush(asn1_write_sequence);
                            NativeCrypto.asn1_write_free(j13);
                            throw th4;
                        }
                    }
                    byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j12);
                    NativeCrypto.asn1_write_free(asn1_write_sequence);
                    NativeCrypto.asn1_write_free(j12);
                    return asn1_write_finish;
                } catch (IOException e12) {
                    e11 = e12;
                    NativeCrypto.asn1_write_cleanup(j12);
                    throw e11;
                }
            } catch (IOException e13) {
                e11 = e13;
            } catch (Throwable th5) {
                th2 = th5;
                j11 = 0;
                NativeCrypto.asn1_write_free(j11);
                NativeCrypto.asn1_write_free(j12);
                throw th2;
            }
        } catch (IOException e14) {
            e11 = e14;
            j12 = 0;
        } catch (Throwable th6) {
            j11 = 0;
            th2 = th6;
            j12 = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls != null && cls == PSSParameterSpec.class) {
            return this.spec;
        }
        throw new InvalidParameterSpecException("Unsupported class: " + cls);
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            throw new InvalidParameterSpecException("Only PSSParameterSpec is supported");
        }
        this.spec = (PSSParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Conscrypt PSS AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        Throwable th2;
        long j11;
        long asn1_read_tagged;
        int asn1_read_uint64;
        long j12 = 0;
        try {
            j11 = NativeCrypto.asn1_read_init(bArr);
            try {
                long asn1_read_sequence = NativeCrypto.asn1_read_sequence(j11);
                try {
                    String readHash = OAEPParameters.readHash(asn1_read_sequence);
                    String readMgfHash = OAEPParameters.readMgfHash(asn1_read_sequence);
                    if (NativeCrypto.asn1_read_next_tag_is(asn1_read_sequence, 2)) {
                        try {
                            asn1_read_tagged = NativeCrypto.asn1_read_tagged(asn1_read_sequence);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            asn1_read_uint64 = (int) NativeCrypto.asn1_read_uint64(asn1_read_tagged);
                            NativeCrypto.asn1_read_free(asn1_read_tagged);
                        } catch (Throwable th4) {
                            th = th4;
                            j12 = asn1_read_tagged;
                            throw th;
                        }
                    } else {
                        asn1_read_uint64 = 20;
                    }
                    int i11 = asn1_read_uint64;
                    if (NativeCrypto.asn1_read_next_tag_is(asn1_read_sequence, 3)) {
                        try {
                            j12 = NativeCrypto.asn1_read_tagged(asn1_read_sequence);
                            long asn1_read_uint642 = (int) NativeCrypto.asn1_read_uint64(j12);
                            NativeCrypto.asn1_read_free(j12);
                            if (asn1_read_uint642 != 1) {
                                throw new IOException("Error reading ASN.1 encoding");
                            }
                        } finally {
                            NativeCrypto.asn1_read_free(j12);
                        }
                    }
                    if (NativeCrypto.asn1_read_is_empty(asn1_read_sequence) && NativeCrypto.asn1_read_is_empty(j11)) {
                        this.spec = new PSSParameterSpec(readHash, "MGF1", new MGF1ParameterSpec(readMgfHash), i11, 1);
                        NativeCrypto.asn1_read_free(asn1_read_sequence);
                        NativeCrypto.asn1_read_free(j11);
                        return;
                    }
                    throw new IOException("Error reading ASN.1 encoding");
                } catch (Throwable th5) {
                    th2 = th5;
                    j12 = asn1_read_sequence;
                    NativeCrypto.asn1_read_free(j12);
                    NativeCrypto.asn1_read_free(j11);
                    throw th2;
                }
            } catch (Throwable th6) {
                th2 = th6;
            }
        } catch (Throwable th7) {
            th2 = th7;
            j11 = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        if (str != null && !str.equals("ASN.1") && !str.equals("X.509")) {
            throw new IOException("Unsupported format: " + str);
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (str != null && !str.equals("ASN.1") && !str.equals("X.509")) {
            throw new IOException("Unsupported format: " + str);
        }
        engineInit(bArr);
    }
}
