package kotlinx.serialization.json.internal;

import l50.b;
import m00.a;
import m00.c;
import m80.k;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class WriteMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WriteMode[] $VALUES;

    @g
    public final char begin;

    @g
    public final char end;
    public static final WriteMode OBJ = new WriteMode("OBJ", 0, b.f69927i, b.f69928j);
    public static final WriteMode LIST = new WriteMode("LIST", 1, '[', b.f69930l);
    public static final WriteMode MAP = new WriteMode("MAP", 2, b.f69927i, b.f69928j);
    public static final WriteMode POLY_OBJ = new WriteMode("POLY_OBJ", 3, '[', b.f69930l);

    private static final /* synthetic */ WriteMode[] $values() {
        return new WriteMode[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    static {
        WriteMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private WriteMode(String str, int i11, char c11, char c12) {
        this.begin = c11;
        this.end = c12;
    }

    @k
    public static a<WriteMode> getEntries() {
        return $ENTRIES;
    }

    public static WriteMode valueOf(String str) {
        return (WriteMode) Enum.valueOf(WriteMode.class, str);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) $VALUES.clone();
    }
}
