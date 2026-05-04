package com.baicizhan.app.biz.game.repo.gameversion;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ResourceId {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ResourceId[] $VALUES;
    public static final ResourceId WordRoadMap = new ResourceId("WordRoadMap", 0);
    public static final ResourceId StudyRecord = new ResourceId("StudyRecord", 1);
    public static final ResourceId BookSchedule = new ResourceId("BookSchedule", 2);
    public static final ResourceId ResourceVersion = new ResourceId("ResourceVersion", 3);

    private static final /* synthetic */ ResourceId[] $values() {
        return new ResourceId[]{WordRoadMap, StudyRecord, BookSchedule, ResourceVersion};
    }

    static {
        ResourceId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private ResourceId(String str, int i11) {
    }

    @k
    public static a<ResourceId> getEntries() {
        return $ENTRIES;
    }

    public static ResourceId valueOf(String str) {
        return (ResourceId) Enum.valueOf(ResourceId.class, str);
    }

    public static ResourceId[] values() {
        return (ResourceId[]) $VALUES.clone();
    }
}
