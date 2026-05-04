package com.baicizhan.app.api.service;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class GameCategoryVo {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GameCategoryVo[] $VALUES;
    public static final GameCategoryVo Words = new GameCategoryVo("Words", 0);
    public static final GameCategoryVo Sentence = new GameCategoryVo("Sentence", 1);

    private static final /* synthetic */ GameCategoryVo[] $values() {
        return new GameCategoryVo[]{Words, Sentence};
    }

    static {
        GameCategoryVo[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private GameCategoryVo(String str, int i11) {
    }

    @k
    public static a<GameCategoryVo> getEntries() {
        return $ENTRIES;
    }

    public static GameCategoryVo valueOf(String str) {
        return (GameCategoryVo) Enum.valueOf(GameCategoryVo.class, str);
    }

    public static GameCategoryVo[] values() {
        return (GameCategoryVo[]) $VALUES.clone();
    }
}
