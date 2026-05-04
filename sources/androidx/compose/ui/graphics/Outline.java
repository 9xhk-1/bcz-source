package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class Outline {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Generic extends Outline {

        @m80.k
        private final Path path;

        public Generic(@m80.k Path path) {
            super(null);
            this.path = path;
        }

        @Override // androidx.compose.ui.graphics.Outline
        @m80.k
        public Rect getBounds() {
            return this.path.getBounds();
        }

        @m80.k
        public final Path getPath() {
            return this.path;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class Rectangle extends Outline {

        @m80.k
        private final Rect rect;

        public Rectangle(@m80.k Rect rect) {
            super(null);
            this.rect = rect;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rectangle) && kotlin.jvm.internal.g0.g(this.rect, ((Rectangle) obj).rect);
        }

        @Override // androidx.compose.ui.graphics.Outline
        @m80.k
        public Rect getBounds() {
            return this.rect;
        }

        @m80.k
        public final Rect getRect() {
            return this.rect;
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1#2:292\n*E\n"})
    @Immutable
    public static final class Rounded extends Outline {

        @m80.k
        private final RoundRect roundRect;

        @m80.l
        private final Path roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Rounded(@m80.k RoundRect roundRect) {
            super(0 == true ? 1 : 0);
            Path path = null;
            this.roundRect = roundRect;
            if (!RoundRectKt.isSimple(roundRect)) {
                Path Path = AndroidPath_androidKt.Path();
                Path.addRoundRect$default(Path, roundRect, null, 2, null);
                path = Path;
            }
            this.roundRectPath = path;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rounded) && kotlin.jvm.internal.g0.g(this.roundRect, ((Rounded) obj).roundRect);
        }

        @Override // androidx.compose.ui.graphics.Outline
        @m80.k
        public Rect getBounds() {
            return RoundRectKt.getBoundingRect(this.roundRect);
        }

        @m80.k
        public final RoundRect getRoundRect() {
            return this.roundRect;
        }

        @m80.l
        public final Path getRoundRectPath$ui_graphics_release() {
            return this.roundRectPath;
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    public /* synthetic */ Outline(kotlin.jvm.internal.v vVar) {
        this();
    }

    @m80.k
    public abstract Rect getBounds();

    private Outline() {
    }
}
