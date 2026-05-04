package com.baicizhan.main.home.dialog;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CheckboxDefaults;
import androidx.compose.material.CheckboxKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.baicizhan.main.home.dialog.PromptKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import java.util.LinkedHashMap;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nprompt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,388:1\n1247#2,6:389\n1247#2,6:395\n1247#2,6:401\n1247#2,6:407\n1247#2,6:413\n1247#2,6:419\n1247#2,6:425\n1247#2,6:431\n1225#2,6:444\n354#3,7:437\n361#3,2:450\n363#3,7:453\n401#3,10:460\n400#3:470\n412#3,4:471\n416#3,7:476\n446#3,12:483\n472#3:495\n1#4:452\n77#5:475\n*S KotlinDebug\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt\n*L\n121#1:389,6\n125#1:395,6\n129#1:401,6\n152#1:407,6\n154#1:413,6\n155#1:419,6\n156#1:425,6\n168#1:431,6\n167#1:444,6\n167#1:437,7\n167#1:450,2\n167#1:453,7\n167#1:460,10\n167#1:470\n167#1:471,4\n167#1:476,7\n167#1:483,12\n167#1:495\n167#1:452\n167#1:475\n*E\n"})
/* loaded from: classes4.dex */
public final class PromptKt {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final e0[] f20832a = {new e0("已新学完全部单词，快去复习吧，记得更牢固", null, null, null, false, 0, null, null, false, null, null, false, null, null, null, 32766, null), new e0("已新学完全部单词，快去复习吧，记得更牢固", null, null, null, false, 0, "", "去复习", false, null, null, false, null, null, null, 32574, null), new e0("已新学完全部单词，快去复习吧，记得更牢固", null, null, null, false, R.drawable.image_home_dialog_offline, null, "去复习", false, null, null, false, null, null, null, 30558, null), new e0("已新学完全部单词，快去复习吧，记得更牢固，快去复习吧，记得更牢固，快去复习吧，记得更牢固", null, null, null, false, 0, "去复习", "去复习", false, null, null, false, null, null, null, 32574, null), new e0("已新学完全部单词，快去复习吧，记得更牢固，快去复习吧，记得更牢固，快去复习吧，记得更牢固，快去复习吧，记得更牢固，快去复习吧，记得更牢固", null, null, null, false, 0, "去复习", "去复习", false, null, null, false, null, null, null, 32574, null), new e0("已新学完全部单词，快去复习吧，记得更牢固", "快去复习吧，记得更牢固，快去复习吧，记得更牢固", null, null, false, 0, "去复习", "去复习", false, null, null, false, null, null, null, 32572, null), new e0(null, "快去复习吧，记得更牢固，快去复习吧，记得更牢固，记得更牢固，快去复习吧，记得更牢固，记得更牢固，快去复习吧，记得更牢固，记得更牢固，记得更牢固，快去复习吧，记得更牢固，记得更牢固，快去复习吧，记得更牢固", null, null, false, 0, "去复习", "去复习", false, null, null, false, null, null, null, 32573, null), new e0("已新学完全部单词，快去复习吧，记得更牢固", null, null, null, false, R.drawable.image_home_dialog_hammer, null, "去复习", false, null, null, false, null, null, null, 32606, null), new e0("已新学完全部单词，快去复习吧，记得更牢固", "快去复习吧，记得更牢固，快去复习吧，记得更牢固", null, null, false, 0, "去复习", "去复习", true, "测试一下", null, false, null, null, null, 31804, null)};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nprompt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt$PromptDialog$10$2$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,388:1\n113#2:389\n*S KotlinDebug\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt$PromptDialog$10$2$2$1\n*L\n178#1:389\n*E\n"})
    public static final class b implements x00.l<ConstrainScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f20839a = new b();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerVerticallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            constrainAs.setWidth(Dimension.Companion.getFillToConstraints());
            float f11 = 40;
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 112, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nprompt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt$PromptDialog$10$2$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,388:1\n113#2:389\n113#2:427\n113#2:428\n113#2:429\n113#2:436\n113#2:437\n113#2:438\n113#2:482\n113#2:483\n113#2:524\n113#2:525\n113#2:569\n113#2:570\n87#3:390\n84#3,9:391\n94#3:625\n79#4,6:400\n86#4,3:415\n89#4,2:424\n79#4,6:445\n86#4,3:460\n89#4,2:469\n93#4:480\n79#4,6:495\n86#4,3:510\n89#4,2:519\n79#4,6:535\n86#4,3:550\n89#4,2:559\n93#4:564\n79#4,6:586\n86#4,3:601\n89#4,2:610\n93#4:615\n93#4:620\n93#4:624\n347#5,9:406\n356#5:426\n347#5,9:451\n356#5:471\n357#5,2:478\n347#5,9:501\n356#5:521\n347#5,9:541\n356#5,3:561\n347#5,9:592\n356#5,3:612\n357#5,2:618\n357#5,2:622\n4206#6,6:418\n4206#6,6:463\n4206#6,6:513\n4206#6,6:553\n4206#6,6:604\n1247#7,6:430\n1247#7,6:472\n1247#7,6:571\n99#8,6:439\n106#8:481\n99#8:484\n95#8,10:485\n106#8:621\n18#9,2:522\n20#9:566\n18#9,2:567\n20#9:617\n70#10:526\n68#10,8:527\n77#10:565\n70#10:577\n68#10,8:578\n77#10:616\n*S KotlinDebug\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt$PromptDialog$10$2$3\n*L\n180#1:389\n195#1:427\n203#1:428\n214#1:429\n223#1:436\n227#1:437\n228#1:438\n250#1:482\n251#1:483\n254#1:524\n255#1:525\n270#1:569\n271#1:570\n180#1:390\n180#1:391,9\n180#1:625\n180#1:400,6\n180#1:415,3\n180#1:424,2\n224#1:445,6\n224#1:460,3\n224#1:469,2\n224#1:480\n251#1:495,6\n251#1:510,3\n251#1:519,2\n253#1:535,6\n253#1:550,3\n253#1:559,2\n253#1:564\n269#1:586,6\n269#1:601,3\n269#1:610,2\n269#1:615\n251#1:620\n180#1:624\n180#1:406,9\n180#1:426\n224#1:451,9\n224#1:471\n224#1:478,2\n251#1:501,9\n251#1:521\n253#1:541,9\n253#1:561,3\n269#1:592,9\n269#1:612,3\n251#1:618,2\n180#1:622,2\n180#1:418,6\n224#1:463,6\n251#1:513,6\n253#1:553,6\n269#1:604,6\n221#1:430,6\n233#1:472,6\n273#1:571,6\n224#1:439,6\n224#1:481\n251#1:484\n251#1:485,10\n251#1:621\n252#1:522,2\n252#1:566\n268#1:567,2\n268#1:617\n253#1:526\n253#1:527,8\n253#1:565\n269#1:577\n269#1:578,8\n269#1:616\n*E\n"})
    public static final class c implements x00.p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f20840a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.r<ColumnScope, Modifier, Composer, Integer, g2> f20841b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AnnotatedString f20842c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f20843d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f20844e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f20845f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f20846g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f20847h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f20848i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ x00.l<Boolean, g2> f20849j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f20850k;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements x00.l<Boolean, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f20851a;

