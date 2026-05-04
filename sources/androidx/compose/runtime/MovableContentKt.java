package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Pair;
import kotlin.Triple;
import m80.k;
import x00.p;
import x00.q;
import x00.r;
import x00.s;
import x00.t;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MovableContentKt {
    public static final int movableContentKey = 126665345;

    @k
    public static final p<Composer, Integer, g2> movableContentOf(@k final p<? super Composer, ? super Integer, g2> pVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-514040016, true, new q() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Void) obj, (Composer) obj2, ((Number) obj3).intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(Void r32, Composer composer, int i11) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-514040016, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:36)");
                }
                pVar.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-642339857, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$1
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(Composer composer, int i11) {
                if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-642339857, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
                }
                composer.insertMovableContent(MovableContent.this, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @ComposableInferredTarget(scheme = "[0[0]:[_]]")
    @k
    public static final <R> q<R, Composer, Integer, g2> movableContentWithReceiverOf(@k final q<? super R, ? super Composer, ? super Integer, g2> qVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(250838178, true, new q<R, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Composer composer, Integer num) {
                invoke((MovableContentKt$movableContentWithReceiverOf$movableContent$1<R>) obj, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(R r11, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= (i11 & 8) == 0 ? composer.changed(r11) : composer.changedInstance(r11) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(250838178, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:159)");
                }
                qVar.invoke(r11, composer, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(506997506, true, new q<R, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Composer composer, Integer num) {
                invoke((MovableContentKt$movableContentWithReceiverOf$1<R>) obj, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(R r11, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= (i11 & 8) == 0 ? composer.changed(r11) : composer.changedInstance(r11) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(506997506, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:160)");
                }
                composer.insertMovableContent(movableContent, r11);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @k
    public static final <P> q<P, Composer, Integer, g2> movableContentOf(@k q<? super P, ? super Composer, ? super Integer, g2> qVar) {
        final MovableContent movableContent = new MovableContent(qVar);
        return ComposableLambdaKt.composableLambdaInstance(-434707029, true, new q<P, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Composer composer, Integer num) {
                invoke((MovableContentKt$movableContentOf$2<P>) obj, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(P p11, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= (i11 & 8) == 0 ? composer.changed(p11) : composer.changedInstance(p11) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-434707029, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:59)");
                }
                composer.insertMovableContent(movableContent, p11);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @k
    public static final <R, P> r<R, P, Composer, Integer, g2> movableContentWithReceiverOf(@k final r<? super R, ? super P, ? super Composer, ? super Integer, g2> rVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(812082854, true, new q<Pair<? extends R, ? extends P>, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(Pair<? extends R, ? extends P> pair, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= (i11 & 8) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(812082854, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:183)");
                }
                rVar.invoke(pair.getFirst(), pair.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(627354118, true, new r<R, P, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Object obj2, Composer composer, Integer num) {
                invoke((MovableContentKt$movableContentWithReceiverOf$2<P, R>) obj, obj2, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(R r11, P p11, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = ((i11 & 8) == 0 ? composer.changed(r11) : composer.changedInstance(r11) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= (i11 & 64) == 0 ? composer.changed(p11) : composer.changedInstance(p11) ? 32 : 16;
                }
                if (!composer.shouldExecute((i12 & 147) != 146, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(627354118, i12, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:184)");
                }
                composer.insertMovableContent(movableContent, h1.a(r11, p11));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @k
    public static final <P1, P2> r<P1, P2, Composer, Integer, g2> movableContentOf(@k final r<? super P1, ? super P2, ? super Composer, ? super Integer, g2> rVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(1849814513, true, new q<Pair<? extends P1, ? extends P2>, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(Pair<? extends P1, ? extends P2> pair, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= (i11 & 8) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1849814513, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:80)");
                }
                rVar.invoke(pair.getFirst(), pair.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1200019734, true, new r<P1, P2, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Object obj2, Composer composer, Integer num) {
                invoke((MovableContentKt$movableContentOf$3<P1, P2>) obj, obj2, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = ((i11 & 8) == 0 ? composer.changed(p12) : composer.changedInstance(p12) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= (i11 & 64) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 32 : 16;
                }
                if (!composer.shouldExecute((i12 & 147) != 146, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1200019734, i12, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:81)");
                }
                composer.insertMovableContent(movableContent, h1.a(p12, p22));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @k
    public static final <R, P1, P2> s<R, P1, P2, Composer, Integer, g2> movableContentWithReceiverOf(@k final s<? super R, ? super P1, ? super P2, ? super Composer, ? super Integer, g2> sVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(457013028, true, new q<Triple<? extends R, ? extends P1, ? extends P2>, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Composer composer, Integer num) {
                invoke((Triple) obj, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(Triple<? extends R, ? extends P1, ? extends P2> triple, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= (i11 & 8) == 0 ? composer.changed(triple) : composer.changedInstance(triple) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(457013028, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:207)");
                }
                sVar.invoke(triple.getFirst(), triple.getSecond(), triple.getThird(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(583402949, true, new s<R, P1, P2, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.s
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
                invoke((MovableContentKt$movableContentWithReceiverOf$3<P1, P2, R>) obj, obj2, obj3, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(R r11, P1 p12, P2 p22, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = ((i11 & 8) == 0 ? composer.changed(r11) : composer.changedInstance(r11) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= (i11 & 64) == 0 ? composer.changed(p12) : composer.changedInstance(p12) ? 32 : 16;
                }
                if ((i11 & 384) == 0) {
                    i12 |= (i11 & 512) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 256 : 128;
                }
                if (!composer.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(583402949, i12, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:208)");
                }
                composer.insertMovableContent(movableContent, new Triple(r11, p12, p22));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @k
    public static final <P1, P2, P3> s<P1, P2, P3, Composer, Integer, g2> movableContentOf(@k final s<? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, g2> sVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1512228753, true, new q<Triple<? extends P1, ? extends P2, ? extends P3>, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Composer composer, Integer num) {
                invoke((Triple) obj, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(Triple<? extends P1, ? extends P2, ? extends P3> triple, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= (i11 & 8) == 0 ? composer.changed(triple) : composer.changedInstance(triple) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1512228753, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:105)");
                }
                sVar.invoke(triple.getFirst(), triple.getSecond(), triple.getThird(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1083870185, true, new s<P1, P2, P3, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.s
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
                invoke((MovableContentKt$movableContentOf$4<P1, P2, P3>) obj, obj2, obj3, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, P3 p32, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = ((i11 & 8) == 0 ? composer.changed(p12) : composer.changedInstance(p12) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= (i11 & 64) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 32 : 16;
                }
                if ((i11 & 384) == 0) {
                    i12 |= (i11 & 512) == 0 ? composer.changed(p32) : composer.changedInstance(p32) ? 256 : 128;
                }
                if (!composer.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1083870185, i12, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:107)");
                }
                composer.insertMovableContent(movableContent, new Triple(p12, p22, p32));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @k
    public static final <R, P1, P2, P3> t<R, P1, P2, P3, Composer, Integer, g2> movableContentWithReceiverOf(@k final t<? super R, ? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, g2> tVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(226809633, true, new q<Object[], Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Object[] objArr, Composer composer, Integer num) {
                invoke(objArr, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(Object[] objArr, Composer composer, int i11) {
                if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(226809633, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:233)");
                }
                tVar.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(1468683306, true, new t<R, P1, P2, P3, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.t
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
                invoke((MovableContentKt$movableContentWithReceiverOf$4<P1, P2, P3, R>) obj, obj2, obj3, obj4, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(R r11, P1 p12, P2 p22, P3 p32, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = ((i11 & 8) == 0 ? composer.changed(r11) : composer.changedInstance(r11) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= (i11 & 64) == 0 ? composer.changed(p12) : composer.changedInstance(p12) ? 32 : 16;
                }
                if ((i11 & 384) == 0) {
                    i12 |= (i11 & 512) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 256 : 128;
                }
                if ((i11 & 3072) == 0) {
                    i12 |= (i11 & 4096) == 0 ? composer.changed(p32) : composer.changedInstance(p32) ? 2048 : 1024;
                }
                if (!composer.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1468683306, i12, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:237)");
                }
                composer.insertMovableContent(movableContent, new Object[]{r11, p12, p22, p32});
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @k
    public static final <P1, P2, P3, P4> t<P1, P2, P3, P4, Composer, Integer, g2> movableContentOf(@k final t<? super P1, ? super P2, ? super P3, ? super P4, ? super Composer, ? super Integer, g2> tVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1900160788, true, new q<Object[], Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Object[] objArr, Composer composer, Integer num) {
                invoke(objArr, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(Object[] objArr, Composer composer, int i11) {
                if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1900160788, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:133)");
                }
                tVar.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1741877681, true, new t<P1, P2, P3, P4, Composer, Integer, g2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.t
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
                invoke((MovableContentKt$movableContentOf$5<P1, P2, P3, P4>) obj, obj2, obj3, obj4, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, P3 p32, P4 p42, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = ((i11 & 8) == 0 ? composer.changed(p12) : composer.changedInstance(p12) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= (i11 & 64) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 32 : 16;
                }
                if ((i11 & 384) == 0) {
                    i12 |= (i11 & 512) == 0 ? composer.changed(p32) : composer.changedInstance(p32) ? 256 : 128;
                }
                if ((i11 & 3072) == 0) {
                    i12 |= (i11 & 4096) == 0 ? composer.changed(p42) : composer.changedInstance(p42) ? 2048 : 1024;
                }
                if (!composer.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741877681, i12, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:137)");
                }
                composer.insertMovableContent(movableContent, new Object[]{p12, p22, p32, p42});
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }
}
