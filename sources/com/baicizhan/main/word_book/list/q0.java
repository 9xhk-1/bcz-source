package com.baicizhan.main.word_book.list;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWordFavoriteBooksActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoriteBooksActivity.kt\ncom/baicizhan/main/word_book/list/ComposableSingletons$WordFavoriteBooksActivityKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,816:1\n1563#2:817\n1634#2,3:818\n1563#2:827\n1634#2,3:828\n1247#3,6:821\n1247#3,6:831\n*S KotlinDebug\n*F\n+ 1 WordFavoriteBooksActivity.kt\ncom/baicizhan/main/word_book/list/ComposableSingletons$WordFavoriteBooksActivityKt\n*L\n784#1:817\n784#1:818,3\n804#1:827\n804#1:828,3\n792#1:821,6\n812#1:831,6\n*E\n"})
/* loaded from: classes5.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final q0 f27394a = new q0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f27395b = ComposableLambdaKt.composableLambdaInstance(-45757883, false, new x00.p() { // from class: com.baicizhan.main.word_book.list.f0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 x11;
            x11 = q0.x((Composer) obj, ((Integer) obj2).intValue());
            return x11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f27396c = ComposableLambdaKt.composableLambdaInstance(1892190798, false, new x00.p() { // from class: com.baicizhan.main.word_book.list.g0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 q11;
            q11 = q0.q((Composer) obj, ((Integer) obj2).intValue());
            return q11;
        }
    });

    public static final yz.g2 A() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 B() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 C() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 D(long j11) {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 q(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1892190798, i11, -1, "com.baicizhan.main.word_book.list.ComposableSingletons$WordFavoriteBooksActivityKt.lambda$1892190798.<anonymous> (WordFavoriteBooksActivity.kt:800)");
            }
            g10.o oVar = new g10.o(0L, 3);
            ArrayList arrayList = new ArrayList(a00.i0.d0(oVar, 10));
            Iterator<Long> it = oVar.iterator();
            while (it.hasNext()) {
                long nextLong = ((a00.e1) it).nextLong();
                arrayList.add(new kj.a(nextLong, "name" + nextLong, (((int) nextLong) + 1) * 100, "", 0L, null, 32, null));
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.word_book.list.m0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 r11;
                        r11 = q0.r(((Long) obj).longValue());
                        return r11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.l lVar = (x00.l) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.word_book.list.n0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 s11;
                        s11 = q0.s(((Long) obj).longValue());
                        return s11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.l lVar2 = (x00.l) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.word_book.list.o0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 t11;
                        t11 = q0.t();
                        return t11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            x00.a aVar = (x00.a) rememberedValue3;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.word_book.list.p0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 u11;
                        u11 = q0.u();
                        return u11;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            x00.a aVar2 = (x00.a) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.word_book.list.d0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 v11;
                        v11 = q0.v();
                        return v11;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            x00.a aVar3 = (x00.a) rememberedValue5;
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new x00.l() { // from class: com.baicizhan.main.word_book.list.e0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 w11;
                        w11 = q0.w(((Long) obj).longValue());
                        return w11;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            WordFavoriteBooksActivityKt.D(true, 0L, arrayList, 1, 2, lVar, lVar2, aVar, aVar2, aVar3, (x00.l) rememberedValue6, composer, 920349750, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 r(long j11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 s(long j11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 t() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 u() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 v() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 w(long j11) {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 x(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-45757883, i11, -1, "com.baicizhan.main.word_book.list.ComposableSingletons$WordFavoriteBooksActivityKt.lambda$-45757883.<anonymous> (WordFavoriteBooksActivity.kt:780)");
            }
            g10.o oVar = new g10.o(0L, 3);
            ArrayList arrayList = new ArrayList(a00.i0.d0(oVar, 10));
            Iterator<Long> it = oVar.iterator();
            while (it.hasNext()) {
                long nextLong = ((a00.e1) it).nextLong();
                arrayList.add(new kj.a(nextLong, "name" + nextLong, (((int) nextLong) + 1) * 100, "", 0L, null, 32, null));
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.word_book.list.c0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 y11;
                        y11 = q0.y(((Long) obj).longValue());
                        return y11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.l lVar = (x00.l) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.word_book.list.h0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 z11;
                        z11 = q0.z(((Long) obj).longValue());
                        return z11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.l lVar2 = (x00.l) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.word_book.list.i0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 A;
                        A = q0.A();
                        return A;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            x00.a aVar = (x00.a) rememberedValue3;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.word_book.list.j0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 B;
                        B = q0.B();
                        return B;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            x00.a aVar2 = (x00.a) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.word_book.list.k0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 C;
                        C = q0.C();
                        return C;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            x00.a aVar3 = (x00.a) rememberedValue5;
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new x00.l() { // from class: com.baicizhan.main.word_book.list.l0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 D;
                        D = q0.D(((Long) obj).longValue());
                        return D;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            WordFavoriteBooksActivityKt.D(false, -1L, arrayList, 1, 0, lVar, lVar2, aVar, aVar2, aVar3, (x00.l) rememberedValue6, composer, 920349750, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 y(long j11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 z(long j11) {
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> o() {
        return f27395b;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> p() {
        return f27396c;
    }
}
