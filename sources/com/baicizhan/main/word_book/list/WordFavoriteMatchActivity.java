package com.baicizhan.main.word_book.list;

import android.content.Context;
import android.content.Intent;
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
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.wikiv2.lookup.WordWikiActivity;
import com.baicizhan.main.word_book.detail.WordBookDetailActivity;
import com.baicizhan.main.word_book.list.FavoriteMatchingMode;
import com.baicizhan.main.word_book.list.WordFavoriteBooksActivity;
import com.baicizhan.main.word_book.list.WordFavoriteMatchActivity;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.d;
import kc.u;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordFavoriteMatchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoriteMatchActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteMatchActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n1247#2,6:357\n1247#2,6:363\n1247#2,6:369\n1247#2,6:375\n1247#2,6:381\n1247#2,6:387\n1247#2,6:393\n1247#2,6:399\n1247#2,6:405\n1247#2,6:411\n1247#2,6:417\n1247#2,6:423\n1247#2,6:429\n1247#2,6:435\n1247#2,6:449\n1247#2,6:455\n1247#2,6:461\n1563#3:441\n1634#3,3:442\n1563#3:445\n1634#3,3:446\n*S KotlinDebug\n*F\n+ 1 WordFavoriteMatchActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteMatchActivity\n*L\n101#1:357,6\n102#1:363,6\n103#1:369,6\n104#1:375,6\n105#1:381,6\n106#1:387,6\n107#1:393,6\n122#1:399,6\n129#1:405,6\n145#1:411,6\n148#1:417,6\n162#1:423,6\n208#1:429,6\n213#1:435,6\n240#1:449,6\n225#1:455,6\n242#1:461,6\n133#1:441\n133#1:442,3\n171#1:445\n171#1:446,3\n*E\n"})
/* loaded from: classes5.dex */
public final class WordFavoriteMatchActivity extends ComposeBaseActivity {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f26824c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f26825d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final long f26826e = 1048576;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f26827f = "matching_mode";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f26828g = "device_id";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f26829b = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.word_book.list.g8
        @Override // x00.a
        public final Object invoke() {
            q9.l G1;
            G1 = WordFavoriteMatchActivity.G1(WordFavoriteMatchActivity.this);
            return G1;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, FavoriteMatchingMode favoriteMatchingMode, long j11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                j11 = 0;
            }
            return aVar.a(context, favoriteMatchingMode, j11);
        }

        @m80.k
        public final Intent a(@m80.k Context context, @m80.k FavoriteMatchingMode mode, long j11) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(mode, "mode");
            Intent intent = new Intent(context, (Class<?>) WordFavoriteMatchActivity.class);
            intent.putExtra(WordFavoriteMatchActivity.f26827f, mode);
            intent.putExtra("device_id", j11);
            return intent;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteMatchActivity$onCreate$1$1$1$1", f = "WordFavoriteMatchActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26830a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f26832c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f26833a;

            static {
                int[] iArr = new int[IAudioPlayer.State.values().length];
                try {
                    iArr[IAudioPlayer.State.Completed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IAudioPlayer.State.Paused.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IAudioPlayer.State.Stopped.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f26833a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MutableState<Integer> mutableState, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f26832c = mutableState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(MutableState mutableState, IAudioPlayer.State state) {
            int i11 = state == null ? -1 : a.f26833a[state.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                mutableState.setValue(-1);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return WordFavoriteMatchActivity.this.new b(this.f26832c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26830a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            IAudioPlayer h12 = WordFavoriteMatchActivity.this.h1();
            final MutableState<Integer> mutableState = this.f26832c;
            h12.f(new IAudioPlayer.b() { // from class: com.baicizhan.main.word_book.list.d9
                @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
                public final void onPlayStateChanged(IAudioPlayer.State state) {
                    WordFavoriteMatchActivity.b.j(MutableState.this, state);
                }
            });
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteMatchActivity$onCreate$1$1$2$1$4", f = "WordFavoriteMatchActivity.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.l<j00.c<? super Result<? extends Boolean>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26834a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2 f26835b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ij.e f26836c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ FavoriteMatchingMode f26837d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<ij.c0> f26838e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d2 d2Var, ij.e eVar, FavoriteMatchingMode favoriteMatchingMode, SnapshotStateList<ij.c0> snapshotStateList, j00.c<? super c> cVar) {
            super(1, cVar);
            this.f26835b = d2Var;
            this.f26836c = eVar;
            this.f26837d = favoriteMatchingMode;
            this.f26838e = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return new c(this.f26835b, this.f26836c, this.f26837d, this.f26838e, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<Boolean>> cVar) {
            return ((c) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m02;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26834a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ma.l.b(ma.t.f73012k, ma.a.f72794m4, ma.u.a("match_category", this.f26835b.e().getSelectorLabel()));
                ij.q O = this.f26836c.O();
                long a11 = this.f26837d.a();
                SnapshotStateList<ij.c0> snapshotStateList = this.f26838e;
                this.f26834a = 1;
                m02 = O.m0(a11, snapshotStateList, this);
                if (m02 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                m02 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(m02);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends Boolean>> cVar) {
            return invoke2((j00.c<? super Result<Boolean>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteMatchActivity$onCreate$1$1$meaningSelectorState$2$1$2", f = "WordFavoriteMatchActivity.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.l<j00.c<? super Result<? extends List<? extends ij.c0>>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26839a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ij.e f26840b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MeaningType f26841c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f26842d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ij.e eVar, MeaningType meaningType, List<Integer> list, j00.c<? super d> cVar) {
            super(1, cVar);
            this.f26840b = eVar;
            this.f26841c = meaningType;
            this.f26842d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return new d(this.f26840b, this.f26841c, this.f26842d, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<? extends List<ij.c0>>> cVar) {
            return ((d) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object I;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26839a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.q O = this.f26840b.O();
                int cate = this.f26841c.getCate();
                List<Integer> list = this.f26842d;
                this.f26839a = 1;
                I = O.I(cate, list, this);
                if (I == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                I = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(I);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends List<? extends ij.c0>>> cVar) {
            return invoke2((j00.c<? super Result<? extends List<ij.c0>>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteMatchActivity$onCreate$1$4", f = "WordFavoriteMatchActivity.kt", i = {}, l = {264, 267, 267, 270, 270}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.l<j00.c<? super Result<? extends List<? extends ij.c0>>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26843a;

        /* renamed from: b, reason: collision with root package name */
        public int f26844b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FavoriteMatchingMode f26845c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ij.e f26846d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ WordFavoriteMatchActivity f26847e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FavoriteMatchingMode favoriteMatchingMode, ij.e eVar, WordFavoriteMatchActivity wordFavoriteMatchActivity, j00.c<? super e> cVar) {
            super(1, cVar);
            this.f26845c = favoriteMatchingMode;
            this.f26846d = eVar;
            this.f26847e = wordFavoriteMatchActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return new e(this.f26845c, this.f26846d, this.f26847e, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<? extends List<ij.c0>>> cVar) {
            return ((e) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00b5, code lost:
        
            if (r10 == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
        
            if (r10 == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        
            if (r10 == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        
            if (r10 == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
        
            if (r10 == r0) goto L35;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f26844b
                r2 = 0
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L3d
                if (r1 == r7) goto L32
                if (r1 == r6) goto L2a
                if (r1 == r5) goto L32
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                goto L32
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.f26843a
                ij.q r1 = (ij.q) r1
                kotlin.e.n(r10)
                goto Lab
            L2a:
                java.lang.Object r1 = r9.f26843a
                ij.q r1 = (ij.q) r1
                kotlin.e.n(r10)
                goto L7f
            L32:
                kotlin.e.n(r10)
                kotlin.Result r10 = (kotlin.Result) r10
                java.lang.Object r10 = r10.m6317unboximpl()
                goto Lb8
            L3d:
                kotlin.e.n(r10)
                com.baicizhan.main.word_book.list.FavoriteMatchingMode r10 = r9.f26845c
                boolean r1 = r10 instanceof com.baicizhan.main.word_book.list.FavoriteMatchingMode.Description
                if (r1 == 0) goto L5d
                ij.e r10 = r9.f26846d
                ij.q r10 = r10.O()
                com.baicizhan.main.word_book.list.FavoriteMatchingMode r1 = r9.f26845c
                com.baicizhan.main.word_book.list.FavoriteMatchingMode$Description r1 = (com.baicizhan.main.word_book.list.FavoriteMatchingMode.Description) r1
                java.lang.String r1 = r1.b()
                r9.f26844b = r7
                java.lang.Object r10 = r10.a0(r1, r9)
                if (r10 != r0) goto Lb8
                goto Lb7
            L5d:
                boolean r1 = r10 instanceof com.baicizhan.main.word_book.list.FavoriteMatchingMode.Bytes
                r7 = 1048576(0x100000, double:5.180654E-318)
                if (r1 == 0) goto L8c
                ij.e r10 = r9.f26846d
                ij.q r1 = r10.O()
                com.baicizhan.main.word_book.list.FavoriteMatchingMode r10 = r9.f26845c
                com.baicizhan.main.word_book.list.FavoriteMatchingMode$Bytes r10 = (com.baicizhan.main.word_book.list.FavoriteMatchingMode.Bytes) r10
                android.net.Uri r10 = r10.b()
                com.baicizhan.main.word_book.list.WordFavoriteMatchActivity r3 = r9.f26847e
                r9.f26843a = r1
                r9.f26844b = r6
                java.lang.Object r10 = com.baicizhan.main.word_book.list.b6.d2(r10, r3, r7, r9)
                if (r10 != r0) goto L7f
                goto Lb7
            L7f:
                byte[] r10 = (byte[]) r10
                r9.f26843a = r2
                r9.f26844b = r5
                java.lang.Object r10 = r1.V(r10, r9)
                if (r10 != r0) goto Lb8
                goto Lb7
            L8c:
                boolean r10 = r10 instanceof com.baicizhan.main.word_book.list.FavoriteMatchingMode.BytesByOcr
                if (r10 == 0) goto Lbd
                ij.e r10 = r9.f26846d
                ij.q r1 = r10.O()
                com.baicizhan.main.word_book.list.FavoriteMatchingMode r10 = r9.f26845c
                com.baicizhan.main.word_book.list.FavoriteMatchingMode$BytesByOcr r10 = (com.baicizhan.main.word_book.list.FavoriteMatchingMode.BytesByOcr) r10
                android.net.Uri r10 = r10.b()
                com.baicizhan.main.word_book.list.WordFavoriteMatchActivity r5 = r9.f26847e
                r9.f26843a = r1
                r9.f26844b = r4
                java.lang.Object r10 = com.baicizhan.main.word_book.list.b6.d2(r10, r5, r7, r9)
                if (r10 != r0) goto Lab
                goto Lb7
            Lab:
                byte[] r10 = (byte[]) r10
                r9.f26843a = r2
                r9.f26844b = r3
                java.lang.Object r10 = r1.A(r10, r9)
                if (r10 != r0) goto Lb8
            Lb7:
                return r0
            Lb8:
                kotlin.Result r10 = kotlin.Result.m6307boximpl(r10)
                return r10
            Lbd:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.WordFavoriteMatchActivity.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends List<? extends ij.c0>>> cVar) {
            return invoke2((j00.c<? super Result<? extends List<ij.c0>>>) cVar);
        }
    }

    public static final yz.g2 A1(MutableState mutableState, WordFavoriteMatchActivity wordFavoriteMatchActivity, MutableState mutableState2) {
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            i9.f.j(wordFavoriteMatchActivity, i9.f.C, true);
            mutableState.setValue(Boolean.FALSE);
        }
        mutableState2.setValue(Boolean.TRUE);
        return yz.g2.f100423a;
    }

    public static final yz.g2 B1(MutableState mutableState, MutableState mutableState2, final SnapshotStateList snapshotStateList, WordFavoriteMatchActivity wordFavoriteMatchActivity, ij.e eVar, MeaningType type) {
        kotlin.jvm.internal.g0.p(type, "type");
        mutableState.setValue(type);
        mutableState2.setValue(Boolean.FALSE);
        qb.c.b(j9.f27246a, "Meaning type selected: " + type.getLabel(), new Object[0]);
        ArrayList arrayList = new ArrayList(a00.i0.d0(snapshotStateList, 10));
        Iterator<T> it = snapshotStateList.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ij.c0) it.next()).o()));
        }
        if (!arrayList.isEmpty()) {
            yg.i2.C(wordFavoriteMatchActivity, false, false, 0L, new x00.l() { // from class: com.baicizhan.main.word_book.list.l8
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 C1;
                    C1 = WordFavoriteMatchActivity.C1(SnapshotStateList.this, (List) obj);
                    return C1;
                }
            }, null, new d(eVar, type, arrayList, null), 23, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 C1(SnapshotStateList snapshotStateList, List result) {
        kotlin.jvm.internal.g0.p(result, "result");
        snapshotStateList.clear();
        snapshotStateList.addAll(result);
        return yz.g2.f100423a;
    }

    public static final yz.g2 D1(MutableState mutableState) {
        mutableState.setValue(Boolean.FALSE);
        return yz.g2.f100423a;
    }

    public static final yz.g2 E1(SnapshotStateList snapshotStateList, MutableState mutableState, FavoriteMatchingMode favoriteMatchingMode, List it) {
        kotlin.jvm.internal.g0.p(it, "it");
        snapshotStateList.clear();
        snapshotStateList.addAll(it);
        mutableState.setValue(Boolean.TRUE);
        if (favoriteMatchingMode instanceof FavoriteMatchingMode.BytesByOcr) {
            ma.l.b(ma.t.D, ma.a.f72780k4, ma.u.a("recognize_num", Integer.valueOf(it.size())));
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 F1(MutableState mutableState, Throwable it) {
        kotlin.jvm.internal.g0.p(it, "it");
        mutableState.setValue(Boolean.TRUE);
        return yz.g2.f100423a;
    }

    public static final q9.l G1(WordFavoriteMatchActivity wordFavoriteMatchActivity) {
        return new q9.l(wordFavoriteMatchActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IAudioPlayer h1() {
        return (IAudioPlayer) this.f26829b.getValue();
    }

    public static final void i1(WordFavoriteMatchActivity wordFavoriteMatchActivity, boolean z11) {
        wordFavoriteMatchActivity.setResult(z11 ? -1 : 0);
        wordFavoriteMatchActivity.finish();
    }

    public static final void j1(final WordFavoriteMatchActivity wordFavoriteMatchActivity, final FavoriteMatchingMode favoriteMatchingMode, final long j11, final ij.e controller) {
        kotlin.jvm.internal.g0.p(controller, "controller");
        final MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        final SnapshotStateList mutableStateListOf = SnapshotStateKt.mutableStateListOf();
        final hj.m mVar = new hj.m(wordFavoriteMatchActivity, null, controller);
        final boolean z11 = !i9.f.c(wordFavoriteMatchActivity, i9.f.B) && (favoriteMatchingMode instanceof FavoriteMatchingMode.BytesByOcr);
        final boolean z12 = !i9.f.c(wordFavoriteMatchActivity, i9.f.C);
        ComponentActivityKt.setContent$default(wordFavoriteMatchActivity, null, ComposableLambdaKt.composableLambdaInstance(-857373184, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.o8
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 k12;
                k12 = WordFavoriteMatchActivity.k1(WordFavoriteMatchActivity.this, favoriteMatchingMode, mutableStateListOf, controller, mutableStateOf$default, z11, mVar, j11, z12, (Composer) obj, ((Integer) obj2).intValue());
                return k12;
            }
        }), 1, null);
        yg.i2.G(wordFavoriteMatchActivity, false, false, 300L, new x00.l() { // from class: com.baicizhan.main.word_book.list.p8
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 E1;
                E1 = WordFavoriteMatchActivity.E1(SnapshotStateList.this, mutableStateOf$default, favoriteMatchingMode, (List) obj);
                return E1;
            }
        }, new x00.l() { // from class: com.baicizhan.main.word_book.list.q8
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 F1;
                F1 = WordFavoriteMatchActivity.F1(MutableState.this, (Throwable) obj);
                return F1;
            }
        }, new e(favoriteMatchingMode, controller, wordFavoriteMatchActivity, null), 3, null);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 k1(WordFavoriteMatchActivity wordFavoriteMatchActivity, final FavoriteMatchingMode favoriteMatchingMode, SnapshotStateList snapshotStateList, final ij.e eVar, MutableState mutableState, final boolean z11, final hj.m mVar, final long j11, boolean z12, Composer composer, int i11) {
        final MutableState mutableState2;
        Object obj;
        boolean z13;
        final SnapshotStateList snapshotStateList2;
        int i12;
        MutableState mutableState3;
        int i13;
        d2 d2Var;
        final SnapshotStateList snapshotStateList3;
        final WordFavoriteMatchActivity wordFavoriteMatchActivity2 = wordFavoriteMatchActivity;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857373184, i11, -1, "com.baicizhan.main.word_book.list.WordFavoriteMatchActivity.onCreate.<anonymous>.<anonymous> (WordFavoriteMatchActivity.kt:100)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z11), null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState5 = (MutableState) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState6 = (MutableState) rememberedValue3;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MeaningType.GENERAL, null, 2, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState7 = (MutableState) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState8 = (MutableState) rememberedValue5;
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z12), null, 2, null);
                composer.updateRememberedValue(rememberedValue6);
            }
            final MutableState mutableState9 = (MutableState) rememberedValue6;
            boolean changedInstance = composer.changedInstance(wordFavoriteMatchActivity2);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance || rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = wordFavoriteMatchActivity2.new b(mutableState6, null);
                composer.updateRememberedValue(rememberedValue7);
            }
            EffectsKt.LaunchedEffect(mutableState6, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue7, composer, 6);
            final MutableState mutableState10 = mutableState5;
            final boolean z14 = favoriteMatchingMode instanceof FavoriteMatchingMode.BytesByOcr;
            boolean z15 = favoriteMatchingMode.a() != -1;
            MeaningType meaningType = (MeaningType) mutableState7.getValue();
            boolean booleanValue = ((Boolean) mutableState9.getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) mutableState8.getValue()).booleanValue();
            boolean changedInstance2 = composer.changedInstance(wordFavoriteMatchActivity2);
            Object rememberedValue8 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new x00.a() { // from class: com.baicizhan.main.word_book.list.w8
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 A1;
                        A1 = WordFavoriteMatchActivity.A1(MutableState.this, wordFavoriteMatchActivity2, mutableState8);
                        return A1;
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            x00.a aVar = (x00.a) rememberedValue8;
            boolean changed = composer.changed(snapshotStateList) | composer.changedInstance(wordFavoriteMatchActivity2) | composer.changedInstance(eVar);
            Object rememberedValue9 = composer.rememberedValue();
            if (changed || rememberedValue9 == companion.getEmpty()) {
                mutableState2 = mutableState8;
                z13 = z15;
                snapshotStateList2 = snapshotStateList;
                i12 = 6;
                obj = new x00.l() { // from class: com.baicizhan.main.word_book.list.x8
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 B1;
                        B1 = WordFavoriteMatchActivity.B1(MutableState.this, mutableState2, snapshotStateList2, wordFavoriteMatchActivity2, eVar, (MeaningType) obj2);
                        return B1;
                    }
                };
                composer.updateRememberedValue(obj);
            } else {
                mutableState2 = mutableState8;
                obj = rememberedValue9;
                z13 = z15;
                snapshotStateList2 = snapshotStateList;
                i12 = 6;
            }
            x00.l lVar = (x00.l) obj;
            Object rememberedValue10 = composer.rememberedValue();
            if (rememberedValue10 == companion.getEmpty()) {
                rememberedValue10 = new x00.a() { // from class: com.baicizhan.main.word_book.list.y8
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 D1;
                        D1 = WordFavoriteMatchActivity.D1(MutableState.this);
                        return D1;
                    }
                };
                composer.updateRememberedValue(rememberedValue10);
            }
            x00.a aVar2 = (x00.a) rememberedValue10;
            boolean changedInstance3 = composer.changedInstance(wordFavoriteMatchActivity2);
            Object rememberedValue11 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue11 == companion.getEmpty()) {
                rememberedValue11 = new x00.a() { // from class: com.baicizhan.main.word_book.list.z8
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 l12;
                        l12 = WordFavoriteMatchActivity.l1(WordFavoriteMatchActivity.this, mutableState9);
                        return l12;
                    }
                };
                composer.updateRememberedValue(rememberedValue11);
            }
            final d2 d2Var2 = new d2(meaningType, booleanValue, booleanValue2, aVar, lVar, aVar2, (x00.a) rememberedValue11);
            boolean booleanValue3 = ((Boolean) mutableState.getValue()).booleanValue();
            String stringResource = StringResources_androidKt.stringResource(z14 ? R.string.word_favorites_match_title_ocr : R.string.word_favorites_match_title, composer, 0);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.word_favorites_match_label, new Object[]{Integer.valueOf(snapshotStateList2.size())}, composer, i12);
            String stringResource3 = StringResources_androidKt.stringResource(z14 ? R.string.word_favorites_match_result_empty_ocr : R.string.word_favorites_match_result_empty, composer, 0);
            String stringResource4 = StringResources_androidKt.stringResource(!z13 ? R.string.word_favorites_match_collect_button : R.string.word_favorites_match_add_button, composer, 0);
            boolean booleanValue4 = ((Boolean) mutableState4.getValue()).booleanValue();
            boolean changed2 = composer.changed(z11) | composer.changedInstance(wordFavoriteMatchActivity2) | composer.changed(z13) | composer.changed(d2Var2) | composer.changedInstance(mVar) | composer.changed(snapshotStateList2) | composer.changed(z14) | composer.changed(favoriteMatchingMode) | composer.changed(j11) | composer.changedInstance(eVar);
            Object rememberedValue12 = composer.rememberedValue();
            if (changed2 || rememberedValue12 == companion.getEmpty()) {
                final SnapshotStateList snapshotStateList4 = snapshotStateList2;
                mutableState3 = mutableState6;
                final boolean z16 = z13;
                i13 = 6;
                Object obj2 = new x00.a() { // from class: com.baicizhan.main.word_book.list.a9
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 m12;
                        m12 = WordFavoriteMatchActivity.m1(z11, wordFavoriteMatchActivity2, mutableState10, z16, mutableState4, d2Var2, mVar, snapshotStateList4, z14, favoriteMatchingMode, j11, eVar);
                        return m12;
                    }
                };
                wordFavoriteMatchActivity2 = wordFavoriteMatchActivity2;
                mutableState10 = mutableState10;
                d2Var = d2Var2;
                snapshotStateList3 = snapshotStateList4;
                composer.updateRememberedValue(obj2);
                rememberedValue12 = obj2;
            } else {
                d2Var = d2Var2;
                snapshotStateList3 = snapshotStateList2;
                mutableState3 = mutableState6;
                i13 = 6;
            }
            x00.a aVar3 = (x00.a) rememberedValue12;
            boolean changedInstance4 = composer.changedInstance(wordFavoriteMatchActivity2);
            Object rememberedValue13 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue13 == companion.getEmpty()) {
                rememberedValue13 = new x00.a() { // from class: com.baicizhan.main.word_book.list.b9
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 q12;
                        q12 = WordFavoriteMatchActivity.q1(WordFavoriteMatchActivity.this);
                        return q12;
                    }
                };
                composer.updateRememberedValue(rememberedValue13);
            }
            Pair pair = new Pair(aVar3, (x00.a) rememberedValue13);
            boolean booleanValue5 = ((Boolean) mutableState10.getValue()).booleanValue();
            String stringResource5 = StringResources_androidKt.stringResource(R.string.ocr_export_pdf_tip, composer, i13);
            boolean changedInstance5 = composer.changedInstance(wordFavoriteMatchActivity2);
            Object rememberedValue14 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue14 == companion.getEmpty()) {
                rememberedValue14 = new x00.a() { // from class: com.baicizhan.main.word_book.list.c9
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 r12;
                        r12 = WordFavoriteMatchActivity.r1(WordFavoriteMatchActivity.this);
                        return r12;
                    }
                };
                composer.updateRememberedValue(rememberedValue14);
            }
            Pair pair2 = new Pair(stringResource5, (x00.a) rememberedValue14);
            composer.startReplaceGroup(173327677);
            composer.endReplaceGroup();
            final MutableState mutableState11 = mutableState3;
            FavoritesIntentWidgetsKt.z(booleanValue3, stringResource, stringResource2, stringResource3, stringResource4, booleanValue4, snapshotStateList3, booleanValue5, pair2, pair, d2Var, null, ComposableLambdaKt.rememberComposableLambda(1763227840, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.h8
                @Override // x00.q
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    yz.g2 t12;
                    t12 = WordFavoriteMatchActivity.t1(MutableState.this, snapshotStateList3, wordFavoriteMatchActivity2, (ij.c0) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                    return t12;
                }
            }, composer, 54), composer, 0, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 l1(WordFavoriteMatchActivity wordFavoriteMatchActivity, MutableState mutableState) {
        i9.f.j(wordFavoriteMatchActivity, i9.f.C, true);
        mutableState.setValue(Boolean.FALSE);
        return yz.g2.f100423a;
    }

    public static final yz.g2 m1(boolean z11, final WordFavoriteMatchActivity wordFavoriteMatchActivity, MutableState mutableState, boolean z12, final MutableState mutableState2, d2 d2Var, hj.m mVar, final SnapshotStateList snapshotStateList, final boolean z13, final FavoriteMatchingMode favoriteMatchingMode, final long j11, ij.e eVar) {
        if (z11) {
            i9.f.j(wordFavoriteMatchActivity, i9.f.B, true);
            mutableState.setValue(Boolean.FALSE);
        }
        if (z12) {
            yg.i2.C(wordFavoriteMatchActivity, false, false, 300L, new x00.l() { // from class: com.baicizhan.main.word_book.list.v8
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 p12;
                    p12 = WordFavoriteMatchActivity.p1(WordFavoriteMatchActivity.this, favoriteMatchingMode, j11, ((Boolean) obj).booleanValue());
                    return p12;
                }
            }, null, new c(d2Var, eVar, favoriteMatchingMode, snapshotStateList, null), 19, null);
        } else {
            qb.c.b(j9.f27246a, "No fav book id specified!", new Object[0]);
            mutableState2.setValue(Boolean.FALSE);
            ma.l.b(ma.t.f73012k, ma.a.f72794m4, ma.u.a("match_category", d2Var.e().getSelectorLabel()));
            ArrayList arrayList = new ArrayList(a00.i0.d0(snapshotStateList, 10));
            Iterator<T> it = snapshotStateList.iterator();
            while (it.hasNext()) {
                arrayList.add(wordFavoriteMatchActivity.g1((ij.c0) it.next()));
            }
            mVar.m(arrayList, new hj.o() { // from class: com.baicizhan.main.word_book.list.r8
                @Override // hj.o
                public final void a(Boolean bool, long[] jArr) {
                    WordFavoriteMatchActivity.n1(MutableState.this, wordFavoriteMatchActivity, z13, snapshotStateList, bool, jArr);
                }
            });
        }
        return yz.g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [kc.d, kc.h] */
    public static final void n1(MutableState mutableState, final WordFavoriteMatchActivity wordFavoriteMatchActivity, boolean z11, SnapshotStateList snapshotStateList, Boolean bool, long[] books) {
        kotlin.jvm.internal.g0.p(books, "books");
        Boolean bool2 = Boolean.TRUE;
        mutableState.setValue(bool2);
        if (kotlin.jvm.internal.g0.g(bool, bool2)) {
            mc.a.p(wordFavoriteMatchActivity, ((u.a) d.a.J(d.a.s(mc.a.f(wordFavoriteMatchActivity).V("已加入单词本！\n单词本已支持导出PDF喔"), "暂不查看", null, 2, null), "立即查看", null, new x00.l() { // from class: com.baicizhan.main.word_book.list.n8
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 o12;
                    o12 = WordFavoriteMatchActivity.o1(WordFavoriteMatchActivity.this, (View) obj);
                    return o12;
                }
            }, 2, null)).d(), null, 2, null);
            if (z11) {
                ma.l.b(ma.t.D, ma.a.f72787l4, ma.u.d(new String[]{"collect_word_cnt", "word_book_id_list"}, new Object[]{Integer.valueOf(snapshotStateList.size()), BczJson.toJson(books)}, false, 4, null));
            }
        }
    }

    public static final yz.g2 o1(WordFavoriteMatchActivity wordFavoriteMatchActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        WordFavoriteBooksActivity.a.c(WordFavoriteBooksActivity.f26767c, wordFavoriteMatchActivity, null, 2, null);
        i1(wordFavoriteMatchActivity, true);
        return yz.g2.f100423a;
    }

    public static final yz.g2 p1(WordFavoriteMatchActivity wordFavoriteMatchActivity, FavoriteMatchingMode favoriteMatchingMode, long j11, boolean z11) {
        WordBookDetailActivity.f26698n.c(wordFavoriteMatchActivity, favoriteMatchingMode.a(), j11);
        i1(wordFavoriteMatchActivity, z11);
        return yz.g2.f100423a;
    }

    public static final yz.g2 q1(WordFavoriteMatchActivity wordFavoriteMatchActivity) {
        i1(wordFavoriteMatchActivity, false);
        return yz.g2.f100423a;
    }

    public static final yz.g2 r1(WordFavoriteMatchActivity wordFavoriteMatchActivity) {
        i9.f.j(wordFavoriteMatchActivity, i9.f.B, true);
        return yz.g2.f100423a;
    }

    public static final yz.g2 s1(WordFavoriteMatchActivity wordFavoriteMatchActivity, MutableState mutableState) {
        i9.f.j(wordFavoriteMatchActivity, i9.f.C, false);
        mutableState.setValue(Boolean.TRUE);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 t1(final MutableState mutableState, final SnapshotStateList snapshotStateList, final WordFavoriteMatchActivity wordFavoriteMatchActivity, final ij.c0 item, Composer composer, int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(item, "item");
        if ((i11 & 6) == 0) {
            i12 = i11 | (composer.changed(item) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1763227840, i12, -1, "com.baicizhan.main.word_book.list.WordFavoriteMatchActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WordFavoriteMatchActivity.kt:223)");
            }
            boolean z11 = ((Number) mutableState.getValue()).intValue() == item.o();
            int i13 = i12 & 14;
            boolean changed = composer.changed(snapshotStateList) | (i13 == 4);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.s8
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 u12;
                        u12 = WordFavoriteMatchActivity.u1(SnapshotStateList.this, item);
                        return u12;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar = (x00.a) rememberedValue;
            boolean changedInstance = (i13 == 4) | composer.changedInstance(wordFavoriteMatchActivity);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.word_book.list.t8
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 v12;
                        v12 = WordFavoriteMatchActivity.v1(MutableState.this, item, wordFavoriteMatchActivity);
                        return v12;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.a aVar2 = (x00.a) rememberedValue2;
            boolean changedInstance2 = composer.changedInstance(wordFavoriteMatchActivity) | (i13 == 4);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.word_book.list.u8
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 z12;
                        z12 = WordFavoriteMatchActivity.z1(WordFavoriteMatchActivity.this, item);
                        return z12;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            j9.f(item, z11, aVar, aVar2, (x00.a) rememberedValue3, composer, i13, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 u1(SnapshotStateList snapshotStateList, ij.c0 c0Var) {
        snapshotStateList.remove(c0Var);
        return yz.g2.f100423a;
    }

    public static final yz.g2 v1(final MutableState mutableState, final ij.c0 c0Var, final WordFavoriteMatchActivity wordFavoriteMatchActivity) {
        if (((Number) mutableState.getValue()).intValue() == c0Var.o()) {
            wordFavoriteMatchActivity.h1().stop();
            mutableState.setValue(0);
            return yz.g2.f100423a;
        }
        rx.c<File> I3 = m9.d.d().e(c0Var.k()).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.word_book.list.i8
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 w12;
                w12 = WordFavoriteMatchActivity.w1(WordFavoriteMatchActivity.this, mutableState, c0Var, (File) obj);
                return w12;
            }
        };
        I3.u5(new wb0.b() { // from class: com.baicizhan.main.word_book.list.j8
            @Override // wb0.b
            public final void call(Object obj) {
                WordFavoriteMatchActivity.x1(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.main.word_book.list.k8
            @Override // wb0.b
            public final void call(Object obj) {
                WordFavoriteMatchActivity.y1((Throwable) obj);
            }
        });
        return yz.g2.f100423a;
    }

    public static final yz.g2 w1(WordFavoriteMatchActivity wordFavoriteMatchActivity, MutableState mutableState, ij.c0 c0Var, File file) {
        wordFavoriteMatchActivity.h1().e(file);
        mutableState.setValue(Integer.valueOf(c0Var.o()));
        return yz.g2.f100423a;
    }

    public static final void x1(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void y1(Throwable th2) {
        qb.c.d(j9.f27246a, "play audio error:" + th2.getMessage(), new Object[0]);
        KotlinExtKt.showToast(KotlinExtKt.getToStr(R.string.word_book_voice_no_file));
    }

    public static final yz.g2 z1(WordFavoriteMatchActivity wordFavoriteMatchActivity, ij.c0 c0Var) {
        WordWikiActivity.a.d(WordWikiActivity.f25556b, wordFavoriteMatchActivity, c0Var.o(), 0, null, 12, null);
        return yz.g2.f100423a;
    }

    public final ij.e0 g1(ij.c0 c0Var) {
        return new ij.e0(c0Var.o(), c0Var.l(), c0Var.p(), c0Var.n(), c0Var.j());
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        final FavoriteMatchingMode favoriteMatchingMode = (FavoriteMatchingMode) getIntent().getParcelableExtra(f26827f);
        if (favoriteMatchingMode == null) {
            throw new RuntimeException("No mode specified!");
        }
        Intent intent = getIntent();
        final long longExtra = intent != null ? intent.getLongExtra("device_id", 0L) : 0L;
        hj.p.d(this, new rj.e() { // from class: com.baicizhan.main.word_book.list.m8
            @Override // rj.e
            public final void a(ij.e eVar) {
                WordFavoriteMatchActivity.j1(WordFavoriteMatchActivity.this, favoriteMatchingMode, longExtra, eVar);
            }
        });
    }
}
