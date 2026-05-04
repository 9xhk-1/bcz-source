package com.microsoft.thrifty;

import at.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import ts.e;
import w00.g;
import w00.o;
import ws.d;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ThriftException extends RuntimeException implements e {

    @k
    public static final a Companion = new a(null);

    @g
    @k
    public final Kind kind;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Kind {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;

        @k
        public static final a Companion;
        private final int value;
        public static final Kind UNKNOWN = new Kind("UNKNOWN", 0, 0);
        public static final Kind UNKNOWN_METHOD = new Kind("UNKNOWN_METHOD", 1, 1);
        public static final Kind INVALID_MESSAGE_TYPE = new Kind("INVALID_MESSAGE_TYPE", 2, 2);
        public static final Kind WRONG_METHOD_NAME = new Kind("WRONG_METHOD_NAME", 3, 3);
        public static final Kind BAD_SEQUENCE_ID = new Kind("BAD_SEQUENCE_ID", 4, 4);
        public static final Kind MISSING_RESULT = new Kind("MISSING_RESULT", 5, 5);
        public static final Kind INTERNAL_ERROR = new Kind("INTERNAL_ERROR", 6, 6);
        public static final Kind PROTOCOL_ERROR = new Kind("PROTOCOL_ERROR", 7, 7);
        public static final Kind INVALID_TRANSFORM = new Kind("INVALID_TRANSFORM", 8, 8);
        public static final Kind INVALID_PROTOCOL = new Kind("INVALID_PROTOCOL", 9, 9);
        public static final Kind UNSUPPORTED_CLIENT_TYPE = new Kind("UNSUPPORTED_CLIENT_TYPE", 10, 10);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftException.kt\ncom/microsoft/thrifty/ThriftException$Kind$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,133:1\n1282#2,2:134\n*S KotlinDebug\n*F\n+ 1 ThriftException.kt\ncom/microsoft/thrifty/ThriftException$Kind$Companion\n*L\n81#1:134,2\n*E\n"})
        public static final class a {
            public /* synthetic */ a(v vVar) {
                this();
            }

            @o
            @k
            public final Kind a(int i11) {
                Kind kind;
                Kind[] values = Kind.values();
                int length = values.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        kind = null;
                        break;
                    }
                    kind = values[i12];
                    if (kind.getValue() == i11) {
                        break;
                    }
                    i12++;
                }
                return kind == null ? Kind.UNKNOWN : kind;
            }

            public a() {
            }
        }

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{UNKNOWN, UNKNOWN_METHOD, INVALID_MESSAGE_TYPE, WRONG_METHOD_NAME, BAD_SEQUENCE_ID, MISSING_RESULT, INTERNAL_ERROR, PROTOCOL_ERROR, INVALID_TRANSFORM, INVALID_PROTOCOL, UNSUPPORTED_CLIENT_TYPE};
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
            Companion = new a(null);
        }

        private Kind(String str, int i11, int i12) {
            this.value = i12;
        }

        @o
        @k
        public static final Kind findByValue(int i11) {
            return Companion.a(i11);
        }

        @k
        public static m00.a<Kind> getEntries() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @o
        @k
        public final ThriftException a(@k i protocol) {
            g0.p(protocol, "protocol");
            Kind kind = Kind.UNKNOWN;
            protocol.u0();
            String str = null;
            while (true) {
                d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    protocol.I4();
                    return new ThriftException(kind, str);
                }
                short s11 = a62.f96797c;
                if (s11 == 1) {
                    if (b11 == 11) {
                        str = protocol.readString();
                    } else {
                        b.a(protocol, b11);
                    }
                } else if (s11 != 2) {
                    b.a(protocol, b11);
                } else if (b11 == 8) {
                    kind = Kind.Companion.a(protocol.s8());
                } else {
                    b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThriftException(@k Kind kind, @l String str) {
        super(str);
        g0.p(kind, "kind");
        this.kind = kind;
    }

    @o
    @k
    public static final ThriftException read(@k i iVar) {
        return Companion.a(iVar);
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        protocol.g6("TApplicationException");
        String message = getMessage();
        if (message != null) {
            protocol.Q6("message", 1, (byte) 11);
            protocol.p1(message);
            protocol.N2();
        }
        protocol.Q6("type", 2, (byte) 8);
        protocol.l5(this.kind.getValue());
        protocol.N2();
        protocol.r0();
        protocol.E6();
    }
}
