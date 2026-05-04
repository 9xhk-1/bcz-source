package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final void requirePrecondition(boolean z11, @m80.k x00.a<String> aVar) {
        if (z11) {
            return;
        }
        throwIllegalArgumentException(aVar.invoke());
    }

    public static final void throwIllegalArgumentException(@m80.k String str) {
        throw new IllegalArgumentException(str);
    }
}
