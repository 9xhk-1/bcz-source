package androidx.constraintlayout.core.widgets;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x, reason: collision with root package name */
    public int f4253x;

    /* renamed from: y, reason: collision with root package name */
    public int f4254y;

    public boolean contains(int i11, int i12) {
        int i13;
        int i14 = this.f4253x;
        return i11 >= i14 && i11 < i14 + this.width && i12 >= (i13 = this.f4254y) && i12 < i13 + this.height;
    }

    public int getCenterX() {
        return (this.f4253x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f4254y + this.height) / 2;
    }

    public void grow(int i11, int i12) {
        this.f4253x -= i11;
        this.f4254y -= i12;
        this.width += i11 * 2;
        this.height += i12 * 2;
    }

    public boolean intersects(Rectangle rectangle) {
        int i11;
        int i12;
        int i13 = this.f4253x;
        int i14 = rectangle.f4253x;
        return i13 >= i14 && i13 < i14 + rectangle.width && (i11 = this.f4254y) >= (i12 = rectangle.f4254y) && i11 < i12 + rectangle.height;
    }

    public void setBounds(int i11, int i12, int i13, int i14) {
        this.f4253x = i11;
        this.f4254y = i12;
        this.width = i13;
        this.height = i14;
    }
}
