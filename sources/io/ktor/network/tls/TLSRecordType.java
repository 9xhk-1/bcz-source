package io.ktor.network.tls;

import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTLSRecordType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TLSRecordType.kt\nio/ktor/network/tls/TLSRecordType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n295#2,2:31\n*S KotlinDebug\n*F\n+ 1 TLSRecordType.kt\nio/ktor/network/tls/TLSRecordType\n*L\n19#1:31,2\n*E\n"})
/* loaded from: classes8.dex */
public final class TLSRecordType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ TLSRecordType[] $VALUES;

    @k
    public static final a Companion;

    @k
    private static final TLSRecordType[] byCode;
    private final int code;
    public static final TLSRecordType ChangeCipherSpec = new TLSRecordType("ChangeCipherSpec", 0, 20);
    public static final TLSRecordType Alert = new TLSRecordType("Alert", 1, 21);
    public static final TLSRecordType Handshake = new TLSRecordType("Handshake", 2, 22);
    public static final TLSRecordType ApplicationData = new TLSRecordType("ApplicationData", 3, 23);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final TLSRecordType a(int i11) {
            TLSRecordType tLSRecordType = (i11 < 0 || i11 >= 256) ? null : TLSRecordType.byCode[i11];
            if (tLSRecordType != null) {
                return tLSRecordType;
            }
            throw new IllegalArgumentException("Invalid TLS record type code: " + i11);
        }

        public a() {
        }
    }

    private static final /* synthetic */ TLSRecordType[] $values() {
        return new TLSRecordType[]{ChangeCipherSpec, Alert, Handshake, ApplicationData};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object obj;
        TLSRecordType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
        TLSRecordType[] tLSRecordTypeArr = new TLSRecordType[256];
        for (int i11 = 0; i11 < 256; i11++) {
            Iterator<E> it = getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((TLSRecordType) obj).code == i11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            tLSRecordTypeArr[i11] = obj;
        }
        byCode = tLSRecordTypeArr;
    }

    private TLSRecordType(String str, int i11, int i12) {
        this.code = i12;
    }

    @k
    public static m00.a<TLSRecordType> getEntries() {
        return $ENTRIES;
    }

    public static TLSRecordType valueOf(String str) {
        return (TLSRecordType) Enum.valueOf(TLSRecordType.class, str);
    }

    public static TLSRecordType[] values() {
        return (TLSRecordType[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
