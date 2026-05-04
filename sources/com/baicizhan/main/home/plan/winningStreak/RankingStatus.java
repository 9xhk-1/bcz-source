package com.baicizhan.main.home.plan.winningStreak;

import androidx.compose.material.TextFieldImplKt;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class RankingStatus {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ RankingStatus[] $VALUES;
    public static final RankingStatus Normal = new RankingStatus("Normal", 0);
    public static final RankingStatus Hint = new RankingStatus(TextFieldImplKt.PlaceholderId, 1);

    private static final /* synthetic */ RankingStatus[] $values() {
        return new RankingStatus[]{Normal, Hint};
    }

    static {
        RankingStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private RankingStatus(String str, int i11) {
    }

    @k
    public static m00.a<RankingStatus> getEntries() {
        return $ENTRIES;
    }

    public static RankingStatus valueOf(String str) {
        return (RankingStatus) Enum.valueOf(RankingStatus.class, str);
    }

    public static RankingStatus[] values() {
        return (RankingStatus[]) $VALUES.clone();
    }
}
