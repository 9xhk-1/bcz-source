package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class ImeOptions {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, null, null, 127, null);
    private final boolean autoCorrect;
    private final int capitalization;

    @k
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;

    @l
    private final PlatformImeOptions platformImeOptions;
    private final boolean singleLine;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13, PlatformImeOptions platformImeOptions, LocaleList localeList, v vVar) {
        this(z11, i11, z12, i12, i13, platformImeOptions, localeList);
    }

    /* renamed from: copy-YTHSh70$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m4747copyYTHSh70$default(ImeOptions imeOptions, boolean z11, int i11, boolean z12, int i12, int i13, PlatformImeOptions platformImeOptions, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z11 = imeOptions.singleLine;
        }
        if ((i14 & 2) != 0) {
            i11 = imeOptions.capitalization;
        }
        if ((i14 & 4) != 0) {
            z12 = imeOptions.autoCorrect;
        }
        if ((i14 & 8) != 0) {
            i12 = imeOptions.keyboardType;
        }
        if ((i14 & 16) != 0) {
            i13 = imeOptions.imeAction;
        }
        if ((i14 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        int i15 = i13;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        return imeOptions.m4750copyYTHSh70(z11, i11, z12, i12, i15, platformImeOptions2);
    }

    /* renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m4748copyuxg59PA$default(ImeOptions imeOptions, boolean z11, int i11, boolean z12, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z11 = imeOptions.singleLine;
        }
        if ((i14 & 2) != 0) {
            i11 = imeOptions.capitalization;
        }
        if ((i14 & 4) != 0) {
            z12 = imeOptions.autoCorrect;
        }
        if ((i14 & 8) != 0) {
            i12 = imeOptions.keyboardType;
        }
        if ((i14 & 16) != 0) {
            i13 = imeOptions.imeAction;
        }
        int i15 = i13;
        boolean z13 = z12;
        return imeOptions.m4751copyuxg59PA(z11, i11, z13, i12, i15);
    }

    /* renamed from: copy-wBHncE4$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m4749copywBHncE4$default(ImeOptions imeOptions, boolean z11, int i11, boolean z12, int i12, int i13, PlatformImeOptions platformImeOptions, LocaleList localeList, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z11 = imeOptions.singleLine;
        }
        if ((i14 & 2) != 0) {
            i11 = imeOptions.capitalization;
        }
        if ((i14 & 4) != 0) {
            z12 = imeOptions.autoCorrect;
        }
        if ((i14 & 8) != 0) {
            i12 = imeOptions.keyboardType;
        }
        if ((i14 & 16) != 0) {
            i13 = imeOptions.imeAction;
        }
        if ((i14 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        if ((i14 & 64) != 0) {
            localeList = imeOptions.hintLocales;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        LocaleList localeList2 = localeList;
        int i15 = i13;
        boolean z13 = z12;
        return imeOptions.m4752copywBHncE4(z11, i11, z13, i12, i15, platformImeOptions2, localeList2);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional hintLocales parameter.")
    /* renamed from: copy-YTHSh70, reason: not valid java name */
    public final /* synthetic */ ImeOptions m4750copyYTHSh70(boolean z11, int i11, boolean z12, int i12, int i13, PlatformImeOptions platformImeOptions) {
        return new ImeOptions(z11, i11, z12, i12, i13, platformImeOptions, this.hintLocales, (v) null);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* renamed from: copy-uxg59PA, reason: not valid java name */
    public final /* synthetic */ ImeOptions m4751copyuxg59PA(boolean z11, int i11, boolean z12, int i12, int i13) {
        return new ImeOptions(z11, i11, z12, i12, i13, this.platformImeOptions, this.hintLocales, (v) null);
    }

    @k
    /* renamed from: copy-wBHncE4, reason: not valid java name */
    public final ImeOptions m4752copywBHncE4(boolean z11, int i11, boolean z12, int i12, int i13, @l PlatformImeOptions platformImeOptions, @k LocaleList localeList) {
        return new ImeOptions(z11, i11, z12, i12, i13, platformImeOptions, localeList, (v) null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        return this.singleLine == imeOptions.singleLine && KeyboardCapitalization.m4761equalsimpl0(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && KeyboardType.m4778equalsimpl0(this.keyboardType, imeOptions.keyboardType) && ImeAction.m4725equalsimpl0(this.imeAction, imeOptions.imeAction) && g0.g(this.platformImeOptions, imeOptions.platformImeOptions) && g0.g(this.hintLocales, imeOptions.hintLocales);
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m4753getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    @k
    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m4754getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m4755getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    @l
    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        int hashCode = ((((((((Boolean.hashCode(this.singleLine) * 31) + KeyboardCapitalization.m4762hashCodeimpl(this.capitalization)) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.m4779hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m4726hashCodeimpl(this.imeAction)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        return ((hashCode + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31) + this.hintLocales.hashCode();
    }

    @k
    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m4763toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m4780toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m4727toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + ", hintLocales=" + this.hintLocales + ')';
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional hintLocales parameter.")
    public /* synthetic */ ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13, PlatformImeOptions platformImeOptions, v vVar) {
        this(z11, i11, z12, i12, i13, platformImeOptions);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13, v vVar) {
        this(z11, i11, z12, i12, i13);
    }

    private ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        this.singleLine = z11;
        this.capitalization = i11;
        this.autoCorrect = z12;
        this.keyboardType = i12;
        this.imeAction = i13;
        this.platformImeOptions = platformImeOptions;
        this.hintLocales = localeList;
    }

    public /* synthetic */ ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13, PlatformImeOptions platformImeOptions, LocaleList localeList, int i14, v vVar) {
        this((i14 & 1) != 0 ? false : z11, (i14 & 2) != 0 ? KeyboardCapitalization.Companion.m4771getNoneIUNYP9k() : i11, (i14 & 4) != 0 ? true : z12, (i14 & 8) != 0 ? KeyboardType.Companion.m4799getTextPjHm6EE() : i12, (i14 & 16) != 0 ? ImeAction.Companion.m4738getDefaulteUduSuo() : i13, (i14 & 32) != 0 ? null : platformImeOptions, (i14 & 64) != 0 ? LocaleList.Companion.getEmpty() : localeList, (v) null);
    }

    public /* synthetic */ ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13, PlatformImeOptions platformImeOptions, int i14, v vVar) {
        this((i14 & 1) != 0 ? false : z11, (i14 & 2) != 0 ? KeyboardCapitalization.Companion.m4771getNoneIUNYP9k() : i11, (i14 & 4) != 0 ? true : z12, (i14 & 8) != 0 ? KeyboardType.Companion.m4799getTextPjHm6EE() : i12, (i14 & 16) != 0 ? ImeAction.Companion.m4738getDefaulteUduSuo() : i13, (i14 & 32) != 0 ? null : platformImeOptions, (v) null);
    }

    private ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13, PlatformImeOptions platformImeOptions) {
        this(z11, i11, z12, i12, i13, platformImeOptions, LocaleList.Companion.getEmpty(), (v) null);
    }

    public /* synthetic */ ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13, int i14, v vVar) {
        this((i14 & 1) != 0 ? false : z11, (i14 & 2) != 0 ? KeyboardCapitalization.Companion.m4771getNoneIUNYP9k() : i11, (i14 & 4) != 0 ? true : z12, (i14 & 8) != 0 ? KeyboardType.Companion.m4799getTextPjHm6EE() : i12, (i14 & 16) != 0 ? ImeAction.Companion.m4738getDefaulteUduSuo() : i13, (v) null);
    }

    private ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13) {
        this(z11, i11, z12, i12, i13, null, null, 64, null);
    }
}
