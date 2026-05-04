package com.baicizhan.client.business.managers.experience;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class StudyBehaviourType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StudyBehaviourType[] $VALUES;
    public static final StudyBehaviourType Right = new StudyBehaviourType("Right", 0);
    public static final StudyBehaviourType Wrong = new StudyBehaviourType("Wrong", 1);

    private static final /* synthetic */ StudyBehaviourType[] $values() {
        return new StudyBehaviourType[]{Right, Wrong};
    }

    static {
        StudyBehaviourType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private StudyBehaviourType(String str, int i11) {
    }

    @k
    public static a<StudyBehaviourType> getEntries() {
        return $ENTRIES;
    }

    public static StudyBehaviourType valueOf(String str) {
        return (StudyBehaviourType) Enum.valueOf(StudyBehaviourType.class, str);
    }

    public static StudyBehaviourType[] values() {
        return (StudyBehaviourType[]) $VALUES.clone();
    }
}
