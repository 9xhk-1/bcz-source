package io.ktor.network.tls;

import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTLSHandshakeType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TLSHandshakeType.kt\nio/ktor/network/tls/ServerKeyExchangeType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n295#2,2:91\n*S KotlinDebug\n*F\n+ 1 TLSHandshakeType.kt\nio/ktor/network/tls/ServerKeyExchangeType\n*L\n50#1:91,2\n*E\n"})
/* loaded from: classes8.dex */
public final class ServerKeyExchangeType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ServerKeyExchangeType[] $VALUES;

    @k
    public static final a Companion;

    @k
    private static final ServerKeyExchangeType[] byCode;
    private final int code;
    public static final ServerKeyExchangeType ExplicitPrime = new ServerKeyExchangeType("ExplicitPrime", 0, 1);
    public static final ServerKeyExchangeType ExplicitChar = new ServerKeyExchangeType("ExplicitChar", 1, 2);
    public static final ServerKeyExchangeType NamedCurve = new ServerKeyExchangeType("NamedCurve", 2, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final ServerKeyExchangeType a(int i11) {
            ServerKeyExchangeType serverKeyExchangeType = (i11 < 0 || i11 >= 256) ? null : ServerKeyExchangeType.byCode[i11];
            if (serverKeyExchangeType != null) {
                return serverKeyExchangeType;
            }
            throw new IllegalArgumentException("Invalid TLS ServerKeyExchange type code: " + i11);
        }

        public a() {
        }
    }

    private static final /* synthetic */ ServerKeyExchangeType[] $values() {
        return new ServerKeyExchangeType[]{ExplicitPrime, ExplicitChar, NamedCurve};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object obj;
        ServerKeyExchangeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
        ServerKeyExchangeType[] serverKeyExchangeTypeArr = new ServerKeyExchangeType[256];
        for (int i11 = 0; i11 < 256; i11++) {
            Iterator<E> it = getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ServerKeyExchangeType) obj).code == i11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            serverKeyExchangeTypeArr[i11] = obj;
        }
        byCode = serverKeyExchangeTypeArr;
    }

    private ServerKeyExchangeType(String str, int i11, int i12) {
        this.code = i12;
    }

    @k
    public static m00.a<ServerKeyExchangeType> getEntries() {
        return $ENTRIES;
    }

    public static ServerKeyExchangeType valueOf(String str) {
        return (ServerKeyExchangeType) Enum.valueOf(ServerKeyExchangeType.class, str);
    }

    public static ServerKeyExchangeType[] values() {
        return (ServerKeyExchangeType[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
