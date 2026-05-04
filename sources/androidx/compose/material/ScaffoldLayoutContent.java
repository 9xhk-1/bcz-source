package androidx.compose.material;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ScaffoldLayoutContent {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ScaffoldLayoutContent[] $VALUES;
    public static final ScaffoldLayoutContent TopBar = new ScaffoldLayoutContent("TopBar", 0);
    public static final ScaffoldLayoutContent MainContent = new ScaffoldLayoutContent("MainContent", 1);
    public static final ScaffoldLayoutContent Snackbar = new ScaffoldLayoutContent("Snackbar", 2);
    public static final ScaffoldLayoutContent Fab = new ScaffoldLayoutContent("Fab", 3);
    public static final ScaffoldLayoutContent BottomBar = new ScaffoldLayoutContent("BottomBar", 4);

    private static final /* synthetic */ ScaffoldLayoutContent[] $values() {
        return new ScaffoldLayoutContent[]{TopBar, MainContent, Snackbar, Fab, BottomBar};
    }

    static {
        ScaffoldLayoutContent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private ScaffoldLayoutContent(String str, int i11) {
    }

    @k
    public static a<ScaffoldLayoutContent> getEntries() {
        return $ENTRIES;
    }

    public static ScaffoldLayoutContent valueOf(String str) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, str);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) $VALUES.clone();
    }
}
