package androidx.compose.ui.tooling.preview;

import m80.k;
import q30.k0;
import q30.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface PreviewParameterProvider<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> int getCount(@k PreviewParameterProvider<T> previewParameterProvider) {
            return PreviewParameterProvider.super.getCount();
        }
    }

    default int getCount() {
        return k0.E0(getValues());
    }

    @k
    m<T> getValues();
}
