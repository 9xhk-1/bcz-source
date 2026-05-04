package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface MotionDurationScale extends d.b {

    @k
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        public static <R> R fold(@k MotionDurationScale motionDurationScale, R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) d.b.a.a(motionDurationScale, r11, pVar);
        }

        @l
        public static <E extends d.b> E get(@k MotionDurationScale motionDurationScale, @k d.c<E> cVar) {
            return (E) d.b.a.b(motionDurationScale, cVar);
        }

        @k
        public static d minusKey(@k MotionDurationScale motionDurationScale, @k d.c<?> cVar) {
            return d.b.a.c(motionDurationScale, cVar);
        }

        @k
        public static d plus(@k MotionDurationScale motionDurationScale, @k d dVar) {
            return d.b.a.d(motionDurationScale, dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Key implements d.c<MotionDurationScale> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.d.b
    @k
    default d.c<?> getKey() {
        return Key;
    }

    float getScaleFactor();
}
