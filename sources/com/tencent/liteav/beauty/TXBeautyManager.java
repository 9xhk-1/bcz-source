package com.tencent.liteav.beauty;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public interface TXBeautyManager {
    public static final int TXBeautyStyleNature = 1;
    public static final int TXBeautyStylePitu = 2;
    public static final int TXBeautyStyleSmooth = 0;

    void enableSharpnessEnhancement(boolean z11);

    void setBeautyLevel(float f11);

    void setBeautyStyle(int i11);

    void setChinLevel(float f11);

    void setEyeAngleLevel(float f11);

    void setEyeDistanceLevel(float f11);

    void setEyeLightenLevel(float f11);

    void setEyeScaleLevel(float f11);

    void setFaceBeautyLevel(float f11);

    void setFaceNarrowLevel(float f11);

    void setFaceShortLevel(float f11);

    void setFaceSlimLevel(float f11);

    void setFaceVLevel(float f11);

    void setFilter(Bitmap bitmap);

    void setFilterStrength(float f11);

    void setForeheadLevel(float f11);

    void setGreenScreenFile(String str);

    void setLipsThicknessLevel(float f11);

    void setMotionMute(boolean z11);

    void setMotionTmpl(String str);

    void setMouthShapeLevel(float f11);

    void setNosePositionLevel(float f11);

    void setNoseSlimLevel(float f11);

    void setNoseWingLevel(float f11);

    void setPounchRemoveLevel(float f11);

    void setPreprocessor(a aVar);

    void setRuddyLevel(float f11);

    void setSmileLinesRemoveLevel(float f11);

    void setToothWhitenLevel(float f11);

    void setWhitenessLevel(float f11);

    void setWrinkleRemoveLevel(float f11);
}
