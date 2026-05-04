package androidx.compose.animation;

import a00.l1;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public abstract class ExitTransition {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final ExitTransition KeepUntilTransitionsFinished;

    @k
    private static final ExitTransition None;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final ExitTransition getKeepUntilTransitionsFinished$animation() {
            return ExitTransition.KeepUntilTransitionsFinished;
        }

        @k
        public final ExitTransition getNone() {
            return ExitTransition.None;
        }

        private Companion() {
        }
    }

    static {
        v vVar = null;
        Fade fade = null;
        Slide slide = null;
        ChangeSize changeSize = null;
        Scale scale = null;
        Map map = null;
        None = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, false, map, 63, vVar));
        KeepUntilTransitionsFinished = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, true, map, 47, vVar));
    }

    public /* synthetic */ ExitTransition(v vVar) {
        this();
    }

    public boolean equals(@l Object obj) {
        return (obj instanceof ExitTransition) && g0.g(((ExitTransition) obj).getData$animation(), getData$animation());
    }

    @k
    public abstract TransitionData getData$animation();

    public int hashCode() {
        return getData$animation().hashCode();
    }

    @Stable
    @k
    public final ExitTransition plus(@k ExitTransition exitTransition) {
        Fade fade = exitTransition.getData$animation().getFade();
        if (fade == null) {
            fade = getData$animation().getFade();
        }
        Slide slide = exitTransition.getData$animation().getSlide();
        if (slide == null) {
            slide = getData$animation().getSlide();
        }
        ChangeSize changeSize = exitTransition.getData$animation().getChangeSize();
        if (changeSize == null) {
            changeSize = getData$animation().getChangeSize();
        }
        Scale scale = exitTransition.getData$animation().getScale();
        if (scale == null) {
            scale = getData$animation().getScale();
        }
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, exitTransition.getData$animation().getHold() || getData$animation().getHold(), l1.n0(getData$animation().getEffectsMap(), exitTransition.getData$animation().getEffectsMap())));
    }

    @k
    public String toString() {
        if (g0.g(this, None)) {
            return "ExitTransition.None";
        }
        if (g0.g(this, KeepUntilTransitionsFinished)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData data$animation = getData$animation();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExitTransition: \nFade - ");
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
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(data$animation.getHold());
        return sb2.toString();
    }

    private ExitTransition() {
    }
}
