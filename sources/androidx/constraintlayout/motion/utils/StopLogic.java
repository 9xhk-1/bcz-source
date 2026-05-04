package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class StopLogic extends MotionInterpolator {
    private StopEngine mEngine;
    private SpringStopEngine mSpringStopEngine;
    private StopLogicEngine mStopLogicEngine;

    public StopLogic() {
        StopLogicEngine stopLogicEngine = new StopLogicEngine();
        this.mStopLogicEngine = stopLogicEngine;
        this.mEngine = stopLogicEngine;
    }

    public void config(float f11, float f12, float f13, float f14, float f15, float f16) {
        StopLogicEngine stopLogicEngine = this.mStopLogicEngine;
        this.mEngine = stopLogicEngine;
        stopLogicEngine.config(f11, f12, f13, f14, f15, f16);
    }

    public String debug(String str, float f11) {
        return this.mEngine.debug(str, f11);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return this.mEngine.getInterpolation(f11);
    }

    public float getVelocity(float f11) {
        return this.mEngine.getVelocity(f11);
    }

    public boolean isStopped() {
        return this.mEngine.isStopped();
    }

    public void springConfig(float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i11) {
        if (this.mSpringStopEngine == null) {
            this.mSpringStopEngine = new SpringStopEngine();
        }
        SpringStopEngine springStopEngine = this.mSpringStopEngine;
        this.mEngine = springStopEngine;
        springStopEngine.springConfig(f11, f12, f13, f14, f15, f16, f17, i11);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getVelocity() {
        return this.mEngine.getVelocity();
    }
}
