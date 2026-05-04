package kotlin.io;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class FileWalkDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FileWalkDirection[] $VALUES;
    public static final FileWalkDirection TOP_DOWN = new FileWalkDirection("TOP_DOWN", 0);
    public static final FileWalkDirection BOTTOM_UP = new FileWalkDirection("BOTTOM_UP", 1);

    private static final /* synthetic */ FileWalkDirection[] $values() {
        return new FileWalkDirection[]{TOP_DOWN, BOTTOM_UP};
    }

    static {
        FileWalkDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private FileWalkDirection(String str, int i11) {
    }

    @k
    public static a<FileWalkDirection> getEntries() {
        return $ENTRIES;
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) $VALUES.clone();
    }
}
