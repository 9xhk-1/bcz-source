package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {

    @k
    private final l<V, T> convertFromVector;

    @k
    private final l<T, V> convertToVector;

    /* JADX WARN: Multi-variable type inference failed */
    public TwoWayConverterImpl(@k l<? super T, ? extends V> lVar, @k l<? super V, ? extends T> lVar2) {
        this.convertToVector = lVar;
        this.convertFromVector = lVar2;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    @k
    public l<V, T> getConvertFromVector() {
        return this.convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    @k
    public l<T, V> getConvertToVector() {
        return this.convertToVector;
    }
}
