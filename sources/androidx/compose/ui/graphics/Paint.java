package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface Paint {
    @m80.k
    android.graphics.Paint asFrameworkPaint();

    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU */
    int mo2381getBlendMode0nO6VwU();

    /* renamed from: getColor-0d7_KjU */
    long mo2382getColor0d7_KjU();

    @m80.l
    ColorFilter getColorFilter();

    /* renamed from: getFilterQuality-f-v9h1I */
    int mo2383getFilterQualityfv9h1I();

    @m80.l
    PathEffect getPathEffect();

    @m80.l
    Shader getShader();

    /* renamed from: getStrokeCap-KaPHkGw */
    int mo2384getStrokeCapKaPHkGw();

    /* renamed from: getStrokeJoin-LxFBmk8 */
    int mo2385getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    /* renamed from: getStyle-TiuSbCo */
    int mo2386getStyleTiuSbCo();

    boolean isAntiAlias();

    void setAlpha(float f11);

    void setAntiAlias(boolean z11);

    /* renamed from: setBlendMode-s9anfk8 */
    void mo2387setBlendModes9anfk8(int i11);

    /* renamed from: setColor-8_81llA */
    void mo2388setColor8_81llA(long j11);

    void setColorFilter(@m80.l ColorFilter colorFilter);

    /* renamed from: setFilterQuality-vDHp3xo */
    void mo2389setFilterQualityvDHp3xo(int i11);

    void setPathEffect(@m80.l PathEffect pathEffect);

    void setShader(@m80.l Shader shader);

    /* renamed from: setStrokeCap-BeK7IIE */
    void mo2390setStrokeCapBeK7IIE(int i11);

    /* renamed from: setStrokeJoin-Ww9F2mQ */
    void mo2391setStrokeJoinWw9F2mQ(int i11);

    void setStrokeMiterLimit(float f11);

    void setStrokeWidth(float f11);

    /* renamed from: setStyle-k9PVt8s */
    void mo2392setStylek9PVt8s(int i11);
}
