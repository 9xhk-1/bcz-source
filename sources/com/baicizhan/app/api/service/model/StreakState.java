package com.baicizhan.app.api.service.model;

import androidx.compose.material.TextFieldImplKt;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class StreakState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StreakState[] $VALUES;
    public static final StreakState Hint = new StreakState(TextFieldImplKt.PlaceholderId, 0);
    public static final StreakState Winning = new StreakState("Winning", 1);
    public static final StreakState Default = new StreakState("Default", 2);

    private static final /* synthetic */ StreakState[] $values() {
        return new StreakState[]{Hint, Winning, Default};
    }

    static {
        StreakState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private StreakState(String str, int i11) {
    }

    @k
    public static a<StreakState> getEntries() {
        return $ENTRIES;
    }

    public static StreakState valueOf(String str) {
        return (StreakState) Enum.valueOf(StreakState.class, str);
    }

    public static StreakState[] values() {
        return (StreakState[]) $VALUES.clone();
    }
}
