package com.baicizhan.app.biz.game.model;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class RewardPackageType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ RewardPackageType[] $VALUES;
    public static final RewardPackageType WordsRound = new RewardPackageType("WordsRound", 0);
    public static final RewardPackageType MileStone = new RewardPackageType("MileStone", 1);
    public static final RewardPackageType SentenceRound = new RewardPackageType("SentenceRound", 2);

    private static final /* synthetic */ RewardPackageType[] $values() {
        return new RewardPackageType[]{WordsRound, MileStone, SentenceRound};
    }

    static {
        RewardPackageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private RewardPackageType(String str, int i11) {
    }

    @k
    public static m00.a<RewardPackageType> getEntries() {
        return $ENTRIES;
    }

    public static RewardPackageType valueOf(String str) {
        return (RewardPackageType) Enum.valueOf(RewardPackageType.class, str);
    }

    public static RewardPackageType[] values() {
        return (RewardPackageType[]) $VALUES.clone();
    }
}
