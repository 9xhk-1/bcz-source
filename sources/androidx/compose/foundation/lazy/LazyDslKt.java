package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.r;
import x00.s;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,523:1\n168#1,13:524\n204#1,13:537\n240#1,13:550\n276#1,13:563\n113#2:576\n113#2:577\n113#2:578\n113#2:579\n113#2:580\n113#2:581\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n187#1:524,13\n223#1:537,13\n259#1:550,13\n295#1:563,13\n331#1:576\n391#1:577\n421#1:578\n449#1:579\n475#1:580\n503#1:581\n*E\n"})
/* loaded from: classes.dex */
public final class LazyDslKt {
    /* JADX WARN: Removed duplicated region for block: B:124:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyColumn(@m80.l androidx.compose.ui.Modifier r31, @m80.l androidx.compose.foundation.lazy.LazyListState r32, @m80.l androidx.compose.foundation.layout.PaddingValues r33, boolean r34, @m80.l androidx.compose.foundation.layout.Arrangement.Vertical r35, @m80.l androidx.compose.ui.Alignment.Horizontal r36, @m80.l androidx.compose.foundation.gestures.FlingBehavior r37, boolean r38, @m80.l androidx.compose.foundation.OverscrollEffect r39, @m80.k final x00.l<? super androidx.compose.foundation.lazy.LazyListScope, yz.g2> r40, @m80.l androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyRow(@m80.l androidx.compose.ui.Modifier r31, @m80.l androidx.compose.foundation.lazy.LazyListState r32, @m80.l androidx.compose.foundation.layout.PaddingValues r33, boolean r34, @m80.l androidx.compose.foundation.layout.Arrangement.Horizontal r35, @m80.l androidx.compose.ui.Alignment.Vertical r36, @m80.l androidx.compose.foundation.gestures.FlingBehavior r37, boolean r38, @m80.l androidx.compose.foundation.OverscrollEffect r39, @m80.k final x00.l<? super androidx.compose.foundation.lazy.LazyListScope, yz.g2> r40, @m80.l androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@k LazyListScope lazyListScope, @k List<? extends T> list, @l x00.l<? super T, ? extends Object> lVar, @k x00.l<? super T, ? extends Object> lVar2, @k r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, g2> rVar) {
        lazyListScope.items(list.size(), lVar != null ? new LazyDslKt$items$2(lVar, list) : null, new LazyDslKt$items$3(lVar2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(rVar, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, x00.l lVar, x00.l lVar2, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar2 = LazyDslKt$items$1.INSTANCE;
        }
        lazyListScope.items(list.size(), lVar != null ? new LazyDslKt$items$2(lVar, list) : null, new LazyDslKt$items$3(lVar2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(rVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@k LazyListScope lazyListScope, @k List<? extends T> list, @l p<? super Integer, ? super T, ? extends Object> pVar, @k p<? super Integer, ? super T, ? extends Object> pVar2, @k s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, g2> sVar) {
        lazyListScope.items(list.size(), pVar != null ? new LazyDslKt$itemsIndexed$2(pVar, list) : null, new LazyDslKt$itemsIndexed$3(pVar2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, p pVar, p pVar2, s sVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = null;
        }
        if ((i11 & 4) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$1
                public final Void invoke(int i12, Object obj2) {
                    return null;
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyListScope.items(list.size(), pVar != null ? new LazyDslKt$itemsIndexed$2(pVar, list) : null, new LazyDslKt$itemsIndexed$3(pVar2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(sVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@k LazyListScope lazyListScope, @k T[] tArr, @l x00.l<? super T, ? extends Object> lVar, @k x00.l<? super T, ? extends Object> lVar2, @k r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, g2> rVar) {
        lazyListScope.items(tArr.length, lVar != null ? new LazyDslKt$items$6(lVar, tArr) : null, new LazyDslKt$items$7(lVar2, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(rVar, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@k LazyListScope lazyListScope, @k T[] tArr, @l p<? super Integer, ? super T, ? extends Object> pVar, @k p<? super Integer, ? super T, ? extends Object> pVar2, @k s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, g2> sVar) {
        lazyListScope.items(tArr.length, pVar != null ? new LazyDslKt$itemsIndexed$6(pVar, tArr) : null, new LazyDslKt$itemsIndexed$7(pVar2, tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(sVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, x00.l lVar, x00.l lVar2, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar2 = LazyDslKt$items$5.INSTANCE;
        }
        lazyListScope.items(objArr.length, lVar != null ? new LazyDslKt$items$6(lVar, objArr) : null, new LazyDslKt$items$7(lVar2, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(rVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, p pVar, p pVar2, s sVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = null;
        }
        if ((i11 & 4) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$5
                public final Void invoke(int i12, Object obj2) {
                    return null;
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyListScope.items(objArr.length, pVar != null ? new LazyDslKt$itemsIndexed$6(pVar, objArr) : null, new LazyDslKt$itemsIndexed$7(pVar2, objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(sVar, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, x00.l lVar, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        lazyListScope.items(list.size(), lVar != null ? new LazyDslKt$items$2(lVar, list) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(rVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, p pVar, s sVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = null;
        }
        lazyListScope.items(list.size(), pVar != null ? new LazyDslKt$itemsIndexed$2(pVar, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(sVar, list)));
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.ui.Modifier r25, androidx.compose.foundation.lazy.LazyListState r26, androidx.compose.foundation.layout.PaddingValues r27, boolean r28, androidx.compose.foundation.layout.Arrangement.Vertical r29, androidx.compose.ui.Alignment.Horizontal r30, androidx.compose.foundation.gestures.FlingBehavior r31, boolean r32, final x00.l r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.ui.Modifier r25, androidx.compose.foundation.lazy.LazyListState r26, androidx.compose.foundation.layout.PaddingValues r27, boolean r28, androidx.compose.foundation.layout.Arrangement.Horizontal r29, androidx.compose.ui.Alignment.Vertical r30, androidx.compose.foundation.gestures.FlingBehavior r31, boolean r32, final x00.l r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, p pVar, s sVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = null;
        }
        lazyListScope.items(objArr.length, pVar != null ? new LazyDslKt$itemsIndexed$6(pVar, objArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(sVar, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, x00.l lVar, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        lazyListScope.items(objArr.length, lVar != null ? new LazyDslKt$items$6(lVar, objArr) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(rVar, objArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.ui.Modifier r24, androidx.compose.foundation.lazy.LazyListState r25, androidx.compose.foundation.layout.PaddingValues r26, boolean r27, androidx.compose.foundation.layout.Arrangement.Vertical r28, androidx.compose.ui.Alignment.Horizontal r29, androidx.compose.foundation.gestures.FlingBehavior r30, final x00.l r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.ui.Modifier r24, androidx.compose.foundation.lazy.LazyListState r25, androidx.compose.foundation.layout.PaddingValues r26, boolean r27, androidx.compose.foundation.layout.Arrangement.Horizontal r28, androidx.compose.ui.Alignment.Vertical r29, androidx.compose.foundation.gestures.FlingBehavior r30, final x00.l r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
