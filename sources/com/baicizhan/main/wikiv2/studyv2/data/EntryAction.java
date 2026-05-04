package com.baicizhan.main.wikiv2.studyv2.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class EntryAction {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ EntryAction[] $VALUES;

    @m80.k
    private final String acton;
    public static final EntryAction SLIDE = new EntryAction("SLIDE", 0, "slide");
    public static final EntryAction LAST_TAB = new EntryAction("LAST_TAB", 1, "last_tab");
    public static final EntryAction WRONG_ANSWER = new EntryAction("WRONG_ANSWER", 2, "wrong_answer");
    public static final EntryAction CLICK_HINT = new EntryAction("CLICK_HINT", 3, "click_hint");
    public static final EntryAction SENTENCEPIC_CORRECT = new EntryAction("SENTENCEPIC_CORRECT", 4, "sentencepic_correct");
    public static final EntryAction CLICK = new EntryAction("CLICK", 5, ma.a.f72729d2);

    private static final /* synthetic */ EntryAction[] $values() {
        return new EntryAction[]{SLIDE, LAST_TAB, WRONG_ANSWER, CLICK_HINT, SENTENCEPIC_CORRECT, CLICK};
    }

    static {
        EntryAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private EntryAction(String str, int i11, String str2) {
        this.acton = str2;
    }

    @m80.k
    public static m00.a<EntryAction> getEntries() {
        return $ENTRIES;
    }

    public static EntryAction valueOf(String str) {
        return (EntryAction) Enum.valueOf(EntryAction.class, str);
    }

    public static EntryAction[] values() {
        return (EntryAction[]) $VALUES.clone();
    }

    @m80.k
    public final String getActon() {
        return this.acton;
    }
}
