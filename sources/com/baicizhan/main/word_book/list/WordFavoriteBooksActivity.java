package com.baicizhan.main.word_book.list;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.extractor.WavUtil;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.activity.schedule_v2.ScheduleType;
import com.baicizhan.main.home.dialog.PromptKt;
import com.baicizhan.main.vld.model.FavoritePlanInfo;
import com.baicizhan.main.word_book.detail.WordBookDetailActivity;
import com.baicizhan.main.word_book.list.d1;
import com.jiongji.andriod.card.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.d;
import kc.o;
import kc.u;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordFavoriteBooksActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoriteBooksActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteBooksActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,816:1\n1247#2,3:817\n1250#2,3:821\n1247#2,6:824\n1247#2,6:830\n1247#2,6:836\n1247#2,6:842\n1247#2,6:848\n1247#2,6:854\n1247#2,6:860\n1247#2,6:866\n1247#2,6:872\n1247#2,3:885\n1250#2,3:889\n1247#2,6:892\n1247#2,6:898\n1247#2,6:904\n1247#2,6:911\n1247#2,6:917\n1247#2,6:923\n1247#2,6:929\n1247#2,6:946\n1247#2,6:952\n1247#2,6:958\n1247#2,6:964\n1247#2,6:971\n1247#2,6:977\n1247#2,6:983\n1247#2,6:989\n1247#2,6:995\n1247#2,6:1001\n1247#2,6:1007\n1247#2,6:1026\n1247#2,6:1032\n1247#2,6:1038\n1#3:820\n557#4:878\n554#4,6:879\n555#5:888\n113#6:910\n113#6:970\n64#7,5:935\n85#8:940\n113#8,2:941\n85#8:943\n113#8,2:944\n85#8:1013\n113#8,2:1014\n85#8:1016\n113#8,2:1017\n1565#9:1019\n1359#9,6:1020\n*S KotlinDebug\n*F\n+ 1 WordFavoriteBooksActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteBooksActivity\n*L\n141#1:817,3\n141#1:821,3\n142#1:824,6\n143#1:830,6\n144#1:836,6\n149#1:842,6\n160#1:848,6\n167#1:854,6\n183#1:860,6\n187#1:866,6\n188#1:872,6\n189#1:885,3\n189#1:889,3\n197#1:892,6\n200#1:898,6\n206#1:904,6\n325#1:911,6\n326#1:917,6\n333#1:923,6\n334#1:929,6\n224#1:946,6\n225#1:952,6\n257#1:958,6\n258#1:964,6\n272#1:971,6\n281#1:977,6\n291#1:983,6\n293#1:989,6\n305#1:995,6\n317#1:1001,6\n320#1:1007,6\n385#1:1026,6\n381#1:1032,6\n376#1:1038,6\n189#1:878\n189#1:879,6\n189#1:888\n216#1:910\n266#1:970\n179#1:935,5\n187#1:940\n187#1:941,2\n188#1:943\n188#1:944,2\n325#1:1013\n325#1:1014,2\n333#1:1016\n333#1:1017,2\n367#1:1019\n369#1:1020,6\n*E\n"})
/* loaded from: classes5.dex */
public final class WordFavoriteBooksActivity extends ComposeBaseActivity {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f26767c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f26768d = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f26769e = "arg_share_source_info";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f26770b = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.word_book.list.b7
        @Override // x00.a
        public final Object invoke() {
            ki.c v12;
            v12 = WordFavoriteBooksActivity.v1();
            return v12;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void c(a aVar, Context context, Triple triple, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                triple = null;
            }
            aVar.b(context, triple);
        }

        @w00.k
        public final void a(@m80.k Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            c(this, context, null, 2, null);
        }

