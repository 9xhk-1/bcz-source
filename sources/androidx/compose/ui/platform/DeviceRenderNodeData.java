package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DeviceRenderNodeData {
    public static final int $stable = 8;
    private float alpha;
    private int ambientShadowColor;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;

    @m80.l
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    public /* synthetic */ DeviceRenderNodeData(long j11, int i11, int i12, int i13, int i14, int i15, int i16, float f11, float f12, float f13, float f14, float f15, int i17, int i18, float f16, float f17, float f18, float f19, float f21, float f22, boolean z11, boolean z12, float f23, RenderEffect renderEffect, int i19, kotlin.jvm.internal.v vVar) {
        this(j11, i11, i12, i13, i14, i15, i16, f11, f12, f13, f14, f15, i17, i18, f16, f17, f18, f19, f21, f22, z11, z12, f23, renderEffect, i19);
    }

    /* renamed from: copy-fuCbV5c$default, reason: not valid java name */
    public static /* synthetic */ DeviceRenderNodeData m4254copyfuCbV5c$default(DeviceRenderNodeData deviceRenderNodeData, long j11, int i11, int i12, int i13, int i14, int i15, int i16, float f11, float f12, float f13, float f14, float f15, int i17, int i18, float f16, float f17, float f18, float f19, float f21, float f22, boolean z11, boolean z12, float f23, RenderEffect renderEffect, int i19, int i21, Object obj) {
        int i22;
        RenderEffect renderEffect2;
        long j12 = (i21 & 1) != 0 ? deviceRenderNodeData.uniqueId : j11;
        int i23 = (i21 & 2) != 0 ? deviceRenderNodeData.left : i11;
        int i24 = (i21 & 4) != 0 ? deviceRenderNodeData.top : i12;
        int i25 = (i21 & 8) != 0 ? deviceRenderNodeData.right : i13;
        int i26 = (i21 & 16) != 0 ? deviceRenderNodeData.bottom : i14;
        int i27 = (i21 & 32) != 0 ? deviceRenderNodeData.width : i15;
        int i28 = (i21 & 64) != 0 ? deviceRenderNodeData.height : i16;
        float f24 = (i21 & 128) != 0 ? deviceRenderNodeData.scaleX : f11;
        float f25 = (i21 & 256) != 0 ? deviceRenderNodeData.scaleY : f12;
        float f26 = (i21 & 512) != 0 ? deviceRenderNodeData.translationX : f13;
        float f27 = (i21 & 1024) != 0 ? deviceRenderNodeData.translationY : f14;
        float f28 = (i21 & 2048) != 0 ? deviceRenderNodeData.elevation : f15;
        int i29 = (i21 & 4096) != 0 ? deviceRenderNodeData.ambientShadowColor : i17;
        long j13 = j12;
        int i31 = (i21 & 8192) != 0 ? deviceRenderNodeData.spotShadowColor : i18;
        float f29 = (i21 & 16384) != 0 ? deviceRenderNodeData.rotationZ : f16;
        float f31 = (i21 & 32768) != 0 ? deviceRenderNodeData.rotationX : f17;
        float f32 = (i21 & 65536) != 0 ? deviceRenderNodeData.rotationY : f18;
        float f33 = (i21 & 131072) != 0 ? deviceRenderNodeData.cameraDistance : f19;
        float f34 = (i21 & 262144) != 0 ? deviceRenderNodeData.pivotX : f21;
        float f35 = (i21 & 524288) != 0 ? deviceRenderNodeData.pivotY : f22;
        boolean z13 = (i21 & 1048576) != 0 ? deviceRenderNodeData.clipToOutline : z11;
        boolean z14 = (i21 & 2097152) != 0 ? deviceRenderNodeData.clipToBounds : z12;
        float f36 = (i21 & 4194304) != 0 ? deviceRenderNodeData.alpha : f23;
        RenderEffect renderEffect3 = (i21 & 8388608) != 0 ? deviceRenderNodeData.renderEffect : renderEffect;
        if ((i21 & 16777216) != 0) {
            renderEffect2 = renderEffect3;
            i22 = deviceRenderNodeData.compositingStrategy;
        } else {
            i22 = i19;
            renderEffect2 = renderEffect3;
        }
        return deviceRenderNodeData.m4256copyfuCbV5c(j13, i23, i24, i25, i26, i27, i28, f24, f25, f26, f27, f28, i29, i31, f29, f31, f32, f33, f34, f35, z13, z14, f36, renderEffect2, i22);
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final int component13() {
        return this.ambientShadowColor;
    }

    public final int component14() {
        return this.spotShadowColor;
    }

    public final float component15() {
        return this.rotationZ;
    }

    public final float component16() {
        return this.rotationX;
    }

    public final float component17() {
        return this.rotationY;
    }

    public final float component18() {
        return this.cameraDistance;
    }

    public final float component19() {
        return this.pivotX;
    }

    public final int component2() {
        return this.left;
    }

    public final float component20() {
        return this.pivotY;
    }

    public final boolean component21() {
        return this.clipToOutline;
    }

    public final boolean component22() {
        return this.clipToBounds;
    }

    public final float component23() {
        return this.alpha;
    }

    @m80.l
    public final RenderEffect component24() {
        return this.renderEffect;
    }

    /* renamed from: component25--NrFUSI, reason: not valid java name */
    public final int m4255component25NrFUSI() {
        return this.compositingStrategy;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    @m80.k
    /* renamed from: copy-fuCbV5c, reason: not valid java name */
    public final DeviceRenderNodeData m4256copyfuCbV5c(long j11, int i11, int i12, int i13, int i14, int i15, int i16, float f11, float f12, float f13, float f14, float f15, int i17, int i18, float f16, float f17, float f18, float f19, float f21, float f22, boolean z11, boolean z12, float f23, @m80.l RenderEffect renderEffect, int i19) {
        return new DeviceRenderNodeData(j11, i11, i12, i13, i14, i15, i16, f11, f12, f13, f14, f15, i17, i18, f16, f17, f18, f19, f21, f22, z11, z12, f23, renderEffect, i19, null);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && kotlin.jvm.internal.g0.g(this.renderEffect, deviceRenderNodeData.renderEffect) && CompositingStrategy.m2593equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m4257getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    @m80.l
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final int getRight() {
        return this.right;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.uniqueId) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.elevation)) * 31) + Integer.hashCode(this.ambientShadowColor)) * 31) + Integer.hashCode(this.spotShadowColor)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Boolean.hashCode(this.clipToOutline)) * 31) + Boolean.hashCode(this.clipToBounds)) * 31) + Float.hashCode(this.alpha)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return ((hashCode + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + CompositingStrategy.m2594hashCodeimpl(this.compositingStrategy);
    }

    public final void setAlpha(float f11) {
        this.alpha = f11;
    }

    public final void setAmbientShadowColor(int i11) {
        this.ambientShadowColor = i11;
    }

    public final void setCameraDistance(float f11) {
        this.cameraDistance = f11;
    }

    public final void setClipToBounds(boolean z11) {
        this.clipToBounds = z11;
    }

    public final void setClipToOutline(boolean z11) {
        this.clipToOutline = z11;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m4258setCompositingStrategyaDBOjCE(int i11) {
        this.compositingStrategy = i11;
    }

    public final void setElevation(float f11) {
        this.elevation = f11;
    }

    public final void setPivotX(float f11) {
        this.pivotX = f11;
    }

    public final void setPivotY(float f11) {
        this.pivotY = f11;
    }

    public final void setRenderEffect(@m80.l RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f11) {
        this.rotationX = f11;
    }

    public final void setRotationY(float f11) {
        this.rotationY = f11;
    }

    public final void setRotationZ(float f11) {
        this.rotationZ = f11;
    }

    public final void setScaleX(float f11) {
        this.scaleX = f11;
    }

    public final void setScaleY(float f11) {
        this.scaleY = f11;
    }

    public final void setSpotShadowColor(int i11) {
        this.spotShadowColor = i11;
    }

    public final void setTranslationX(float f11) {
        this.translationX = f11;
    }

    public final void setTranslationY(float f11) {
        this.translationY = f11;
    }

    @m80.k
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ", compositingStrategy=" + ((Object) CompositingStrategy.m2595toStringimpl(this.compositingStrategy)) + ')';
    }

    private DeviceRenderNodeData(long j11, int i11, int i12, int i13, int i14, int i15, int i16, float f11, float f12, float f13, float f14, float f15, int i17, int i18, float f16, float f17, float f18, float f19, float f21, float f22, boolean z11, boolean z12, float f23, RenderEffect renderEffect, int i19) {
        this.uniqueId = j11;
        this.left = i11;
        this.top = i12;
        this.right = i13;
        this.bottom = i14;
        this.width = i15;
        this.height = i16;
        this.scaleX = f11;
        this.scaleY = f12;
        this.translationX = f13;
        this.translationY = f14;
        this.elevation = f15;
        this.ambientShadowColor = i17;
        this.spotShadowColor = i18;
        this.rotationZ = f16;
        this.rotationX = f17;
        this.rotationY = f18;
        this.cameraDistance = f19;
        this.pivotX = f21;
        this.pivotY = f22;
        this.clipToOutline = z11;
        this.clipToBounds = z12;
        this.alpha = f23;
        this.renderEffect = renderEffect;
        this.compositingStrategy = i19;
    }
}
