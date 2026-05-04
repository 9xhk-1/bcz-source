package com.baicizhan.main.home.player;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class HomeGuideType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ HomeGuideType[] $VALUES;
    public static final HomeGuideType START_LEARNING = new HomeGuideType("START_LEARNING", 0);
    public static final HomeGuideType ISLAND_UNLOCK = new HomeGuideType("ISLAND_UNLOCK", 1);
    public static final HomeGuideType PLAN_EDIT = new HomeGuideType("PLAN_EDIT", 2);
    public static final HomeGuideType REVIEW = new HomeGuideType("REVIEW", 3);

    private static final /* synthetic */ HomeGuideType[] $values() {
        return new HomeGuideType[]{START_LEARNING, ISLAND_UNLOCK, PLAN_EDIT, REVIEW};
    }

    static {
        HomeGuideType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private HomeGuideType(String str, int i11) {
    }

    @m80.k
    public static m00.a<HomeGuideType> getEntries() {
        return $ENTRIES;
    }

    public static HomeGuideType valueOf(String str) {
        return (HomeGuideType) Enum.valueOf(HomeGuideType.class, str);
    }

    public static HomeGuideType[] values() {
        return (HomeGuideType[]) $VALUES.clone();
    }
}
