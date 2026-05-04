package com.baicizhan.main.word_book.list;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.baicizhan.base.ComposeBaseActivity;
import com.jiongji.andriod.card.R;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordFavoriteAddActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoriteAddActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteAddActivity\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1261:1\n85#2:1262\n113#2,2:1263\n1247#3,6:1265\n1247#3,6:1271\n1247#3,6:1277\n*S KotlinDebug\n*F\n+ 1 WordFavoriteAddActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteAddActivity\n*L\n227#1:1262\n227#1:1263,2\n229#1:1265,6\n234#1:1271,6\n237#1:1277,6\n*E\n"})
/* loaded from: classes5.dex */
public final class WordFavoriteAddActivity extends ComposeBaseActivity {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f26754c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f26755d = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f26756e = "book_id";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f26757f = "device_id";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f26758g = "mode";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f26759b = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.word_book.list.p3
        @Override // x00.a
        public final Object invoke() {
            be.s Q0;
            Q0 = WordFavoriteAddActivity.Q0(WordFavoriteAddActivity.this);
            return Q0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Context context, long j11, FavoriteAddingMode favoriteAddingMode, long j12, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j11 = -1;
            }
            long j13 = j11;
            if ((i11 & 4) != 0) {
                favoriteAddingMode = FavoriteAddingMode.DESCRIPTION;
            }
            FavoriteAddingMode favoriteAddingMode2 = favoriteAddingMode;
            if ((i11 & 8) != 0) {
                j12 = 0;
            }
            aVar.a(context, j13, favoriteAddingMode2, j12);
        }

        public final void a(@m80.k Context context, long j11, @m80.k FavoriteAddingMode mode, long j12) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(mode, "mode");
            if (j11 == -1 && mode != FavoriteAddingMode.CAM_OCR) {
                throw new IllegalArgumentException("Only CAM_OCR mode supports non-bookId adding!");
            }
            Intent intent = new Intent(context, (Class<?>) WordFavoriteAddActivity.class);
            intent.putExtra("book_id", j11);
            intent.putExtra("mode", mode);
            intent.putExtra("device_id", j12);
            context.startActivity(intent);
        }

        public final void c(@m80.k Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            b(this, context, 0L, FavoriteAddingMode.CAM_OCR, 0L, 10, null);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivity$onCreate$1$3$1$1$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {R.styleable.Theme_drawable_tab_friends_new}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26760a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return WordFavoriteAddActivity.this.new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26760a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f26760a = 1;
                if (c40.a1.b(150L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            be.h.d(WordFavoriteAddActivity.this.P0(), false, null, 3, null);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivity$onCreate$1$3$3$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26762a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return WordFavoriteAddActivity.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26762a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            WordFavoriteAddActivity.this.P0().e(new ce.f(WordFavoriteAddActivity.this, null, null, false, 14, null));
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivity$onCreate$1$5", f = "WordFavoriteAddActivity.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.l<j00.c<? super Result<? extends kj.a>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26764a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ij.e f26765b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f26766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ij.e eVar, Ref.LongRef longRef, j00.c<? super d> cVar) {
            super(1, cVar);
            this.f26765b = eVar;
            this.f26766c = longRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return new d(this.f26765b, this.f26766c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<kj.a>> cVar) {
            return ((d) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object j02;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26764a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.q O = this.f26765b.O();
                long j11 = this.f26766c.element;
                this.f26764a = 1;
                j02 = O.j0(j11, this);
                if (j02 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                j02 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(j02);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends kj.a>> cVar) {
            return invoke2((j00.c<? super Result<kj.a>>) cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final be.h P0() {
        return (be.h) this.f26759b.getValue();
    }

    public static final be.s Q0(WordFavoriteAddActivity wordFavoriteAddActivity) {
        View decorView = wordFavoriteAddActivity.getWindow().getDecorView();
        kotlin.jvm.internal.g0.n(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        return new be.s((ViewGroup) decorView, wordFavoriteAddActivity.getLifecycle());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, com.baicizhan.main.word_book.list.FavoriteAddingMode] */
    /* JADX WARN: Type inference failed for: r1v29, types: [T, com.baicizhan.main.word_book.list.FavoriteAddingMode] */
    public static final void R0(final WordFavoriteAddActivity wordFavoriteAddActivity, ij.e it) {
        Uri data;
        ?? r12;
        Long r13;
        kotlin.jvm.internal.g0.p(it, "it");
        final Ref.LongRef longRef = new Ref.LongRef();
        Intent intent = wordFavoriteAddActivity.getIntent();
        longRef.element = intent != null ? intent.getLongExtra("book_id", -1L) : -1L;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Intent intent2 = wordFavoriteAddActivity.getIntent();
        Serializable serializableExtra = intent2 != null ? intent2.getSerializableExtra("mode") : null;
        objectRef.element = serializableExtra instanceof FavoriteAddingMode ? (FavoriteAddingMode) serializableExtra : 0;
        Intent intent3 = wordFavoriteAddActivity.getIntent();
        if (intent3 != null && (data = intent3.getData()) != null) {
            qb.c.b(b6.f26918a, "data: " + data, new Object[0]);
            if (kotlin.jvm.internal.g0.g(data.getHost(), "com.baicizhan.favoritebooks") && kotlin.jvm.internal.g0.g(data.getPath(), "/add")) {
                String queryParameter = data.getQueryParameter("bookId");
                if (queryParameter != null && (r13 = u30.e0.r1(queryParameter)) != null) {
                    longRef.element = r13.longValue();
                }
                String queryParameter2 = data.getQueryParameter("mode");
                if (queryParameter2 != null) {
                    FavoriteAddingMode[] values = FavoriteAddingMode.values();
                    Integer p12 = u30.e0.p1(queryParameter2);
                    if (p12 != null && (r12 = (FavoriteAddingMode) a00.a0.hf(values, p12.intValue())) != 0) {
                        objectRef.element = r12;
                        if ((r12 == FavoriteAddingMode.DESCRIPTION_AND_CAM && !ki.j.f66587b.a()) || (objectRef.element == FavoriteAddingMode.CAM_OCR && !ij.p.a().a())) {
                            qb.c.q(b6.f26918a, "mode not supported for current feature!", new Object[0]);
                            objectRef.element = FavoriteAddingMode.DESCRIPTION;
                        }
                    }
                }
            }
        }
        if (objectRef.element == 0) {
            throw new IllegalArgumentException("favorite adding mode needed!");
        }
        Intent intent4 = wordFavoriteAddActivity.getIntent();
        long longExtra = intent4 != null ? intent4.getLongExtra("device_id", 0L) : 0L;
        final MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        final long j11 = longExtra;
        ComponentActivityKt.setContent$default(wordFavoriteAddActivity, null, ComposableLambdaKt.composableLambdaInstance(371367488, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.k3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 U0;
                U0 = WordFavoriteAddActivity.U0(Ref.LongRef.this, objectRef, j11, wordFavoriteAddActivity, mutableStateOf$default, (Composer) obj, ((Integer) obj2).intValue());
                return U0;
            }
        }), 1, null);
        if (longRef.element != -1) {
            yg.i2.G(wordFavoriteAddActivity, false, false, 300L, new x00.l() { // from class: com.baicizhan.main.word_book.list.l3
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 X0;
                    X0 = WordFavoriteAddActivity.X0(MutableState.this, (kj.a) obj);
                    return X0;
                }
            }, null, new d(it, longRef, null), 19, null);
        }
    }

    public static final int S0(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final void T0(MutableState<Integer> mutableState, int i11) {
        mutableState.setValue(Integer.valueOf(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 U0(Ref.LongRef longRef, Ref.ObjectRef objectRef, long j11, final WordFavoriteAddActivity wordFavoriteAddActivity, MutableState mutableState, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(371367488, i11, -1, "com.baicizhan.main.word_book.list.WordFavoriteAddActivity.onCreate.<anonymous>.<anonymous> (WordFavoriteAddActivity.kt:228)");
            }
            int S0 = S0(mutableState);
            long j12 = longRef.element;
            T t11 = objectRef.element;
            kotlin.jvm.internal.g0.m(t11);
            FavoriteAddingMode favoriteAddingMode = (FavoriteAddingMode) t11;
            boolean changedInstance = composer.changedInstance(wordFavoriteAddActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.n3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 V0;
                        V0 = WordFavoriteAddActivity.V0(WordFavoriteAddActivity.this);
                        return V0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar = (x00.a) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(wordFavoriteAddActivity);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.word_book.list.o3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 W0;
                        W0 = WordFavoriteAddActivity.W0(WordFavoriteAddActivity.this);
                        return W0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            b6.Z0(S0, j12, favoriteAddingMode, j11, aVar, (x00.a) rememberedValue2, composer, 0, 0);
            boolean changedInstance3 = composer.changedInstance(wordFavoriteAddActivity);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = wordFavoriteAddActivity.new c(null);
                composer.updateRememberedValue(rememberedValue3);
            }
            EffectsKt.LaunchedEffect("", (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue3, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 V0(WordFavoriteAddActivity wordFavoriteAddActivity) {
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(wordFavoriteAddActivity), null, null, wordFavoriteAddActivity.new b(null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 W0(WordFavoriteAddActivity wordFavoriteAddActivity) {
        wordFavoriteAddActivity.finish();
        return yz.g2.f100423a;
    }

    public static final yz.g2 X0(MutableState mutableState, kj.a it) {
        kotlin.jvm.internal.g0.p(it, "it");
        T0(mutableState, it.n());
        return yz.g2.f100423a;
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        hj.p.d(this, new rj.e() { // from class: com.baicizhan.main.word_book.list.m3
            @Override // rj.e
            public final void a(ij.e eVar) {
                WordFavoriteAddActivity.R0(WordFavoriteAddActivity.this, eVar);
            }
        });
    }
}