            public a(MutableState<Boolean> mutableState) {
                this.f20851a = mutableState;
            }

            public final void a(boolean z11) {
                this.f20851a.setValue(Boolean.valueOf(z11));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Boolean bool) {
                a(bool.booleanValue());
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b implements x00.a<g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x00.l<Boolean, g2> f20852a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f20853b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x00.a<g2> f20854c;

            /* JADX WARN: Multi-variable type inference failed */
            public b(x00.l<? super Boolean, g2> lVar, MutableState<Boolean> mutableState, x00.a<g2> aVar) {
                this.f20852a = lVar;
                this.f20853b = mutableState;
                this.f20854c = aVar;
            }

            public final void a() {
                this.f20852a.invoke(this.f20853b.getValue());
                this.f20854c.invoke();
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                a();
                return g2.f100423a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, x00.r<? super ColumnScope, ? super Modifier, ? super Composer, ? super Integer, g2> rVar, AnnotatedString annotatedString, String str2, String str3, String str4, String str5, boolean z11, x00.a<g2> aVar, x00.l<? super Boolean, g2> lVar, x00.a<g2> aVar2) {
            this.f20840a = str;
            this.f20841b = rVar;
            this.f20842c = annotatedString;
            this.f20843d = str2;
            this.f20844e = str3;
            this.f20845f = str4;
            this.f20846g = str5;
            this.f20847h = z11;
            this.f20848i = aVar;
            this.f20849j = lVar;
            this.f20850k = aVar2;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Composer composer, int i11) {
            ColumnScopeInstance columnScopeInstance;
            float f11;
            float f12;
            Modifier.Companion companion;
            x00.r<ColumnScope, Modifier, Composer, Integer, g2> rVar;
            AnnotatedString annotatedString;
            String str;
            String str2;
            String str3;
            String str4;
            boolean z11;
            x00.l<Boolean, g2> lVar;
            x00.a<g2> aVar;
            x00.a<g2> aVar2;
            int i12;
            Modifier.Companion companion2;
            Object obj;
            Modifier.Companion companion3;
            MutableState mutableState;
            Object obj2;
            int i13;
            RowScopeInstance rowScopeInstance;
            int i14;
            Modifier.Companion companion4;
            Composer composer2 = composer;
            if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(566956671, i11, -1, "com.baicizhan.main.home.dialog.PromptDialog.<anonymous>.<anonymous>.<anonymous> (prompt.kt:179)");
            }
            Modifier.Companion companion5 = Modifier.Companion;
            float f13 = 16;
            float f14 = 24;
            Modifier m729paddingqDBjuR0 = PaddingKt.m729paddingqDBjuR0(companion5, Dp.m5115constructorimpl(f14), Dp.m5115constructorimpl(32), Dp.m5115constructorimpl(f14), Dp.m5115constructorimpl(f13));
            Alignment.Companion companion6 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion6.getCenterHorizontally();
            String str5 = this.f20840a;
            x00.r<ColumnScope, Modifier, Composer, Integer, g2> rVar2 = this.f20841b;
            AnnotatedString annotatedString2 = this.f20842c;
            String str6 = this.f20843d;
            String str7 = this.f20844e;
            String str8 = this.f20845f;
            String str9 = this.f20846g;
            boolean z12 = this.f20847h;
            x00.a<g2> aVar3 = this.f20848i;
            x00.l<Boolean, g2> lVar2 = this.f20849j;
            x00.a<g2> aVar4 = this.f20850k;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m729paddingqDBjuR0);
            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion7.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion7.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion7.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion7.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion7.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            if (str5.length() > 0) {
                composer2.startReplaceGroup(-1722313726);
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i15 = MaterialTheme.$stable;
                TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer2, i15).getSubtitle1(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                f11 = f13;
                f12 = f14;
                companion = companion5;
                rVar = rVar2;
                str3 = str8;
                str4 = str9;
                z11 = z12;
                aVar2 = aVar3;
                annotatedString = annotatedString2;
                columnScopeInstance = columnScopeInstance2;
                aVar = aVar4;
                lVar = lVar2;
                str = str6;
                str2 = str7;
                i12 = 24;
                TextKt.m1845Text4IGK_g(str5, (Modifier) null, bk.b.M(materialTheme.getColors(composer2, i15)), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), TextUnitKt.getSp(22), TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 3, 0, (x00.l<? super TextLayoutResult, g2>) null, m4572copyp1EtxEg$default, composer, 0, 3126, 53754);
                composer2 = composer;
            } else {
                columnScopeInstance = columnScopeInstance2;
                f11 = f13;
                f12 = f14;
                companion = companion5;
                rVar = rVar2;
                annotatedString = annotatedString2;
                str = str6;
                str2 = str7;
                str3 = str8;
                str4 = str9;
                z11 = z12;
                lVar = lVar2;
                aVar = aVar4;
                aVar2 = aVar3;
                i12 = 24;
                composer2.startReplaceGroup(-1728811667);
            }
            composer2.endReplaceGroup();
            if (rVar != null) {
                composer2.startReplaceGroup(-1721794538);
                Modifier.Companion companion8 = companion;
                rVar.invoke(columnScopeInstance, SizeKt.fillMaxWidth$default(PaddingKt.m730paddingqDBjuR0$default(companion8, 0.0f, str5.length() > 0 ? Dp.m5115constructorimpl(f12) : Dp.m5115constructorimpl(0), 0.0f, Dp.m5115constructorimpl(8), 5, null), 0.0f, 1, null), composer2, 6);
                composer2.endReplaceGroup();
                companion2 = companion8;
            } else {
                Modifier.Companion companion9 = companion;
                if (annotatedString != null) {
                    composer2.startReplaceGroup(-1721510547);
                    long sp2 = TextUnitKt.getSp(15);
                    long sp3 = TextUnitKt.getSp(i12);
                    TextKt.m1846TextIbK3jfQ(annotatedString, PaddingKt.m730paddingqDBjuR0$default(companion9, 0.0f, Dp.m5115constructorimpl(str5.length() > 0 ? 12 : 0), 0.0f, 0.0f, 13, null), bk.b.P(MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable)), sp2, null, null, null, 0L, null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), sp3, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 4, 0, null, null, null, composer, 3072, 3126, 250352);
                    composer2 = composer;
                    composer2.endReplaceGroup();
                    companion2 = companion9;
                } else {
                    if (str.length() > 0) {
                        composer2.startReplaceGroup(-1720923562);
                        long sp4 = TextUnitKt.getSp(15);
                        long sp5 = TextUnitKt.getSp(i12);
                        companion2 = companion9;
                        TextKt.m1845Text4IGK_g(str, PaddingKt.m730paddingqDBjuR0$default(companion9, 0.0f, Dp.m5115constructorimpl(str5.length() > 0 ? 12 : 0), 0.0f, 0.0f, 13, null), bk.b.P(MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable)), sp4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), sp5, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 4, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, composer, 3072, 3126, 119280);
                        composer2 = composer;
                    } else {
                        companion2 = companion9;
                        composer2.startReplaceGroup(-1728811667);
                    }
                    composer2.endReplaceGroup();
                }
            }
            Object rememberedValue = composer2.rememberedValue();
            Composer.Companion companion10 = Composer.Companion;
            if (rememberedValue == companion10.getEmpty()) {
                obj = null;
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z11), null, 2, null);
                composer2.updateRememberedValue(rememberedValue);
            } else {
                obj = null;
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            if (str2.length() > 0) {
                composer2.startReplaceGroup(-1720246398);
                SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion2, Dp.m5115constructorimpl(f11)), composer2, 6);
                Alignment.Vertical centerVertically = companion6.getCenterVertically();
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                int i16 = MaterialTheme.$stable;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m728paddingVpY3zN4$default(BackgroundKt.m234backgroundbw27NRU(companion2, bk.b.Z(materialTheme2.getColors(composer2, i16)), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(8))), 0.0f, Dp.m5115constructorimpl(6), 1, obj), 0.0f, 1, obj);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                x00.a<ComposeUiNode> constructor2 = companion7.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer2);
                Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion7.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion7.getSetModifier());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                Object rememberedValue2 = composer2.rememberedValue();
                if (rememberedValue2 == companion10.getEmpty()) {
                    rememberedValue2 = new a(mutableState2);
                    composer2.updateRememberedValue(rememberedValue2);
                }
                companion3 = companion2;
                mutableState = mutableState2;
                CheckboxKt.Checkbox(booleanValue, (x00.l) rememberedValue2, null, false, null, CheckboxDefaults.INSTANCE.m1578colorszjMxDiM(ColorKt.Color(4291551487L), bk.b.V(materialTheme2.getColors(composer2, i16)), ColorKt.Color(4280572379L), 0L, 0L, composer2, (CheckboxDefaults.$stable << 15) | 390, 24), composer, 48, 28);
                obj2 = null;
                TextKt.m1845Text4IGK_g(str2, (Modifier) null, bk.b.R(materialTheme2.getColors(composer, i16)), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(15), 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, composer, 3072, 6, 130034);
                composer2 = composer;
                composer2.endNode();
                composer2.endReplaceGroup();
                i13 = -1728811667;
            } else {
                companion3 = companion2;
                mutableState = mutableState2;
                obj2 = obj;
                i13 = -1728811667;
                composer2.startReplaceGroup(-1728811667);
                composer2.endReplaceGroup();
            }
            if (str3 == null || str3.length() > 0 || str4 == null || str4.length() > 0) {
                composer2.startReplaceGroup(-1718757437);
                Modifier.Companion companion11 = companion3;
                SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion11, Dp.m5115constructorimpl(f11)), composer2, 6);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(8)), companion6.getTop(), composer2, 6);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion11);
                x00.a<ComposeUiNode> constructor3 = companion7.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer2);
                Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy2, companion7.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion7.getSetModifier());
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                composer2.startReplaceGroup(1350435794);
                String str10 = str3 == null ? "取消" : str3;
                if (str10.length() == 0) {
                    rowScopeInstance = rowScopeInstance3;
                    i14 = 209;
                    companion4 = companion11;
                } else {
                    rowScopeInstance = rowScopeInstance3;
                    Modifier k11 = ComposeUtilsKt.k(SizeKt.m759height3ABfNKs(SizeKt.m780widthInVpY3zN4$default(companion11, 0.0f, Dp.m5115constructorimpl(209), 1, obj2), Dp.m5115constructorimpl(48)).then(RowScope.weight$default(rowScopeInstance3, companion11, 1.0f, false, 2, null)), 0L, false, aVar2, 3, null);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, k11);
                    x00.a<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer2);
                    Updater.m1958setimpl(m1951constructorimpl4, maybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                    Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                    x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                    if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i17 = MaterialTheme.$stable;
                    i14 = 209;
                    companion4 = companion11;
                    TextKt.m1845Text4IGK_g(str10, (Modifier) null, bk.b.M(materialTheme3.getColors(composer2, i17)), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme3.getTypography(composer2, i17).getSubtitle1(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 65018);
                    composer2 = composer;
                    composer2.endNode();
                    g2 g2Var = g2.f100423a;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1350468396);
                String str11 = str4 == null ? "确定" : str4;
                if (str11.length() != 0) {
                    Modifier.Companion companion12 = companion4;
                    Modifier then = SizeKt.m759height3ABfNKs(SizeKt.m780widthInVpY3zN4$default(companion12, 0.0f, Dp.m5115constructorimpl(i14), 1, null), Dp.m5115constructorimpl(48)).then(RowScope.weight$default(rowScopeInstance, companion12, 1.0f, false, 2, null));
                    x00.l<Boolean, g2> lVar3 = lVar;
                    x00.a<g2> aVar5 = aVar;
                    boolean changed = composer2.changed(lVar3) | composer2.changed(aVar5);
                    Object rememberedValue3 = composer2.rememberedValue();
                    if (changed || rememberedValue3 == companion10.getEmpty()) {
                        rememberedValue3 = new b(lVar3, mutableState, aVar5);
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    Modifier k12 = ComposeUtilsKt.k(then, 0L, false, (x00.a) rememberedValue3, 3, null);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, k12);
                    x00.a<ComposeUiNode> constructor5 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer m1951constructorimpl5 = Updater.m1951constructorimpl(composer2);
                    Updater.m1958setimpl(m1951constructorimpl5, maybeCachedBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                    Updater.m1958setimpl(m1951constructorimpl5, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                    x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                    if (m1951constructorimpl5.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        m1951constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        m1951constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m1958setimpl(m1951constructorimpl5, materializeModifier5, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i18 = MaterialTheme.$stable;
                    TextKt.m1845Text4IGK_g(str11, (Modifier) null, materialTheme4.getColors(composer2, i18).m1600getPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme4.getTypography(composer2, i18).getSubtitle1(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 65018);
                    composer.endNode();
                    g2 g2Var2 = g2.f100423a;
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(i13);
                composer2.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nprompt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt$PromptDialog$10$2$4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,388:1\n113#2:389\n113#2:390\n*S KotlinDebug\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt$PromptDialog$10$2$4$1\n*L\n295#1:389\n296#1:390\n*E\n"})
    public static final class d implements x00.l<ConstrainScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f20855a;

        public d(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f20855a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f20855a.getTop(), Dp.m5115constructorimpl(-14), 0.0f, 4, (Object) null);
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), this.f20855a.getEnd(), Dp.m5115constructorimpl(-8), 0.0f, 4, null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nprompt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt$PromptDialog$10$2$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,388:1\n113#2:389\n113#2:390\n113#2:391\n*S KotlinDebug\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt$PromptDialog$10$2$5$1\n*L\n304#1:389\n305#1:390\n307#1:391\n*E\n"})
    public static final class e implements x00.l<ConstrainScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f20856a;

        public e(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f20856a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            Dimension.Companion companion = Dimension.Companion;
            float f11 = 112;
            constrainAs.setWidth(companion.m5473value0680j_4(Dp.m5115constructorimpl(f11)));
            constrainAs.setHeight(companion.m5473value0680j_4(Dp.m5115constructorimpl(f11)));
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, this.f20856a.getStart(), this.f20856a.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f20856a.getTop(), Dp.m5115constructorimpl(-88), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return g2.f100423a;
        }
    }

    public static final g2 A(MutableState mutableState, int i11, Composer composer, int i12) {
        p(mutableState, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    public static final g2 B(boolean z11) {
        return g2.f100423a;
    }

    public static final g2 C() {
        return g2.f100423a;
    }

    public static final g2 D() {
        return g2.f100423a;
    }

    public static final g2 E() {
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void F(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-2024526014);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2024526014, i11, -1, "com.baicizhan.main.home.dialog.PromptDialogPreview (prompt.kt:371)");
            }
            bk.k.h(null, null, null, n.f20967a.d(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.dialog.m0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 G;
                    G = PromptKt.G(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return G;
                }
            });
        }
    }

    public static final g2 G(int i11, Composer composer, int i12) {
        F(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void H(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(436043863);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(436043863, i11, -1, "com.baicizhan.main.home.dialog.PromptDialogPreview1 (prompt.kt:381)");
            }
            bk.k.h(null, null, null, n.f20967a.c(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.dialog.n0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 I;
                    I = PromptKt.I(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return I;
                }
            });
        }
    }

    public static final g2 I(int i11, Composer composer, int i12) {
        H(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @m80.k
    public static final e0[] J() {
        return f20832a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        if (r5 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L52;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(@m80.k final androidx.compose.runtime.MutableState<com.baicizhan.main.home.dialog.e0> r23, @m80.l androidx.compose.runtime.Composer r24, final int r25) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.dialog.PromptKt.p(androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void q(@m80.l final e0 e0Var, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-965091140);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(e0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-965091140, i12, -1, "com.baicizhan.main.home.dialog.PromptDialog (prompt.kt:81)");
            }
            if (e0Var != null) {
                startRestartGroup.startReplaceGroup(-518978508);
                r(e0Var.N(), e0Var.G(), e0Var.z(), e0Var.E(), e0Var.A(), e0Var.F(), e0Var.H(), e0Var.M(), e0Var.C(), e0Var.B(), e0Var.J(), e0Var.D(), e0Var.K(), e0Var.I(), e0Var.L(), startRestartGroup, 0, 0, 0);
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-522149498);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.dialog.l0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 s11;
                    s11 = PromptKt.s(e0.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return s11;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0216  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(@m80.l java.lang.String r51, @m80.l java.lang.String r52, @m80.l androidx.compose.ui.text.AnnotatedString r53, @m80.l x00.r<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r54, boolean r55, @androidx.annotation.DrawableRes int r56, @m80.l java.lang.String r57, @m80.l java.lang.String r58, boolean r59, @m80.l java.lang.String r60, @m80.l x00.l<? super java.lang.Boolean, yz.g2> r61, boolean r62, @m80.l x00.a<yz.g2> r63, @m80.l x00.a<yz.g2> r64, @m80.l x00.a<yz.g2> r65, @m80.l androidx.compose.runtime.Composer r66, final int r67, final int r68, final int r69) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.dialog.PromptKt.r(java.lang.String, java.lang.String, androidx.compose.ui.text.AnnotatedString, x00.r, boolean, int, java.lang.String, java.lang.String, boolean, java.lang.String, x00.l, boolean, x00.a, x00.a, x00.a, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final g2 s(e0 e0Var, int i11, Composer composer, int i12) {
        q(e0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    public static final g2 t(MutableState mutableState, int i11, Composer composer, int i12) {
        p(mutableState, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 u(boolean z11, final x00.a aVar, final boolean z12, final int i11, final String str, final x00.r rVar, final AnnotatedString annotatedString, final String str2, final String str3, final String str4, final String str5, final boolean z13, final x00.a aVar2, final x00.l lVar, final x00.a aVar3, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-116103438, i12, -1, "com.baicizhan.main.home.dialog.PromptDialog.<anonymous> (prompt.kt:166)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.dialog.f0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 v11;
                        v11 = PromptKt.v(x00.a.this);
                        return v11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(ComposeUtilsKt.k(companion, 0L, z11, (x00.a) rememberedValue, 1, null), 0.0f, 1, null);
            composer.startReplaceGroup(-1003410150);
            composer.startReplaceGroup(212064437);
            composer.endReplaceGroup();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue2 = composer.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new Measurer2(density);
                composer.updateRememberedValue(rememberedValue2);
            }
            final Measurer2 measurer2 = (Measurer2) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new ConstraintLayoutScope();
                composer.updateRememberedValue(rememberedValue3);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue3;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion2.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState = (MutableState) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion2.getEmpty()) {
                rememberedValue5 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composer.updateRememberedValue(rememberedValue5);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) rememberedValue5;
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion2.getEmpty()) {
                rememberedValue6 = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue6);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue6;
            final int i13 = 257;
            boolean changedInstance = composer.changedInstance(measurer2) | composer.changed(257);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance || rememberedValue7 == companion2.getEmpty()) {
                Object obj = new MeasurePolicy() { // from class: com.baicizhan.main.home.dialog.PromptKt$PromptDialog$lambda$10$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        MutableState.this.getValue();
                        long m5516performMeasureDjhGOtQ = measurer2.m5516performMeasureDjhGOtQ(j11, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i13);
                        mutableState.getValue();
                        int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
                        int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: com.baicizhan.main.home.dialog.PromptKt$PromptDialog$lambda$10$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Measurer2.this.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                composer.updateRememberedValue(obj);
                rememberedValue7 = obj;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue7;
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == companion2.getEmpty()) {
                rememberedValue8 = new x00.a<g2>() { // from class: com.baicizhan.main.home.dialog.PromptKt$PromptDialog$lambda$10$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // x00.a
                    public /* bridge */ /* synthetic */ g2 invoke() {
                        invoke2();
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        MutableState.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            final x00.a aVar4 = (x00.a) rememberedValue8;
            boolean changedInstance2 = composer.changedInstance(measurer2);
            Object rememberedValue9 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue9 == companion2.getEmpty()) {
                rememberedValue9 = new x00.l<SemanticsPropertyReceiver, g2>() { // from class: com.baicizhan.main.home.dialog.PromptKt$PromptDialog$lambda$10$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, Measurer2.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue9);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (x00.l) rememberedValue9, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, g2>() { // from class: com.baicizhan.main.home.dialog.PromptKt$PromptDialog$lambda$10$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i14) {
                    Modifier.Companion companion3;
                    if ((i14 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i14, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    MutableState.this.setValue(g2.f100423a);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer2.startReplaceGroup(965404337);
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                    ConstrainedLayoutReference component1 = createRefs.component1();
                    ConstrainedLayoutReference component2 = createRefs.component2();
                    ConstrainedLayoutReference component3 = createRefs.component3();
                    Modifier.Companion companion4 = Modifier.Companion;
                    Object rememberedValue10 = composer2.rememberedValue();
                    Composer.Companion companion5 = Composer.Companion;
                    if (rememberedValue10 == companion5.getEmpty()) {
                        rememberedValue10 = PromptKt.a.f20838a;
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    Modifier q11 = ComposeUtilsKt.q(companion4, 0L, false, null, null, false, (x00.a) rememberedValue10, 31, null);
                    Object rememberedValue11 = composer2.rememberedValue();
                    if (rememberedValue11 == companion5.getEmpty()) {
                        rememberedValue11 = PromptKt.b.f20839a;
                        composer2.updateRememberedValue(rememberedValue11);
                    }
                    SurfaceKt.m1784SurfaceFjzlyU(constraintLayoutScope2.constrainAs(q11, component1, (x00.l) rememberedValue11), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(24)), 0L, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(566956671, true, new PromptKt.c(str, rVar, annotatedString, str2, str3, str4, str5, z13, aVar2, lVar, aVar3), composer2, 54), composer2, 1572864, 60);
                    if (z12) {
                        composer2.startReplaceGroup(971764637);
                        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_home_prompt_close, composer2, 6);
                        boolean changed2 = composer2.changed(component1);
                        Object rememberedValue12 = composer2.rememberedValue();
                        if (changed2 || rememberedValue12 == companion5.getEmpty()) {
                            rememberedValue12 = new PromptKt.d(component1);
                            composer2.updateRememberedValue(rememberedValue12);
                        }
                        companion3 = companion4;
                        ImageKt.Image(painterResource, "prompt-close", ComposeUtilsKt.k(constraintLayoutScope2.constrainAs(companion4, component3, (x00.l) rememberedValue12), 0L, false, aVar, 3, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    } else {
                        companion3 = companion4;
                        composer2.startReplaceGroup(959354407);
                    }
                    composer2.endReplaceGroup();
                    if (i11 != 0) {
                        composer2.startReplaceGroup(972156322);
                        Painter painterResource2 = PainterResources_androidKt.painterResource(i11, composer2, 0);
                        boolean changed3 = composer2.changed(component1);
                        Object rememberedValue13 = composer2.rememberedValue();
                        if (changed3 || rememberedValue13 == companion5.getEmpty()) {
                            rememberedValue13 = new PromptKt.e(component1);
                            composer2.updateRememberedValue(rememberedValue13);
                        }
                        Modifier constrainAs = constraintLayoutScope2.constrainAs(companion3, component2, (x00.l) rememberedValue13);
                        Object rememberedValue14 = composer2.rememberedValue();
                        if (rememberedValue14 == companion5.getEmpty()) {
                            rememberedValue14 = PromptKt.f.f20857a;
                            composer2.updateRememberedValue(rememberedValue14);
                        }
                        ImageKt.Image(painterResource2, "prompt-image", ComposeUtilsKt.q(constrainAs, 0L, false, null, null, false, (x00.a) rememberedValue14, 31, null), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                    } else {
                        composer2.startReplaceGroup(959354407);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(aVar4, composer2, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), measurePolicy, composer, 48, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 v(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    public static final g2 w(String str, String str2, AnnotatedString annotatedString, x00.r rVar, boolean z11, int i11, String str3, String str4, boolean z12, String str5, x00.l lVar, boolean z13, x00.a aVar, x00.a aVar2, x00.a aVar3, int i12, int i13, int i14, Composer composer, int i15) {
        r(str, str2, annotatedString, rVar, z11, i11, str3, str4, z12, str5, lVar, z13, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), RecomposeScopeImplKt.updateChangedFlags(i13), i14);
        return g2.f100423a;
    }

    public static final g2 x(e0 e0Var, MutableState mutableState) {
        e0Var.K().invoke();
        mutableState.setValue(null);
        return g2.f100423a;
    }

    public static final g2 y(e0 e0Var, MutableState mutableState) {
        e0Var.I().invoke();
        mutableState.setValue(null);
        return g2.f100423a;
    }

    public static final g2 z(e0 e0Var, MutableState mutableState) {
        e0Var.L().invoke();
        mutableState.setValue(null);
        return g2.f100423a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f20838a = new a();

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            a();
            return g2.f100423a;
        }

        public final void a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f20857a = new f();

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            a();
            return g2.f100423a;
        }

        public final void a() {
        }
    }
}
