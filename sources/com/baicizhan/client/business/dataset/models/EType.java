package com.baicizhan.client.business.dataset.models;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class EType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EType[] $VALUES;
    private final int type;
    public static final EType Phrase = new EType("Phrase", 0, 1);
    public static final EType Derivation = new EType("Derivation", 1, 2);
    public static final EType Variant = new EType("Variant", 2, 3);
    public static final EType EnMean = new EType("EnMean", 3, 4);
    public static final EType Tv = new EType("Tv", 4, 5);
    public static final EType Synonym = new EType("Synonym", 5, 6);
    public static final EType Antonym = new EType("Antonym", 6, 7);
    public static final EType Similar = new EType("Similar", 7, 8);

    private static final /* synthetic */ EType[] $values() {
        return new EType[]{Phrase, Derivation, Variant, EnMean, Tv, Synonym, Antonym, Similar};
    }

    static {
        EType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private EType(String str, int i11, int i12) {
        this.type = i12;
    }

    @k
    public static a<EType> getEntries() {
        return $ENTRIES;
    }

    public static EType valueOf(String str) {
        return (EType) Enum.valueOf(EType.class, str);
    }

    public static EType[] values() {
        return (EType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
