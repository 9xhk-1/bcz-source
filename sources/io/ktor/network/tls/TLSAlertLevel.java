package io.ktor.network.tls;

import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTLSAlert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TLSAlert.kt\nio/ktor/network/tls/TLSAlertLevel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n295#2,2:81\n*S KotlinDebug\n*F\n+ 1 TLSAlert.kt\nio/ktor/network/tls/TLSAlertLevel\n*L\n23#1:81,2\n*E\n"})
/* loaded from: classes8.dex */
public final class TLSAlertLevel {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ TLSAlertLevel[] $VALUES;

    @k
    public static final a Companion;

    @k
    private static final TLSAlertLevel[] byCode;
    private final int code;
    public static final TLSAlertLevel WARNING = new TLSAlertLevel("WARNING", 0, 1);
    public static final TLSAlertLevel FATAL = new TLSAlertLevel("FATAL", 1, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final TLSAlertLevel a(int i11) {
            TLSAlertLevel tLSAlertLevel = (i11 < 0 || i11 >= 256) ? null : TLSAlertLevel.byCode[i11];
            if (tLSAlertLevel != null) {
                return tLSAlertLevel;
            }
            throw new IllegalArgumentException("Invalid TLS record type code: " + i11);
        }

        public a() {
        }
    }

    private static final /* synthetic */ TLSAlertLevel[] $values() {
        return new TLSAlertLevel[]{WARNING, FATAL};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object obj;
        TLSAlertLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
        TLSAlertLevel[] tLSAlertLevelArr = new TLSAlertLevel[256];
        for (int i11 = 0; i11 < 256; i11++) {
            Iterator<E> it = getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((TLSAlertLevel) obj).code == i11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            tLSAlertLevelArr[i11] = obj;
        }
        byCode = tLSAlertLevelArr;
    }

    private TLSAlertLevel(String str, int i11, int i12) {
        this.code = i12;
    }

    @k
    public static m00.a<TLSAlertLevel> getEntries() {
        return $ENTRIES;
    }

    public static TLSAlertLevel valueOf(String str) {
        return (TLSAlertLevel) Enum.valueOf(TLSAlertLevel.class, str);
    }

    public static TLSAlertLevel[] values() {
        return (TLSAlertLevel[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
