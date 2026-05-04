package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidPaint implements Paint {
    private int _blendMode;

    @m80.l
    private ColorFilter internalColorFilter;

    @m80.k
    private android.graphics.Paint internalPaint;

    @m80.l
    private Shader internalShader;

    @m80.l
    private PathEffect pathEffect;

    public AndroidPaint(@m80.k android.graphics.Paint paint) {
        this.internalPaint = paint;
        this._blendMode = BlendMode.Companion.m2451getSrcOver0nO6VwU();
    }

    @Override // androidx.compose.ui.graphics.Paint
    @m80.k
    public android.graphics.Paint asFrameworkPaint() {
        return this.internalPaint;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getAlpha() {
        return AndroidPaint_androidKt.getNativeAlpha(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public int mo2381getBlendMode0nO6VwU() {
        return this._blendMode;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo2382getColor0d7_KjU() {
        return AndroidPaint_androidKt.getNativeColor(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    @m80.l
    public ColorFilter getColorFilter() {
        return this.internalColorFilter;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getFilterQuality-f-v9h1I, reason: not valid java name */
    public int mo2383getFilterQualityfv9h1I() {
        return AndroidPaint_androidKt.getNativeFilterQuality(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    @m80.l
    public PathEffect getPathEffect() {
        return this.pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    @m80.l
    public Shader getShader() {
        return this.internalShader;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getStrokeCap-KaPHkGw, reason: not valid java name */
    public int mo2384getStrokeCapKaPHkGw() {
        return AndroidPaint_androidKt.getNativeStrokeCap(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getStrokeJoin-LxFBmk8, reason: not valid java name */
    public int mo2385getStrokeJoinLxFBmk8() {
        return AndroidPaint_androidKt.getNativeStrokeJoin(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getStrokeMiterLimit() {
        return AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getStrokeWidth() {
        return AndroidPaint_androidKt.getNativeStrokeWidth(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getStyle-TiuSbCo, reason: not valid java name */
    public int mo2386getStyleTiuSbCo() {
        return AndroidPaint_androidKt.getNativeStyle(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public boolean isAntiAlias() {
        return AndroidPaint_androidKt.getNativeAntiAlias(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setAlpha(float f11) {
        AndroidPaint_androidKt.setNativeAlpha(this.internalPaint, f11);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setAntiAlias(boolean z11) {
        AndroidPaint_androidKt.setNativeAntiAlias(this.internalPaint, z11);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public void mo2387setBlendModes9anfk8(int i11) {
        if (BlendMode.m2420equalsimpl0(this._blendMode, i11)) {
            return;
        }
        this._blendMode = i11;
        AndroidPaint_androidKt.m2393setNativeBlendModeGB0RdKg(this.internalPaint, i11);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public void mo2388setColor8_81llA(long j11) {
        AndroidPaint_androidKt.m2394setNativeColor4WTKRHQ(this.internalPaint, j11);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setColorFilter(@m80.l ColorFilter colorFilter) {
        this.internalColorFilter = colorFilter;
        AndroidPaint_androidKt.setNativeColorFilter(this.internalPaint, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setFilterQuality-vDHp3xo, reason: not valid java name */
    public void mo2389setFilterQualityvDHp3xo(int i11) {
        AndroidPaint_androidKt.m2395setNativeFilterQuality50PEsBU(this.internalPaint, i11);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setPathEffect(@m80.l PathEffect pathEffect) {
        AndroidPaint_androidKt.setNativePathEffect(this.internalPaint, pathEffect);
        this.pathEffect = pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setShader(@m80.l Shader shader) {
        this.internalShader = shader;
        AndroidPaint_androidKt.setNativeShader(this.internalPaint, shader);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStrokeCap-BeK7IIE, reason: not valid java name */
    public void mo2390setStrokeCapBeK7IIE(int i11) {
        AndroidPaint_androidKt.m2396setNativeStrokeCapCSYIeUk(this.internalPaint, i11);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStrokeJoin-Ww9F2mQ, reason: not valid java name */
    public void mo2391setStrokeJoinWw9F2mQ(int i11) {
        AndroidPaint_androidKt.m2397setNativeStrokeJoinkLtJ_vA(this.internalPaint, i11);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setStrokeMiterLimit(float f11) {
        AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.internalPaint, f11);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setStrokeWidth(float f11) {
        AndroidPaint_androidKt.setNativeStrokeWidth(this.internalPaint, f11);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStyle-k9PVt8s, reason: not valid java name */
    public void mo2392setStylek9PVt8s(int i11) {
        AndroidPaint_androidKt.m2398setNativeStyle5YerkU(this.internalPaint, i11);
    }

    public AndroidPaint() {
        this(AndroidPaint_androidKt.makeNativePaint());
    }
}
