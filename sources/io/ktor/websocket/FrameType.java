package io.ktor.websocket;

import kotlin.jvm.internal.u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFrameType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameType.kt\nio/ktor/websocket/FrameType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1971#2,14:51\n669#2,11:65\n*S KotlinDebug\n*F\n+ 1 FrameType.kt\nio/ktor/websocket/FrameType\n*L\n39#1:51,14\n41#1:65,11\n*E\n"})
/* loaded from: classes8.dex */
public final class FrameType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ FrameType[] $VALUES;

    @m80.k
    public static final a Companion;

    @m80.k
    private static final FrameType[] byOpcodeArray;
    private static final int maxOpcode;
    private final boolean controlFrame;
    private final int opcode;
    public static final FrameType TEXT = new FrameType("TEXT", 0, false, 1);
    public static final FrameType BINARY = new FrameType("BINARY", 1, false, 2);
    public static final FrameType CLOSE = new FrameType("CLOSE", 2, true, 8);
    public static final FrameType PING = new FrameType("PING", 3, true, 9);
    public static final FrameType PONG = new FrameType("PONG", 4, true, 10);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.l
        public final FrameType a(int i11) {
            if (i11 < 0 || i11 > FrameType.maxOpcode) {
                return null;
            }
            return FrameType.byOpcodeArray[i11];
        }

        public a() {
        }
    }

    private static final /* synthetic */ FrameType[] $values() {
        return new FrameType[]{TEXT, BINARY, CLOSE, PING, PONG};
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ab, code lost:
    
        r8 = null;
     */
    static {
        /*
            io.ktor.websocket.FrameType r0 = new io.ktor.websocket.FrameType
            java.lang.String r1 = "TEXT"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r2, r3)
            io.ktor.websocket.FrameType.TEXT = r0
            io.ktor.websocket.FrameType r0 = new io.ktor.websocket.FrameType
            java.lang.String r1 = "BINARY"
            r4 = 2
            r0.<init>(r1, r3, r2, r4)
            io.ktor.websocket.FrameType.BINARY = r0
            io.ktor.websocket.FrameType r0 = new io.ktor.websocket.FrameType
            java.lang.String r1 = "CLOSE"
            r5 = 8
            r0.<init>(r1, r4, r3, r5)
            io.ktor.websocket.FrameType.CLOSE = r0
            io.ktor.websocket.FrameType r0 = new io.ktor.websocket.FrameType
            r1 = 3
            r4 = 9
            java.lang.String r5 = "PING"
            r0.<init>(r5, r1, r3, r4)
            io.ktor.websocket.FrameType.PING = r0
            io.ktor.websocket.FrameType r0 = new io.ktor.websocket.FrameType
            r1 = 4
            r4 = 10
            java.lang.String r5 = "PONG"
            r0.<init>(r5, r1, r3, r4)
            io.ktor.websocket.FrameType.PONG = r0
            io.ktor.websocket.FrameType[] r0 = $values()
            io.ktor.websocket.FrameType.$VALUES = r0
            m00.a r0 = m00.c.c(r0)
            io.ktor.websocket.FrameType.$ENTRIES = r0
            io.ktor.websocket.FrameType$a r0 = new io.ktor.websocket.FrameType$a
            r1 = 0
            r0.<init>(r1)
            io.ktor.websocket.FrameType.Companion = r0
            m00.a r0 = getEntries()
            java.util.Iterator r0 = r0.iterator()
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L5c
            r4 = r1
            goto L7f
        L5c:
            java.lang.Object r4 = r0.next()
            boolean r5 = r0.hasNext()
            if (r5 != 0) goto L67
            goto L7f
        L67:
            r5 = r4
            io.ktor.websocket.FrameType r5 = (io.ktor.websocket.FrameType) r5
            int r5 = r5.opcode
        L6c:
            java.lang.Object r6 = r0.next()
            r7 = r6
            io.ktor.websocket.FrameType r7 = (io.ktor.websocket.FrameType) r7
            int r7 = r7.opcode
            if (r5 >= r7) goto L79
            r4 = r6
            r5 = r7
        L79:
            boolean r6 = r0.hasNext()
            if (r6 != 0) goto L6c
        L7f:
            kotlin.jvm.internal.g0.m(r4)
            io.ktor.websocket.FrameType r4 = (io.ktor.websocket.FrameType) r4
            int r0 = r4.opcode
            io.ktor.websocket.FrameType.maxOpcode = r0
            int r0 = r0 + r3
            io.ktor.websocket.FrameType[] r4 = new io.ktor.websocket.FrameType[r0]
            r5 = r2
        L8c:
            if (r5 >= r0) goto Lb8
            m00.a r6 = getEntries()
            java.util.Iterator r6 = r6.iterator()
            r8 = r1
            r7 = r2
        L98:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto Lb0
            java.lang.Object r9 = r6.next()
            r10 = r9
            io.ktor.websocket.FrameType r10 = (io.ktor.websocket.FrameType) r10
            int r10 = r10.opcode
            if (r10 != r5) goto L98
            if (r7 == 0) goto Lad
        Lab:
            r8 = r1
            goto Lb3
        Lad:
            r7 = r3
            r8 = r9
            goto L98
        Lb0:
            if (r7 != 0) goto Lb3
            goto Lab
        Lb3:
            r4[r5] = r8
            int r5 = r5 + 1
            goto L8c
        Lb8:
            io.ktor.websocket.FrameType.byOpcodeArray = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.FrameType.<clinit>():void");
    }

    private FrameType(String str, int i11, boolean z11, int i12) {
        this.controlFrame = z11;
        this.opcode = i12;
    }

    @m80.k
    public static m00.a<FrameType> getEntries() {
        return $ENTRIES;
    }

    public static FrameType valueOf(String str) {
        return (FrameType) Enum.valueOf(FrameType.class, str);
    }

    public static FrameType[] values() {
        return (FrameType[]) $VALUES.clone();
    }

    public final boolean getControlFrame() {
        return this.controlFrame;
    }

    public final int getOpcode() {
        return this.opcode;
    }
}
