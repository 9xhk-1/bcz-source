package androidx.compose.animation;

import a00.l1;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public abstract class EnterTransition {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final EnterTransition None = new EnterTransitionImpl(new TransitionData(null, null, null, null, false, null, 63, null));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final EnterTransition getNone() {
            return EnterTransition.None;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EnterTransition(v vVar) {
        this();
    }

    public boolean equals(@l Object obj) {
        return (obj instanceof EnterTransition) && g0.g(((EnterTransition) obj).getData$animation(), getData$animation());
    }

    @k
    public abstract TransitionData getData$animation();

    public int hashCode() {
        return getData$animation().hashCode();
    }

    @Stable
    @k
    public final EnterTransition plus(@k EnterTransition enterTransition) {
        Fade fade = enterTransition.getData$animation().getFade();
        if (fade == null) {
            fade = getData$animation().getFade();
        }
        Slide slide = enterTransition.getData$animation().getSlide();
        if (slide == null) {
            slide = getData$animation().getSlide();
        }
        ChangeSize changeSize = enterTransition.getData$animation().getChangeSize();
        if (changeSize == null) {
            changeSize = getData$animation().getChangeSize();
        }
        Scale scale = enterTransition.getData$animation().getScale();
        if (scale == null) {
            scale = getData$animation().getScale();
        }
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale, false, l1.n0(getData$animation().getEffectsMap(), enterTransition.getData$animation().getEffectsMap()), 16, null));
    }

    @k
    public String toString() {
        if (g0.g(this, None)) {
            return "EnterTransition.None";
        }
        TransitionData data$animation = getData$animation();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("EnterTransition: \nFade - ");
        Fade fade = data$animation.getFade();
        sb2.append(fade != null ? fade.toString() : null);
        sb2.append(",\nSlide - ");
        Slide slide = data$animation.getSlide();
        sb2.append(slide != null ? slide.toString() : null);
        sb2.append(",\nShrink - ");
        ChangeSize changeSize = data$animation.getChangeSize();
        sb2.append(changeSize != null ? changeSize.toString() : null);
        sb2.append(",\nScale - ");
        Scale scale = data$animation.getScale();
        sb2.append(scale != null ? scale.toString() : null);
        return sb2.toString();
    }

    private EnterTransition() {
    }
}
