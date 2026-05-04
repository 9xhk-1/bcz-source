package com.baicizhan.main.examassistant;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.examassistant.MarkedWordsActivity;
import com.baicizhan.main.examassistant.data.MarkedWord;
import com.baicizhan.main.wikiv2.lookup.WordWikiActivity;
import com.baicizhan.main.wikiv2.studyv2.data.EntryPage;
import com.baicizhan.main.word_book.list.FavoritesIntentWidgetsKt;
import com.baicizhan.main.word_book.list.WordFavoriteBooksActivity;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kc.d;
import kc.u;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nMarkedWordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkedWordsActivity.kt\ncom/baicizhan/main/examassistant/MarkedWordsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,359:1\n1#2:360\n1247#3,6:361\n1247#3,6:367\n1247#3,6:373\n1247#3,6:379\n1247#3,6:385\n1247#3,6:391\n1247#3,3:404\n1250#3,3:408\n1247#3,6:411\n1247#3,6:417\n1247#3,6:434\n1247#3,6:440\n1247#3,6:446\n557#4:397\n554#4,6:398\n555#5:407\n85#6:423\n113#6,2:424\n1563#7:426\n1634#7,3:427\n11601#8:430\n11936#8,3:431\n11601#8:452\n11936#8,3:453\n*S KotlinDebug\n*F\n+ 1 MarkedWordsActivity.kt\ncom/baicizhan/main/examassistant/MarkedWordsActivity\n*L\n85#1:361,6\n86#1:367,6\n97#1:373,6\n98#1:379,6\n108#1:385,6\n109#1:391,6\n110#1:404,3\n110#1:408,3\n120#1:411,6\n152#1:417,6\n161#1:434,6\n178#1:440,6\n182#1:446,6\n110#1:397\n110#1:398,6\n110#1:407\n109#1:423\n109#1:424,2\n122#1:426\n122#1:427,3\n146#1:430\n146#1:431,3\n197#1:452\n197#1:453,3\n*E\n"})
/* loaded from: classes4.dex */
public final class MarkedWordsActivity extends ComposeBaseActivity {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f20348d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f20349e = 8;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f20350f = "com.baicizhan.favoritebooks";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f20351g = "/markedlist";

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f20352h = "paperId";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f20353b = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.examassistant.m0
        @Override // x00.a
        public final Object invoke() {
            gg.a B1;
            B1 = MarkedWordsActivity.B1();
            return B1;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f20354c = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.examassistant.n0
        @Override // x00.a
        public final Object invoke() {
            q9.l A1;
            A1 = MarkedWordsActivity.A1(MarkedWordsActivity.this);
            return A1;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.examassistant.MarkedWordsActivity$onCreate$1$1$1$1", f = "MarkedWordsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20355a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ij.e f20357c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Integer> f20358d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.examassistant.MarkedWordsActivity$onCreate$1$1$1$1$1", f = "MarkedWordsActivity.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f20359a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarkedWordsActivity f20360b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ij.e f20361c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<Integer> f20362d;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.main.examassistant.MarkedWordsActivity$onCreate$1$1$1$1$1$1", f = "MarkedWordsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: com.baicizhan.main.examassistant.MarkedWordsActivity$b$a$a, reason: collision with other inner class name */
            public static final class C0304a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f20363a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ij.e f20364b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ SnapshotStateList<Integer> f20365c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0304a(ij.e eVar, SnapshotStateList<Integer> snapshotStateList, j00.c<? super C0304a> cVar) {
                    super(2, cVar);
                    this.f20364b = eVar;
                    this.f20365c = snapshotStateList;
                }

                public static final void j(SnapshotStateList snapshotStateList, Set set) {
                    qb.c.b(q1.f20611a, "init favorites done: " + set.size(), new Object[0]);
                    snapshotStateList.clear();
                    snapshotStateList.addAll(set);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                    return new C0304a(this.f20364b, this.f20365c, cVar);
                }

                @Override // x00.p
                public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                    return ((C0304a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f20363a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    ij.e eVar = this.f20364b;
                    final SnapshotStateList<Integer> snapshotStateList = this.f20365c;
                    eVar.q(new ij.h() { // from class: com.baicizhan.main.examassistant.e1
                        @Override // ij.h
                        public final void a(Set set) {
                            MarkedWordsActivity.b.a.C0304a.j(SnapshotStateList.this, set);
                        }
                    });
                    return yz.g2.f100423a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MarkedWordsActivity markedWordsActivity, ij.e eVar, SnapshotStateList<Integer> snapshotStateList, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f20360b = markedWordsActivity;
                this.f20361c = eVar;
                this.f20362d = snapshotStateList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f20360b, this.f20361c, this.f20362d, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f20359a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    MarkedWordsActivity markedWordsActivity = this.f20360b;
                    Lifecycle.State state = Lifecycle.State.RESUMED;
                    C0304a c0304a = new C0304a(this.f20361c, this.f20362d, null);
                    this.f20359a = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(markedWordsActivity, state, c0304a, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return yz.g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ij.e eVar, SnapshotStateList<Integer> snapshotStateList, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f20357c = eVar;
            this.f20358d = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return MarkedWordsActivity.this.new b(this.f20357c, this.f20358d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f20355a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            c40.k.f(LifecycleOwnerKt.getLifecycleScope(MarkedWordsActivity.this), null, null, new a(MarkedWordsActivity.this, this.f20357c, this.f20358d, null), 3, null);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.examassistant.MarkedWordsActivity$onCreate$1$1$2$1", f = "MarkedWordsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20366a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f20368c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20369a;

            static {
                int[] iArr = new int[IAudioPlayer.State.values().length];
                try {
                    iArr[IAudioPlayer.State.Completed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IAudioPlayer.State.Stopped.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f20369a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MutableState<Integer> mutableState, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f20368c = mutableState;
        }

        public static final void j(MutableState mutableState, IAudioPlayer.State state) {
            int i11 = state == null ? -1 : a.f20369a[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                mutableState.setValue(0);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return MarkedWordsActivity.this.new c(this.f20368c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f20366a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            IAudioPlayer f12 = MarkedWordsActivity.this.f1();
            final MutableState<Integer> mutableState = this.f20368c;
            f12.f(new IAudioPlayer.b() { // from class: com.baicizhan.main.examassistant.f1
                @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
                public final void onPlayStateChanged(IAudioPlayer.State state) {
                    MarkedWordsActivity.c.j(MutableState.this, state);
                }
            });
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.examassistant.MarkedWordsActivity$onCreate$1$1$5$3$1$2", f = "MarkedWordsActivity.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20370a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f20371b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MutableState<Boolean> mutableState, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f20371b = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f20371b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f20370a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f20370a = 1;
                if (c40.a1.b(1000L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            MarkedWordsActivity.s1(this.f20371b, false);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.examassistant.MarkedWordsActivity$onCreate$1$4", f = "MarkedWordsActivity.kt", i = {}, l = {R.styleable.Theme_drawable_syncview_update}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.l<j00.c<? super Result<? extends List<? extends MarkedWord>>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20372a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f20374c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.examassistant.MarkedWordsActivity$onCreate$1$4$1", f = "MarkedWordsActivity.kt", i = {}, l = {R.styleable.Theme_drawable_tab_friends}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super List<? extends MarkedWord>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f20375a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarkedWordsActivity f20376b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f20377c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MarkedWordsActivity markedWordsActivity, int i11, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f20376b = markedWordsActivity;
                this.f20377c = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(j00.c<?> cVar) {
                return new a(this.f20376b, this.f20377c, cVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(j00.c<? super List<MarkedWord>> cVar) {
                return ((a) create(cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f20375a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                fg.a g12 = this.f20376b.g1();
                int i12 = this.f20377c;
                this.f20375a = 1;
                Object b11 = g12.b(i12, this);
                return b11 == l11 ? l11 : b11;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(j00.c<? super List<? extends MarkedWord>> cVar) {
                return invoke2((j00.c<? super List<MarkedWord>>) cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i11, j00.c<? super e> cVar) {
            super(1, cVar);
            this.f20374c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return MarkedWordsActivity.this.new e(this.f20374c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<? extends List<MarkedWord>>> cVar) {
            return ((e) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f20372a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.m0 c11 = c40.h1.c();
                a aVar = new a(MarkedWordsActivity.this, this.f20374c, null);
                this.f20372a = 1;
                d11 = com.baicizhan.main.word_book.data.impl.c.d(c11, null, aVar, this, 2, null);
                if (d11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                d11 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(d11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends List<? extends MarkedWord>>> cVar) {
            return invoke2((j00.c<? super Result<? extends List<MarkedWord>>>) cVar);
        }
    }

    public static final q9.l A1(MarkedWordsActivity markedWordsActivity) {
        return new q9.l(markedWordsActivity);
    }

    public static final gg.a B1() {
        return new gg.a();
    }

    public static final void h1(final MarkedWordsActivity markedWordsActivity, final int i11, final ij.e controller) {
        kotlin.jvm.internal.g0.p(controller, "controller");
        final MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        final SnapshotStateList mutableStateListOf = SnapshotStateKt.mutableStateListOf();
        final hj.m mVar = new hj.m(markedWordsActivity, null, controller);
        ComponentActivityKt.setContent$default(markedWordsActivity, null, ComposableLambdaKt.composableLambdaInstance(-327581657, true, new x00.p() { // from class: com.baicizhan.main.examassistant.l0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 i12;
                i12 = MarkedWordsActivity.i1(MarkedWordsActivity.this, controller, mutableStateOf$default, mutableStateListOf, mVar, i11, (Composer) obj, ((Integer) obj2).intValue());
                return i12;
            }
        }), 1, null);
        yg.i2.G(markedWordsActivity, false, false, 300L, new x00.l() { // from class: com.baicizhan.main.examassistant.v0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 y12;
                y12 = MarkedWordsActivity.y1(SnapshotStateList.this, mutableStateOf$default, i11, (List) obj);
                return y12;
            }
        }, new x00.l() { // from class: com.baicizhan.main.examassistant.w0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 z12;
                z12 = MarkedWordsActivity.z1(MutableState.this, (Throwable) obj);
                return z12;
            }
        }, markedWordsActivity.new e(i11, null), 3, null);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 i1(MarkedWordsActivity markedWordsActivity, final ij.e eVar, MutableState mutableState, final SnapshotStateList snapshotStateList, final hj.m mVar, final int i11, Composer composer, int i12) {
        final MarkedWordsActivity markedWordsActivity2 = markedWordsActivity;
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-327581657, i12, -1, "com.baicizhan.main.examassistant.MarkedWordsActivity.onCreate.<anonymous>.<anonymous> (MarkedWordsActivity.kt:84)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                composer.updateRememberedValue(rememberedValue);
            }
            final SnapshotStateList snapshotStateList2 = (SnapshotStateList) rememberedValue;
            boolean changedInstance = composer.changedInstance(markedWordsActivity2) | composer.changedInstance(eVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = markedWordsActivity2.new b(eVar, snapshotStateList2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.LaunchedEffect(snapshotStateList2, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue2, composer, 6);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue3;
            boolean changedInstance2 = composer.changedInstance(markedWordsActivity2);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = markedWordsActivity2.new c(mutableState2, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            EffectsKt.LaunchedEffect(mutableState2, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue4, composer, 6);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue5;
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue6);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue6;
            Object rememberedValue7 = composer.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(rememberedValue7);
            }
            final c40.r0 r0Var = (c40.r0) rememberedValue7;
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            String stringResource = StringResources_androidKt.stringResource(R.string.exam_assistant_marked_list_title, composer, 6);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.exam_assistant_marked_list_label, composer, 6);
            String stringResource3 = StringResources_androidKt.stringResource(R.string.exam_assistant_marked_list_empty_tip, composer, 6);
            String stringResource4 = StringResources_androidKt.stringResource(R.string.exam_assistant_marked_list_button_favorite, composer, 6);
            boolean booleanValue2 = ((Boolean) mutableState3.getValue()).booleanValue();
            boolean changedInstance3 = composer.changedInstance(mVar) | composer.changed(snapshotStateList) | composer.changedInstance(markedWordsActivity2) | composer.changed(i11) | composer.changedInstance(eVar);
            Object rememberedValue8 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue8 == companion.getEmpty()) {
                x00.a aVar = new x00.a() { // from class: com.baicizhan.main.examassistant.s0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 t12;
                        t12 = MarkedWordsActivity.t1(MutableState.this, mVar, snapshotStateList, markedWordsActivity2, eVar, i11, snapshotStateList2);
                        return t12;
                    }
                };
                markedWordsActivity2 = markedWordsActivity2;
                snapshotStateList2 = snapshotStateList2;
                composer.updateRememberedValue(aVar);
                rememberedValue8 = aVar;
            }
            x00.a aVar2 = (x00.a) rememberedValue8;
            boolean changedInstance4 = composer.changedInstance(markedWordsActivity2);
            Object rememberedValue9 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue9 == companion.getEmpty()) {
                rememberedValue9 = new x00.a() { // from class: com.baicizhan.main.examassistant.t0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 x12;
                        x12 = MarkedWordsActivity.x1(MarkedWordsActivity.this);
                        return x12;
                    }
                };
                composer.updateRememberedValue(rememberedValue9);
            }
            FavoritesIntentWidgetsKt.z(booleanValue, stringResource, stringResource2, stringResource3, stringResource4, booleanValue2, snapshotStateList, false, null, new Pair(aVar2, (x00.a) rememberedValue9), null, null, ComposableLambdaKt.rememberComposableLambda(-1505447191, true, new x00.q() { // from class: com.baicizhan.main.examassistant.u0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 j12;
                    j12 = MarkedWordsActivity.j1(SnapshotStateList.this, mutableState2, markedWordsActivity2, mVar, i11, r0Var, mutableState4, (MarkedWord) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return j12;
                }
            }, composer, 54), composer, 0, 384, 3456);
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
    public static final yz.g2 j1(final SnapshotStateList snapshotStateList, final MutableState mutableState, final MarkedWordsActivity markedWordsActivity, final hj.m mVar, final int i11, final c40.r0 r0Var, final MutableState mutableState2, final MarkedWord item, Composer composer, int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(item, "item");
        if ((i12 & 6) == 0) {
            i13 = i12 | ((i12 & 8) == 0 ? composer.changed(item) : composer.changedInstance(item) ? 4 : 2);
        } else {
            i13 = i12;
        }
        boolean z11 = false;
        if (composer.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1505447191, i13, -1, "com.baicizhan.main.examassistant.MarkedWordsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MarkedWordsActivity.kt:156)");
            }
            boolean contains = snapshotStateList.contains(Integer.valueOf(item.n()));
            boolean z12 = item.n() == ((Number) mutableState.getValue()).intValue();
            int i14 = i13 & 14;
            boolean changedInstance = (i14 == 4 || ((i13 & 8) != 0 && composer.changedInstance(item))) | composer.changedInstance(markedWordsActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.examassistant.a1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 k12;
                        k12 = MarkedWordsActivity.k1(MarkedWord.this, mutableState, markedWordsActivity);
                        return k12;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar = (x00.a) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(markedWordsActivity) | (i14 == 4 || ((i13 & 8) != 0 && composer.changedInstance(item)));
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.examassistant.b1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 o12;
                        o12 = MarkedWordsActivity.o1(MarkedWordsActivity.this, item);
                        return o12;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.a aVar2 = (x00.a) rememberedValue2;
            boolean changedInstance3 = composer.changedInstance(mVar) | composer.changedInstance(markedWordsActivity);
            if (i14 == 4 || ((i13 & 8) != 0 && composer.changedInstance(item))) {
                z11 = true;
            }
            boolean changed = changedInstance3 | z11 | composer.changed(i11) | composer.changedInstance(r0Var);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                x00.a aVar3 = new x00.a() { // from class: com.baicizhan.main.examassistant.c1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 p12;
                        p12 = MarkedWordsActivity.p1(hj.m.this, markedWordsActivity, item, r0Var, mutableState2, snapshotStateList, i11);
                        return p12;
                    }
                };
                composer.updateRememberedValue(aVar3);
                rememberedValue3 = aVar3;
            }
            q1.k(item, contains, z12, aVar, aVar2, (x00.a) rememberedValue3, composer, i14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 k1(final MarkedWord markedWord, final MutableState mutableState, final MarkedWordsActivity markedWordsActivity) {
        if (markedWord.n() != ((Number) mutableState.getValue()).intValue()) {
            if (((Number) mutableState.getValue()).intValue() != 0) {
                markedWordsActivity.f1().stop();
            }
            rx.c<File> e11 = m9.d.d().e(markedWord.j());
            final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.examassistant.x0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 l12;
                    l12 = MarkedWordsActivity.l1(MarkedWordsActivity.this, mutableState, markedWord, (File) obj);
                    return l12;
                }
            };
            e11.u5(new wb0.b() { // from class: com.baicizhan.main.examassistant.y0
                @Override // wb0.b
                public final void call(Object obj) {
                    MarkedWordsActivity.m1(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: com.baicizhan.main.examassistant.z0
                @Override // wb0.b
                public final void call(Object obj) {
                    MarkedWordsActivity.n1((Throwable) obj);
                }
            });
        } else {
            markedWordsActivity.f1().stop();
            mutableState.setValue(0);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 l1(MarkedWordsActivity markedWordsActivity, MutableState mutableState, MarkedWord markedWord, File file) {
        markedWordsActivity.f1().e(file);
        mutableState.setValue(Integer.valueOf(markedWord.n()));
        return yz.g2.f100423a;
    }

    public static final void m1(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void n1(Throwable th2) {
        qb.c.d(q1.f20611a, "", new Object[0]);
        va.g.j(th2, 0);
    }

    public static final yz.g2 o1(MarkedWordsActivity markedWordsActivity, MarkedWord markedWord) {
        com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a.q(EntryPage.PAST_EXAM_HELPER_COLLECT_PAGE);
        WordWikiActivity.a.d(WordWikiActivity.f25556b, markedWordsActivity, markedWord.n(), 0, null, 12, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 p1(hj.m mVar, MarkedWordsActivity markedWordsActivity, final MarkedWord markedWord, c40.r0 r0Var, MutableState mutableState, final SnapshotStateList snapshotStateList, final int i11) {
        if (r1(mutableState)) {
            return yz.g2.f100423a;
        }
        mVar.r(markedWordsActivity.e1(markedWord), new hj.o() { // from class: com.baicizhan.main.examassistant.r0
            @Override // hj.o
            public final void a(Boolean bool, long[] jArr) {
                MarkedWordsActivity.q1(SnapshotStateList.this, markedWord, i11, bool, jArr);
            }
        });
        s1(mutableState, true);
        c40.k.f(r0Var, null, null, new d(mutableState, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final void q1(SnapshotStateList snapshotStateList, MarkedWord markedWord, int i11, Boolean bool, long[] ids) {
        kotlin.jvm.internal.g0.p(ids, "ids");
        if (bool != null) {
            if (!bool.booleanValue()) {
                snapshotStateList.remove(Integer.valueOf(markedWord.n()));
            } else if (!snapshotStateList.contains(Integer.valueOf(markedWord.n()))) {
                snapshotStateList.add(Integer.valueOf(markedWord.n()));
            }
            String[] strArr = {"topic_id", ma.b.f72902e1, ma.b.B0, ma.b.f72897d};
            Integer valueOf = Integer.valueOf(markedWord.n());
            Integer valueOf2 = Integer.valueOf(i11);
            com.google.gson.d dVar = new com.google.gson.d();
            ArrayList arrayList = new ArrayList(ids.length);
            for (long j11 : ids) {
                arrayList.add(String.valueOf(j11));
            }
            ma.l.b(ma.t.f73011j, ma.a.f72843t4, ma.u.d(strArr, new Object[]{valueOf, valueOf2, dVar.z(arrayList), ma.v.f73049t}, false, 4, null));
        }
    }

    public static final boolean r1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void s1(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final yz.g2 t1(final MutableState mutableState, hj.m mVar, final SnapshotStateList snapshotStateList, final MarkedWordsActivity markedWordsActivity, final ij.e eVar, final int i11, final SnapshotStateList snapshotStateList2) {
        mutableState.setValue(Boolean.FALSE);
        ArrayList arrayList = new ArrayList(a00.i0.d0(snapshotStateList, 10));
        Iterator<T> it = snapshotStateList.iterator();
        while (it.hasNext()) {
            arrayList.add(markedWordsActivity.e1((MarkedWord) it.next()));
        }
        mVar.m(arrayList, new hj.o() { // from class: com.baicizhan.main.examassistant.d1
            @Override // hj.o
            public final void a(Boolean bool, long[] jArr) {
                MarkedWordsActivity.u1(MutableState.this, markedWordsActivity, eVar, i11, snapshotStateList, snapshotStateList2, bool, jArr);
            }
        });
        return yz.g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [kc.d, kc.h] */
    public static final void u1(MutableState mutableState, final MarkedWordsActivity markedWordsActivity, ij.e eVar, final int i11, SnapshotStateList snapshotStateList, final SnapshotStateList snapshotStateList2, Boolean bool, long[] ids) {
        kotlin.jvm.internal.g0.p(ids, "ids");
        Boolean bool2 = Boolean.TRUE;
        mutableState.setValue(bool2);
        if (kotlin.jvm.internal.g0.g(bool, bool2)) {
            mc.a.p(markedWordsActivity, ((u.a) d.a.J(d.a.s(mc.a.f(markedWordsActivity).V("收藏成功，你可以在单词本查看"), "暂不查看", null, 2, null), "立即查看", null, new x00.l() { // from class: com.baicizhan.main.examassistant.o0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 v12;
                    v12 = MarkedWordsActivity.v1(MarkedWordsActivity.this, i11, (View) obj);
                    return v12;
                }
            }, 2, null)).d(), null, 2, null);
            eVar.q(new ij.h() { // from class: com.baicizhan.main.examassistant.p0
                @Override // ij.h
                public final void a(Set set) {
                    MarkedWordsActivity.w1(SnapshotStateList.this, set);
                }
            });
            String[] strArr = {ma.b.f72902e1, ma.b.B0, ma.b.f72905f1, ma.b.f72897d};
            Integer valueOf = Integer.valueOf(i11);
            com.google.gson.d dVar = new com.google.gson.d();
            ArrayList arrayList = new ArrayList(ids.length);
            for (long j11 : ids) {
                arrayList.add(String.valueOf(j11));
            }
            ma.l.b(ma.t.f73011j, ma.a.f72850u4, ma.u.d(strArr, new Object[]{valueOf, dVar.z(arrayList), Integer.valueOf(snapshotStateList.size()), ma.v.f73049t}, false, 4, null));
        }
    }

    public static final yz.g2 v1(MarkedWordsActivity markedWordsActivity, int i11, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        WordFavoriteBooksActivity.a.c(WordFavoriteBooksActivity.f26767c, markedWordsActivity, null, 2, null);
        ma.l.b(ma.t.f73011j, ma.a.f72857v4, ma.u.a(ma.b.f72902e1, Integer.valueOf(i11)));
        return yz.g2.f100423a;
    }

    public static final void w1(SnapshotStateList snapshotStateList, Set it) {
        kotlin.jvm.internal.g0.p(it, "it");
        qb.c.b(q1.f20611a, "updated favorites done: " + it.size(), new Object[0]);
        snapshotStateList.clear();
        snapshotStateList.addAll(it);
    }

    public static final yz.g2 x1(MarkedWordsActivity markedWordsActivity) {
        markedWordsActivity.finish();
        return yz.g2.f100423a;
    }

    public static final yz.g2 y1(SnapshotStateList snapshotStateList, MutableState mutableState, int i11, List it) {
        kotlin.jvm.internal.g0.p(it, "it");
        snapshotStateList.clear();
        snapshotStateList.addAll(it);
        mutableState.setValue(Boolean.TRUE);
        ma.l.b(ma.t.f73011j, ma.a.f72836s4, ma.u.d(new String[]{ma.b.f72902e1, "word_num"}, new Object[]{Integer.valueOf(i11), Integer.valueOf(it.size())}, false, 4, null));
        return yz.g2.f100423a;
    }

    public static final yz.g2 z1(MutableState mutableState, Throwable it) {
        kotlin.jvm.internal.g0.p(it, "it");
        mutableState.setValue(Boolean.TRUE);
        return yz.g2.f100423a;
    }

    public final ij.e0 e1(MarkedWord markedWord) {
        return new ij.e0(markedWord.n(), 0, markedWord.o(), markedWord.l(), null);
    }

    public final IAudioPlayer f1() {
        return (IAudioPlayer) this.f20354c.getValue();
    }

    public final fg.a g1() {
        return (fg.a) this.f20353b.getValue();
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        Integer num;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null) {
            if (kotlin.jvm.internal.g0.g("com.baicizhan.favoritebooks", data.getHost()) && kotlin.jvm.internal.g0.g("/markedlist", data.getPath())) {
                String queryParameter = data.getQueryParameter("paperId");
                num = queryParameter != null ? u30.e0.p1(queryParameter) : null;
            } else {
                num = 0;
            }
            if (num != null) {
                Integer num2 = num.intValue() != 0 ? num : null;
                if (num2 != null) {
                    final int intValue = num2.intValue();
                    hj.p.d(this, new rj.e() { // from class: com.baicizhan.main.examassistant.q0
                        @Override // rj.e
                        public final void a(ij.e eVar) {
                            MarkedWordsActivity.h1(MarkedWordsActivity.this, intValue, eVar);
                        }
                    });
                    return;
                }
            }
        }
        va.g.i("出错啦", 0);
        finish();
    }
}
