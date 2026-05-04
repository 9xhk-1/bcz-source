package com.huawei.hms.common.size;

import com.huawei.hms.common.internal.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class Size {

    /* renamed from: a, reason: collision with root package name */
    private final int f35597a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35598b;

    public Size(int i11, int i12) {
        this.f35597a = i11;
        this.f35598b = i12;
    }

    public static Size parseSize(String str) {
        try {
            int indexOf = str.indexOf("x");
            if (indexOf < 0) {
                indexOf = str.indexOf("*");
            }
            return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Size parses failed");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f35597a == size.f35597a && this.f35598b == size.f35598b) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.f35598b;
    }

    public final int getWidth() {
        return this.f35597a;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }

    public final String toString() {
        return "Width is " + this.f35597a + " Height is " + this.f35598b;
    }
}
