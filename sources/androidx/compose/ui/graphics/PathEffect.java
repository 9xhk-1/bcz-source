package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PathEffect {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PathEffect dashPathEffect$default(Companion companion, float[] fArr, float f11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f11 = 0.0f;
            }
            return companion.dashPathEffect(fArr, f11);
        }

        @m80.k
        public final PathEffect chainPathEffect(@m80.k PathEffect pathEffect, @m80.k PathEffect pathEffect2) {
            return AndroidPathEffect_androidKt.actualChainPathEffect(pathEffect, pathEffect2);
        }

        @m80.k
        public final PathEffect cornerPathEffect(float f11) {
            return AndroidPathEffect_androidKt.actualCornerPathEffect(f11);
        }

        @m80.k
        public final PathEffect dashPathEffect(@m80.k float[] fArr, float f11) {
            return AndroidPathEffect_androidKt.actualDashPathEffect(fArr, f11);
        }

        @m80.k
        /* renamed from: stampedPathEffect-7aD1DOk, reason: not valid java name */
        public final PathEffect m2783stampedPathEffect7aD1DOk(@m80.k Path path, float f11, float f12, int i11) {
            return AndroidPathEffect_androidKt.m2405actualStampedPathEffect7aD1DOk(path, f11, f12, i11);
        }
    }
}