        @w00.k
        public final void b(@m80.k Context context, @m80.l Triple<String, Integer, String> triple) {
            kotlin.jvm.internal.g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) WordFavoriteBooksActivity.class);
            if (triple != null) {
                intent.putExtra(WordFavoriteBooksActivity.f26769e, triple);
            }
            context.startActivity(intent);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$onCreate$1$1$1$1", f = "WordFavoriteBooksActivity.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26771a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f26772b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WordFavoriteBooksActivity f26773c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f26774d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MutableState<FavoritePlanInfo> f26775e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z11, WordFavoriteBooksActivity wordFavoriteBooksActivity, long j11, MutableState<FavoritePlanInfo> mutableState, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f26772b = z11;
            this.f26773c = wordFavoriteBooksActivity;
            this.f26774d = j11;
            this.f26775e = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f26772b, this.f26773c, this.f26774d, this.f26775e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26771a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                if (this.f26772b) {
                    ki.c w12 = this.f26773c.w1();
                    long j11 = this.f26774d;
                    this.f26771a = 1;
                    a11 = w12.a(j11, this);
                    if (a11 == l11) {
                        return l11;
                    }
                }
                return yz.g2.f100423a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            a11 = ((Result) obj).m6317unboximpl();
            MutableState<FavoritePlanInfo> mutableState = this.f26775e;
            if (Result.m6315isSuccessimpl(a11)) {
                mutableState.setValue((FavoritePlanInfo) a11);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$onCreate$1$1$3$1", f = "WordFavoriteBooksActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26776a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ State<ij.x> f26778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(State<ij.x> state, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f26778c = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return WordFavoriteBooksActivity.this.new c(this.f26778c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26776a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            LoadingDialogActivity.setLoading$default(WordFavoriteBooksActivity.this, this.f26778c.getValue() == null, 500L, null, 4, null);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$onCreate$1$1$4$1", f = "WordFavoriteBooksActivity.kt", i = {}, l = {198, 198}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26779a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f26780b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetState f26781c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z11, ModalBottomSheetState modalBottomSheetState, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f26780b = z11;
            this.f26781c = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f26780b, this.f26781c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        
            if (r5.show(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        
            if (r5.hide(r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f26779a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.e.n(r5)
                goto L38
            L1b:
                kotlin.e.n(r5)
                boolean r5 = r4.f26780b
                if (r5 == 0) goto L2d
                androidx.compose.material.ModalBottomSheetState r5 = r4.f26781c
                r4.f26779a = r3
                java.lang.Object r5 = r5.show(r4)
                if (r5 != r0) goto L38
                goto L37
            L2d:
                androidx.compose.material.ModalBottomSheetState r5 = r4.f26781c
                r4.f26779a = r2
                java.lang.Object r5 = r5.hide(r4)
                if (r5 != r0) goto L38
            L37:
                return r0
            L38:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.WordFavoriteBooksActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$onCreate$1$1$5$1", f = "WordFavoriteBooksActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26782a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetState f26783b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<d1> f26784c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ModalBottomSheetState modalBottomSheetState, MutableState<d1> mutableState, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f26783b = modalBottomSheetState;
            this.f26784c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new e(this.f26783b, this.f26784c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26782a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (this.f26783b.getCurrentValue() == ModalBottomSheetValue.Hidden && WordFavoriteBooksActivity.e2(this.f26784c) != null) {
                WordFavoriteBooksActivity.z1(this.f26784c, null);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$onCreate$1$1$6$1", f = "WordFavoriteBooksActivity.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26785a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ State<ij.x> f26786b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ij.q f26787c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<ij.a> f26788d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(State<ij.x> state, ij.q qVar, MutableState<ij.a> mutableState, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f26786b = state;
            this.f26787c = qVar;
            this.f26788d = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new f(this.f26786b, this.f26787c, this.f26788d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object n02;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26785a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.x value = this.f26786b.getValue();
                if ((value != null ? value.g() : 0) > 0 && WordFavoriteBooksActivity.A1(this.f26788d) == null) {
                    ij.q qVar = this.f26787c;
                    this.f26785a = 1;
                    n02 = qVar.n0(this);
                    if (n02 == l11) {
                        return l11;
                    }
                }
                return yz.g2.f100423a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            n02 = ((Result) obj).m6317unboximpl();
            MutableState<ij.a> mutableState = this.f26788d;
            if (Result.m6315isSuccessimpl(n02)) {
                WordFavoriteBooksActivity.B1(mutableState, (ij.a) n02);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$onCreate$1$1$7$2$1$1", f = "WordFavoriteBooksActivity.kt", i = {}, l = {R.styleable.Theme_drawable_tab_review}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26789a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ij.q f26790b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WordFavoriteBooksActivity f26791c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f26792d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MutableState<d1> f26793e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ij.q qVar, WordFavoriteBooksActivity wordFavoriteBooksActivity, String str, MutableState<d1> mutableState, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f26790b = qVar;
            this.f26791c = wordFavoriteBooksActivity;
            this.f26792d = str;
            this.f26793e = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new g(this.f26790b, this.f26791c, this.f26792d, this.f26793e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26789a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.q qVar = this.f26790b;
                this.f26789a = 1;
                m11 = qVar.m(this);
                if (m11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                m11 = ((Result) obj).m6317unboximpl();
            }
            WordFavoriteBooksActivity wordFavoriteBooksActivity = this.f26791c;
            String str = this.f26792d;
            MutableState<d1> mutableState = this.f26793e;
            if (Result.m6315isSuccessimpl(m11)) {
                ij.b bVar = (ij.b) m11;
                LoadingDialogActivity.setLoading$default(wordFavoriteBooksActivity, false, 0L, null, 6, null);
                WordFavoriteBooksActivity.z1(mutableState, bVar.f() ? d1.c.f27058a : new d1.b(bVar.e(), str));
            }
            WordFavoriteBooksActivity wordFavoriteBooksActivity2 = this.f26791c;
            String str2 = this.f26792d;
            MutableState<d1> mutableState2 = this.f26793e;
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m11);
            if (m6311exceptionOrNullimpl != null) {
                LoadingDialogActivity.setLoading$default(wordFavoriteBooksActivity2, false, 0L, null, 6, null);
                String message = m6311exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "兑换失败，请稍后重试";
                }
                WordFavoriteBooksActivity.z1(mutableState2, new d1.b(message, str2));
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$onCreate$1$1$8$2$1$2$1", f = "WordFavoriteBooksActivity.kt", i = {}, l = {287}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.l<j00.c<? super Result<? extends Boolean>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26794a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ij.q f26795b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f26796c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ij.q qVar, long j11, j00.c<? super h> cVar) {
            super(1, cVar);
            this.f26795b = qVar;
            this.f26796c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return new h(this.f26795b, this.f26796c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<Boolean>> cVar) {
            return ((h) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object S;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26794a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.q qVar = this.f26795b;
                long j11 = this.f26796c;
                this.f26794a = 1;
                S = qVar.S(j11, this);
                if (S == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                S = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(S);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends Boolean>> cVar) {
            return invoke2((j00.c<? super Result<Boolean>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$onCreate$1$1$8$4$1$1", f = "WordFavoriteBooksActivity.kt", i = {}, l = {297}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26797a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ij.q f26798b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<ij.a> f26799c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<d1> f26800d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ij.q qVar, MutableState<ij.a> mutableState, MutableState<d1> mutableState2, j00.c<? super i> cVar) {
            super(2, cVar);
            this.f26798b = qVar;
            this.f26799c = mutableState;
            this.f26800d = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new i(this.f26798b, this.f26799c, this.f26800d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object n02;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26797a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.q qVar = this.f26798b;
                this.f26797a = 1;
                n02 = qVar.n0(this);
                if (n02 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                n02 = ((Result) obj).m6317unboximpl();
            }
            MutableState<ij.a> mutableState = this.f26799c;
            MutableState<d1> mutableState2 = this.f26800d;
            if (Result.m6315isSuccessimpl(n02)) {
                ij.a aVar = (ij.a) n02;
                WordFavoriteBooksActivity.B1(mutableState, aVar);
                WordFavoriteBooksActivity.z1(mutableState2, new d1.a(aVar));
            }
            MutableState<d1> mutableState3 = this.f26800d;
            if (Result.m6311exceptionOrNullimpl(n02) != null) {
                WordFavoriteBooksActivity.z1(mutableState3, null);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$onCreate$1$1$9$1", f = "WordFavoriteBooksActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordFavoriteBooksActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoriteBooksActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteBooksActivity$onCreate$1$1$9$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,816:1\n1563#2:817\n1634#2,3:818\n*S KotlinDebug\n*F\n+ 1 WordFavoriteBooksActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteBooksActivity$onCreate$1$1$9$1\n*L\n329#1:817\n329#1:818,3\n*E\n"})
    public static final class j extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26801a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ State<ij.x> f26802b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f26803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(State<ij.x> state, MutableState<Boolean> mutableState, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f26802b = state;
            this.f26803c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new j(this.f26802b, this.f26803c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            List<kj.a> f11;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26801a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (!WordFavoriteBooksActivity.Q1(this.f26803c) && this.f26802b.getValue() != null) {
                str = WordFavoriteBooksActivityKt.f26823a;
                qb.c.b(str, "launched to post", new Object[0]);
                ij.x value = this.f26802b.getValue();
                if (value == null || (f11 = value.f()) == null) {
                    return yz.g2.f100423a;
                }
                List<kj.a> list = f11;
                ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(l00.a.g(((kj.a) it.next()).j()));
                }
                ma.l.b(ma.t.f73012k, ma.a.f72724c4, ma.u.a(ma.b.S0, arrayList));
                WordFavoriteBooksActivity.R1(this.f26803c, true);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WordFavoriteBooksActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteBooksActivity\n*L\n1#1,67:1\n180#2,2:68\n*E\n"})
    public static final class k implements DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WordFavoriteBooksActivity$onCreate$1$1$2$1$rec$1 f26804a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ yz.c0 f26805b;

        public k(WordFavoriteBooksActivity$onCreate$1$1$2$1$rec$1 wordFavoriteBooksActivity$onCreate$1$1$2$1$rec$1, yz.c0 c0Var) {
            this.f26804a = wordFavoriteBooksActivity$onCreate$1$1$2$1$rec$1;
            this.f26805b = c0Var;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            WordFavoriteBooksActivity.d2(this.f26805b).unregisterReceiver(this.f26804a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity", f = "WordFavoriteBooksActivity.kt", i = {0, 0, 0, 0}, l = {445}, m = "startAddByShareCode-yxL6bBk", n = {"$this$startAddByShareCode_u2dyxL6bBk", "code", "info", "auto"}, s = {"L$0", "L$1", "L$2", "Z$0"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26806a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26807b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26808c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f26809d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f26810e;

        /* renamed from: g, reason: collision with root package name */
        public int f26812g;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26810e = obj;
            this.f26812g |= Integer.MIN_VALUE;
            Object l22 = WordFavoriteBooksActivity.this.l2(null, null, null, false, this);
            return l22 == kotlin.coroutines.intrinsics.b.l() ? l22 : Result.m6307boximpl(l22);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$tryToShareAdding$2$1", f = "WordFavoriteBooksActivity.kt", i = {}, l = {422}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class m extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26813a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ij.q f26814b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kj.a f26815c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ij.q qVar, kj.a aVar, j00.c<? super m> cVar) {
            super(2, cVar);
            this.f26814b = qVar;
            this.f26815c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new m(this.f26814b, this.f26815c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((m) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26813a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.q qVar = this.f26814b;
                long j11 = this.f26815c.j();
                this.f26813a = 1;
                if (qVar.k0(j11, true, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                ((Result) obj).m6317unboximpl();
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$tryToShareAdding$3", f = "WordFavoriteBooksActivity.kt", i = {}, l = {424}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class n extends SuspendLambda implements x00.l<j00.c<? super Result<? extends kj.a>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26816a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ij.q f26818c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f26819d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ State<ij.x> f26820e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f26821f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ij.q qVar, String str, State<ij.x> state, boolean z11, j00.c<? super n> cVar) {
            super(1, cVar);
            this.f26818c = qVar;
            this.f26819d = str;
            this.f26820e = state;
            this.f26821f = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return WordFavoriteBooksActivity.this.new n(this.f26818c, this.f26819d, this.f26820e, this.f26821f, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<kj.a>> cVar) {
            return ((n) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l22;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26816a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                WordFavoriteBooksActivity wordFavoriteBooksActivity = WordFavoriteBooksActivity.this;
                ij.q qVar = this.f26818c;
                String str = this.f26819d;
                State<ij.x> state = this.f26820e;
                boolean z11 = this.f26821f;
                this.f26816a = 1;
                l22 = wordFavoriteBooksActivity.l2(qVar, str, state, z11, this);
                if (l22 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                l22 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(l22);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends kj.a>> cVar) {
            return invoke2((j00.c<? super Result<kj.a>>) cVar);
        }
    }

    public static final ij.a A1(MutableState<ij.a> mutableState) {
        return mutableState.getValue();
    }

    public static final void B1(MutableState<ij.a> mutableState, ij.a aVar) {
        mutableState.setValue(aVar);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 C1(final WordFavoriteBooksActivity wordFavoriteBooksActivity, final c40.r0 r0Var, final ij.q qVar, final MutableState mutableState, ColumnScope ModalBottomSheetLayout, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1412252942, i11, -1, "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WordFavoriteBooksActivity.kt:219)");
            }
            d1 e22 = e2(mutableState);
            if (e22 != null) {
                composer.startReplaceGroup(-1072037596);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.s6
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 D1;
                            D1 = WordFavoriteBooksActivity.D1(MutableState.this);
                            return D1;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                x00.a aVar = (x00.a) rememberedValue;
                boolean changedInstance = composer.changedInstance(wordFavoriteBooksActivity) | composer.changedInstance(r0Var) | composer.changedInstance(qVar);
                Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.word_book.list.t6
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 E1;
                            E1 = WordFavoriteBooksActivity.E1(WordFavoriteBooksActivity.this, r0Var, mutableState, qVar);
                            return E1;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                x00.a aVar2 = (x00.a) rememberedValue2;
                Object rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.word_book.list.u6
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 F1;
                            F1 = WordFavoriteBooksActivity.F1(MutableState.this);
                            return F1;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                x00.a aVar3 = (x00.a) rememberedValue3;
                boolean changedInstance2 = composer.changedInstance(wordFavoriteBooksActivity);
                Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new x00.l() { // from class: com.baicizhan.main.word_book.list.v6
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            yz.g2 G1;
                            G1 = WordFavoriteBooksActivity.G1(WordFavoriteBooksActivity.this, mutableState, (String) obj);
                            return G1;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                c1.q(e22, aVar, aVar2, aVar3, (x00.l) rememberedValue4, composer, 3120);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1069337868);
                SpacerKt.Spacer(SizeKt.m759height3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(1)), composer, 6);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 D1(MutableState mutableState) {
        z1(mutableState, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 E1(WordFavoriteBooksActivity wordFavoriteBooksActivity, c40.r0 r0Var, MutableState mutableState, ij.q qVar) {
        d1 e22 = e2(mutableState);
        if (e22 instanceof d1.a) {
            ij.a d11 = ((d1.a) e22).d();
            String o11 = d11 != null ? d11.o() : null;
            if (o11 == null) {
                o11 = "";
            }
            LoadingDialogActivity.setLoading$default(wordFavoriteBooksActivity, true, 0L, null, 6, null);
            c40.k.f(r0Var, null, null, new g(qVar, wordFavoriteBooksActivity, o11, mutableState, null), 3, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 F1(MutableState mutableState) {
        z1(mutableState, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 G1(WordFavoriteBooksActivity wordFavoriteBooksActivity, MutableState mutableState, String url) {
        kotlin.jvm.internal.g0.p(url, "url");
        z1(mutableState, null);
        if (url.length() > 0) {
            BczWebExecutorKt.startNormalWeb$default(wordFavoriteBooksActivity, url, null, false, 0, null, 60, null);
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 H1(final boolean z11, final MutableState mutableState, final State state, final ManagedActivityResultLauncher managedActivityResultLauncher, WordFavoriteBooksActivity wordFavoriteBooksActivity, final ij.q qVar, final c40.r0 r0Var, final ManagedActivityResultLauncher managedActivityResultLauncher2, final long j11, final MutableState mutableState2, final MutableState mutableState3, Composer composer, int i11) {
        final long j12;
        final WordFavoriteBooksActivity wordFavoriteBooksActivity2 = wordFavoriteBooksActivity;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-468601977, i11, -1, "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WordFavoriteBooksActivity.kt:269)");
            }
            long bookId = ((FavoritePlanInfo) mutableState.getValue()).getBookId();
            ij.x xVar = (ij.x) state.getValue();
            ij.x xVar2 = xVar == null ? new ij.x(0, a00.h0.J(), 0, 4, null) : xVar;
            boolean changedInstance = composer.changedInstance(managedActivityResultLauncher) | composer.changedInstance(wordFavoriteBooksActivity2);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                x00.l lVar = new x00.l() { // from class: com.baicizhan.main.word_book.list.j6
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 I1;
                        I1 = WordFavoriteBooksActivity.I1(z11, mutableState, managedActivityResultLauncher, wordFavoriteBooksActivity2, j11, ((Long) obj).longValue());
                        return I1;
                    }
                };
                wordFavoriteBooksActivity2 = wordFavoriteBooksActivity2;
                composer.updateRememberedValue(lVar);
                rememberedValue = lVar;
            }
            x00.l lVar2 = (x00.l) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(wordFavoriteBooksActivity2) | composer.changed(state) | composer.changedInstance(qVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.word_book.list.k6
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 J1;
                        J1 = WordFavoriteBooksActivity.J1(WordFavoriteBooksActivity.this, state, qVar, ((Long) obj).longValue());
                        return J1;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.l lVar3 = (x00.l) rememberedValue2;
            boolean changedInstance3 = composer.changedInstance(wordFavoriteBooksActivity2);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                j12 = j11;
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.word_book.list.l6
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 L1;
                        L1 = WordFavoriteBooksActivity.L1(WordFavoriteBooksActivity.this, j12);
                        return L1;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            } else {
                j12 = j11;
            }
            x00.a aVar = (x00.a) rememberedValue3;
            boolean changedInstance4 = composer.changedInstance(r0Var) | composer.changedInstance(qVar);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.word_book.list.m6
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 M1;
                        M1 = WordFavoriteBooksActivity.M1(c40.r0.this, mutableState2, mutableState3, qVar);
                        return M1;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            x00.a aVar2 = (x00.a) rememberedValue4;
            boolean changed = composer.changed(state) | composer.changedInstance(wordFavoriteBooksActivity2) | composer.changedInstance(qVar);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.word_book.list.n6
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 N1;
                        N1 = WordFavoriteBooksActivity.N1(State.this, wordFavoriteBooksActivity2, qVar);
                        return N1;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            x00.a aVar3 = (x00.a) rememberedValue5;
            boolean changedInstance5 = composer.changedInstance(managedActivityResultLauncher2) | composer.changedInstance(wordFavoriteBooksActivity2);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue6 == Composer.Companion.getEmpty()) {
                x00.l lVar4 = new x00.l() { // from class: com.baicizhan.main.word_book.list.o6
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 O1;
                        O1 = WordFavoriteBooksActivity.O1(MutableState.this, managedActivityResultLauncher2, wordFavoriteBooksActivity2, j12, ((Long) obj).longValue());
                        return O1;
                    }
                };
                composer.updateRememberedValue(lVar4);
                rememberedValue6 = lVar4;
            }
            x00.l lVar5 = (x00.l) rememberedValue6;
            boolean changedInstance6 = composer.changedInstance(wordFavoriteBooksActivity2);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance6 || rememberedValue7 == Composer.Companion.getEmpty()) {
                rememberedValue7 = new x00.a() { // from class: com.baicizhan.main.word_book.list.q6
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 P1;
                        P1 = WordFavoriteBooksActivity.P1(WordFavoriteBooksActivity.this);
                        return P1;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            WordFavoriteBooksActivityKt.Q(z11, bookId, xVar2, lVar2, lVar3, aVar, aVar2, aVar3, lVar5, (x00.a) rememberedValue7, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 I1(boolean z11, MutableState mutableState, ManagedActivityResultLauncher managedActivityResultLauncher, WordFavoriteBooksActivity wordFavoriteBooksActivity, long j11, long j12) {
        long j13;
        if (z11) {
            j13 = j12;
            managedActivityResultLauncher.launch(WordBookDetailActivity.f26698n.a(wordFavoriteBooksActivity, j13, j11, oe.l1.a(j12, (FavoritePlanInfo) mutableState.getValue()).component1()));
        } else {
            j13 = j12;
            WordBookDetailActivity.a.d(WordBookDetailActivity.f26698n, wordFavoriteBooksActivity, j13, 0L, 4, null);
        }
        ma.l.b(ma.t.f73012k, ma.a.f72731d4, ma.u.a(ma.b.B0, Long.valueOf(j13)));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [kc.d, kc.h] */
    public static final yz.g2 J1(final WordFavoriteBooksActivity wordFavoriteBooksActivity, State state, final ij.q qVar, final long j11) {
        List<kj.a> f11;
        Object obj;
        u.a aVar = new u.a(wordFavoriteBooksActivity);
        ij.x xVar = (ij.x) state.getValue();
        if (xVar != null && (f11 = xVar.f()) != null) {
            Iterator<T> it = f11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((kj.a) obj).j() == j11) {
                    break;
                }
            }
            kj.a aVar2 = (kj.a) obj;
            if (aVar2 != null) {
                mc.a.p(wordFavoriteBooksActivity, ((u.a) d.a.J(aVar.V(wordFavoriteBooksActivity.getString(R.string.word_favorite_books_remove_prompt, Integer.valueOf(aVar2.n()))), null, null, new x00.l() { // from class: com.baicizhan.main.word_book.list.r6
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 K1;
                        K1 = WordFavoriteBooksActivity.K1(WordFavoriteBooksActivity.this, qVar, j11, (View) obj2);
                        return K1;
                    }
                }, 3, null)).d(), null, 2, null);
                return yz.g2.f100423a;
            }
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 K1(WordFavoriteBooksActivity wordFavoriteBooksActivity, ij.q qVar, long j11, View view) {
        kotlin.jvm.internal.g0.p(view, "<unused var>");
        yg.i2.C(wordFavoriteBooksActivity, false, false, 300L, null, null, new h(qVar, j11, null), 27, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 L1(WordFavoriteBooksActivity wordFavoriteBooksActivity, long j11) {
        WordBookCreateActivity.f26739b.a(wordFavoriteBooksActivity, j11);
        return yz.g2.f100423a;
    }

    public static final yz.g2 M1(c40.r0 r0Var, MutableState mutableState, MutableState mutableState2, ij.q qVar) {
        z1(mutableState2, new d1.a(A1(mutableState)));
        if (A1(mutableState) == null) {
            c40.k.f(r0Var, null, null, new i(qVar, mutableState, mutableState2, null), 3, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 N1(State state, WordFavoriteBooksActivity wordFavoriteBooksActivity, ij.q qVar) {
        ij.x xVar = (ij.x) state.getValue();
        if (xVar == null) {
            return yz.g2.f100423a;
        }
        if (xVar.f().size() >= xVar.g()) {
            gi.a.e(wordFavoriteBooksActivity, "单词本数量已满", 0, 2, null);
            wordFavoriteBooksActivity.f2("hand_passcode", 4);
        } else if (xVar.f().size() >= xVar.h()) {
            gi.a.e(wordFavoriteBooksActivity, "单词本数量已达上限，铜板解锁后，可继续添加～", 0, 2, null);
            wordFavoriteBooksActivity.f2("hand_passcode", 5);
        } else {
            wordFavoriteBooksActivity.h2(qVar, state);
        }
        ma.l.a(ma.t.f73012k, ma.a.f72745f4);
        return yz.g2.f100423a;
    }

    public static final yz.g2 O1(MutableState mutableState, ManagedActivityResultLauncher managedActivityResultLauncher, WordFavoriteBooksActivity wordFavoriteBooksActivity, long j11, long j12) {
        Pair<FavoritePlanInfo, ScheduleType> a11 = oe.l1.a(j12, (FavoritePlanInfo) mutableState.getValue());
        managedActivityResultLauncher.launch(EditScheduleActivity.f18908j.a(wordFavoriteBooksActivity, j11, a11.component1(), a11.component2()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 P1(WordFavoriteBooksActivity wordFavoriteBooksActivity) {
        wordFavoriteBooksActivity.finish();
        return yz.g2.f100423a;
    }

    public static final boolean Q1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void R1(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final boolean S1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void T1(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 U1(final String str, final int i11, final WordFavoriteBooksActivity wordFavoriteBooksActivity, final ij.q qVar, final State state, String str2, final MutableState mutableState, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1827235751, i12, -1, "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WordFavoriteBooksActivity.kt:346)");
            }
            composer.startReplaceGroup(-668035532);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("发现一个单词本");
            int pushStyle = builder.pushStyle(new SpanStyle(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1600getPrimary0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (kotlin.jvm.internal.v) null));
            try {
                builder.append("《" + str2 + "》");
                yz.g2 g2Var = yz.g2.f100423a;
                builder.pop(pushStyle);
                builder.append("，要添加到你的列表吗？");
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composer.endReplaceGroup();
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.w6
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 V1;
                            V1 = WordFavoriteBooksActivity.V1(MutableState.this);
                            return V1;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                x00.a aVar = (x00.a) rememberedValue;
                boolean changed = composer.changed(str) | composer.changed(i11);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.word_book.list.x6
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 W1;
                            W1 = WordFavoriteBooksActivity.W1(MutableState.this, str, i11);
                            return W1;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                x00.a aVar2 = (x00.a) rememberedValue2;
                boolean changed2 = composer.changed(str) | composer.changed(i11) | composer.changedInstance(wordFavoriteBooksActivity) | composer.changedInstance(qVar) | composer.changed(state);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed2 || rememberedValue3 == companion.getEmpty()) {
                    x00.a aVar3 = new x00.a() { // from class: com.baicizhan.main.word_book.list.y6
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 X1;
                            X1 = WordFavoriteBooksActivity.X1(WordFavoriteBooksActivity.this, qVar, str, state, mutableState, i11);
                            return X1;
                        }
                    };
                    composer.updateRememberedValue(aVar3);
                    rememberedValue3 = aVar3;
                }
                PromptKt.q(new com.baicizhan.main.home.dialog.e0(null, null, annotatedString, null, false, 0, "取消", "添加", false, null, null, false, aVar, aVar2, (x00.a) rememberedValue3, 3899, null), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th2) {
                builder.pop(pushStyle);
                throw th2;
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 V1(MutableState mutableState) {
        T1(mutableState, false);
        return yz.g2.f100423a;
    }

    public static final yz.g2 W1(MutableState mutableState, String str, int i11) {
        T1(mutableState, false);
        Y1(str, i11, "0");
        return yz.g2.f100423a;
    }

    public static final yz.g2 X1(WordFavoriteBooksActivity wordFavoriteBooksActivity, ij.q qVar, String str, State state, MutableState mutableState, int i11) {
        T1(mutableState, false);
        Y1(str, i11, "1");
        n2(wordFavoriteBooksActivity, qVar, str, state, true, null, 8, null);
        return yz.g2.f100423a;
    }

    public static final void Y1(String str, int i11, String str2) {
        ma.l.b("activity-common", ma.a.f72822q4, ma.u.d(new String[]{ma.b.f72896c1, ma.b.f72889a1, ma.b.f72893b1}, new Object[]{str, Integer.valueOf(i11), str2}, false, 4, null));
    }

    public static final yz.g2 Z1(WordFavoriteBooksActivity wordFavoriteBooksActivity, ActivityResult it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (it.getResultCode() == -1) {
            wordFavoriteBooksActivity.finish();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 a2(WordFavoriteBooksActivity wordFavoriteBooksActivity, ActivityResult it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (it.getResultCode() == -1) {
            Intent data = it.getData();
            Serializable serializableExtra = data != null ? data.getSerializableExtra("planData") : null;
            if ((serializableExtra instanceof Pair ? (Pair) serializableExtra : null) != null) {
                wordFavoriteBooksActivity.finish();
            }
        }
        return yz.g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.BroadcastReceiver, com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$onCreate$1$1$2$1$rec$1] */
    public static final DisposableEffectResult b2(final WordFavoriteBooksActivity wordFavoriteBooksActivity, DisposableEffectScope DisposableEffect) {
        kotlin.jvm.internal.g0.p(DisposableEffect, "$this$DisposableEffect");
        yz.c0 c11 = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.word_book.list.c7
            @Override // x00.a
            public final Object invoke() {
                LocalBroadcastManager c22;
                c22 = WordFavoriteBooksActivity.c2(WordFavoriteBooksActivity.this);
                return c22;
            }
        });
        ?? r02 = new BroadcastReceiver() { // from class: com.baicizhan.main.word_book.list.WordFavoriteBooksActivity$onCreate$1$1$2$1$rec$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                WordFavoriteBooksActivity.this.finish();
            }
        };
        d2(c11).registerReceiver(r02, new IntentFilter(jc.a.f64015b));
        return new k(r02, c11);
    }

    public static final LocalBroadcastManager c2(WordFavoriteBooksActivity wordFavoriteBooksActivity) {
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(wordFavoriteBooksActivity);
        kotlin.jvm.internal.g0.o(localBroadcastManager, "getInstance(...)");
        return localBroadcastManager;
    }

    public static final LocalBroadcastManager d2(yz.c0<LocalBroadcastManager> c0Var) {
        return c0Var.getValue();
    }

    public static final d1 e2(MutableState<d1> mutableState) {
        return mutableState.getValue();
    }

    public static final yz.g2 i2(WordFavoriteBooksActivity wordFavoriteBooksActivity, ij.q qVar, State state, String code) {
        kotlin.jvm.internal.g0.p(code, "code");
        ma.l.a(ma.t.f73012k, ma.a.f72752g4);
        String m11 = eh.c.m(code);
        kotlin.jvm.internal.g0.m(m11);
        wordFavoriteBooksActivity.m2(qVar, m11, state, false, new x00.a() { // from class: com.baicizhan.main.word_book.list.e7
            @Override // x00.a
            public final Object invoke() {
                yz.g2 j22;
                j22 = WordFavoriteBooksActivity.j2();
                return j22;
            }
        });
        return yz.g2.f100423a;
    }

    public static final yz.g2 j2() {
        gi.d.a();
        return yz.g2.f100423a;
    }

    public static final void k2(WordFavoriteBooksActivity wordFavoriteBooksActivity, View view) {
        BczWebExecutorKt.startNormalWeb$default(wordFavoriteBooksActivity, "https://learn.baicizhan.com/protocols/36tMDGA3.html", null, false, 0, null, 60, null);
    }

    public static /* synthetic */ void n2(WordFavoriteBooksActivity wordFavoriteBooksActivity, ij.q qVar, String str, State state, boolean z11, x00.a aVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            aVar = new x00.a() { // from class: com.baicizhan.main.word_book.list.f7
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 o22;
                    o22 = WordFavoriteBooksActivity.o2();
                    return o22;
                }
            };
        }
        wordFavoriteBooksActivity.m2(qVar, str, state, z11, aVar);
    }

    public static final yz.g2 o2() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 p2(WordFavoriteBooksActivity wordFavoriteBooksActivity, x00.a aVar, ij.q qVar, kj.a it) {
        String str;
        kotlin.jvm.internal.g0.p(it, "it");
        str = WordFavoriteBooksActivityKt.f26823a;
        qb.c.i(str, "add book by code success: " + it.j(), new Object[0]);
        gi.a.e(wordFavoriteBooksActivity, "添加成功", 0, 2, null);
        aVar.invoke();
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(wordFavoriteBooksActivity), null, null, new m(qVar, it, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final ki.c v1() {
        return ki.e.a();
    }

    public static final void x1(final WordFavoriteBooksActivity wordFavoriteBooksActivity, ij.e controller) {
        kotlin.jvm.internal.g0.p(controller, "controller");
        final ij.q O = controller.O();
        ComponentActivityKt.setContent$default(wordFavoriteBooksActivity, null, ComposableLambdaKt.composableLambdaInstance(1126916832, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.z6
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 y12;
                y12 = WordFavoriteBooksActivity.y1(ij.q.this, wordFavoriteBooksActivity, (Composer) obj, ((Integer) obj2).intValue());
                return y12;
            }
        }), 1, null);
    }

    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [androidx.compose.runtime.SnapshotMutationPolicy, j00.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 y1(final ij.q qVar, final WordFavoriteBooksActivity wordFavoriteBooksActivity, Composer composer, int i11) {
        Object bVar;
        long j11;
        MutableState mutableState;
        ?? r12;
        int i12;
        Object obj;
        Object serializableExtra;
        long j12;
        String str;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1126916832, i11, -1, "com.baicizhan.main.word_book.list.WordFavoriteBooksActivity.onCreate.<anonymous>.<anonymous> (WordFavoriteBooksActivity.kt:138)");
            }
            final State collectAsState = SnapshotStateKt.collectAsState(qVar.W(), null, null, composer, 48, 2);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                Uri data = wordFavoriteBooksActivity.getIntent().getData();
                if (data != null && u30.f0.d2(data.getPath(), "/vld", false, 2, null)) {
                    String queryParameter = data.getQueryParameter("deviceId");
                    Long r13 = queryParameter != null ? u30.e0.r1(queryParameter) : null;
                    str = WordFavoriteBooksActivityKt.f26823a;
                    qb.c.i(str, "device: " + r13, new Object[0]);
                    if (r13 != null) {
                        j12 = r13.longValue();
                        rememberedValue = Long.valueOf(j12);
                        composer.updateRememberedValue(rememberedValue);
                    }
                }
                j12 = 0;
                rememberedValue = Long.valueOf(j12);
                composer.updateRememberedValue(rememberedValue);
            }
            long longValue = ((Number) rememberedValue).longValue();
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = Boolean.valueOf(longValue != 0);
                composer.updateRememberedValue(rememberedValue2);
            }
            final boolean booleanValue = ((Boolean) rememberedValue2).booleanValue();
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FavoritePlanInfo(-1L, 0, 2, null), null, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState2 = (MutableState) rememberedValue3;
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            boolean changedInstance = composer.changedInstance(wordFavoriteBooksActivity);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.l() { // from class: com.baicizhan.main.word_book.list.g7
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 Z1;
                        Z1 = WordFavoriteBooksActivity.Z1(WordFavoriteBooksActivity.this, (ActivityResult) obj2);
                        return Z1;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (x00.l) rememberedValue4, composer, 0);
            ActivityResultContracts.StartActivityForResult startActivityForResult2 = new ActivityResultContracts.StartActivityForResult();
            boolean changedInstance2 = composer.changedInstance(wordFavoriteBooksActivity);
            Object rememberedValue5 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.l() { // from class: com.baicizhan.main.word_book.list.h7
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 a22;
                        a22 = WordFavoriteBooksActivity.a2(WordFavoriteBooksActivity.this, (ActivityResult) obj2);
                        return a22;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            final ManagedActivityResultLauncher rememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult2, (x00.l) rememberedValue5, composer, 0);
            boolean changedInstance3 = composer.changedInstance(wordFavoriteBooksActivity);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue6 == companion.getEmpty()) {
                bVar = new b(booleanValue, wordFavoriteBooksActivity, longValue, mutableState2, null);
                j11 = longValue;
                mutableState = mutableState2;
                composer.updateRememberedValue(bVar);
            } else {
                bVar = rememberedValue6;
                j11 = longValue;
                mutableState = mutableState2;
            }
            EffectsKt.LaunchedEffect(mutableState, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) bVar, composer, 6);
            boolean changedInstance4 = composer.changedInstance(wordFavoriteBooksActivity);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = new x00.l() { // from class: com.baicizhan.main.word_book.list.i7
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        DisposableEffectResult b22;
                        b22 = WordFavoriteBooksActivity.b2(WordFavoriteBooksActivity.this, (DisposableEffectScope) obj2);
                        return b22;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            EffectsKt.DisposableEffect(mutableState, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue7, composer, 6);
            Object value = collectAsState.getValue();
            boolean changedInstance5 = composer.changedInstance(wordFavoriteBooksActivity) | composer.changed(collectAsState);
            Object rememberedValue8 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = wordFavoriteBooksActivity.new c(collectAsState, null);
                composer.updateRememberedValue(rememberedValue8);
            }
            EffectsKt.LaunchedEffect(value, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue8, composer, 0);
            Object rememberedValue9 = composer.rememberedValue();
            if (rememberedValue9 == companion.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue9);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue9;
            Object rememberedValue10 = composer.rememberedValue();
            if (rememberedValue10 == companion.getEmpty()) {
                rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue10);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue10;
            Object rememberedValue11 = composer.rememberedValue();
            if (rememberedValue11 == companion.getEmpty()) {
                rememberedValue11 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(rememberedValue11);
            }
            final c40.r0 r0Var = (c40.r0) rememberedValue11;
            final MutableState mutableState5 = mutableState;
            ModalBottomSheetState rememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composer, 3078, 6);
            boolean z11 = e2(mutableState3) != null;
            Boolean valueOf = Boolean.valueOf(z11);
            boolean changed = composer.changed(z11) | composer.changedInstance(rememberModalBottomSheetState);
            Object rememberedValue12 = composer.rememberedValue();
            if (changed || rememberedValue12 == companion.getEmpty()) {
                rememberedValue12 = new d(z11, rememberModalBottomSheetState, null);
                composer.updateRememberedValue(rememberedValue12);
            }
            EffectsKt.LaunchedEffect(valueOf, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue12, composer, 0);
            ModalBottomSheetValue currentValue = rememberModalBottomSheetState.getCurrentValue();
            boolean changedInstance6 = composer.changedInstance(rememberModalBottomSheetState);
            Object rememberedValue13 = composer.rememberedValue();
            if (changedInstance6 || rememberedValue13 == companion.getEmpty()) {
                rememberedValue13 = new e(rememberModalBottomSheetState, mutableState3, null);
                composer.updateRememberedValue(rememberedValue13);
            }
            EffectsKt.LaunchedEffect(currentValue, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue13, composer, 0);
            ij.x xVar = (ij.x) collectAsState.getValue();
            Integer valueOf2 = xVar != null ? Integer.valueOf(xVar.g()) : null;
            boolean changed2 = composer.changed(collectAsState) | composer.changedInstance(qVar);
            Object rememberedValue14 = composer.rememberedValue();
            if (changed2 || rememberedValue14 == companion.getEmpty()) {
                rememberedValue14 = new f(collectAsState, qVar, mutableState4, null);
                composer.updateRememberedValue(rememberedValue14);
            }
            EffectsKt.LaunchedEffect(valueOf2, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue14, composer, 0);
            float f11 = 8;
            final long j13 = j11;
            ModalBottomSheetKt.m1702ModalBottomSheetLayoutGs3lGvM(ComposableLambdaKt.rememberComposableLambda(1412252942, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.f6
                @Override // x00.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    yz.g2 C1;
                    C1 = WordFavoriteBooksActivity.C1(WordFavoriteBooksActivity.this, r0Var, qVar, mutableState3, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return C1;
                }
            }, composer, 54), null, rememberModalBottomSheetState, false, RoundedCornerShapeKt.m1021RoundedCornerShapea9UjIt4$default(Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 12, null), 0.0f, Color.Companion.m2546getWhite0d7_KjU(), 0L, ColorKt.Color(2568230946L), ComposableLambdaKt.rememberComposableLambda(-468601977, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.g6
                @Override // x00.p
                public final Object invoke(Object obj2, Object obj3) {
                    yz.g2 H1;
                    H1 = WordFavoriteBooksActivity.H1(booleanValue, mutableState5, collectAsState, rememberLauncherForActivityResult2, wordFavoriteBooksActivity, qVar, r0Var, rememberLauncherForActivityResult, j13, mutableState4, mutableState3, (Composer) obj2, ((Integer) obj3).intValue());
                    return H1;
                }
            }, composer, 54), composer, (ModalBottomSheetState.$stable << 6) | 907542534, 170);
            Object rememberedValue15 = composer.rememberedValue();
            if (rememberedValue15 == companion.getEmpty()) {
                r12 = 0;
                i12 = 2;
                rememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue15);
            } else {
                r12 = 0;
                i12 = 2;
            }
            MutableState mutableState6 = (MutableState) rememberedValue15;
            Object value2 = collectAsState.getValue();
            boolean changed3 = composer.changed(collectAsState);
            Object rememberedValue16 = composer.rememberedValue();
            if (changed3 || rememberedValue16 == companion.getEmpty()) {
                rememberedValue16 = new j(collectAsState, mutableState6, r12);
                composer.updateRememberedValue(rememberedValue16);
            }
            EffectsKt.LaunchedEffect(value2, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue16, composer, 0);
            Object rememberedValue17 = composer.rememberedValue();
            if (rememberedValue17 == companion.getEmpty()) {
                rememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, r12, i12, r12);
                composer.updateRememberedValue(rememberedValue17);
            }
            final MutableState mutableState7 = (MutableState) rememberedValue17;
            Object rememberedValue18 = composer.rememberedValue();
            if (rememberedValue18 == companion.getEmpty()) {
                if (wordFavoriteBooksActivity.getIntent().hasExtra(f26769e)) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializableExtra = wordFavoriteBooksActivity.getIntent().getSerializableExtra(f26769e, Triple.class);
                        obj = (Triple) serializableExtra;
                    } else {
                        Object serializableExtra2 = wordFavoriteBooksActivity.getIntent().getSerializableExtra(f26769e);
                        if (serializableExtra2 instanceof Triple) {
                            obj = (Triple) serializableExtra2;
                        }
                    }
                    composer.updateRememberedValue(obj);
                    rememberedValue18 = obj;
                }
                obj = r12;
                composer.updateRememberedValue(obj);
                rememberedValue18 = obj;
            }
            Triple triple = (Triple) rememberedValue18;
            if (!S1(mutableState7) || collectAsState.getValue() == null || triple == null) {
                composer.startReplaceGroup(-1786606526);
            } else {
                composer.startReplaceGroup(-1768395173);
                final String str2 = (String) triple.component1();
                final int intValue = ((Number) triple.component2()).intValue();
                final String str3 = (String) triple.component3();
                bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(1827235751, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.h6
                    @Override // x00.p
                    public final Object invoke(Object obj2, Object obj3) {
                        yz.g2 U1;
                        U1 = WordFavoriteBooksActivity.U1(str2, intValue, wordFavoriteBooksActivity, qVar, collectAsState, str3, mutableState7, (Composer) obj2, ((Integer) obj3).intValue());
                        return U1;
                    }
                }, composer, 54), composer, 3072, 7);
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

    public static final void z1(MutableState<d1> mutableState, d1 d1Var) {
        mutableState.setValue(d1Var);
    }

    public final void f2(String str, int i11) {
        g2(str, yz.h1.a(Integer.valueOf(i11), 0L));
    }

    public final void g2(String str, Pair<Integer, Long> pair) {
        int intValue = pair.component1().intValue();
        ma.l.b(ma.t.f73012k, ma.a.f72759h4, ma.u.d(new String[]{ma.b.T0, ma.b.U0, "result"}, new Object[]{str, Long.valueOf(pair.component2().longValue()), Integer.valueOf(intValue)}, false, 4, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h2(final ij.q qVar, final State<ij.x> state) {
        View findViewById;
        kc.o oVar = (kc.o) ((o.a) new o.a(this).U(R.layout.layout_dialog_edit_share_code).L(R.string.word_favorite_books_share_code_title).T(true).f(false)).Q(new x00.l() { // from class: com.baicizhan.main.word_book.list.p6
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 i22;
                i22 = WordFavoriteBooksActivity.i2(WordFavoriteBooksActivity.this, qVar, state, (String) obj);
                return i22;
            }
        }).d();
        mc.a.p(this, oVar, null, 2, null);
        getSupportFragmentManager().executePendingTransactions();
        Dialog dialog = oVar.getDialog();
        if (dialog == null || (findViewById = dialog.findViewById(R.id.share_code_feature_intro)) == null) {
            return;
        }
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.word_book.list.a7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WordFavoriteBooksActivity.k2(WordFavoriteBooksActivity.this, view);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l2(ij.q r5, java.lang.String r6, androidx.compose.runtime.State<ij.x> r7, boolean r8, j00.c<? super kotlin.Result<kj.a>> r9) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.WordFavoriteBooksActivity.l2(ij.q, java.lang.String, androidx.compose.runtime.State, boolean, j00.c):java.lang.Object");
    }

    public final void m2(final ij.q qVar, String str, State<ij.x> state, boolean z11, final x00.a<yz.g2> aVar) {
        yg.i2.C(this, false, false, 300L, new x00.l() { // from class: com.baicizhan.main.word_book.list.i6
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 p22;
                p22 = WordFavoriteBooksActivity.p2(WordFavoriteBooksActivity.this, aVar, qVar, (kj.a) obj);
                return p22;
            }
        }, null, new n(qVar, str, state, z11, null), 19, null);
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        hj.p.d(this, new rj.e() { // from class: com.baicizhan.main.word_book.list.d7
            @Override // rj.e
            public final void a(ij.e eVar) {
                WordFavoriteBooksActivity.x1(WordFavoriteBooksActivity.this, eVar);
            }
        });
    }

    public final ki.c w1() {
        return (ki.c) this.f26770b.getValue();
    }
}
