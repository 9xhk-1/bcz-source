package androidx.compose.runtime.saveable;

import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SaverKt {

    @k
    private static final Saver<Object, Object> AutoSaver = Saver(new p<SaverScope, Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, Object obj) {
            return obj;
        }
    }, new l<Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$2
        @Override // x00.l
        public final Object invoke(Object obj) {
            return obj;
        }
    });

    @k
    public static final <Original, Saveable> Saver<Original, Saveable> Saver(@k final p<? super SaverScope, ? super Original, ? extends Saveable> pVar, @k final l<? super Saveable, ? extends Original> lVar) {
        return new Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt$Saver$1
            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable saveable) {
                return lVar.invoke(saveable);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return pVar.invoke(saverScope, original);
            }
        };
    }

    @k
    public static final <T> Saver<T, Object> autoSaver() {
        Saver<T, Object> saver = (Saver<T, Object>) AutoSaver;
        g0.n(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }
}
