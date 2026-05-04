package com.baicizhan.main.activity.schedule_v2.mutimode;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.OptIn;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.NoOpCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.ui.PlayerView;
import b0.b;
import b0.f;
import coil.request.ImageRequest;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.ContentType;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.ModeDesc;
import com.jiongji.andriod.card.R;
import f0.e0;
import f0.p;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmodedesUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modedesUi.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ModedesUiKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,333:1\n113#2:334\n113#2:372\n113#2:410\n113#2:411\n113#2:416\n113#2:454\n113#2:455\n113#2:555\n113#2:556\n113#2:557\n113#2:558\n113#2:559\n113#2:560\n113#2:562\n113#2:568\n113#2:571\n113#2:629\n113#2:630\n70#3:335\n67#3,9:336\n70#3:417\n67#3,9:418\n77#3:459\n77#3:463\n70#3:470\n67#3,9:471\n77#3:516\n70#3:592\n67#3,9:593\n77#3:640\n79#4,6:345\n86#4,3:360\n89#4,2:369\n79#4,6:383\n86#4,3:398\n89#4,2:407\n93#4:414\n79#4,6:427\n86#4,3:442\n89#4,2:451\n93#4:458\n93#4:462\n79#4,6:480\n86#4,3:495\n89#4,2:504\n93#4:515\n79#4,6:527\n86#4,3:542\n89#4,2:551\n93#4:565\n79#4,6:602\n86#4,3:617\n89#4,2:626\n93#4:639\n347#5,9:351\n356#5:371\n347#5,9:389\n356#5:409\n357#5,2:412\n347#5,9:433\n356#5:453\n357#5,2:456\n357#5,2:460\n347#5,9:486\n356#5:506\n357#5,2:513\n347#5,9:533\n356#5:553\n357#5,2:563\n347#5,9:608\n356#5:628\n357#5,2:637\n4206#6,6:363\n4206#6,6:401\n4206#6,6:445\n4206#6,6:498\n4206#6,6:545\n4206#6,6:620\n87#7:373\n84#7,9:374\n94#7:415\n87#7:517\n84#7,9:518\n94#7:566\n1247#8,6:464\n1247#8,6:507\n1247#8,6:574\n1247#8,6:580\n1247#8,6:586\n1247#8,6:631\n1247#8,6:641\n1869#9:554\n1870#9:561\n75#10:567\n75#10:569\n75#10:572\n75#10:573\n192#11:570\n85#12:647\n113#12,2:648\n1#13:650\n64#14,5:651\n*S KotlinDebug\n*F\n+ 1 modedesUi.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ModedesUiKt\n*L\n69#1:334\n74#1:372\n80#1:410\n83#1:411\n95#1:416\n99#1:454\n103#1:455\n153#1:555\n155#1:556\n158#1:557\n160#1:558\n163#1:559\n165#1:560\n173#1:562\n197#1:568\n220#1:571\n303#1:629\n311#1:630\n66#1:335\n66#1:336,9\n91#1:417\n91#1:418,9\n91#1:459\n66#1:463\n127#1:470\n127#1:471,9\n127#1:516\n300#1:592\n300#1:593,9\n300#1:640\n66#1:345,6\n66#1:360,3\n66#1:369,2\n71#1:383,6\n71#1:398,3\n71#1:407,2\n71#1:414\n91#1:427,6\n91#1:442,3\n91#1:451,2\n91#1:458\n66#1:462\n127#1:480,6\n127#1:495,3\n127#1:504,2\n127#1:515\n146#1:527,6\n146#1:542,3\n146#1:551,2\n146#1:565\n300#1:602,6\n300#1:617,3\n300#1:626,2\n300#1:639\n66#1:351,9\n66#1:371\n71#1:389,9\n71#1:409\n71#1:412,2\n91#1:433,9\n91#1:453\n91#1:456,2\n66#1:460,2\n127#1:486,9\n127#1:506\n127#1:513,2\n146#1:533,9\n146#1:553\n146#1:563,2\n300#1:608,9\n300#1:628\n300#1:637,2\n66#1:363,6\n71#1:401,6\n91#1:445,6\n127#1:498,6\n146#1:545,6\n300#1:620,6\n71#1:373\n71#1:374,9\n71#1:415\n146#1:517\n146#1:518,9\n146#1:566\n122#1:464,6\n136#1:507,6\n241#1:574,6\n245#1:580,6\n253#1:586,6\n312#1:631,6\n326#1:641,6\n150#1:554\n150#1:561\n193#1:567\n209#1:569\n223#1:572\n239#1:573\n210#1:570\n241#1:647\n241#1:648,2\n327#1:651,5\n*E\n"})
/* loaded from: classes4.dex */
public final class g0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nmodedesUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modedesUi.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ModedesUiKt$ModeDesVideo$exoPlayer$1$1$1\n+ 2 CommonUtils2.kt\ncom/baicizhan/main/utils/CommonUtils2Kt\n*L\n1#1,333:1\n144#2:334\n*S KotlinDebug\n*F\n+ 1 modedesUi.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ModedesUiKt$ModeDesVideo$exoPlayer$1$1$1\n*L\n290#1:334\n*E\n"})
    public static final class a implements Player.Listener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f19335a;

        public a(MutableState<Boolean> mutableState) {
            this.f19335a = mutableState;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsPlayingChanged(boolean z11) {
            if (z11) {
                g0.x(this.f19335a, false);
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException error) {
            kotlin.jvm.internal.g0.p(error, "error");
            super.onPlayerError(error);
            String simpleName = a.class.getSimpleName();
            kotlin.jvm.internal.g0.o(simpleName, "getSimpleName(...)");
            qb.c.c(simpleName, "", error);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 modedesUi.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ModedesUiKt\n+ 3 CommonUtils2.kt\ncom/baicizhan/main/utils/CommonUtils2Kt\n*L\n1#1,67:1\n328#2,3:68\n331#2:72\n144#3:71\n*S KotlinDebug\n*F\n+ 1 modedesUi.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ModedesUiKt\n*L\n330#1:71\n*E\n"})
    public static final class b implements DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SimpleCache f19336a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExoPlayer f19337b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DisposableEffectScope f19338c;

        public b(SimpleCache simpleCache, ExoPlayer exoPlayer, DisposableEffectScope disposableEffectScope) {
            this.f19336a = simpleCache;
            this.f19337b = exoPlayer;
            this.f19338c = disposableEffectScope;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f19336a.release();
            this.f19337b.release();
            String simpleName = this.f19338c.getClass().getSimpleName();
            kotlin.jvm.internal.g0.o(simpleName, "getSimpleName(...)");
            qb.c.i(simpleName, "release player and cache", new Object[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19339a;

        static {
            int[] iArr = new int[ContentType.values().length];
            try {
                iArr[ContentType.GIF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentType.IMG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContentType.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19339a = iArr;
        }
    }

    public static final g2 A(Modifier modifier, String str, int i11, int i12, Composer composer, int i13) {
        v(modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void B(@m80.k final List<ModeDesc> list, @m80.k final String title, @m80.k x00.a<g2> aVar, @m80.l Composer composer, final int i11) {
        int i12;
        final x00.a<g2> close = aVar;
        kotlin.jvm.internal.g0.p(list, "list");
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(close, "close");
        Composer startRestartGroup = composer.startRestartGroup(-555845466);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(close) ? 256 : 128;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555845466, i13, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeDesView (modedesUi.kt:63)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 8;
            Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bk.b.A0(), RoundedCornerShapeKt.m1021RoundedCornerShapea9UjIt4$default(Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 12, null));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m234backgroundbw27NRU);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f12 = 16;
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f11));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m727paddingVpY3zN4);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            t(SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(44)), title, close, startRestartGroup, (i13 & 896) | (i13 & 112) | 6, 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(7)), startRestartGroup, 6);
            l(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), list, startRestartGroup, ((i13 << 3) & 112) | 6, 0);
            startRestartGroup.endNode();
            float f13 = 12;
            Modifier m729paddingqDBjuR0 = PaddingKt.m729paddingqDBjuR0(BackgroundKt.m235backgroundbw27NRU$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), bk.b.A0(), null, 2, null), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f13), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f12));
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m729paddingqDBjuR0);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            com.baicizhan.platform.base.widget.r.C(SizeKt.fillMaxWidth$default(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(48)), 0.0f, 1, null), aVar, StringResources_androidKt.stringResource(R.string.force_dialog_i_know, startRestartGroup, 6), 0L, null, 0, false, false, null, null, PaddingKt.m720PaddingValuesYgX7TsA(Dp.m5115constructorimpl(f13), Dp.m5115constructorimpl(6)), startRestartGroup, ((i13 >> 3) & 112) | 6, 0, 1016);
            close = aVar;
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.v
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 C;
                    C = g0.C(list, title, close, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return C;
                }
            });
        }
    }

    public static final g2 C(List list, String str, x00.a aVar, int i11, Composer composer, int i12) {
        B(list, str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void E(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1144524480);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1144524480, i11, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.testView (modedesUi.kt:111)");
            }
            ContentType contentType = ContentType.TEXT;
            List Q = a00.h0.Q(new ModeDesc(contentType, "少侠，你知道吗？你的左脑最擅长记忆逻辑性强的顺序关联事物，而右脑掌管了空间和色彩等形象思维。\n百词斩经典模式正是运用了你的左右脑优势，通过生动形象的图像与情境，调动多感官的信号刺激，帮助你对单词产生深刻强烈的记忆。这个方法也叫作图像联想记忆法~"), new ModeDesc(ContentType.IMG, "https://7n.bczcdn.com/r/q9uweeng2wuwnqmybkh97ggp9zkdgfss.jpg"), new ModeDesc(contentType, "经典模式1词共3题，第1题：看句选图；第2题：看词选图；第3题：英文选意"));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.x
                    @Override // x00.a
                    public final Object invoke() {
                        g2 F;
                        F = g0.F();
                        return F;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            B(Q, "深度模式", (x00.a) rememberedValue, startRestartGroup, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.y
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 G;
                    G = g0.G(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return G;
                }
            });
        }
    }

    public static final g2 F() {
        return g2.f100423a;
    }

    public static final g2 G(int i11, Composer composer, int i12) {
        E(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void l(@m80.l Modifier modifier, @m80.k final List<ModeDesc> list, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(list, "list");
        Composer startRestartGroup = composer.startRestartGroup(2135302336);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2135302336, i13, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeDesContent (modedesUi.kt:144)");
            }
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(modifier3, new ScrollState(0), false, null, false, 14, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1745415584);
            for (ModeDesc modeDesc : list) {
                int i15 = c.f19339a[modeDesc.g().ordinal()];
                if (i15 == 1) {
                    startRestartGroup.startReplaceGroup(933447947);
                    Modifier.Companion companion2 = Modifier.Companion;
                    float f11 = 10;
                    SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion2, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
                    n(modeDesc.e(), startRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion2, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                } else if (i15 == 2) {
                    startRestartGroup.startReplaceGroup(933676169);
                    Modifier.Companion companion3 = Modifier.Companion;
                    float f12 = 10;
                    SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(f12)), startRestartGroup, 6);
                    v(null, modeDesc.e(), startRestartGroup, 0, 1);
                    SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(f12)), startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                } else if (i15 == 3) {
                    startRestartGroup.startReplaceGroup(933904329);
                    Modifier.Companion companion4 = Modifier.Companion;
                    float f13 = 10;
                    SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion4, Dp.m5115constructorimpl(f13)), startRestartGroup, 6);
                    p(modeDesc.e(), startRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion4, Dp.m5115constructorimpl(f13)), startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                } else if (i15 != 4) {
                    startRestartGroup.startReplaceGroup(934221769);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(934129637);
                    r(modeDesc.e(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
            }
            startRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(120)), startRestartGroup, 6);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.d0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 m11;
                    m11 = g0.m(Modifier.this, list, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return m11;
                }
            });
        }
    }

    public static final g2 m(Modifier modifier, List list, int i11, int i12, Composer composer, int i13) {
        l(modifier, list, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void n(@m80.k final String url, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(url, "url");
        Composer startRestartGroup = composer.startRestartGroup(1428141267);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(url) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        boolean z11 = false;
        int i13 = 1;
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1428141267, i12, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeDesGif (modedesUi.kt:207)");
            }
            f.a aVar = new f.a((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            b.a aVar2 = new b.a();
            kotlin.jvm.internal.v vVar = null;
            if (Build.VERSION.SDK_INT >= 28) {
                aVar2.a(new e0.a(z11, i13, vVar));
            } else {
                aVar2.a(new p.b(z11, i13, vVar));
            }
            b0.f j11 = aVar.o(aVar2.i()).j();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(ClipKt.clip(Modifier.Companion, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4))), 0.0f, 1, null);
            ImageRequest.Builder j12 = new ImageRequest.Builder((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(url);
            j12.g0(q0.g.f81365d);
            ImageKt.Image(coil.compose.a.d(j12.f(), j11, PainterResources_androidKt.painterResource(R.drawable.ic_multi_mode_placeholder, startRestartGroup, 6), null, null, null, null, null, null, 0, null, startRestartGroup, 0, 0, 2040), (String) null, fillMaxWidth$default, (Alignment) null, ContentScale.Companion.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.b0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 o11;
                    o11 = g0.o(url, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return o11;
                }
            });
        }
    }

    public static final g2 o(String str, int i11, Composer composer, int i12) {
        n(str, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @Composable
    public static final void p(@m80.k final String url, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        kotlin.jvm.internal.g0.p(url, "url");
        Composer startRestartGroup = composer.startRestartGroup(51351964);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(url) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(51351964, i12, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeDesImage (modedesUi.kt:190)");
            }
            composer2 = startRestartGroup;
            coil.compose.l.b(new ImageRequest.Builder((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(url).f(), "", SizeKt.fillMaxWidth$default(ClipKt.clip(Modifier.Companion, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4))), 0.0f, 1, null), PainterResources_androidKt.painterResource(R.drawable.ic_multi_mode_placeholder, startRestartGroup, 6), null, null, null, null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer2, 48, 6, 64496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.a0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 q11;
                    q11 = g0.q(url, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return q11;
                }
            });
        }
    }

    public static final g2 q(String str, int i11, Composer composer, int i12) {
        p(str, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void r(@m80.k final String text, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        kotlin.jvm.internal.g0.p(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(451419176);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changed(text) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(451419176, i12, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeDesText (modedesUi.kt:177)");
            }
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(text, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), bk.b.d0(), bk.d.m(), (FontStyle) null, FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(28), 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, composer2, (i12 & 14) | 200112, 6, 130000);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.z
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 s11;
                    s11 = g0.s(text, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return s11;
                }
            });
        }
    }

    public static final g2 s(String str, int i11, Composer composer, int i12) {
        r(str, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void t(@m80.l Modifier modifier, @m80.k final String title, @m80.k final x00.a<g2> close, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(close, "close");
        Composer startRestartGroup = composer.startRestartGroup(2108953566);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(close) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2108953566, i13, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeDesTitle (modedesUi.kt:125)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifier5 = modifier4;
            TextKt.m1845Text4IGK_g(title, boxScopeInstance.align(companion3, companion.getCenter()), bk.b.x(), bk.d.m(), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, ((i13 >> 3) & 14) | 200064, 0, 131024);
            startRestartGroup = startRestartGroup;
            Modifier align = boxScopeInstance.align(companion3, companion.getCenterEnd());
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_ab_close_black, startRestartGroup, 6), (String) null, ClickableKt.m267clickableO2vRcR0$default(align, (MutableInteractionSource) rememberedValue, null, false, null, null, close, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.c0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 u11;
                    u11 = g0.u(Modifier.this, title, close, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return u11;
                }
            });
        }
    }

    public static final g2 u(Modifier modifier, String str, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        t(modifier, str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @OptIn(markerClass = {UnstableApi.class})
    @Composable
    public static final void v(@m80.l Modifier modifier, @m80.k final String url, @m80.l Composer composer, final int i11, final int i12) {
        final Modifier modifier2;
        int i13;
        kotlin.jvm.internal.g0.p(url, "url");
        Composer startRestartGroup = composer.startRestartGroup(2024162101);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(url) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2024162101, i13, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeDesVideo (modedesUi.kt:237)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new SimpleCache(new File(context.getCacheDir(), "des_video"), new NoOpCacheEvictor(), new StandaloneDatabaseProvider(context));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final SimpleCache simpleCache = (SimpleCache) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            Object obj = rememberedValue3;
            if (rememberedValue3 == companion.getEmpty()) {
                ExoPlayer build = new ExoPlayer.Builder(context).build();
                build.setPlayWhenReady(true);
                build.setVideoScalingMode(2);
                build.setRepeatMode(2);
                CacheDataSource.Factory flags = new CacheDataSource.Factory().setCache(simpleCache).setCacheWriteDataSinkFactory(new CacheDataSink.Factory().setCache(simpleCache)).setCacheReadDataSourceFactory(new FileDataSource.Factory()).setUpstreamDataSourceFactory(new DefaultDataSource.Factory(context, new DefaultHttpDataSource.Factory())).setFlags(2);
                kotlin.jvm.internal.g0.o(flags, "setFlags(...)");
                ProgressiveMediaSource createMediaSource = new ProgressiveMediaSource.Factory(flags).createMediaSource(MediaItem.fromUri(url));
                kotlin.jvm.internal.g0.o(createMediaSource, "createMediaSource(...)");
                build.addListener(new a(mutableState));
                build.setMediaSource(createMediaSource);
                build.prepare();
                startRestartGroup.updateRememberedValue(build);
                obj = build;
            }
            final ExoPlayer exoPlayer = (ExoPlayer) obj;
            kotlin.jvm.internal.g0.m(exoPlayer);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            float f11 = 4;
            Modifier modifier4 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_multi_mode_placeholder, startRestartGroup, 6), "", SizeKt.fillMaxWidth$default(ClipKt.clip(companion3, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f11))), 0.0f, 1, null), (Alignment) null, ContentScale.Companion.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
            if (w(mutableState)) {
                startRestartGroup.startReplaceGroup(-554066802);
            } else {
                startRestartGroup.startReplaceGroup(-543202976);
                Modifier clip = ClipKt.clip(companion3, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f11)));
                boolean changedInstance = startRestartGroup.changedInstance(exoPlayer);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.e0
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            PlayerView y11;
                            y11 = g0.y(ExoPlayer.this, (Context) obj2);
                            return y11;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                AndroidView_androidKt.AndroidView((x00.l) rememberedValue4, clip, null, startRestartGroup, 0, 4);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            g2 g2Var = g2.f100423a;
            boolean changedInstance2 = startRestartGroup.changedInstance(simpleCache) | startRestartGroup.changedInstance(exoPlayer);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.f0
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        DisposableEffectResult z11;
                        z11 = g0.z(SimpleCache.this, exoPlayer, (DisposableEffectScope) obj2);
                        return z11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            EffectsKt.DisposableEffect(g2Var, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.w
                @Override // x00.p
                public final Object invoke(Object obj2, Object obj3) {
                    g2 A;
                    A = g0.A(Modifier.this, url, i11, i12, (Composer) obj2, ((Integer) obj3).intValue());
                    return A;
                }
            });
        }
    }

    public static final boolean w(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void x(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final PlayerView y(ExoPlayer exoPlayer, Context it) {
        kotlin.jvm.internal.g0.p(it, "it");
        View inflate = LayoutInflater.from(it).inflate(R.layout.layout_multi_mode_desc_video, (ViewGroup) null);
        kotlin.jvm.internal.g0.n(inflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
        PlayerView playerView = (PlayerView) inflate;
        playerView.hideController();
        playerView.setUseController(false);
        playerView.setResizeMode(4);
        playerView.setPlayer(exoPlayer);
        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return playerView;
    }

    public static final DisposableEffectResult z(SimpleCache simpleCache, ExoPlayer exoPlayer, DisposableEffectScope DisposableEffect) {
        kotlin.jvm.internal.g0.p(DisposableEffect, "$this$DisposableEffect");
        return new b(simpleCache, exoPlayer, DisposableEffect);
    }
}
