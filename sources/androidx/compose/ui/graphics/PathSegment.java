package androidx.compose.ui.graphics;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PathSegment {

    @m80.k
    private final float[] points;

    @m80.k
    private final Type type;
    private final float weight;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Type {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Move = new Type("Move", 0);
        public static final Type Line = new Type("Line", 1);
        public static final Type Quadratic = new Type("Quadratic", 2);
        public static final Type Conic = new Type("Conic", 3);
        public static final Type Cubic = new Type("Cubic", 4);
        public static final Type Close = new Type(c80.f.f8327p, 5);
        public static final Type Done = new Type("Done", 6);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Move, Line, Quadratic, Conic, Cubic, Close, Done};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private Type(String str, int i11) {
        }

        @m80.k
        public static m00.a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public PathSegment(@m80.k Type type, @m80.k float[] fArr, float f11) {
        this.type = type;
        this.points = fArr;
        this.weight = f11;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PathSegment.class == obj.getClass()) {
            PathSegment pathSegment = (PathSegment) obj;
            if (this.type == pathSegment.type && Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public final float[] getPoints() {
        return this.points;
    }

    @m80.k
    public final Type getType() {
        return this.type;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Arrays.hashCode(this.points)) * 31) + Float.hashCode(this.weight);
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PathSegment(type=");
        sb2.append(this.type);
        sb2.append(", points=");
        String arrays = Arrays.toString(this.points);
        kotlin.jvm.internal.g0.o(arrays, "toString(...)");
        sb2.append(arrays);
        sb2.append(", weight=");
        sb2.append(this.weight);
        sb2.append(')');
        return sb2.toString();
    }
}
