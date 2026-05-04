package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
@kotlin.jvm.internal.u0({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffectVerificationHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,168:1\n65#2:169\n69#2:172\n65#2:174\n69#2:177\n60#3:170\n70#3:173\n60#3:175\n70#3:178\n22#4:171\n22#4:176\n22#4:179\n*S KotlinDebug\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffectVerificationHelper\n*L\n159#1:169\n159#1:172\n162#1:174\n163#1:177\n159#1:170\n159#1:173\n162#1:175\n163#1:178\n159#1:171\n162#1:176\n163#1:179\n*E\n"})
/* loaded from: classes.dex */
final class RenderEffectVerificationHelper {

    @m80.k
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    @m80.k
    /* renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final android.graphics.RenderEffect m2819createBlurEffect8A3gB4(@m80.l RenderEffect renderEffect, float f11, float f12, int i11) {
        android.graphics.RenderEffect createBlurEffect;
        android.graphics.RenderEffect createBlurEffect2;
        android.graphics.RenderEffect createOffsetEffect;
        if (f11 == 0.0f && f12 == 0.0f) {
            createOffsetEffect = android.graphics.RenderEffect.createOffsetEffect(0.0f, 0.0f);
            return createOffsetEffect;
        }
        if (renderEffect == null) {
            createBlurEffect2 = android.graphics.RenderEffect.createBlurEffect(f11, f12, AndroidTileMode_androidKt.m2414toAndroidTileMode0vamqd0(i11));
            return createBlurEffect2;
        }
        createBlurEffect = android.graphics.RenderEffect.createBlurEffect(f11, f12, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m2414toAndroidTileMode0vamqd0(i11));
        return createBlurEffect;
    }

    @m80.k
    /* renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final android.graphics.RenderEffect m2820createOffsetEffectUv8p0NA(@m80.l RenderEffect renderEffect, long j11) {
        android.graphics.RenderEffect createOffsetEffect;
        android.graphics.RenderEffect createOffsetEffect2;
        if (renderEffect == null) {
            createOffsetEffect2 = android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            return createOffsetEffect2;
        }
        createOffsetEffect = android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), renderEffect.asAndroidRenderEffect());
        return createOffsetEffect;
    }
}
