package androidx.compose.material;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FadeInFadeOutAnimationItem<T> {
    private final T key;

    @k
    private final q<p<? super Composer, ? super Integer, g2>, Composer, Integer, g2> transition;

    /* JADX WARN: Multi-variable type inference failed */
    public FadeInFadeOutAnimationItem(T t11, @k q<? super p<? super Composer, ? super Integer, g2>, ? super Composer, ? super Integer, g2> qVar) {
        this.key = t11;
        this.transition = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, q qVar, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i11 & 2) != 0) {
            qVar = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, qVar);
    }

    public final T component1() {
        return this.key;
    }

    @k
    public final q<p<? super Composer, ? super Integer, g2>, Composer, Integer, g2> component2() {
        return this.transition;
    }

    @k
    public final FadeInFadeOutAnimationItem<T> copy(T t11, @k q<? super p<? super Composer, ? super Integer, g2>, ? super Composer, ? super Integer, g2> qVar) {
        return new FadeInFadeOutAnimationItem<>(t11, qVar);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return g0.g(this.key, fadeInFadeOutAnimationItem.key) && g0.g(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public final T getKey() {
        return this.key;
    }

    @k
    public final q<p<? super Composer, ? super Integer, g2>, Composer, Integer, g2> getTransition() {
        return this.transition;
    }

    public int hashCode() {
        T t11 = this.key;
        return ((t11 == null ? 0 : t11.hashCode()) * 31) + this.transition.hashCode();
    }

    @k
    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
