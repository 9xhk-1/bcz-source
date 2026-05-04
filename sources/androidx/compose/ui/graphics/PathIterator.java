package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PathIterator extends Iterator<PathSegment>, y00.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ConicEvaluation {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ ConicEvaluation[] $VALUES;
        public static final ConicEvaluation AsConic = new ConicEvaluation("AsConic", 0);
        public static final ConicEvaluation AsQuadratics = new ConicEvaluation("AsQuadratics", 1);

        private static final /* synthetic */ ConicEvaluation[] $values() {
            return new ConicEvaluation[]{AsConic, AsQuadratics};
        }

        static {
            ConicEvaluation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private ConicEvaluation(String str, int i11) {
        }

        @m80.k
        public static m00.a<ConicEvaluation> getEntries() {
            return $ENTRIES;
        }

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) $VALUES.clone();
        }
    }

    static /* synthetic */ int calculateSize$default(PathIterator pathIterator, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSize");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return pathIterator.calculateSize(z11);
    }

    static /* synthetic */ PathSegment.Type next$default(PathIterator pathIterator, float[] fArr, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return pathIterator.next(fArr, i11);
    }

    int calculateSize(boolean z11);

    @m80.k
    ConicEvaluation getConicEvaluation();

    @m80.k
    Path getPath();

    float getTolerance();

    @Override // java.util.Iterator
    boolean hasNext();

    @m80.k
    PathSegment.Type next(@m80.k float[] fArr, int i11);

    @Override // java.util.Iterator
    @m80.k
    PathSegment next();
}
