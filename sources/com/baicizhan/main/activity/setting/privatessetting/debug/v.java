package com.baicizhan.main.activity.setting.privatessetting.debug;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowBackKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final v f19833a = new v();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f19834b = ComposableLambdaKt.composableLambdaInstance(1233997818, false, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.r
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 i11;
            i11 = v.i((Composer) obj, ((Integer) obj2).intValue());
            return i11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f19835c = ComposableLambdaKt.composableLambdaInstance(-1070340836, false, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.s
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 j11;
            j11 = v.j((Composer) obj, ((Integer) obj2).intValue());
            return j11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.q<RowScope, Composer, Integer, yz.g2> f19836d = ComposableLambdaKt.composableLambdaInstance(-242148884, false, new x00.q() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.t
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            yz.g2 l11;
            l11 = v.l((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return l11;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static x00.q<RowScope, Composer, Integer, yz.g2> f19837e = ComposableLambdaKt.composableLambdaInstance(-1920667135, false, new x00.q() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.u
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            yz.g2 k11;
            k11 = v.k((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return k11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 i(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1233997818, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.ComposableSingletons$AdCacheDetailActivityKt.lambda$1233997818.<anonymous> (AdCacheDetailActivity.kt:141)");
            }
            TextKt.m1845Text4IGK_g("广告资源缓存详情", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 j(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1070340836, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.ComposableSingletons$AdCacheDetailActivityKt.lambda$-1070340836.<anonymous> (AdCacheDetailActivity.kt:144)");
            }
            IconKt.m1692Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.Filled.INSTANCE), "返回", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 k(RowScope TextButton, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(TextButton, "$this$TextButton");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1920667135, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.ComposableSingletons$AdCacheDetailActivityKt.lambda$-1920667135.<anonymous> (AdCacheDetailActivity.kt:276)");
            }
            TextKt.m1845Text4IGK_g("删除", (Modifier) null, Color.Companion.m2543getRed0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 l(RowScope TextButton, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(TextButton, "$this$TextButton");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-242148884, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.ComposableSingletons$AdCacheDetailActivityKt.lambda$-242148884.<anonymous> (AdCacheDetailActivity.kt:157)");
            }
            TextKt.m1845Text4IGK_g("清除全部", (Modifier) null, Color.Companion.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> e() {
        return f19835c;
    }

    @m80.k
    public final x00.q<RowScope, Composer, Integer, yz.g2> f() {
        return f19837e;
    }

    @m80.k
    public final x00.q<RowScope, Composer, Integer, yz.g2> g() {
        return f19836d;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> h() {
        return f19834b;
    }
}
