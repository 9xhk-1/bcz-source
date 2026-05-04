package io.ktor.websocket;

import a00.k1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class CloseReason {

    /* renamed from: a, reason: collision with root package name */
    public final short f62312a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f62313b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCloseReason.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseReason.kt\nio/ktor/websocket/CloseReason$Codes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1202#2,2:74\n1230#2,4:76\n*S KotlinDebug\n*F\n+ 1 CloseReason.kt\nio/ktor/websocket/CloseReason$Codes\n*L\n51#1:74,2\n51#1:76,4\n*E\n"})
    public static final class Codes {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Codes[] $VALUES;

        @m80.k
        public static final a Companion;

        @w00.g
        @m80.k
        public static final Codes UNEXPECTED_CONDITION;

        @m80.k
        private static final Map<Short, Codes> byCodeMap;
        private final short code;
        public static final Codes NORMAL = new Codes("NORMAL", 0, 1000);
        public static final Codes GOING_AWAY = new Codes("GOING_AWAY", 1, 1001);
        public static final Codes PROTOCOL_ERROR = new Codes("PROTOCOL_ERROR", 2, 1002);
        public static final Codes CANNOT_ACCEPT = new Codes("CANNOT_ACCEPT", 3, 1003);

        @yz.n(message = "This code MUST NOT be set as a status code in a Close control frame by an endpoint")
        @io.ktor.utils.io.b0
        public static final Codes CLOSED_ABNORMALLY = new Codes("CLOSED_ABNORMALLY", 4, 1006);
        public static final Codes NOT_CONSISTENT = new Codes("NOT_CONSISTENT", 5, 1007);
        public static final Codes VIOLATED_POLICY = new Codes("VIOLATED_POLICY", 6, 1008);
        public static final Codes TOO_BIG = new Codes("TOO_BIG", 7, 1009);
        public static final Codes NO_EXTENSION = new Codes("NO_EXTENSION", 8, 1010);
        public static final Codes INTERNAL_ERROR = new Codes("INTERNAL_ERROR", 9, 1011);
        public static final Codes SERVICE_RESTART = new Codes("SERVICE_RESTART", 10, 1012);
        public static final Codes TRY_AGAIN_LATER = new Codes("TRY_AGAIN_LATER", 11, 1013);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.l
            public final Codes a(short s11) {
                return (Codes) Codes.byCodeMap.get(Short.valueOf(s11));
            }

            public a() {
            }

            @yz.n(level = DeprecationLevel.ERROR, message = "Use INTERNAL_ERROR instead.", replaceWith = @w0(expression = "INTERNAL_ERROR", imports = {"io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR"}))
            public static /* synthetic */ void b() {
            }
        }

        private static final /* synthetic */ Codes[] $values() {
            return new Codes[]{NORMAL, GOING_AWAY, PROTOCOL_ERROR, CANNOT_ACCEPT, CLOSED_ABNORMALLY, NOT_CONSISTENT, VIOLATED_POLICY, TOO_BIG, NO_EXTENSION, INTERNAL_ERROR, SERVICE_RESTART, TRY_AGAIN_LATER};
        }

        static {
            Codes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
            Companion = new a(null);
            m00.a<Codes> entries = getEntries();
            LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(a00.i0.d0(entries, 10)), 16));
            for (Object obj : entries) {
                linkedHashMap.put(Short.valueOf(((Codes) obj).code), obj);
            }
            byCodeMap = linkedHashMap;
            UNEXPECTED_CONDITION = INTERNAL_ERROR;
        }

        private Codes(String str, int i11, short s11) {
            this.code = s11;
        }

        @m80.k
        public static m00.a<Codes> getEntries() {
            return $ENTRIES;
        }

        public static Codes valueOf(String str) {
            return (Codes) Enum.valueOf(Codes.class, str);
        }

        public static Codes[] values() {
            return (Codes[]) $VALUES.clone();
        }

        public final short getCode() {
            return this.code;
        }
    }

    public CloseReason(short s11, @m80.k String message) {
        kotlin.jvm.internal.g0.p(message, "message");
        this.f62312a = s11;
        this.f62313b = message;
    }

    public static /* synthetic */ CloseReason d(CloseReason closeReason, short s11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            s11 = closeReason.f62312a;
        }
        if ((i11 & 2) != 0) {
            str = closeReason.f62313b;
        }
        return closeReason.c(s11, str);
    }

    public final short a() {
        return this.f62312a;
    }

    @m80.k
    public final String b() {
        return this.f62313b;
    }

    @m80.k
    public final CloseReason c(short s11, @m80.k String message) {
        kotlin.jvm.internal.g0.p(message, "message");
        return new CloseReason(s11, message);
    }

    public final short e() {
        return this.f62312a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseReason)) {
            return false;
        }
        CloseReason closeReason = (CloseReason) obj;
        return this.f62312a == closeReason.f62312a && kotlin.jvm.internal.g0.g(this.f62313b, closeReason.f62313b);
    }

    @m80.l
    public final Codes f() {
        return Codes.Companion.a(this.f62312a);
    }

    @m80.k
    public final String g() {
        return this.f62313b;
    }

    public int hashCode() {
        return (Short.hashCode(this.f62312a) * 31) + this.f62313b.hashCode();
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CloseReason(reason=");
        Object f11 = f();
        if (f11 == null) {
            f11 = Short.valueOf(this.f62312a);
        }
        sb2.append(f11);
        sb2.append(", message=");
        sb2.append(this.f62313b);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseReason(@m80.k Codes code, @m80.k String message) {
        this(code.getCode(), message);
        kotlin.jvm.internal.g0.p(code, "code");
        kotlin.jvm.internal.g0.p(message, "message");
    }
}
