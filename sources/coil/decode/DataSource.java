package coil.decode;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class DataSource {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DataSource[] $VALUES;
    public static final DataSource MEMORY_CACHE = new DataSource("MEMORY_CACHE", 0);
    public static final DataSource MEMORY = new DataSource("MEMORY", 1);
    public static final DataSource DISK = new DataSource("DISK", 2);
    public static final DataSource NETWORK = new DataSource("NETWORK", 3);

    private static final /* synthetic */ DataSource[] $values() {
        return new DataSource[]{MEMORY_CACHE, MEMORY, DISK, NETWORK};
    }

    static {
        DataSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private DataSource(String str, int i11) {
    }

    @k
    public static a<DataSource> getEntries() {
        return $ENTRIES;
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) $VALUES.clone();
    }
}
