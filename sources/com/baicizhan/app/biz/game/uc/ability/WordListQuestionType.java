package com.baicizhan.app.biz.game.uc.ability;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class WordListQuestionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WordListQuestionType[] $VALUES;
    public static final WordListQuestionType LISTEN_FAST = new WordListQuestionType("LISTEN_FAST", 0);
    public static final WordListQuestionType BRUSH_FAST = new WordListQuestionType("BRUSH_FAST", 1);
    public static final WordListQuestionType ENGLISH_TO_MEANING = new WordListQuestionType("ENGLISH_TO_MEANING", 2);

    private static final /* synthetic */ WordListQuestionType[] $values() {
        return new WordListQuestionType[]{LISTEN_FAST, BRUSH_FAST, ENGLISH_TO_MEANING};
    }

    static {
        WordListQuestionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private WordListQuestionType(String str, int i11) {
    }

    @k
    public static a<WordListQuestionType> getEntries() {
        return $ENTRIES;
    }

    public static WordListQuestionType valueOf(String str) {
        return (WordListQuestionType) Enum.valueOf(WordListQuestionType.class, str);
    }

    public static WordListQuestionType[] values() {
        return (WordListQuestionType[]) $VALUES.clone();
    }
}
