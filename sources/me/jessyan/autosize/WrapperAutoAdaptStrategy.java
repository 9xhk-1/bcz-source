package me.jessyan.autosize;

import android.app.Activity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class WrapperAutoAdaptStrategy implements AutoAdaptStrategy {
    private final AutoAdaptStrategy mAutoAdaptStrategy;

    public WrapperAutoAdaptStrategy(AutoAdaptStrategy autoAdaptStrategy) {
        this.mAutoAdaptStrategy = autoAdaptStrategy;
    }

    @Override // me.jessyan.autosize.AutoAdaptStrategy
    public void applyAdapt(Object obj, Activity activity) {
        onAdaptListener onAdaptListener = AutoSizeConfig.getInstance().getOnAdaptListener();
        if (onAdaptListener != null) {
            onAdaptListener.onAdaptBefore(obj, activity);
        }
        AutoAdaptStrategy autoAdaptStrategy = this.mAutoAdaptStrategy;
        if (autoAdaptStrategy != null) {
            autoAdaptStrategy.applyAdapt(obj, activity);
        }
        if (onAdaptListener != null) {
            onAdaptListener.onAdaptAfter(obj, activity);
        }
    }
}
