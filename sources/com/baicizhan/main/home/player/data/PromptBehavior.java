package com.baicizhan.main.home.player.data;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class PromptBehavior {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PromptBehavior[] $VALUES;
    public static final PromptBehavior NONE = new PromptBehavior("NONE", 0);
    public static final PromptBehavior LEARN = new PromptBehavior("LEARN", 1);
    public static final PromptBehavior REVIEW = new PromptBehavior("REVIEW", 2);
    public static final PromptBehavior EXPLORE = new PromptBehavior("EXPLORE", 3);

    private static final /* synthetic */ PromptBehavior[] $values() {
        return new PromptBehavior[]{NONE, LEARN, REVIEW, EXPLORE};
    }

    static {
        PromptBehavior[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private PromptBehavior(String str, int i11) {
    }

    @k
    public static a<PromptBehavior> getEntries() {
        return $ENTRIES;
    }

    public static PromptBehavior valueOf(String str) {
        return (PromptBehavior) Enum.valueOf(PromptBehavior.class, str);
    }

    public static PromptBehavior[] values() {
        return (PromptBehavior[]) $VALUES.clone();
    }
}
