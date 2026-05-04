package com.baicizhan.app.biz.game.model;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class LavaQuestState {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ LavaQuestState[] $VALUES;
    public static final LavaQuestState Ready = new LavaQuestState("Ready", 0);
    public static final LavaQuestState Active = new LavaQuestState("Active", 1);
    public static final LavaQuestState SettledClaim = new LavaQuestState("SettledClaim", 2);
    public static final LavaQuestState SettledNonClaim = new LavaQuestState("SettledNonClaim", 3);

    private static final /* synthetic */ LavaQuestState[] $values() {
        return new LavaQuestState[]{Ready, Active, SettledClaim, SettledNonClaim};
    }

    static {
        LavaQuestState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private LavaQuestState(String str, int i11) {
    }

    @k
    public static m00.a<LavaQuestState> getEntries() {
        return $ENTRIES;
    }

    public static LavaQuestState valueOf(String str) {
        return (LavaQuestState) Enum.valueOf(LavaQuestState.class, str);
    }

    public static LavaQuestState[] values() {
        return (LavaQuestState[]) $VALUES.clone();
    }
}
