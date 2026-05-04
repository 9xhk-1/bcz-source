package androidx.compose.ui.text.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.PlatformStringDelegate;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.text.a;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @k
    public String capitalize(@k String str, @k Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char charAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(charAt) ? a.v(charAt, locale) : String.valueOf(charAt)));
        String substring = str.substring(1);
        g0.o(substring, "substring(...)");
        sb2.append(substring);
        return sb2.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @k
    public String decapitalize(@k String str, @k Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) a.t(str.charAt(0), locale));
        String substring = str.substring(1);
        g0.o(substring, "substring(...)");
        sb2.append(substring);
        return sb2.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @k
    public String toLowerCase(@k String str, @k Locale locale) {
        String lowerCase = str.toLowerCase(locale);
        g0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @k
    public String toUpperCase(@k String str, @k Locale locale) {
        String upperCase = str.toUpperCase(locale);
        g0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
