package com.baicizhan.app.biz.game.impl.unity.proto;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class MsgCode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MsgCode[] $VALUES;
    private final int value;
    public static final MsgCode Success = new MsgCode("Success", 0, 0);
    public static final MsgCode DataError = new MsgCode("DataError", 1, 400);
    public static final MsgCode CommandNotFound = new MsgCode("CommandNotFound", 2, 404);
    public static final MsgCode InnerError = new MsgCode("InnerError", 3, 500);

    private static final /* synthetic */ MsgCode[] $values() {
        return new MsgCode[]{Success, DataError, CommandNotFound, InnerError};
    }

    static {
        MsgCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private MsgCode(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static a<MsgCode> getEntries() {
        return $ENTRIES;
    }

    public static MsgCode valueOf(String str) {
        return (MsgCode) Enum.valueOf(MsgCode.class, str);
    }

    public static MsgCode[] values() {
        return (MsgCode[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
