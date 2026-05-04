package com.badlogic.gdx.math;

import java.io.Serializable;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class GridPoint3 implements Serializable {
    private static final long serialVersionUID = 5922187982746752830L;

    /* renamed from: x, reason: collision with root package name */
    public int f12525x;

    /* renamed from: y, reason: collision with root package name */
    public int f12526y;

    /* renamed from: z, reason: collision with root package name */
    public int f12527z;

    public GridPoint3() {
    }

    public GridPoint3 add(GridPoint3 gridPoint3) {
        this.f12525x += gridPoint3.f12525x;
        this.f12526y += gridPoint3.f12526y;
        this.f12527z += gridPoint3.f12527z;
        return this;
    }

    public GridPoint3 cpy() {
        return new GridPoint3(this);
    }

    public float dst(GridPoint3 gridPoint3) {
        int i11 = gridPoint3.f12525x - this.f12525x;
        int i12 = gridPoint3.f12526y - this.f12526y;
        int i13 = gridPoint3.f12527z - this.f12527z;
        return (float) Math.sqrt((i11 * i11) + (i12 * i12) + (i13 * i13));
    }

    public float dst2(GridPoint3 gridPoint3) {
        int i11 = gridPoint3.f12525x - this.f12525x;
        int i12 = gridPoint3.f12526y - this.f12526y;
        int i13 = gridPoint3.f12527z - this.f12527z;
        return (i11 * i11) + (i12 * i12) + (i13 * i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            GridPoint3 gridPoint3 = (GridPoint3) obj;
            if (this.f12525x == gridPoint3.f12525x && this.f12526y == gridPoint3.f12526y && this.f12527z == gridPoint3.f12527z) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f12525x + 17) * 17) + this.f12526y) * 17) + this.f12527z;
    }

    public GridPoint3 set(GridPoint3 gridPoint3) {
        this.f12525x = gridPoint3.f12525x;
        this.f12526y = gridPoint3.f12526y;
        this.f12527z = gridPoint3.f12527z;
        return this;
    }

    public GridPoint3 sub(GridPoint3 gridPoint3) {
        this.f12525x -= gridPoint3.f12525x;
        this.f12526y -= gridPoint3.f12526y;
        this.f12527z -= gridPoint3.f12527z;
        return this;
    }

    public String toString() {
        return pn.j.f81006c + this.f12525x + j2.O + this.f12526y + j2.O + this.f12527z + pn.j.f81007d;
    }

    public GridPoint3(int i11, int i12, int i13) {
        this.f12525x = i11;
        this.f12526y = i12;
        this.f12527z = i13;
    }

    public GridPoint3 add(int i11, int i12, int i13) {
        this.f12525x += i11;
        this.f12526y += i12;
        this.f12527z += i13;
        return this;
    }

    public float dst2(int i11, int i12, int i13) {
        int i14 = i11 - this.f12525x;
        int i15 = i12 - this.f12526y;
        int i16 = i13 - this.f12527z;
        return (i14 * i14) + (i15 * i15) + (i16 * i16);
    }

    public GridPoint3 set(int i11, int i12, int i13) {
        this.f12525x = i11;
        this.f12526y = i12;
        this.f12527z = i13;
        return this;
    }

    public GridPoint3 sub(int i11, int i12, int i13) {
        this.f12525x -= i11;
        this.f12526y -= i12;
        this.f12527z -= i13;
        return this;
    }

    public float dst(int i11, int i12, int i13) {
        int i14 = i11 - this.f12525x;
        int i15 = i12 - this.f12526y;
        int i16 = i13 - this.f12527z;
        return (float) Math.sqrt((i14 * i14) + (i15 * i15) + (i16 * i16));
    }

    public GridPoint3(GridPoint3 gridPoint3) {
        this.f12525x = gridPoint3.f12525x;
        this.f12526y = gridPoint3.f12526y;
        this.f12527z = gridPoint3.f12527z;
    }
}
