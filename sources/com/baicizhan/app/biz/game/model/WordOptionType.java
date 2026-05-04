package com.baicizhan.app.biz.game.model;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class WordOptionType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ WordOptionType[] $VALUES;

    @k
    public static final a Companion;

    @k
    private final String value;
    public static final WordOptionType Random = new WordOptionType("Random", 0, "0");
    public static final WordOptionType Confusable = new WordOptionType("Confusable", 1, "1");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final WordOptionType a(@l String str) {
            return g0.g(str, "0") ? WordOptionType.Random : WordOptionType.Confusable;
        }

        public a() {
        }
    }

    private static final /* synthetic */ WordOptionType[] $values() {
        return new WordOptionType[]{Random, Confusable};
    }

    static {
        WordOptionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private WordOptionType(String str, int i11, String str2) {
        this.value = str2;
    }

    @k
    public static m00.a<WordOptionType> getEntries() {
        return $ENTRIES;
    }

    public static WordOptionType valueOf(String str) {
        return (WordOptionType) Enum.valueOf(WordOptionType.class, str);
    }

    public static WordOptionType[] values() {
        return (WordOptionType[]) $VALUES.clone();
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
