package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MenuItemOption {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MenuItemOption[] $VALUES;

    /* renamed from: id, reason: collision with root package name */
    private final int f4210id;
    private final int order;
    public static final MenuItemOption Copy = new MenuItemOption("Copy", 0, 0);
    public static final MenuItemOption Paste = new MenuItemOption("Paste", 1, 1);
    public static final MenuItemOption Cut = new MenuItemOption("Cut", 2, 2);
    public static final MenuItemOption SelectAll = new MenuItemOption("SelectAll", 3, 3);
    public static final MenuItemOption Autofill = new MenuItemOption("Autofill", 4, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuItemOption.values().length];
            try {
                iArr[MenuItemOption.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuItemOption.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuItemOption.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MenuItemOption.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MenuItemOption.Autofill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ MenuItemOption[] $values() {
        return new MenuItemOption[]{Copy, Paste, Cut, SelectAll, Autofill};
    }

    static {
        MenuItemOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private MenuItemOption(String str, int i11, int i12) {
        this.f4210id = i12;
        this.order = i12;
    }

    @k
    public static a<MenuItemOption> getEntries() {
        return $ENTRIES;
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f4210id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return R.string.copy;
        }
        if (i11 == 2) {
            return R.string.paste;
        }
        if (i11 == 3) {
            return R.string.cut;
        }
        if (i11 == 4) {
            return R.string.selectAll;
        }
        if (i11 == 5) {
            return Build.VERSION.SDK_INT <= 26 ? androidx.compose.ui.R.string.autofill : R.string.autofill;
        }
        throw new NoWhenBranchMatchedException();
    }
}
