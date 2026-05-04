package com.baicizhan.common.picparser;

import fs.b;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ParserType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ParserType[] $VALUES;
    public static final ParserType GLIDE = new ParserType(b.f52357g, 0);
    public static final ParserType PICASSO = new ParserType("PICASSO", 1);

    private static final /* synthetic */ ParserType[] $values() {
        return new ParserType[]{GLIDE, PICASSO};
    }

    static {
        ParserType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private ParserType(String str, int i11) {
    }

    @k
    public static a<ParserType> getEntries() {
        return $ENTRIES;
    }

    public static ParserType valueOf(String str) {
        return (ParserType) Enum.valueOf(ParserType.class, str);
    }

    public static ParserType[] values() {
        return (ParserType[]) $VALUES.clone();
    }
}
