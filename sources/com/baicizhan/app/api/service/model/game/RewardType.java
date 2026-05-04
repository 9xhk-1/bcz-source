package com.baicizhan.app.api.service.model.game;

import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import f50.a0;
import f50.i;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0(with = com.baicizhan.app.api.service.model.game.a.class)
/* loaded from: classes3.dex */
public final class RewardType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ RewardType[] $VALUES;

    @k
    public static final a Companion;
    private final int value;
    public static final RewardType Coin = new RewardType("Coin", 0, 1);
    public static final RewardType EnergyEn = new RewardType("EnergyEn", 1, 2);
    public static final RewardType EnergyJp = new RewardType("EnergyJp", 2, 3);
    public static final RewardType Compass = new RewardType("Compass", 3, 4);
    public static final RewardType Hammer = new RewardType("Hammer", 4, 5);
    public static final RewardType PowerEn = new RewardType("PowerEn", 5, 6);
    public static final RewardType PowerJp = new RewardType("PowerJp", 6, 7);
    public static final RewardType RankScore = new RewardType("RankScore", 7, 8);
    public static final RewardType PropsItemComboProtect = new RewardType("PropsItemComboProtect", 8, 9);
    public static final RewardType BuddyTravelSnacks = new RewardType("BuddyTravelSnacks", 9, 10);
    public static final RewardType JournalBadge = new RewardType("JournalBadge", 10, 100);
    public static final RewardType Unknown = new RewardType(PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN, 11, -1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final RewardType a(int i11) {
            for (RewardType rewardType : RewardType.getEntries()) {
                if (rewardType.getValue() == i11) {
                    return rewardType;
                }
            }
            return RewardType.Unknown;
        }

        @k
        public final i<RewardType> serializer() {
            return com.baicizhan.app.api.service.model.game.a.f13475a;
        }

        public a() {
        }
    }

    private static final /* synthetic */ RewardType[] $values() {
        return new RewardType[]{Coin, EnergyEn, EnergyJp, Compass, Hammer, PowerEn, PowerJp, RankScore, PropsItemComboProtect, BuddyTravelSnacks, JournalBadge, Unknown};
    }

    static {
        RewardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private RewardType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<RewardType> getEntries() {
        return $ENTRIES;
    }

    public static RewardType valueOf(String str) {
        return (RewardType) Enum.valueOf(RewardType.class, str);
    }

    public static RewardType[] values() {
        return (RewardType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
