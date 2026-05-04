package kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class Position implements Serializable {

    @k
    public static final a Companion = new a(null);

    @k
    private static final Position NO_POSITION = new Position(-1, -1);
    private final int column;
    private final int line;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final Position a() {
            return Position.NO_POSITION;
        }

        public a() {
        }
    }

    public Position(int i11, int i12) {
        this.line = i11;
        this.column = i12;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.line == position.line && this.column == position.column;
    }

    public int hashCode() {
        return (Integer.hashCode(this.line) * 31) + Integer.hashCode(this.column);
    }

    @k
    public String toString() {
        return "Position(line=" + this.line + ", column=" + this.column + ')';
    }
}
