package com.baicizhan.app.biz.game.impl.unity.proto;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class MsgType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MsgType[] $VALUES;
    public static final MsgType Call = new MsgType("Call", 0, 1);
    public static final MsgType CallRsp = new MsgType("CallRsp", 1, 2);
    public static final MsgType OneWay = new MsgType("OneWay", 2, 3);
    private final int value;

    private static final /* synthetic */ MsgType[] $values() {
        return new MsgType[]{Call, CallRsp, OneWay};
    }

    static {
        MsgType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private MsgType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static a<MsgType> getEntries() {
        return $ENTRIES;
    }

    public static MsgType valueOf(String str) {
        return (MsgType) Enum.valueOf(MsgType.class, str);
    }

    public static MsgType[] values() {
        return (MsgType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
