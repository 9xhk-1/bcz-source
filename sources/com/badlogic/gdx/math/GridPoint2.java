package com.badlogic.gdx.math;

import java.io.Serializable;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class GridPoint2 implements Serializable {
    private static final long serialVersionUID = -4019969926331717380L;

    /* renamed from: x, reason: collision with root package name */
    public int f12523x;

    /* renamed from: y, reason: collision with root package name */
    public int f12524y;

    public GridPoint2() {
    }

    public GridPoint2 add(GridPoint2 gridPoint2) {
        this.f12523x += gridPoint2.f12523x;
        this.f12524y += gridPoint2.f12524y;
        return this;
    }

    public GridPoint2 cpy() {
        return new GridPoint2(this);
    }

    public float dst(GridPoint2 gridPoint2) {
        int i11 = gridPoint2.f12523x - this.f12523x;
        int i12 = gridPoint2.f12524y - this.f12524y;
        return (float) Math.sqrt((i11 * i11) + (i12 * i12));
    }

    public float dst2(GridPoint2 gridPoint2) {
        int i11 = gridPoint2.f12523x - this.f12523x;
        int i12 = gridPoint2.f12524y - this.f12524y;
        return (i11 * i11) + (i12 * i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            GridPoint2 gridPoint2 = (GridPoint2) obj;
            if (this.f12523x == gridPoint2.f12523x && this.f12524y == gridPoint2.f12524y) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12523x + 53) * 53) + this.f12524y;
    }

    public GridPoint2 set(GridPoint2 gridPoint2) {
        this.f12523x = gridPoint2.f12523x;
        this.f12524y = gridPoint2.f12524y;
        return this;
    }

    public GridPoint2 sub(GridPoint2 gridPoint2) {
        this.f12523x -= gridPoint2.f12523x;
        this.f12524y -= gridPoint2.f12524y;
        return this;
    }

    public String toString() {
        return pn.j.f81006c + this.f12523x + j2.O + this.f12524y + pn.j.f81007d;
    }

    public GridPoint2(int i11, int i12) {
        this.f12523x = i11;
        this.f12524y = i12;
    }

    public GridPoint2 add(int i11, int i12) {
        this.f12523x += i11;
        this.f12524y += i12;
        return this;
    }

    public float dst2(int i11, int i12) {
        int i13 = i11 - this.f12523x;
        int i14 = i12 - this.f12524y;
        return (i13 * i13) + (i14 * i14);
    }

    public GridPoint2 set(int i11, int i12) {
        this.f12523x = i11;
        this.f12524y = i12;
        return this;
    }

    public GridPoint2 sub(int i11, int i12) {
        this.f12523x -= i11;
        this.f12524y -= i12;
        return this;
    }

    public float dst(int i11, int i12) {
        int i13 = i11 - this.f12523x;
        int i14 = i12 - this.f12524y;
        return (float) Math.sqrt((i13 * i13) + (i14 * i14));
    }

    public GridPoint2(GridPoint2 gridPoint2) {
        this.f12523x = gridPoint2.f12523x;
        this.f12524y = gridPoint2.f12524y;
    }
}
