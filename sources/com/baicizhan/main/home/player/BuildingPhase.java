package com.baicizhan.main.home.player;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class BuildingPhase {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ BuildingPhase[] $VALUES;
    public static final BuildingPhase PENDING_BUILD = new BuildingPhase("PENDING_BUILD", 0);
    public static final BuildingPhase BUILDING = new BuildingPhase("BUILDING", 1);
    public static final BuildingPhase BUILT = new BuildingPhase("BUILT", 2);
    public static final BuildingPhase UNLOCKING = new BuildingPhase("UNLOCKING", 3);
    public static final BuildingPhase UNLOCKING2 = new BuildingPhase("UNLOCKING2", 4);
    public static final BuildingPhase UNLOCKED = new BuildingPhase("UNLOCKED", 5);
    public static final BuildingPhase INTERACTING = new BuildingPhase("INTERACTING", 6);

    private static final /* synthetic */ BuildingPhase[] $values() {
        return new BuildingPhase[]{PENDING_BUILD, BUILDING, BUILT, UNLOCKING, UNLOCKING2, UNLOCKED, INTERACTING};
    }

    static {
        BuildingPhase[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private BuildingPhase(String str, int i11) {
    }

    @m80.k
    public static m00.a<BuildingPhase> getEntries() {
        return $ENTRIES;
    }

    public static BuildingPhase valueOf(String str) {
        return (BuildingPhase) Enum.valueOf(BuildingPhase.class, str);
    }

    public static BuildingPhase[] values() {
        return (BuildingPhase[]) $VALUES.clone();
    }
}
