package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class OAEPParameters extends AlgorithmParametersSpi {
    private static final String MGF1_OID = "1.2.840.113549.1.1.8";
    private static final Map<String, String> NAME_TO_OID;
    private static final Map<String, String> OID_TO_NAME;
    private static final String PSPECIFIED_OID = "1.2.840.113549.1.1.9";
    private OAEPParameterSpec spec = OAEPParameterSpec.DEFAULT;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        HashMap hashMap = new HashMap();
        OID_TO_NAME = hashMap;
        NAME_TO_OID = new HashMap();
        hashMap.put("1.3.14.3.2.26", "SHA-1");
        hashMap.put("2.16.840.1.101.3.4.2.4", "SHA-224");
        hashMap.put("2.16.840.1.101.3.4.2.1", "SHA-256");
        hashMap.put("2.16.840.1.101.3.4.2.2", "SHA-384");
        hashMap.put("2.16.840.1.101.3.4.2.3", "SHA-512");
        for (Map.Entry entry : hashMap.entrySet()) {
            NAME_TO_OID.put(entry.getValue(), entry.getKey());
        }
    }

    private static String getHashName(long j11) throws IOException {
        long j12;
        try {
            j12 = NativeCrypto.asn1_read_sequence(j11);
            try {
                String asn1_read_oid = NativeCrypto.asn1_read_oid(j12);
                if (!NativeCrypto.asn1_read_is_empty(j12)) {
                    NativeCrypto.asn1_read_null(j12);
                }
                if (NativeCrypto.asn1_read_is_empty(j12)) {
                    Map<String, String> map = OID_TO_NAME;
                    if (map.containsKey(asn1_read_oid)) {
                        String str = map.get(asn1_read_oid);
                        NativeCrypto.asn1_read_free(j12);
                        return str;
                    }
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th2) {
                th = th2;
                NativeCrypto.asn1_read_free(j12);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j12 = 0;
        }
    }

    public static String readHash(long j11) throws IOException {
        long j12;
        if (!NativeCrypto.asn1_read_next_tag_is(j11, 0)) {
            return "SHA-1";
        }
        try {
            j12 = NativeCrypto.asn1_read_tagged(j11);
            try {
                String hashName = getHashName(j12);
                NativeCrypto.asn1_read_free(j12);
                return hashName;
            } catch (Throwable th2) {
                th = th2;
                NativeCrypto.asn1_read_free(j12);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j12 = 0;
        }
    }

    public static String readMgfHash(long j11) throws IOException {
        long j12;
        if (!NativeCrypto.asn1_read_next_tag_is(j11, 1)) {
            return "SHA-1";
        }
        try {
            j12 = NativeCrypto.asn1_read_tagged(j11);
            try {
                long asn1_read_sequence = NativeCrypto.asn1_read_sequence(j12);
                if (!NativeCrypto.asn1_read_oid(asn1_read_sequence).equals(MGF1_OID)) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
                String hashName = getHashName(asn1_read_sequence);
                if (!NativeCrypto.asn1_read_is_empty(asn1_read_sequence)) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
                NativeCrypto.asn1_read_free(asn1_read_sequence);
                NativeCrypto.asn1_read_free(j12);
                return hashName;
            } catch (Throwable th2) {
                th = th2;
                NativeCrypto.asn1_read_free(0L);
                NativeCrypto.asn1_read_free(j12);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j12 = 0;
        }
    }

    private static long writeAlgorithmIdentifier(long j11, String str) throws IOException {
        long j12;
        try {
            j12 = NativeCrypto.asn1_write_sequence(j11);
        } catch (IOException e11) {
            e = e11;
            j12 = 0;
        }
        try {
            NativeCrypto.asn1_write_oid(j12, str);
            return j12;
        } catch (IOException e12) {
            e = e12;
            NativeCrypto.asn1_write_free(j12);
            throw e;
        }
    }

    public static void writeHashAndMgfHash(long j11, String str, MGF1ParameterSpec mGF1ParameterSpec) throws IOException {
        long j12;
        long j13;
        long j14;
        long j15 = 0;
        if (!str.equals("SHA-1")) {
            try {
                j14 = NativeCrypto.asn1_write_tag(j11, 0);
                try {
                    long writeAlgorithmIdentifier = writeAlgorithmIdentifier(j14, NAME_TO_OID.get(str));
                    try {
                        NativeCrypto.asn1_write_null(writeAlgorithmIdentifier);
                        NativeCrypto.asn1_write_flush(j11);
                        NativeCrypto.asn1_write_free(writeAlgorithmIdentifier);
                        NativeCrypto.asn1_write_free(j14);
                    } catch (Throwable th2) {
                        th = th2;
                        j15 = writeAlgorithmIdentifier;
                        NativeCrypto.asn1_write_flush(j11);
                        NativeCrypto.asn1_write_free(j15);
                        NativeCrypto.asn1_write_free(j14);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                j14 = 0;
            }
        }
        if (mGF1ParameterSpec.getDigestAlgorithm().equals("SHA-1")) {
            return;
        }
        try {
            j12 = NativeCrypto.asn1_write_tag(j11, 1);
            try {
                j13 = writeAlgorithmIdentifier(j12, MGF1_OID);
            } catch (Throwable th5) {
                th = th5;
                j13 = 0;
            }
        } catch (Throwable th6) {
            th = th6;
            j12 = 0;
            j13 = 0;
        }
        try {
            j15 = writeAlgorithmIdentifier(j13, NAME_TO_OID.get(mGF1ParameterSpec.getDigestAlgorithm()));
            NativeCrypto.asn1_write_null(j15);
            NativeCrypto.asn1_write_flush(j11);
            NativeCrypto.asn1_write_free(j15);
            NativeCrypto.asn1_write_free(j13);
            NativeCrypto.asn1_write_free(j12);
        } catch (Throwable th7) {
            th = th7;
            NativeCrypto.asn1_write_flush(j11);
            NativeCrypto.asn1_write_free(j15);
            NativeCrypto.asn1_write_free(j13);
            NativeCrypto.asn1_write_free(j12);
            throw th;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        long j11;
        Throwable th2;
        long j12;
        IOException e11;
        long j13;
        long j14 = 0;
        try {
            try {
                j12 = NativeCrypto.asn1_write_init();
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                long asn1_write_sequence = NativeCrypto.asn1_write_sequence(j12);
                try {
                    writeHashAndMgfHash(asn1_write_sequence, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                    PSource.PSpecified pSpecified = (PSource.PSpecified) this.spec.getPSource();
                    if (pSpecified.getValue().length != 0) {
                        try {
                            j13 = NativeCrypto.asn1_write_tag(asn1_write_sequence, 2);
                            try {
                                j14 = writeAlgorithmIdentifier(j13, PSPECIFIED_OID);
                                NativeCrypto.asn1_write_octetstring(j14, pSpecified.getValue());
                                NativeCrypto.asn1_write_flush(asn1_write_sequence);
                                NativeCrypto.asn1_write_free(j14);
                                NativeCrypto.asn1_write_free(j13);
                            } catch (Throwable th4) {
                                th = th4;
                                NativeCrypto.asn1_write_flush(asn1_write_sequence);
                                NativeCrypto.asn1_write_free(j14);
                                NativeCrypto.asn1_write_free(j13);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            j13 = 0;
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
            } catch (Throwable th6) {
                th2 = th6;
                j11 = 0;
                NativeCrypto.asn1_write_free(j11);
                NativeCrypto.asn1_write_free(j12);
                throw th2;
            }
        } catch (IOException e14) {
            e11 = e14;
            j12 = 0;
        } catch (Throwable th7) {
            j11 = 0;
            th2 = th7;
            j12 = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls != null && cls == OAEPParameterSpec.class) {
            return this.spec;
        }
        throw new InvalidParameterSpecException("Unsupported class: " + cls);
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new InvalidParameterSpecException("Only OAEPParameterSpec is supported");
        }
        this.spec = (OAEPParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Conscrypt OAEP AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        long j11;
        long j12;
        long j13 = 0;
        try {
            j11 = NativeCrypto.asn1_read_init(bArr);
            try {
                long asn1_read_sequence = NativeCrypto.asn1_read_sequence(j11);
                try {
                    PSource.PSpecified pSpecified = PSource.PSpecified.DEFAULT;
                    String readHash = readHash(asn1_read_sequence);
                    String readMgfHash = readMgfHash(asn1_read_sequence);
                    if (NativeCrypto.asn1_read_next_tag_is(asn1_read_sequence, 2)) {
                        try {
                            j12 = NativeCrypto.asn1_read_tagged(asn1_read_sequence);
                            try {
                                long asn1_read_sequence2 = NativeCrypto.asn1_read_sequence(j12);
                                if (NativeCrypto.asn1_read_oid(asn1_read_sequence2).equals(PSPECIFIED_OID)) {
                                    pSpecified = new PSource.PSpecified(NativeCrypto.asn1_read_octetstring(asn1_read_sequence2));
                                    if (NativeCrypto.asn1_read_is_empty(asn1_read_sequence2)) {
                                        NativeCrypto.asn1_read_free(asn1_read_sequence2);
                                        NativeCrypto.asn1_read_free(j12);
                                    } else {
                                        throw new IOException("Error reading ASN.1 encoding");
                                    }
                                } else {
                                    throw new IOException("Error reading ASN.1 encoding");
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                NativeCrypto.asn1_read_free(0L);
                                NativeCrypto.asn1_read_free(j12);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j12 = 0;
                        }
                    }
                    if (NativeCrypto.asn1_read_is_empty(asn1_read_sequence) && NativeCrypto.asn1_read_is_empty(j11)) {
                        this.spec = new OAEPParameterSpec(readHash, "MGF1", new MGF1ParameterSpec(readMgfHash), pSpecified);
                        NativeCrypto.asn1_read_free(asn1_read_sequence);
                        NativeCrypto.asn1_read_free(j11);
                        return;
                    }
                    throw new IOException("Error reading ASN.1 encoding");
                } catch (Throwable th4) {
                    th = th4;
                    j13 = asn1_read_sequence;
                    NativeCrypto.asn1_read_free(j13);
                    NativeCrypto.asn1_read_free(j11);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
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
