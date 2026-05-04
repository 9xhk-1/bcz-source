package org.koin.core.definition;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class Kind {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Kind[] $VALUES;
    public static final Kind Singleton = new Kind("Singleton", 0);
    public static final Kind Factory = new Kind("Factory", 1);
    public static final Kind Scoped = new Kind("Scoped", 2);

    private static final /* synthetic */ Kind[] $values() {
        return new Kind[]{Singleton, Factory, Scoped};
    }

    static {
        Kind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private Kind(String str, int i11) {
    }

    @k
    public static a<Kind> getEntries() {
        return $ENTRIES;
    }

    public static Kind valueOf(String str) {
        return (Kind) Enum.valueOf(Kind.class, str);
    }

    public static Kind[] values() {
        return (Kind[]) $VALUES.clone();
    }
}
