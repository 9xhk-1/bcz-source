package androidx.constraintlayout.compose;

import com.badlogic.gdx.scenes.scene2d.ui.q;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface Dimension {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Coercible extends Dimension {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/Dimension$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2303:1\n1#2:2304\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @k
        public final Coercible getFillToConstraints() {
            return new DimensionDescription("spread");
        }

        @k
        public final Dimension getMatchParent() {
            return new DimensionDescription(q.a.f13044u);
        }

        @k
        public final Coercible getPreferredWrapContent() {
            return new DimensionDescription("preferWrap");
        }

        @k
        public final Dimension getWrapContent() {
            return new DimensionDescription("wrap");
        }

        @k
        public final Dimension percent(float f11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f11 * 100.0f);
            sb2.append('%');
            return new DimensionDescription(sb2.toString());
        }

        @k
        /* renamed from: preferredValue-0680j_4, reason: not valid java name */
        public final MinCoercible m5472preferredValue0680j_4(float f11) {
            DimensionDescription dimensionDescription = new DimensionDescription("spread");
            dimensionDescription.getMax$constraintlayout_compose_release().m5474update0680j_4(f11);
            return dimensionDescription;
        }

        @k
        public final Dimension ratio(@k String str) {
            return new DimensionDescription(str);
        }

        @k
        /* renamed from: value-0680j_4, reason: not valid java name */
        public final Dimension m5473value0680j_4(float f11) {
            return new DimensionDescription(f11, (v) null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface MaxCoercible extends Dimension {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface MinCoercible extends Dimension {
    }
}
