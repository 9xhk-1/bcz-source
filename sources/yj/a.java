package yj;

import androidx.annotation.FontRes;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import m80.k;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f100164a = "FontUtils";

    @k
    public static final FontFamily a(@FontRes int i11) {
        try {
            return FontFamilyKt.FontFamily(FontKt.m4651FontYpTlLL0$default(i11, null, 0, 0, 14, null));
        } catch (Exception e11) {
            c.c(f100164a, "safe font ", e11);
            return FontFamily.Companion.getDefault();
        }
    }
}
