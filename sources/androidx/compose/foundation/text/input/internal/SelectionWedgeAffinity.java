package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SelectionWedgeAffinity {
    public static final int $stable = 0;

    @m80.k
    private final WedgeAffinity endAffinity;

    @m80.k
    private final WedgeAffinity startAffinity;

    public SelectionWedgeAffinity(@m80.k WedgeAffinity wedgeAffinity, @m80.k WedgeAffinity wedgeAffinity2) {
        this.startAffinity = wedgeAffinity;
        this.endAffinity = wedgeAffinity2;
    }

    public static /* synthetic */ SelectionWedgeAffinity copy$default(SelectionWedgeAffinity selectionWedgeAffinity, WedgeAffinity wedgeAffinity, WedgeAffinity wedgeAffinity2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wedgeAffinity = selectionWedgeAffinity.startAffinity;
        }
        if ((i11 & 2) != 0) {
            wedgeAffinity2 = selectionWedgeAffinity.endAffinity;
        }
        return selectionWedgeAffinity.copy(wedgeAffinity, wedgeAffinity2);
    }

    @m80.k
    public final WedgeAffinity component1() {
        return this.startAffinity;
    }

    @m80.k
    public final WedgeAffinity component2() {
        return this.endAffinity;
    }

    @m80.k
    public final SelectionWedgeAffinity copy(@m80.k WedgeAffinity wedgeAffinity, @m80.k WedgeAffinity wedgeAffinity2) {
        return new SelectionWedgeAffinity(wedgeAffinity, wedgeAffinity2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionWedgeAffinity)) {
            return false;
        }
        SelectionWedgeAffinity selectionWedgeAffinity = (SelectionWedgeAffinity) obj;
        return this.startAffinity == selectionWedgeAffinity.startAffinity && this.endAffinity == selectionWedgeAffinity.endAffinity;
    }

    @m80.k
    public final WedgeAffinity getEndAffinity() {
        return this.endAffinity;
    }

    @m80.k
    public final WedgeAffinity getStartAffinity() {
        return this.startAffinity;
    }

    public int hashCode() {
        return (this.startAffinity.hashCode() * 31) + this.endAffinity.hashCode();
    }

    @m80.k
    public String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.startAffinity + ", endAffinity=" + this.endAffinity + ')';
    }

    public SelectionWedgeAffinity(@m80.k WedgeAffinity wedgeAffinity) {
        this(wedgeAffinity, wedgeAffinity);
    }
}
