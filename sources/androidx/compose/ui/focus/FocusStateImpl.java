package androidx.compose.ui.focus;

import kotlin.NoWhenBranchMatchedException;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusStateImpl implements FocusState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FocusStateImpl[] $VALUES;
    public static final FocusStateImpl Active = new FocusStateImpl("Active", 0);
    public static final FocusStateImpl ActiveParent = new FocusStateImpl("ActiveParent", 1);
    public static final FocusStateImpl Captured = new FocusStateImpl("Captured", 2);
    public static final FocusStateImpl Inactive = new FocusStateImpl("Inactive", 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ FocusStateImpl[] $values() {
        return new FocusStateImpl[]{Active, ActiveParent, Captured, Inactive};
    }

    static {
        FocusStateImpl[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private FocusStateImpl(String str, int i11) {
    }

    @k
    public static a<FocusStateImpl> getEntries() {
        return $ENTRIES;
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) $VALUES.clone();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean getHasFocus() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isCaptured() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isFocused() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        if (i11 == 3 || i11 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
