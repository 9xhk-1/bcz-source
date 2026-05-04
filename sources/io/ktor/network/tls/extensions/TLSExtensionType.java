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
public final class TLSExtensionType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ TLSExtensionType[] $VALUES;

    @k
    public static final a Companion;
    private final short code;
    public static final TLSExtensionType SERVER_NAME = new TLSExtensionType("SERVER_NAME", 0, 0);
    public static final TLSExtensionType MAX_FRAGMENT_LENGTH = new TLSExtensionType("MAX_FRAGMENT_LENGTH", 1, 1);
    public static final TLSExtensionType CLIENT_CERTIFICATE_URL = new TLSExtensionType("CLIENT_CERTIFICATE_URL", 2, 2);
    public static final TLSExtensionType TRUSTED_CA_KEYS = new TLSExtensionType("TRUSTED_CA_KEYS", 3, 3);
    public static final TLSExtensionType TRUNCATED_HMAC = new TLSExtensionType("TRUNCATED_HMAC", 4, 4);
    public static final TLSExtensionType STATUS_REQUEST = new TLSExtensionType("STATUS_REQUEST", 5, 5);
    public static final TLSExtensionType ELLIPTIC_CURVES = new TLSExtensionType("ELLIPTIC_CURVES", 6, 10);
    public static final TLSExtensionType EC_POINT_FORMAT = new TLSExtensionType("EC_POINT_FORMAT", 7, 11);
    public static final TLSExtensionType SIGNATURE_ALGORITHMS = new TLSExtensionType("SIGNATURE_ALGORITHMS", 8, 13);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTLSExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TLSExtension.kt\nio/ktor/network/tls/extensions/TLSExtensionType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final TLSExtensionType a(int i11) {
            Object obj;
            Iterator<E> it = TLSExtensionType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((TLSExtensionType) obj).getCode() == ((short) i11)) {
                    break;
                }
            }
            TLSExtensionType tLSExtensionType = (TLSExtensionType) obj;
            if (tLSExtensionType != null) {
                return tLSExtensionType;
            }
            throw new TLSException("Unknown server hello extension type: " + i11, null, 2, null);
        }

        public a() {
        }
    }

    private static final /* synthetic */ TLSExtensionType[] $values() {
        return new TLSExtensionType[]{SERVER_NAME, MAX_FRAGMENT_LENGTH, CLIENT_CERTIFICATE_URL, TRUSTED_CA_KEYS, TRUNCATED_HMAC, STATUS_REQUEST, ELLIPTIC_CURVES, EC_POINT_FORMAT, SIGNATURE_ALGORITHMS};
    }

    static {
        TLSExtensionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private TLSExtensionType(String str, int i11, short s11) {
        this.code = s11;
    }

    @k
    public static m00.a<TLSExtensionType> getEntries() {
        return $ENTRIES;
    }

    public static TLSExtensionType valueOf(String str) {
        return (TLSExtensionType) Enum.valueOf(TLSExtensionType.class, str);
    }

    public static TLSExtensionType[] values() {
        return (TLSExtensionType[]) $VALUES.clone();
    }

    public final short getCode() {
        return this.code;
    }
}
