package com.baicizhan.app.biz.game.impl.home.uieffect;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class UIEffectStrategyType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UIEffectStrategyType[] $VALUES;
    public static final UIEffectStrategyType WORDS = new UIEffectStrategyType("WORDS", 0);
    public static final UIEffectStrategyType SENTENCE = new UIEffectStrategyType("SENTENCE", 1);

    private static final /* synthetic */ UIEffectStrategyType[] $values() {
        return new UIEffectStrategyType[]{WORDS, SENTENCE};
    }

    static {
        UIEffectStrategyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private UIEffectStrategyType(String str, int i11) {
    }

    @k
    public static a<UIEffectStrategyType> getEntries() {
        return $ENTRIES;
    }

    public static UIEffectStrategyType valueOf(String str) {
        return (UIEffectStrategyType) Enum.valueOf(UIEffectStrategyType.class, str);
    }

    public static UIEffectStrategyType[] values() {
        return (UIEffectStrategyType[]) $VALUES.clone();
    }
}
