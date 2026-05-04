package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.DeprecationLevel;
import m80.k;
import m80.l;
import x00.q;
import x00.r;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LazyScopeMarker
/* loaded from: classes.dex */
public interface LazyListScope {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static void item(@k LazyListScope lazyListScope, @l Object obj, @l Object obj2, @k q<? super LazyItemScope, ? super Composer, ? super Integer, g2> qVar) {
            LazyListScope.super.item(obj, obj2, qVar);
        }

        @Deprecated
        public static void items(@k LazyListScope lazyListScope, int i11, @l x00.l<? super Integer, ? extends Object> lVar, @k x00.l<? super Integer, ? extends Object> lVar2, @k r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar) {
            LazyListScope.super.items(i11, lVar, lVar2, rVar);
        }

        @Deprecated
        public static void stickyHeader(@k LazyListScope lazyListScope, @l Object obj, @l Object obj2, @k r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar) {
            LazyListScope.super.stickyHeader(obj, obj2, rVar);
        }
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, q qVar, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i11, x00.l lVar, x00.l lVar2, r rVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i12 & 2) != 0) {
            lVar = null;
        }
        if ((i12 & 4) != 0) {
            lVar2 = new x00.l() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
                public final Void invoke(int i13) {
                    return null;
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyListScope.items(i11, lVar, lVar2, rVar);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, q qVar, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, qVar);
    }

    default void item(@l Object obj, @l Object obj2, @k q<? super LazyItemScope, ? super Composer, ? super Integer, g2> qVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void items(int i11, @l x00.l<? super Integer, ? extends Object> lVar, @k x00.l<? super Integer, ? extends Object> lVar2, @k r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Please use the overload with indexing capabilities.", replaceWith = @w0(expression = "stickyHeader(key, contentType, { _ -> content() })", imports = {}))
    /* synthetic */ default void stickyHeader(Object obj, Object obj2, final q qVar) {
        stickyHeader(obj, obj2, (r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, g2>) ComposableLambdaKt.composableLambdaInstance(-447767093, true, new r<LazyItemScope, Integer, Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.LazyListScope$stickyHeader$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, int i11, Composer composer, int i12) {
                if ((i12 & 6) == 0) {
                    i12 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i12 & 131) != 130, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-447767093, i12, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:122)");
                }
                qVar.invoke(lazyItemScope, composer, Integer.valueOf(i12 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, q qVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i11 & 1) != 0) {
            obj = null;
        }
        lazyListScope.item(obj, qVar);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, r rVar, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, (r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, g2>) rVar);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void item(Object obj, q qVar) {
        item(obj, null, qVar);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void items(int i11, x00.l lVar, r rVar) {
        items(i11, lVar, new x00.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$2
            public final Object invoke(int i12) {
                return null;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, rVar);
    }

    default void stickyHeader(@l Object obj, @l Object obj2, @k final r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar) {
        item(obj, obj2, ComposableLambdaKt.composableLambdaInstance(628101784, true, new q<LazyItemScope, Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.LazyListScope$stickyHeader$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(628101784, i11, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
                }
                rVar.invoke(lazyItemScope, 0, composer, Integer.valueOf((i11 & 14) | 48));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i11, x00.l lVar, r rVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i12 & 2) != 0) {
            lVar = null;
        }
        lazyListScope.items(i11, lVar, rVar);
    }
}
