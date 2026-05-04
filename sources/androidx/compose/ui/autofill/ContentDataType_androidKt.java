package androidx.compose.ui.autofill;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ContentDataType_androidKt {
    @m80.k
    public static final ContentDataType ContentDataType(int i11) {
        return AndroidContentDataType.m2097boximpl(AndroidContentDataType.m2098constructorimpl(i11));
    }

    public static final int getDataType(@m80.k ContentDataType contentDataType) {
        g0.n(contentDataType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentDataType");
        return ((AndroidContentDataType) contentDataType).m2103unboximpl();
    }
}
