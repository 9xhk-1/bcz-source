package com.baicizhan.client.business.managers.experience.data.db;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class AssembleBehaviourType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AssembleBehaviourType[] $VALUES;
    public static final AssembleBehaviourType FirstRight = new AssembleBehaviourType("FirstRight", 0);
    public static final AssembleBehaviourType Right = new AssembleBehaviourType("Right", 1);
    public static final AssembleBehaviourType FirstWrong = new AssembleBehaviourType("FirstWrong", 2);
    public static final AssembleBehaviourType Wrong = new AssembleBehaviourType("Wrong", 3);
    public static final AssembleBehaviourType Nothing = new AssembleBehaviourType("Nothing", 4);

    private static final /* synthetic */ AssembleBehaviourType[] $values() {
        return new AssembleBehaviourType[]{FirstRight, Right, FirstWrong, Wrong, Nothing};
    }

    static {
        AssembleBehaviourType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private AssembleBehaviourType(String str, int i11) {
    }

    @k
    public static a<AssembleBehaviourType> getEntries() {
        return $ENTRIES;
    }

    public static AssembleBehaviourType valueOf(String str) {
        return (AssembleBehaviourType) Enum.valueOf(AssembleBehaviourType.class, str);
    }

    public static AssembleBehaviourType[] values() {
        return (AssembleBehaviourType[]) $VALUES.clone();
    }
}
