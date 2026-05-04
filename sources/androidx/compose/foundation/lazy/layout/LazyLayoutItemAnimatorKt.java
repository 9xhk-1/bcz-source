package androidx.compose.foundation.lazy.layout;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimatorKt {

    @k
    private static final LazyLayoutItemAnimation[] EmptyArray = new LazyLayoutItemAnimation[0];

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyLayoutAnimationSpecsNode getSpecs(Object obj) {
        if (obj instanceof LazyLayoutAnimationSpecsNode) {
            return (LazyLayoutAnimationSpecsNode) obj;
        }
        return null;
    }
}
