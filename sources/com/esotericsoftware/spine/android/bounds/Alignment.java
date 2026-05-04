package com.esotericsoftware.spine.android.bounds;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public enum Alignment {
    TOP_LEFT(-1.0f, -1.0f),
    TOP_CENTER(0.0f, -1.0f),
    TOP_RIGHT(1.0f, -1.0f),
    CENTER_LEFT(-1.0f, 0.0f),
    CENTER(0.0f, 0.0f),
    CENTER_RIGHT(1.0f, 0.0f),
    BOTTOM_LEFT(-1.0f, 1.0f),
    BOTTOM_CENTER(0.0f, 1.0f),
    BOTTOM_RIGHT(1.0f, 1.0f);


    /* renamed from: x, reason: collision with root package name */
    private final float f29306x;

    /* renamed from: y, reason: collision with root package name */
    private final float f29307y;

    Alignment(float f11, float f12) {
        this.f29306x = f11;
        this.f29307y = f12;
    }

    public float getX() {
        return this.f29306x;
    }

    public float getY() {
        return this.f29307y;
    }
}
