package io.ktor.utils.io.core;

import jz.f;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ByteOrder {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ByteOrder[] $VALUES;
    public static final ByteOrder BIG_ENDIAN;

    @k
    public static final a Companion;
    public static final ByteOrder LITTLE_ENDIAN;

    /* renamed from: native, reason: not valid java name */
    @k
    private static final ByteOrder f1050native;

    @k
    private final java.nio.ByteOrder nioOrder;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final ByteOrder a() {
            return ByteOrder.f1050native;
        }

        @k
        public final ByteOrder b(@k java.nio.ByteOrder nioOrder) {
            ByteOrder b11;
            g0.p(nioOrder, "nioOrder");
            b11 = f.b(nioOrder);
            return b11;
        }

        public a() {
        }
    }

    private static final /* synthetic */ ByteOrder[] $values() {
        return new ByteOrder[]{BIG_ENDIAN, LITTLE_ENDIAN};
    }

    static {
        ByteOrder b11;
        java.nio.ByteOrder BIG_ENDIAN2 = java.nio.ByteOrder.BIG_ENDIAN;
        g0.o(BIG_ENDIAN2, "BIG_ENDIAN");
        BIG_ENDIAN = new ByteOrder("BIG_ENDIAN", 0, BIG_ENDIAN2);
        java.nio.ByteOrder LITTLE_ENDIAN2 = java.nio.ByteOrder.LITTLE_ENDIAN;
        g0.o(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
        LITTLE_ENDIAN = new ByteOrder("LITTLE_ENDIAN", 1, LITTLE_ENDIAN2);
        ByteOrder[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
        java.nio.ByteOrder nativeOrder = java.nio.ByteOrder.nativeOrder();
        g0.o(nativeOrder, "nativeOrder(...)");
        b11 = f.b(nativeOrder);
        f1050native = b11;
    }

    private ByteOrder(String str, int i11, java.nio.ByteOrder byteOrder) {
        this.nioOrder = byteOrder;
    }

    @k
    public static m00.a<ByteOrder> getEntries() {
        return $ENTRIES;
    }

    public static ByteOrder valueOf(String str) {
        return (ByteOrder) Enum.valueOf(ByteOrder.class, str);
    }

    public static ByteOrder[] values() {
        return (ByteOrder[]) $VALUES.clone();
    }

    @k
    public final java.nio.ByteOrder getNioOrder() {
        return this.nioOrder;
    }
}
