package com.baicizhan.app.biz.game.model;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class RoundCate {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ RoundCate[] $VALUES;
    public static final RoundCate Default = new RoundCate("Default", 0, 0);
    public static final RoundCate NewUserGame = new RoundCate("NewUserGame", 1, 1);
    private final int value;

    private static final /* synthetic */ RoundCate[] $values() {
        return new RoundCate[]{Default, NewUserGame};
    }

    static {
        RoundCate[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private RoundCate(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<RoundCate> getEntries() {
        return $ENTRIES;
    }

    public static RoundCate valueOf(String str) {
        return (RoundCate) Enum.valueOf(RoundCate.class, str);
    }

    public static RoundCate[] values() {
        return (RoundCate[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
