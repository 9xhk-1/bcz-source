package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.foundation.gestures.ScrollScope;
import j00.c;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
interface ApproachAnimation<T, V extends AnimationVector> {
    @l
    Object approachAnimation(@k ScrollScope scrollScope, T t11, T t12, @k x00.l<? super T, g2> lVar, @k c<? super AnimationResult<T, V>> cVar);
}
