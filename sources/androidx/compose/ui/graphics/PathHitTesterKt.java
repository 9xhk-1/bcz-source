package androidx.compose.ui.graphics;

import androidx.annotation.FloatRange;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPathHitTester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTesterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
/* loaded from: classes.dex */
public final class PathHitTesterKt {

    @m80.k
    private static final Path EmptyPath = AndroidPath_androidKt.Path();

    @m80.k
    public static final PathHitTester PathHitTester(@m80.k Path path, @FloatRange(from = 0.0d) float f11) {
        PathHitTester pathHitTester = new PathHitTester();
        pathHitTester.updatePath(path, f11);
        return pathHitTester;
    }

    public static /* synthetic */ PathHitTester PathHitTester$default(Path path, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 0.5f;
        }
        return PathHitTester(path, f11);
    }
}
