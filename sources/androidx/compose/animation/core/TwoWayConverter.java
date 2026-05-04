package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface TwoWayConverter<T, V extends AnimationVector> {
    @k
    l<V, T> getConvertFromVector();

    @k
    l<T, V> getConvertToVector();
}
