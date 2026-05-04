package com.baicizhan.main.home.plan.module;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class UpgradeType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UpgradeType[] $VALUES;
    public static final UpgradeType NO_NEED = new UpgradeType("NO_NEED", 0);
    public static final UpgradeType NORMAL_UPGRADE = new UpgradeType("NORMAL_UPGRADE", 1);
    public static final UpgradeType NORMAL_UPGRADE_USER_REJECT = new UpgradeType("NORMAL_UPGRADE_USER_REJECT", 2);
    public static final UpgradeType FORCE_UPGRADE = new UpgradeType("FORCE_UPGRADE", 3);

    private static final /* synthetic */ UpgradeType[] $values() {
        return new UpgradeType[]{NO_NEED, NORMAL_UPGRADE, NORMAL_UPGRADE_USER_REJECT, FORCE_UPGRADE};
    }

    static {
        UpgradeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private UpgradeType(String str, int i11) {
    }

    @k
    public static a<UpgradeType> getEntries() {
        return $ENTRIES;
    }

    public static UpgradeType valueOf(String str) {
        return (UpgradeType) Enum.valueOf(UpgradeType.class, str);
    }

    public static UpgradeType[] values() {
        return (UpgradeType[]) $VALUES.clone();
    }
}
