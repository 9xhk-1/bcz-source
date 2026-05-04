package com.baicizhan.app.biz.game.model;

import androidx.compose.material.TextFieldImplKt;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class RankType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ RankType[] $VALUES;
    private final int value;
    public static final RankType None = new RankType("None", 0, 0);
    public static final RankType Up = new RankType("Up", 1, 1);
    public static final RankType Default = new RankType("Default", 2, 2);
    public static final RankType Down = new RankType("Down", 3, 3);
    public static final RankType Hint = new RankType(TextFieldImplKt.PlaceholderId, 4, 4);

    private static final /* synthetic */ RankType[] $values() {
        return new RankType[]{None, Up, Default, Down, Hint};
    }

    static {
        RankType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private RankType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<RankType> getEntries() {
        return $ENTRIES;
    }

    public static RankType valueOf(String str) {
        return (RankType) Enum.valueOf(RankType.class, str);
    }

    public static RankType[] values() {
        return (RankType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
