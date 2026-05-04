package com.baicizhan.main.word_book.list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.base.ComposeBaseActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordBookCreateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookCreateActivity.kt\ncom/baicizhan/main/word_book/list/WordBookCreateActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,430:1\n1247#2,6:431\n1247#2,6:437\n*S KotlinDebug\n*F\n+ 1 WordBookCreateActivity.kt\ncom/baicizhan/main/word_book/list/WordBookCreateActivity\n*L\n112#1:431,6\n113#1:437,6\n*E\n"})
/* loaded from: classes5.dex */
public final class WordBookCreateActivity extends ComposeBaseActivity {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f26739b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f26740c = 8;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f26741d = "device_id";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f26742e = "book_id";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f26743f = "book_name";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f26744g = "book_tags";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Context context, long j11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j11 = 0;
            }
            aVar.a(context, j11);
        }

        public final void a(@m80.k Context context, long j11) {
            kotlin.jvm.internal.g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) WordBookCreateActivity.class);
            intent.putExtra("device_id", j11);
            context.startActivity(intent);
        }

        public final void c(@m80.k Context context, long j11, @m80.k String name, @m80.k int[] tags) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(tags, "tags");
            Intent intent = new Intent(context, (Class<?>) WordBookCreateActivity.class);
            intent.putExtra("book_id", j11);
            intent.putExtra("book_name", name);
            intent.putExtra(WordBookCreateActivity.f26744g, tags);
            context.startActivity(intent);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordBookCreateActivity$onCreate$1$1$2$1$2", f = "WordBookCreateActivity.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordBookCreateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookCreateActivity.kt\ncom/baicizhan/main/word_book/list/WordBookCreateActivity$onCreate$1$1$2$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1563#2:431\n1634#2,3:432\n*S KotlinDebug\n*F\n+ 1 WordBookCreateActivity.kt\ncom/baicizhan/main/word_book/list/WordBookCreateActivity$onCreate$1$1$2$1$2\n*L\n118#1:431\n118#1:432,3\n*E\n"})
    public static final class b extends SuspendLambda implements x00.l<j00.c<? super Result<? extends kj.a>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26745a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ij.q f26746b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f26747c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f26748d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<j3> f26749e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ij.q qVar, long j11, String str, List<j3> list, j00.c<? super b> cVar) {
            super(1, cVar);
            this.f26746b = qVar;
            this.f26747c = j11;
            this.f26748d = str;
            this.f26749e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return new b(this.f26746b, this.f26747c, this.f26748d, this.f26749e, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<kj.a>> cVar) {
            return ((b) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object y11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26745a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.q qVar = this.f26746b;
                long j11 = this.f26747c;
                String str = this.f26748d;
                List<j3> list = this.f26749e;
                ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(l00.a.f(((j3) it.next()).e()));
                }
                this.f26745a = 1;
                y11 = qVar.y(j11, str, arrayList, this);
                if (y11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                y11 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(y11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends kj.a>> cVar) {
            return invoke2((j00.c<? super Result<kj.a>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordBookCreateActivity$onCreate$1$1$2$1$4", f = "WordBookCreateActivity.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordBookCreateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookCreateActivity.kt\ncom/baicizhan/main/word_book/list/WordBookCreateActivity$onCreate$1$1$2$1$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1563#2:431\n1634#2,3:432\n*S KotlinDebug\n*F\n+ 1 WordBookCreateActivity.kt\ncom/baicizhan/main/word_book/list/WordBookCreateActivity$onCreate$1$1$2$1$4\n*L\n130#1:431\n130#1:432,3\n*E\n"})
    public static final class c extends SuspendLambda implements x00.l<j00.c<? super Result<? extends kj.a>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26750a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ij.q f26751b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f26752c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<j3> f26753d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ij.q qVar, String str, List<j3> list, j00.c<? super c> cVar) {
            super(1, cVar);
            this.f26751b = qVar;
            this.f26752c = str;
            this.f26753d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return new c(this.f26751b, this.f26752c, this.f26753d, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<kj.a>> cVar) {
            return ((c) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object b02;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26750a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.q qVar = this.f26751b;
                String str = this.f26752c;
                List<j3> list = this.f26753d;
                ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(l00.a.f(((j3) it.next()).e()));
                }
                this.f26750a = 1;
                b02 = qVar.b0(str, arrayList, this);
                if (b02 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                b02 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(b02);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends kj.a>> cVar) {
            return invoke2((j00.c<? super Result<kj.a>>) cVar);
        }
    }

    public static final void O0(final WordBookCreateActivity wordBookCreateActivity, final String str, final List list, final long j11, final long j12, ij.e controller) {
        kotlin.jvm.internal.g0.p(controller, "controller");
        final ij.q O = controller.O();
        ComponentActivityKt.setContent$default(wordBookCreateActivity, null, ComposableLambdaKt.composableLambdaInstance(1100078874, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.l2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 P0;
                P0 = WordBookCreateActivity.P0(str, list, j11, wordBookCreateActivity, O, j12, (Composer) obj, ((Integer) obj2).intValue());
                return P0;
            }
        }), 1, null);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 P0(String str, List list, final long j11, final WordBookCreateActivity wordBookCreateActivity, final ij.q qVar, final long j12, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1100078874, i11, -1, "com.baicizhan.main.word_book.list.WordBookCreateActivity.onCreate.<anonymous>.<anonymous> (WordBookCreateActivity.kt:107)");
            }
            boolean z11 = j11 != -1;
            boolean changedInstance = composer.changedInstance(wordBookCreateActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.h2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Q0;
                        Q0 = WordBookCreateActivity.Q0(WordBookCreateActivity.this);
                        return Q0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar = (x00.a) rememberedValue;
            boolean changed = composer.changed(j11) | composer.changedInstance(wordBookCreateActivity) | composer.changedInstance(qVar) | composer.changed(j12);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                x00.p pVar = new x00.p() { // from class: com.baicizhan.main.word_book.list.i2
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        yz.g2 R0;
                        R0 = WordBookCreateActivity.R0(j11, wordBookCreateActivity, qVar, j12, (String) obj, (List) obj2);
                        return R0;
                    }
                };
                composer.updateRememberedValue(pVar);
                rememberedValue2 = pVar;
            }
            i3.K(str, list, z11, aVar, (x00.p) rememberedValue2, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 Q0(WordBookCreateActivity wordBookCreateActivity) {
        wordBookCreateActivity.finish();
        return yz.g2.f100423a;
    }

    public static final yz.g2 R0(long j11, final WordBookCreateActivity wordBookCreateActivity, ij.q qVar, final long j12, String name, List tags) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(tags, "tags");
        if (j11 != -1) {
            yg.i2.C(wordBookCreateActivity, false, false, 300L, new x00.l() { // from class: com.baicizhan.main.word_book.list.j2
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 S0;
                    S0 = WordBookCreateActivity.S0(WordBookCreateActivity.this, (kj.a) obj);
                    return S0;
                }
            }, null, new b(qVar, j11, name, tags, null), 19, null);
        } else {
            yg.i2.C(wordBookCreateActivity, false, false, 300L, new x00.l() { // from class: com.baicizhan.main.word_book.list.k2
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 T0;
                    T0 = WordBookCreateActivity.T0(WordBookCreateActivity.this, j12, (kj.a) obj);
                    return T0;
                }
            }, null, new c(qVar, name, tags, null), 19, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 S0(WordBookCreateActivity wordBookCreateActivity, kj.a it) {
        kotlin.jvm.internal.g0.p(it, "it");
        wordBookCreateActivity.finish();
        return yz.g2.f100423a;
    }

    public static final yz.g2 T0(WordBookCreateActivity wordBookCreateActivity, long j11, kj.a it) {
        kotlin.jvm.internal.g0.p(it, "it");
        WordFavoriteAddActivity.f26754c.a(wordBookCreateActivity, it.j(), ki.j.f66587b.a() ? FavoriteAddingMode.DESCRIPTION_AND_CAM : FavoriteAddingMode.DESCRIPTION, j11);
        wordBookCreateActivity.finish();
        return yz.g2.f100423a;
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        String str;
        List<Integer> J;
        int[] intArrayExtra;
        super.onCreate(bundle);
        Intent intent = getIntent();
        final long longExtra = intent != null ? intent.getLongExtra("device_id", 0L) : 0L;
        Intent intent2 = getIntent();
        final long longExtra2 = intent2 != null ? intent2.getLongExtra("book_id", -1L) : -1L;
        Intent intent3 = getIntent();
        if (intent3 == null || (str = intent3.getStringExtra("book_name")) == null) {
            str = "";
        }
        final String str2 = str;
        Intent intent4 = getIntent();
        if (intent4 == null || (intArrayExtra = intent4.getIntArrayExtra(f26744g)) == null || (J = a00.a0.bz(intArrayExtra)) == null) {
            J = a00.h0.J();
        }
        final List<Integer> list = J;
        hj.p.d(this, new rj.e() { // from class: com.baicizhan.main.word_book.list.m2
            @Override // rj.e
            public final void a(ij.e eVar) {
                WordBookCreateActivity.O0(WordBookCreateActivity.this, str2, list, longExtra2, longExtra, eVar);
            }
        });
    }
}
