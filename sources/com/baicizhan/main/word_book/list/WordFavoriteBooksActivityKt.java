package com.baicizhan.main.word_book.list;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWordFavoriteBooksActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoriteBooksActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteBooksActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,816:1\n1247#2,6:817\n1247#2,6:823\n1247#2,6:830\n1247#2,6:960\n1247#2,6:969\n1247#2,6:981\n1247#2,6:1026\n1247#2,6:1071\n1247#2,6:1112\n1247#2,6:1118\n1247#2,6:1132\n75#3:829\n70#4:836\n67#4,9:837\n77#4:979\n79#5,6:846\n86#5,3:861\n89#5,2:870\n79#5,6:884\n86#5,3:899\n89#5,2:908\n79#5,6:923\n86#5,3:938\n89#5,2:947\n93#5:954\n93#5:958\n93#5:978\n79#5,6:993\n86#5,3:1008\n89#5,2:1017\n93#5:1024\n79#5,6:1043\n86#5,3:1058\n89#5,2:1067\n79#5,6:1085\n86#5,3:1100\n89#5,2:1109\n93#5:1126\n93#5:1130\n347#6,9:852\n356#6:872\n347#6,9:890\n356#6:910\n347#6,9:929\n356#6:949\n357#6,2:952\n357#6,2:956\n357#6,2:976\n347#6,9:999\n356#6:1019\n357#6,2:1022\n347#6,9:1049\n356#6:1069\n347#6,9:1091\n356#6:1111\n357#6,2:1124\n357#6,2:1128\n4206#7,6:864\n4206#7,6:902\n4206#7,6:941\n4206#7,6:1011\n4206#7,6:1061\n4206#7,6:1103\n99#8:873\n95#8,10:874\n106#8:959\n99#8,6:1079\n106#8:1127\n113#9:911\n113#9:912\n113#9:950\n113#9:951\n113#9:966\n113#9:967\n113#9:968\n113#9:975\n113#9:980\n113#9:1020\n113#9:1021\n113#9:1070\n113#9:1077\n113#9:1078\n87#10:913\n84#10,9:914\n94#10:955\n87#10,6:987\n94#10:1025\n87#10:1032\n83#10,10:1033\n94#10:1131\n1563#11:1138\n1634#11,3:1139\n204#12,13:1142\n*S KotlinDebug\n*F\n+ 1 WordFavoriteBooksActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteBooksActivityKt\n*L\n515#1:817,6\n542#1:823,6\n594#1:830,6\n628#1:960,6\n640#1:969,6\n668#1:981,6\n700#1:1026,6\n712#1:1071,6\n758#1:1112,6\n766#1:1118,6\n520#1:1132,6\n588#1:829\n589#1:836\n589#1:837,9\n589#1:979\n589#1:846,6\n589#1:861,3\n589#1:870,2\n596#1:884,6\n596#1:899,3\n596#1:908,2\n610#1:923,6\n610#1:938,3\n610#1:947,2\n610#1:954\n596#1:958\n589#1:978\n664#1:993,6\n664#1:1008,3\n664#1:1017,2\n664#1:1024\n705#1:1043,6\n705#1:1058,3\n705#1:1067,2\n741#1:1085,6\n741#1:1100,3\n741#1:1109,2\n741#1:1126\n705#1:1130\n589#1:852,9\n589#1:872\n596#1:890,9\n596#1:910\n610#1:929,9\n610#1:949\n610#1:952,2\n596#1:956,2\n589#1:976,2\n664#1:999,9\n664#1:1019\n664#1:1022,2\n705#1:1049,9\n705#1:1069\n741#1:1091,9\n741#1:1111\n741#1:1124,2\n705#1:1128,2\n589#1:864,6\n596#1:902,6\n610#1:941,6\n664#1:1011,6\n705#1:1061,6\n741#1:1103,6\n596#1:873\n596#1:874,10\n596#1:959\n741#1:1079,6\n741#1:1127\n605#1:911\n613#1:912\n616#1:950\n622#1:951\n637#1:966\n638#1:967\n639#1:968\n650#1:975\n666#1:980\n678#1:1020\n680#1:1021\n711#1:1070\n748#1:1077\n752#1:1078\n610#1:913\n610#1:914,9\n610#1:955\n664#1:987,6\n664#1:1025\n705#1:1032\n705#1:1033,10\n705#1:1131\n713#1:1138\n713#1:1139,3\n713#1:1142,13\n*E\n"})
/* loaded from: classes5.dex */
public final class WordFavoriteBooksActivityKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f26823a = WordFavoriteBooksActivity.class.getSimpleName();

    public static final yz.g2 A(d dVar, boolean z11, int i11, int i12, Composer composer, int i13) {
        x(dVar, z11, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void B(@PreviewParameter(provider = e.class) final d dVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-716291124);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-716291124, i12, -1, "com.baicizhan.main.word_book.list.BookItem2 (WordFavoriteBooksActivity.kt:657)");
            }
            x(dVar, true, startRestartGroup, (i12 & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.a8
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 C;
                    C = WordFavoriteBooksActivityKt.C(d.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return C;
                }
            });
        }
    }

    public static final yz.g2 C(d dVar, int i11, Composer composer, int i12) {
        B(dVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(boolean r47, long r48, final java.util.List<kj.a> r50, int r51, int r52, final x00.l<? super java.lang.Long, yz.g2> r53, final x00.l<? super java.lang.Long, yz.g2> r54, x00.a<yz.g2> r55, x00.a<yz.g2> r56, final x00.a<yz.g2> r57, final x00.l<? super java.lang.Long, yz.g2> r58, androidx.compose.runtime.Composer r59, final int r60, final int r61, final int r62) {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.WordFavoriteBooksActivityKt.D(boolean, long, java.util.List, int, int, x00.l, x00.l, x00.a, x00.a, x00.a, x00.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final yz.g2 E() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 F(final List list, long j11, final x00.l lVar, final x00.l lVar2, final x00.l lVar3, final boolean z11, LazyListScope LazyColumn) {
        kotlin.jvm.internal.g0.p(LazyColumn, "$this$LazyColumn");
        List<kj.a> list2 = list;
        final ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        for (final kj.a aVar : list2) {
            String k11 = aVar.k();
            String i11 = aVar.i();
            int n11 = aVar.n();
            boolean z12 = false;
            boolean z13 = aVar.j() != 0;
            if (j11 == aVar.j()) {
                z12 = true;
            }
            arrayList.add(new d(k11, i11, n11, z13, z12, new x00.a() { // from class: com.baicizhan.main.word_book.list.s7
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 G;
                    G = WordFavoriteBooksActivityKt.G(x00.l.this, aVar);
                    return G;
                }
            }, new x00.a() { // from class: com.baicizhan.main.word_book.list.t7
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 H;
                    H = WordFavoriteBooksActivityKt.H(x00.l.this, aVar);
                    return H;
                }
            }, new x00.a() { // from class: com.baicizhan.main.word_book.list.v7
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 I;
                    I = WordFavoriteBooksActivityKt.I(x00.l.this, aVar);
                    return I;
                }
            }));
        }
        LazyColumn.items(arrayList.size(), null, new x00.l<Integer, Object>() { // from class: com.baicizhan.main.word_book.list.WordFavoriteBooksActivityKt$BooksContent$lambda$1$0$0$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i12) {
                arrayList.get(i12);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new x00.r<LazyItemScope, Integer, Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.word_book.list.WordFavoriteBooksActivityKt$BooksContent$lambda$1$0$0$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ yz.g2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return yz.g2.f100423a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, int i12, Composer composer, int i13) {
                int i14;
                if ((i13 & 6) == 0) {
                    i14 = (composer.changed(lazyItemScope) ? 4 : 2) | i13;
                } else {
                    i14 = i13;
                }
                if ((i13 & 48) == 0) {
                    i14 |= composer.changed(i12) ? 32 : 16;
                }
                if (!composer.shouldExecute((i14 & 147) != 146, i14 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i14, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                d dVar = (d) arrayList.get(i12);
                composer.startReplaceGroup(-1882861754);
                if (i12 == 0) {
                    composer.startReplaceGroup(-1882852300);
                    SpacerKt.Spacer(SizeKt.m759height3ABfNKs(Modifier.Companion, bk.d.c()), composer, 6);
                } else {
                    composer.startReplaceGroup(-1914948615);
                }
                composer.endReplaceGroup();
                WordFavoriteBooksActivityKt.x(dVar, z11, composer, 0, 0);
                if (i12 == list.size() - 1) {
                    composer.startReplaceGroup(-1882662828);
                    SpacerKt.Spacer(SizeKt.m759height3ABfNKs(Modifier.Companion, bk.d.c()), composer, 6);
                } else {
                    composer.startReplaceGroup(-1914948615);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return yz.g2.f100423a;
    }

    public static final yz.g2 G(x00.l lVar, kj.a aVar) {
        lVar.invoke(Long.valueOf(aVar.j()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 H(x00.l lVar, kj.a aVar) {
        lVar.invoke(Long.valueOf(aVar.j()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 I(x00.l lVar, kj.a aVar) {
        lVar.invoke(Long.valueOf(aVar.j()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 J(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 K(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 L(boolean z11, long j11, List list, int i11, int i12, x00.l lVar, x00.l lVar2, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.l lVar3, int i13, int i14, int i15, Composer composer, int i16) {
        D(z11, j11, list, i11, i12, lVar, lVar2, aVar, aVar2, aVar3, lVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), RecomposeScopeImplKt.updateChangedFlags(i14), i15);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void M(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(248515737);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(248515737, i11, -1, "com.baicizhan.main.word_book.list.BooksContentPreview (WordFavoriteBooksActivity.kt:778)");
            }
            bk.k.e(null, null, null, q0.f27394a.o(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.m7
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 N;
                    N = WordFavoriteBooksActivityKt.N(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return N;
                }
            });
        }
    }

    public static final yz.g2 N(int i11, Composer composer, int i12) {
        M(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void O(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1409385122);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1409385122, i11, -1, "com.baicizhan.main.word_book.list.BooksContentPreviewPlan (WordFavoriteBooksActivity.kt:798)");
            }
            bk.k.e(null, null, null, q0.f27394a.p(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.l7
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 P;
                    P = WordFavoriteBooksActivityKt.P(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return P;
                }
            });
        }
    }

    public static final yz.g2 P(int i11, Composer composer, int i12) {
        O(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c3  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Q(boolean r26, long r27, final ij.x r29, final x00.l<? super java.lang.Long, yz.g2> r30, final x00.l<? super java.lang.Long, yz.g2> r31, final x00.a<yz.g2> r32, final x00.a<yz.g2> r33, final x00.a<yz.g2> r34, final x00.l<? super java.lang.Long, yz.g2> r35, x00.a<yz.g2> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.WordFavoriteBooksActivityKt.Q(boolean, long, ij.x, x00.l, x00.l, x00.a, x00.a, x00.a, x00.l, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 R() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 S(final ij.x xVar, final x00.a aVar, final boolean z11, final long j11, final x00.l lVar, final x00.l lVar2, final x00.a aVar2, final x00.a aVar3, final x00.a aVar4, final x00.l lVar3, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-995428958, i11, -1, "com.baicizhan.main.word_book.list.FavoriteBooksContent.<anonymous> (WordFavoriteBooksActivity.kt:517)");
            }
            com.baicizhan.platform.base.widget.s4.B(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.Companion), null, null, ComposableLambdaKt.rememberComposableLambda(-1845940071, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.n7
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 T;
                    T = WordFavoriteBooksActivityKt.T(ij.x.this, aVar, (Composer) obj, ((Integer) obj2).intValue());
                    return T;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1397651311, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.o7
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 V;
                    V = WordFavoriteBooksActivityKt.V(ij.x.this, z11, j11, lVar, lVar2, aVar2, aVar3, aVar4, lVar3, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return V;
                }
            }, composer, 54), composer, 3072, 12582912, 131062);
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
    public static final yz.g2 T(ij.x xVar, final x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1845940071, i11, -1, "com.baicizhan.main.word_book.list.FavoriteBooksContent.<anonymous>.<anonymous> (WordFavoriteBooksActivity.kt:519)");
            }
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.k7
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 U;
                        U = WordFavoriteBooksActivityKt.U(x00.a.this);
                        return U;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Z(xVar, (x00.a) rememberedValue, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 U(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 V(ij.x xVar, boolean z11, long j11, x00.l lVar, x00.l lVar2, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.l lVar3, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1397651311, i11, -1, "com.baicizhan.main.word_book.list.FavoriteBooksContent.<anonymous>.<anonymous> (WordFavoriteBooksActivity.kt:521)");
            }
            if (xVar.f().isEmpty()) {
                composer.startReplaceGroup(-2042135791);
            } else {
                composer.startReplaceGroup(-2017178001);
                D(z11, j11, xVar.f(), xVar.h(), xVar.g(), lVar, lVar2, aVar, aVar2, aVar3, lVar3, composer, 0, 0, 0);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 W(boolean z11, long j11, ij.x xVar, x00.l lVar, x00.l lVar2, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.l lVar3, x00.a aVar4, int i11, int i12, Composer composer, int i13) {
        Q(z11, j11, xVar, lVar, lVar2, aVar, aVar2, aVar3, lVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void X(final x00.a<yz.g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-894538);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-894538, i12, -1, "com.baicizhan.main.word_book.list.ShareCodeButton (WordFavoriteBooksActivity.kt:662)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(44));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m773size3ABfNKs, (MutableInteractionSource) rememberedValue, null, false, null, null, aVar, 28, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m267clickableO2vRcR0$default);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_share_code_key, startRestartGroup, 6), (String) null, SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(2)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.word_favorite_books_paste_code, startRestartGroup, 6), (Modifier) null, bk.b.z(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3456, 0, 130546);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.j7
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Y;
                    Y = WordFavoriteBooksActivityKt.Y(x00.a.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Y;
                }
            });
        }
    }

    public static final yz.g2 Y(x00.a aVar, int i11, Composer composer, int i12) {
        X(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Z(final ij.x xVar, final x00.a<yz.g2> aVar, Composer composer, final int i11, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-554206248);
        if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changedInstance(xVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (i14 != 0) {
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.w7
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 a02;
                            a02 = WordFavoriteBooksActivityKt.a0();
                            return a02;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                aVar = (x00.a) rememberedValue;
            }
            x00.a<yz.g2> aVar2 = aVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-554206248, i13, -1, "com.baicizhan.main.word_book.list.TopBar (WordFavoriteBooksActivity.kt:541)");
            }
            com.baicizhan.platform.base.widget.s4.F(0, null, aVar2, StringResources_androidKt.stringResource(R.string.word_favorite_books_title, new Object[]{Integer.valueOf(Math.min(xVar.f().size(), xVar.h())), Integer.valueOf(xVar.h())}, startRestartGroup, 6), null, null, startRestartGroup, (i13 << 3) & 896, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            aVar = aVar2;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.x7
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 b02;
                    b02 = WordFavoriteBooksActivityKt.b0(ij.x.this, aVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return b02;
                }
            });
        }
    }

    public static final yz.g2 a0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 b0(ij.x xVar, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        Z(xVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(@androidx.compose.ui.tooling.preview.PreviewParameter(provider = com.baicizhan.main.word_book.list.e.class) final com.baicizhan.main.word_book.list.d r70, boolean r71, androidx.compose.runtime.Composer r72, final int r73, final int r74) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.WordFavoriteBooksActivityKt.x(com.baicizhan.main.word_book.list.d, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 y(d dVar) {
        dVar.v().invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 z(d dVar) {
        dVar.u().invoke();
        return yz.g2.f100423a;
    }
}
