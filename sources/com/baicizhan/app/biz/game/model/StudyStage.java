package com.baicizhan.app.biz.game.model;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class StudyStage {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ StudyStage[] $VALUES;
    private final long value;
    public static final StudyStage UnLeaning = new StudyStage("UnLeaning", 0, 0);
    public static final StudyStage NewLearningCompleted = new StudyStage("NewLearningCompleted", 1, 10000);
    public static final StudyStage SpellLearning = new StudyStage("SpellLearning", 2, 20000);
    public static final StudyStage SpellSkipped = new StudyStage("SpellSkipped", 3, 30000);
    public static final StudyStage SpellCompleted = new StudyStage("SpellCompleted", 4, 40000);
    public static final StudyStage Reviewing = new StudyStage("Reviewing", 5, 50000);

    private static final /* synthetic */ StudyStage[] $values() {
        return new StudyStage[]{UnLeaning, NewLearningCompleted, SpellLearning, SpellSkipped, SpellCompleted, Reviewing};
    }

    static {
        StudyStage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private StudyStage(String str, int i11, long j11) {
        this.value = j11;
    }

    @k
    public static m00.a<StudyStage> getEntries() {
        return $ENTRIES;
    }

    public static StudyStage valueOf(String str) {
        return (StudyStage) Enum.valueOf(StudyStage.class, str);
    }

    public static StudyStage[] values() {
        return (StudyStage[]) $VALUES.clone();
    }

    public final long getValue() {
        return this.value;
    }
}
