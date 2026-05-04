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
public final class WordAccent {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ WordAccent[] $VALUES;

    @k
    public static final a Companion;
    public static final WordAccent UK = new WordAccent("UK", 0, "0");
    public static final WordAccent US = new WordAccent("US", 1, "1");

    @k
    private final String value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final WordAccent a(@l String str) {
            return g0.g(str, "0") ? WordAccent.UK : WordAccent.US;
        }

        public a() {
        }
    }

    private static final /* synthetic */ WordAccent[] $values() {
        return new WordAccent[]{UK, US};
    }

    static {
        WordAccent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private WordAccent(String str, int i11, String str2) {
        this.value = str2;
    }

    @k
    public static m00.a<WordAccent> getEntries() {
        return $ENTRIES;
    }

    public static WordAccent valueOf(String str) {
        return (WordAccent) Enum.valueOf(WordAccent.class, str);
    }

    public static WordAccent[] values() {
        return (WordAccent[]) $VALUES.clone();
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
