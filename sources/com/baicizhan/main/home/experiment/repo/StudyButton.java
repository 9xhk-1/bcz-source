package com.baicizhan.main.home.experiment.repo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class StudyButton {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ StudyButton[] $VALUES;
    public static final StudyButton STUDY = new StudyButton("STUDY", 0);
    public static final StudyButton REVIEW = new StudyButton("REVIEW", 1);

    private static final /* synthetic */ StudyButton[] $values() {
        return new StudyButton[]{STUDY, REVIEW};
    }

    static {
        StudyButton[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private StudyButton(String str, int i11) {
    }

    @m80.k
    public static m00.a<StudyButton> getEntries() {
        return $ENTRIES;
    }

    public static StudyButton valueOf(String str) {
        return (StudyButton) Enum.valueOf(StudyButton.class, str);
    }

    public static StudyButton[] values() {
        return (StudyButton[]) $VALUES.clone();
    }
}
