package androidx.compose.animation;

import a00.l1;
import androidx.compose.runtime.Immutable;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class TransitionData {
    public static final int $stable = 0;

    @l
    private final ChangeSize changeSize;

    @k
    private final Map<TransitionEffectKey<?>, TransitionEffect> effectsMap;

    @l
    private final Fade fade;
    private final boolean hold;

    @l
    private final Scale scale;

    @l
    private final Slide slide;

    public TransitionData() {
        this(null, null, null, null, false, null, 63, null);
    }

    public static /* synthetic */ TransitionData copy$default(TransitionData transitionData, Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fade = transitionData.fade;
        }
        if ((i11 & 2) != 0) {
            slide = transitionData.slide;
        }
        if ((i11 & 4) != 0) {
            changeSize = transitionData.changeSize;
        }
        if ((i11 & 8) != 0) {
            scale = transitionData.scale;
        }
        if ((i11 & 16) != 0) {
            z11 = transitionData.hold;
        }
        if ((i11 & 32) != 0) {
            map = transitionData.effectsMap;
        }
        boolean z12 = z11;
        Map map2 = map;
        return transitionData.copy(fade, slide, changeSize, scale, z12, map2);
    }

    @l
    public final Fade component1() {
        return this.fade;
    }

    @l
    public final Slide component2() {
        return this.slide;
    }

    @l
    public final ChangeSize component3() {
        return this.changeSize;
    }

    @l
    public final Scale component4() {
        return this.scale;
    }

    public final boolean component5() {
        return this.hold;
    }

    @k
    public final Map<TransitionEffectKey<?>, TransitionEffect> component6() {
        return this.effectsMap;
    }

    @k
    public final TransitionData copy(@l Fade fade, @l Slide slide, @l ChangeSize changeSize, @l Scale scale, boolean z11, @k Map<TransitionEffectKey<?>, ? extends TransitionEffect> map) {
        return new TransitionData(fade, slide, changeSize, scale, z11, map);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return g0.g(this.fade, transitionData.fade) && g0.g(this.slide, transitionData.slide) && g0.g(this.changeSize, transitionData.changeSize) && g0.g(this.scale, transitionData.scale) && this.hold == transitionData.hold && g0.g(this.effectsMap, transitionData.effectsMap);
    }

    @l
    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    @k
    public final Map<TransitionEffectKey<?>, TransitionEffect> getEffectsMap() {
        return this.effectsMap;
    }

    @l
    public final Fade getFade() {
        return this.fade;
    }

    public final boolean getHold() {
        return this.hold;
    }

    @l
    public final Scale getScale() {
        return this.scale;
    }

    @l
    public final Slide getSlide() {
        return this.slide;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int hashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int hashCode2 = (hashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int hashCode3 = (hashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        return ((((hashCode3 + (scale != null ? scale.hashCode() : 0)) * 31) + Boolean.hashCode(this.hold)) * 31) + this.effectsMap.hashCode();
    }

    @k
    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionData(@l Fade fade, @l Slide slide, @l ChangeSize changeSize, @l Scale scale, boolean z11, @k Map<TransitionEffectKey<?>, ? extends TransitionEffect> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.hold = z11;
        this.effectsMap = map;
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z11, Map map, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : fade, (i11 & 2) != 0 ? null : slide, (i11 & 4) != 0 ? null : changeSize, (i11 & 8) != 0 ? null : scale, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? l1.z() : map);
    }
}
