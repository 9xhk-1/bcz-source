package io.ktor.network.tls;

import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTLSAlert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TLSAlert.kt\nio/ktor/network/tls/TLSAlertType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n295#2,2:81\n*S KotlinDebug\n*F\n+ 1 TLSAlert.kt\nio/ktor/network/tls/TLSAlertType\n*L\n69#1:81,2\n*E\n"})
/* loaded from: classes8.dex */
public final class TLSAlertType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ TLSAlertType[] $VALUES;

    @k
    public static final a Companion;

    @k
    private static final TLSAlertType[] byCode;
    private final int code;
    public static final TLSAlertType DecryptionFailed_RESERVED = new TLSAlertType("DecryptionFailed_RESERVED", 0, 21);
    public static final TLSAlertType CloseNotify = new TLSAlertType("CloseNotify", 1, 0);
    public static final TLSAlertType UnexpectedMessage = new TLSAlertType("UnexpectedMessage", 2, 10);
    public static final TLSAlertType BadRecordMac = new TLSAlertType("BadRecordMac", 3, 20);
    public static final TLSAlertType RecordOverflow = new TLSAlertType("RecordOverflow", 4, 22);
    public static final TLSAlertType DecompressionFailure = new TLSAlertType("DecompressionFailure", 5, 30);
    public static final TLSAlertType HandshakeFailure = new TLSAlertType("HandshakeFailure", 6, 40);
    public static final TLSAlertType NoCertificate_RESERVED = new TLSAlertType("NoCertificate_RESERVED", 7, 41);
    public static final TLSAlertType BadCertificate = new TLSAlertType("BadCertificate", 8, 42);
    public static final TLSAlertType UnsupportedCertificate = new TLSAlertType("UnsupportedCertificate", 9, 43);
    public static final TLSAlertType CertificateRevoked = new TLSAlertType("CertificateRevoked", 10, 44);
    public static final TLSAlertType CertificateExpired = new TLSAlertType("CertificateExpired", 11, 45);
    public static final TLSAlertType CertificateUnknown = new TLSAlertType("CertificateUnknown", 12, 46);
    public static final TLSAlertType IllegalParameter = new TLSAlertType("IllegalParameter", 13, 47);
    public static final TLSAlertType UnknownCa = new TLSAlertType("UnknownCa", 14, 48);
    public static final TLSAlertType AccessDenied = new TLSAlertType("AccessDenied", 15, 49);
    public static final TLSAlertType DecodeError = new TLSAlertType("DecodeError", 16, 50);
    public static final TLSAlertType DecryptError = new TLSAlertType("DecryptError", 17, 51);
    public static final TLSAlertType ExportRestriction_RESERVED = new TLSAlertType("ExportRestriction_RESERVED", 18, 60);
    public static final TLSAlertType ProtocolVersion = new TLSAlertType("ProtocolVersion", 19, 70);
    public static final TLSAlertType InsufficientSecurity = new TLSAlertType("InsufficientSecurity", 20, 71);
    public static final TLSAlertType InternalError = new TLSAlertType("InternalError", 21, 80);
    public static final TLSAlertType UserCanceled = new TLSAlertType("UserCanceled", 22, 90);
    public static final TLSAlertType NoRenegotiation = new TLSAlertType("NoRenegotiation", 23, 100);
    public static final TLSAlertType UnsupportedExtension = new TLSAlertType("UnsupportedExtension", 24, 110);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final TLSAlertType a(int i11) {
            TLSAlertType tLSAlertType = (i11 < 0 || i11 >= 256) ? null : TLSAlertType.byCode[i11];
            if (tLSAlertType != null) {
                return tLSAlertType;
            }
            throw new IllegalArgumentException("Invalid TLS record type code: " + i11);
        }

        public a() {
        }
    }

    private static final /* synthetic */ TLSAlertType[] $values() {
        return new TLSAlertType[]{DecryptionFailed_RESERVED, CloseNotify, UnexpectedMessage, BadRecordMac, RecordOverflow, DecompressionFailure, HandshakeFailure, NoCertificate_RESERVED, BadCertificate, UnsupportedCertificate, CertificateRevoked, CertificateExpired, CertificateUnknown, IllegalParameter, UnknownCa, AccessDenied, DecodeError, DecryptError, ExportRestriction_RESERVED, ProtocolVersion, InsufficientSecurity, InternalError, UserCanceled, NoRenegotiation, UnsupportedExtension};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object obj;
        TLSAlertType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
        TLSAlertType[] tLSAlertTypeArr = new TLSAlertType[256];
        for (int i11 = 0; i11 < 256; i11++) {
            Iterator<E> it = getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((TLSAlertType) obj).code == i11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            tLSAlertTypeArr[i11] = obj;
        }
        byCode = tLSAlertTypeArr;
    }

    private TLSAlertType(String str, int i11, int i12) {
        this.code = i12;
    }

    @k
    public static m00.a<TLSAlertType> getEntries() {
        return $ENTRIES;
    }

    public static TLSAlertType valueOf(String str) {
        return (TLSAlertType) Enum.valueOf(TLSAlertType.class, str);
    }

    public static TLSAlertType[] values() {
        return (TLSAlertType[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
