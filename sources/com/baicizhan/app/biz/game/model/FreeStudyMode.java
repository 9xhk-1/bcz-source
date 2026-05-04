package com.baicizhan.app.biz.game.model;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class FreeStudyMode {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ FreeStudyMode[] $VALUES;

    @k
    private final StudyMode studyMode;
    public static final FreeStudyMode Rhythm = new FreeStudyMode("Rhythm", 0, StudyMode.Rhythm);
    public static final FreeStudyMode Context = new FreeStudyMode("Context", 1, StudyMode.Context);

    private static final /* synthetic */ FreeStudyMode[] $values() {
        return new FreeStudyMode[]{Rhythm, Context};
    }

    static {
        FreeStudyMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private FreeStudyMode(String str, int i11, StudyMode studyMode) {
        this.studyMode = studyMode;
    }

    @k
    public static m00.a<FreeStudyMode> getEntries() {
        return $ENTRIES;
    }

    public static FreeStudyMode valueOf(String str) {
        return (FreeStudyMode) Enum.valueOf(FreeStudyMode.class, str);
    }

    public static FreeStudyMode[] values() {
        return (FreeStudyMode[]) $VALUES.clone();
    }

    @k
    public final StudyMode getStudyMode() {
        return this.studyMode;
    }
}
