package androidx.compose.foundation.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nKeyboardOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardOptions.kt\nandroidx/compose/foundation/text/KeyboardOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n1#2:396\n*E\n"})
/* loaded from: classes.dex */
public final class KeyboardOptions {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final KeyboardOptions Default = new KeyboardOptions(0, (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 127, (v) null);

    @k
    private static final KeyboardOptions SecureTextField = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.Companion.m4797getPasswordPjHm6EE(), 0, (PlatformImeOptions) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) null, 121, (v) null);

    @l
    private final Boolean autoCorrectEnabled;
    private final int capitalization;

    @l
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;

    @l
    private final PlatformImeOptions platformImeOptions;

    @l
    private final Boolean showKeyboardOnFocus;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }

        @k
        public final KeyboardOptions getSecureTextField$foundation_release() {
            return KeyboardOptions.SecureTextField;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSecureTextField$foundation_release$annotations() {
        }
    }

    public /* synthetic */ KeyboardOptions(int i11, Boolean bool, int i12, int i13, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, v vVar) {
        this(i11, bool, i12, i13, platformImeOptions, bool2, localeList);
    }

    /* renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1055copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i11, boolean z11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = keyboardOptions.capitalization;
        }
        if ((i14 & 2) != 0) {
            z11 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i14 & 4) != 0) {
            i12 = keyboardOptions.keyboardType;
        }
        if ((i14 & 8) != 0) {
            i13 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m1061copy3m2b7yw(i11, z11, i12, i13);
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1056copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i11, Boolean bool, int i12, int i13, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i14, Object obj) {
        LocaleList localeList2;
        Boolean bool3;
        int i15;
        PlatformImeOptions platformImeOptions2;
        Boolean bool4;
        int i16;
        KeyboardOptions keyboardOptions2;
        int i17;
        if ((i14 & 1) != 0) {
            i11 = keyboardOptions.capitalization;
        }
        if ((i14 & 2) != 0) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        if ((i14 & 4) != 0) {
            i12 = keyboardOptions.keyboardType;
        }
        if ((i14 & 8) != 0) {
            i13 = keyboardOptions.imeAction;
        }
        if ((i14 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i14 & 32) != 0) {
            bool2 = null;
        }
        if ((i14 & 64) != 0) {
            localeList2 = null;
            platformImeOptions2 = platformImeOptions;
            bool3 = bool2;
            i16 = i12;
            i15 = i13;
            i17 = i11;
            bool4 = bool;
            keyboardOptions2 = keyboardOptions;
        } else {
            localeList2 = localeList;
            bool3 = bool2;
            i15 = i13;
            platformImeOptions2 = platformImeOptions;
            bool4 = bool;
            i16 = i12;
            keyboardOptions2 = keyboardOptions;
            i17 = i11;
        }
        return keyboardOptions2.m1062copyINvB4aQ(i17, bool4, i16, i15, platformImeOptions2, bool3, localeList2);
    }

    /* renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1058copyij11fho$default(KeyboardOptions keyboardOptions, int i11, boolean z11, int i12, int i13, PlatformImeOptions platformImeOptions, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = keyboardOptions.capitalization;
        }
        if ((i14 & 2) != 0) {
            z11 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i14 & 4) != 0) {
            i12 = keyboardOptions.keyboardType;
        }
        if ((i14 & 8) != 0) {
            i13 = keyboardOptions.imeAction;
        }
        if ((i14 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i15 = i12;
        return keyboardOptions.m1064copyij11fho(i11, z11, i15, i13, platformImeOptions2);
    }

    private final boolean getAutoCorrectOrDefault() {
        Boolean bool = this.autoCorrectEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: getCapitalizationOrDefault-IUNYP9k, reason: not valid java name */
    private final int m1059getCapitalizationOrDefaultIUNYP9k() {
        KeyboardCapitalization m4758boximpl = KeyboardCapitalization.m4758boximpl(this.capitalization);
        int m4764unboximpl = m4758boximpl.m4764unboximpl();
        KeyboardCapitalization.Companion companion = KeyboardCapitalization.Companion;
        if (KeyboardCapitalization.m4761equalsimpl0(m4764unboximpl, companion.m4773getUnspecifiedIUNYP9k())) {
            m4758boximpl = null;
        }
        return m4758boximpl != null ? m4758boximpl.m4764unboximpl() : companion.m4771getNoneIUNYP9k();
    }

    private final LocaleList getHintLocalesOrDefault() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.Companion.getEmpty() : localeList;
    }

    /* renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m1060getKeyboardTypeOrDefaultPjHm6EE() {
        KeyboardType m4775boximpl = KeyboardType.m4775boximpl(this.keyboardType);
        int m4781unboximpl = m4775boximpl.m4781unboximpl();
        KeyboardType.Companion companion = KeyboardType.Companion;
        if (KeyboardType.m4778equalsimpl0(m4781unboximpl, companion.m4800getUnspecifiedPjHm6EE())) {
            m4775boximpl = null;
        }
        return m4775boximpl != null ? m4775boximpl.m4781unboximpl() : companion.m4799getTextPjHm6EE();
    }

    private final boolean isCompletelyUnspecified() {
        return KeyboardCapitalization.m4761equalsimpl0(this.capitalization, KeyboardCapitalization.Companion.m4773getUnspecifiedIUNYP9k()) && this.autoCorrectEnabled == null && KeyboardType.m4778equalsimpl0(this.keyboardType, KeyboardType.Companion.m4800getUnspecifiedPjHm6EE()) && ImeAction.m4725equalsimpl0(this.imeAction, ImeAction.Companion.m4746getUnspecifiedeUduSuo()) && this.platformImeOptions == null && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z11);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1061copy3m2b7yw(int i11, boolean z11, int i12, int i13) {
        return new KeyboardOptions(i11, Boolean.valueOf(z11), i12, i13, this.platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (v) null);
    }

    @k
    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final KeyboardOptions m1062copyINvB4aQ(int i11, @l Boolean bool, int i12, int i13, @l PlatformImeOptions platformImeOptions, @l Boolean bool2, @l LocaleList localeList) {
        return new KeyboardOptions(i11, bool, i12, i13, platformImeOptions, bool2, localeList, (v) null);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1064copyij11fho(int i11, boolean z11, int i12, int i13, PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(i11, Boolean.valueOf(z11), i12, i13, platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (v) null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        return KeyboardCapitalization.m4761equalsimpl0(this.capitalization, keyboardOptions.capitalization) && g0.g(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && KeyboardType.m4778equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m4725equalsimpl0(this.imeAction, keyboardOptions.imeAction) && g0.g(this.platformImeOptions, keyboardOptions.platformImeOptions) && g0.g(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && g0.g(this.hintLocales, keyboardOptions.hintLocales);
    }

    @Stable
    @k
    public final KeyboardOptions fillUnspecifiedValuesWith$foundation_release(@l KeyboardOptions keyboardOptions) {
        if (keyboardOptions == null || keyboardOptions.isCompletelyUnspecified() || g0.g(keyboardOptions, this)) {
            return this;
        }
        if (isCompletelyUnspecified()) {
            return keyboardOptions;
        }
        KeyboardCapitalization m4758boximpl = KeyboardCapitalization.m4758boximpl(this.capitalization);
        if (KeyboardCapitalization.m4761equalsimpl0(m4758boximpl.m4764unboximpl(), KeyboardCapitalization.Companion.m4773getUnspecifiedIUNYP9k())) {
            m4758boximpl = null;
        }
        int m4764unboximpl = m4758boximpl != null ? m4758boximpl.m4764unboximpl() : keyboardOptions.capitalization;
        Boolean bool = this.autoCorrectEnabled;
        if (bool == null) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        Boolean bool2 = bool;
        KeyboardType m4775boximpl = KeyboardType.m4775boximpl(this.keyboardType);
        if (KeyboardType.m4778equalsimpl0(m4775boximpl.m4781unboximpl(), KeyboardType.Companion.m4800getUnspecifiedPjHm6EE())) {
            m4775boximpl = null;
        }
        int m4781unboximpl = m4775boximpl != null ? m4775boximpl.m4781unboximpl() : keyboardOptions.keyboardType;
        ImeAction m4722boximpl = ImeAction.m4722boximpl(this.imeAction);
        ImeAction imeAction = ImeAction.m4725equalsimpl0(m4722boximpl.m4728unboximpl(), ImeAction.Companion.m4746getUnspecifiedeUduSuo()) ? null : m4722boximpl;
        int m4728unboximpl = imeAction != null ? imeAction.m4728unboximpl() : keyboardOptions.imeAction;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        if (platformImeOptions == null) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        Boolean bool3 = this.showKeyboardOnFocus;
        if (bool3 == null) {
            bool3 = keyboardOptions.showKeyboardOnFocus;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.hintLocales;
        if (localeList == null) {
            localeList = keyboardOptions.hintLocales;
        }
        return new KeyboardOptions(m4764unboximpl, bool2, m4781unboximpl, m4728unboximpl, platformImeOptions2, bool4, localeList, (v) null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    @l
    public final Boolean getAutoCorrectEnabled() {
        return this.autoCorrectEnabled;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m1065getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    @l
    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m1066getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getImeActionOrDefault-eUduSuo$foundation_release, reason: not valid java name */
    public final int m1067getImeActionOrDefaulteUduSuo$foundation_release() {
        ImeAction m4722boximpl = ImeAction.m4722boximpl(this.imeAction);
        int m4728unboximpl = m4722boximpl.m4728unboximpl();
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m4725equalsimpl0(m4728unboximpl, companion.m4746getUnspecifiedeUduSuo())) {
            m4722boximpl = null;
        }
        return m4722boximpl != null ? m4722boximpl.m4728unboximpl() : companion.m4738getDefaulteUduSuo();
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m1068getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    @l
    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final /* synthetic */ boolean getShouldShowKeyboardOnFocus() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @l
    public final Boolean getShowKeyboardOnFocus() {
        return this.showKeyboardOnFocus;
    }

    public final boolean getShowKeyboardOnFocusOrDefault$foundation_release() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public int hashCode() {
        int m4762hashCodeimpl = KeyboardCapitalization.m4762hashCodeimpl(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int hashCode = (((((m4762hashCodeimpl + (bool != null ? bool.hashCode() : 0)) * 31) + KeyboardType.m4779hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m4726hashCodeimpl(this.imeAction)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        int hashCode2 = (hashCode + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31;
        Boolean bool2 = this.showKeyboardOnFocus;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return hashCode3 + (localeList != null ? localeList.hashCode() : 0);
    }

    @k
    public final KeyboardOptions merge(@l KeyboardOptions keyboardOptions) {
        KeyboardOptions fillUnspecifiedValuesWith$foundation_release;
        return (keyboardOptions == null || (fillUnspecifiedValuesWith$foundation_release = keyboardOptions.fillUnspecifiedValuesWith$foundation_release(this)) == null) ? this : fillUnspecifiedValuesWith$foundation_release;
    }

    @k
    public final ImeOptions toImeOptions$foundation_release(boolean z11) {
        return new ImeOptions(z11, m1059getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m1060getKeyboardTypeOrDefaultPjHm6EE(), m1067getImeActionOrDefaulteUduSuo$foundation_release(), this.platformImeOptions, getHintLocalesOrDefault(), (v) null);
    }

    @k
    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m4763toStringimpl(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.m4780toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m4727toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    @n(level = DeprecationLevel.WARNING, message = "Please use the new constructor that takes optional autoCorrectEnabled parameter.", replaceWith = @w0(expression = "KeyboardOptions(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus,hintLocales = hintLocales)", imports = {}))
    public /* synthetic */ KeyboardOptions(int i11, boolean z11, int i12, int i13, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, v vVar) {
        this(i11, z11, i12, i13, platformImeOptions, bool, localeList);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Please use the copy function that takes an autoCorrectEnabled parameter.", replaceWith = @w0(expression = "copy(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus ?: true,hintLocales = hintLocales)", imports = {}))
    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1063copyINvB4aQ(int i11, boolean z11, int i12, int i13, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        return new KeyboardOptions(i11, Boolean.valueOf(z11), i12, i13, platformImeOptions, bool, localeList, (v) null);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    public /* synthetic */ KeyboardOptions(int i11, boolean z11, int i12, int i13, PlatformImeOptions platformImeOptions, v vVar) {
        this(i11, z11, i12, i13, platformImeOptions);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ KeyboardOptions(int i11, boolean z11, int i12, int i13, v vVar) {
        this(i11, z11, i12, i13);
    }

    private KeyboardOptions(int i11, Boolean bool, int i12, int i13, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.capitalization = i11;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i12;
        this.imeAction = i13;
        this.platformImeOptions = platformImeOptions;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1057copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i11, boolean z11, int i12, int i13, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = keyboardOptions.capitalization;
        }
        if ((i14 & 2) != 0) {
            z11 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i14 & 4) != 0) {
            i12 = keyboardOptions.keyboardType;
        }
        if ((i14 & 8) != 0) {
            i13 = keyboardOptions.imeAction;
        }
        if ((i14 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i14 & 32) != 0) {
            bool = Boolean.valueOf(keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release());
        }
        if ((i14 & 64) != 0) {
            localeList = keyboardOptions.hintLocales;
        }
        Boolean bool2 = bool;
        LocaleList localeList2 = localeList;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i15 = i12;
        return keyboardOptions.m1063copyINvB4aQ(i11, z11, i15, i13, platformImeOptions2, bool2, localeList2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ KeyboardOptions(int r9, java.lang.Boolean r10, int r11, int r12, androidx.compose.ui.text.input.PlatformImeOptions r13, java.lang.Boolean r14, androidx.compose.ui.text.intl.LocaleList r15, int r16, kotlin.jvm.internal.v r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            if (r0 == 0) goto Lb
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r0 = androidx.compose.ui.text.input.KeyboardCapitalization.Companion
            int r0 = r0.m4773getUnspecifiedIUNYP9k()
            goto Lc
        Lb:
            r0 = r9
        Lc:
            r1 = r16 & 2
            r2 = 0
            if (r1 == 0) goto L13
            r1 = r2
            goto L14
        L13:
            r1 = r10
        L14:
            r3 = r16 & 4
            if (r3 == 0) goto L1f
            androidx.compose.ui.text.input.KeyboardType$Companion r3 = androidx.compose.ui.text.input.KeyboardType.Companion
            int r3 = r3.m4800getUnspecifiedPjHm6EE()
            goto L20
        L1f:
            r3 = r11
        L20:
            r4 = r16 & 8
            if (r4 == 0) goto L2b
            androidx.compose.ui.text.input.ImeAction$Companion r4 = androidx.compose.ui.text.input.ImeAction.Companion
            int r4 = r4.m4746getUnspecifiedeUduSuo()
            goto L2c
        L2b:
            r4 = r12
        L2c:
            r5 = r16 & 16
            if (r5 == 0) goto L32
            r5 = r2
            goto L33
        L32:
            r5 = r13
        L33:
            r6 = r16 & 32
            if (r6 == 0) goto L39
            r6 = r2
            goto L3a
        L39:
            r6 = r14
        L3a:
            r7 = r16 & 64
            if (r7 == 0) goto L3f
            goto L40
        L3f:
            r2 = r15
        L40:
            r7 = 0
            r9 = r8
            r10 = r0
            r11 = r1
            r16 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.KeyboardOptions.<init>(int, java.lang.Boolean, int, int, androidx.compose.ui.text.input.PlatformImeOptions, java.lang.Boolean, androidx.compose.ui.text.intl.LocaleList, int, kotlin.jvm.internal.v):void");
    }

    @n(level = DeprecationLevel.WARNING, message = "Please use the autoCorrectEnabled property.")
    public static /* synthetic */ void getAutoCorrect$annotations() {
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Included for binary compatibility. Use showKeyboardOnFocus.")
    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    public /* synthetic */ KeyboardOptions(int i11, boolean z11, int i12, int i13, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i14, v vVar) {
        this((i14 & 1) != 0 ? KeyboardCapitalization.Companion.m4773getUnspecifiedIUNYP9k() : i11, z11, (i14 & 4) != 0 ? KeyboardType.Companion.m4800getUnspecifiedPjHm6EE() : i12, (i14 & 8) != 0 ? ImeAction.Companion.m4746getUnspecifiedeUduSuo() : i13, (i14 & 16) != 0 ? null : platformImeOptions, (i14 & 32) != 0 ? null : bool, (i14 & 64) != 0 ? null : localeList, (v) null);
    }

    private KeyboardOptions(int i11, boolean z11, int i12, int i13, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        this(i11, Boolean.valueOf(z11), i12, i13, platformImeOptions, bool, localeList, (v) null);
    }

    public /* synthetic */ KeyboardOptions(int i11, boolean z11, int i12, int i13, int i14, v vVar) {
        this((i14 & 1) != 0 ? KeyboardCapitalization.Companion.m4773getUnspecifiedIUNYP9k() : i11, (i14 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z11, (i14 & 4) != 0 ? KeyboardType.Companion.m4800getUnspecifiedPjHm6EE() : i12, (i14 & 8) != 0 ? ImeAction.Companion.m4738getDefaulteUduSuo() : i13, (v) null);
    }

    private KeyboardOptions(int i11, boolean z11, int i12, int i13) {
        this(i11, Boolean.valueOf(z11), i12, i13, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 96, (v) null);
    }

    public /* synthetic */ KeyboardOptions(int i11, boolean z11, int i12, int i13, PlatformImeOptions platformImeOptions, int i14, v vVar) {
        this((i14 & 1) != 0 ? KeyboardCapitalization.Companion.m4771getNoneIUNYP9k() : i11, (i14 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z11, (i14 & 4) != 0 ? KeyboardType.Companion.m4799getTextPjHm6EE() : i12, (i14 & 8) != 0 ? ImeAction.Companion.m4738getDefaulteUduSuo() : i13, (i14 & 16) != 0 ? null : platformImeOptions, (v) null);
    }

    private KeyboardOptions(int i11, boolean z11, int i12, int i13, PlatformImeOptions platformImeOptions) {
        this(i11, Boolean.valueOf(z11), i12, i13, platformImeOptions, Boolean.valueOf(Default.getShowKeyboardOnFocusOrDefault$foundation_release()), (LocaleList) null, 64, (v) null);
    }
}
