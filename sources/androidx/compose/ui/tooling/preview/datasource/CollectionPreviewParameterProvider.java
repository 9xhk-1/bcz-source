package androidx.compose.ui.tooling.preview.datasource;

import a00.r0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.util.Collection;
import m80.k;
import q30.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;

    @k
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(@k Collection<? extends T> collection) {
        this.collection = collection;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @k
    public m<T> getValues() {
        return r0.E1(this.collection);
    }
}
