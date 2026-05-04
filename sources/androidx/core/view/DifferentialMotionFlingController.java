package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class DifferentialMotionFlingController {
    private final Context mContext;
    private final int[] mFlingVelocityThresholds;
    private float mLastFlingVelocity;
    private int mLastProcessedAxis;
    private int mLastProcessedDeviceId;
    private int mLastProcessedSource;
    private final DifferentialMotionFlingTarget mTarget;
    private final DifferentialVelocityProvider mVelocityProvider;
    private final FlingVelocityThresholdCalculator mVelocityThresholdCalculator;

    @Nullable
    private VelocityTracker mVelocityTracker;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public interface DifferentialVelocityProvider {
        float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public interface FlingVelocityThresholdCalculator {
        void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i11);
    }

    public DifferentialMotionFlingController(@NonNull Context context, @NonNull DifferentialMotionFlingTarget differentialMotionFlingTarget) {
        this(context, differentialMotionFlingTarget, new FlingVelocityThresholdCalculator() { // from class: androidx.core.view.q
            @Override // androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator
            public final void calculateFlingVelocityThresholds(Context context2, int[] iArr, MotionEvent motionEvent, int i11) {
                DifferentialMotionFlingController.calculateFlingVelocityThresholds(context2, iArr, motionEvent, i11);
            }
        }, new DifferentialVelocityProvider() { // from class: androidx.core.view.r
            @Override // androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider
            public final float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i11) {
                float currentVelocity;
                currentVelocity = DifferentialMotionFlingController.getCurrentVelocity(velocityTracker, motionEvent, i11);
                return currentVelocity;
            }
        });
    }

    private boolean calculateFlingVelocityThresholds(MotionEvent motionEvent, int i11) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.mLastProcessedSource == source && this.mLastProcessedDeviceId == deviceId && this.mLastProcessedAxis == i11) {
            return false;
        }
        this.mVelocityThresholdCalculator.calculateFlingVelocityThresholds(this.mContext, this.mFlingVelocityThresholds, motionEvent, i11);
        this.mLastProcessedSource = source;
        this.mLastProcessedDeviceId = deviceId;
        this.mLastProcessedAxis = i11;
        return true;
    }

    private float getCurrentVelocity(MotionEvent motionEvent, int i11) {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        return this.mVelocityProvider.getCurrentVelocity(this.mVelocityTracker, motionEvent, i11);
    }

    public void onMotionEvent(@NonNull MotionEvent motionEvent, int i11) {
        boolean calculateFlingVelocityThresholds = calculateFlingVelocityThresholds(motionEvent, i11);
        if (this.mFlingVelocityThresholds[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mVelocityTracker = null;
                return;
            }
            return;
        }
        float currentVelocity = getCurrentVelocity(motionEvent, i11) * this.mTarget.getScaledScrollFactor();
        float signum = Math.signum(currentVelocity);
        if (calculateFlingVelocityThresholds || (signum != Math.signum(this.mLastFlingVelocity) && signum != 0.0f)) {
            this.mTarget.stopDifferentialMotionFling();
        }
        float abs = Math.abs(currentVelocity);
        int[] iArr = this.mFlingVelocityThresholds;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(currentVelocity, iArr[1]));
        this.mLastFlingVelocity = this.mTarget.startDifferentialMotionFling(max) ? max : 0.0f;
    }

    @VisibleForTesting
    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget, FlingVelocityThresholdCalculator flingVelocityThresholdCalculator, DifferentialVelocityProvider differentialVelocityProvider) {
        this.mLastProcessedAxis = -1;
        this.mLastProcessedSource = -1;
        this.mLastProcessedDeviceId = -1;
        this.mFlingVelocityThresholds = new int[]{Integer.MAX_VALUE, 0};
        this.mContext = context;
        this.mTarget = differentialMotionFlingTarget;
        this.mVelocityThresholdCalculator = flingVelocityThresholdCalculator;
        this.mVelocityProvider = differentialVelocityProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i11) {
        VelocityTrackerCompat.addMovement(velocityTracker, motionEvent);
        VelocityTrackerCompat.computeCurrentVelocity(velocityTracker, 1000);
        return VelocityTrackerCompat.getAxisVelocity(velocityTracker, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i11) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = ViewConfigurationCompat.getScaledMinimumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i11, motionEvent.getSource());
        iArr[1] = ViewConfigurationCompat.getScaledMaximumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i11, motionEvent.getSource());
    }
}
