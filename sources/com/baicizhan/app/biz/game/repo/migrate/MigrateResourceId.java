package com.baicizhan.app.biz.game.repo.migrate;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class MigrateResourceId {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MigrateResourceId[] $VALUES;
    public static final MigrateResourceId WordRoadMap = new MigrateResourceId("WordRoadMap", 0, "WordRoadMapSdkMigrateCode");

    @k
    private final String key;

    private static final /* synthetic */ MigrateResourceId[] $values() {
        return new MigrateResourceId[]{WordRoadMap};
    }

    static {
        MigrateResourceId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private MigrateResourceId(String str, int i11, String str2) {
        this.key = str2;
    }

    @k
    public static a<MigrateResourceId> getEntries() {
        return $ENTRIES;
    }

    public static MigrateResourceId valueOf(String str) {
        return (MigrateResourceId) Enum.valueOf(MigrateResourceId.class, str);
    }

    public static MigrateResourceId[] values() {
        return (MigrateResourceId[]) $VALUES.clone();
    }

    @k
    public final String getKey() {
        return this.key;
    }
}
